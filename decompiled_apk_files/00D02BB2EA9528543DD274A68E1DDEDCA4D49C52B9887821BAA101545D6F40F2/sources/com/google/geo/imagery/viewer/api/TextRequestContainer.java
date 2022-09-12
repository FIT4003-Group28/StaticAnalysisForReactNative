package com.google.geo.imagery.viewer.api;

import android.graphics.Bitmap;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextRequestContainer {
    public long a;
    protected boolean b = true;

    public TextRequestContainer(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                TextServiceSwigJNI.delete_TextRequestContainer(j);
            }
            this.a = 0L;
        }
    }

    public final void b(@dzsi Bitmap bitmap) {
        if (bitmap == null) {
            c(null);
        } else {
            c(Image.c(bitmap));
        }
    }

    public final void c(Image image) {
        TextServiceSwigJNI.TextRequestContainer_onCompleteImage(this.a, this, Image.a(image), image);
    }

    protected final void finalize() {
        a();
    }
}
