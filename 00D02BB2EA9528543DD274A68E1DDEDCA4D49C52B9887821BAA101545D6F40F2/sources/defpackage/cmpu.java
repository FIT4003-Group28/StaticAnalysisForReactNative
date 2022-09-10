package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
/* compiled from: PG */
/* renamed from: cmpu  reason: default package */
/* loaded from: classes5.dex */
public final class cmpu implements Parcelable.Creator<DocumentContents> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DocumentContents createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        DocumentSection[] documentSectionArr = null;
        String str = null;
        Account account = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                documentSectionArr = (DocumentSection[]) cnwm.z(parcel, readInt, DocumentSection.CREATOR);
            } else if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new DocumentContents(documentSectionArr, str, z, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DocumentContents[] newArray(int i) {
        return new DocumentContents[i];
    }
}
