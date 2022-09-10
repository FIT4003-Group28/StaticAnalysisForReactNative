package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FenceStateImpl extends FenceState {
    public static final Parcelable.Creator<FenceStateImpl> CREATOR = new cnyn();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final ArrayList<ContextData> e;

    public FenceStateImpl(int i, long j, String str, int i2, ArrayList<ContextData> arrayList) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = i2;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.h(parcel, 3, this.b);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.g(parcel, 5, this.d);
        cnwn.y(parcel, 6, this.e);
        cnwn.c(parcel, d);
    }
}
