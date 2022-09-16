package defpackage;
/* compiled from: PG */
/* renamed from: bkka  reason: default package */
/* loaded from: classes3.dex */
public class bkka implements bkjt {
    private final CharSequence a;
    private final jic b;
    private final dgly c;
    private final String d;
    private final bwrs<ilo> e;
    private final dxio<bkpi> f;
    private final btvo g;

    public bkka(CharSequence charSequence, String str, dgly dglyVar, String str2, bwrs<ilo> bwrsVar, dxio<bkpi> dxioVar, btvo btvoVar) {
        this.a = charSequence;
        this.b = new jic(str, ckqc.FULLY_QUALIFIED, 0);
        this.c = dglyVar;
        this.d = str2;
        this.e = bwrsVar;
        this.f = dxioVar;
        this.g = btvoVar;
    }

    @Override // defpackage.bkjt
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bkjt
    public jic b() {
        return this.b;
    }

    @Override // defpackage.bkjt
    public cqkl c(cjqm cjqmVar) {
        String str;
        dgly dglyVar = this.c;
        if (dglyVar != null) {
            String str2 = dglyVar.a;
            for (dgmg dgmgVar : dglyVar.b) {
                dgmi dgmiVar = dgmgVar.d;
                if (dgmiVar == null) {
                    dgmiVar = dgmi.f;
                }
                if ((dgmiVar.a & 1) != 0) {
                    str = str2.substring(dgmgVar.b, dgmgVar.c);
                    break;
                }
            }
        }
        str = "";
        this.f.a().b(this.e, dbpy.a, dbsg.i(str), dbpy.a, true, dbsg.j(this.d));
        return cqkl.a;
    }

    @Override // defpackage.bkjt
    public cjtd d() {
        ilo c = this.e.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.lJ;
        return c2.a();
    }

    @Override // defpackage.bkjt
    public boolean e() {
        return this.g.getPlaceSheetParameters().an();
    }
}
