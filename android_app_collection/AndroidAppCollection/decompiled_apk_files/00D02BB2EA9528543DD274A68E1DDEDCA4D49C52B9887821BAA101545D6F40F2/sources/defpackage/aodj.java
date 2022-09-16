package defpackage;

import android.content.Context;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aodj  reason: default package */
/* loaded from: classes2.dex */
public class aodj implements aodh {
    private final Context a;
    private final cqat b;
    private final Runnable c;
    private final String d;
    private dbsg<eapg> e;
    private boolean f;
    private final int g;
    private dbsg<eapg> h = dbpy.a;
    private dbsg<eapg> i;

    public aodj(Context context, cqat cqatVar, Runnable runnable, String str, dbsg<eapg> dbsgVar, boolean z, int i) {
        this.a = context;
        this.b = cqatVar;
        this.c = runnable;
        this.d = str;
        this.e = dbsgVar;
        this.f = z;
        this.g = i;
        this.i = dbsg.i(aogc.j(cqatVar));
    }

    private final dbsg<Long> l(dbsg<eapg> dbsgVar) {
        return !dbsgVar.a() ? dbpy.a : dbsg.i(Long.valueOf(dbsgVar.b().m(aogc.l(this.b)).a));
    }

    private final dbsg<Long> m(dbsg<eapg> dbsgVar) {
        return !dbsgVar.a() ? dbpy.a : dbsg.i(Long.valueOf(dbsgVar.b().p(1).m(aogc.l(this.b)).a - 1));
    }

    @Override // defpackage.aodh
    public Boolean a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.aodh
    public String b() {
        return this.e.a() ? bvtb.m(this.a, TimeUnit.MILLISECONDS.toSeconds(this.e.b().m(eaou.b).a), TimeZone.getTimeZone("UTC"), this.g) : this.d;
    }

    @Override // defpackage.aodh
    public cqkl c() {
        if (a().booleanValue()) {
            eapg c = this.e.c(aogc.j(this.b));
            if (!this.h.a() || !c.C(this.h.b())) {
                if (this.i.a() && c.B(this.i.b())) {
                    c = this.i.b();
                }
            } else {
                c = this.h.b();
            }
            jem jemVar = new jem(this.a, new aodi(this), c.r(), c.s() - 1, c.t());
            if (this.h.a()) {
                jemVar.getDatePicker().setMinDate(l(this.h).b().longValue());
            }
            if (this.i.a()) {
                jemVar.getDatePicker().setMaxDate(m(this.i).b().longValue());
            }
            if (!this.h.a()) {
                this.i.a();
            }
            jemVar.show();
        }
        return cqkl.a;
    }

    public dbsg<eapg> d() {
        return this.e;
    }

    public void e(dbsg<eapg> dbsgVar) {
        if (!this.e.equals(dbsgVar)) {
            this.e = dbsgVar;
            this.c.run();
            cqkx.p(this);
        }
    }

    public void f() {
        long b = this.b.b();
        e(dbsg.i(new eapg(b, aogc.m(b))));
    }

    public void g(boolean z) {
        if (this.f != z) {
            this.f = z;
            if (!z) {
                f();
            }
            this.c.run();
            cqkx.p(this);
        }
    }

    public void h(dbsg<eapg> dbsgVar) {
        this.h = dbsgVar;
    }

    public void i(dbsg<eapg> dbsgVar) {
        this.i = dbsgVar;
    }

    public dbsg<Long> j() {
        return l(d());
    }

    public dbsg<Long> k() {
        return m(d());
    }
}
