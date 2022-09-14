package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnzq  reason: default package */
/* loaded from: classes5.dex */
public final class cnzq implements Parcelable.Creator<WriteBatchImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WriteBatchImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 3) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, ContextData.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new WriteBatchImpl(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WriteBatchImpl[] newArray(int i) {
        return new WriteBatchImpl[i];
    }
}
