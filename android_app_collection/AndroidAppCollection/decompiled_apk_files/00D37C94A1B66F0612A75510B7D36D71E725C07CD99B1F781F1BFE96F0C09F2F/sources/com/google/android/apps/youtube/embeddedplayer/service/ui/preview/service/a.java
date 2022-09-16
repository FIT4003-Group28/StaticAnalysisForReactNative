package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.net.Uri;
/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class a {
    protected afzc a;
    final /* synthetic */ e b;
    private yiy c;

    public a(e eVar) {
        this.b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        yiy yiyVar = this.c;
        if (yiyVar != null) {
            yiyVar.d();
            this.c = null;
        }
        afzc afzcVar = this.a;
        if (afzcVar != null) {
            afzcVar.d();
            this.a = null;
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(avhn avhnVar, String str) {
        Uri q = akel.q(avhnVar);
        if (q == null) {
            this.b.c();
            return;
        }
        this.c = yiy.c(new c(this.b, str));
        e eVar = this.b;
        eVar.c.l(q, yje.c(eVar.a, this.c));
    }

    public abstract boolean j();

    public abstract boolean k();
}
