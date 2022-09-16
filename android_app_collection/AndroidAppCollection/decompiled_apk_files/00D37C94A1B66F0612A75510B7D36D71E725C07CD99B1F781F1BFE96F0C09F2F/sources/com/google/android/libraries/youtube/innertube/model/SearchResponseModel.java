package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SearchResponseModel implements Parcelable, ajga {
    public static final Parcelable.Creator CREATOR = new xcg(19);
    public asbz a;
    private aakw b;
    private Object c;

    public SearchResponseModel(asbz asbzVar) {
        this.a = asbzVar;
    }

    @Override // defpackage.ajga
    public final auna a() {
        auna aunaVar = this.a.g;
        return aunaVar == null ? auna.a : aunaVar;
    }

    @Override // defpackage.ajga
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.ajga
    public final void c(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.ajga
    public final byte[] d() {
        return this.a.h.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final aakw e() {
        aakw aakwVar = this.b;
        if (aakwVar != null) {
            return aakwVar;
        }
        asca ascaVar = this.a.e;
        if (ascaVar == null) {
            ascaVar = asca.a;
        }
        if (ascaVar.b == 49399797) {
            this.b = new aakw((auqh) ascaVar.c);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
    }
}
