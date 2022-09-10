package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfge  reason: default package */
/* loaded from: classes3.dex */
public final class bfge extends cqiw<bfgv> {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfge(Object[] objArr, boolean z) {
        super(objArr);
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfgv> a() {
        cqmj f = FiveStarView.f(bffv.a, bffw.a, new cqmp[0]);
        f.g(cqic.c(bffx.a, new cqmp[0]));
        final cqlc cqlcVar = bffy.a;
        final cqlc cqlcVar2 = bffz.a;
        final cqlc cqlcVar3 = new cqlc(cqlcVar) { // from class: bffr
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                bfgv bfgvVar = (bfgv) cqkpVar;
                boolean z = true;
                if (!Float.isNaN(((Float) cqlcVar4.a(bfgvVar)).floatValue()) && ((Float) cqlcVar4.a(bfgvVar)).floatValue() > 0.0f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqmj gd = cqgr.gd(cqgr.bw(16), cqgr.gd(cqic.c(cqlcVar3, new cqmp[0]), cqgr.gq(ibq.p(), ibq.y(), cqgr.bG(cqrp.d(4.0d)), cqgr.eK(cqiq.c("%.1f", cqiq.h(cqlcVar))), cqgr.aW(2)), jfb.a(cqgr.bp(-1), cqgr.cd(-2), cqgr.aJ(17), jfb.f(jfo.d), jfb.c(cqlcVar))), cqgr.gq(cqic.c(new cqlc(cqlcVar2) { // from class: bffs
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = bfgf.b;
                return Boolean.valueOf(((Integer) this.a.a((bfgv) cqkpVar)).intValue() == 0);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), ibq.p(), ibq.y(), cqgr.bR(cqrp.d(4.0d)), cqgr.eK(new cqjb(cqlcVar3, cqlcVar2) { // from class: bfft
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar3;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                bfgv bfgvVar = (bfgv) cqkpVar;
                int i = bfgf.b;
                if (((Boolean) cqlcVar4.a(bfgvVar)).booleanValue()) {
                    return cqiq.f(R.plurals.REVIEW_COUNT_LONG, cqlcVar5, cqiq.h(cqlcVar5)).a(bfgvVar, context);
                }
                return cqiq.f(R.plurals.REVIEW_COUNT_SHORT, cqlcVar5, cqiq.h(cqlcVar5)).a(bfgvVar, context);
            }
        }), cqgr.U(cqiq.f(R.plurals.REVIEW_COUNT_ACCESSIBILITY, cqlcVar2, cqiq.h(cqlcVar2)))), cqgr.gq(cqic.c(new cqlc(cqlcVar2, cqlcVar3) { // from class: bffu
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
                bfgv bfgvVar = (bfgv) cqkpVar;
                int i = bfgf.b;
                boolean z = true;
                if (((Integer) cqlcVar4.a(bfgvVar)).intValue() <= 0 && ((Boolean) cqlcVar5.a(bfgvVar)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.bp(-2), cqgr.eL(Integer.valueOf((int) R.string.REVIEW_COUNT_ZERO)), ibq.p(), ibq.y()));
        gd.g(cqic.f(bfga.a, new cqmp[0]));
        cqmj<bfgv> fY = cqgr.fY(f, gd);
        if (this.a) {
            fY = ect.a(fY);
        }
        final boolean z = this.a;
        fY.f(iue.c(bfgb.a), cqgr.cW(cqgr.q(bfgc.a)), cqgr.K(new cqlc(z) { // from class: bfgd
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                boolean z2 = this.a;
                bfgv bfgvVar = (bfgv) cqkpVar;
                int i = bfge.b;
                boolean z3 = false;
                if (z2 && bfgvVar.d().booleanValue()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        return fY;
    }
}
