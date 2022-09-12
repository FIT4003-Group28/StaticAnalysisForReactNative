package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
/* compiled from: PG */
/* renamed from: cnzk  reason: default package */
/* loaded from: classes5.dex */
public final class cnzk implements Parcelable.Creator<KeyFilterImpl.Inclusion> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ KeyFilterImpl.Inclusion createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                strArr = cnwm.w(parcel, readInt);
            } else if (b == 3) {
                strArr2 = cnwm.w(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                strArr3 = cnwm.w(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new KeyFilterImpl.Inclusion(strArr, strArr2, strArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ KeyFilterImpl.Inclusion[] newArray(int i) {
        return new KeyFilterImpl.Inclusion[i];
    }
}
