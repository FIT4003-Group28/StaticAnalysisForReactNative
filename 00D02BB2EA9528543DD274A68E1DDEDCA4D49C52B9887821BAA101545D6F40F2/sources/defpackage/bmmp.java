package defpackage;
/* compiled from: PG */
/* renamed from: bmmp  reason: default package */
/* loaded from: classes3.dex */
public class bmmp implements aeqd {
    private final jkf a;
    @dzsi
    private final mw<ilo> b;
    @dzsi
    private bmmn c;
    private bmmo d;
    private ilo e;

    public bmmp(jkf jkfVar, bmmo bmmoVar, ilo iloVar, @dzsi mw<ilo> mwVar) {
        this.a = jkfVar;
        this.d = bmmoVar;
        this.b = mwVar;
        this.e = iloVar;
        h(iloVar);
    }

    @Override // defpackage.aeqd
    public String a() {
        return null;
    }

    @Override // defpackage.aeqd
    @dzsi
    public aeqk b() {
        return this.c;
    }

    @Override // defpackage.aeqd
    public aeqj c() {
        return null;
    }

    @Override // defpackage.aeqd
    public aeqj d() {
        return null;
    }

    @Override // defpackage.aeqd
    public Boolean e() {
        return false;
    }

    @Override // defpackage.aeqd
    public cqkl f() {
        ilo iloVar;
        mw<ilo> mwVar = this.b;
        if (mwVar != null && (iloVar = this.e) != null) {
            mwVar.a(iloVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.aeqd
    @dzsi
    public cjtd g() {
        cjta c = cjtd.c(this.e.bZ());
        c.d = this.a.l().L().b() ? dtxy.iz : dtxy.hH;
        return c.a();
    }

    public void h(ilo iloVar) {
        bmmn bmmnVar;
        this.e = iloVar;
        if (iloVar.cU() != null) {
            bmmo bmmoVar = this.d;
            dbsk.s(bmmoVar);
            gga a = bmmoVar.a.a();
            bmmo.a(a, 1);
            bmmo.a(iloVar, 2);
            bmmnVar = new bmmn(a, iloVar);
        } else {
            bmmnVar = null;
        }
        this.c = bmmnVar;
    }
}
