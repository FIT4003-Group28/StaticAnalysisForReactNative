package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.RenameRequest;
/* compiled from: PG */
/* renamed from: cotx  reason: default package */
/* loaded from: classes5.dex */
public final class cotx implements Parcelable.Creator<RenameRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RenameRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Uri uri = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                uri2 = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new RenameRequest(uri, uri2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RenameRequest[] newArray(int i) {
        return new RenameRequest[i];
    }
}
