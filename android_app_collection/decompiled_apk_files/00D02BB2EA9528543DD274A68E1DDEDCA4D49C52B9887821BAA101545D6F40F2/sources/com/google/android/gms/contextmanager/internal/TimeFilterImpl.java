package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeFilterImpl> CREATOR = new cnzn();
    public final ArrayList<Interval> a;
    public final int[] b;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Interval> CREATOR = new cnzo();
        public final long a;
        public final long b;

        public Interval(long j, long j2) {
            boolean z = true;
            cnwc.g(j >= -1);
            cnwc.g(j2 > -1);
            if (j != -1) {
                cnwc.g(j > j2 ? false : z);
            }
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.a == interval.a && this.b == interval.b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.h(parcel, 2, this.a);
            cnwn.h(parcel, 3, this.b);
            cnwn.c(parcel, d);
        }
    }

    public TimeFilterImpl(ArrayList<Interval> arrayList, @dzsi int[] iArr) {
        this.a = arrayList;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeFilterImpl)) {
            return false;
        }
        TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
        return cnvv.a(this.a, timeFilterImpl.a) && cnvv.a(this.b, timeFilterImpl.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, this.a);
        cnwn.q(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
