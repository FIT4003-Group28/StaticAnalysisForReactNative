package defpackage;
/* compiled from: PG */
/* renamed from: bxpm  reason: default package */
/* loaded from: classes4.dex */
public class bxpm implements bxnz {
    public final cqkp a;
    @dzsi
    public final bxeq b;
    public final ges c;
    public dcdc<bxpk> d = dcdc.e();
    @dzsi
    private final akqq e;
    private final anhp f;

    public bxpm(cqkp cqkpVar, @dzsi akqq akqqVar, @dzsi bxeq bxeqVar, cqhn cqhnVar, anhp anhpVar, fd fdVar) {
        this.a = cqkpVar;
        this.e = akqqVar;
        this.f = anhpVar;
        this.b = bxeqVar;
        this.c = (ges) fdVar;
        if (akqqVar == null) {
            return;
        }
        dwjc bZ = dwjd.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd dwjdVar = (dwjd) bZ.b;
        int i = dwjdVar.a | 2;
        dwjdVar.a = i;
        dwjdVar.b = 10;
        dwjdVar.a = i | 4;
        dwjdVar.c = 1;
        dwjd.c(dwjdVar);
        anhpVar.a(bZ.bK(), akqqVar, 5, new bxpl(this));
    }

    @Override // defpackage.bxnz
    public dcdc<bxoi> a() {
        return dcdc.r(this.d);
    }
}
