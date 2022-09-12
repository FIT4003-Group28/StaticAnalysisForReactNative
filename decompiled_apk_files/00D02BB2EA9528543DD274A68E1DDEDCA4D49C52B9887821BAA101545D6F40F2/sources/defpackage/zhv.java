package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zhv  reason: default package */
/* loaded from: classes7.dex */
public class zhv implements zbp {
    public final Activity a;
    public final eeu b;
    public final bwqv c;
    public final dzsj<axwy> d;
    public final bwrs<ilo> e;
    private final yzi f;
    private final dxio<akfa> g;
    private final akfc h;
    private final Runnable i;
    private final Runnable j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final dqvj o;
    private final amvh p;
    private final List<amvh> q;
    private final dwao r;
    private final String s;
    private final axwu t = new zhn(this);

    public zhv(final Activity activity, eeu eeuVar, bwqv bwqvVar, yzi yziVar, dxio<akfa> dxioVar, akfc akfcVar, dxio<axwq> dxioVar2, dzsj<axwy> dzsjVar, Runnable runnable, Runnable runnable2, bwrs<ilo> bwrsVar, dqvj dqvjVar, amvh amvhVar, List<amvh> list, dwao dwaoVar, String str) {
        this.a = activity;
        this.b = eeuVar;
        this.c = bwqvVar;
        this.f = yziVar;
        this.g = dxioVar;
        this.h = akfcVar;
        this.d = dzsjVar;
        this.i = runnable;
        this.j = runnable2;
        this.e = bwrsVar;
        this.o = dqvjVar;
        this.p = amvhVar;
        this.q = list;
        this.r = dwaoVar;
        this.s = str;
        dcdc<azva> n = dxioVar2.a().n();
        this.k = dcft.j(n, zhj.a);
        this.l = dcft.j(n, zhk.a);
        this.m = dcft.j(n, new dbsl(activity) { // from class: zhl
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Activity activity2 = this.a;
                return activity2.getString(R.string.SCHOOL_LOCATION).equals(((azva) obj).e(activity2));
            }
        });
        this.n = dcft.j(n, new dbsl(activity) { // from class: zhm
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Activity activity2 = this.a;
                return activity2.getString(R.string.GYM_LOCATION).equals(((azva) obj).e(activity2));
            }
        });
    }

    private final void w(Runnable runnable) {
        btlu j = this.g.a().j();
        if (j == null || !j.u()) {
            this.h.k(new zhu(runnable), null);
            return;
        }
        runnable.run();
    }

    @Override // defpackage.zbl
    public cqkl a() {
        return cqkl.a;
    }

    @Override // defpackage.zbl
    public cqkl b() {
        this.j.run();
        return cqkl.a;
    }

    @Override // defpackage.zbl
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.zbl
    @dzsi
    public cqsn d() {
        return null;
    }

    @Override // defpackage.zbl
    @dzsi
    public cqsn e() {
        return null;
    }

    @Override // defpackage.zbl
    @dzsi
    public cjtd f() {
        return cjtd.a(dtxn.bH);
    }

    @Override // defpackage.zbp
    public CharSequence g() {
        bvsx bvsxVar = new bvsx(this.a.getResources());
        bvsu c = bvsxVar.c(R.string.DIRECTIONS_LABEL_SHORTCUT_NUDGEBAR_TITLE);
        c.i();
        bvsu c2 = bvsxVar.c(R.string.DIRECTIONS_LABEL_SHORTCUT_NUDGEBAR_SUBTITLE);
        bvsu c3 = bvsxVar.c(R.string.DIRECTIONS_LABEL_SHORTCUT_NUDGEBAR_MESSAGE);
        c3.a(c, c2);
        return c3.c();
    }

    @Override // defpackage.zbp
    public String h() {
        return this.s;
    }

    @Override // defpackage.zbp
    public Boolean i() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.zbp
    public Boolean j() {
        return Boolean.valueOf(this.l);
    }

    @Override // defpackage.zbp
    public Boolean k() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.zbp
    public Boolean l() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.zbp
    public cqkl m() {
        w(new zho(this));
        return cqkl.a;
    }

    @Override // defpackage.zbp
    public cqkl n() {
        w(new zhp(this));
        return cqkl.a;
    }

    @Override // defpackage.zbp
    public cqkl o() {
        w(new zhq(this));
        return cqkl.a;
    }

    @Override // defpackage.zbp
    public cqkl p() {
        w(new zhr(this));
        return cqkl.a;
    }

    @Override // defpackage.zbp
    public cqkl q() {
        w(new zht(this));
        return cqkl.a;
    }

    @Override // defpackage.zbq
    public Boolean r() {
        return true;
    }

    @Override // defpackage.zbq
    public cjtd s() {
        return cjtd.a(dtxn.bG);
    }

    public final void t(dndr dndrVar) {
        dbsk.s(this.e);
        ilo c = this.e.c();
        dbsk.s(c);
        akqi ai = c.ai();
        axwy a = this.d.a();
        axwu axwuVar = this.t;
        String y = c.y();
        dbsk.s(y);
        a.I(dndrVar, axwuVar, null, false, y, akqi.d(ai) ? ai.o() : null, null, dtxn.bG, null);
    }

    public final void u(String str, String str2) {
        dbsk.s(this.e);
        ilo c = this.e.c();
        dbsk.s(c);
        this.d.a().ac(dndr.NICKNAME, this.t, null, false, str, str2, dtxn.bG, null, c, null);
    }

    public final void v(@dzsi String str) {
        this.f.a(this.o, this.p, this.q, this.r, str, true);
        this.i.run();
    }
}
