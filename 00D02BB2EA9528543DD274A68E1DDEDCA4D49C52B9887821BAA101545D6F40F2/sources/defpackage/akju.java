package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: akju  reason: default package */
/* loaded from: classes2.dex */
public final class akju extends cqiw<aklg> {
    public final akkh a;

    public akju(akkh akkhVar) {
        this.a = akkhVar;
    }

    private final cqjb<aklg, Boolean> e() {
        return new cqjb(this) { // from class: akjs
            private final akju a;

            {
                this.a = this;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                aklg aklgVar = (aklg) cqkpVar;
                return Boolean.valueOf(this.a.a == akkh.VERTICAL_LIST_SUB_CARD);
            }
        };
    }

    private final Boolean f() {
        return cqjv.r(cqjv.u(cqjv.v(B().b())), cqjv.u(cqjv.v(B().b().e())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, aklg aklgVar, Context context) {
        aklg aklgVar2 = aklgVar;
        cqiv cqivVar = new cqiv();
        cqss g = aklgVar2.g();
        if (g == null) {
            g = ibm.n();
        }
        cqivVar.f(new akjt(g), aklgVar2.j());
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aklg> a() {
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.bv(3);
        cqmpVarArr[1] = cqgr.bw(48);
        cqmpVarArr[2] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr[3] = cqgr.dr(1);
        cqmpVarArr[4] = cqgr.gq(cqgr.aG(f()), ibq.p(), cqgr.fh(cqrp.f(14.0d)), cqjv.k(cqjv.v(B().g()), cqgr.eU(ibm.p()), cqgr.eU(B().g())), cqgr.dB(cqrp.f(4.0d)), cqjv.p(e(), cqmn.a(cqgr.cB(2), cqgr.dB(cqrp.d(4.0d))), cqmn.a(cqgr.cB(1), cqgr.dB(cqrp.d(2.0d)))), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqjv.k(f(), cqgr.eI(B().b().e()), cqgr.eI("")));
        cqmp[] cqmpVarArr2 = new cqmp[5];
        cqmpVarArr2[0] = cqgr.bv(3);
        cqmpVarArr2[1] = cqgr.dr(0);
        cqmpVarArr2[2] = cqgr.aJ(16);
        cqmpVarArr2[3] = WebImageView.a(cqgr.aD(cqjv.v(B().e())), cqgr.bv(3), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ch(cqrp.d(24.0d)), cqgr.bG(ibn.d()), WebImageView.k(B().e()));
        cqmp[] cqmpVarArr3 = new cqmp[8];
        cqmpVarArr3[0] = cqgr.aD(cqjv.v(B().i()));
        cqmpVarArr3[1] = cqjv.k(cqjv.r(Boolean.valueOf(this.a == akkh.STANDALONE), cqjv.u(f())), ibq.m(), ibq.p());
        cqmpVarArr3[2] = cqgr.fh(cqrp.f(14.0d));
        cqmpVarArr3[3] = cqjv.k(cqjv.v(B().h()), cqgr.eU(ibm.p()), cqgr.eU(B().h()));
        cqmpVarArr3[4] = cqjv.o(e(), cqgr.cB(2), cqgr.cB(1));
        cqmpVarArr3[5] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr3[6] = cqgr.eN(5);
        cqmpVarArr3[7] = cqgr.eI(B().i());
        cqmpVarArr2[4] = cqgr.gq(cqmpVarArr3);
        cqmpVarArr[5] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[6] = cqgr.gd(cqgr.bv(3), cqgr.dr(1), cqjv.k(cqjv.v(B().e()), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dQ(cqrp.d(32.0d))), cqgr.ck(C()));
        return cqgr.gd(cqmpVarArr);
    }
}
