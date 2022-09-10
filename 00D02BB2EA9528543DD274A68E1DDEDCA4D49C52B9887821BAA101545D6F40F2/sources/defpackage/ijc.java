package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ijc  reason: default package */
/* loaded from: classes6.dex */
public final class ijc {
    public static <T extends cqkp> cqmn<T> a() {
        return cqmn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.fL(Float.valueOf(1.0f)), cqgr.bw(1), cqgr.aJ(1), o(), cqgr.bD(cqrp.d(14.0d)));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, cqtv> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.aJ(17), cqgr.z(ibm.ab()));
        gd.f(cqmpVarArr);
        return cqgr.gd(p(), cqqx.E(cqgr.cg(cqlcVar), cqgr.bp(-2), cqqx.g(ibn.k()), cqqx.i(ibn.n()), gd));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.aJ(17), cqgr.z(ibm.ab()));
        gd.f(cqmpVarArr);
        return cqgr.gd(p(), cqqx.E(cqgr.ce(ibn.m()), cqgr.bp(-2), cqqx.g(ibn.k()), cqqx.i(ibn.n()), gd));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(@dzsi CharSequence charSequence, cqmp<T>... cqmpVarArr) {
        return e(cqne.b(charSequence), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqjb<T, ? extends CharSequence> cqjbVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.aE(cqjv.w(cqjbVar)), cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(ibn.j()), o(), cqgr.bD(cqrp.d(12.0d)), cqgr.eN(4), ibq.m(), ibq.v(), cqgr.eK(cqjbVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(final cqlc<T, cqsn> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.aE(new cqjb(cqlcVar) { // from class: iix
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqsn cqsnVar = (cqsn) this.a.a(cqkpVar);
                boolean z = true;
                if (cqsnVar != null && !cqjv.v(cqsnVar.a(context)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), cqgr.bp(-2), cqgr.cd(-2), cqgr.bV(ibn.j()), o(), cqgr.bD(cqrp.d(12.0d)), cqgr.eN(4), ibq.m(), ibq.v(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqlc<T, CharSequence> cqlcVar, cqmp<T>... cqmpVarArr) {
        return i(cqlcVar, cqkz.a(null), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> h(cqjb<T, CharSequence> cqjbVar, cqmp<T>... cqmpVarArr) {
        return j(cqjbVar, cqkz.a(null), cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> i(final cqlc<T, CharSequence> cqlcVar, cqlc<T, MovementMethod> cqlcVar2, cqmp<T>... cqmpVarArr) {
        return j(new cqjb(cqlcVar) { // from class: iiy
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (CharSequence) this.a.a(cqkpVar);
            }
        }, cqlcVar2, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> j(cqjb<T, CharSequence> cqjbVar, cqlc<T, MovementMethod> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.aE(cqjv.w(cqjbVar)), cqgr.bp(-2), cqgr.cd(-1), o(), cqgr.bD(cqrp.d(14.0d)), cqgr.eN(4), cqgr.eK(cqjbVar), ibq.p(), ibq.x(), cqgr.cP(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    public static <T extends cqkp> cqmn<T> k(@dzsi CharSequence charSequence, @dzsi cjtd cjtdVar, Boolean bool) {
        return cqmn.a(cqjv.k(bool, cqgr.cd(-2), cqgr.cd(-1)), cqjv.k(bool, cqgr.ca(Float.valueOf(0.0f)), cqgr.ca(Float.valueOf(0.5f))), cqgr.aD(cqjv.v(charSequence)), cqgr.eI(charSequence), iue.b(cjtdVar), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> l(@dzsi CharSequence charSequence, @dzsi cjtd cjtdVar, Boolean bool, cqmp<T>... cqmpVarArr) {
        cqmj<T> a = hyb.a(cqgr.aR(Integer.valueOf((int) R.id.dialog_positive_button)), k(charSequence, cjtdVar, bool));
        a.f(cqmpVarArr);
        return a;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> m(cqmj<T> cqmjVar, cqmp<T>... cqmpVarArr) {
        cqmjVar.f(cqgr.bw(17));
        cqmj<T> fY = cqgr.fY(cqgr.dr(0), a(), cqmjVar);
        fY.f(cqmpVarArr);
        return fY;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> n(final cqlc<T, CharSequence> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cjtd> cqlcVar3, final cqlc<T, CharSequence> cqlcVar4, cqlc<T, View.OnClickListener> cqlcVar5, cqlc<T, cjtd> cqlcVar6, cqmp<T>... cqmpVarArr) {
        cqlc a = cqkz.a(true);
        cqnf cW = cqgr.cW(cqlcVar2);
        cqlc a2 = cqkz.a(true);
        cqnf cW2 = cqgr.cW(cqlcVar5);
        cqlc x = cqjv.x(cqlcVar4);
        cqmp<T>[] cqmpVarArr2 = {cW, cqgr.au(a)};
        cqmj c = hyb.c(cqgr.aR(Integer.valueOf((int) R.id.dialog_negative_button)), q(cqlcVar, cqlcVar3, x));
        c.f(cqmpVarArr2);
        cqmj r = r(cqlcVar4, cqlcVar6, cqjv.x(cqlcVar), cW2, cqgr.au(a2));
        cqmj r2 = r(cqlcVar4, cqlcVar6, cqjv.x(cqlcVar), cW2, cqjv.l(cqjv.x(cqlcVar), cqgr.bD(cqrp.d(dcyn.a)), cqgr.bD(cqrp.d(-4.0d))));
        cqlc cqlcVar7 = new cqlc(cqlcVar4, cqlcVar) { // from class: iiz
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar4;
                this.b = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                cqlc cqlcVar9 = this.b;
                boolean z = false;
                if (((cqju) cqjv.x(cqlcVar8)).a(cqkpVar).booleanValue() && !((cqju) cqjv.x(cqlcVar9)).a(cqkpVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqlc cqlcVar8 = new cqlc(cqlcVar, cqlcVar4) { // from class: ija
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar9 = this.a;
                cqlc cqlcVar10 = this.b;
                boolean z = false;
                if (((cqju) cqjv.x(cqlcVar9)).a(cqkpVar).booleanValue() && !((cqju) cqjv.x(cqlcVar10)).a(cqkpVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqlc cqlcVar9 = new cqlc(cqlcVar4, cqlcVar) { // from class: ijb
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar4;
                this.b = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar10 = this.a;
                cqlc cqlcVar11 = this.b;
                boolean z = false;
                if (!((cqju) cqjv.x(cqlcVar10)).a(cqkpVar).booleanValue() && !((cqju) cqjv.x(cqlcVar11)).a(cqkpVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqmp[] cqmpVarArr3 = {cqgr.aI(cqlcVar7)};
        cqmp[] cqmpVarArr4 = {cqgr.aI(cqlcVar8)};
        cqmp[] cqmpVarArr5 = {cqgr.dr(0), a(), c, cqgr.gm(cqgr.aI(cqlcVar9), cqgr.ce(cqrp.d(8.0d))), r};
        r2.f(cqjv.l(cqlcVar9, cqgr.bD(cqrp.d(-4.0d)), cqgr.bD(cqrp.d(dcyn.a))));
        cqmj<T> fY = cqgr.fY(m(c, cqmpVarArr3), m(r, cqmpVarArr4), jdg.a(cqgr.aI(cqlcVar9), cqgr.gd(cqmpVarArr5), cqgr.gd(cqgr.dr(1), a(), r2, c)));
        fY.f(cqmpVarArr);
        return fY;
    }

    private static <T extends cqkp> cqmn<T> o() {
        return cqmn.a(cqgr.bL(ibn.j()), cqgr.bO(ibn.j()));
    }

    private static <T extends cqkp> cqmn<T> p() {
        cqrp n = ibn.n();
        return cqmn.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.aJ(17), cqgr.dz(n, n, n, n), cqgr.P(false));
    }

    private static <T extends cqkp> cqmn<T> q(cqlc<T, CharSequence> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqlc<T, Boolean> cqlcVar3) {
        return cqmn.a(cqjv.l(cqlcVar3, cqgr.cd(-2), cqgr.cd(-1)), cqjv.l(cqlcVar3, cqgr.ca(Float.valueOf(0.0f)), cqgr.ca(Float.valueOf(0.5f))), cqgr.aF(cqjv.x(cqlcVar)), cqgr.eM(cqlcVar), iue.c(cqlcVar2), cqgr.dQ(ibn.j()), cqgr.dF(ibn.j()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END));
    }

    @SafeVarargs
    private static <T extends cqkp> cqmj<T> r(cqlc<T, CharSequence> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> a = hyb.a(cqgr.aR(Integer.valueOf((int) R.id.dialog_positive_button)), q(cqlcVar, cqlcVar2, cqlcVar3));
        a.f(cqmpVarArr);
        return a;
    }
}
