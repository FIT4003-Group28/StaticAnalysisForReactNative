package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final long f8039b;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public f mo275createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public f[] mo276newArray(int i) {
            return new f[i];
        }
    }

    private f(long j) {
        this.f8039b = j;
    }

    /* synthetic */ f(long j, a aVar) {
        this(j);
    }

    public static f b(long j) {
        return new f(j);
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean a(long j) {
        return j >= this.f8039b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f8039b == ((f) obj).f8039b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8039b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8039b);
    }
}
