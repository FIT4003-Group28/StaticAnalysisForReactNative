package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: quu  reason: default package */
/* loaded from: classes4.dex */
public abstract class quu extends dvd implements quv {
    public quu() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Status) dve.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
