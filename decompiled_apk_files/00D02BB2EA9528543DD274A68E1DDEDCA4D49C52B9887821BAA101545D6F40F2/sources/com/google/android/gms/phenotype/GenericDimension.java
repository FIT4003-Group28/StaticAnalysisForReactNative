package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GenericDimension extends AbstractSafeParcelable implements Comparable<GenericDimension> {
    public static final Parcelable.Creator<GenericDimension> CREATOR = new coxq();
    public final int a;
    public final int b;

    public GenericDimension(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(GenericDimension genericDimension) {
        int i = this.a;
        int i2 = genericDimension.a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.b;
        int i4 = genericDimension.b;
        if (i3 < i4) {
            return -1;
        }
        return i3 > i4 ? 1 : 0;
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof GenericDimension) && compareTo((GenericDimension) obj) == 0;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GenericDimension(" + this.a + ", " + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
