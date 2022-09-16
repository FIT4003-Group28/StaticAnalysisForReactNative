package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class VideoDetailsCollapsed implements Parcelable {
    public static final VideoDetailsCollapsed a = d().a();
    public static final Parcelable.Creator CREATOR = new m();

    public static n d() {
        n nVar = new n();
        nVar.a = null;
        nVar.b = null;
        nVar.b(aoob.b);
        return nVar;
    }

    public abstract aoob a();

    public abstract CharSequence b();

    public abstract CharSequence c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoDetailsCollapsed)) {
            return false;
        }
        VideoDetailsCollapsed videoDetailsCollapsed = (VideoDetailsCollapsed) obj;
        return TextUtils.equals(c(), videoDetailsCollapsed.c()) && TextUtils.equals(b(), videoDetailsCollapsed.b()) && a().equals(videoDetailsCollapsed.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(c(), parcel, i);
        TextUtils.writeToParcel(b(), parcel, i);
        parcel.writeByteArray(a().I());
    }
}
