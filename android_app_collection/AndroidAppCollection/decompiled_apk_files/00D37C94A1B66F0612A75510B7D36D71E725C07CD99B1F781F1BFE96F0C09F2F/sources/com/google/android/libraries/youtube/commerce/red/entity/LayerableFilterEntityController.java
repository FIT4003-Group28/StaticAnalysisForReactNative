package com.google.android.libraries.youtube.commerce.red.entity;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LayerableFilterEntityController implements f {
    public ampq a = amon.a;
    public ampq b = amon.a;
    private final tdb c;

    public LayerableFilterEntityController(tdb tdbVar) {
        this.c = tdbVar;
    }

    public final void g() {
        if (!this.a.h() || !this.b.h() || !((String) this.b.c()).equals("FEwhat_to_watch")) {
            return;
        }
        this.c.d((String) this.a.c());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        g();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
