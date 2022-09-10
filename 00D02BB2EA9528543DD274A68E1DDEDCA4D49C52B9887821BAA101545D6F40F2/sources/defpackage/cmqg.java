package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmqg  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmqg extends clb implements cmqh {
    public cmqg() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((Status) clc.d(parcel, Status.CREATOR));
        } else if (i == 2) {
            Status status = (Status) clc.d(parcel, Status.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) clc.d(parcel, ParcelFileDescriptor.CREATOR);
        } else if (i != 4) {
            return false;
        } else {
            GetRecentContextCall$Response getRecentContextCall$Response = (GetRecentContextCall$Response) clc.d(parcel, GetRecentContextCall$Response.CREATOR);
        }
        return true;
    }
}
