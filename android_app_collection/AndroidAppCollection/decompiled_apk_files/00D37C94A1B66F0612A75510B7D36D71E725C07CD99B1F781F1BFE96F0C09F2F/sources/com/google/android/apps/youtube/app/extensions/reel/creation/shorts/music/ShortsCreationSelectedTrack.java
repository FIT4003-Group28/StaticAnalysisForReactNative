package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ShortsCreationSelectedTrack implements Parcelable {
    private static final byte[] a = new byte[0];
    public static final Parcelable.Creator CREATOR = new gta(5);

    public static hfo m() {
        hfo hfoVar = new hfo((byte[]) null);
        hfoVar.c(0L);
        hfoVar.g = amon.a;
        return hfoVar;
    }

    public abstract long a();

    public abstract Uri b();

    public abstract hfo c();

    public abstract ampq d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract ampq e();

    public abstract apzg f();

    public abstract auup g();

    public abstract avhn h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract boolean l();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(k());
        parcel.writeLong(a());
        parcel.writeInt(l() ? 1 : 0);
        parcel.writeString(i());
        parcel.writeByteArray(h() == null ? a : h().toByteArray());
        parcel.writeString(j());
        int i2 = 0;
        parcel.writeParcelable(b(), 0);
        parcel.writeLong(d().h() ? ((Long) d().c()).longValue() : -1L);
        parcel.writeInt(e().h() ? ((byte[]) e().c()).length : -1);
        if (e().h()) {
            parcel.writeByteArray((byte[]) e().c());
        }
        if (f() != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (f() != null) {
            parcel.writeByteArray(f().toByteArray());
        }
    }
}
