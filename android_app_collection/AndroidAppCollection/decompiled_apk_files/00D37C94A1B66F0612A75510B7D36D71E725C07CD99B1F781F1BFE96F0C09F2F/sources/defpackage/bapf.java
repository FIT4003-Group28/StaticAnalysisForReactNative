package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;
/* compiled from: PG */
/* renamed from: bapf  reason: default package */
/* loaded from: classes2.dex */
public class bapf {
    static final float[] a = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] b = new float[6];
    private int c;
    private int d;
    private final bape e;
    private VideoFrame f;
    private final Matrix g;

    public bapf() {
        new Point();
        this.e = new bape();
        this.g = new Matrix();
    }

    public static void c(baob baobVar, bapd bapdVar, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(bapdVar.b());
        matrix2.preConcat(matrix);
        float[] g = bapa.g(matrix2);
        if (bapdVar.c() - 1 != 0) {
            baobVar.b(bapdVar.a(), g, i, i2, i3, i4, i5, i6);
        } else {
            baobVar.a(bapdVar.a(), g, i, i2, i3, i4, i5, i6);
        }
    }

    private static int d(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot(f3 - f, f4 - f2));
    }

    public void a() {
        bape bapeVar = this.e;
        bapeVar.a = null;
        int[] iArr = bapeVar.b;
        if (iArr != null) {
            GLES20.glDeleteTextures(3, iArr, 0);
            bapeVar.b = null;
        }
        this.f = null;
    }

    public void b(VideoFrame videoFrame, baob baobVar, Matrix matrix, int i, int i2) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int b = videoFrame.b();
        int a2 = videoFrame.a();
        if (matrix == null) {
            this.c = b;
            this.d = a2;
        } else {
            matrix.mapPoints(this.b, a);
            for (int i3 = 0; i3 < 3; i3++) {
                float[] fArr = this.b;
                int i4 = i3 + i3;
                fArr[i4] = fArr[i4] * b;
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] * a2;
            }
            float[] fArr2 = this.b;
            this.c = d(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
            float[] fArr3 = this.b;
            a2 = d(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
            this.d = a2;
        }
        int i6 = this.c;
        if (i6 <= 0 || a2 <= 0) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Illegal frame size: ");
            sb.append(i6);
            sb.append("x");
            sb.append(a2);
            Logging.d("VideoFrameDrawer", sb.toString());
            return;
        }
        boolean z = videoFrame.getBuffer() instanceof bapd;
        this.g.reset();
        this.g.preTranslate(0.5f, 0.5f);
        if (!z) {
            this.g.preScale(1.0f, -1.0f);
        }
        this.g.preRotate(videoFrame.getRotation());
        this.g.preTranslate(-0.5f, -0.5f);
        if (matrix != null) {
            this.g.preConcat(matrix);
        }
        if (z) {
            this.f = null;
            c(baobVar, (bapd) videoFrame.getBuffer(), this.g, this.c, this.d, 0, 0, i, i2);
            return;
        }
        if (videoFrame != this.f) {
            this.f = videoFrame;
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            bape bapeVar = this.e;
            int[] iArr = {i420.getStrideY(), i420.getStrideU(), i420.getStrideV()};
            ByteBuffer[] byteBufferArr = {i420.getDataY(), i420.getDataU(), i420.getDataV()};
            int width = i420.getWidth();
            int height = i420.getHeight();
            int i7 = width / 2;
            int[] iArr2 = {width, i7, i7};
            int i8 = height / 2;
            int[] iArr3 = {height, i8, i8};
            int i9 = 0;
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                if (i11 > i12) {
                    i9 = Math.max(i9, i12 * iArr3[i10]);
                }
            }
            if (i9 > 0 && ((byteBuffer2 = bapeVar.a) == null || byteBuffer2.capacity() < i9)) {
                bapeVar.a = ByteBuffer.allocateDirect(i9);
            }
            if (bapeVar.b == null) {
                bapeVar.b = new int[3];
                for (int i13 = 0; i13 < 3; i13++) {
                    bapeVar.b[i13] = banl.b(3553);
                }
            }
            for (int i14 = 0; i14 < 3; i14++) {
                GLES20.glActiveTexture(i14 + 33984);
                GLES20.glBindTexture(3553, bapeVar.b[i14]);
                int i15 = iArr[i14];
                int i16 = iArr2[i14];
                if (i15 == i16) {
                    byteBuffer = byteBufferArr[i14];
                } else {
                    YuvHelper.nativeCopyPlane(byteBufferArr[i14], i15, bapeVar.a, i16, i16, iArr3[i14]);
                    byteBuffer = bapeVar.a;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i14], iArr3[i14], 0, 6409, 5121, byteBuffer);
            }
            i420.release();
        }
        int[] iArr4 = this.e.b;
        ((bane) baobVar).d(3, bapa.g(this.g), this.c);
        for (int i17 = 0; i17 < 3; i17++) {
            GLES20.glActiveTexture(i17 + 33984);
            GLES20.glBindTexture(3553, iArr4[i17]);
        }
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i18 = 0; i18 < 3; i18++) {
            GLES20.glActiveTexture(i18 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
