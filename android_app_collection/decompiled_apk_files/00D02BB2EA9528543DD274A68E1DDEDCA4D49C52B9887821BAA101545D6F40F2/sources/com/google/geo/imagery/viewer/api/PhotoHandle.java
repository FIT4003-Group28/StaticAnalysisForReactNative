package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhotoHandle {
    public long a;
    protected boolean b = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public PhotoHandle(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                RendererSwigJNI.delete_PhotoHandle(j);
            }
            this.a = 0L;
        }
    }

    public final dftd b() {
        byte[] PhotoHandle_getPhotoId = RendererSwigJNI.PhotoHandle_getPhotoId(this.a, this);
        if (PhotoHandle_getPhotoId != null) {
            try {
                return (dftd) dsqw.cq(dftd.d, PhotoHandle_getPhotoId);
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.PhotoId protocol message.", e);
            }
        }
        return null;
    }

    protected final void finalize() {
        a();
    }
}
