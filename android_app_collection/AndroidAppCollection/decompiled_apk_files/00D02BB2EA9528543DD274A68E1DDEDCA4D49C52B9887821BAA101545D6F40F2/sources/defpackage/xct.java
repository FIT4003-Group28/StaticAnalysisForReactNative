package defpackage;
/* compiled from: PG */
/* renamed from: xct  reason: default package */
/* loaded from: classes7.dex */
public final class xct implements dbsl<dmpn> {
    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(dmpn dmpnVar) {
        dmpn dmpnVar2 = dmpnVar;
        dmol g = akxf.g(dmpnVar2);
        if ((g.equals(dmnl.L.b) || !g.k) && akur.a(akxf.F(dmpnVar2).b) != 17 && akur.a(akxf.F(dmpnVar2).b) != 20 && !akxf.E(dmpnVar2, akry.TRANSIT) && akxf.s(dmpnVar2).equals(dnbv.c) && akxf.w(dmpnVar2) == null && !akxf.m(dmpnVar2) && !akxf.n(dmpnVar2) && !akxf.D(dmpnVar2)) {
            float a = alww.a(alwl.a(dmpnVar2), dmpnVar2.i);
            if (a >= 15.0f && a <= 17.25f) {
                dmph dmphVar = dmpnVar2.b;
                if (dmphVar == null) {
                    dmphVar = dmph.f;
                }
                dsrj<dmpd> dsrjVar = dmphVar.b;
                dmph dmphVar2 = dmpnVar2.c;
                if (dmphVar2 == null) {
                    dmphVar2 = dmph.f;
                }
                dsrj<dmpd> dsrjVar2 = dmphVar2.b;
                if ((dmpnVar2.a & 4) != 0 && !dsrjVar.isEmpty() && (dsrjVar.get(0).a & 1) == 0 && !dsrjVar2.isEmpty() && (dsrjVar2.get(0).a & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
