package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class a implements afzf {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        b bVar = this.a;
        this.a.c.w(b.a(bVar.b(bVar.b.d)));
        this.a.g = false;
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        avbh avbhVar;
        aryf aryfVar = (aryf) obj;
        b bVar = this.a;
        arxz arxzVar = aryfVar.f;
        if (arxzVar == null) {
            arxzVar = arxz.a;
        }
        if (arxzVar.b == 136076983) {
            avbhVar = (avbh) arxzVar.c;
        } else {
            avbhVar = avbh.a;
        }
        bVar.d(avbhVar);
        if (!aryfVar.d.isEmpty()) {
            this.a.a.b(aryfVar.d);
        }
        this.a.g = false;
    }
}
