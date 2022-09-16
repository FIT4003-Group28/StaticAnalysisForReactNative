package com.google.android.odml.image;
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ImageProperties {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public abstract class Builder {
        abstract ImageProperties build();

        abstract Builder setImageFormat(int i);

        abstract Builder setStorageType(int i);
    }

    static Builder builder() {
        return new alqu();
    }

    public abstract int a();

    public abstract int b();
}
