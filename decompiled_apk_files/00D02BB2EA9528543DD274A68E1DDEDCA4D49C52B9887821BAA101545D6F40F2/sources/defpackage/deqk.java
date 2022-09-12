package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
/* compiled from: PG */
/* renamed from: deqk  reason: default package */
/* loaded from: classes6.dex */
public final class deqk implements Parcelable.Creator<ShortDynamicLinkImpl.WarningImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ShortDynamicLinkImpl.WarningImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ShortDynamicLinkImpl.WarningImpl(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ShortDynamicLinkImpl.WarningImpl[] newArray(int i) {
        return new ShortDynamicLinkImpl.WarningImpl[i];
    }
}
