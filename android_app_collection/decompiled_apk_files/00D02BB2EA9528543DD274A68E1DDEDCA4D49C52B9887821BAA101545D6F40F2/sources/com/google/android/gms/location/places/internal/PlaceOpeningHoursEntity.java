package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaceOpeningHoursEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlaceOpeningHoursEntity> CREATOR = new copt();
    final List<BusinessHoursInterval> a;
    final List<ExceptionalHours> b;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class BusinessHoursInterval extends AbstractSafeParcelable {
        public static final Parcelable.Creator<BusinessHoursInterval> CREATOR = new coou();
        final int a;
        final int b;

        public BusinessHoursInterval(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 1, this.a);
            cnwn.g(parcel, 2, this.b);
            cnwn.c(parcel, d);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class ExceptionalHours extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ExceptionalHours> CREATOR = new coov();
        final int a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        final List<BusinessHoursInterval> g;

        public ExceptionalHours(int i, int i2, int i3, int i4, int i5, int i6, List<BusinessHoursInterval> list) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = Collections.unmodifiableList(list);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 1, this.a);
            cnwn.g(parcel, 2, this.b);
            cnwn.g(parcel, 3, this.c);
            cnwn.g(parcel, 4, this.d);
            cnwn.g(parcel, 5, this.e);
            cnwn.g(parcel, 6, this.f);
            cnwn.y(parcel, 7, this.g);
            cnwn.c(parcel, d);
        }
    }

    public PlaceOpeningHoursEntity(List<BusinessHoursInterval> list, List<ExceptionalHours> list2) {
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 1, this.a);
        cnwn.y(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
