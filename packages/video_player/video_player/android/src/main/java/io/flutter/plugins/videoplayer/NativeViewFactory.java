package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Map;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

class NativeViewFactory extends PlatformViewFactory {

    final FrameLayout layout;

    @Override
    public PlatformView create(Context context, int id, Object args) {
        Map<String, Object> creationParams = (Map<String, Object>)args;
        return new NativeView(context, id, creationParams, layout);
    }


    NativeViewFactory(FrameLayout layout) {
        super(StandardMessageCodec.INSTANCE);
        this.layout = layout;
    }
}

