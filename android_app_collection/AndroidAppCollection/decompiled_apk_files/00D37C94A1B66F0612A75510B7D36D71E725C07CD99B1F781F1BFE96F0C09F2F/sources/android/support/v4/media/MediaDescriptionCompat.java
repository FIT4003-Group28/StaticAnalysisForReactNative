package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cs(6);
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;
    public final Uri d;
    private final String e;
    private final CharSequence f;
    private final Bundle g;
    private final Uri h;
    private MediaDescription i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.e = str;
        this.a = charSequence;
        this.b = charSequence2;
        this.f = charSequence3;
        this.c = bitmap;
        this.d = uri;
        this.g = bundle;
        this.h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L76
            ia r1 = new ia
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = defpackage.hy.i(r8)
            r1.a = r2
            java.lang.CharSequence r2 = defpackage.hy.h(r8)
            r1.b = r2
            java.lang.CharSequence r2 = defpackage.hy.g(r8)
            r1.c = r2
            java.lang.CharSequence r2 = defpackage.hy.f(r8)
            r1.d = r2
            android.graphics.Bitmap r2 = defpackage.hy.a(r8)
            r1.e = r2
            android.net.Uri r2 = defpackage.hy.d(r8)
            r1.f = r2
            android.os.Bundle r2 = defpackage.hy.e(r8)
            if (r2 == 0) goto L38
            android.os.Bundle r2 = defpackage.iz.a(r2)
        L38:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L43
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L44
        L43:
            r4 = r0
        L44:
            if (r4 == 0) goto L5c
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L56
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L56
            goto L5d
        L56:
            r2.remove(r3)
            r2.remove(r5)
        L5c:
            r0 = r2
        L5d:
            r1.g = r0
            if (r4 == 0) goto L64
            r1.h = r4
            goto L70
        L64:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L70
            android.net.Uri r0 = defpackage.hz.a(r8)
            r1.h = r0
        L70:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.i = r8
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.a) + ", " + ((Object) this.b) + ", " + ((Object) this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescription = this.i;
        if (mediaDescription == null) {
            MediaDescription.Builder b = hy.b();
            hy.n(b, this.e);
            hy.p(b, this.a);
            hy.o(b, this.b);
            hy.j(b, this.f);
            hy.l(b, this.c);
            hy.m(b, this.d);
            Bundle bundle = this.g;
            if (Build.VERSION.SDK_INT < 23 && this.h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
            }
            hy.k(b, bundle);
            if (Build.VERSION.SDK_INT >= 23) {
                hz.b(b, this.h);
            }
            mediaDescription = hy.c(b);
            this.i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
