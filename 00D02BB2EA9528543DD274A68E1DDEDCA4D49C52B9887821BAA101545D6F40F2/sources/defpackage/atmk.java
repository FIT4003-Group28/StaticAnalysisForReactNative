package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
import com.google.android.apps.gmm.map.model.directions.LaneGuidance;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: atmk  reason: default package */
/* loaded from: classes2.dex */
public class atmk implements atnf, amfq {
    private final btvo A;
    private CharSequence B;
    private CharSequence C;
    private atnn D;
    @dzsi
    private CharSequence E;
    @dzsi
    private CharSequence F;
    @dzsi
    private CharSequence G;
    private boolean H;
    private cray I;
    private boolean J;
    private boolean K;
    private boolean L;
    @dzsi
    private atnf M;
    @dzsi
    private atcs N;
    private boolean O;
    private final Context a;
    private final atnb b;
    private final atnc c;
    private final atne d;
    private final Runnable e;
    private final atec f;
    private final atec g;
    @dzsi
    private final atec h;
    @dzsi
    private final atec i;
    @dzsi
    private final zrk j;
    private final bvsl k;
    private final Callable<Boolean> l;
    private final atnd m;
    private final boolean n;
    private final boolean o;
    private final atee p;
    @dzsi
    private final Maneuvers$Maneuver q;
    private final boolean r;
    private final amuo s;
    private final atoa t;
    private final atmj u;
    private final atln v;
    @dzsi
    private final Maneuvers$Maneuver w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public atmk(android.content.Context r19, defpackage.atln r20, defpackage.bvsl r21, defpackage.vtn r22, defpackage.atmj r23, defpackage.atnb r24, defpackage.atnc r25, defpackage.atne r26, defpackage.atee r27, defpackage.ated r28, boolean r29, @defpackage.dzsi defpackage.zrl r30, defpackage.btvo r31, @defpackage.dzsi defpackage.zrt r32, defpackage.amuo r33, defpackage.atlq r34, defpackage.atnd r35, boolean r36, java.util.concurrent.Callable<java.lang.Boolean> r37, boolean r38, boolean r39, @defpackage.dzsi defpackage.atnf r40, java.lang.Runnable r41, java.lang.Runnable r42, boolean r43, boolean r44, boolean r45, int r46) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atmk.<init>(android.content.Context, atln, bvsl, vtn, atmj, atnb, atnc, atne, atee, ated, boolean, zrl, btvo, zrt, amuo, atlq, atnd, boolean, java.util.concurrent.Callable, boolean, boolean, atnf, java.lang.Runnable, java.lang.Runnable, boolean, boolean, boolean, int):void");
    }

    private final boolean Z(amuo amuoVar, boolean z, boolean z2) {
        return !this.L && (!z2 || amux.f(amuoVar, z));
    }

    private final void aa() {
        this.F = d(this.a, this.v, this.s, this.u, this.H, this.z);
        CharSequence e = e(this.a, this.k, this.v, this.s, this.I, this.u, this.H, this.z);
        this.G = e;
        this.E = TextUtils.concat(this.F, " ", e);
    }

    public static CharSequence e(Context context, bvsl bvslVar, atln atlnVar, amuo amuoVar, cray crayVar, atmj atmjVar, boolean z, boolean z2) {
        int i;
        atli atliVar;
        Integer num;
        Integer num2;
        boolean z3 = atmjVar.a;
        if (z) {
            i = z2 ? atmjVar.k.intValue() : atmjVar.c;
        } else {
            i = atmjVar.b;
        }
        int i2 = i;
        float f = atmjVar.e;
        float f2 = atmjVar.f;
        int i3 = atmjVar.g;
        int i4 = atmjVar.h;
        if (z2 && (num2 = atmjVar.i) != null) {
            i3 = num2.intValue();
        }
        if (z2 && (num = atmjVar.j) != null) {
            i4 = num.intValue();
        }
        atli atliVar2 = new atli(context, 1, 1, -1, true, null, z3, i2, f, 1.0f, f2, true != z ? i3 : i4, btsp.c(bvslVar), crayVar.a.I);
        int i5 = crayVar.e;
        String string = atlnVar.a.getResources().getString(R.string.DA_STAY_ON_ROAD_SECONDARY_MANEUVER);
        int indexOf = string.indexOf("{0}");
        int indexOf2 = string.indexOf("{1}");
        String substring = string.substring(0, Math.min(indexOf, indexOf2));
        if (!dbsj.d(substring)) {
            atliVar = atliVar2;
            atliVar.e(substring);
        } else {
            atliVar = atliVar2;
        }
        if (indexOf < indexOf2) {
            atliVar.f(i5);
        } else {
            atlnVar.j(amuoVar, atliVar);
        }
        int i6 = indexOf + 3;
        int i7 = indexOf2 + 3;
        String substring2 = string.substring(Math.min(i6, i7), Math.max(indexOf, indexOf2));
        if (!dbsj.d(substring2)) {
            atliVar.e(substring2);
        }
        if (indexOf < indexOf2) {
            atlnVar.j(amuoVar, atliVar);
        } else {
            atliVar.f(i5);
        }
        String substring3 = string.substring(Math.max(i6, i7));
        if (!dbsj.d(substring3)) {
            atliVar.e(substring3);
        }
        return atliVar.k().get(0);
    }

    public static CharSequence f(int i, dowa dowaVar, atmj atmjVar, bvsl bvslVar, boolean z, boolean z2) {
        return g(i, dowaVar, atmjVar, bvslVar, z, false, null, null, null);
    }

    public static CharSequence g(int i, dowa dowaVar, atmj atmjVar, bvsl bvslVar, boolean z, boolean z2, @dzsi atne atneVar, @dzsi Boolean bool, @dzsi Context context) {
        int i2;
        bvsw bvswVar = new bvsw();
        bvsw bvswVar2 = new bvsw();
        if (z) {
            i2 = z2 ? atmjVar.k.intValue() : atmjVar.c;
        } else {
            i2 = atmjVar.b;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (atneVar != null && bool != null && context != null) {
            cqss c = atneVar.c(bool.booleanValue());
            Float f = null;
            Integer valueOf2 = c != null ? Integer.valueOf(c.b(context)) : null;
            cqss d = atneVar.d(bool.booleanValue());
            Integer valueOf3 = d != null ? Integer.valueOf(d.b(context)) : null;
            if (valueOf3 != null) {
                valueOf = valueOf3;
            }
            bool.booleanValue();
            cqrp g = atneVar.g();
            Float valueOf4 = g != null ? Float.valueOf(g.a(context)) : null;
            bool.booleanValue();
            cqrp f2 = atneVar.f();
            Float valueOf5 = f2 != null ? Float.valueOf(f2.a(context)) : null;
            if (valueOf5 != null && valueOf4 != null && valueOf4.floatValue() > 0.0f) {
                f = Float.valueOf(valueOf5.floatValue() / valueOf4.floatValue());
            }
            if (f == null) {
                f = Float.valueOf(atmjVar.d);
            }
            if (atmjVar.a) {
                bvswVar.c();
            }
            if (valueOf2 != null) {
                bvswVar.e(valueOf2.intValue());
            }
            bvswVar2.f(f.floatValue());
            bvswVar2.e(valueOf.intValue());
        } else {
            if (atmjVar.a) {
                bvswVar.c();
            }
            bvswVar2.f(atmjVar.d);
            bvswVar2.e(valueOf.intValue());
        }
        return !atlj.b(i) ? "" : bvslVar.h(i, dowaVar, bvswVar, bvswVar2);
    }

    @Override // defpackage.atnf
    public atnb A() {
        return this.b;
    }

    @Override // defpackage.atnf
    public atnc B() {
        return this.c;
    }

    @Override // defpackage.atnf
    public atne C() {
        return this.d;
    }

    @Override // defpackage.atnf
    public Boolean D() {
        return Boolean.valueOf(this.H);
    }

    @Override // defpackage.atnf
    public Boolean E() {
        return Boolean.valueOf(this.x);
    }

    @Override // defpackage.atnf
    public Boolean F() {
        try {
            return this.l.call();
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // defpackage.atnf
    public Boolean G() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.atnf
    public Boolean H() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.atnf
    public void I(boolean z) {
        atec atecVar;
        if (this.H != z || this.D == null) {
            this.H = z;
            List<LaneGuidance> list = amux.e(this.s) ? this.s.F : null;
            atee ateeVar = this.p;
            if (T().booleanValue()) {
                atecVar = this.H ? this.i : this.h;
                dbsk.s(atecVar);
            } else {
                atecVar = this.H ? this.g : this.f;
            }
            this.D = new atnn(list, ateeVar, atecVar);
            zrk zrkVar = this.j;
            if (zrkVar != null) {
                zrkVar.w(this.H);
            }
            if (L().booleanValue()) {
                aa();
            }
            if (!o().booleanValue()) {
                return;
            }
            ab();
        }
    }

    @Override // defpackage.atnf
    public Boolean J() {
        boolean z = false;
        if (this.w != null && this.K && this.J && !L().booleanValue() && !w().booleanValue() && !R().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atnf
    public Maneuvers$Maneuver K() {
        return this.w;
    }

    @Override // defpackage.atnf
    @dzsi
    public Boolean L() {
        boolean z = false;
        if (this.E != null && this.F != null && this.G != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atnf
    @dzsi
    public CharSequence M() {
        return this.F;
    }

    @Override // defpackage.atnf
    @dzsi
    public CharSequence N() {
        return this.G;
    }

    @Override // defpackage.atnf
    public Boolean O() {
        Maneuvers$Maneuver maneuvers$Maneuver = this.q;
        boolean z = false;
        if (maneuvers$Maneuver != null && maneuvers$Maneuver.a == dgau.DESTINATION) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atnf
    public Boolean P() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.atnf
    public Boolean Q() {
        return false;
    }

    @Override // defpackage.atnf
    public Boolean R() {
        return Boolean.valueOf(this.L);
    }

    @Override // defpackage.atnf
    public Boolean S() {
        return Boolean.valueOf(this.A.getDirectionsExperimentsParameters().l);
    }

    @Override // defpackage.atnf
    public Boolean T() {
        return Boolean.valueOf(this.z);
    }

    @Override // defpackage.atnf
    public Boolean U() {
        boolean z = false;
        if (k().booleanValue() && L().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atnf
    public String V() {
        if (o().booleanValue()) {
            bvsi bvsiVar = new bvsi(this.a);
            bvsiVar.c(q());
            bvsiVar.c(this.s.q);
            return bvsiVar.toString();
        }
        return this.s.q;
    }

    @Override // defpackage.atnf
    public cqfd W() {
        int i;
        Animator animator;
        atcs atcsVar = this.N;
        if (atcsVar == null || atcsVar.b) {
            int i2 = 2;
            if (this.O) {
                this.O = false;
                i = 2;
            } else {
                i = 1;
            }
            if (i == 1 || atcsVar == null) {
                i2 = i;
            } else if (atcsVar.d == 2 && (animator = atcsVar.c) != null) {
                animator.cancel();
            }
            if (this.N == null || i2 != 1) {
                this.N = new atcs(i2, this, this.M);
            }
            return this.N;
        }
        return atcsVar;
    }

    @Override // defpackage.atnf
    public Boolean X() {
        return false;
    }

    @Override // defpackage.atnf
    public Boolean Y() {
        return false;
    }

    @Override // defpackage.amfq
    public void a(amfu amfuVar) {
        this.e.run();
    }

    @Override // defpackage.atnf
    @dzsi
    public atnf b() {
        return this.M;
    }

    public void c(atlq atlqVar) {
        this.K = atlqVar.p;
        crqf crqfVar = atlqVar.m;
        this.I = crqfVar.g();
        ab();
        if (!this.n) {
            return;
        }
        atms atmsVar = new atms(this);
        boolean z = false;
        boolean z2 = this.K && crqfVar.d();
        amup j = amux.j(this.s);
        if (z2 && j != null) {
            aa();
        } else {
            this.F = null;
            this.G = null;
            this.E = null;
        }
        amuo amuoVar = this.s;
        boolean z3 = this.K;
        if (z3 && this.I.c) {
            z = true;
        }
        this.J = Z(amuoVar, z, z3);
        if (atmsVar.w().equals(w()) && atmsVar.J().equals(J()) && atmsVar.Q().equals(Q())) {
            return;
        }
        this.M = atmsVar;
        this.O = true;
    }

    public amuo h() {
        return this.s;
    }

    @Override // defpackage.atnf
    @dzsi
    public zcd i() {
        return this.j;
    }

    @Override // defpackage.atnf
    public cqkl j() {
        this.m.t(this.s);
        return cqkl.a;
    }

    @Override // defpackage.atnf
    public Boolean k() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.atnf
    public Boolean l() {
        return Boolean.valueOf(this.K);
    }

    @Override // defpackage.atnf
    public Boolean m() {
        return Boolean.valueOf(this.q != null);
    }

    @Override // defpackage.atnf
    public Maneuvers$Maneuver n() {
        return this.q;
    }

    @Override // defpackage.atnf
    public Boolean o() {
        CharSequence charSequence = this.B;
        boolean z = false;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atnf
    public CharSequence p() {
        return this.B;
    }

    @Override // defpackage.atnf
    public CharSequence q() {
        return this.C;
    }

    @Override // defpackage.atnf
    public String r() {
        return this.s.p.toString();
    }

    @Override // defpackage.atnf
    public CharSequence s() {
        return this.s.s;
    }

    @Override // defpackage.atnf
    public Boolean t() {
        return true;
    }

    @Override // defpackage.atnf
    @dzsi
    public atoa u() {
        return this.t;
    }

    @Override // defpackage.atnf
    public void v() {
        if (this.n) {
            this.M = null;
            this.O = true;
        }
    }

    @Override // defpackage.atnf
    public Boolean w() {
        boolean z = false;
        if (this.D.a != null && this.J && !L().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.atnf
    public int x(int i, boolean z, boolean z2) {
        return A().b(z2, k().booleanValue(), D().booleanValue()) + 48;
    }

    @Override // defpackage.atnf
    public int y() {
        return 0;
    }

    @Override // defpackage.atnf
    @dzsi
    public atnn z() {
        return this.D;
    }

    private final void ab() {
        cray crayVar = this.I;
        dowa dowaVar = crayVar.a.I;
        int i = this.n ? crayVar.e : this.s.k;
        this.B = g(i, dowaVar, this.u, this.k, this.H, this.z, C(), Boolean.valueOf(this.n), this.a);
        this.C = this.k.c(i, dowaVar, true, false);
    }

    public static CharSequence d(Context context, atln atlnVar, amuo amuoVar, atmj atmjVar, boolean z, boolean z2) {
        int i;
        boolean z3 = atmjVar.a;
        if (z) {
            i = z2 ? atmjVar.k.intValue() : atmjVar.c;
        } else {
            i = atmjVar.b;
        }
        atli n = atli.n(context, z3, i, atmjVar.e, atmjVar.f);
        atlnVar.i(amux.j(amuoVar), true, n);
        return n.k().get(0);
    }
}
