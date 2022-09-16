package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qed  reason: default package */
/* loaded from: classes4.dex */
public final class qed extends dvd implements qee {
    private final dpa a;

    public qed() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qef qefVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                qefVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                if (queryLocalInterface instanceof qef) {
                    qefVar = (qef) queryLocalInterface;
                } else {
                    qefVar = new qef(readStrongBinder);
                }
            }
            dpa dpaVar = this.a;
            dpaVar.b.a(dpaVar.a, new qgs(new qeg(qefVar), null));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public qed(dpa dpaVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.a = dpaVar;
    }
}
