package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
/* compiled from: PG */
/* renamed from: cotv  reason: default package */
/* loaded from: classes5.dex */
public final class cotv implements Parcelable.Creator<OpenFileDescriptorRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OpenFileDescriptorRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Uri uri = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new OpenFileDescriptorRequest(uri, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OpenFileDescriptorRequest[] newArray(int i) {
        return new OpenFileDescriptorRequest[i];
    }
}
