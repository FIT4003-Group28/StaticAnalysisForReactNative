package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cnv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnv extends clb implements cnw {
    public cnv() {
        super("com.google.android.apps.auto.sdk.nav.state.INavigationStateManager");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        cnu cnuVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                cnuVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.nav.state.INavigationStateCallback");
                if (queryLocalInterface instanceof cnu) {
                    cnuVar = (cnu) queryLocalInterface;
                } else {
                    cnuVar = new cnu(readStrongBinder);
                }
            }
            b(cnuVar);
            return true;
        }
        return false;
    }
}
