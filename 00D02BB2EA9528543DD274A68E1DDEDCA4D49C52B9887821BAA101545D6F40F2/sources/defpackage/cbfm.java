package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.widget.DatePicker;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbfm  reason: default package */
/* loaded from: classes4.dex */
public final class cbfm extends cqiw<cbqm> {
    public static final /* synthetic */ int a = 0;
    private final int b;
    private final int c;
    private final int d;
    private final Long e;

    public cbfm(int i, int i2, int i3, Long l) {
        super(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), l, false);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = l;
    }

    private static cqmn<cbqm> e() {
        return cqmn.a(cqgr.bp(-2), cqgr.cd(-1), ibq.r(), cqgr.eU(ibm.b()), cqgr.aJ(17));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cbqm> a() {
        cqmj cqmhVar;
        cqlc a2 = cqkz.a(ibn.l());
        cqmp[] cqmpVarArr = new cqmp[4];
        cqmpVarArr[0] = cqgr.aR(Integer.valueOf((int) R.id.event_date_picker_dialog_view));
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.cd(-1);
        cqmp[] cqmpVarArr2 = new cqmp[2];
        cqmpVarArr2[0] = cqmp.e;
        cqmp[] cqmpVarArr3 = new cqmp[5];
        cqmpVarArr3[0] = cqgr.dr(1);
        cqmpVarArr3[1] = cqgr.aJ(1);
        cqmpVarArr3[2] = cqgr.gq(cqgr.dz(cqrp.d(24.0d), cqrp.d(12.0d), cqrp.d(24.0d), cqrp.d(dcyn.a)), cqgr.eN(4), ibq.f(), Build.VERSION.SDK_INT < 22 ? cqmn.a(ibq.v()) : cqmn.a(cqgr.z(ibm.w()), cqgr.eU(ibm.b())), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(cbfk.a));
        if (Build.VERSION.SDK_INT < 22) {
            cqmhVar = itj.v(new cqmp[0]);
        } else {
            cqmhVar = new cqmh(DatePicker.class, new cqmp[0]);
        }
        cqmhVar.f(cqgr.bd(cqkz.a(Integer.valueOf(this.b)), cqkz.a(Integer.valueOf(this.c)), cqkz.a(Integer.valueOf(this.d)), cbfl.a), cqjv.j(cqfe.MIN_DATE, this.e));
        cqmpVarArr3[3] = cqmhVar;
        cqmj a3 = hyb.a(e(), cqgr.cW(cqgr.q(cbfj.a)), cqgr.eL(Integer.valueOf((int) R.string.UGC_EVENTS_DATE_PICKER_DONE_BUTTON)));
        a3.f(new cqmp[0]);
        cqmj c = hyb.c(cqgr.aI(cbfg.a), e(), cqgr.eU(ibm.x()), iue.b(cjtd.a(dtyd.c)), cqgr.cW(cqgr.q(cbfh.a)), cqgr.eM(cbfi.a));
        c.f(new cqmp[0]);
        cqmpVarArr3[4] = cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.dQ(cqrp.d(24.0d)), cqgr.dF(cqrp.d(24.0d)), cqgr.dE(cbff.a), a3, c);
        cqmpVarArr2[1] = cqgr.gd(cqmpVarArr3);
        cqmpVarArr[3] = cqgr.gk(cqmpVarArr2);
        return ijc.b(a2, cqmpVarArr);
    }
}
