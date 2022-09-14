package defpackage;

import android.graphics.Matrix;
import android.view.TextureView;
/* compiled from: PG */
/* renamed from: apqn  reason: default package */
/* loaded from: classes2.dex */
public final class apqn {
    final /* synthetic */ apqr a;

    public apqn(apqr apqrVar) {
        this.a = apqrVar;
    }

    public final void a(boolean z, int i) {
        int i2 = 4;
        if (i == 4) {
            this.a.f(Long.MIN_VALUE);
        }
        if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 3) {
            i2 = 3;
        }
        apnj apnjVar = this.a.j;
        if (apnjVar != null) {
            apnjVar.a(z, i2);
        }
    }

    public final void b() {
        apqr apqrVar = this.a;
        apqrVar.p = null;
        apqrVar.s = true;
        apqrVar.d();
    }

    public final void c(final int i, final int i2) {
        this.a.h(new Runnable(this, i, i2) { // from class: apqm
            private final apqn a;
            private final int b;
            private final int c;

            {
                this.a = this;
                this.b = i;
                this.c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Matrix matrix;
                float f;
                float f2;
                apqn apqnVar = this.a;
                int i3 = this.b;
                int i4 = this.c;
                if (i3 == 0 || i4 == 0) {
                    apqnVar.a.k = null;
                } else {
                    apqnVar.a.k = Float.valueOf(i3 / i4);
                }
                apqr apqrVar = apqnVar.a;
                apqv apqvVar = apqrVar.t;
                apqp apqpVar = apqrVar.n;
                apqp apqpVar2 = apqp.SHRINK_CONTAINER;
                boolean booleanValue = apqpVar.g.booleanValue();
                float f3 = i3;
                float f4 = i4;
                TextureView textureView = apqvVar.a;
                float width = textureView.getWidth();
                float height = apqvVar.a.getHeight();
                if (f4 == 0.0f || f3 == 0.0f || !booleanValue) {
                    matrix = new Matrix();
                } else {
                    if (f3 / width > f4 / height) {
                        f2 = (f3 / f4) * height;
                        f = height;
                    } else {
                        f = (f4 / f3) * width;
                        f2 = width;
                    }
                    matrix = new Matrix();
                    matrix.setScale(f2 / width, f / height, ((int) width) / 2, ((int) height) / 2);
                }
                textureView.setTransform(matrix);
            }
        });
    }
}
