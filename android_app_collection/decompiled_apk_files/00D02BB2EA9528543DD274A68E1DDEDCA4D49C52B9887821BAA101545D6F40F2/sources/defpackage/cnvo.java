package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionInfo;
/* compiled from: PG */
/* renamed from: cnvo  reason: default package */
/* loaded from: classes.dex */
public abstract class cnvo extends clb implements cnvp {
    public cnvo() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b(parcel.readInt(), parcel.readStrongBinder(), (Bundle) clc.d(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) clc.d(parcel, Bundle.CREATOR);
            d();
        } else if (i != 3) {
            return false;
        } else {
            c(parcel.readInt(), parcel.readStrongBinder(), (ConnectionInfo) clc.d(parcel, ConnectionInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
