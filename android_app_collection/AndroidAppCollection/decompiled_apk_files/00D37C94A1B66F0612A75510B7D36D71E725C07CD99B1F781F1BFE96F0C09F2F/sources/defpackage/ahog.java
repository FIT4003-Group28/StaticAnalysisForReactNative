package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import com.google.android.exoplayer.ColorInfo;
import com.google.android.exoplayer.youtube.libvpx.VpxOutputBuffer;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ahog  reason: default package */
/* loaded from: classes.dex */
public final class ahog implements pgg, pxs, ahor {
    private final int[] a;
    private final float[] b;
    private final Handler c;
    private final AtomicReference d;
    private int e = 2;
    private float f;
    private ahpj g;
    private long h;
    private ByteBuffer i;

    public ahog(Handler handler) {
        int[] iArr = new int[3];
        this.a = iArr;
        this.c = handler;
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            ahom.g(this.a[i]);
        }
        this.d = new AtomicReference();
        float[] fArr = new float[16];
        this.b = fArr;
        Matrix.setIdentityM(fArr, 0);
        fArr[5] = -1.0f;
        fArr[13] = 1.0f;
    }

    @Override // defpackage.ahor
    public final float a() {
        return this.f;
    }

    @Override // defpackage.ahor
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ahor
    public final long c() {
        return this.h;
    }

    @Override // defpackage.ahor
    public final ahpj d() {
        return this.g;
    }

    @Override // defpackage.ahor
    public final ByteBuffer e() {
        return this.i;
    }

    @Override // defpackage.ahor
    public final void f() {
        ByteBuffer byteBuffer = null;
        ahpk ahpkVar = (ahpk) this.d.getAndSet(null);
        int i = 0;
        while (i < 3) {
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.a[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (ahpkVar != null) {
                int a = i == 0 ? ahpkVar.a() : (ahpkVar.a() + 1) / 2;
                GLES20.glPixelStorei(3317, 1);
                int i2 = ahpkVar.c()[i];
                VpxOutputBuffer vpxOutputBuffer = ahpkVar.b;
                GLES20.glTexImage2D(3553, 0, 6409, i2, a, 0, 6409, 5121, (vpxOutputBuffer != null ? vpxOutputBuffer.yuvPlanes : ahpkVar.c.yuvPlanes)[i]);
            }
            i++;
        }
        if (ahpkVar == null) {
            return;
        }
        VpxOutputBuffer vpxOutputBuffer2 = ahpkVar.b;
        this.e = vpxOutputBuffer2 != null ? vpxOutputBuffer2.colorspace : ahpkVar.c.colorspace;
        this.g = ahpkVar.d;
        this.f = ((vpxOutputBuffer2 != null ? vpxOutputBuffer2.width : ahpkVar.c.width) - 0.5f) / ahpkVar.c()[0];
        VpxOutputBuffer vpxOutputBuffer3 = ahpkVar.b;
        this.h = vpxOutputBuffer3 != null ? vpxOutputBuffer3.timestampUs : ahpkVar.c.timeUs;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = ahpkVar.c;
        if (videoDecoderOutputBuffer != null) {
            byteBuffer = videoDecoderOutputBuffer.supplementalData;
        }
        if (byteBuffer != null) {
            int limit = byteBuffer.limit();
            ByteBuffer byteBuffer2 = this.i;
            if (byteBuffer2 == null || byteBuffer2.capacity() < limit) {
                this.i = ByteBuffer.allocate(limit);
            }
            this.i.clear();
            this.i.put(byteBuffer);
            this.i.flip();
        }
        ahpkVar.b();
        Boolean bool = ahom.a;
    }

    @Override // defpackage.ahor
    public final void g() {
        this.c.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.ahor
    public final void h() {
    }

    @Override // defpackage.ahor
    public final float[] i() {
        return this.b;
    }

    @Override // defpackage.ahor
    public final int j() {
        return 2;
    }

    public final void k() {
        GLES20.glDeleteTextures(3, this.a, 0);
        Boolean bool = ahom.a;
        for (int i = 0; i < 3; i++) {
            this.a[i] = 0;
        }
    }

    public final synchronized void l(ahpk ahpkVar) {
        ahpk ahpkVar2 = (ahpk) this.d.getAndSet(ahpkVar);
        if (ahpkVar2 != null) {
            ahpkVar2.b();
        }
    }

    @Override // defpackage.pgg
    public final synchronized void rR(VpxOutputBuffer vpxOutputBuffer) {
        ahpk ahpkVar = (ahpk) ahpk.a.a();
        if (ahpkVar == null) {
            ahpkVar = new ahpk();
        }
        vpxOutputBuffer.getClass();
        ahpkVar.b = vpxOutputBuffer;
        ahpkVar.c = null;
        ColorInfo colorInfo = vpxOutputBuffer.colorInfo;
        if (colorInfo != null) {
            ahpkVar.d = new ahpj(colorInfo);
        } else {
            ahpkVar.d = null;
        }
        l(ahpkVar);
    }

    @Override // defpackage.pxs
    public final synchronized void rS(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ahpk ahpkVar = (ahpk) ahpk.a.a();
        if (ahpkVar == null) {
            ahpkVar = new ahpk();
        }
        ahpkVar.b = null;
        videoDecoderOutputBuffer.getClass();
        ahpkVar.c = videoDecoderOutputBuffer;
        androidx.media3.common.ColorInfo colorInfo = videoDecoderOutputBuffer.format.x;
        if (colorInfo != null) {
            ahpkVar.d = new ahpj(colorInfo);
        } else {
            ahpkVar.d = null;
        }
        l(ahpkVar);
    }
}
