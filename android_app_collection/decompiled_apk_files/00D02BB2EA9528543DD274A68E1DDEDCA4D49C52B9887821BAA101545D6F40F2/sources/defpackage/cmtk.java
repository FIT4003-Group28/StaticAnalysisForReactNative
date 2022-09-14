package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmtk  reason: default package */
/* loaded from: classes5.dex */
public final class cmtk implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = cnwm.A(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    arrayList = cnwm.A(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.c(arrayList), str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
