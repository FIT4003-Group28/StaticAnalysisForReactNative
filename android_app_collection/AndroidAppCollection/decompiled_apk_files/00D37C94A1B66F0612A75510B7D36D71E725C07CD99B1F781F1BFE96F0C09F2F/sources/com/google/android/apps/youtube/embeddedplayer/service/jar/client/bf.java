package com.google.android.apps.youtube.embeddedplayer.service.jar.client;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ bg a;
    private final /* synthetic */ int b;

    public /* synthetic */ bf(bg bgVar) {
        this.a = bgVar;
    }

    public /* synthetic */ bf(bg bgVar, int i) {
        this.b = i;
        this.a = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            bg bgVar = this.a;
            bgVar.a.C.g();
            bgVar.a.B.g();
            return;
        }
        this.a.a.C.e();
    }
}
