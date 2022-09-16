package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class Vss3ConfigModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(1);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final aoob f;
    private final awcg g;

    public Vss3ConfigModel(awcg awcgVar) {
        this.g = awcgVar;
        this.f = awcgVar.c;
        this.a = awcgVar.d;
        awch awchVar = awcgVar.b;
        awchVar = awchVar == null ? awch.a : awchVar;
        this.b = awchVar.b;
        this.c = awchVar.c;
        this.e = awchVar.e;
        this.d = awchVar.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.g, parcel);
    }
}
