package defpackage;
/* compiled from: PG */
/* renamed from: bnoz  reason: default package */
/* loaded from: classes3.dex */
final class bnoz implements jkh {
    final /* synthetic */ bnpb a;

    public bnoz(bnpb bnpbVar) {
        this.a = bnpbVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        bnpb bnpbVar = this.a;
        if (bnpbVar.aD) {
            egu c = bnpbVar.g.c();
            dbsk.s(c);
            boolean z = false;
            boolean z2 = c.P != null;
            if (jjnVar2 == jjn.HIDDEN) {
                z = true;
            }
            if (z2 != z) {
                this.a.q(jjnVar2);
            }
            if (jjnVar2 != jjn.FULLY_EXPANDED && jjnVar != jjn.FULLY_EXPANDED) {
                return;
            }
            cqkx.p(this.a.a);
        }
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }
}
