package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* compiled from: PG */
/* renamed from: depu  reason: default package */
/* loaded from: classes6.dex */
public final class depu implements Parcelable.Creator<DynamicLinkData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamicLinkData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 5:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new DynamicLinkData(str, str2, i, j, bundle, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DynamicLinkData[] newArray(int i) {
        return new DynamicLinkData[i];
    }
}
