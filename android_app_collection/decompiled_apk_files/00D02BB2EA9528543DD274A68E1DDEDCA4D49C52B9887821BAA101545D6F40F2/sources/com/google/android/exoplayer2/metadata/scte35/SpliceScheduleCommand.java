package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new cmdf();
    public final List<cmdh> a;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new cmdh(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            cmdh cmdhVar = this.a.get(i2);
            parcel.writeLong(cmdhVar.a);
            parcel.writeByte(cmdhVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cmdhVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cmdhVar.d ? (byte) 1 : (byte) 0);
            int size2 = cmdhVar.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                cmdg cmdgVar = cmdhVar.f.get(i3);
                parcel.writeInt(cmdgVar.a);
                parcel.writeLong(cmdgVar.b);
            }
            parcel.writeLong(cmdhVar.e);
            parcel.writeByte(cmdhVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cmdhVar.h);
            parcel.writeInt(cmdhVar.i);
            parcel.writeInt(cmdhVar.j);
            parcel.writeInt(cmdhVar.k);
        }
    }

    public SpliceScheduleCommand(List<cmdh> list) {
        this.a = Collections.unmodifiableList(list);
    }
}
