package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awet  reason: default package */
/* loaded from: classes3.dex */
public class awet implements awec, awwn {
    private static final awwt r;
    private final awea A;
    private final awhh B;
    private final awfc C;
    private final Runnable D;
    private final long E;
    private final long F;
    private final awhi G;
    private final avzm H;
    private final avzn I;
    public final Activity a;
    public final avij b;
    public final gfq c;
    public final ges d;
    public final Executor e;
    public final akpm f;
    public final btvo g;
    public final awhf h;
    public final TextView i;
    public final awgu j;
    public final awhj k;
    public final ckcw l;
    public final awhd m;
    @dzsi
    public awco n;
    private final bvsx s;
    private final cklf t;
    private final dehn<awco> u;
    private final bvjj v;
    private final btrm w;
    private final avhz x;
    private final dxio<akzh> y;
    private final dxio<awwq> z;
    private boolean J = false;
    private boolean K = false;
    @dzsi
    public String o = null;
    @dzsi
    public awhc p = null;
    @dzsi
    private dehn<awhc> L = null;
    public boolean q = false;

    static {
        awws u = awwt.u();
        u.t(dcdc.f("offline_region_selection"));
        u.e(awvv.a);
        r = u.a();
    }

    public awet(Activity activity, avij avijVar, cklf cklfVar, dehn<awco> dehnVar, gfq gfqVar, fd fdVar, bvjj bvjjVar, btrm btrmVar, avhz avhzVar, Executor executor, akpm akpmVar, dxio<akzh> dxioVar, btvo btvoVar, cqhn cqhnVar, dxio<awwq> dxioVar2, cjqy cjqyVar, awhh awhhVar, final awfc awfcVar, dxio<akfa> dxioVar3, awhk awhkVar, avzm avzmVar, avzn avznVar, avza avzaVar, ckcw ckcwVar, awhe awheVar, cjqq cjqqVar) {
        this.a = activity;
        this.b = avijVar;
        this.t = cklfVar;
        this.c = gfqVar;
        this.d = (ges) fdVar;
        this.u = dehnVar;
        this.v = bvjjVar;
        this.w = btrmVar;
        this.x = avhzVar;
        this.e = executor;
        this.f = akpmVar;
        this.y = dxioVar;
        this.g = btvoVar;
        this.z = dxioVar2;
        this.B = awhhVar;
        this.C = awfcVar;
        this.H = avzmVar;
        this.I = avznVar;
        this.l = ckcwVar;
        this.A = new awea(cjqqVar, cjqyVar);
        this.s = new bvsx(activity.getResources());
        long j = btvoVar.getOfflineMapsParameters().r * 1000000;
        this.E = j;
        this.D = new awek(this);
        final awhf awhfVar = new awhf(activity, awhhVar);
        this.h = awhfVar;
        int e = cqsg.d(cqrp.d(56.0d), cqrp.c((int) ird.b().a(activity))).e(activity);
        int e2 = cqrp.d(50.0d).e(activity);
        int e3 = cqrp.d(30.0d).e(activity);
        awhi awhiVar = new awhi(e3, e + e3, e3, cqrp.d(80.0d).e(activity) + e2, cqrp.d(50.0d).e(activity) + e2, e2, activity.getResources().getConfiguration().orientation);
        this.G = awhiVar;
        awhk.a(awhhVar, 1);
        awhk.a(activity, 3);
        awhk.a(awhiVar, 4);
        awhj awhjVar = new awhj(awhhVar, j, activity, awhiVar);
        this.k = awhjVar;
        awhfVar.setBackground(new ShapeDrawable(awhjVar));
        boolean b = avzaVar.b(dxioVar3.a().j());
        long c = avzaVar.c(b);
        this.F = c;
        TextView textView = new TextView(activity);
        this.i = textView;
        this.j = new awgu(activity, c, b);
        textView.setTextSize(14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setVisibility(8);
        dbsk.s(textView);
        awhfVar.a = textView;
        dbsk.s(awhiVar);
        awhfVar.b = awhiVar;
        awhfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
        if (awfcVar.g) {
            awfcVar.h = awhfVar;
            awhfVar.setOnClickListener(new View.OnClickListener(awfcVar) { // from class: awew
                private final awfc a;

                {
                    this.a = awfcVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a();
                }
            });
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(awfcVar, awhfVar) { // from class: awex
                private final awfc a;
                private final View b;

                {
                    this.a = awfcVar;
                    this.b = awhfVar;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    awfc awfcVar2 = this.a;
                    View view = this.b;
                    awfcVar2.j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.invalidate();
                }
            };
            awfcVar.c.playSequentially(awfcVar.b(0, 200, animatorUpdateListener), awfcVar.b(200, -200, animatorUpdateListener), awfcVar.b(-200, 0, animatorUpdateListener));
            awfcVar.c.addListener(new awfa(awfcVar, awhfVar));
        }
        avqd a = awheVar.a.a();
        awhe.a(a, 1);
        awby a2 = awheVar.b.a();
        awhe.a(a2, 2);
        avyx a3 = awheVar.c.a();
        awhe.a(a3, 3);
        awhh a4 = awheVar.d.a();
        awhe.a(a4, 4);
        awhe.a(awhfVar, 5);
        awhe.a(awhiVar, 7);
        this.m = new awhd(a, a2, a3, a4, awhfVar, j, awhiVar);
        awfcVar.getClass();
        awhjVar.a.add(new awed(awfcVar));
        awhhVar.c = new Runnable(this) { // from class: awee
            private final awet a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awet awetVar = this.a;
                awetVar.h.post(new awel(awetVar));
            }
        };
    }

