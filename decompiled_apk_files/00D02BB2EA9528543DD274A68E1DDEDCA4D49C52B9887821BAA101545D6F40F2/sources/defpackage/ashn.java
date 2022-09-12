package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ashn  reason: default package */
/* loaded from: classes2.dex */
public final class ashn extends cqiw<asho> {
    public static final /* synthetic */ int a = 0;
    private final boolean b;

    public ashn() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<asho> a() {
        cqmp gc;
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.aR(Integer.valueOf((int) R.id.navigation_microphone));
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-1);
        cqmpVarArr[3] = cqgr.J(true);
        cqmpVarArr[4] = cqgr.cW(cqgr.q(ashi.a));
        cqmpVarArr[5] = itj.i(dtxw.aj);
        cqmpVarArr[6] = cqgr.V(ashj.a);
        if (this.b) {
            gc = cqmp.e;
        } else {
            gc = cqgr.gc(cqgr.ci(ashk.a), cqgr.bw(17), cqjv.o(cqhg.a, cqgr.eE(irm.v), cqgr.eE(irm.y)), cqgr.v(2131231621));
        }
        cqmpVarArr[7] = gc;
        cqmpVarArr[8] = new cqmh(cpwy.class, cqgr.ch(cqrp.d(31.0d)), cqgr.bw(17), new ashm());
        return cqgr.fY(cqmpVarArr);
    }

    public ashn(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }
}
