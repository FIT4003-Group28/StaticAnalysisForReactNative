package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
/* compiled from: PG */
/* renamed from: cphm  reason: default package */
/* loaded from: classes5.dex */
public final class cphm implements Parcelable.Creator<AncsNotificationParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AncsNotificationParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    b = cnwm.h(parcel, readInt);
                    break;
                case 10:
                    b2 = cnwm.h(parcel, readInt);
                    break;
                case 11:
                    b3 = cnwm.h(parcel, readInt);
                    break;
                case 12:
                    b4 = cnwm.h(parcel, readInt);
                    break;
                case 13:
                    str7 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new AncsNotificationParcelable(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AncsNotificationParcelable[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }
}
