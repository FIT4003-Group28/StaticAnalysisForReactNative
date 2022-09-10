package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: brzx  reason: default package */
/* loaded from: classes4.dex */
public class brzx implements brzv {
    private final dcdn<Integer, brzw> a;
    private int b;
    @dzsi
    private String c;
    @dzsi
    private bsks d;

    public brzx(gga ggaVar) {
        dcdg p = dcdn.p();
        p.f(20, new brzw(ggaVar));
        this.a = p.b();
        this.b = 0;
    }

    private final void f() {
        this.c = null;
        this.b = 0;
        cqkx.p(this);
    }

    @Override // defpackage.brzv
    @dzsi
    public String a() {
        return this.c;
    }

    @Override // defpackage.brzv
    public cqkl b() {
        int i;
        bsks bsksVar = this.d;
        if (bsksVar != null && (i = this.b) != 0) {
            bsksVar.i(i);
        }
        return cqkl.a;
    }

    public void c(bsjm bsjmVar, int i) {
        dbsg dbsgVar;
        if (i != 0) {
            Set<dspd> c = bsjmVar.c(i);
            if (c == null || c.isEmpty() || c.size() > 1) {
                dbsgVar = dbpy.a;
            } else {
                dbsgVar = dbsg.i(c.iterator().next());
            }
            brzw brzwVar = this.a.get(Integer.valueOf(i));
            if (!dbsgVar.a() || brzwVar == null) {
                f();
                return;
            }
            String a = brzwVar.a((dspd) dbsgVar.b());
            if (dbsj.d(a)) {
                f();
                return;
            }
            this.b = i;
            this.c = a;
            cqkx.p(this);
            return;
        }
        f();
    }

    public void d(@dzsi bsks bsksVar) {
        this.d = bsksVar;
    }

    public int e() {
        return this.b;
    }
}
