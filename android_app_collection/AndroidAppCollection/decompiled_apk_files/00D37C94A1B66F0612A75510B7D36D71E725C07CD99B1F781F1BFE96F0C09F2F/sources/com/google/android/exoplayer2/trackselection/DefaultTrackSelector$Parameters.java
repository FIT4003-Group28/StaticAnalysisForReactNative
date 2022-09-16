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
/* loaded from: classes2.dex */
public final class DefaultTrackSelector$Parameters extends TrackSelectionParameters implements Parcelable {

    /* renamed from: J  reason: collision with root package name */
    private final SparseBooleanArray f157J;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final SparseArray m;
    public static final DefaultTrackSelector$Parameters a = new puz().a();
    public static final Parcelable.Creator CREATOR = new pva(1);

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        super(parcel);
        this.c = pxi.T(parcel);
        this.d = pxi.T(parcel);
        this.e = pxi.T(parcel);
        this.f = pxi.T(parcel);
        this.g = pxi.T(parcel);
        this.h = pxi.T(parcel);
        this.i = pxi.T(parcel);
        this.b = parcel.readInt();
        this.j = pxi.T(parcel);
        this.k = pxi.T(parcel);
        this.l = pxi.T(parcel);
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                ptx.a(trackGroupArray);
                hashMap.put(trackGroupArray, (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.m = sparseArray;
        this.f157J = parcel.readSparseBooleanArray();
    }

    public static DefaultTrackSelector$Parameters a(Context context) {
        return new puz(context).a();
    }

    public final boolean b(int i) {
        return this.f157J.get(i);
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
            if (super.equals(defaultTrackSelector$Parameters) && this.c == defaultTrackSelector$Parameters.c && this.d == defaultTrackSelector$Parameters.d && this.e == defaultTrackSelector$Parameters.e && this.f == defaultTrackSelector$Parameters.f && this.g == defaultTrackSelector$Parameters.g && this.h == defaultTrackSelector$Parameters.h && this.i == defaultTrackSelector$Parameters.i && this.b == defaultTrackSelector$Parameters.b && this.j == defaultTrackSelector$Parameters.j && this.k == defaultTrackSelector$Parameters.k && this.l == defaultTrackSelector$Parameters.l) {
                SparseBooleanArray sparseBooleanArray = this.f157J;
                SparseBooleanArray sparseBooleanArray2 = defaultTrackSelector$Parameters.f157J;
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
                            SparseArray sparseArray = this.m;
                            SparseArray sparseArray2 = defaultTrackSelector$Parameters.m;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                                if (map2.containsKey(trackGroupArray)) {
                                                    if (!pxi.M(entry.getValue(), map2.get(trackGroupArray))) {
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
        return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + this.b) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        pxi.L(parcel, this.c);
        pxi.L(parcel, this.d);
        pxi.L(parcel, this.e);
        pxi.L(parcel, this.f);
        pxi.L(parcel, this.g);
        pxi.L(parcel, this.h);
        pxi.L(parcel, this.i);
        parcel.writeInt(this.b);
        pxi.L(parcel, this.j);
        pxi.L(parcel, this.k);
        pxi.L(parcel, this.l);
        SparseArray sparseArray = this.m;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.f157J);
    }

    public DefaultTrackSelector$Parameters(puz puzVar) {
        super(puzVar);
        this.c = puzVar.a;
        this.d = false;
        this.e = puzVar.b;
        this.f = puzVar.c;
        this.g = false;
        this.h = false;
        this.i = false;
        this.b = 0;
        this.j = puzVar.d;
        this.k = false;
        this.l = puzVar.e;
        this.m = puzVar.f;
        this.f157J = puzVar.g;
    }
}
