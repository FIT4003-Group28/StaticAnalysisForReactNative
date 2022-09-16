package defpackage;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
/* compiled from: PG */
/* renamed from: bapm  reason: default package */
/* loaded from: classes2.dex */
public final class bapm {
    public final baoz a;
    public final banh b;
    public final bane c;
    public final bapf d;
    private final bapl e;

    public bapm() {
        bapf bapfVar = new bapf();
        baoz baozVar = new baoz();
        this.a = baozVar;
        this.b = new banh(6408);
        bapl baplVar = new bapl();
        this.e = baplVar;
        this.c = new bane("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", baplVar);
        this.d = bapfVar;
        baozVar.b();
    }

    public final VideoFrame.I420Buffer a(bapd bapdVar) {
        try {
            bapdVar.getWidth();
            bapdVar.getHeight();
            bapdVar.retain();
            int width = bapdVar.getWidth();
            int height = bapdVar.getHeight();
            int i = ((width + 7) / 8) * 8;
            int i2 = (height + 1) / 2;
            int i3 = height + i2;
            ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i * i3);
            int i4 = i / 4;
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            this.b.b(i4, i3);
            GLES20.glBindFramebuffer(36160, this.b.a);
            banl.d("glBindFramebuffer");
            bapl baplVar = this.e;
            baplVar.d = bapl.a;
            baplVar.e = 1.0f;
            bapf.c(this.c, bapdVar, matrix, width, height, 0, 0, i4, height);
            bapl baplVar2 = this.e;
            baplVar2.d = bapl.b;
            baplVar2.e = 2.0f;
            int i5 = i4 / 2;
            bapf.c(this.c, bapdVar, matrix, width, height, 0, height, i5, i2);
            bapl baplVar3 = this.e;
            baplVar3.d = bapl.c;
            baplVar3.e = 2.0f;
            bapf.c(this.c, bapdVar, matrix, width, height, i5, height, i5, i2);
            banh banhVar = this.b;
            GLES20.glReadPixels(0, 0, banhVar.c, banhVar.d, 6408, 5121, nativeAllocateByteBuffer);
            banl.d("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
            int i6 = i * height;
            int i7 = i / 2;
            int i8 = i6 + i7;
            nativeAllocateByteBuffer.position(0);
            nativeAllocateByteBuffer.limit(i6);
            ByteBuffer slice = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i6);
            int i9 = (i * (i2 - 1)) + i7;
            nativeAllocateByteBuffer.limit(i6 + i9);
            ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i8);
            nativeAllocateByteBuffer.limit(i8 + i9);
            ByteBuffer slice3 = nativeAllocateByteBuffer.slice();
            bapdVar.release();
            return JavaI420Buffer.b(width, height, slice, i, slice2, i, slice3, i, new bapk(nativeAllocateByteBuffer));
        } catch (GLException e) {
            Logging.e("YuvConverter", "Failed to convert TextureBuffer", e);
            return null;
        }
    }
}
