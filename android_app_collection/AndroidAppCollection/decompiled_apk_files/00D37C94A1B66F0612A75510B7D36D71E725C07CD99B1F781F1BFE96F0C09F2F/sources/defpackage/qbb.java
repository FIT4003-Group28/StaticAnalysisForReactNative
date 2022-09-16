package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
/* compiled from: PG */
/* renamed from: qbb  reason: default package */
/* loaded from: classes4.dex */
public final class qbb extends dvd implements qbc {
    private final Object a;
    private final qge b;

    public qbb(qge qgeVar, Object obj, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        this.b = qgeVar;
        this.a = obj;
    }

    public qbb() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        if (i == 1) {
            qge qgeVar = this.b;
            if (qgeVar != null && (obj = this.a) != null) {
                doz dozVar = (doz) qgeVar;
                dpb dpbVar = dozVar.a;
                dpbVar.mInterstitialAd = (qgf) obj;
                dpbVar.mInterstitialAd.a(new pzf(dozVar.b));
                dozVar.b.l();
            }
        } else if (i != 2) {
            return false;
        } else {
            AdErrorParcel adErrorParcel = (AdErrorParcel) dve.a(parcel, AdErrorParcel.CREATOR);
            qge qgeVar2 = this.b;
            if (qgeVar2 != null) {
                qgeVar2.a(adErrorParcel.b());
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
