package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QueryFilterParameters> CREATOR = new cnzm();
    public final int a;
    public final int b;
    public final int[] c;

    public QueryFilterParameters(int i, int i2, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
    }

    public final boolean a() {
        return this.c != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            if (r10 != r9) goto L4
            return r0
        L4:
            boolean r1 = r10 instanceof com.google.android.gms.contextmanager.internal.QueryFilterParameters
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.contextmanager.internal.QueryFilterParameters r10 = (com.google.android.gms.contextmanager.internal.QueryFilterParameters) r10
            int r1 = r10.b
            int r3 = r9.b
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r10.a
            int r3 = r9.a
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r9.a()
            boolean r3 = r10.a()
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r9.a()
            if (r1 == 0) goto L49
            int[] r1 = r9.c
            int r1 = r1.length
            int[] r10 = r10.c
            int r3 = r10.length
            if (r1 != r3) goto L48
            r1 = 0
        L34:
            if (r1 >= r3) goto L49
            r4 = r10[r1]
            int[] r5 = r9.c
            int r6 = r5.length
            r7 = 0
        L3c:
            if (r7 >= r6) goto L48
            r8 = r5[r7]
            if (r8 != r4) goto L45
            int r1 = r1 + 1
            goto L34
        L45:
            int r7 = r7 + 1
            goto L3c
        L48:
            return r2
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contextmanager.internal.QueryFilterParameters.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.c;
        if (iArr != null) {
            i = 0;
            for (int i2 : iArr) {
                i += i2 * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.q(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
