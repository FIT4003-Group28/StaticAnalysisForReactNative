package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IconHandle {
    public long a;
    protected boolean b = true;

    public IconHandle(long j) {
        this.a = j;
    }

    public static long a(IconHandle iconHandle) {
        if (iconHandle == null) {
            return 0L;
        }
        return iconHandle.a;
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                IconRendererSwigJNI.delete_IconHandle(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
