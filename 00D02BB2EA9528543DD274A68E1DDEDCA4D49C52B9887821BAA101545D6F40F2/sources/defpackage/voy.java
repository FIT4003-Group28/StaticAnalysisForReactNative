package defpackage;
/* compiled from: PG */
/* renamed from: voy  reason: default package */
/* loaded from: classes7.dex */
public final class voy implements qcy<qcz> {
    private final bvjj a;
    private final psw b;

    public voy(bvjj bvjjVar, psw pswVar) {
        this.a = bvjjVar;
        this.b = pswVar;
    }

    private final void c(qbs qbsVar) {
        if (qbsVar != qbs.DEFAULT || this.a.m(bvjk.hX, false)) {
            return;
        }
        psw pswVar = this.b;
        if (!pswVar.h.b() || pswVar.j.e(pswVar.i)) {
            return;
        }
        pswVar.k.b(dqkc.TWO_WHEELER_TAB_POPUP_AND_SWITCH);
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ qcz a(qct qctVar) {
        c(qctVar.m());
        return qctVar;
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ qcz b(qcx qcxVar) {
        if (!qcxVar.q()) {
            c(qcxVar.m());
        }
        return qcxVar;
    }
}
