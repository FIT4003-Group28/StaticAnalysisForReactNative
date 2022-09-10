package defpackage;
/* compiled from: PG */
/* renamed from: tft  reason: default package */
/* loaded from: classes7.dex */
public class tft implements tfp {
    private final szq a;
    private final svq b;
    private final sxa c;
    private final tfn d;
    private dbsg<tlv> e;
    private dbsg<amve> f;
    private int g;
    private boolean h;
    @dzsi
    private tdz i;
    @dzsi
    private svr j;

    public tft(szq szqVar, svq svqVar, tfn tfnVar, sxa sxaVar, dbsg<tlv> dbsgVar, dbsg<amve> dbsgVar2) {
        svr svrVar;
        this.a = szqVar;
        this.b = svqVar;
        this.c = sxaVar;
        this.d = tfnVar;
        this.e = dbsgVar;
        this.f = dbsgVar2;
        if (!dbsgVar.a() || !this.f.a()) {
            svrVar = null;
            this.i = null;
        } else {
            this.i = szqVar.a(sxaVar, dbsgVar.b(), dbsgVar2.b()).b();
            svrVar = svqVar.a(sxaVar, dbsgVar.b(), dbsgVar2.b()).b();
        }
        this.j = svrVar;
        this.h = false;
        this.g = 0;
    }

    @Override // defpackage.tfp
    @dzsi
    public tfn a() {
        if (!this.e.a() || !this.f.a()) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.tfp
    @dzsi
    public tdh b() {
        return this.i;
    }

    @Override // defpackage.tfp
    @dzsi
    public svr c() {
        return this.j;
    }

    @Override // defpackage.tfp
    public Boolean d() {
        return Boolean.valueOf(!this.h);
    }

    @Override // defpackage.tfp
    public cqtv e() {
        return cqrp.c(this.g);
    }

    public void f(dbsg<tlv> dbsgVar, dbsg<amve> dbsgVar2) {
        if (!this.e.equals(dbsgVar) || !this.f.equals(dbsgVar2)) {
            this.e = dbsgVar;
            this.f = dbsgVar2;
            if (dbsgVar.a() && this.f.a()) {
                this.i = this.a.a(this.c, dbsgVar.b(), dbsgVar2.b()).b();
                this.j = this.b.a(this.c, dbsgVar.b(), dbsgVar2.b()).b();
            } else {
                this.i = null;
                this.j = null;
            }
            cqkx.p(this);
        }
    }

    public void g(boolean z) {
        if (this.h != z) {
            this.h = z;
            tdz tdzVar = this.i;
            if (tdzVar != null) {
                tdzVar.k(z);
            }
            cqkx.p(this);
        }
    }

    public void h(int i) {
        if (this.g != i) {
            this.g = i;
            cqkx.p(this);
        }
    }
}
