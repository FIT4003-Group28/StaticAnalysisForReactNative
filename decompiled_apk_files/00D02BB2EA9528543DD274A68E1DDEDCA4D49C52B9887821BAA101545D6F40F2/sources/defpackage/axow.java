package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axow  reason: default package */
/* loaded from: classes3.dex */
public class axow implements axol {
    public final dzsj<gga> a;
    public final bvjj b;
    public final cqat c;
    public final Runnable d;
    public boolean e = false;
    private final bsvn f;
    private final akfa g;
    private final cjqy h;
    private final Executor i;
    private final axoi j;
    private final List<dpzz> k;
    private dqfc l;

    public axow(dzsj<gga> dzsjVar, bsvn bsvnVar, bvjj bvjjVar, akfa akfaVar, cjqy cjqyVar, cqhn cqhnVar, Executor executor, cqat cqatVar, axoi axoiVar, dqfc dqfcVar, List<dpzz> list, Runnable runnable) {
        this.a = dzsjVar;
        this.f = bsvnVar;
        this.b = bvjjVar;
        this.g = akfaVar;
        this.h = cjqyVar;
        this.i = executor;
        this.c = cqatVar;
        this.j = axoiVar;
        this.l = dqfcVar;
        this.k = list;
        this.d = runnable;
    }

    private final dpzz m() {
        dpzz dpzzVar = null;
        for (dpzz dpzzVar2 : this.k) {
            dqfc b = dqfc.b(dpzzVar2.d);
            if (b == null) {
                b = dqfc.UNKNOWN_VISIBILITY;
            }
            if (true == b.equals(this.l)) {
                dpzzVar = dpzzVar2;
            }
        }
        dbsk.s(dpzzVar);
        return dpzzVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        cjtd a;
        jhz e = jib.g(this.a.a(), "").e();
        e.x = false;
        e.q = ibm.a();
        e.d = ibm.a();
        dqfc dqfcVar = dqfc.UNKNOWN_VISIBILITY;
        int ordinal = this.l.ordinal();
        if (ordinal != 1) {
            a = ordinal != 2 ? null : cjtd.a(dtxy.q);
        } else {
            a = cjtd.a(dtxy.n);
        }
        dbsk.s(a);
        e.o = a;
        return e.b();
    }

    @Override // defpackage.axol
    public jic b() {
        return new jic(m().c, ckqc.FULLY_QUALIFIED, R.drawable.generic_image_placeholder);
    }

    @Override // defpackage.axol
    public String c() {
        return m().a;
    }

    @Override // defpackage.axol
    public CharSequence d() {
        ddho ddhoVar;
        dnoj dnojVar = m().b;
        if (dnojVar == null) {
            dnojVar = dnoj.d;
        }
        int color = this.a.a().getResources().getColor(R.color.mod_daynight_blue600);
        dqfc dqfcVar = dqfc.UNKNOWN_VISIBILITY;
        int ordinal = this.l.ordinal();
        if (ordinal != 1) {
            ddhoVar = ordinal != 2 ? null : dtxy.r;
        } else {
            ddhoVar = dtxy.o;
        }
        dbsk.s(ddhoVar);
        cjqy cjqyVar = this.h;
        Runnable runnable = new Runnable(this) { // from class: axou
            private final axow a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.l();
            }
        };
        dnpq dnpqVar = dnojVar.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.d;
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) dnojVar.a).append((CharSequence) str).append((CharSequence) dnojVar.c);
        int indexOf = append.toString().indexOf(str);
        append.setSpan(jmw.e(color, cjqyVar, ddhoVar, runnable), indexOf, str.length() + indexOf, 33);
        return append;
    }

    @Override // defpackage.axol
    public cqkl e() {
        l();
        return cqkl.a;
    }

    @Override // defpackage.axol
    public String f() {
        btlu j = this.g.j();
        dbsk.s(j);
        String str = j.k;
        if (str == null) {
            return this.a.a().getString(R.string.OK_BUTTON);
        }
        return this.a.a().getString(R.string.CREATOR_ONBOARDING_CONFIRM_BUTTON, new Object[]{str});
    }

    @Override // defpackage.axol
    public cqkl g() {
        int i = 1;
        this.e = true;
        cqkx.p(this);
        btlu j = this.g.j();
        bvjj bvjjVar = this.b;
        bvjk bvjkVar = bvjk.hM;
        int a = dfqg.a(m().e);
        if (a != 0) {
            i = a;
        }
        bvjjVar.X(bvjkVar, j, i - 1);
        bvjj bvjjVar2 = this.b;
        bvjk bvjkVar2 = bvjk.gY;
        int a2 = dfqa.a(m().f);
        if (a2 == 0) {
            a2 = 2;
        }
        bvjjVar2.X(bvjkVar2, j, a2 - 1);
        deha.q(this.f.c(), new axov(this, j), this.i);
        return cqkl.a;
    }

    @Override // defpackage.axol
    public Boolean h() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.axol
    public axog i() {
        btlu j = this.g.j();
        String v = j.v();
        String j2 = j.j();
        if (v == null || j2 == null) {
            return null;
        }
        axoi axoiVar = this.j;
        String t = j.t();
        String str = j.i;
        dxio a = ((dxjh) axoiVar.a).a();
        axoi.b(a, 1);
        axoi.b(j2, 2);
        axoi.b(v, 3);
        return new axoh(a, j2, v, t, str);
    }

    @Override // defpackage.axol
    public cjtd j() {
        cjtd a;
        dqfc dqfcVar = dqfc.UNKNOWN_VISIBILITY;
        int ordinal = this.l.ordinal();
        if (ordinal != 1) {
            a = ordinal != 2 ? null : cjtd.a(dtxy.p);
        } else {
            a = cjtd.a(dtxy.m);
        }
        dbsk.s(a);
        return a;
    }

    public void k(dqfc dqfcVar) {
        this.l = dqfcVar;
    }

    public final void l() {
        btki btkiVar = new btki();
        btkiVar.aH = true;
        btkiVar.aI = 3;
        bszv.ba(this.a.a(), btkiVar);
    }
}
