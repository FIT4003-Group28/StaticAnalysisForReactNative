package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class QuestionMetrics implements Parcelable {
    public static final Parcelable.Creator<QuestionMetrics> CREATOR = new czog();
    private long a;
    private long b;

    public QuestionMetrics() {
        this.a = -1L;
        this.b = -1L;
    }

    public QuestionMetrics(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public final void a() {
        if (c()) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public final void b() {
        if (c()) {
            if (this.b < 0) {
                this.b = SystemClock.elapsedRealtime();
            } else {
                int i = czph.a;
            }
        }
    }
}
