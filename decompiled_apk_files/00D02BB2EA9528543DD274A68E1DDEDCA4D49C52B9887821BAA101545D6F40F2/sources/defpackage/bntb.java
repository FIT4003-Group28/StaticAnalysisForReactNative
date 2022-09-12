package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Scanner;
/* compiled from: PG */
/* renamed from: bntb  reason: default package */
/* loaded from: classes.dex */
public final class bntb {
    public float c;
    public boolean h;
    @dzsi
    public bntc j;
    @dzsi
    public bnvn k;
    private final Context p;
    private float y;
    private float z;
    private static final dcqe o = dcqe.c("bntb");
    public static int a = 0;
    public static final int[] n = {1, 2, 3, 4, 5, 6, 7, 8};
    public int b = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private boolean u = false;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    public bntc d = bntc.a;
    public bntc e = bntc.a;
    public boolean g = false;
    public final int[] i = {0, 0, 0, 0};
    private ByteBuffer A = ByteBuffer.allocateDirect(4096).order(ByteOrder.nativeOrder());
    private int D = 1;
    private final SparseArray<bnva> B = new SparseArray<>();
    private int E = 1;
    private int C = -1;
    public final HashMap<Class<? extends bnuu>, bnuu> m = new HashMap<>();
    public final boolean[] f = new boolean[bnta.a().f];
    public final bntc[] l = new bntc[8];

    public bntb(Context context) {
        this.p = context;
        for (int i = 0; i < 8; i++) {
            this.l[i] = bntc.a;
        }
    }

    public static final void L(int i, float[] fArr) {
        GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
    }

    public static final void M(float[] fArr) {
        GLES20.glVertexAttrib4fv(2, fArr, 0);
    }

    public static final void Q(int i, int i2) {
        GLES20.glDrawArrays(i, 0, i2);
    }

    public static final void R(int i, int i2, int i3) {
        GLES20.glDrawElements(i, i2, 5123, i3);
    }

    public static final void S(int i, int i2, int[] iArr) {
        GLES20.glUniform2iv(i, i2, iArr, 0);
    }

    public static final void T(int i, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
    }

