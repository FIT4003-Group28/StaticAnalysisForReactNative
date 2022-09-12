package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
/* compiled from: PG */
/* renamed from: coyr  reason: default package */
/* loaded from: classes5.dex */
public abstract class coyr extends clb implements coys {
    public coyr() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR), (PseudonymousIdToken) clc.d(parcel, PseudonymousIdToken.CREATOR));
        } else if (i == 2) {
            c((Status) clc.d(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            d((Status) clc.d(parcel, Status.CREATOR), parcel.readLong());
        }
        return true;
    }
}
