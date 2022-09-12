package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements cpgl {
    public static final Parcelable.Creator<DataItemParcelable> CREATOR = new cpic();
    public final Uri a;
    public byte[] b;
    private final Map<String, cpgm> c;

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.c = hashMap;
        this.b = bArr;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // defpackage.cpgl
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.cpgl
    public final byte[] b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb2.append(",dataSz=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        int size = this.c.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf2);
        sb.append(sb4.toString());
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry<String, cpgm> entry : this.c.entrySet()) {
            bundle.putParcelable(entry.getKey(), new DataItemAssetParcelable(entry.getValue()));
        }
        cnwn.m(parcel, 4, bundle);
        cnwn.l(parcel, 5, this.b, false);
        cnwn.c(parcel, d);
    }
}
