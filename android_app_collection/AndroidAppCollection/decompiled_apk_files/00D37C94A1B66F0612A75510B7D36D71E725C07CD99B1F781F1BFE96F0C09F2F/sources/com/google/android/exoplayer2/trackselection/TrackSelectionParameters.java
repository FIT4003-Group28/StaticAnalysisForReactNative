package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int A;
    public final int B;
    public final int C;
    public final amuk D;
    public final amuk E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final amuk y;
    public final amuk z;

    static {
        new TrackSelectionParameters(new pvl());
        CREATOR = new pva(2);
    }

    public TrackSelectionParameters(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.z = amuk.o(arrayList);
        this.A = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.E = amuk.o(arrayList2);
        this.F = parcel.readInt();
        this.G = pxi.T(parcel);
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = pxi.T(parcel);
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, null);
        this.y = amuk.o(arrayList3);
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, null);
        this.D = amuk.o(arrayList4);
        this.H = pxi.T(parcel);
        this.I = pxi.T(parcel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TrackSelectionParameters(pvl pvlVar) {
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = pvlVar.h;
        this.w = pvlVar.i;
        this.x = pvlVar.j;
        this.y = pvlVar.k;
        this.z = pvlVar.l;
        this.A = 0;
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.D = pvlVar.m;
        this.E = pvlVar.n;
        this.F = pvlVar.o;
        this.G = false;
        this.H = false;
        this.I = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (this.n == trackSelectionParameters.n && this.o == trackSelectionParameters.o && this.p == trackSelectionParameters.p && this.q == trackSelectionParameters.q && this.r == trackSelectionParameters.r && this.s == trackSelectionParameters.s && this.t == trackSelectionParameters.t && this.u == trackSelectionParameters.u && this.x == trackSelectionParameters.x && this.v == trackSelectionParameters.v && this.w == trackSelectionParameters.w && amxp.v(this.y, trackSelectionParameters.y) && amxp.v(this.z, trackSelectionParameters.z) && this.A == trackSelectionParameters.A && this.B == trackSelectionParameters.B && this.C == trackSelectionParameters.C && amxp.v(this.D, trackSelectionParameters.D) && amxp.v(this.E, trackSelectionParameters.E) && this.F == trackSelectionParameters.F && this.G == trackSelectionParameters.G && this.H == trackSelectionParameters.H && this.I == trackSelectionParameters.I) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.n + 31) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + (this.x ? 1 : 0)) * 31) + this.v) * 31) + this.w) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.z);
        parcel.writeInt(this.A);
        parcel.writeList(this.E);
        parcel.writeInt(this.F);
        pxi.L(parcel, this.G);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        pxi.L(parcel, this.x);
        parcel.writeList(this.y);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeList(this.D);
        pxi.L(parcel, this.H);
        pxi.L(parcel, this.I);
    }
}
