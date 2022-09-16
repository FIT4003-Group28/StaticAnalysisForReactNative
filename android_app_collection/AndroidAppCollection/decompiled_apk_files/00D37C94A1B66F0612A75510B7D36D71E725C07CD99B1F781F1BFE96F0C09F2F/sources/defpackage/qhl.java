package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qhl  reason: default package */
/* loaded from: classes4.dex */
public class qhl extends dvd implements IInterface {
    protected qtu a;

    public qhl() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public void a(Status status) {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Status) dve.a(parcel, Status.CREATOR));
        } else if (i == 2) {
            Status status = (Status) dve.a(parcel, Status.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dve.a(parcel, ParcelFileDescriptor.CREATOR);
        } else if (i != 4) {
            return false;
        } else {
            GetRecentContextCall$Response getRecentContextCall$Response = (GetRecentContextCall$Response) dve.a(parcel, GetRecentContextCall$Response.CREATOR);
        }
        return true;
    }
}
