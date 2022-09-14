package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: PG */
/* renamed from: cone  reason: default package */
/* loaded from: classes5.dex */
public abstract class cone extends clb implements conf {
    public cone() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((LocationSettingsResult) clc.d(parcel, LocationSettingsResult.CREATOR));
            return true;
        }
        return false;
    }
}
