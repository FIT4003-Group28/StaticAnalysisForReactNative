package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
/* compiled from: PG */
/* renamed from: rgl  reason: default package */
/* loaded from: classes4.dex */
public abstract class rgl extends dvd implements rgm {
    public rgl() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((FusedLocationProviderResult) dve.a(parcel, FusedLocationProviderResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            b();
        }
        return true;
    }
}
