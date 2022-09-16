package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class a implements afzf {
    final /* synthetic */ b a;
    private final /* synthetic */ int b;

    public a(b bVar) {
        this.a = bVar;
    }

    public a(b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        avbh avbhVar;
        if (this.b == 0) {
            b bVar = this.a;
            bVar.c(bVar.a());
            b bVar2 = this.a;
            avao avaoVar = bVar2.b.p;
            if (avaoVar == null) {
                avaoVar = avao.a;
            }
            if (avaoVar.b == 136076983) {
                avbhVar = (avbh) avaoVar.c;
            } else {
                avbhVar = avbh.a;
            }
            bVar2.d(avbhVar);
            this.a.l = false;
            afus.c(1, 4, "Unsubscribe error.", cffVar);
            return;
        }
        b bVar3 = this.a;
        bVar3.c(bVar3.a());
        this.a.l = false;
        afus.c(1, 4, "Subscribe error.", cffVar);
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        avbh avbhVar;
        if (this.b == 0) {
            asdi asdiVar = (asdi) obj;
            b bVar = this.a;
            bVar.c = 2;
            bVar.l = false;
            if (asdiVar.e.size() == 0) {
                return;
            }
            this.a.a.b(asdiVar.e);
            return;
        }
        asdg asdgVar = (asdg) obj;
        b bVar2 = this.a;
        bVar2.c = 3;
        bVar2.l = false;
        b bVar3 = this.a;
        arxz arxzVar = asdgVar.g;
        if (arxzVar == null) {
            arxzVar = arxz.a;
        }
        if (arxzVar.b == 136076983) {
            avbhVar = (avbh) arxzVar.c;
        } else {
            avbhVar = avbh.a;
        }
        bVar3.d(avbhVar);
        if (asdgVar.e.size() == 0) {
            return;
        }
        this.a.a.b(asdgVar.e);
    }
}
