package com.google.android.gms.learning;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InAppTrainerOptions extends BaseOptions {
    public static final Parcelable.Creator<InAppTrainerOptions> CREATOR = new cogj();
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    @dzsi
    public final Uri f;
    @dzsi
    public final Uri g;
    @dzsi
    public final InAppTrainingConstraints h;
    public final long i;
    @dzsi
    public final Uri j;
    @dzsi
    public final TrainingInterval k;
    @dzsi
    public final Uri l;
    private final byte[] m;

    public InAppTrainerOptions(@dzsi String str, int i, boolean z, @dzsi String str2, int i2, @dzsi Uri uri, @dzsi Uri uri2, @dzsi InAppTrainingConstraints inAppTrainingConstraints, long j, @dzsi Uri uri3, @dzsi TrainingInterval trainingInterval, @dzsi byte[] bArr, @dzsi Uri uri4) {
        boolean z2 = true;
        dbsk.a(!str.isEmpty());
        dbsk.a(i != 0);
        if (uri != null && str2 == null) {
            dbsk.a(i2 == 3);
            dbsk.s(uri3);
            dbsk.s(trainingInterval);
            if (uri4 == null) {
                dbsk.s(uri2);
            } else {
                dbsk.a(uri2 != null ? false : z2);
            }
        } else if (uri != null || str2 == null) {
            if (uri == null) {
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
        } else {
            dbsk.a(!str2.isEmpty());
            if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                z2 = false;
            }
            dbsk.a(z2);
        }
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = uri;
        this.g = uri2;
        this.j = uri3;
        this.h = inAppTrainingConstraints;
        this.i = j;
        this.k = trainingInterval;
        this.m = bArr != null ? bArr : new byte[0];
        this.l = uri4;
    }

    public final byte[] a() {
        byte[] bArr = this.m;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppTrainerOptions)) {
            return false;
        }
        InAppTrainerOptions inAppTrainerOptions = (InAppTrainerOptions) obj;
        return dbsd.a(this.a, inAppTrainerOptions.a) && dbsd.a(Integer.valueOf(this.b), Integer.valueOf(inAppTrainerOptions.b)) && dbsd.a(Boolean.valueOf(this.c), Boolean.valueOf(inAppTrainerOptions.c)) && dbsd.a(this.d, inAppTrainerOptions.d) && this.e == inAppTrainerOptions.e && dbsd.a(this.f, inAppTrainerOptions.f) && dbsd.a(this.g, inAppTrainerOptions.g) && dbsd.a(this.j, inAppTrainerOptions.j) && dbsd.a(this.h, inAppTrainerOptions.h) && this.i == inAppTrainerOptions.i && dbsd.a(this.k, inAppTrainerOptions.k) && Arrays.equals(this.m, inAppTrainerOptions.m) && dbsd.a(this.l, inAppTrainerOptions.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, this.g, this.j, this.h, Long.valueOf(this.i), this.k, Integer.valueOf(Arrays.hashCode(this.m)), this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.g(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.g(parcel, 5, this.e);
        cnwn.u(parcel, 6, this.f, i);
        cnwn.u(parcel, 7, this.g, i);
        cnwn.u(parcel, 9, this.h, i);
        cnwn.h(parcel, 10, this.i);
        cnwn.u(parcel, 11, this.j, i);
        cnwn.u(parcel, 12, this.k, i);
        cnwn.l(parcel, 13, a(), false);
        cnwn.u(parcel, 14, this.l, i);
        cnwn.c(parcel, d);
    }
}