    public static boolean u(@dzsi awhc awhcVar) {
        return awhcVar == null || awhcVar.c() > 0;
    }

    @Override // defpackage.awwn
    @dzsi
    public awwt a() {
        return r;
    }

    @Override // defpackage.awwn
    public void b(awwb awwbVar, awwp awwpVar) {
        dbsg a = awwbVar.a(awvv.a);
        this.o = a.a() ? ((dvha) a.b()).d : "";
    }

    @Override // defpackage.awec
    public Boolean c() {
        boolean z = false;
        if (this.b.q() && u(this.p) && !this.J) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.awec
    public cqkl d() {
        ges gesVar = this.d;
        if (gesVar.aD) {
            gfq.l(gesVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.awec
    public cqkl e() {
        dehn<awhc> dehnVar = this.L;
        if (dehnVar != null) {
            deha.m(dehnVar).c(new Runnable(this) { // from class: awei
                private final awet a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    awet awetVar = this.a;
                    if (awetVar.p != null) {
                        awhc awhcVar = awetVar.p;
                        dbsk.s(awhcVar);
                        ((ckco) awetVar.l.a(ckia.I)).a(awhcVar.c());
                    }
                }
            }, this.e);
        }
        awco awcoVar = this.n;
        if (awcoVar == null || !awcoVar.b()) {
            r(this.o);
        } else {
            awga c = this.n.c();
            c.b(new Runnable(this) { // from class: aweg
                private final awet a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    awet awetVar = this.a;
                    awetVar.r(awetVar.o);
                }
            });
            c.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.awec
    public Boolean f() {
        return Boolean.valueOf(this.J);
    }

    @Override // defpackage.awec
    public CharSequence g() {
        return this.J ? "" : this.a.getString(R.string.OFFLINE_DOWNLOAD);
    }

    @Override // defpackage.awec
    public CharSequence h() {
        String string = this.a.getString(R.string.LEARN_MORE);
        ClickableSpan i = this.t.i();
        bvsu c = this.s.c(true != u(this.p) ? R.string.OFFLINE_AREA_UNAVAILABLE : R.string.REGION_INCLUDES_UNAVAILABLE_MAP_AREA);
        bvsu b = this.s.b(string);
        b.p();
        b.k(i);
        c.a(b);
        return c.c();
    }

    @Override // defpackage.awec
    public CharSequence i() {
        bvsu c = this.s.c(R.string.LEARN_MORE);
        c.k(this.t.i());
        return c.c();
    }

    @Override // defpackage.awec
    public Boolean j() {
        awhc awhcVar = this.p;
        boolean z = true;
        if (awhcVar != null && !awhcVar.b()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.awec
    public Boolean k() {
        awhc awhcVar = this.p;
        boolean z = false;
        if (awhcVar != null && awhcVar.c() > 0 && !this.p.b()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.awec
    public void l() {
        if (!this.d.aD) {
            return;
        }
        this.f.ab(this.A);
        btrm btrmVar = this.w;
        awea aweaVar = this.A;
        dceq a = dcet.a();
        a.b(alhw.class, new aweb(alhw.class, aweaVar, bvrj.UI_THREAD));
        a.b(alhx.class, new aweb(1, alhx.class, aweaVar));
        a.b(alhl.class, new aweb(2, alhl.class, aweaVar));
        btrmVar.g(aweaVar, a.a());
        this.z.a().f(this);
        this.h.setVisibility(0);
        awhh awhhVar = this.B;
        awhhVar.b = new awhg(awhhVar);
        awhhVar.a.a(awhhVar.b);
        awhhVar.a.b(awhhVar.b);
        awhhVar.a.d();
        awfc awfcVar = this.C;
        awem awemVar = new awem(this);
        if (!awfcVar.g) {
            awemVar.run();
        } else {
            awfcVar.b.S(bvjk.bI, true);
            aliw J = awfcVar.a.J();
            awfcVar.k = awemVar;
            if (J != null) {
                awfcVar.i = J.n();
                J.a(false);
            }
            View view = awfcVar.h;
            dbsk.s(view);
            final AnimatorSet animatorSet = awfcVar.c;
            animatorSet.getClass();
            view.postDelayed(new Runnable(animatorSet) { // from class: awey
                private final AnimatorSet a;

                {
                    this.a = animatorSet;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.start();
                }
            }, 1500L);
        }
        bvqj.c(this.u, new bvqg(this) { // from class: awef
            private final awet a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final awet awetVar = this.a;
                final awco awcoVar = (awco) obj;
                if (awcoVar != null) {
                    awcoVar.a(new Runnable(awetVar, awcoVar) { // from class: awej
                        private final awet a;
                        private final awco b;

                        {
                            this.a = awetVar;
                            this.b = awcoVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.n = this.b;
                        }
                    });
                }
            }
        }, this.e);
        this.y.a().d = new awen(this);
        this.K = true;
    }

    @Override // defpackage.awec
    public void m() {
        if (!this.K) {
            return;
        }
        this.y.a().d = null;
        this.f.ac(this.A);
        this.w.a(this.A);
        this.z.a().i(this);
        this.h.setVisibility(4);
        awhh awhhVar = this.B;
        akpq akpqVar = awhhVar.a;
        awhg awhgVar = awhhVar.b;
        dbsk.s(awhgVar);
        akpqVar.c(awhgVar);
        awhhVar.b = null;
        this.C.a();
        this.K = false;
    }

    @Override // defpackage.awec
    public synchronized void n() {
        if (!this.d.aD) {
            return;
        }
        final akqs a = this.k.a(this.f);
        if (a == null) {
            return;
        }
        alad p = this.y.a().p();
        dehn<awhc> dehnVar = this.L;
        if (dehnVar != null) {
            dehnVar.cancel(true);
        }
        final awhd awhdVar = this.m;
        final float f = p.k;
        final Executor executor = this.e;
        final deig d = deig.d();
        executor.execute(new Runnable(awhdVar, a, f, d, executor) { // from class: awgv
            private final awhd a;
            private final akqs b;
            private final float c;
            private final deig d;
            private final Executor e;

            {
                this.a = awhdVar;
                this.b = a;
                this.c = f;
                this.d = d;
                this.e = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awhd awhdVar2 = this.a;
                akqs akqsVar = this.b;
                float f2 = this.c;
                final deig deigVar = this.d;
                Executor executor2 = this.e;
                final avib a2 = awhdVar2.g.a(akqsVar, f2, null, false);
                a2.e(new awgz(executor2, deigVar, akqsVar, a2));
                deigVar.Pk(new Runnable(deigVar, a2) { // from class: awgx
                    private final deig a;
                    private final avib b;

                    {
                        this.a = deigVar;
                        this.b = a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        deig deigVar2 = this.a;
                        avib avibVar = this.b;
                        if (deigVar2.isCancelled()) {
                            avibVar.f();
                        }
                    }
                }, executor2);
                a2.g();
            }
        });
        this.L = d;
        deha.q(d, new awer(this), this.e);
    }

    @Override // defpackage.awec
    public void o() {
        this.i.setVisibility(8);
        this.i.removeCallbacks(this.D);
        if (u(this.p)) {
            this.i.postDelayed(this.D, 500L);
        }
    }

    @Override // defpackage.awec
    public View p() {
        return this.h;
    }

    public void q(boolean z) {
        this.J = z;
        cqkx.p(this);
    }

    public final void r(@dzsi String str) {
        String string;
        if (this.d.aD) {
            if (!dbsj.d(str)) {
                this.o = str;
                ((ckcn) this.l.a(ckia.E)).a();
            } else {
                int s = this.v.s(bvjk.bG, 1);
                avzn avznVar = this.I;
                try {
                    string = avznVar.a.getString(R.string.OFFLINE_UNLABELED_AREA_NAME, NumberFormat.getInstance(avznVar.a.getResources().getConfiguration().locale).format(s));
                } catch (NumberFormatException unused) {
                    string = avznVar.a.getString(R.string.OFFLINE_UNLABELED_AREA_NAME, Integer.toString(s));
                }
                this.o = string;
                this.v.W(bvjk.bG, s + 1);
            }
            akqs a = this.k.a(this.f);
            if (a == null) {
                return;
            }
            avzl b = this.H.b(a);
            dlug dlugVar = b.a;
            dspd d = b.d();
            q(true);
            s(d, dlugVar);
        }
    }

    public final void s(dspd dspdVar, dlug dlugVar) {
        if (this.x.a(new awes(this, dspdVar, dlugVar), dspdVar)) {
            q(false);
        } else {
            t(dspdVar, dlugVar, false);
        }
    }

    public final void t(dspd dspdVar, dlug dlugVar, boolean z) {
        avij avijVar = this.b;
        String str = this.o;
        dbsk.s(str);
        avijVar.b(dspdVar, dlugVar, str, z, new aweq(this));
    }
}
