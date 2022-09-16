package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ b a;
    private final /* synthetic */ int b;

    public /* synthetic */ h(b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            b bVar = this.a;
            bVar.d = true;
            bVar.Y(1);
            bVar.Z();
            return;
        }
        b bVar2 = this.a;
        bVar2.d = false;
        bVar2.W();
    }
}
