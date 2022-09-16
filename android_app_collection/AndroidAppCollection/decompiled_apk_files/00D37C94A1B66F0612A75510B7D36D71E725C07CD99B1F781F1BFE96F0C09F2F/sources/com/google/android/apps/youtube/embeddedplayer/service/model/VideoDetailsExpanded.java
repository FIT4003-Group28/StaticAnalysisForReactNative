package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class VideoDetailsExpanded implements Parcelable {
    public static final VideoDetailsExpanded a = d().a();
    public static final Parcelable.Creator CREATOR = new m(2);

    public static o d() {
        o oVar = new o();
        oVar.a = null;
        oVar.b = null;
        oVar.b(aoob.b);
        return oVar;
    }

    public abstract aoob a();

    public abstract CharSequence b();

    public abstract CharSequence c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoDetailsExpanded)) {
            return false;
        }
        VideoDetailsExpanded videoDetailsExpanded = (VideoDetailsExpanded) obj;
        return TextUtils.equals(c(), videoDetailsExpanded.c()) && TextUtils.equals(b(), videoDetailsExpanded.b()) && a().equals(videoDetailsExpanded.a());
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
