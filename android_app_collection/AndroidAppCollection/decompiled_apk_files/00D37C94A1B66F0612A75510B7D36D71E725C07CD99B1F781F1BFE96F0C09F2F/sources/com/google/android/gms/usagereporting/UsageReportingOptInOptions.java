package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ruc(6);
    public int a;
    public boolean b;
    public final List c;
    public int d;
    public String e;
    public boolean f;

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.o(parcel, 3, this.b);
        tqj.H(parcel, 4, this.c);
        tqj.s(parcel, 5, this.d);
        tqj.F(parcel, 6, this.e);
        tqj.o(parcel, 7, this.f);
        tqj.n(parcel, m);
    }
}
