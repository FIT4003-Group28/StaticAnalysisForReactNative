package com.google.android.libraries.youtube.player.video.state;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class DirectorSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(15);
    public final ajfl a;
    public final ajfl b;
    public final PlayerResponseModel c;
    public final PlaybackStartDescriptor d;
    public final boolean e;
    public final PlayerResponseModel f;
    public final String g;
    public final long h;
    public final String i;
    public final float j;
    public final boolean k;

    public DirectorSavedState(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = ajfl.b(parcel);
        this.b = parcel.readInt() != 0 ? ajfl.b(parcel) : null;
        this.c = (PlayerResponseModel) parcel.readParcelable(classLoader);
        this.d = (PlaybackStartDescriptor) parcel.readParcelable(classLoader);
        boolean z = true;
        this.e = parcel.readInt() != 0;
        this.f = (PlayerResponseModel) parcel.readParcelable(classLoader);
        this.g = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readString();
        this.j = parcel.readFloat();
        this.k = parcel.readInt() == 0 ? false : z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectorSavedState)) {
            return false;
        }
        DirectorSavedState directorSavedState = (DirectorSavedState) obj;
        return akzj.f(this.a, directorSavedState.a) && akzj.f(this.b, directorSavedState.b) && akzj.f(this.f, directorSavedState.f) && akzj.f(this.g, directorSavedState.g) && akzj.f(this.c, directorSavedState.c) && aijn.c(this.d, directorSavedState.d) && this.e == directorSavedState.e && this.h == directorSavedState.h && TextUtils.equals(this.i, directorSavedState.i) && this.j == directorSavedState.j && this.k == directorSavedState.k;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 527) * 31;
        ajfl ajflVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (ajflVar != null ? ajflVar.hashCode() : 0)) * 31;
        PlayerResponseModel playerResponseModel = this.c;
        int hashCode3 = (hashCode2 + (playerResponseModel != null ? playerResponseModel.hashCode() : 0)) * 31;
        PlaybackStartDescriptor playbackStartDescriptor = this.d;
        int hashCode4 = (((hashCode3 + (playbackStartDescriptor != null ? playbackStartDescriptor.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        PlayerResponseModel playerResponseModel2 = this.f;
        int hashCode5 = (hashCode4 + (playerResponseModel2 != null ? playerResponseModel2.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode6 = str != null ? str.hashCode() : 0;
        long j = this.h;
        int i2 = (((((hashCode5 + hashCode6) * 31) + ((int) (j >> 32))) * 31) + ((int) j)) * 31;
        String str2 = this.i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((i2 + i) * 31) + Float.floatToIntBits(this.j)) * 31) + (this.k ? 1 : 0);
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf5 = String.valueOf(this.f);
        String str = this.g;
        long j = this.h;
        String str2 = this.i;
        float f = this.j;
        boolean z2 = this.k;
        int length = String.valueOf(hexString).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 299 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("DirectorSavedState{");
        sb.append(hexString);
        sb.append(" contentVideoState=");
        sb.append(valueOf);
        sb.append(" interstitialVideoState=");
        sb.append(valueOf2);
        sb.append(" playerResponse=");
        sb.append(valueOf3);
        sb.append(" playbackStartDescriptor=");
        sb.append(valueOf4);
        sb.append(" userInitiatedPlayback=");
        sb.append(z);
        sb.append(" interstitialPlayerResponse=");
        sb.append(valueOf5);
        sb.append(" interstitialCpn=");
        sb.append(str);
        sb.append(" adStartPositionMillis=");
        sb.append(j);
        sb.append(" videoCpn=");
        sb.append(str2);
        sb.append(" contentPlaybackRate=");
        sb.append(f);
        sb.append(" fatalPlaybackErrorOccurred=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.c(parcel);
        parcel.writeInt(this.b != null ? 1 : 0);
        ajfl ajflVar = this.b;
        if (ajflVar != null) {
            ajflVar.c(parcel);
        }
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeFloat(this.j);
        parcel.writeInt(this.k ? 1 : 0);
    }

    public DirectorSavedState(ajfl ajflVar, ajfl ajflVar2, PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, boolean z, PlayerResponseModel playerResponseModel2, String str, long j, String str2, float f, boolean z2) {
        ajflVar.getClass();
        this.a = ajflVar;
        this.b = ajflVar2;
        this.c = playerResponseModel;
        this.d = playbackStartDescriptor;
        this.e = z;
        this.f = playerResponseModel2;
        this.g = str;
        this.h = j;
        this.i = str2;
        this.j = f;
        this.k = z2;
    }
}
