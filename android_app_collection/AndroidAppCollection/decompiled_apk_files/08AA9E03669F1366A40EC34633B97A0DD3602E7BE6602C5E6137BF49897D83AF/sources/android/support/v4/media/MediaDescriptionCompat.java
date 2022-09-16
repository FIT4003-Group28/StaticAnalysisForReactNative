package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() { // from class: android.support.v4.media.MediaDescriptionCompat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final String f564a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f565b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f566c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f567d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private final Uri h;
    private Object i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f564a = str;
        this.f565b = charSequence;
        this.f566c = charSequence2;
        this.f567d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f564a = parcel.readString();
        this.f565b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f566c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f567d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.e = (Bitmap) parcel.readParcelable(null);
        this.f = (Uri) parcel.readParcelable(null);
        this.g = parcel.readBundle();
        this.h = (Uri) parcel.readParcelable(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f564a);
            TextUtils.writeToParcel(this.f565b, parcel, i);
            TextUtils.writeToParcel(this.f566c, parcel, i);
            TextUtils.writeToParcel(this.f567d, parcel, i);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeBundle(this.g);
            parcel.writeParcelable(this.h, i);
            return;
        }
        android.support.v4.media.a.a(a(), parcel, i);
    }

    public String toString() {
        return ((Object) this.f565b) + ", " + ((Object) this.f566c) + ", " + ((Object) this.f567d);
    }

    public Object a() {
        if (this.i != null || Build.VERSION.SDK_INT < 21) {
            return this.i;
        }
        Object a2 = a.C0013a.a();
        a.C0013a.a(a2, this.f564a);
        a.C0013a.a(a2, this.f565b);
        a.C0013a.b(a2, this.f566c);
        a.C0013a.c(a2, this.f567d);
        a.C0013a.a(a2, this.e);
        a.C0013a.a(a2, this.f);
        Bundle bundle = this.g;
        if (Build.VERSION.SDK_INT < 23 && this.h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
        }
        a.C0013a.a(a2, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            b.a.b(a2, this.h);
        }
        this.i = a.C0013a.a(a2);
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L82
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L82
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.a.a(r6)
            r1.a(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.b(r6)
            r1.a(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.c(r6)
            r1.b(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.d(r6)
            r1.c(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.a.e(r6)
            r1.a(r2)
            android.net.Uri r2 = android.support.v4.media.a.f(r6)
            r1.a(r2)
            android.os.Bundle r2 = android.support.v4.media.a.g(r6)
            if (r2 != 0) goto L40
            r3 = r0
            goto L48
        L40:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
        L48:
            if (r3 == 0) goto L64
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L5a
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L5a
            goto L65
        L5a:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L64:
            r0 = r2
        L65:
            r1.a(r0)
            if (r3 == 0) goto L6e
            r1.b(r3)
            goto L7b
        L6e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L7b
            android.net.Uri r0 = android.support.v4.media.b.h(r6)
            r1.b(r0)
        L7b:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.i = r6
            return r0
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f568a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f569b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f570c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f571d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public a a(String str) {
            this.f568a = str;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f569b = charSequence;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.f570c = charSequence;
            return this;
        }

        public a c(CharSequence charSequence) {
            this.f571d = charSequence;
            return this;
        }

        public a a(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public a a(Uri uri) {
            this.f = uri;
            return this;
        }

        public a a(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public a b(Uri uri) {
            this.h = uri;
            return this;
        }

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f568a, this.f569b, this.f570c, this.f571d, this.e, this.f, this.g, this.h);
        }
    }
}
