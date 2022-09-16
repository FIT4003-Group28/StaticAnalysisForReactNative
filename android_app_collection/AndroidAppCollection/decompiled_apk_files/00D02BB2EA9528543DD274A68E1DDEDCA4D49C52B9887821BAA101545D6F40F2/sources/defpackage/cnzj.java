package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnzj  reason: default package */
/* loaded from: classes5.dex */
public final class cnzj implements Parcelable.Creator<KeyFilterImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ KeyFilterImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, KeyFilterImpl.Inclusion.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new KeyFilterImpl(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ KeyFilterImpl[] newArray(int i) {
        return new KeyFilterImpl[i];
    }
}
