package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MutateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alwc(10);
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final ActionImpl e;
    public final String f;
    public final String g;

    public MutateRequest(int i, Thing[] thingArr, String[] strArr, String[] strArr2, ActionImpl actionImpl, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = actionImpl;
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.I(parcel, 2, this.b, i);
        tqj.G(parcel, 3, this.c);
        tqj.G(parcel, 5, this.d);
        tqj.E(parcel, 6, this.e, i);
        tqj.F(parcel, 7, this.f);
        tqj.F(parcel, 8, this.g);
        tqj.n(parcel, m);
    }
}
