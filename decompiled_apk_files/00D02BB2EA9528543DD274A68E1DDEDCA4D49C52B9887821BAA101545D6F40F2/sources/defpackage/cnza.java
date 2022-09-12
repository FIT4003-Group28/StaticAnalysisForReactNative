package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
/* compiled from: PG */
/* renamed from: cnza  reason: default package */
/* loaded from: classes5.dex */
public final class cnza implements Parcelable.Creator<ContextManagerClientInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextManagerClientInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 8:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 10:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                case 11:
                    i5 = cnwm.i(parcel, readInt);
                    break;
                case 12:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ContextManagerClientInfo(str, str2, i, str3, i2, i3, str4, str5, i4, i5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextManagerClientInfo[] newArray(int i) {
        return new ContextManagerClientInfo[i];
    }
}