    private static void V(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String concat = str.concat("\n");
        while (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 24);
            sb.append(concat);
            sb.append("Error code: ");
            sb.append(glGetError);
            sb.append("\n");
            concat = sb.toString();
            glGetError = GLES20.glGetError();
        }
        bvoo.j(new RuntimeException(concat));
    }

    private static String W(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Scanner scanner = new Scanner(str);
        int i = 1;
        while (scanner.hasNextLine()) {
            sb.append(String.format("%03d", Integer.valueOf(i)));
            sb.append(": ");
            sb.append(scanner.nextLine());
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    private final ByteBuffer X(int[] iArr, int i) {
        ByteBuffer e = e(i * 4);
        e.asIntBuffer().put(iArr, 0, i);
        e.rewind();
        return e;
    }

    public final void A(int i) {
        if (this.f[i]) {
            GLES20.glDisableVertexAttribArray(i);
            this.f[i] = false;
        }
    }

    public final boolean B() {
        return Process.myTid() == this.b;
    }

    public final void C(int i, int i2, int i3, Buffer buffer) {
        GLES20.glBufferData(i, i2, buffer, i3);
        (i == 34962 ? this.d : this.e).e = i2;
    }

    public final void D(int i, bntc bntcVar) {
        dbsk.s(bntcVar);
        bntc[] bntcVarArr = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (bntcVarArr[i2] == bntcVar) {
                return;
            }
            if (this.E != i) {
                GLES20.glActiveTexture(33983 + i);
                this.E = i;
            }
            GLES20.glBindTexture(3553, bntcVar.d);
            this.l[i2] = bntcVar;
            return;
        }
        throw null;
    }

    public final void E(bntc bntcVar, int i, int i2, int i3, int i4, int i5, @dzsi ByteBuffer byteBuffer) {
        dbsk.s(bntcVar);
        bntc bntcVar2 = this.l[0];
        D(1, bntcVar);
        GLES20.glTexImage2D(3553, 0, i, i2, i3, 0, i, 5121, byteBuffer);
        G(i4, i5);
        D(1, bntcVar2);
        bntcVar.e = i2 * i3 * 4;
    }

    public final void F(bntc bntcVar, int i, int i2, int i3, int i4) {
        bntc bntcVar2 = this.l[0];
        D(1, bntcVar);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        G(i3, i4);
        D(1, bntcVar2);
        bntcVar.e = i * i2 * 4;
    }

    public final ByteBuffer H(byte[] bArr, int i) {
        ByteBuffer e = e(i);
        e.put(bArr, 0, i);
        e.rewind();
        return e;
    }

    public final ByteBuffer I(float[] fArr, int i) {
        ByteBuffer e = e(i * 4);
        e.asFloatBuffer().put(fArr, 0, i);
        e.rewind();
        return e;
    }

    public final void J(float[] fArr, int i, int i2) {
        if (!a()) {
            bvoo.h("Started frame before we created our EGL context", new Object[0]);
        }
        V("Unknown GL error(s) in frameStart:");
        this.h = false;
        dbsk.l(!this.g);
        this.g = true;
        GLES20.glDisable(3089);
        GLES20.glColorMask(true, true, true, true);
        GLES20.glDepthMask(true);
        GLES20.glStencilMask(-1);
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClearStencil(0);
        GLES20.glClear(17664);
        GLES20.glViewport(0, 0, i, i2);
        c();
    }

    public final void K(short[] sArr, int i, int i2) {
        int i3 = i + i;
        ByteBuffer e = e(i3);
        e.asShortBuffer().put(sArr, 0, i);
        e.rewind();
        C(34963, i3, i2, e);
    }

    public final bntc N(int i) {
        bntc bntcVar = new bntc(i);
        bntc bntcVar2 = this.j;
        if (bntcVar2 != null) {
            bntcVar2.b = bntcVar;
        }
        bntcVar.b = null;
        bntcVar.c = bntcVar2;
        bntcVar.f = true;
        this.j = bntcVar;
        return bntcVar;
    }

    public final void O(float[] fArr) {
        C(34962, 32, 35044, I(fArr, 8));
    }

    public final void P(int[] iArr, int i) {
        C(34962, i * 4, 35044, X(iArr, i));
    }

    public final void U(bntc bntcVar, int i, int i2, int[] iArr) {
        E(bntcVar, 6408, i, i2, 1, 2, X(iArr, iArr.length));
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final void b() {
        dbsk.l(this.g);
        this.g = false;
        V("Unknown GL error(s) in frameEnd:");
    }

    public final void c() {
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = false;
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.c = Float.NaN;
        for (int i = 0; i < 8; i++) {
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, 0);
            this.l[i] = bntc.a;
        }
        GLES20.glActiveTexture(33984);
        this.E = 1;
        this.C = -1;
        GLES20.glBindBuffer(34962, bntc.a.d);
        GLES20.glBindBuffer(34963, bntc.a.d);
        this.d = bntc.a;
        this.e = bntc.a;
        for (int i2 = 0; i2 < this.f.length; i2++) {
            GLES20.glDisableVertexAttribArray(i2);
            this.f[i2] = false;
        }
    }

    public final bnva d(int i) {
        Bitmap bitmap;
        bnva bnvaVar = this.B.get(i);
        if (bnvaVar != null) {
            return bnvaVar;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("resource");
        sb.append(i);
        bnva bnvaVar2 = new bnva(sb.toString(), 3, 1);
        dbsk.s(this.p);
        Resources resources = this.p.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = displayMetrics.densityDpi;
        options.inTargetDensity = displayMetrics.densityDpi;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
        if (decodeResource != null) {
            int width = decodeResource.getWidth();
            int height = decodeResource.getHeight();
            int width2 = decodeResource.getWidth();
            int height2 = decodeResource.getHeight();
            if (!bvop.g(width2) || !bvop.g(height2)) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int width3 = decodeResource.getWidth();
                int height3 = decodeResource.getHeight();
                int f = bvop.f(width3, 1);
                int f2 = bvop.f(height3, 1);
                Bitmap createBitmap = Bitmap.createBitmap(f, f2, config);
                createBitmap.setDensity(decodeResource.getDensity());
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                if (f > width3) {
                    bitmap = createBitmap;
                    canvas.drawBitmap(decodeResource, new Rect(width3 - 1, 0, width3, height3), new Rect(width3, 0, width3 + 1, height3), paint);
                } else {
                    bitmap = createBitmap;
                }
                if (f2 > height3) {
                    canvas.drawBitmap(decodeResource, new Rect(0, height3 - 1, width3, height3), new Rect(0, height3, width3, height3 + 1), paint);
                }
                if (f > width3 && f2 > height3) {
                    canvas.drawBitmap(decodeResource, new Rect(width3 - 1, height3 - 1, width3, height3), new Rect(width3, height3, width3 + 1, height3 + 1), paint);
                }
                decodeResource.recycle();
                decodeResource = bitmap;
            }
            bnvaVar2.a(decodeResource, width, height);
        }
        this.B.put(i, bnvaVar2);
        return bnvaVar2;
    }

    public final ByteBuffer e(int i) {
        if (i > 65536) {
            return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        int capacity = this.A.capacity();
        if (capacity < i) {
            while (i > capacity) {
                capacity += capacity;
            }
            this.A = ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
        }
        return this.A;
    }

    public final bntc f(String str) {
        GLES20.glGenTextures(1, this.i, 0);
        return N(this.i[0]);
    }

    public final void g(bntc bntcVar) {
        if (bntcVar.a()) {
            for (int i = 0; i < 8; i++) {
                bntc[] bntcVarArr = this.l;
                if (bntcVarArr[i] == bntcVar) {
                    bntcVarArr[i] = bntc.a;
                }
            }
            int[] iArr = this.i;
            iArr[0] = bntcVar.d;
            GLES20.glDeleteTextures(1, iArr, 0);
            m(bntcVar);
        }
    }

    public final void h(int i) {
        if (this.C == i) {
            return;
        }
        GLES20.glUseProgram(i);
        this.C = i;
    }

    public final int i(int i, String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (GLES20.glGetError() != 0) {
            throw new bnvm(str.length() != 0 ? "Error while getting uniform location for ".concat(str) : new String("Error while getting uniform location for "));
        } else if (glGetUniformLocation != -1) {
            return glGetUniformLocation;
        } else {
            throw new bnvm(str.length() != 0 ? "Unable to get uniform location for ".concat(str) : new String("Unable to get uniform location for "));
        }
    }

    final int j(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        int glGetError = GLES20.glGetError();
        if (glCreateShader == 0 || glGetError != 0) {
            throw new bnvm("glCreateShader failed", "<no info log>", i, "source");
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, this.i, 0);
        int glGetError2 = GLES20.glGetError();
        if (this.i[0] != 0 && glGetError2 == 0) {
            return glCreateShader;
        }
        throw new bnvm("glCompileShader failed", GLES20.glGetShaderInfoLog(glCreateShader), i, W(str));
    }

    public final int k(String str, String str2, String[] strArr) {
        int j = j(35633, str);
        int j2 = j(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        int glGetError = GLES20.glGetError();
        if (glCreateProgram == 0 || glGetError != 0) {
            throw new bnvm("glCreateProgram failed", "<no info log>", W(str), W(str2));
        }
        GLES20.glAttachShader(glCreateProgram, j);
        int glGetError2 = GLES20.glGetError();
        if (glGetError2 != 0) {
            StringBuilder sb = new StringBuilder(49);
            sb.append("Shader id: ");
            sb.append(j);
            sb.append("\nGL error code: ");
            sb.append(glGetError2);
            throw new bnvm("glAttachShader(vertShader) failed", sb.toString(), W(str), W(str2));
        }
        GLES20.glAttachShader(glCreateProgram, j2);
        if (GLES20.glGetError() == 0) {
            for (int i = 0; i < strArr.length; i++) {
                String str3 = strArr[i];
                if (!str3.equals("unused")) {
                    GLES20.glBindAttribLocation(glCreateProgram, i, str3);
                    int glGetError3 = GLES20.glGetError();
                    if (glGetError3 != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 66);
                        sb2.append("Attrib name: ");
                        sb2.append(str3);
                        sb2.append("\nAttrib index: ");
                        sb2.append(i);
                        sb2.append("\nGL error code: ");
                        sb2.append(glGetError3);
                        throw new bnvm("glBindAttribLocation failed", sb2.toString(), W(str), W(str2));
                    }
                }
            }
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, this.i, 0);
            int glGetError4 = GLES20.glGetError();
            if (this.i[0] != 1 || glGetError4 != 0) {
                throw new bnvm("glLinkProgram failed", GLES20.glGetProgramInfoLog(glCreateProgram), W(str), W(str2));
            }
            return glCreateProgram;
        }
        StringBuilder sb3 = new StringBuilder(21);
        sb3.append("Shader id ");
        sb3.append(j2);
        throw new bnvm("glAttachShader(fragShader) failed", sb3.toString(), W(str), W(str2));
    }

    public final bnuu l(Class<? extends bnuu> cls) {
        bnuu bnuuVar = this.m.get(cls);
        if (bnuuVar != null) {
            return bnuuVar;
        }
        try {
            bnuu newInstance = cls.newInstance();
            try {
                this.m.put(cls, newInstance);
            } catch (IllegalAccessException | InstantiationException unused) {
            }
            bnuuVar = newInstance;
        } catch (IllegalAccessException | InstantiationException unused2) {
        }
        dbsk.s(bnuuVar);
        return bnuuVar;
    }

    public final void m(bntc bntcVar) {
        dbsk.l(bntcVar.a());
        if (this.j == bntcVar) {
            this.j = bntcVar.c;
        }
        bntc bntcVar2 = bntcVar.b;
        if (bntcVar2 != null) {
            bntcVar2.c = bntcVar.c;
        }
        bntc bntcVar3 = bntcVar.c;
        if (bntcVar3 != null) {
            bntcVar3.b = bntcVar2;
        }
        bntcVar.b = null;
        bntcVar.c = null;
        bntcVar.f = false;
    }

    public final void n(int i, int i2) {
        dbsk.l(this.g);
        if (this.q == i && this.r == i2) {
            return;
        }
        if (i != 1 || i2 != 0) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(i, i2);
        } else {
            GLES20.glDisable(3042);
        }
        this.q = i;
        this.r = i2;
    }

    public final void o(int i) {
        dbsk.l(this.g);
        if (this.s == i) {
            return;
        }
        if (i == 519) {
            GLES20.glDisable(2929);
        } else {
            GLES20.glEnable(2929);
            GLES20.glDepthFunc(i);
        }
        this.s = i;
    }

    public final void p(int i) {
        dbsk.l(this.g);
        if (this.t == i) {
            return;
        }
        boolean z = true;
        if (1 != i) {
            z = false;
        }
        GLES20.glDepthMask(z);
        this.t = i;
    }

    public final void q(float f, float f2) {
        dbsk.l(this.g);
        if (this.y == f && this.z == f2) {
            return;
        }
        if (f != 0.0f || f2 != 0.0f) {
            GLES20.glEnable(32823);
            GLES20.glPolygonOffset(f, f2);
        } else {
            GLES20.glDisable(32823);
        }
        this.y = f;
        this.z = f2;
    }

    public final void r(boolean z, int i, int i2, int i3) {
        dbsk.l(this.g);
        if (this.u == z && this.v == i && this.w == i2 && this.x == i3) {
            return;
        }
        if (!z) {
            GLES20.glDisable(2960);
        } else {
            GLES20.glEnable(2960);
            GLES20.glStencilFunc(i, i2, i3);
            if (i == 519) {
                GLES20.glStencilOp(7681, 7681, 7681);
            } else {
                GLES20.glStencilOp(7680, 7680, 7680);
            }
            GLES20.glStencilMask(i3);
        }
        this.u = z;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    public final bntc s(String str) {
        GLES20.glGenBuffers(1, this.i, 0);
        return N(this.i[0]);
    }

    public final bntc t(String str) {
        GLES20.glGenBuffers(1, this.i, 0);
        return N(this.i[0]);
    }

    public final void u(bntc bntcVar) {
        if (bntcVar == this.d) {
            w();
        }
        if (bntcVar == this.e) {
            y();
        }
        int[] iArr = this.i;
        iArr[0] = bntcVar.d;
        GLES20.glDeleteBuffers(1, iArr, 0);
        m(bntcVar);
    }

    public final void v(bntc bntcVar) {
        if (bntcVar != this.d) {
            GLES20.glBindBuffer(34962, bntcVar.d);
            this.d = bntcVar;
        }
    }

    public final void w() {
        v(bntc.a);
    }

    public final void x(bntc bntcVar) {
        if (bntcVar != this.e) {
            GLES20.glBindBuffer(34963, bntcVar.d);
            this.e = bntcVar;
        }
    }

    public final void y() {
        x(bntc.a);
    }

    public final void z(int i) {
        if (!this.f[i]) {
            GLES20.glEnableVertexAttribArray(i);
            this.f[i] = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r8 + (-1)
            r1 = 0
            if (r8 == 0) goto L53
            r2 = 9728(0x2600, float:1.3632E-41)
            r3 = 2
            r4 = 1
            r5 = 9729(0x2601, float:1.3633E-41)
            if (r0 == 0) goto L18
            if (r0 == r4) goto L15
            if (r0 == r3) goto L12
            goto L15
        L12:
            r2 = 9987(0x2703, float:1.3995E-41)
            goto L1a
        L15:
            r2 = 9729(0x2601, float:1.3633E-41)
            goto L1a
        L18:
            r5 = 9728(0x2600, float:1.3632E-41)
        L1a:
            int r0 = r9 + (-1)
            if (r9 == 0) goto L52
            r9 = 3
            r1 = 10497(0x2901, float:1.471E-41)
            r6 = 33071(0x812f, float:4.6342E-41)
            if (r0 == 0) goto L33
            if (r0 == r4) goto L30
            if (r0 == r3) goto L36
            if (r0 == r9) goto L2d
            goto L33
        L2d:
            r1 = 33071(0x812f, float:4.6342E-41)
        L30:
            r6 = 10497(0x2901, float:1.471E-41)
            goto L36
        L33:
            r1 = 33071(0x812f, float:4.6342E-41)
        L36:
            r0 = 10241(0x2801, float:1.435E-41)
            r3 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glTexParameteri(r3, r0, r2)
            r0 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r3, r0, r5)
            r0 = 10242(0x2802, float:1.4352E-41)
            android.opengl.GLES20.glTexParameteri(r3, r0, r1)
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r3, r0, r6)
            if (r8 != r9) goto L51
            android.opengl.GLES20.glGenerateMipmap(r3)
        L51:
            return
        L52:
            throw r1
        L53:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bntb.G(int, int):void");
    }
}
