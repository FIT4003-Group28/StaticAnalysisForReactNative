package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qjn  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qjn implements qvo {
    private final /* synthetic */ int c;
    public static final /* synthetic */ qjn b = new qjn(2);
    public static final /* synthetic */ qjn a = new qjn();

    private /* synthetic */ qjn() {
    }

    public /* synthetic */ qjn(int i) {
        this.c = i;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            qpu qpuVar = qjz.a;
            qpp qppVar = (qpp) ((qpk) obj).D();
            qppVar.py(19, qppVar.pv());
            ((rvh) obj2).b(true);
        } else if (i == 1) {
            qix qixVar = new qix((rvh) obj2);
            qiw qiwVar = (qiw) ((qiu) obj).D();
            Parcel pv = qiwVar.pv();
            dve.i(pv, qixVar);
            qiwVar.px(3, pv);
        } else if (i == 2) {
            qpu qpuVar2 = qjz.a;
            ((qpp) ((qpk) obj).D()).a();
            ((rvh) obj2).b(null);
        } else if (i == 3) {
            qig qigVar = new qig((rvh) obj2, 5, (int[]) null);
            qkk qkkVar = (qkk) ((qkj) obj).D();
            Parcel pv2 = qkkVar.pv();
            dve.i(pv2, qigVar);
            qkkVar.py(2, pv2);
        } else if (i == 4) {
            rdo rdoVar = new rdo((rvh) obj2);
            rdc rdcVar = (rdc) ((rdm) obj).D();
            Parcel pv3 = rdcVar.pv();
            dve.i(pv3, rdoVar);
            rdcVar.px(1, pv3);
        } else {
            rvn rvnVar = new rvn((rvh) obj2);
            rvt rvtVar = (rvt) ((rvw) obj).D();
            Parcel pv4 = rvtVar.pv();
            dve.i(pv4, rvnVar);
            rvtVar.px(2, pv4);
        }
    }
}
