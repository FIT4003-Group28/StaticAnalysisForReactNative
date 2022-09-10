package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitu  reason: default package */
/* loaded from: classes2.dex */
public class aitu implements aipo {
    public ahwg a;
    private final aito b;

    public aitu(ahwg ahwgVar, aito aitoVar) {
        this.a = ahwgVar;
        this.b = aitoVar;
    }

    @Override // defpackage.aipo
    public CharSequence a() {
        return this.a.f().a() ? this.a.f().b().a().k().p() : "";
    }

    @Override // defpackage.aipo
    public cqkl b() {
        airr airrVar = (airr) this.b;
        if (airrVar.aX()) {
            aink ainkVar = airrVar.aU;
            dbsk.s(ainkVar);
            if (ainkVar.t().a()) {
                ahvo ahvoVar = airrVar.at;
                dbsg<btlu> dbsgVar = airrVar.aS;
                dbsk.s(dbsgVar);
                btlu b = dbsgVar.b();
                aink ainkVar2 = airrVar.aU;
                dbsk.s(ainkVar2);
                dqzv a = ainkVar2.t().b().a();
                if ((a.a & 8) != 0) {
                    bvrj.UI_THREAD.c();
                    aibo aiboVar = (aibo) ahvoVar;
                    aibu aibuVar = aiboVar.f;
                    if (aibuVar != null && aibuVar.f.e != null && (a.a & 8) != 0) {
                        dqzn dqznVar = a.e;
                        if (dqznVar == null) {
                            dqznVar = dqzn.c;
                        }
                        if (dqznVar.a.equals(aibuVar.f.e)) {
                            aiboVar.f.c();
                        }
                    }
                    aiboVar.i(b, dcdc.f(a));
                }
            }
        }
        return cqkl.a;
    }
}
