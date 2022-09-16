package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: rsy  reason: default package */
/* loaded from: classes4.dex */
public final class rsy extends rsh {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsy(qsx qsxVar, String str, int i) {
        super(qsxVar);
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qte a(Status status) {
        return new rsx(status);
    }

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        qxl qxlVar;
        rst rstVar = (rst) qsiVar;
        String str = this.a;
        int i = this.b;
        rsq rsqVar = new rsq(this);
        qxl qxlVar2 = null;
        try {
            rsm p = rstVar.p();
            Parcel pv = p.pv();
            dve.i(pv, rsqVar);
            pv.writeString(str);
            pv.writeString(null);
            pv.writeInt(i);
            pv.writeInt(1);
            Parcel pw = p.pw(505, pv);
            IBinder readStrongBinder = pw.readStrongBinder();
            if (readStrongBinder == null) {
                qxlVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                if (queryLocalInterface instanceof qxl) {
                    qxlVar = (qxl) queryLocalInterface;
                } else {
                    qxlVar = new qxl(readStrongBinder);
                }
            }
            pw.recycle();
            qxlVar2 = qxlVar;
        } catch (RemoteException unused) {
            rsqVar.b(8, null, null, null);
        }
        synchronized (this.f) {
            this.j = qxlVar2;
        }
    }
}
