package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akij  reason: default package */
/* loaded from: classes2.dex */
public abstract class akij extends cqiw<akld> {
    private static final cqrp a = cqrp.d(32.0d);
    private final akgn<akld> b;
    private final diii c;

    public akij(akgn<akld> akgnVar, diii diiiVar, Object... objArr) {
        super(akgnVar.getClass(), diiiVar, objArr);
        this.b = akgnVar;
        this.c = diiiVar;
    }

    private final cqmp<akld> f() {
        return cqmn.a(cqgr.cd(-1), cqgr.bp(-2), iue.b(B().a()), k(false));
    }

    private final cqmj<akld> h() {
        return cqgr.gq(cqgr.aD(cqjv.v(B().d())), cqgr.bV(akhn.a), cqgr.bR(akhn.a), cqgr.bG(akhn.a), ibq.m(), ibq.v(), cqgr.eN(5), cqgr.eI(B().d()));
    }

    private final cqmj<akld> i() {
        return cqgr.gq(cqgr.aD(cqjv.v(B().g())), cqgr.bR(akhn.a), cqgr.bG(akhn.a), cqgr.dU(cqrp.f(3.0d)), cqgr.co(cqrp.f(3.0d), false), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), ibq.x(), cqgr.eN(5), cqgr.eI(B().g()));
    }

    private final cqmj<akld> j(@dzsi jic jicVar, diii diiiVar, cqtv cqtvVar) {
        cqnf ei;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqic.d(cqjv.r(cqjv.u(cqjv.v(B().h())), Boolean.valueOf(this.c != diii.UNKNOWN_ALIGNMENT)), new cqmp[0]);
        cqmpVarArr[1] = k(true);
        cqmpVarArr[2] = cqgr.cd(-1);
        cqmpVarArr[3] = cqgr.cu(cqtvVar);
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = WebImageView.k(jicVar);
        cqmpVarArr2[1] = cqgr.cd(-1);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = cqgr.bw(48);
        cqmpVarArr2[4] = cqgr.k(true);
        cqmpVarArr2[5] = cqgr.cu(cqtvVar);
        int ordinal = diiiVar.ordinal();
        if (ordinal == 1) {
            ei = cqgr.ei(ImageView.ScaleType.FIT_CENTER);
        } else if (ordinal == 2) {
            ei = cqgr.ei(ImageView.ScaleType.FIT_START);
        } else if (ordinal == 3) {
            ei = cqgr.ei(ImageView.ScaleType.FIT_END);
        } else {
            ei = cqgr.ei(ImageView.ScaleType.CENTER_CROP);
        }
        cqmpVarArr2[6] = ei;
        cqmpVarArr[4] = WebImageView.a(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }

    private static cqmp<akld> k(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        return cqmn.a(cqgr.L(valueOf), cqgr.P(valueOf), cqgr.M(valueOf));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<akld> a() {
        if (this.c != diii.FULL_WIDTH_NO_CROP) {
            return this.b.a(f(), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), k(false), j(B().h(), this.c, a), h(), i(), e()));
        }
        return this.b.a(f(), j(B().h(), this.c, cqrp.d(128.0d)), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(a), cqgr.bR(akhn.a), cqgr.bG(akhn.a), cqgr.x(irg.a()), k(false), h(), i(), e()));
    }

    protected abstract cqmj<akld> e();
}
