import androidx.compose.ui.window.ComposeUIViewController
import jp.kaleidot725.metro.demo.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
