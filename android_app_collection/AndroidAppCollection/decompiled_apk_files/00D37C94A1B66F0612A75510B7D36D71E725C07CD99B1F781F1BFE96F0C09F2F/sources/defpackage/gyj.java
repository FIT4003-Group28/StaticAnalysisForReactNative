package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
/* compiled from: PG */
/* renamed from: gyj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gyj implements Runnable {
    public final /* synthetic */ ShortsZoomSlider a;
    private final /* synthetic */ int b;

    public /* synthetic */ gyj(ShortsZoomSlider shortsZoomSlider, int i) {
        this.b = i;
        this.a = shortsZoomSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.a(0.0f);
            return;
        }
        ShortsZoomSlider shortsZoomSlider = this.a;
        if (shortsZoomSlider.c == 0.0f) {
            shortsZoomSlider.setVisibility(4);
            gyq gyqVar = shortsZoomSlider.f;
            if (gyqVar != null) {
                gyqVar.a(actj.SHORTS_CREATION_ZOOM_ACCESSIBILITY_SLIDER).d();
            }
        }
        shortsZoomSlider.c = -1.0f;
    }
}
