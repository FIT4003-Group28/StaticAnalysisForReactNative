package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cs(11);
    public final Object b;
    public ih c;
    public final Object a = new Object();
    public bpf d = null;

    public MediaSessionCompat$Token(Object obj, ih ihVar) {
        this.b = obj;
        this.c = ihVar;
    }

    public final ih a() {
        ih ihVar;
        synchronized (this.a) {
            ihVar = this.c;
        }
        return ihVar;
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
