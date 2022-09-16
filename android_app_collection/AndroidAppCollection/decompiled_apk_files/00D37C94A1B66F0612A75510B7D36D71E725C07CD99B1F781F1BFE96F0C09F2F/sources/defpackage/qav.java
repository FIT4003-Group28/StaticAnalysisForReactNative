package defpackage;

import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qav  reason: default package */
/* loaded from: classes4.dex */
public final class qav extends dvd implements qaw {
    private final doy a;

    public qav(doy doyVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.a = doyVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.a.a();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public qav() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }
}
