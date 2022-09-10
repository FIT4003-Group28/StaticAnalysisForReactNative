package defpackage;
/* compiled from: PG */
/* renamed from: tfv  reason: default package */
/* loaded from: classes7.dex */
public class tfv implements tfq {
    private final sxb a;
    private final tfn b;
    private dbsg<tlv> c;
    private dbsg<amve> d;
    private Boolean e = false;
    @dzsi
    private szn f;

    public tfv(sxb sxbVar, tfn tfnVar, dbsg<tlv> dbsgVar, dbsg<amve> dbsgVar2) {
        this.a = sxbVar;
        this.b = tfnVar;
        this.c = dbsgVar;
        this.d = dbsgVar2;
        this.f = (!dbsgVar.a() || !this.d.a()) ? null : sxbVar.a(dbsgVar.b(), dbsgVar2.b()).b();
    }

    @Override // defpackage.tfq
    @dzsi
    public tfn a() {
        if (!this.c.a() || !this.d.a()) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.tfq
    public Boolean b() {
        return this.e;
    }

    @Override // defpackage.tfq
    @dzsi
    public sza c() {
        return this.f;
    }

    @Override // defpackage.tfq
    public Boolean d() {
        szn sznVar = this.f;
        if (sznVar != null) {
            return sznVar.c();
        }
        return false;
    }

    public void e(dbsg<tlv> dbsgVar, dbsg<amve> dbsgVar2) {
        if (!this.c.equals(dbsgVar) || !this.d.equals(dbsgVar2)) {
            this.c = dbsgVar;
            this.d = dbsgVar2;
            if (dbsgVar.a() && this.d.a()) {
                this.f = this.a.a(dbsgVar.b(), dbsgVar2.b()).b();
            } else {
                this.f = null;
            }
            cqkx.p(this);
        }
    }

    public void f(jjn jjnVar) {
        szn sznVar = this.f;
        if (sznVar != null) {
            sznVar.OI(jjnVar);
        }
        boolean z = jjnVar != jjn.COLLAPSED;
        if (this.e.booleanValue() != z) {
            this.e = Boolean.valueOf(z);
            cqkx.p(this);
        }
    }

    public void g() {
        szn sznVar = this.f;
        if (sznVar instanceof szl) {
            ((szl) sznVar).i();
        }
    }
}
