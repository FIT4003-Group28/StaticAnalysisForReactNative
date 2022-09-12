package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DefaultTrackSelector$Parameters extends TrackSelectionParameters {
    private final SparseBooleanArray F;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final boolean o;
    public final int p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> z;
    public static final DefaultTrackSelector$Parameters a = new cmjd().a();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new cmjc();

    public DefaultTrackSelector$Parameters(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, dcdc<String> dcdcVar, int i7, int i8, boolean z4, dcdc<String> dcdcVar2, int i9, boolean z5, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(dcdcVar, dcdcVar2, i9);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = z;
        this.k = false;
        this.l = z2;
        this.m = i5;
        this.n = i6;
        this.o = z3;
        this.p = i7;
        this.q = i8;
        this.r = z4;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = z5;
        this.y = 0;
        this.z = sparseArray;
        this.F = sparseBooleanArray;
    }

    public static DefaultTrackSelector$Parameters a(Context context) {
        return new cmjd(context).a();
    }

    public final boolean b(int i) {
        return this.F.get(i);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
            if (super.equals(obj) && this.b == defaultTrackSelector$Parameters.b && this.c == defaultTrackSelector$Parameters.c && this.d == defaultTrackSelector$Parameters.d && this.e == defaultTrackSelector$Parameters.e && this.f == defaultTrackSelector$Parameters.f && this.g == defaultTrackSelector$Parameters.g && this.h == defaultTrackSelector$Parameters.h && this.i == defaultTrackSelector$Parameters.i && this.j == defaultTrackSelector$Parameters.j && this.k == defaultTrackSelector$Parameters.k && this.l == defaultTrackSelector$Parameters.l && this.o == defaultTrackSelector$Parameters.o && this.m == defaultTrackSelector$Parameters.m && this.n == defaultTrackSelector$Parameters.n && this.p == defaultTrackSelector$Parameters.p && this.q == defaultTrackSelector$Parameters.q && this.r == defaultTrackSelector$Parameters.r && this.s == defaultTrackSelector$Parameters.s && this.t == defaultTrackSelector$Parameters.t && this.u == defaultTrackSelector$Parameters.u && this.v == defaultTrackSelector$Parameters.v && this.w == defaultTrackSelector$Parameters.w && this.x == defaultTrackSelector$Parameters.x && this.y == defaultTrackSelector$Parameters.y) {
                SparseBooleanArray sparseBooleanArray = this.F;
                SparseBooleanArray sparseBooleanArray2 = defaultTrackSelector$Parameters.F;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = this.z;
                            SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray2 = defaultTrackSelector$Parameters.z;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i2);
                                        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : valueAt.entrySet()) {
                                                TrackGroupArray key = entry.getKey();
                                                if (valueAt2.containsKey(key)) {
                                                    if (!cmny.b(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.m) * 31) + this.n) * 31) + this.p) * 31) + this.q) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + this.y;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        cmny.o(parcel, this.j);
        cmny.o(parcel, this.k);
        cmny.o(parcel, this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        cmny.o(parcel, this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        cmny.o(parcel, this.r);
        cmny.o(parcel, this.s);
        cmny.o(parcel, this.t);
        cmny.o(parcel, this.u);
        cmny.o(parcel, this.v);
        cmny.o(parcel, this.w);
        cmny.o(parcel, this.x);
        parcel.writeInt(this.y);
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = this.z;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i2);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : valueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.F);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        super(parcel);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = cmny.n(parcel);
        this.k = cmny.n(parcel);
        this.l = cmny.n(parcel);
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = cmny.n(parcel);
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = cmny.n(parcel);
        this.s = cmny.n(parcel);
        this.t = cmny.n(parcel);
        this.u = cmny.n(parcel);
        this.v = cmny.n(parcel);
        this.w = cmny.n(parcel);
        this.x = cmny.n(parcel);
        this.y = parcel.readInt();
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                cmmn.f(trackGroupArray);
                hashMap.put(trackGroupArray, (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.z = sparseArray;
        this.F = parcel.readSparseBooleanArray();
    }
}
