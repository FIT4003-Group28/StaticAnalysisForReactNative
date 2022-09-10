package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: clxl  reason: default package */
/* loaded from: classes5.dex */
public final class clxl implements clun {
    private static final byte[] a;
    private static final Format b;
    private int A;
    private boolean B;
    private clup C;
    private clvk[] D;
    private clvk[] E;
    private boolean F;
    private final List<Format> c;
    private final SparseArray<clxk> d;
    private final cmnk e;
    private final cmnk f;
    private final cmnk g;
    private final byte[] h;
    private final cmnk i;
    private final cmce j;
    private final cmnk k;
    private final ArrayDeque<clwx> l;
    private final ArrayDeque<clxj> m;
    private int n;
    private int o;
    private long p;
    private int q;
    private cmnk r;
    private long s;
    private int t;
    private long u;
    private long v;
    private long w;
    private clxk x;
    private int y;
    private int z;

    static {
        int i = clxi.a;
        a = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        clnf clnfVar = new clnf();
        clnfVar.k = "application/x-emsg";
        b = clnfVar.a();
    }

    public clxl() {
        this(null);
    }

    private final void a() {
        this.n = 0;
        this.q = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(long r46) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxl.b(long):void");
    }

    private static void c(cmnk cmnkVar, int i, clxw clxwVar) {
        cmnkVar.f(i + 8);
        int f = clwz.f(cmnkVar.r());
        if ((f & 1) != 0) {
            throw new clob("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (f & 2) != 0;
        int v = cmnkVar.v();
        if (v == 0) {
            Arrays.fill(clxwVar.m, 0, clxwVar.e, false);
            return;
        }
        int i2 = clxwVar.e;
        if (v != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(v);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw new clob(sb.toString());
        }
        Arrays.fill(clxwVar.m, 0, v, z);
        clxwVar.a(cmnkVar.d());
        cmnk cmnkVar2 = clxwVar.o;
        cmnkVar.j(cmnkVar2.a, 0, cmnkVar2.c);
        clxwVar.o.f(0);
        clxwVar.p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.drm.DrmInitData h(java.util.List<defpackage.clwy> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto La7
            java.lang.Object r5 = r14.get(r3)
            clwy r5 = (defpackage.clwy) r5
            int r6 = r5.d
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto La3
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            cmnk r5 = r5.a
            byte[] r5 = r5.a
            cmnk r6 = new cmnk
            r6.<init>(r5)
            int r8 = r6.c
            r9 = 32
            if (r8 >= r9) goto L2f
        L2d:
            r6 = r2
            goto L91
        L2f:
            r6.f(r1)
            int r8 = r6.r()
            int r9 = r6.d()
            int r9 = r9 + 4
            if (r8 == r9) goto L3f
            goto L2d
        L3f:
            int r8 = r6.r()
            if (r8 == r7) goto L46
            goto L2d
        L46:
            int r7 = r6.r()
            int r7 = defpackage.clwz.e(r7)
            r8 = 1
            if (r7 <= r8) goto L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            r6.toString()
            goto L2d
        L64:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.t()
            long r12 = r6.t()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L7c
            int r7 = r6.v()
            int r7 = r7 * 16
            r6.h(r7)
        L7c:
            int r7 = r6.v()
            int r8 = r6.d()
            if (r7 == r8) goto L87
            goto L2d
        L87:
            byte[] r8 = new byte[r7]
            r6.j(r8, r1, r7)
            clxr r6 = new clxr
            r6.<init>(r9)
        L91:
            if (r6 != 0) goto L95
            r6 = r2
            goto L97
        L95:
            java.util.UUID r6 = r6.a
        L97:
            if (r6 == 0) goto La3
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        La3:
            int r3 = r3 + 1
            goto L8
        La7:
            if (r4 != 0) goto Laa
            return r2
        Laa:
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r1]
            java.lang.Object[] r0 = r4.toArray(r0)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r0 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r0
            r14.<init>(r2, r1, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxl.h(java.util.List):com.google.android.exoplayer2.drm.DrmInitData");
    }

    private static void i(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected negtive value: ");
        sb.append(i);
        throw new clob(sb.toString());
    }

    private static final clxg j(SparseArray<clxg> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        clxg clxgVar = sparseArray.get(i);
        cmmn.f(clxgVar);
        return clxgVar;
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.C = clupVar;
        a();
        clvk[] clvkVarArr = new clvk[2];
        this.D = clvkVarArr;
        int i = 0;
        clvk[] clvkVarArr2 = (clvk[]) cmny.e(clvkVarArr, 0);
        this.D = clvkVarArr2;
        for (clvk clvkVar : clvkVarArr2) {
            clvkVar.a(b);
        }
        this.E = new clvk[this.c.size()];
        int i2 = 100;
        while (i < this.E.length) {
            int i3 = i2 + 1;
            clvk RT = this.C.RT(i2);
            RT.a(this.c.get(i));
            this.E[i] = RT;
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.valueAt(i).b();
        }
        this.m.clear();
        this.t = 0;
        this.u = j2;
        this.l.clear();
        a();
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        return clxt.a(clukVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0219, code lost:
        r1.z += r6;
        r1.A -= r6;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022b, code lost:
        if (r2.j != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022d, code lost:
        r8 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023e, code lost:
        if (r2.b.k[r2.f] == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0240, code lost:
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0242, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0247, code lost:
        if (r2.f() == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0249, code lost:
        r20 = 1073741824 | r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024f, code lost:
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0251, code lost:
        r0 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0255, code lost:
        if (r0 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0257, code lost:
        r23 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025c, code lost:
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025e, code lost:
        r7.b(r12, r20, r1.y, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0271, code lost:
        if (r1.m.isEmpty() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0273, code lost:
        r0 = r1.m.removeFirst();
        r1.t -= r0.b;
        r3 = r0.a + r12;
        r5 = r1.D;
        r6 = r5.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0289, code lost:
        if (r7 >= r6) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028b, code lost:
        r5[r7].b(r3, 1, r0.b, r1.t, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a4, code lost:
        if (r2.d() != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a6, code lost:
        r1.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a9, code lost:
        r1.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ac, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r1.n != 3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r2.j != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
        r1.y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (r2.f >= r2.i) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r0.d(r3);
        r0 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (r0 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
        r3 = r2.b.o;
        r0 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r0 == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
        r3.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
        if (r2.b.c(r2.f) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:
        r3.h(r3.m() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r2.d() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
        r1.x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
        r1.n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (r2.d.a.g != 1) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
        r1.y = r3 - 8;
        r0.d(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        if ("audio/ac4".equals(r2.d.a.f.l) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r1.z = r2.e(r1.y, 7);
        defpackage.clrb.b(r1.y, r1.i);
        r2.a.d(r1.i, 7);
        r3 = r1.z + 7;
        r1.z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
        r3 = r2.e(r1.y, 0);
        r1.z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
        r1.y += r3;
        r1.n = 4;
        r1.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0126, code lost:
        r3 = r2.d;
        r5 = r3.a;
        r7 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
        if (r2.j != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
        r12 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
        r12 = r2.b.b(r2.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
        r3 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
        if (r3 != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0143, code lost:
        r3 = r1.z;
        r4 = r1.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
        if (r3 >= r4) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0149, code lost:
        r1.z += r7.c(r0, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0154, code lost:
        r10 = r1.f.a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r14 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0168, code lost:
        if (r1.z >= r1.y) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
        r11 = r1.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016e, code lost:
        if (r11 != 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
        r0.c(r10, r3, r14);
        r1.f.f(0);
        r11 = r1.f.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
        if (r11 <= 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0180, code lost:
        r1.A = r11 - 1;
        r1.e.f(0);
        r7.d(r1.e, 4);
        r7.d(r1.f, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0197, code lost:
        if (r1.E.length <= 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0199, code lost:
        r11 = r5.f.l;
        r17 = r10[4];
        r6 = defpackage.cmni.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
        if ("video/avc".equals(r11) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
        if ((r17 & 31) == r4) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ae, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
        if ("video/hevc".equals(r11) == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bb, code lost:
        if (((r17 & 126) >> r8) != 39) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01be, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bf, code lost:
        r1.B = r6;
        r1.z += 5;
        r1.y += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d5, code lost:
        throw new defpackage.clob("Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d8, code lost:
        if (r1.B == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01da, code lost:
        r1.g.a(r11);
        r0.c(r1.g.a, 0, r1.A);
        r7.d(r1.g, r1.A);
        r6 = r1.A;
        r11 = r1.g;
        r4 = defpackage.cmni.a(r11.a, r11.c);
        r1.g.f("video/hevc".equals(r5.f.l) ? 1 : 0);
        r1.g.e(r4);
        defpackage.cluh.a(r12, r1.g, r1.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0215, code lost:
        r6 = r7.c(r0, r11, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0054 A[SYNTHETIC] */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r29, defpackage.clvd r30) {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxl.g(cluk, clvd):int");
    }

    public clxl(byte[] bArr) {
        this.c = Collections.unmodifiableList(Collections.emptyList());
        this.j = new cmce();
        this.k = new cmnk(16);
        this.e = new cmnk(cmni.a);
        this.f = new cmnk(5);
        this.g = new cmnk();
        byte[] bArr2 = new byte[16];
        this.h = bArr2;
        this.i = new cmnk(bArr2);
        this.l = new ArrayDeque<>();
        this.m = new ArrayDeque<>();
        this.d = new SparseArray<>();
        this.v = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.C = clup.a;
        this.D = new clvk[0];
        this.E = new clvk[0];
    }
}
