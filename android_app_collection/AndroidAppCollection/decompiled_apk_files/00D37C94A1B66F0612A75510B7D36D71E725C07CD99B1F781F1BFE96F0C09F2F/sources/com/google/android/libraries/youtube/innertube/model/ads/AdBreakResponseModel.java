package com.google.android.libraries.youtube.innertube.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdBreakResponseModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aalf();
    public final arkq a;
    private final long b;

    public AdBreakResponseModel(arkq arkqVar, long j) {
        arkqVar.getClass();
        this.a = arkqVar;
        this.b = j;
    }

    public final List a() {
        aoyb aoybVar;
        ArrayList arrayList = new ArrayList();
        if (this.a.c.size() == 0) {
            return arrayList;
        }
        for (arkr arkrVar : this.a.c) {
            if (arkrVar.b == 84813246) {
                aoybVar = (aoyb) arkrVar.c;
            } else {
                aoybVar = aoyb.a;
            }
            if (aoybVar.c.size() > 0) {
                return (arkrVar.b == 84813246 ? (aoyb) arkrVar.c : aoyb.a).c;
            }
        }
        return arrayList;
    }

    public final boolean b() {
        return this.a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aphq.l(parcel, this.a);
        parcel.writeLong(this.b);
    }
}
