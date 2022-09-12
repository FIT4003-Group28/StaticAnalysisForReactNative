package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Callback {
    private long a;
    protected boolean o;

    public Callback() {
        this(RendererSwigJNI.new_Callback(), true);
        RendererSwigJNI.Callback_director_connect(this, this.a, this.o, true);
    }

    protected Callback(long j, boolean z) {
        this.o = true;
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long getCPtr(Callback callback) {
        if (callback == null) {
            return 0L;
        }
        return callback.a;
    }

    public synchronized void delete() {
        long j = this.a;
        if (j != 0) {
            if (this.o) {
                this.o = false;
                RendererSwigJNI.delete_Callback(j);
            }
            this.a = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public void onComplete(int i, PhotoHandle photoHandle) {
        if (getClass() == Callback.class) {
            RendererSwigJNI.Callback_onComplete(this.a, this, i, photoHandle.a, photoHandle);
        } else {
            RendererSwigJNI.Callback_onCompleteSwigExplicitCallback(this.a, this, i, photoHandle.a, photoHandle);
        }
    }

    protected void swigDirectorDisconnect() {
        this.o = false;
        delete();
    }
}
