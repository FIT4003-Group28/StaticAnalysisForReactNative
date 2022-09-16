package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ e a;
    private final /* synthetic */ int b;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    public /* synthetic */ b(e eVar, int i) {
        this.b = i;
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.c();
            return;
        }
        e eVar = this.a;
        aubk aubkVar = eVar.c;
        if (aubkVar == null || (aubkVar.c & 4) == 0) {
            return;
        }
        eVar.j.j(aubkVar.g.I());
    }
}
