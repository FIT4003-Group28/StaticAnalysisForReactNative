package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new rsz(12);
    public final int a;
    public final Flag[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public Configuration(int i, Flag[] flagArr, String[] strArr) {
        this.a = i;
        this.b = flagArr;
        for (Flag flag : flagArr) {
            this.d.put(flag.a, flag);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((Configuration) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.a == configuration.a && rug.a(this.d, configuration.d) && Arrays.equals(this.c, configuration.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        for (Flag flag : this.d.values()) {
            sb.append(flag);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.I(parcel, 3, this.b, i);
        tqj.G(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
