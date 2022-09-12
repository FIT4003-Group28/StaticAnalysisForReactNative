package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WriteBatchImpl> CREATOR = new cnzq();
    public ArrayList<ContextData> a;

    public WriteBatchImpl() {
    }

    public WriteBatchImpl(ArrayList<ContextData> arrayList) {
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 3, this.a);
        cnwn.c(parcel, d);
    }
}
