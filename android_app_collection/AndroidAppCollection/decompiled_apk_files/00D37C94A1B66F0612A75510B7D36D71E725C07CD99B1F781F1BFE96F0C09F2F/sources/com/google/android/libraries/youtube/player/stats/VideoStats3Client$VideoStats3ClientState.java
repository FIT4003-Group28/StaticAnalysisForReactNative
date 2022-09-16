package com.google.android.libraries.youtube.player.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoStats3Client$VideoStats3ClientState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(9);
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final boolean f;
    public final int g;
    public final long h;
    public final float i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Vss3ConfigModel m;
    public final boolean n;
    public final long o;
    public final awey p;
    public final long q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final aopa u;
    public final aopa v;
    private final long w;

    public VideoStats3Client$VideoStats3ClientState(long j, long j2, String str, String str2, long j3, boolean z, float f, int i, long j4, String str3, boolean z2, boolean z3, long j5, Vss3ConfigModel vss3ConfigModel, boolean z4, long j6, aopa aopaVar, aopa aopaVar2, awey aweyVar, long j7, boolean z5, boolean z6, int i2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = z;
        this.i = f;
        this.g = i;
        this.h = j4;
        this.j = str3;
        this.k = z2;
        this.l = z3;
        this.w = j5;
        this.m = vss3ConfigModel;
        this.n = z4;
        this.o = j6;
        this.u = aopaVar;
        this.v = aopaVar2;
        this.p = aweyVar;
        this.q = j7;
        this.r = z5;
        this.s = z6;
        this.t = i2;
    }

    public VideoStats3Client$VideoStats3ClientState(Parcel parcel) {
        this.m = (Vss3ConfigModel) parcel.readParcelable(VideoStats3Client$VideoStats3ClientState.class.getClassLoader());
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = zgh.h(parcel.readString());
        this.d = zgh.h(parcel.readString());
        this.e = parcel.readLong();
        boolean z = false;
        this.f = parcel.readInt() == 1;
        this.i = parcel.readFloat();
        this.g = parcel.readInt();
        this.h = parcel.readLong();
        this.j = zgh.h(parcel.readString());
        this.k = parcel.readInt() == 1;
        this.l = parcel.readInt() == 1;
        this.w = parcel.readLong();
        this.n = parcel.readInt() == 1;
        this.o = parcel.readLong();
        this.u = ((awex) zgd.J(parcel, awex.a)).mo52toBuilder();
        this.v = ((awey) zgd.J(parcel, awey.a)).mo52toBuilder();
        this.p = (awey) zgd.J(parcel, awey.a);
        this.q = parcel.readLong();
        this.r = parcel.readInt() == 1;
        this.s = parcel.readInt() == 1 ? true : z;
        this.t = awwc.P(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        long j = this.a;
        long j2 = this.b;
        String str2 = this.c;
        String str3 = this.d;
        long j3 = this.e;
        float f = this.i;
        String str4 = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.n;
        long j4 = this.o;
        long j5 = this.q;
        boolean z4 = this.r;
        boolean z5 = this.s;
        int i = this.t;
        switch (i) {
            case 1:
                str = "PLAYER_PLAYBACK_STATE_UNKNOWN";
                break;
            case 2:
                str = "PLAYER_PLAYBACK_STATE_PLAYING";
                break;
            case 3:
                str = "PLAYER_PLAYBACK_STATE_PAUSED";
                break;
            case 4:
                str = "PLAYER_PLAYBACK_STATE_BUFFERING";
                break;
            case 5:
                str = "PLAYER_PLAYBACK_STATE_PAUSED_BUFFERING";
                break;
            case 6:
                str = "PLAYER_PLAYBACK_STATE_SEEKING";
                break;
            case 7:
                str = "PLAYER_PLAYBACK_STATE_ENDED";
                break;
            case 8:
                str = "PLAYER_PLAYBACK_STATE_ERROR";
                break;
            case 9:
                str = "PLAYER_PLAYBACK_STATE_SUSPENDED";
                break;
            case 10:
                str = "PLAYER_PLAYBACK_STATE_UNSTARTED";
                break;
            default:
                str = "null";
                break;
        }
        String str5 = str;
        if (i != 0) {
            int length = String.valueOf(str2).length();
            int length2 = String.valueOf(str3).length();
            StringBuilder sb = new StringBuilder(length + 410 + length2 + String.valueOf(str4).length() + str5.length());
            sb.append("VideoStats3Client.VideoStats3ClientState{ currentPlaybackPosition=");
            sb.append(j);
            sb.append(" videoLengthMillis=");
            sb.append(j2);
            sb.append(" videoId=");
            sb.append(str2);
            sb.append(" cpn=");
            sb.append(str3);
            sb.append(" watchTimeMillis=");
            sb.append(j3);
            sb.append(" playbackRate=");
            sb.append(f);
            sb.append(" captionTrack=");
            sb.append(str4);
            sb.append(" autoplay=");
            sb.append(z);
            sb.append(" isLive=");
            sb.append(z2);
            sb.append(" finalPingSent=");
            sb.append(z3);
            sb.append(" sessionStartTimeStamp=");
            sb.append(j4);
            sb.append("activeSegmentStartWalltimeMillis=");
            sb.append(j5);
            sb.append(" isReuse=");
            sb.append(z4);
            sb.append(" isReleased=");
            sb.append(z5);
            sb.append(" playbackState=");
            sb.append(str5);
            sb.append("}");
            return sb.toString();
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, 0);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeFloat(this.i);
        parcel.writeInt(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeLong(this.w);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeLong(this.o);
        zgd.K(this.u.mo39build(), parcel);
        zgd.K(this.v.mo39build(), parcel);
        zgd.K(this.p, parcel);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        int i2 = this.t;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }
}
