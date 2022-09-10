package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aerx  reason: default package */
/* loaded from: classes2.dex */
public final class aerx extends bxel implements bxeq {
    public dxio<brba> a;
    public dxio<aesb> b;

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.bxel
    @dzsi
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        if (this.aD) {
            if (this.bb.j) {
                iqy iqyVar = new iqy();
                iqyVar.b();
                iqyVar.f = true;
                this.a.a().k(bxmhVar, dnqhVar, bxkvVar, iqyVar);
                return;
            }
            iqy iqyVar2 = new iqy();
            iqyVar2.e();
            this.a.a().l(bxmhVar, dnqhVar, bxkvVar, iqyVar2, new aerw(this));
        }
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }
}
