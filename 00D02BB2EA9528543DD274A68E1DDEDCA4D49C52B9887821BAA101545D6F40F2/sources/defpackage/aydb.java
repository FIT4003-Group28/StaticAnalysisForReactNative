package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aydb  reason: default package */
/* loaded from: classes3.dex */
final class aydb extends cqiw<aydf> {
    private final int a;

    public aydb(int i) {
        super(Integer.valueOf(i));
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cqiw
    public final cqmj<aydf> a() {
        int i;
        int i2;
        cqmj cqmjVar;
        cqmp[] cqmpVarArr = new cqmp[6];
        cqmpVarArr[0] = cqgr.J(true);
        cqmpVarArr[1] = cqgr.cW(acly.a(aycx.a));
        cqmpVarArr[2] = cqgr.aJ(16);
        cqmpVarArr[3] = cqgr.cd(-1);
        cqmp[] cqmpVarArr2 = new cqmp[8];
        cqmpVarArr2[0] = cqgr.bp(-2);
        cqmpVarArr2[1] = cqgr.cd(0);
        cqmpVarArr2[2] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr2[3] = cqgr.bV(cqrp.d(10.0d));
        cqmpVarArr2[4] = cqgr.bD(cqrp.d(10.0d));
        cqmpVarArr2[5] = cqgr.dr(1);
        cqmp[] cqmpVarArr3 = new cqmp[6];
        cqmpVarArr3[0] = cqgr.aT(aydf.a);
        cqmpVarArr3[1] = ibq.f();
        cqmpVarArr3[2] = ibq.x();
        cqmpVarArr3[3] = cqgr.fh(cqrp.f(16.0d));
        int i3 = this.a;
        if (i3 == 0) {
            i = R.string.CREATE_NEW_LIST_PRIVATE;
        } else if (i3 == 1) {
            i = R.string.CREATE_NEW_LIST_SHARED;
        } else if (i3 != 2) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unsupported sharing option ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = R.string.CREATE_NEW_LIST_PUBLIC;
        }
        cqmpVarArr3[4] = cqgr.eL(Integer.valueOf(i));
        cqmpVarArr3[5] = cqgr.eN(5);
        cqmpVarArr2[6] = cqgr.gq(cqmpVarArr3);
        int i4 = this.a;
        if (i4 == 2) {
            cqmm e = caxf.e(ayda.a);
            e.a(ibq.q(), ibq.y(), cqgr.cd(-2), cqgr.eN(5));
            cqmjVar = e;
        } else {
            cqmp[] cqmpVarArr4 = new cqmp[5];
            cqmpVarArr4[0] = ibq.q();
            cqmpVarArr4[1] = ibq.y();
            cqmpVarArr4[2] = cqgr.cd(-2);
            if (i4 == 0) {
                i2 = R.string.CREATE_NEW_LIST_PRIVATE_DETAILS;
            } else if (i4 == 1) {
                i2 = R.string.CREATE_NEW_LIST_SHARED_DETAILS;
            } else if (i4 != 2) {
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unsupported sharing option ");
                sb2.append(i4);
                throw new IllegalArgumentException(sb2.toString());
            } else {
                i2 = R.string.CREATE_NEW_LIST_PUBLIC_DETAILS;
            }
            cqmpVarArr4[3] = cqgr.eL(Integer.valueOf(i2));
            cqmpVarArr4[4] = cqgr.eN(5);
            cqmjVar = cqgr.gq(cqmpVarArr4);
        }
        cqmpVarArr2[7] = cqmjVar;
        cqmpVarArr[4] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[5] = cqgr.gh(cqgr.aS(aycy.a), cqgr.ch(cqrp.d(48.0d)), cqgr.aJ(17), cqgr.I(aycz.a), ibq.H(), cqgr.J(false), cqgr.az(false));
        return cqgr.gd(cqmpVarArr);
    }
}
