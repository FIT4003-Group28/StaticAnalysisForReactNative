package com.google.vr.sdk.base;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeadMountedDisplayManager {
    private final Context context;
    private final HeadMountedDisplay hmd = new HeadMountedDisplay(createScreenParams(), createGvrViewerParams());
    private final axfg paramsProvider;

    public HeadMountedDisplayManager(Context context) {
        this.context = context;
        this.paramsProvider = awwd.d(context);
    }

    private GvrViewerParams createGvrViewerParams() {
        return new GvrViewerParams(this.paramsProvider.b());
    }

    private ScreenParams createScreenParams() {
        Display display = getDisplay();
        ScreenParams fromProto = ScreenParams.fromProto(display, this.paramsProvider.d());
        return fromProto != null ? fromProto : new ScreenParams(display);
    }

    private Display getDisplay() {
        return ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
    }

    public void close() {
        this.paramsProvider.f();
    }

    public HeadMountedDisplay getHeadMountedDisplay() {
        return this.hmd;
    }

    public void onPause() {
    }

    public void onResume() {
        CardboardDevice$DeviceParams b = this.paramsProvider.b();
        ScreenParams screenParams = null;
        GvrViewerParams gvrViewerParams = b != null ? new GvrViewerParams(b) : null;
        if (gvrViewerParams != null && !gvrViewerParams.equals(this.hmd.getGvrViewerParams())) {
            this.hmd.setGvrViewerParams(gvrViewerParams);
        }
        Display$DisplayParams d = this.paramsProvider.d();
        if (d != null) {
            screenParams = ScreenParams.fromProto(getDisplay(), d);
        }
        if (screenParams == null || screenParams.equals(this.hmd.getScreenParams())) {
            return;
        }
        this.hmd.setScreenParams(screenParams);
    }
}
