package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.LogOptions;
/* compiled from: PG */
/* renamed from: cocz  reason: default package */
/* loaded from: classes5.dex */
public final class cocz implements Parcelable.Creator<LogOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LogOptions(str, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LogOptions[] newArray(int i) {
        return new LogOptions[i];
    }
}
