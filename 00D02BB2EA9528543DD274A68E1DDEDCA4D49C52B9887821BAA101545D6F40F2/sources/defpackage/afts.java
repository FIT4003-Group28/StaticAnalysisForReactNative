package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: afts  reason: default package */
/* loaded from: classes2.dex */
public final class afts {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqlc<T, cqtd> cqlcVar, cqlc<T, CharSequence> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, CharSequence> cqlcVar4, cqlc<T, Boolean> cqlcVar5, cqlc<T, Boolean> cqlcVar6, cqlc<T, View.OnClickListener> cqlcVar7, cqlc<T, Boolean> cqlcVar8, cqlc<T, cjtd> cqlcVar9, cqmp<T>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = {cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(16), cqgr.dF(cqrp.d(16.0d)), f(cqlcVar, cqlcVar5, cqlcVar6, new cqmp[0])};
        cqmp[] cqmpVarArr3 = {ibq.n(), c(cqlcVar5, cqlcVar6)};
        cqmj e = e(cqlcVar4, cqkz.a(false), ibq.q(), d(cqlcVar5, cqlcVar6));
        e.f(new cqmp[0]);
        cqmj gd = cqgr.gd(cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.bp(-2), cqgr.dr(1), cqgr.bw(8388627), e(cqlcVar2, cqlcVar3, cqmpVarArr3), e);
        gd.f(new cqmp[0]);
        cqmj<T> b = b(cqlcVar7, cqlcVar8, cqlcVar9, cqgr.cd(-1), cqgr.bp(-2), cqgr.fY(cqmpVarArr2), gd);
        b.f(cqmpVarArr);
        return b;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, Boolean> cqlcVar2, cqlc<T, cjtd> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.cH(cqrp.d(48.0d)), cqgr.cd(-1), cqgr.cW(cqlcVar), cqgr.K(cqlcVar2), cqgr.az(true), iue.c(cqlcVar3), cqgr.x(irn.G()));
        gd.f(cqmpVarArr);
        return gd;
    }

    public static <T extends cqkp> cqnf<T> c(final cqlc<T, Boolean> cqlcVar, final cqlc<T, Boolean> cqlcVar2) {
        return cqgr.eW(new cqlc(cqlcVar, cqlcVar2) { // from class: aftj
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cqlc cqlcVar4 = this.b;
                if (((Boolean) cqlcVar3.a(cqkpVar)).booleanValue()) {
                    return ((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() ? ibm.x() : ibm.p();
                }
                return ibm.j();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> d(final cqlc<T, Boolean> cqlcVar, final cqlc<T, Boolean> cqlcVar2) {
        return cqgr.eW(new cqlc(cqlcVar, cqlcVar2) { // from class: aftk
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cqlc cqlcVar4 = this.b;
                if (((Boolean) cqlcVar3.a(cqkpVar)).booleanValue()) {
                    return ((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() ? ibm.x() : ibm.n();
                }
                return ibm.j();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, CharSequence> cqlcVar, final cqlc<T, Boolean> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.eC(new cqlc(cqlcVar2) { // from class: aftl
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(!((Boolean) ((cqlb) this.a).a).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cD(new cqlc(cqlcVar2) { // from class: aftm
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = 1;
                if (true == ((Boolean) ((cqlb) this.a).a).booleanValue()) {
                    i = 2;
                }
                return Integer.valueOf(i);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqlc<T, cqtd> cqlcVar, final cqlc<T, Boolean> cqlcVar2, final cqlc<T, Boolean> cqlcVar3, cqmp<T>... cqmpVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.ce(cqrp.d(20.0d)), cqgr.bq(cqrp.d(20.0d)), cqgr.fn(new cqlc(cqlcVar2, cqlcVar3) { // from class: afto
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar2;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                if (((Boolean) cqlcVar4.a(cqkpVar)).booleanValue()) {
                    return ((Boolean) cqlcVar5.a(cqkpVar)).booleanValue() ? ibm.x() : ibm.o();
                }
                return ibm.j();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eG(cqlcVar));
        gc.f(cqmpVarArr);
        return gc;
    }

    public static <T extends cqkp> cqmj<T> g(cqtv cqtvVar, cqtv cqtvVar2) {
        return cqgr.fY(cqgr.dQ(cqtvVar), cqgr.dU(cqtvVar2), cqgr.dB(cqtvVar2), cqgr.aW(2), itj.t(cqgr.z(ibm.i()), cqgr.bq(cqrp.d(1.0d))));
    }
}
