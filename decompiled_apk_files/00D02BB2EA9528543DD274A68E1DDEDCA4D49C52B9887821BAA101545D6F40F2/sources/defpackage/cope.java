package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cope  reason: default package */
/* loaded from: classes5.dex */
public abstract class cope extends clb implements copf {
    public cope() {
        super("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((DataHolder) clc.d(parcel, DataHolder.CREATOR));
        } else if (i == 2) {
            c((DataHolder) clc.d(parcel, DataHolder.CREATOR));
        } else if (i == 3) {
            d((DataHolder) clc.d(parcel, DataHolder.CREATOR));
        } else if (i == 4) {
            e((Status) clc.d(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            f((DataHolder) clc.d(parcel, DataHolder.CREATOR));
        }
        return true;
    }
}
