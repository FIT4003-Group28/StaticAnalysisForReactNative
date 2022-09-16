package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
/* compiled from: PG */
/* renamed from: cnli  reason: default package */
/* loaded from: classes.dex */
public final class cnli implements Parcelable.Creator<PlayLoggerContext> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlayLoggerContext createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 8:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 10:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 11:
                    num = cnwm.j(parcel, readInt);
                    break;
                case 12:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new PlayLoggerContext(str, i, i2, str2, str3, z, str4, z2, i3, num, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlayLoggerContext[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
