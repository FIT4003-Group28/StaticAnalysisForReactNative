package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qjs  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qjs implements qvo {
    public final /* synthetic */ qjz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    private final /* synthetic */ int d;

    public /* synthetic */ qjs(qjz qjzVar, String str, String str2) {
        this.a = qjzVar;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ qjs(qjz qjzVar, String str, String str2, int i) {
        this.d = i;
        this.a = qjzVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.qvo
    public final void a(Object obj, Object obj2) {
        if (this.d == 0) {
            qjz qjzVar = this.a;
            String str = this.b;
            String str2 = this.c;
            qpk qpkVar = (qpk) obj;
            long incrementAndGet = qjzVar.g.incrementAndGet();
            qjzVar.f();
            try {
                qjzVar.r.put(Long.valueOf(incrementAndGet), obj2);
                qpp qppVar = (qpp) qpkVar.D();
                Parcel pv = qppVar.pv();
                pv.writeString(str);
                pv.writeString(str2);
                pv.writeLong(incrementAndGet);
                qppVar.py(9, pv);
                return;
            } catch (RemoteException e) {
                qjzVar.r.remove(Long.valueOf(incrementAndGet));
                ((rvh) obj2).a(e);
                return;
            }
        }
        qjz qjzVar2 = this.a;
        String str3 = this.b;
        String str4 = this.c;
        qjzVar2.f();
        qpp qppVar2 = (qpp) ((qpk) obj).D();
        Parcel pv2 = qppVar2.pv();
        pv2.writeString(str3);
        pv2.writeString(str4);
        dve.g(pv2, null);
        qppVar2.py(14, pv2);
        qjzVar2.h((rvh) obj2);
    }
}
