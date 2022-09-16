package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
/* compiled from: PG */
/* renamed from: ozd  reason: default package */
/* loaded from: classes4.dex */
public class ozd implements oxq {
    private static final int a = pcx.c("seig");
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final int c;
    private final ozh d;
    private final SparseArray e;
    private final pct f;
    private final pct g;
    private final pct h;
    private final pct i;
    private final byte[] j;
    private final Stack k;
    private int l;
    private int m;
    private long n;
    private int o;
    private pct p;
    private long q;
    private ozc r;
    private int s;
    private int t;
    private int u;
    private oxr v;
    private boolean w;

    public ozd() {
        this(0, null);
    }

    private static owu c(List list) {
        int size = list.size();
        owu owuVar = null;
        for (int i = 0; i < size; i++) {
            oyt oytVar = (oyt) list.get(i);
            if (oytVar.aQ == oyu.X) {
                if (owuVar == null) {
                    owuVar = new owu();
                }
                byte[] bArr = oytVar.a.a;
                if (pdo.c(bArr) == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    owuVar.b(pdo.c(bArr), new owv("video/mp4", bArr));
                }
            }
        }
        return owuVar;
    }

    private final void g() {
        this.l = 0;
        this.o = 0;
    }

    private static void h(pct pctVar, int i, ozj ozjVar) {
        pctVar.z(i + 8);
        int e = oyu.e(pctVar.c());
        if ((e & 1) != 0) {
            throw new ouf("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (e & 2) != 0;
        int j = pctVar.j();
        int i2 = ozjVar.d;
        if (j != i2) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(i2);
            throw new ouf(sb.toString());
        }
        Arrays.fill(ozjVar.j, 0, j, z);
        ozjVar.a(pctVar.a());
        pctVar.u(ozjVar.l.a, 0, ozjVar.k);
        ozjVar.l.z(0);
        ozjVar.m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x05b4, code lost:
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05b8, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x052f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(long r48) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozd.i(long):void");
    }

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.v = oxrVar;
        if (this.d != null) {
            ozc ozcVar = new ozc(oxrVar.pP(0));
            ozcVar.a(this.d, new ozb(0, 0, 0, 0));
            this.e.put(0, ozcVar);
            this.v.pR();
        }
    }

    protected void b(pct pctVar) {
    }

    @Override // defpackage.oxq
    public final void d() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((ozc) this.e.valueAt(i)).b();
        }
        this.k.clear();
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        r2 = r25.r;
        r3 = r2.a;
        r4 = r3.e;
        r6 = r2.e;
        r25.s = r4[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r3.i == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
        r4 = r3.l;
        r10 = r3.a.a;
        r11 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
        if (r11 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
        r11 = r2.c.l[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        r10 = r11.a;
        r3 = r3.j[r6];
        r6 = r25.h;
        r11 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (true == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r11[0] = (byte) (r12 | r10);
        r6.z(0);
        r2 = r2.b;
        r2.f(r25.h, 1);
        r2.f(r4, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r3 != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r3 = r4.k();
        r4.A(-2);
        r3 = (r3 * 6) + 2;
        r2.f(r4, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
        r25.t = r10;
        r25.s += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r25.t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r25.l = 4;
        r25.u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r2 = r25.r;
        r3 = r2.a;
        r4 = r2.c;
        r6 = r2.b;
        r2 = r2.e;
        r10 = r4.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
        if (r10 != (-1)) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
        r9 = r25.t;
        r10 = r25.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
        if (r9 >= r10) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        r25.t += r6.j(r26, r10 - r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r11 = r25.g.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r11 = 4 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
        r12 = r25.t;
        r13 = r25.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
        if (r12 >= r13) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
        r12 = r25.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
        if (r12 != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
        r26.h(r25.g.a, r11, r10);
        r25.g.z(0);
        r25.u = r25.g.j();
        r25.f.z(0);
        r6.f(r25.f, 4);
        r25.t += 4;
        r25.s += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
        r12 = r6.j(r26, r12, false);
        r25.t += r12;
        r25.u -= r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
        r22 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
        r19 = (r3.g[r2] + r3.f[r2]) * 1000;
        r1 = r3.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015a, code lost:
        if (true == r1) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
        r21 = r5 | (r3.h[r2] ? 1 : 0);
        r2 = r3.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0167, code lost:
        if (r1 == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
        r1 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
        if (r1 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016d, code lost:
        r1 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0170, code lost:
        r1 = r4.l[r2].b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
        r6.g(r19, r21, r22, 0, r24);
        r1 = r25.r;
        r2 = r1.e + 1;
        r1.e = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
        if (r2 != r3.d) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
        r25.r = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
        r25.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
        return 0;
     */
    @Override // defpackage.oxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.oxn r26, defpackage.oxz r27) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozd.e(oxn, oxz):int");
    }

    @Override // defpackage.oxq
    public final boolean f(oxn oxnVar) {
        return ozg.a(oxnVar, true);
    }

    public ozd(int i, ozh ozhVar) {
        this.d = ozhVar;
        this.c = i | (ozhVar != null ? 4 : 0);
        this.i = new pct(16);
        this.f = new pct(pcr.a);
        this.g = new pct(4);
        this.h = new pct(1);
        this.j = new byte[16];
        this.k = new Stack();
        this.e = new SparseArray();
        g();
    }
}
