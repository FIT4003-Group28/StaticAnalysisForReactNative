package defpackage;
/* compiled from: PG */
/* renamed from: aoim  reason: default package */
/* loaded from: classes2.dex */
public class aoim implements aoij {
    private final dcdc<aoig> a;

    public aoim(dcdc<aoig> dcdcVar) {
        this.a = dcdcVar;
    }

    public static aoim b(bbut bbutVar, dcdc<dwfl> dcdcVar) {
        dbsg i = dbsg.i(new aoil(bbutVar));
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < dcdcVar.size(); i2++) {
            dwfl dwflVar = dcdcVar.get(i2);
            cjta b = cjtd.b();
            b.d = dtyi.aT;
            int i3 = dwflVar.a;
            if ((i3 & 2) != 0 && (i3 & 1) != 0) {
                b.b = dwflVar.b;
                b.g(dwflVar.c);
            }
            F.g(new aoih(aple.d(dwflVar.h, ckqc.FIFE_SMART_CROP, null), b.a(), new aoik(i, dcdcVar, i2)));
        }
        return new aoim(F.f());
    }

    @Override // defpackage.aoij
    public dcdc<aoig> a() {
        return this.a;
    }
}
