package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IconRenderer {
    public long a;
    protected boolean b = true;

    public IconRenderer(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                IconRendererSwigJNI.delete_IconRenderer(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
