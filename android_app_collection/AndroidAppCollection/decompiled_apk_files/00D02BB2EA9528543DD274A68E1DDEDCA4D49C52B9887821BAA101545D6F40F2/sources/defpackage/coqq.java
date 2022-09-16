package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.UploadRequestResult;
/* compiled from: PG */
/* renamed from: coqq  reason: default package */
/* loaded from: classes5.dex */
public final class coqq implements Parcelable.Creator<UploadRequestResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UploadRequestResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                j = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UploadRequestResult(i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UploadRequestResult[] newArray(int i) {
        return new UploadRequestResult[i];
    }
}
