package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmrt  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmrt extends clb implements cmru {
    public cmrt() {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
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
