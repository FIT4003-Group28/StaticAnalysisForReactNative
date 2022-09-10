package defpackage;
/* compiled from: PG */
/* renamed from: adjx  reason: default package */
/* loaded from: classes.dex */
public class adjx extends aczs implements adjw {
    private final abpr a;
    private final absg b;

    public adjx(abvw abvwVar, dbsg dbsgVar, absg absgVar) {
        bjhi a = abvwVar.a.a();
        abvw.a(a, 1);
        abvw.a(dbsgVar, 2);
        abvw.a(absgVar, 3);
        this.a = new abvv(a, dbsgVar, absgVar);
        this.b = absgVar;
    }

    @Override // defpackage.adjw
    public abpr a() {
        return this.a;
    }

    public void b(dvit dvitVar) {
        ily ilyVar = new ily();
        dvyw dvywVar = dvitVar.c;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.E(dvywVar);
        ilyVar.e = true;
        this.a.c(ilyVar.d());
    }

    public Boolean c() {
        return this.a.a();
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = this.b == absg.AREA_EXPLORE ? dtxj.bZ : dtxr.w;
        return b.a();
    }
}
