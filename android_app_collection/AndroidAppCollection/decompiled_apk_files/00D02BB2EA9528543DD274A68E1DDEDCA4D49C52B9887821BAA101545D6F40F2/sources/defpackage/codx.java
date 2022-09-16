package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.OfflineSuggestion;
/* compiled from: PG */
/* renamed from: codx  reason: default package */
/* loaded from: classes5.dex */
public final class codx implements Parcelable.Creator<OfflineSuggestion> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OfflineSuggestion createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                str4 = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str3 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new OfflineSuggestion(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OfflineSuggestion[] newArray(int i) {
        return new OfflineSuggestion[i];
    }
}
