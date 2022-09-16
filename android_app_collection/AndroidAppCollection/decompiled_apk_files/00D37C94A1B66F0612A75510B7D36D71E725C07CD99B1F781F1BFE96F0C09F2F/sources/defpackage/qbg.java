package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
/* compiled from: PG */
/* renamed from: qbg  reason: default package */
/* loaded from: classes4.dex */
public final class qbg extends dvc implements qbi {
    public qbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.qbi
    public final qbf a() {
        qbf qbdVar;
        Parcel pw = pw(1, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qbdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof qbf) {
                qbdVar = (qbf) queryLocalInterface;
            } else {
                qbdVar = new qbd(readStrongBinder);
            }
        }
        pw.recycle();
        return qbdVar;
    }

    @Override // defpackage.qbi
    public final void f(String str, qea qeaVar, qdx qdxVar) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.i(pv, qeaVar);
        dve.i(pv, qdxVar);
        px(5, pv);
    }

    @Override // defpackage.qbi
    public final void g(qee qeeVar) {
        Parcel pv = pv();
        dve.i(pv, qeeVar);
        px(10, pv);
    }

    @Override // defpackage.qbi
    public final void h(qaz qazVar) {
        Parcel pv = pv();
        dve.i(pv, qazVar);
        px(2, pv);
    }

    @Override // defpackage.qbi
    public final void i(NativeAdOptionsParcel nativeAdOptionsParcel) {
        Parcel pv = pv();
        dve.g(pv, nativeAdOptionsParcel);
        px(6, pv);
    }
}
