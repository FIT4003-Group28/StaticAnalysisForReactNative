package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new cmdi();
    public final long a;
    public final long b;

    public TimeSignalCommand(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long c(cmnk cmnkVar, long j) {
        long l = cmnkVar.l();
        if ((128 & l) != 0) {
            return 8589934591L & ((((l & 1) << 32) | cmnkVar.p()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
