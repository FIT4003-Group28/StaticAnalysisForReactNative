package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: zpj  reason: default package */
/* loaded from: classes4.dex */
final class zpj {
    public static final float[] a = new float[16];
    public static final float[] b = new float[16];
    final ask c;
    final float d;
    final float[] e;
    final aoie f;
    final zod g;
    final int h;
    final int i;

    public zpj(ask askVar, float f, float[] fArr, aoie aoieVar, zod zodVar, int i, int i2) {
        askVar.getClass();
        this.c = askVar;
        this.d = f;
        fArr.getClass();
        this.e = fArr;
        this.f = aoieVar;
        this.g = zodVar;
        this.h = i;
        this.i = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zpj a(Bitmap bitmap, ask askVar, float[] fArr, aoie aoieVar, zod zodVar, int i, int i2) {
        int i3 = askVar.a;
        int i4 = askVar.b;
        GLES20.glBindTexture(i4, i3);
        GLUtils.texImage2D(i4, 0, bitmap, 0);
        asc.d("glTexImage2D");
        asc.e();
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
        return new zpj(askVar, bitmap.getWidth() / bitmap.getHeight(), fArr, aoieVar, zodVar, i, i2);
    }
}
