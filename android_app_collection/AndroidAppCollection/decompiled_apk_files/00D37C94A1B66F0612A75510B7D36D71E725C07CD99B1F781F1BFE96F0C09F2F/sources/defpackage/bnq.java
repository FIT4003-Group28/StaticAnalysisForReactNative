package defpackage;
/* compiled from: PG */
/* renamed from: bnq  reason: default package */
/* loaded from: classes2.dex */
final class bnq extends bnl {
    final bnr a;

    public bnq(bnr bnrVar) {
        this.a = bnrVar;
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void a(bnk bnkVar) {
        bnr bnrVar = this.a;
        int i = bnrVar.p - 1;
        bnrVar.p = i;
        if (i == 0) {
            bnrVar.q = false;
            bnrVar.p();
        }
        bnkVar.B(this);
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void e() {
        bnr bnrVar = this.a;
        if (!bnrVar.q) {
            bnrVar.u();
            this.a.q = true;
        }
    }
}
