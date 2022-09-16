package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qen  reason: default package */
/* loaded from: classes4.dex */
public abstract class qen extends dvd implements qeo {
    public qen() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            qeq a = a(parcel.readString());
            parcel2.writeNoException();
            dve.i(parcel2, a);
        } else if (i == 2) {
            boolean d = d(parcel.readString());
            parcel2.writeNoException();
            dve.e(parcel2, d);
        } else if (i == 3) {
            qfj b = b(parcel.readString());
            parcel2.writeNoException();
            dve.i(parcel2, b);
        } else if (i != 4) {
            return false;
        } else {
            boolean c = c(parcel.readString());
            parcel2.writeNoException();
            dve.e(parcel2, c);
        }
        return true;
    }
}
