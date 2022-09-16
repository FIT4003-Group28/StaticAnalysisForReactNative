package com.google.android.libraries.youtube.innertube.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdBreakRendererModel implements Parcelable, afto {
    public static final Parcelable.Creator CREATOR = new aalf(1);
    public static final aale a = new aale();
    public aoyb b;

    public AdBreakRendererModel(aoyb aoybVar) {
        aoybVar.getClass();
        this.b = aoybVar;
    }

    public final String a() {
        return this.b.e;
    }

    public final List b() {
        return this.b.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return akzj.f(this.b, ((AdBreakRendererModel) obj).b);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new aale(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.b, parcel);
    }
}
