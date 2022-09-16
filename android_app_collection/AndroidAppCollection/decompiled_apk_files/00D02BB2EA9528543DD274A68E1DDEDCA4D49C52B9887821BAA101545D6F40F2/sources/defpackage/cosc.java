package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cosc  reason: default package */
/* loaded from: classes5.dex */
public abstract class cosc extends clb implements cosd {
    public cosc() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Bundle) clc.d(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
