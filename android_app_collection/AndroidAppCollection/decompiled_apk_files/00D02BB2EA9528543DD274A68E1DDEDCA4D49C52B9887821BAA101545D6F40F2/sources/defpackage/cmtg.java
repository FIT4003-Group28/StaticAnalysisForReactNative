package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmtg  reason: default package */
/* loaded from: classes5.dex */
public final class cmtg implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 9:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                case 10:
                    arrayList = cnwm.A(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = cnwm.o(parcel, readInt);
                    break;
                case 12:
                    str8 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
