package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: cpuh  reason: default package */
/* loaded from: classes5.dex */
final class cpuh {
    public int a = -1;
    public final float[] b = new float[4];
    public final float[] c = new float[4];

    public final void a(float f, float f2) {
        cpwl.e(this.a + 1 < 4, "Attempt to add more than 3 segments");
        int i = this.a + 1;
        this.a = i;
        this.b[i] = f;
        this.c[i] = f2;
    }

    public final void b(float f) {
        cpwl.e(this.a >= 0, "Attempt to correct a point not added yet");
        this.c[this.a] = f;
    }

    public final void c(Path path) {
        for (int i = 1; i <= this.a; i++) {
            path.lineTo(this.b[i], this.c[i]);
        }
    }
}
