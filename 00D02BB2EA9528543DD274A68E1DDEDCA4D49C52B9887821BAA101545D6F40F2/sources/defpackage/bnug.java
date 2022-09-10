package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
/* compiled from: PG */
/* renamed from: bnug  reason: default package */
/* loaded from: classes.dex */
public final class bnug {
    bntd a;
    public bntb b;
    bnuj f;
    int g;
    int h;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    public ArrayList<bnut> c = dchl.a();
    public ArrayList<bnus> d = dchl.a();
    final float[] i = new float[16];
    final float[] j = new float[16];
    final float[] k = new float[16];
    private final int[] w = new int[8];
    bnrb e = new bnrb();

    public bnug(bntd bntdVar) {
        this.g = 0;
        this.h = 0;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.a = bntdVar;
        this.b = ((bnsn) bntdVar).m;
        bnuj bnujVar = new bnuj();
        this.f = bnujVar;
        bnuh bnuhVar = bnujVar.d;
        String[] strArr = {bnuhVar.a, bnuhVar.b, bnuhVar.c};
        int glCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader, this.f.a);
        GLES20.glCompileShader(glCreateShader);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(glCreateShader2, this.f.b);
        GLES20.glCompileShader(glCreateShader2);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        for (int i = 0; i < 3; i++) {
            GLES20.glBindAttribLocation(glCreateProgram, i, strArr[i]);
        }
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, this.w, 0);
        int glGetError = GLES20.glGetError();
        if (this.w[0] != 1 || glGetError != 0) {
            GLES20.glGetProgramInfoLog(glCreateProgram);
            if (String.valueOf(b(this.f.a)).length() == 0) {
                new String("");
            }
            if (String.valueOf(b(this.f.b)).length() == 0) {
                new String("");
            }
        }
        this.g = glCreateProgram;
        bnqz bnqzVar = this.e.d;
        String[] strArr2 = {bnqzVar.a, bnqzVar.b, bnqzVar.c, bnqzVar.d};
        int glCreateShader3 = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader3, this.e.a);
        GLES20.glCompileShader(glCreateShader3);
        int glCreateShader4 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(glCreateShader4, this.e.b);
        GLES20.glCompileShader(glCreateShader4);
        int glCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram2, glCreateShader3);
        GLES20.glAttachShader(glCreateProgram2, glCreateShader4);
        for (int i2 = 0; i2 < 4; i2++) {
            GLES20.glBindAttribLocation(glCreateProgram2, i2, strArr2[i2]);
        }
        GLES20.glLinkProgram(glCreateProgram2);
        GLES20.glGetProgramiv(glCreateProgram2, 35714, this.w, 0);
        int glGetError2 = GLES20.glGetError();
        if (this.w[0] != 1 || glGetError2 != 0) {
            if (String.valueOf(b(this.e.a)).length() == 0) {
                new String("");
            }
            if (String.valueOf(b(this.e.b)).length() == 0) {
                new String("");
            }
        }
        this.h = glCreateProgram2;
        bnui bnuiVar = this.f.c;
        this.l = GLES20.glGetUniformLocation(this.g, bnuiVar.a);
        this.m = GLES20.glGetUniformLocation(this.g, bnuiVar.b);
        this.n = GLES20.glGetUniformLocation(this.g, bnuiVar.c);
        this.o = GLES20.glGetUniformLocation(this.g, bnuiVar.e);
        this.p = GLES20.glGetUniformLocation(this.g, bnuiVar.d);
        bnra bnraVar = this.e.c;
        this.q = GLES20.glGetUniformLocation(this.h, bnraVar.a);
        this.r = GLES20.glGetUniformLocation(this.h, bnraVar.b);
        this.s = GLES20.glGetUniformLocation(this.h, bnraVar.c);
        this.t = GLES20.glGetUniformLocation(this.h, bnraVar.f);
        this.u = GLES20.glGetUniformLocation(this.h, bnraVar.d);
        this.v = GLES20.glGetUniformLocation(this.h, bnraVar.e);
    }

    private static String b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Scanner scanner = new Scanner(str);
        int i = 1;
        while (scanner.hasNextLine()) {
            sb.append(String.format(Locale.getDefault(), "%03d", Integer.valueOf(i)));
            sb.append(": ");
            sb.append(scanner.nextLine());
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    public final void a(bnus bnusVar) {
        dbsk.l(this.b.B());
        this.d.add(bnusVar);
    }
}
