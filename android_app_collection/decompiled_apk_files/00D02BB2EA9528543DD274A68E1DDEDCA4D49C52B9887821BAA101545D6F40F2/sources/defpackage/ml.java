package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;
/* compiled from: PG */
/* renamed from: ml  reason: default package */
/* loaded from: classes7.dex */
public final class ml implements Parcelable.Creator<MediaSessionCompat$Token> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaSessionCompat$Token createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaSessionCompat$Token[] newArray(int i) {
        return new MediaSessionCompat$Token[i];
    }
}
