package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ xge a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(xge xgeVar, int i) {
        this.b = i;
        this.a = xgeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.f();
        } else if (i == 1) {
            this.a.d();
        } else {
            this.a.k();
        }
    }
}
