package defpackage;
/* compiled from: PG */
/* renamed from: plz  reason: default package */
/* loaded from: classes7.dex */
public class plz implements pln {
    private final String a;
    private final String b;
    private final iib c;

    public plz(pml pmlVar, String str, dqst dqstVar) {
        this.a = dqstVar.a;
        this.b = str;
        dccx F = dcdc.F();
        for (dqsz dqszVar : dqstVar.b) {
            F.g(cqgr.fT(new pjx(), new plx(str, pmlVar.a(str, dqszVar))));
        }
        iic j = iid.j();
        j.e(F.f());
        this.c = j.f();
    }

    @Override // defpackage.pln
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.pln
    public iib b() {
        return this.c;
    }

    @Override // defpackage.pln
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxl.ih;
        b.g(this.b);
        return b.a();
    }
}
