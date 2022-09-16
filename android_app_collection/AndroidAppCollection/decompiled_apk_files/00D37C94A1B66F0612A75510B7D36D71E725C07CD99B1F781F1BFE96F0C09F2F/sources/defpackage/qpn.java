package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qpn  reason: default package */
/* loaded from: classes4.dex */
public abstract class qpn extends dvd implements qpo {
    public qpn() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Bundle) dve.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
