package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: agke  reason: default package */
/* loaded from: classes2.dex */
public final class agke extends cqiw<agzm> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private final cqjg c;
    private final boolean d;
    private final boolean e;

    public agke(cqjg cqjgVar, boolean z, boolean z2) {
        super(cqjgVar, Boolean.valueOf(z), Boolean.valueOf(z2));
        this.c = cqjgVar;
        this.d = z;
        this.e = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agzm> a() {
        cqmp cqmpVar;
        cqmj fY;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.aT(this.c);
        cqmpVarArr[1] = cqgr.cd(-2);
        cqmpVarArr[2] = cqgr.bp(-2);
        if (this.d) {
            cqmpVar = cqgr.gd(cqgr.aT(a), cqgr.cd(-2), cqgr.bq(irh.a()), cqgr.cL(irh.a()), cqgr.dr(0), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.bR(cqrp.d(4.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.bw(16), cqgr.aJ(16), iue.c(agjq.a), cqgr.cW(cqgr.r(agjv.a)), cqgr.x(irn.G()), cqgr.V(agjw.a), cqgr.gc(cqgr.ch(cqrp.d(26.0d)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eG(agjx.a)), iue.f(cqgr.bR(cqrp.d(4.0d)), ibq.p(), ibq.y(), cqgr.fh(cqrp.f(15.0d)), cqgr.aZ(false), cqgr.eM(agjy.a)));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[3] = cqmpVar;
        if (this.e) {
            cqjg cqjgVar = b;
            int i = true != this.d ? 0 : 4;
            cqrp d = cqrp.d(12.0d);
            fY = cqgr.gc(cqgr.fI(Integer.valueOf(i)), cqgr.aT(cqjgVar), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.dz(d, d, d, d), iue.c(agjz.a), cqgr.cW(cqgr.r(agka.a)), cqgr.x(irn.J()), cqgr.V(agkb.a), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eG(agkc.a));
        } else {
            cqjg cqjgVar2 = b;
            int i2 = true != this.d ? 0 : 4;
            cqmp[] cqmpVarArr2 = {cqgr.ch(cqrp.d(26.0d)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eG(agjt.a)};
            cqmp[] cqmpVarArr3 = {cqgr.bR(cqrp.d(4.0d)), ibq.p(), ibq.y(), cqgr.fh(cqrp.f(15.0d)), cqgr.aZ(false), cqjv.i(jch.SKIP_ANIMATION_WHEN_NOT_VISIBLE, false, jci.a), cqjv.g(jch.COUNT, agju.a, jci.a)};
            cqmh cqmhVar = new cqmh(jci.class, cqmpVarArr3);
            cqmhVar.f(cqmpVarArr3);
            fY = cqgr.fY(cqgr.fI(Integer.valueOf(i2)), cqgr.aT(cqjgVar2), cqgr.cd(-2), cqgr.bq(irh.a()), cqgr.cL(irh.a()), iue.c(agkd.a), cqgr.cW(cqgr.r(agjr.a)), cqgr.V(agjs.a), cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(0), cqgr.dQ(cqrp.d(8.0d)), cqgr.dF(cqrp.d(8.0d)), cqgr.bR(cqrp.d(4.0d)), cqgr.bG(cqrp.d(4.0d)), cqgr.bw(16), cqgr.aJ(16), cqgr.x(cqrt.f(R.drawable.localstream_white_round_button_background)), cqgr.gc(cqmpVarArr2), cqmhVar));
        }
        cqmpVarArr[4] = fY;
        return cqgr.fY(cqmpVarArr);
    }
}
