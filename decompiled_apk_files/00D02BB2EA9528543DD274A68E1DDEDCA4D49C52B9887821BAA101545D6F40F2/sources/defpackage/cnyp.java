package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnyp  reason: default package */
/* loaded from: classes5.dex */
public final class cnyp implements Parcelable.Creator<ContextDataFilterImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextDataFilterImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        QueryFilterParameters queryFilterParameters = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                arrayList = cnwm.A(parcel, readInt, ContextDataFilterImpl.Inclusion.CREATOR);
            } else if (b == 3) {
                arrayList2 = cnwm.y(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                queryFilterParameters = (QueryFilterParameters) cnwm.q(parcel, readInt, QueryFilterParameters.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new ContextDataFilterImpl(arrayList, arrayList2, queryFilterParameters);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextDataFilterImpl[] newArray(int i) {
        return new ContextDataFilterImpl[i];
    }
}
