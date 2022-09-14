package com.google.android.apps.auto.sdk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SearchItem extends AbstractBundleable {
    public static final Parcelable.Creator<SearchItem> CREATOR = new cld(SearchItem.class);
    public int a;
    public Bundle b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public int g;
    public Bitmap h;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("type", this.a);
        bundle.putBundle("extras", this.b);
        bundle.putCharSequence("title", this.c);
        bundle.putCharSequence("subtitle", this.d);
        bundle.putCharSequence("description", this.e);
        bundle.putCharSequence("sub_description", this.f);
        bundle.putInt("icon_res_id", this.g);
        bundle.putParcelable("icon_bitmap_id", this.h);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getInt("type");
        this.b = bundle.getBundle("extras");
        CharSequence charSequence = bundle.getCharSequence("title");
        this.c = charSequence;
        if (charSequence != null) {
            this.c = charSequence.toString();
        }
        CharSequence charSequence2 = bundle.getCharSequence("subtitle");
        this.d = charSequence2;
        if (charSequence2 != null) {
            this.d = charSequence2.toString();
        }
        this.e = bundle.getCharSequence("description");
        this.f = bundle.getCharSequence("sub_description");
        this.g = bundle.getInt("icon_res_id");
        this.h = (Bitmap) bundle.getParcelable("icon_bitmap_id");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final String toString() {
        return "[SearchItem type " + this.a + ", extras " + this.b + ", title " + this.c + ", subtitle " + this.d + ", description " + this.e + ", sub-description " + this.f + ", iconResId " + this.g + ", iconBitmap " + this.h + "]";
    }
}
