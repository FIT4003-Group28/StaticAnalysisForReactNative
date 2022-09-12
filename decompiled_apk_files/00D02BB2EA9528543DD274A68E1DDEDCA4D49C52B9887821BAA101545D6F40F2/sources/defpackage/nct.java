package defpackage;
/* compiled from: PG */
/* renamed from: nct  reason: default package */
/* loaded from: classes7.dex */
public final class nct {
    public final btpc a;
    @dzsi
    public String b;
    @dzsi
    public kcz<dcdc<bxmh>> c;
    private final btrm d;
    private final akox e;
    private final cqat f;
    private final bxer g;
    private boolean h;
    private final ncs i = new ncs(this);

    public nct(btrm btrmVar, akox akoxVar, cqat cqatVar, bxer bxerVar, btpc btpcVar) {
        dbsk.s(btrmVar);
        this.d = btrmVar;
        dbsk.s(akoxVar);
        this.e = akoxVar;
        dbsk.s(cqatVar);
        this.f = cqatVar;
        dbsk.s(bxerVar);
        this.g = bxerVar;
        dbsk.s(btpcVar);
        this.a = btpcVar;
    }

    public final void a() {
        dbsk.l(!this.h);
        this.h = true;
        btrm btrmVar = this.d;
        ncs ncsVar = this.i;
        dceq a = dcet.a();
        a.b(bxev.class, new ncu(bxev.class, ncsVar, bvrj.UI_THREAD));
        btrmVar.g(ncsVar, a.a());
    }

    public final void b() {
        dbsk.l(this.h);
        this.h = false;
        d();
        this.d.a(this.i);
    }

    public final void c(String str, kcz<dcdc<bxmh>> kczVar, bxla bxlaVar) {
        dbsk.l(this.h);
        dbsk.s(str);
        dbsk.s(kczVar);
        d();
        dhjx aa = this.e.aa();
        if (aa == null) {
            kczVar.a(null);
            return;
        }
        bxkx bxkxVar = new bxkx();
        bxkz d = bxkz.d(str, str.codePointCount(0, str.length()), this.f.e());
        bxkxVar.a(d);
        this.b = str;
        this.c = kczVar;
        this.g.e(bxlaVar, d, aa, null, null, false, false, bxkxVar, dwjm.DEFAULT_SEARCH, false, false, false);
    }

    public final void d() {
        if (this.b == null) {
            return;
        }
        kcz<dcdc<bxmh>> kczVar = this.c;
        dbsk.s(kczVar);
        this.b = null;
        this.c = null;
        kczVar.b();
        if (this.b != null) {
            throw new RuntimeException("Tried to start a search while it was being canceled.");
        }
    }
}
