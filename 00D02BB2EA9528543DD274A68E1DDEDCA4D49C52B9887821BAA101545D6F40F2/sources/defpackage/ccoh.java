package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccoh  reason: default package */
/* loaded from: classes4.dex */
public final class ccoh extends cqiw<ccxe> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccxe> a() {
        cqmj c = ccra.c(cqmn.a(cqgr.eJ(cqrt.l(R.string.OFFERING_ADD_DISH_PAGE_TITLE))), cqmn.a(cqgr.cW(cqgr.q(ccny.a)), itj.i(dtxx.T), cqgr.eE(cqrt.g(2131231591, ibm.t())), cqgr.S(Integer.valueOf((int) R.string.OFFERING_ANNOTATION_TALKBACK_CLOSE))), cqmn.a(cqgr.fI(8)), ccnz.a);
        cqmj d = ccra.d(hyb.a(cqgr.cd(-1), cqgr.cW(cqgr.q(ccoa.a)), itj.i(dtxx.Y), cqgr.au(ccob.a), cqgr.eJ(cqrt.l(R.string.OFFERING_ADD_POST_BUTTON))));
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-1);
        ccty cctyVar = new ccty();
        cctyVar.a = true;
        cctyVar.b = false;
        cctyVar.c = cqrp.d(188.0d);
        String str = cctyVar.a == null ? " useItemPadding" : "";
        if (cctyVar.b == null) {
            str = str.concat(" isReadOnly");
        }
        if (cctyVar.c == null) {
            str = String.valueOf(str).concat(" height");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        cqmpVarArr[3] = cqgr.fP(new ccum(new cctz(cctyVar.a.booleanValue(), cctyVar.b.booleanValue(), cctyVar.c)), ccoc.a, new cqmp[0]);
        cqmpVarArr[4] = ict.n(false, cqgr.bm(ccod.a));
        cqmpVarArr[5] = ccra.n(cqkz.a(null), cqkz.a(cqrt.l(R.string.OFFERING_DISH_NAME_ENTRY_HINT)), ccoe.a, null, cqkz.a(true), cqmn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(24.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.y(ccof.a), ccra.f()), cqmn.a(itj.i(dtxx.U), cqgr.cW(cqgr.q(ccog.a)), ccra.b()));
        cqmpVarArr[6] = cqgr.gq(cqgr.cd(-1), cqgr.ca(Float.valueOf(1.0f)), cqgr.aJ(80), ccra.f(), cqgr.eN(4), ibq.q(), cqgr.eL(Integer.valueOf((int) R.string.POSTING_PUBLICLY)));
        cqmj gd = cqgr.gd(cqmpVarArr);
        c.f(cqgr.bY(cqjd.i()));
        cqjd[] cqjdVarArr = {cqjd.v(c), cqjd.x(d)};
        gd.f(cqgr.dB(ibn.f()));
        cqmp[] cqmpVarArr2 = {cqgr.bY(cqjdVarArr), cqgr.cd(-1), cqgr.bp(-1), cqgr.av(true), gd};
        d.f(cqgr.bY(cqjd.j()));
        return cqgr.gj(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.b()), c, cqgr.gk(cqmpVarArr2), d);
    }
}
