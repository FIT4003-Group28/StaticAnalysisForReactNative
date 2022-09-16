package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qbq  reason: default package */
/* loaded from: classes4.dex */
public final class qbq extends dvd implements qbr {
    private final doy a;

    public qbq(doy doyVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.a = doyVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.a.a.q(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public qbq() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }
}
