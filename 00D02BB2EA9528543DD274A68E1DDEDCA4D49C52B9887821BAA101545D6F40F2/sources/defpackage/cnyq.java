package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
/* compiled from: PG */
/* renamed from: cnyq  reason: default package */
/* loaded from: classes5.dex */
public final class cnyq implements Parcelable.Creator<ContextDataFilterImpl.Inclusion> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextDataFilterImpl.Inclusion createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        TimeFilterImpl timeFilterImpl = null;
        KeyFilterImpl keyFilterImpl = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                timeFilterImpl = (TimeFilterImpl) cnwm.q(parcel, readInt, TimeFilterImpl.CREATOR);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                keyFilterImpl = (KeyFilterImpl) cnwm.q(parcel, readInt, KeyFilterImpl.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new ContextDataFilterImpl.Inclusion(i, i2, timeFilterImpl, keyFilterImpl);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextDataFilterImpl.Inclusion[] newArray(int i) {
        return new ContextDataFilterImpl.Inclusion[i];
    }
}
