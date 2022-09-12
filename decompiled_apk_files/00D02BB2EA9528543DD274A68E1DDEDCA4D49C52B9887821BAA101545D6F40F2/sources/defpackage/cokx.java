package defpackage;

import android.location.Location;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cokx  reason: default package */
/* loaded from: classes5.dex */
public abstract class cokx extends clb implements coky {
    public cokx() {
        super("com.google.android.gms.location.ILocationListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            e((Location) clc.d(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
