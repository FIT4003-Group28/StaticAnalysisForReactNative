package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxi();
    @Deprecated
    String a;
    @Deprecated
    String b;
    ArrayList c;

    LabelValueRow() {
        this.c = tqn.f();
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.J(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
