package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LensImage implements Parcelable {
    public static final Parcelable.Creator<LensImage> CREATOR = new csfp();
    @dzsi
    private final Bundle a;
    @dzsi
    private BinderBitmap b;

    public LensImage(Bitmap bitmap, @dzsi String str) {
        this.b = new BinderBitmap(bitmap.isMutable() ? bitmap.copy(bitmap.getConfig(), false) : bitmap);
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putParcelable("BinderBitmap", this.b);
        if (str != null) {
            bundle.putString("FifeUrl", str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public LensImage(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle;
        if (readBundle != null) {
            this.b = (BinderBitmap) readBundle.getParcelable("BinderBitmap");
            readBundle.getString("FifeUrl");
            Uri uri = (Uri) readBundle.getParcelable("BitmapUri");
        }
    }
}
