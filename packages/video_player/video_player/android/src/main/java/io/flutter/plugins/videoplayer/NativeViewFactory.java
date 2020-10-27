package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.view.ViewGroup;

import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

class NativeViewFactory extends PlatformViewFactory {

    final ViewGroup viewGroup;

    NativeViewFactory(ViewGroup viewGroup) {
        super(StandardMessageCodec.INSTANCE);
        this.viewGroup = viewGroup;
    }

    @Override
    public PlatformView create(Context context, int id, Object args) {
        return new NativeView(viewGroup);
    }
}

