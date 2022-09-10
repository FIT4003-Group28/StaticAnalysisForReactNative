package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguageFluency;
import com.google.android.gms.languageprofile.LanguagePreference;
/* compiled from: PG */
/* renamed from: cofv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cofv extends clb implements cofw {
    public cofv() {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) clc.d(parcel, Status.CREATOR);
            parcel.readString();
            c();
        } else if (i == 2) {
            b((Status) clc.d(parcel, Status.CREATOR), parcel.createTypedArrayList(LanguagePreference.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            Status status2 = (Status) clc.d(parcel, Status.CREATOR);
            parcel.createTypedArrayList(LanguageFluency.CREATOR);
            d();
        }
        return true;
    }
}
