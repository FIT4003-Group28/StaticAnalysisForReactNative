package defpackage;

import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: abir  reason: default package */
/* loaded from: classes2.dex */
public abstract class abir extends cqiw<abom> {
    public static final cqtv a = cqrp.d(2.0d);
    public static final cqtv b = cqrp.d(40.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cqmj<abom> e() {
        return cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.eN(4), cqgr.cB(1), cqgr.eM(abip.a), ibq.q(), ibq.y(), iue.c(abiq.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cqmj<abom> f(final cqlc<abom, cqtv> cqlcVar, cqlc<abom, jic> cqlcVar2) {
        cqtv cqtvVar = a;
        return cqgr.fY(cqic.c(cqjv.x(cqlcVar2), new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(1), cqgr.bX(new cqlc(cqlcVar) { // from class: abin
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                abom abomVar = (abom) cqkpVar;
                return cqsg.g((cqtv) ((cqlb) this.a).a, cqsg.d(cqsg.f(abir.b, Float.valueOf(0.5f)), abir.a));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dz(cqtvVar, cqtvVar, cqtvVar, cqtvVar), cqgr.x(cqtt.g(ibm.b())), WebImageView.e(cqlcVar2, new cqmp[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cqmj<abom> g(cqmp<abom>... cqmpVarArr) {
        cqmj<abom> gd = cqgr.gd(cqgr.bp(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.dU(cqrp.d(22.0d)), cqgr.dB(cqrp.d(14.0d)), cqgr.dQ(cqrp.d(16.0d)), cqgr.dF(cqrp.d(16.0d)), cqgr.dr(1), cqgr.P(false));
        gd.f(cqmpVarArr);
        return gd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cqmj<abom> h(cqmp<abom>... cqmpVarArr) {
        cqmj<abom> gq = cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.bD(cqrp.d(2.0d)), cqgr.eN(4), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(abio.a), cqgr.cB(2), ibq.m(), ibq.v());
        gq.f(cqmpVarArr);
        return gq;
    }
}
