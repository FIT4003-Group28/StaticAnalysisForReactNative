package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aopn  reason: default package */
/* loaded from: classes2.dex */
public class aopn implements aopl {
    private final anro a;
    private final anro b;
    private final Runnable c;
    private final aopm d;
    private final Context e;
    private String f;
    private dbsg<ilo> g = dbpy.a;
    private dnqm h;
    private aoeb i;
    private boolean j;
    private boolean k;

    public aopn(Context context, anro anroVar, anro anroVar2, aogb aogbVar, Runnable runnable, aopm aopmVar) {
        this.e = context;
        this.a = anroVar;
        this.b = anroVar2;
        this.c = runnable;
        this.d = aopmVar;
        aoeb e = aoeb.e(aogq.c(aogp.c(aogbVar.m(), dbpy.a), aogp.c(aogbVar.m(), dbpy.a)), 1);
        this.i = e;
        this.f = w(context, anroVar, e);
        this.h = dnqm.c;
    }

    private static String v(Context context, aogy aogyVar) {
        return apka.b(context, aogyVar.a().a().a(eaou.b));
    }

    private static String w(Context context, anro anroVar, aoeb aoebVar) {
        anrp a;
        dbsg<aogy> d = aoebVar.d();
        if (d.a()) {
            aogy b = d.b();
            if (b.b() == 2) {
                a = anrp.a(R.string.MAPS_ACTIVITY_ARRIVED_AT, v(context, b));
            } else {
                a = anrp.a(R.string.MAPS_ACTIVITY_START_AND_END_TIME, v(context, b), apka.b(context, b.a().b().a(eaou.b)));
            }
            return anpx.b(context, a, anroVar).toString();
        }
        return context.getString(R.string.MAPS_ACTIVITY_EDIT_SEGMENT_DURATION);
    }

    @Override // defpackage.aopl
    public String a() {
        if (!this.g.a()) {
            return this.e.getString(R.string.MAPS_ACTIVITY_SEARCH_FOR_A_PLACE_OR_ADDRESS);
        }
        return this.g.b().bi() ? this.g.b().bh() : this.g.b().n();
    }

    @Override // defpackage.aopl
    public String b() {
        return this.f;
    }

    @Override // defpackage.aopl
    public cjtd c() {
        return cjtd.a(dtyi.bH);
    }

    @Override // defpackage.aopl
    public cjtd d() {
        return cjtd.a(dtyi.aR);
    }

    @Override // defpackage.aopl
    public cqss e() {
        return iva.b(((anpi) this.a).b, cqrt.c(R.color.google_grey900));
    }

    @Override // defpackage.aopl
    public cqss f() {
        return ((anpi) this.a).c;
    }

    @Override // defpackage.aopl
    public cqkl g() {
        this.d.a(this.i);
        return cqkl.a;
    }

    @Override // defpackage.aopl
    public jic h() {
        return aple.d(null, ckqc.FULLY_QUALIFIED, cqrt.f(2131231574));
    }

    @Override // defpackage.aopl
    public cqss i() {
        return ((anpi) this.a).a;
    }

    @Override // defpackage.aopl
    public cqkl j() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.aopl
    public Boolean k() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.aopl
    public Boolean l() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.aopl
    public Boolean m() {
        boolean z = false;
        if (this.g.a() && this.i.d().a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aopl
    public Boolean n() {
        return Boolean.valueOf(this.g.a());
    }

    public dnqm o() {
        return this.h;
    }

    public void p(boolean z) {
        this.j = z;
    }

    public void q(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                this.f = w(this.e, this.b, this.i);
            } else {
                this.f = w(this.e, this.a, this.i);
            }
            cqkx.p(this);
        }
    }

    public void r(ilo iloVar, dnqm dnqmVar) {
        this.h = dnqmVar;
        this.g = dbsg.i(iloVar);
        cqkx.p(this);
    }

    public dbsg<ilo> s() {
        return this.g;
    }

    public void t(aogy aogyVar) {
        aoeb c = aoeb.c(aogyVar);
        this.i = c;
        this.f = w(this.e, this.a, c);
        cqkx.p(this);
    }

    public dbsg<aogy> u() {
        return this.i.d();
    }
}
