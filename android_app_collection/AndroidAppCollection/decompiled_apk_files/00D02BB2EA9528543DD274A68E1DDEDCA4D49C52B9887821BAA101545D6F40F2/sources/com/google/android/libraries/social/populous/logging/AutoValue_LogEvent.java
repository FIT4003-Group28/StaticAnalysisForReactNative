package com.google.android.libraries.social.populous.logging;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_LogEvent extends C$AutoValue_LogEvent implements Parcelable {
    public static final Parcelable.Creator<AutoValue_LogEvent> CREATOR = new cyon();
    private static final ClassLoader j = AutoValue_LogEvent.class.getClassLoader();

    public AutoValue_LogEvent(Parcel parcel) {
        super(cyou.b()[parcel.readInt()], parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), parcel.readLong(), parcel.readInt(), dcdc.t((LogEntity[]) parcel.createTypedArray(AutoValue_LogEntity.CREATOR)), parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null, ((Boolean) parcel.readValue(j)).booleanValue(), parcel.readByte() == 1 ? Integer.valueOf(parcel.readInt()) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.i - 1);
        byte b = 1;
        parcel.writeByte(this.a == null ? (byte) 0 : (byte) 1);
        Long l = this.a;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedArray((AutoValue_LogEntity[]) this.e.toArray(new AutoValue_LogEntity[0]), 0);
        parcel.writeByte(this.f == null ? (byte) 0 : (byte) 1);
        Long l2 = this.f;
        if (l2 != null) {
            parcel.writeLong(l2.longValue());
        }
        parcel.writeValue(Boolean.valueOf(this.g));
        if (this.h == null) {
            b = 0;
        }
        parcel.writeByte(b);
        Integer num = this.h;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public AutoValue_LogEvent(int i, Long l, long j2, long j3, int i2, dcdc<LogEntity> dcdcVar, Long l2, boolean z, Integer num) {
        super(i, l, j2, j3, i2, dcdcVar, l2, z, num);
    }
}
