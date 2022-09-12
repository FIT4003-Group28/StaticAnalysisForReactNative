package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmdh  reason: default package */
/* loaded from: classes5.dex */
public final class cmdh {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List<cmdg> f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public cmdh(long j, boolean z, boolean z2, boolean z3, List<cmdg> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = Collections.unmodifiableList(list);
        this.e = j2;
        this.g = z4;
        this.h = j3;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public cmdh(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = false;
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new cmdg(parcel.readInt(), parcel.readLong()));
        }
        this.f = Collections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.g = parcel.readByte() == 1 ? true : z;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
