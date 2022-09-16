package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(20);
    public final String a;
    public final int b;
    public final String c;

    public NotificationAction(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.s(parcel, 3, this.b);
        tqj.F(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
