package com.google.android.libraries.youtube.player.modality;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackModalityState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(19);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    @Deprecated
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final aijq j;
    public final aijz k;

    public PlaybackModalityState(Parcel parcel) {
        aijq a;
        aijz aijzVar;
        boolean z = false;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.e = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt < 0 || (readInt >> 3) > 0) {
            a = aijq.a();
        } else {
            a = new aijq(readInt);
        }
        this.j = a;
        int readInt2 = parcel.readInt();
        aijz[] values = aijz.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aijzVar = aijz.DEFAULT_VALUE;
                break;
            }
            aijzVar = values[i];
            if (aijzVar.c == readInt2) {
                break;
            }
            i++;
        }
        this.k = aijzVar;
        this.f = parcel.readInt() == 1 ? true : z;
    }

    public PlaybackModalityState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, aijq aijqVar, aijz aijzVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = aijqVar;
        this.k = aijzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j.a);
        parcel.writeInt(this.k.c);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
