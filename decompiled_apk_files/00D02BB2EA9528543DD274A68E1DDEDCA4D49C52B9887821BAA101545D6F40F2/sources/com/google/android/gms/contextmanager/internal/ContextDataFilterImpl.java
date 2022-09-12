package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ContextDataFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextDataFilterImpl> CREATOR = new cnyp();
    public final ArrayList<Inclusion> a;
    public final ArrayList<String> b;
    public final QueryFilterParameters c;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Inclusion> CREATOR = new cnyq();
        public final int a;
        public final int b;
        public final TimeFilterImpl c;
        public final KeyFilterImpl d;

        public Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.a = i;
            this.b = i2;
            this.c = timeFilterImpl;
            this.d = keyFilterImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return this.a == inclusion.a && this.b == inclusion.b && this.c.equals(inclusion.c) && cnvv.a(this.d, inclusion.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 2, this.a);
            cnwn.g(parcel, 3, this.b);
            cnwn.u(parcel, 4, this.c, i);
            cnwn.u(parcel, 5, this.d, i);
            cnwn.c(parcel, d);
        }
    }

    public ContextDataFilterImpl(ArrayList<Inclusion> arrayList, ArrayList<String> arrayList2, QueryFilterParameters queryFilterParameters) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = queryFilterParameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextDataFilterImpl)) {
            return false;
        }
        ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
        return cnvv.a(this.a, contextDataFilterImpl.a) && cnvv.a(this.b, contextDataFilterImpl.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("contexts=[");
        ArrayList<Inclusion> arrayList = this.a;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList<Inclusion> arrayList2 = this.a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                sb.append(arrayList2.get(i).b);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, this.a);
        cnwn.w(parcel, 3, this.b);
        cnwn.u(parcel, 4, this.c, i);
        cnwn.c(parcel, d);
    }
}
