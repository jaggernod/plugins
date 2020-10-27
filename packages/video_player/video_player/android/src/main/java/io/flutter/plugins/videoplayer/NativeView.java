package io.flutter.plugins.videoplayer;

import android.view.View;
import android.view.ViewGroup;

import io.flutter.plugin.platform.PlatformView;

class NativeView implements PlatformView {

    ViewGroup container;

    @Override
    public View getView() {
        return container;
    }

    @Override
    public void dispose() {
        container = null;
    }

    NativeView(ViewGroup container) {
        this.container = container;
    }
}

