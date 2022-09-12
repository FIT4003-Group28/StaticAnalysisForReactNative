package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: deqj  reason: default package */
/* loaded from: classes6.dex */
public final class deqj implements Parcelable.Creator<ShortDynamicLinkImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ShortDynamicLinkImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            } else if (b == 2) {
                uri2 = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new ShortDynamicLinkImpl(uri, uri2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ShortDynamicLinkImpl[] newArray(int i) {
        return new ShortDynamicLinkImpl[i];
    }
}
