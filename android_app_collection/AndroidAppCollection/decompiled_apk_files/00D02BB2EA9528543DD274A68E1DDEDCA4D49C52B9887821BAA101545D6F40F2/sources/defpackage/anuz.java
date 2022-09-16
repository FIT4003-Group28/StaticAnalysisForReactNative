package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: anuz  reason: default package */
/* loaded from: classes2.dex */
public final class anuz extends cqiw<anvb> {
    public static final /* synthetic */ int a = 0;
    private final boolean b;

    public anuz(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }

    public static dbsg<View> e(@dzsi View view, anzq anzqVar) {
        dcdc r;
        cqjg cqjgVar = apkj.a;
        if (view == null) {
            r = dcdc.e();
        } else {
            ArrayList arrayList = new ArrayList();
            cqhu.d(view, cqjgVar, cqpv.b(arrayList));
            r = dcdc.r(arrayList);
        }
        int size = r.size();
        int i = 0;
        while (i < size) {
            View view2 = (View) r.get(i);
            i++;
            if (cqkx.i(view2) == anzqVar) {
                return dbsg.i(view2);
            }
        }
        return dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anvb> a() {
        cqnf dU;
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.z(irg.a());
        cqmpVarArr[3] = cqgr.P(false);
        cqmpVarArr[4] = cqgr.T(cqrt.l(R.string.YOUR_TIMELINE));
        if (this.b) {
            dU = cqgr.dX(anuw.a);
        } else {
            dU = cqgr.dU(cqrp.d(dcyn.a));
        }
        cqmpVarArr[5] = dU;
        cqmpVarArr[6] = jnq.y(cqgr.aT(aplg.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.fB(cqrp.d(1.0d)), bcrx.a(new anuj()), cqgr.fx(anux.a), cqgr.m6do(anuy.a));
        return cqgr.fY(cqmpVarArr);
    }
}
