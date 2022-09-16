package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
/* compiled from: PG */
/* renamed from: qbv  reason: default package */
/* loaded from: classes4.dex */
public final class qbv extends dvd implements qbw {
    private final pzf a;

    public qbv(pzf pzfVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.a = pzfVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AdErrorParcel adErrorParcel = (AdErrorParcel) dve.a(parcel, AdErrorParcel.CREATOR);
            if (this.a != null) {
                adErrorParcel.a();
            }
        } else if (i == 2) {
            pzf pzfVar = this.a;
            if (pzfVar != null) {
                pzfVar.a.o();
            }
        } else if (i == 3) {
            pzf pzfVar2 = this.a;
            if (pzfVar2 != null) {
                pzfVar2.a.e();
            }
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public qbv() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
