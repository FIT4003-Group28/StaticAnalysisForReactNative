package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(15);
    final int a;
    public final Uri b;
    public final int c;
    public final int d;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }

    public WebImage(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri != null) {
            if (i >= 0 && i2 >= 0) {
                return;
            }
            throw new IllegalArgumentException("width and height must not be negative");
        }
        throw new IllegalArgumentException("url cannot be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (tnk.j(this.b, webImage.b) && this.c == webImage.c && this.d == webImage.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.c), Integer.valueOf(this.d), this.b.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.E(parcel, 2, this.b, i);
        tqj.s(parcel, 3, this.c);
        tqj.s(parcel, 4, this.d);
        tqj.n(parcel, m);
    }
}
