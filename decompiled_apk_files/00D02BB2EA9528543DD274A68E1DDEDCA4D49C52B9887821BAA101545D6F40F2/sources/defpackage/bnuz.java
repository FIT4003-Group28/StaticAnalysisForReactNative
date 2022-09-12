package defpackage;
/* compiled from: PG */
/* renamed from: bnuz  reason: default package */
/* loaded from: classes.dex */
public final class bnuz {
    private static final String[] f = {"pos"};
    public final bntb a;
    public final bntc b;
    public final int c;
    public final int d;
    public final float[] e = new float[16];

    public bnuz(bntb bntbVar) {
        this.a = bntbVar;
        bntc s = bntbVar.s("stencil");
        this.b = s;
        bntbVar.v(s);
        bntbVar.O(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f});
        int k = bntbVar.k("precision highp float;\nuniform mat4 matrix;\nattribute vec4 pos;\nvoid main() {\n  gl_Position = matrix * pos;\n}\n", "precision mediump float;\nvoid main() {\n  gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n}\n", f);
        this.c = k;
        this.d = bntbVar.i(k, "matrix");
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i3 % 2 == 0 ? 8 : 0;
        if (i % 2 == 0) {
            i4 |= 16;
        }
        return i2 % 2 == 0 ? i4 | 32 : i4;
    }
}
