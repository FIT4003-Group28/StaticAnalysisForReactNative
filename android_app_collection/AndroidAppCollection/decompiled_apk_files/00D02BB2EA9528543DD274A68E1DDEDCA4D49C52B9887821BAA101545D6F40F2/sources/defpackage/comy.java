package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
/* compiled from: PG */
/* renamed from: comy  reason: default package */
/* loaded from: classes5.dex */
public abstract class comy extends clb implements comz {
    public comy() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((FusedLocationProviderResult) clc.d(parcel, FusedLocationProviderResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            c();
        }
        return true;
    }
}
