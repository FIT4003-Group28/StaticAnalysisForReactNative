package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmrx  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmrx extends clb implements cmry {
    public cmrx() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            b((Status) clc.d(parcel, Status.CREATOR), (Bundle) clc.d(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
