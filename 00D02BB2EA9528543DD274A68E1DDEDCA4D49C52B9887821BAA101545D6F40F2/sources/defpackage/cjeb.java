package defpackage;
/* compiled from: PG */
/* renamed from: cjeb  reason: default package */
/* loaded from: classes4.dex */
public class cjeb implements cjet {
    private dcdc<cjeu> a;

    public cjeb(cjee cjeeVar) {
    }

    @Override // defpackage.cjet
    public dcdc<cjeu> a() {
        dcdc<cjeu> dcdcVar = this.a;
        if (dcdcVar != null) {
            return dcdcVar;
        }
        dccx F = dcdc.F();
        for (int i = 0; i < 2; i++) {
            F.g(new cjed());
        }
        dcdc<cjeu> f = F.f();
        this.a = f;
        return f;
    }

    @Override // defpackage.cjet
    public cjeu b() {
        return a().get(0);
    }
}
