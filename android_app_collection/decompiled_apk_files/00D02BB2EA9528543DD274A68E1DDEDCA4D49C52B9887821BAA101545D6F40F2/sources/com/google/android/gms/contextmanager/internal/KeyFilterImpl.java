package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyFilterImpl> CREATOR = new cnzj();
    public final ArrayList<Inclusion> a;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Inclusion> CREATOR = new cnzk();
        public final String[] a;
        public final String[] b;
        public final String[] c;

        public Inclusion(String[] strArr, String[] strArr2, String[] strArr3) {
            this.a = strArr;
            this.b = strArr2;
            this.c = strArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return Arrays.equals(this.a, inclusion.a) && Arrays.equals(this.b, inclusion.b) && Arrays.equals(this.c, inclusion.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.a) + Arrays.hashCode(this.b) + Arrays.hashCode(this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.v(parcel, 2, this.a);
            cnwn.v(parcel, 3, this.b);
            cnwn.v(parcel, 4, this.c);
            cnwn.c(parcel, d);
        }
    }

    public KeyFilterImpl(ArrayList<Inclusion> arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyFilterImpl) {
            return this.a.equals(((KeyFilterImpl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
