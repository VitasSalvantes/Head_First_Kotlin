package attachment_a.drummachine.audio.audio

import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0
    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(
            file
        )
    )
    clip.open(audioInputStream)
    clip.start()
}

suspend fun main() {
    runBlocking {
        launch {
            playBeats(
                "x---x---x---x---x---x---",
                "src/main/kotlin/attachment_a/drummachine/audio/audio/toms.aiff"
            )
        }
        launch {
            playBeats(
                "--x-----x-----x-----x---",
                "src/main/kotlin/attachment_a/drummachine/audio/audio/snare.aiff"
            )
        }
        launch {
            playBeats(
                "-x-----x-----x-----x----",
                "src/main/kotlin/attachment_a/drummachine/audio/audio/kick_drum.aiff"
            )
        }
        launch {
            playBeats(
                "---x-----x-----x-----x--",
                "src/main/kotlin/attachment_a/drummachine/audio/audio/floor_toms.aiff"
            )
        }
        launch {
            playBeats(
                "------------------------x-x-x",
                "src/main/kotlin/attachment_a/drummachine/audio/audio/high_hat.aiff"
            )
        }
        playBeats(
            "x-----x-----x-----x-----",
            "src/main/kotlin/attachment_a/drummachine/audio/audio/crash_cymbal.aiff"
        )
    }
}