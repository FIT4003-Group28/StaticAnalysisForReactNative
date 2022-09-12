package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wmb  reason: default package */
/* loaded from: classes7.dex */
public final class wmb {
    public static final /* synthetic */ int a = 0;
    private static final cqss b = ibm.p();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends wpv> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = acnm.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.bv(3), wnm.c(cqgr.bD(cqrp.d(2.0d))), wnm.d(wkw.a, cqgr.cH(cqrp.d(20.0d))));
        a2.f(cqmpVarArr);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static <T extends wpv> cqmj<T> b(boolean z, cqlc<T, Boolean> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = acnm.a(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.cH(cqrp.f(16.0d)), cqgr.bV(cqrp.d(4.0d)));
        if (z) {
            a2.f(wnm.h(wlh.a, cqgr.ce(cqrp.f(16.0d)), cqgr.bG(cqrp.d(4.0d)), iue.c(wls.a)));
        }
        a2.f(wng.b(c(), d(), e(), f(), wng.a(m(cqgr.eR(wlg.a)), wli.a), k(cqlcVar), l(cqlcVar)));
        a2.f(cqmpVarArr);
        return a2;
    }

    public static <T extends wpl> wnf<T> c() {
        cqss cqssVar = b;
        cqhc a2 = cqhc.a();
        a2.d(wme.a, cqgr.eU(xje.a));
        a2.d(wmf.a, cqgr.eU(xje.b));
        a2.d(wmg.a, cqgr.eU(xje.c));
        return wng.a(m(cqgr.eR(wlt.a), cqgr.fk(wlu.a), a2.b(cqgr.eU(cqssVar))), wlv.a);
    }

    public static <T extends wpl> wnf<T> d() {
        return wng.a(m(cqgr.eK(vlh.l(wlw.a)), wmj.a(b), wmj.c(), itj.o(wlx.a), cqgr.aI(wly.a)), wlz.a);
    }

    public static <T extends wpl> wnf<T> e() {
        cqlc cqlcVar = wkx.a;
        return wng.a(m(cqgr.eK(new wma()), wmj.a(b), wmj.c(), cqgr.aI(cqlcVar)), cqlcVar);
    }

    public static <T extends wpl> wnf<T> f() {
        cqlc cqlcVar = wky.a;
        return wng.a(m(cqgr.eM(wkz.a), cqgr.aI(cqlcVar), wmj.b(b)), cqlcVar);
    }

    @dzsi
    public static CharSequence g(@dzsi String str, Resources resources) {
        if (dbsj.d(str)) {
            return null;
        }
        return resources.getString(R.string.TRANSIT_DETAILS_SIGNAGE_GUIDANCE_INSTRUCTION, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static cqmj<wpv> h(cqmp<wpv>... cqmpVarArr) {
        cqmj<wpv> gq = cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), ibq.p(), ibq.y(), cqgr.eQ(wla.a), cqgr.U(wlb.a), wmj.b(b));
        gq.f(cqmpVarArr);
        return gq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static cqmj<wpv> i(cqmp<wpv>... cqmpVarArr) {
        cqmj<wpv> gq = cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), ibq.p(), ibq.y(), cqgr.eQ(wlc.a), cqgr.U(wlc.a), wmj.b(b));
        gq.f(cqmpVarArr);
        return gq;
    }

    public static String j(wpv wpvVar, String str) {
        return TextUtils.join(str, dcbg.b(dchl.b(wpvVar.r(), wpvVar.C())).o(wld.a).s(wle.a).o(dbst.a(wlf.a)));
    }

    public static <T extends wpl> wnf<T> k(final cqlc<T, Boolean> cqlcVar) {
        return wng.a(wnm.e(cqgr.aI(new cqlc(cqlcVar) { // from class: wlj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                wpl wplVar = (wpl) cqkpVar;
                int i = wmb.a;
                boolean z = false;
                if (wplVar.s().booleanValue() && ((Boolean) cqlcVar2.a(wplVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), new cqlc(cqlcVar) { // from class: wlk
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                wpl wplVar = (wpl) cqkpVar;
                int i = wmb.a;
                boolean z = false;
                if (wplVar.s().booleanValue() && ((Boolean) cqlcVar2.a(wplVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends wpl> wnf<T> l(final cqlc<T, Boolean> cqlcVar) {
        return wng.a(wnm.f(wll.a, cqgr.V(wlm.a), cqgr.ce(cqrp.d(22.0d)), iue.c(wln.a), cqgr.aI(new cqlc(cqlcVar) { // from class: wlo
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                wpl wplVar = (wpl) cqkpVar;
                int i = wmb.a;
                boolean z = false;
                if (wplVar.u().booleanValue() && ((Boolean) cqlcVar2.a(wplVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), new cqlc(cqlcVar) { // from class: wlp
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                wpl wplVar = (wpl) cqkpVar;
                int i = wmb.a;
                boolean z = false;
                if (wplVar.u().booleanValue() && ((Boolean) cqlcVar2.a(wplVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> m(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(16), ibq.p(), ibq.y(), ibq.z());
        gq.f(cqmpVarArr);
        return gq;
    }

    public static Boolean n(@dzsi CharSequence charSequence) {
        return Boolean.valueOf(!cqjv.v(charSequence).booleanValue());
    }

    public static boolean o(cqmj<?> cqmjVar) {
        return (cqmjVar instanceof cqmh) && ((cqmh) cqmjVar).a == TextView.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> p(cqmp<T>... cqmpVarArr) {
        cqmj<T> a2 = jkr.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(4), ibq.f(), cqgr.fh(cqrp.f(12.0d)), ibq.y());
        a2.f(cqmpVarArr);
        return a2;
    }

    public static <T extends xkc> cqnf<T> q() {
        return cqgr.j(wlq.a);
    }

    public static <T extends xkc> cqnf<T> r() {
        return cqgr.y(wlr.a);
    }
}
