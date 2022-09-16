package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: ahmr  reason: default package */
/* loaded from: classes.dex */
public class ahmr extends ahjj {
    protected static final float[] m = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private final Surface i;
    private final SurfaceTexture j;
    private final azqb k;
    public float n;
    private final int[] o;
    private Canvas p;
    private boolean q;

    public ahmr(float f, float f2, ahon ahonVar, ahoo ahooVar, azqb azqbVar) {
        super(ahonVar, ahooVar, azqbVar);
        this.k = azqbVar;
        int[] iArr = new int[1];
        this.o = iArr;
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, iArr, 0);
        ahom.g(iArr[0]);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        this.j = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(s(f), s(f2));
        this.i = new Surface(surfaceTexture);
        this.n = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int s(float f) {
        return Math.round(f / 0.1f);
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public void i() {
        this.i.release();
        this.j.release();
        super.i();
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public void m(ahjy ahjyVar) {
        super.m(ahjyVar);
        if (this.q) {
            this.j.updateTexImage();
            this.q = false;
        }
    }

    @Override // defpackage.ahjj
    protected final boolean p() {
        return true;
    }

    @Override // defpackage.ahjj
    public final void q() {
        GLES20.glActiveTexture(33984);
        GLES20.glBlendFunc(770, 771);
        GLES20.glBindTexture(36197, this.o[0]);
        GLES20.glUniform1f(((ahrx) this.k.get()).i, this.n);
        GLES20.glUniform2f(((ahrv) this.k.get()).b, 1.0f, 1.0f);
        GLES20.glUniform2f(((ahrv) this.k.get()).d, 0.0f, 0.0f);
        Boolean bool = ahom.a;
    }

    public final Canvas t() {
        this.p = null;
        if (this.i.isValid()) {
            Canvas lockCanvas = this.i.lockCanvas(null);
            this.p = lockCanvas;
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(float f, float f2) {
        this.j.setDefaultBufferSize(s(f), s(f2));
    }

    public final void x() {
        Canvas canvas = this.p;
        if (canvas != null) {
            this.i.unlockCanvasAndPost(canvas);
            this.q = true;
        }
        this.p = null;
    }
}
