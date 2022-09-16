package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: axgt  reason: default package */
/* loaded from: classes2.dex */
public final class axgt {
    public final banh a = new banh(6407);
    public baob b;
    public int c;
    private int d;

    public final void a(int i, int i2) {
        int min;
        baob baneVar;
        float min2 = Math.min(1.0f, this.c / Math.max(i, i2));
        this.a.b(Math.round(i * min2), Math.round(i2 * min2));
        GLES20.glBindFramebuffer(36160, this.a.a);
        banh banhVar = this.a;
        int i3 = banhVar.c;
        int i4 = banhVar.d;
        if (i3 >= i) {
            min = 1;
        } else {
            int i5 = i / i3;
            if (i % i3 != 0 || i2 % i4 != 0 || (i5 & 1) != 0) {
                min = Math.min(8, i5);
            } else {
                min = Math.min(8, i5 >> 1);
            }
        }
        baob baobVar = this.b;
        if (baobVar != null && min != this.d) {
            baobVar.c();
            this.b = null;
        }
        if (this.b == null) {
            if (min == 1) {
                baneVar = new bane();
            } else if (min == 2) {
                baneVar = new axgv("uniform vec2 xUnit;\nuniform vec2 yUnit;\n\nvoid main() {\n  vec2 halfX = 0.5 * xUnit;\n  vec2 halfY = 0.5 * yUnit;\n  gl_FragColor = 0.25 * ((sample(tc - halfX - halfY) + sample(tc + halfX - halfY))\n      + (sample(tc - halfX + halfY) + sample(tc + halfX + halfY)));\n}\n", new axgu(min));
            } else {
                baneVar = new axgv("uniform vec2 xUnit;\nuniform vec2 yUnit;\nuniform int samplingFactor;\n\nvoid main() {\n  float k = float(samplingFactor - 1) / -2.0;\n  vec4 sum = vec4(0.0);\n  vec2 dx = xUnit * k;\n  for (int ix = 0; ix < samplingFactor; ++ix) {\n    vec2 dy = yUnit * k;\n    for (int iy = 0; iy < samplingFactor; ++iy) {\n      sum += sample(tc + dx + dy);\n      dy += yUnit;\n    }\n    dx += xUnit;\n  }\n  gl_FragColor = sum / float(samplingFactor * samplingFactor);\n}\n", new axgu(min));
            }
            this.b = baneVar;
            this.d = min;
        }
    }
}
