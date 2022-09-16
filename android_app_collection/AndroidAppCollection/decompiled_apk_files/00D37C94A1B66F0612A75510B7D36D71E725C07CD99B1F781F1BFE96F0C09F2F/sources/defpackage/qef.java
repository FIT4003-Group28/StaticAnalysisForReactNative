package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qef  reason: default package */
/* loaded from: classes4.dex */
public final class qef extends dvc implements IInterface {
    public qef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final qcg a() {
        qcg qceVar;
        Parcel pw = pw(11, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qceVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof qcg) {
                qceVar = (qcg) queryLocalInterface;
            } else {
                qceVar = new qce(readStrongBinder);
            }
        }
        pw.recycle();
        return qceVar;
    }

    public final qdk f() {
        qdk qdkVar;
        Parcel pw = pw(14, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            qdkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof qdk) {
                qdkVar = (qdk) queryLocalInterface;
            } else {
                qdkVar = new qdk(readStrongBinder);
            }
        }
        pw.recycle();
        return qdkVar;
    }
}
