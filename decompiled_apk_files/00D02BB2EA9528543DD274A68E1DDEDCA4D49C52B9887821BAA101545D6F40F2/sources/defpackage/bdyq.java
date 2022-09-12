package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bdyq  reason: default package */
/* loaded from: classes3.dex */
final class bdyq implements bzmn {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ bdyr c;

    public bdyq(bdyr bdyrVar, List list, List list2) {
        this.c = bdyrVar;
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.bzmn
    public final void PJ() {
        this.c.g();
    }

    @Override // defpackage.bzmn
    public final void PK() {
    }

    @Override // defpackage.bzmn
    public final void PL() {
    }

    @Override // defpackage.bzmn
    public final void PM() {
    }

    @Override // defpackage.bzmn
    public final void PN(int i) {
    }

    @Override // defpackage.bzmn
    public final void PO() {
        if (!this.c.j() || !this.c.k()) {
            this.c.g();
            bdyr bdyrVar = this.c;
            bdyrVar.b.d(bdyrVar.h(), this.c.i(), this.a, this.b, this);
            return;
        }
        this.c.g();
    }
}
