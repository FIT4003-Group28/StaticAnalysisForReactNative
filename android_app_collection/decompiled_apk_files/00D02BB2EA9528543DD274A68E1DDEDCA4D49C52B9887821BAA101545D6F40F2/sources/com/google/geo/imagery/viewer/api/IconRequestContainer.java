package com.google.geo.imagery.viewer.api;

import android.graphics.Bitmap;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IconRequestContainer {
    protected boolean a = true;
    private long b;

    public IconRequestContainer(long j) {
        this.b = j;
    }

    public final synchronized void a() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                IconServiceSwigJNI.delete_IconRequestContainer(j);
            }
            this.b = 0L;
        }
    }

    public final void b(@dzsi Bitmap bitmap) {
        if (bitmap == null) {
            d(null);
        } else {
            d(Image.c(bitmap));
        }
    }

    public final IconSource c() {
        byte[] IconRequestContainer_rawRequest = IconServiceSwigJNI.IconRequestContainer_rawRequest(this.b, this);
        if (IconRequestContainer_rawRequest != null) {
            try {
                return (IconSource) dsqw.cq(IconSource.d, IconRequestContainer_rawRequest);
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.IconSource protocol message.", e);
            }
        }
        return null;
    }

    public final void d(Image image) {
        IconServiceSwigJNI.IconRequestContainer_onCompleteImage(this.b, this, Image.a(image), image);
    }

    protected final void finalize() {
        a();
    }
}
