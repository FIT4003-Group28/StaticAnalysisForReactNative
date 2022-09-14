package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, cpgm {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new cpia();
    public final String a;
    public final String b;

    public DataItemAssetParcelable(cpgm cpgmVar) {
        String a = cpgmVar.a();
        cnwc.a(a);
        this.a = a;
        String b = cpgmVar.b();
        cnwc.a(b);
        this.b = b;
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // defpackage.cpgm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cpgm
    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.c(parcel, d);
    }
}
