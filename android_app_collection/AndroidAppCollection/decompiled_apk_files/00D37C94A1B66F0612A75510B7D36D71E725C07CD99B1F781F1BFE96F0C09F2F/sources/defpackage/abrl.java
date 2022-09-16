package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.IntBuffer;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: abrl  reason: default package */
/* loaded from: classes.dex */
public class abrl implements absu, absb {
    protected final absc a = new absc(this);
    protected abrk b;
    private int[] c;
    private IntBuffer d;

    @Override // defpackage.absb
    public final void a(int i) {
    }

    @Override // defpackage.absb
    public synchronized void b() {
        absc abscVar = this.a;
        int i = abscVar.a;
        int i2 = abscVar.b;
        int[] iArr = this.c;
        int i3 = 0;
        if (iArr == null || iArr.length < i * i2) {
            int i4 = i * i2;
            int[] iArr2 = new int[i4];
            this.c = iArr2;
            this.d = IntBuffer.wrap(iArr2, 0, i4);
        }
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, this.d);
        while (true) {
            int[] iArr3 = this.c;
            if (i3 >= iArr3.length) {
                break;
            }
            int i5 = iArr3[i3];
            iArr3[i3] = ((i5 & PrivateKeyType.INVALID) << 16) | ((-16711936) & i5) | ((i5 >> 16) & PrivateKeyType.INVALID);
            i3++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.c, (i2 - 1) * i, -i, i, i2, Bitmap.Config.ARGB_8888);
        abrk abrkVar = this.b;
        Matrix matrix = new Matrix();
        if (((acne) abrkVar).a) {
            matrix.postScale(-1.0f, 1.0f);
        }
        ((acne) abrkVar).f.c.runOnUiThread(new acnd((acne) abrkVar, Bitmap.createBitmap(createBitmap, ((acne) abrkVar).b, ((acne) abrkVar).c, ((acne) abrkVar).d.x, ((acne) abrkVar).d.y, matrix, true)));
    }

    @Override // defpackage.absu
    public final void c(abry abryVar) {
        this.a.a();
    }

    public final synchronized void d(abrk abrkVar) {
        this.b = abrkVar;
    }

    @Override // defpackage.absu
    public synchronized boolean e(boolean z, absw abswVar, abry abryVar) {
        boolean z2;
        if (this.b != null) {
            this.a.e(z, abswVar, abryVar);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }
}
