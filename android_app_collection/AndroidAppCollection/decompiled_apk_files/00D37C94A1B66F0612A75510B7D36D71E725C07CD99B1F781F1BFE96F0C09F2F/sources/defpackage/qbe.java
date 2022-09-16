package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
/* compiled from: PG */
/* renamed from: qbe  reason: default package */
/* loaded from: classes4.dex */
public final class qbe extends dvd implements qbf {
    final /* synthetic */ qbh a;

    public qbe() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // defpackage.qbf
    public final void a(AdRequestParcel adRequestParcel) {
        b();
    }

    public final void b() {
        qfl.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        qga.a.post(new qco(this));
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AdRequestParcel adRequestParcel = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
            b();
            parcel2.writeNoException();
        } else if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i == 3) {
            parcel2.writeNoException();
            dve.e(parcel2, false);
        } else if (i == 4) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i != 5) {
            return false;
        } else {
            AdRequestParcel adRequestParcel2 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
            parcel.readInt();
            b();
            parcel2.writeNoException();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbe(qbh qbhVar) {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
        this.a = qbhVar;
    }
}
