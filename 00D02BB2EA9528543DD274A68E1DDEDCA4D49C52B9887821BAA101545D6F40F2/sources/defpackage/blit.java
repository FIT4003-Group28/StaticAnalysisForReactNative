package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: blit  reason: default package */
/* loaded from: classes3.dex */
public final class blit extends cqiw<bliy> {
    public static final /* synthetic */ int b = 0;
    private static final cqtv c = ibn.b();
    private static final cqtv d = cqrp.d(16.0d);
    public final boolean a;
    private final boolean e;
    private final int f;
    private final boolean g;

    public blit(boolean z, int i, boolean z2, boolean z3) {
        super(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2));
        this.e = z;
        this.f = i;
        this.g = z2;
        this.a = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bliy> a() {
        cqmp cqmpVar;
        cqmp cqmpVar2;
        cqtv cqtvVar = c;
        cqmj a = WebImageView.a(cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.bw(16), WebImageView.l(blil.a), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
        cqtv cqtvVar2 = d;
        Float valueOf = Float.valueOf(1.0f);
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.bG(cqrp.d(16.0d)), cqgr.ca(valueOf), cqgr.gd(cqgr.dr(0), a, cqgr.gq(cqgr.bR(cqtvVar2), cqgr.ca(valueOf), cqgr.cB(3), cqgr.eM(blim.a), cqgr.bw(16), ibq.p(), cqgr.eN(5))), cqgr.gq(cqgr.aF(new cqlc(this) { // from class: blin
            private final blit a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                blit blitVar = this.a;
                boolean z = true;
                if (!cqjv.v(((bliy) cqkpVar).b()).booleanValue() && blitVar.a) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bR(cqsg.d(cqtvVar, cqtvVar2)), cqgr.cd(-2), cqgr.bV(cqrp.d(4.0d)), ibq.q(), cqgr.eM(blio.a), cqgr.V(blip.a)));
        if (this.g) {
            cqmpVar = cqgr.gc(cqgr.bw(16), cqgr.ce(irh.r()), cqgr.bG(cqrp.d(16.0d)), cqgr.fm(irg.k()), cqgr.eE(iut.a(cqrt.f(2131231710))));
        } else {
            cqmpVar = cqmp.e;
        }
        if (this.e) {
            cqmpVar2 = cqgr.fP(ict.p(false, new cqmp[0]), bliq.a, new cqmp[0]);
        } else {
            cqmpVar2 = cqmp.e;
        }
        return cqgr.gd(cqgr.dr(1), cqmpVar2, cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(cqrp.d(16.0d)), cqgr.dU(cqrp.d(this.f)), cqgr.dB(cqrp.d(this.f)), cqgr.x(irn.G()), cqgr.J(true), iue.c(blir.a), cqgr.cW(cqgr.q(blis.a)), gd, cqmpVar));
    }
}
