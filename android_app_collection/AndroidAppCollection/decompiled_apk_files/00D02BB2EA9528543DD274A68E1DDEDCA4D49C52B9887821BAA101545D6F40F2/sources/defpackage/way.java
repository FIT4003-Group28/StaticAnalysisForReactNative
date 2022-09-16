package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: way  reason: default package */
/* loaded from: classes7.dex */
public final class way extends cqiw<zdo> {
    public static final /* synthetic */ int a = 0;

    private static cqmj<zdo> e(cqtd cqtdVar, int i, final cqlc<zdo, Boolean> cqlcVar, cqlc<zdo, View.OnClickListener> cqlcVar2, ddho ddhoVar) {
        cqrp d = cqrp.d(12.0d);
        return cqgr.gc(cqgr.ch(irh.a()), cqgr.dz(d, d, d, d), cqgr.T(cqrt.l(i)), cqgr.fp(new cqlc(cqlcVar) { // from class: wav
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = way.a;
                return ((Boolean) this.a.a((zdo) cqkpVar)).booleanValue() ? irg.g() : irg.m();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eE(cqtdVar), cqjv.l(cqlcVar, cqgr.x(irg.a()), irn.R()), cqgr.cW(cqlcVar2), cqgr.K(new cqlc(cqlcVar) { // from class: waw
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = way.a;
                return Boolean.valueOf(!((Boolean) this.a.a((zdo) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.au(new cqlc(cqlcVar) { // from class: wax
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = way.a;
                return Boolean.valueOf(!((Boolean) this.a.a((zdo) cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.b(cjtd.a(ddhoVar)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zdo> a() {
        return cqgr.fY(cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388613), cqgr.bD(irh.h()), cqgr.bG(irh.g()), cqgr.dr(0), cqgr.x(iri.c()), e(vyt.c, R.string.ACCESSIBILITY_PREVIOUS_NAVIGATION, war.a, cqgr.q(was.a), dtxw.d), iuh.c(new cqmp[0]), e(vyt.b, R.string.ACCESSIBILITY_NEXT_NAVIGATION, wat.a, cqgr.q(wau.a), dtxw.b)));
    }
}
