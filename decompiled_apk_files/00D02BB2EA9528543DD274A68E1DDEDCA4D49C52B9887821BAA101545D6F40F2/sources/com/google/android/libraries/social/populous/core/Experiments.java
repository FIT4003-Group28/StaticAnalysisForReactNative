package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Experiments;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Experiments implements Parcelable {
    public static final Parcelable.Creator<Experiments> CREATOR = new cyfc();
    public final cydy a;
    private final dbty<String[]> b = dbud.a(new dbty(this) { // from class: cyfb
        private final Experiments a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cydy cydyVar = this.a.a;
            int cardinality = cydyVar.a.cardinality();
            int[] iArr = new int[cardinality];
            int nextSetBit = cydyVar.a.nextSetBit(0);
            for (int i = 0; i < cardinality; i++) {
                if (nextSetBit != -1) {
                    iArr[i] = nextSetBit;
                }
                nextSetBit = cydyVar.a.nextSetBit(nextSetBit + 1);
            }
            cyfe[] cyfeVarArr = (cyfe[]) cyfe.a.toArray(new cyfe[0]);
            String[] strArr = new String[cardinality];
            for (int i2 = 0; i2 < cardinality; i2++) {
                strArr[i2] = cyfeVarArr[iArr[i2]].e;
            }
            return strArr;
        }
    });

    public Experiments(cyfd cyfdVar) {
        this.a = cydy.b(cyfdVar.a);
    }

    public static cyfd c() {
        return new cyfd();
    }

    public final boolean a(cyfe cyfeVar) {
        cydy cydyVar = this.a;
        return cydyVar.a.get(cyfeVar.d);
    }

    public final String[] b() {
        String[] a = this.b.a();
        return (String[]) Arrays.copyOf(a, a.length);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Experiments) {
            return this.a.equals(((Experiments) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(cydy.b(this.a));
    }
}
