package defpackage;

import com.google.android.apps.youtube.app.extensions.clips.ClipController;
/* compiled from: PG */
/* renamed from: gpx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpx implements Runnable {
    public final /* synthetic */ ClipController a;
    private final /* synthetic */ int b;

    public /* synthetic */ gpx(ClipController clipController) {
        this.a = clipController;
    }

    public /* synthetic */ gpx(ClipController clipController, int i) {
        this.b = i;
        this.a = clipController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.k("engagement-panel-clip-view");
        } else if (i == 1) {
            ClipController clipController = this.a;
            ((aafo) clipController.b.get()).a(clipController.e);
        } else {
            this.a.k("engagement-panel-clip-view", "engagement-panel-clip-create");
        }
    }
}
