package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: copq  reason: default package */
/* loaded from: classes5.dex */
public final class copq implements Parcelable.Creator<PlaceExtendedDetailsEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceExtendedDetailsEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        Uri uri = null;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.x(parcel, readInt);
            } else if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            } else if (b == 4) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceExtendedDetailsEntity(arrayList, str, uri, f2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceExtendedDetailsEntity[] newArray(int i) {
        return new PlaceExtendedDetailsEntity[i];
    }
}
