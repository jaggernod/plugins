package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Map;

import io.flutter.plugin.platform.PlatformView;

class NativeView implements PlatformView {


    final FrameLayout layout;

    @Override
    public View getView() {
        return layout;
    }

    @Override
    public void dispose() {
    }


    NativeView(Context context, int id, Map<String, Object> creationParams, FrameLayout layout) {
        this.layout = layout;
    }
}

