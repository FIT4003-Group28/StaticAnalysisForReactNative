package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ xig a;
    private final /* synthetic */ int b;

    public /* synthetic */ c(xig xigVar, int i) {
        this.b = i;
        this.a = xigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.d();
        } else {
            this.a.b();
        }
    }
}
