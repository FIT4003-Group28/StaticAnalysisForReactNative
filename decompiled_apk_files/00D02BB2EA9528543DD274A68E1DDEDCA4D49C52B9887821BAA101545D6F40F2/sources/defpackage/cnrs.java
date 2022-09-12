package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnrs  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnrs extends clb implements cnrt {
    public cnrs() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public static cnrt asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof cnrt) {
            return (cnrt) queryLocalInterface;
        }
        return new cnrr(iBinder);
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
