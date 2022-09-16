package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.feedback.FileTeleporter;
/* compiled from: PG */
/* renamed from: cocy  reason: default package */
/* loaded from: classes5.dex */
public final class cocy implements Parcelable.Creator<FileTeleporter> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FileTeleporter createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) cnwm.q(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new FileTeleporter(parcelFileDescriptor, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FileTeleporter[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
