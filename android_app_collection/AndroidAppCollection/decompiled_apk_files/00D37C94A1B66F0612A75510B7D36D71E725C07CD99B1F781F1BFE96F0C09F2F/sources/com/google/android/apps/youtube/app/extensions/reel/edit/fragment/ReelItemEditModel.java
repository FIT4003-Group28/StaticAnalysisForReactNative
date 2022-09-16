package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ReelItemEditModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gta(8);

    public static hon g() {
        hon honVar = new hon();
        honVar.c(false);
        return honVar;
    }

    public abstract hon a();

    public abstract EditableVideoEdits b();

    public abstract VideoMetaData c();

    public abstract RecordingInfo d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract boolean f();

    public final vqr h() {
        return new vqr(b(), c());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(d(), i);
        parcel.writeParcelable(c(), i);
        parcel.writeParcelable(b(), i);
        parcel.writeString(e());
        parcel.writeByte(f() ? (byte) 1 : (byte) 0);
    }
}
