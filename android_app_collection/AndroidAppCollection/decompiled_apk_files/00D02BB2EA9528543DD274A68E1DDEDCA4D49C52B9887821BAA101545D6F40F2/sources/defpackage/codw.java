package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
/* compiled from: PG */
/* renamed from: codw  reason: default package */
/* loaded from: classes5.dex */
public final class codw implements Parcelable.Creator<InProductHelp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InProductHelp createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        GoogleHelp googleHelp = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    googleHelp = (GoogleHelp) cnwm.q(parcel, readInt, GoogleHelp.CREATOR);
                    break;
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
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new InProductHelp(googleHelp, str, str2, i, str3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InProductHelp[] newArray(int i) {
        return new InProductHelp[i];
    }
}
