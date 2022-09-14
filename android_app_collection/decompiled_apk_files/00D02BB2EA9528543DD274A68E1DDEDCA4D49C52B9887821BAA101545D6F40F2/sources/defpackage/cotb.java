package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.DeleteFileRequest;
/* compiled from: PG */
/* renamed from: cotb  reason: default package */
/* loaded from: classes5.dex */
public final class cotb implements Parcelable.Creator<DeleteFileRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeleteFileRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Uri uri = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new DeleteFileRequest(uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeleteFileRequest[] newArray(int i) {
        return new DeleteFileRequest[i];
    }
}
