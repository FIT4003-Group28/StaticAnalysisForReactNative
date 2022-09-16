package com.google.android.libraries.youtube.mdx.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class AppStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(10);

    public static adhw c() {
        adhw adhwVar = new adhw(null);
        adhwVar.f(true);
        adhwVar.d(false);
        adhwVar.c(false);
        return adhwVar;
    }

    public static AppStatus d(int i) {
        adhw c = c();
        c.e(i);
        c.b(new HashMap());
        return c.a();
    }

    public abstract int a();

    public abstract Uri b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract ScreenId e();

    public abstract ampq f();

    public abstract String g();

    public abstract Map h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract adit l();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeParcelable(b(), i);
        parcel.writeString(g());
        parcel.writeSerializable(e());
        parcel.writeByte(k() ? (byte) 1 : (byte) 0);
        parcel.writeByte(j() ? (byte) 1 : (byte) 0);
        parcel.writeByte(i() ? (byte) 1 : (byte) 0);
        Map h = h();
        parcel.writeInt(h.size());
        for (Map.Entry entry : h.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
