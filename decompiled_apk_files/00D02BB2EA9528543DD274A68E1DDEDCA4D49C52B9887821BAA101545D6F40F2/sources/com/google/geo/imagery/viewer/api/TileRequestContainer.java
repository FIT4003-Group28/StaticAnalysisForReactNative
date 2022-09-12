package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TileRequestContainer {
    public long a;
    protected boolean b = true;

    public TileRequestContainer(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                TileServiceSwigJNI.delete_TileRequestContainer(j);
            }
            this.a = 0L;
        }
    }

    public final void b(Image image) {
        TileServiceSwigJNI.TileRequestContainer_onCompleteImage(this.a, this, Image.a(image), image);
    }

    protected final void finalize() {
        a();
    }
}
