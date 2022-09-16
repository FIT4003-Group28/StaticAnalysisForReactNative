package com.google.android.libraries.youtube.player.features.overlay.timebar;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class TimelineMarker implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(18);
    public final long a;
    public final long b;
    public final int c;
    public final float d;
    public final CharSequence e;
    public final apzg f;

    public TimelineMarker(long j, float f) {
        this(j, j, 0, null, null, f);
    }

    public final boolean a(long j) {
        return this.a <= j && this.b > j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TimelineMarker)) {
            return false;
        }
        TimelineMarker timelineMarker = (TimelineMarker) obj;
        if (this.a != timelineMarker.a || this.b != timelineMarker.b || this.c != timelineMarker.c || this.d != timelineMarker.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence == timelineMarker.e) {
            return true;
        }
        return charSequence != null && charSequence.toString().contentEquals(timelineMarker.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), this.e, Float.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public TimelineMarker(long j, long j2) {
        this(j, j2, 0, null, null, 0.0f);
    }

    public TimelineMarker(long j, long j2, int i, CharSequence charSequence, apzg apzgVar) {
        this(j, j2, i, charSequence, apzgVar, 0.0f);
    }

    public TimelineMarker(long j, long j2, int i, CharSequence charSequence, apzg apzgVar, float f) {
        aqxo.p(j2 >= j);
        this.a = j;
        this.b = j2;
        this.c = i;
        this.e = charSequence;
        this.f = apzgVar;
        this.d = f;
    }
}
