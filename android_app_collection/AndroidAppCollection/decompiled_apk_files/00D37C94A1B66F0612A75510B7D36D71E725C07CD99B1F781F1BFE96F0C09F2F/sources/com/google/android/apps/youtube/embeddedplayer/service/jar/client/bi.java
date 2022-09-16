package com.google.android.apps.youtube.embeddedplayer.service.jar.client;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bi implements Runnable {
    public final /* synthetic */ bm a;
    private final /* synthetic */ int b;

    public /* synthetic */ bi(bm bmVar, int i) {
        this.b = i;
        this.a = bmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                bm bmVar = this.a;
                bmVar.a.j = false;
                bmVar.b();
                return;
            }
            bm bmVar2 = this.a;
            bmVar2.a.j = false;
            bmVar2.b();
            return;
        }
        bm bmVar3 = this.a;
        if (bmVar3.a.g.c.getVisibility() == 0) {
            aqvb.l("Shutter view is visible while video is playing.", new Object[0]);
        }
        bmVar3.a.x.kT();
        bp bpVar = bmVar3.a;
        bpVar.j = true;
        if (!bpVar.f()) {
            return;
        }
        bmVar3.a.B.g();
    }
}
