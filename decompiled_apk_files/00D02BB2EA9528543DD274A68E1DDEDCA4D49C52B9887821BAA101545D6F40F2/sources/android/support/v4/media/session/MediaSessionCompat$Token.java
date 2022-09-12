package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new ml();
    public final Object a = new Object();
    public final Object b;
    public lx c;

    public MediaSessionCompat$Token(Object obj, lx lxVar) {
        this.b = obj;
        this.c = lxVar;
    }

    public static MediaSessionCompat$Token a(Object obj, lx lxVar) {
        if (obj != null) {
            return new MediaSessionCompat$Token(obj, lxVar);
        }
        return null;
    }

    public final lx b() {
        lx lxVar;
        synchronized (this.a) {
            lxVar = this.c;
        }
        return lxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            return mediaSessionCompat$Token.b == null;
        }
        Object obj3 = mediaSessionCompat$Token.b;
        if (obj3 != null) {
            return obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
