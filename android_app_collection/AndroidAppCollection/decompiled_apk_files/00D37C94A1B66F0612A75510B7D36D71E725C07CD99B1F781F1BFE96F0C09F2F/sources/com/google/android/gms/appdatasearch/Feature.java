package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(4);
    public final int a;
    final Bundle b;

    public Feature(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.google.android.gms.appdatasearch.Feature
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.appdatasearch.Feature r7 = (com.google.android.gms.appdatasearch.Feature) r7
            int r1 = r6.a
            int r3 = r7.a
            if (r1 == r3) goto L13
            return r2
        L13:
            android.os.Bundle r1 = r6.b
            if (r1 != 0) goto L1d
            android.os.Bundle r7 = r7.b
            if (r7 != 0) goto L1c
            return r0
        L1c:
            return r2
        L1d:
            android.os.Bundle r3 = r7.b
            if (r3 != 0) goto L22
            return r2
        L22:
            int r1 = r1.size()
            android.os.Bundle r3 = r7.b
            int r3 = r3.size()
            if (r1 == r3) goto L2f
            return r2
        L2f:
            android.os.Bundle r1 = r6.b
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r7.b
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L5f
            android.os.Bundle r4 = r6.b
            java.lang.String r4 = r4.getString(r3)
            android.os.Bundle r5 = r7.b
            java.lang.String r3 = r5.getString(r3)
            boolean r3 = defpackage.tnk.j(r4, r3)
            if (r3 != 0) goto L39
        L5f:
            return r2
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appdatasearch.Feature.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = this.b.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.v(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
