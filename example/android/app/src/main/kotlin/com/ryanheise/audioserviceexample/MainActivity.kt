package com.ryanheise.audioserviceexample

import android.content.Context
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint
import io.flutter.embedding.engine.FlutterEngine

class MainActivity: FlutterActivity() {
    override fun provideFlutterEngine(context: Context): FlutterEngine {
        // Instantiate a FlutterEngine.
        val flutterEngine = FlutterEngine(context)

        // Start executing Dart code to pre-warm the FlutterEngine.
        flutterEngine.dartExecutor.executeDartEntrypoint(DartEntrypoint.createDefault())

        return flutterEngine
    }
}
