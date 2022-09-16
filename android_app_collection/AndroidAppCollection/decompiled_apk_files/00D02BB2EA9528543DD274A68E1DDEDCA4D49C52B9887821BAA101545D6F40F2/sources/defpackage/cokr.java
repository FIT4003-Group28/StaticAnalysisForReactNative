package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.DeviceOrientation;
/* compiled from: PG */
/* renamed from: cokr  reason: default package */
/* loaded from: classes5.dex */
public abstract class cokr extends clb implements coks {
    public cokr() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            e((DeviceOrientation) clc.d(parcel, DeviceOrientation.CREATOR));
            return true;
        }
        return false;
    }
}
