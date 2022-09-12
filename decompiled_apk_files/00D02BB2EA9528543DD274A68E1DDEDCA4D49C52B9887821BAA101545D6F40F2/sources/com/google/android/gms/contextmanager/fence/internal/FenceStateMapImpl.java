package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FenceStateMapImpl> CREATOR = new cnyo();
    public final Map<String, FenceStateImpl> a = new HashMap();

    public FenceStateMapImpl(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.a.put(str, (FenceStateImpl) cnwo.b(bundle.getByteArray(str), FenceStateImpl.CREATOR));
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, FenceStateImpl> entry : this.a.entrySet()) {
            bundle.putByteArray(entry.getKey(), cnwo.a(entry.getValue()));
        }
        cnwn.m(parcel, 2, bundle);
        cnwn.c(parcel, d);
    }
}
