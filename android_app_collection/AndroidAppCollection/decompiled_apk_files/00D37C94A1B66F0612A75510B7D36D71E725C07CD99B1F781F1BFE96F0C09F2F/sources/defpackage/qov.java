package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qov  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qov implements qvo {
    public final /* synthetic */ String[] a;
    private final /* synthetic */ int b;

    public /* synthetic */ qov(String[] strArr) {
        this.a = strArr;
    }

    public /* synthetic */ qov(String[] strArr, int i) {
        this.b = i;
        this.a = strArr;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            String[] strArr = this.a;
            qoz qozVar = new qoz((rvh) obj2);
            qps qpsVar = (qps) ((qpb) obj).D();
            Parcel pv = qpsVar.pv();
            dve.i(pv, qozVar);
            pv.writeStringArray(strArr);
            qpsVar.py(7, pv);
        } else if (i == 1) {
            String[] strArr2 = this.a;
            qox qoxVar = new qox((rvh) obj2);
            qps qpsVar2 = (qps) ((qpb) obj).D();
            Parcel pv2 = qpsVar2.pv();
            dve.i(pv2, qoxVar);
            pv2.writeStringArray(strArr2);
            qpsVar2.py(5, pv2);
        } else {
            String[] strArr3 = this.a;
            qoy qoyVar = new qoy((rvh) obj2);
            qps qpsVar3 = (qps) ((qpb) obj).D();
            Parcel pv3 = qpsVar3.pv();
            dve.i(pv3, qoyVar);
            pv3.writeStringArray(strArr3);
            qpsVar3.py(6, pv3);
        }
    }
}
