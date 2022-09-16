package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bbw  reason: default package */
/* loaded from: classes2.dex */
public class bbw implements aze {
    private static final byte[] a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format b;
    private int A;
    private int B;
    private boolean C;
    private azh D;
    private bab[] E;
    private bab[] F;
    private boolean G;
    private final List c;
    private final SparseArray d;
    private final pwu e;
    private final pwu f;
    private final pwu g;
    private final byte[] h;
    private final pwu i;
    private final por j;
    private final pwu k;
    private final ArrayDeque l;
    private final ArrayDeque m;
    private final bab n;
    private int o;
    private int p;
    private long q;
    private int r;
    private pwu s;
    private long t;
    private int u;
    private long v;
    private long w;
    private long x;
    private bbv y;
    private int z;

    static {
        pis pisVar = new pis();
        pisVar.k = "application/x-emsg";
        b = pisVar.a();
    }

    public bbw() {
        this(null);
    }

    private static DrmInitData b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            bbk bbkVar = (bbk) list.get(i);
            if (bbkVar.d == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bbkVar.a.a;
                bca G = ja.G(bArr);
                UUID uuid = G == null ? null : G.a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private final void c() {
        this.o = 0;
        this.r = 0;
    }

    private static void i(pwu pwuVar, int i, bce bceVar) {
        pwuVar.G(i + 8);
        int e = bbl.e(pwuVar.d());
        if ((e & 1) != 0) {
            throw pjq.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (e & 2) != 0;
        int l = pwuVar.l();
        if (l == 0) {
            Arrays.fill(bceVar.m, 0, bceVar.e, false);
            return;
        }
        int i2 = bceVar.e;
        if (l != i2) {
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(l);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw pjq.a(sb.toString(), null);
        }
        Arrays.fill(bceVar.m, 0, l, z);
        bceVar.b(pwuVar.a());
        pwu pwuVar2 = bceVar.o;
        pwuVar.B(pwuVar2.a, 0, pwuVar2.c);
        bceVar.o.G(0);
        bceVar.p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(long r46) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbw.j(long):void");
    }

    private static void k(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw pjq.a(sb.toString(), null);
    }

    private static final bbs l(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (bbs) sparseArray.valueAt(0);
        }
        bbs bbsVar = (bbs) sparseArray.get(i);
        ptx.a(bbsVar);
        return bbsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bcc a(bcc bccVar) {
        return bccVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0239, code lost:
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023b, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0240, code lost:
        if (r2.c() == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0242, code lost:
        r21 = 1073741824 | r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0248, code lost:
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024a, code lost:
        r1 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024e, code lost:
        if (r1 == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0250, code lost:
        r24 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0255, code lost:
        r24 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0257, code lost:
        r5.e(r9, r21, r28.z, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026a, code lost:
        if (r28.m.isEmpty() != false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026c, code lost:
        r1 = (defpackage.bbu) r28.m.removeFirst();
        r28.u -= r1.b;
        r3 = r1.a + r9;
        r5 = r28.E;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0282, code lost:
        if (r8 >= r6) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0284, code lost:
        r5[r8].e(r3, 1, r1.b, r28.u, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x029e, code lost:
        if (r2.f() != false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a0, code lost:
        r28.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a2, code lost:
        r28.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        if (r28.o != 3) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r2.j != false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        r3 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        r3 = r2.b.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r28.z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
        if (r2.f >= r2.i) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        r1.m(r3);
        r1 = r2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r1 != null) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
        r3 = r2.b.o;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r1 == 0) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
        r3.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (r2.b.c(r2.f) == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
        r3.H(r3.m() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
        if (r2.f() != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        r28.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
        r28.o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
        if (r2.d.a.g != 1) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r28.z = r3 - 8;
        r1.m(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
        if ("audio/ac4".equals(r2.d.a.f.l) == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
        r28.A = r2.a(r28.z, 7);
        defpackage.ayp.c(r28.z, r28.i);
        r2.a.c(r28.i, 7);
        r3 = r28.A + 7;
        r28.A = r3;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0122, code lost:
        r4 = 0;
        r3 = r2.a(r28.z, 0);
        r28.A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
        r28.z += r3;
        r28.o = 4;
        r28.B = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
        r3 = r2.d;
        r4 = r3.a;
        r5 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
        if (r2.j != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
        r9 = r3.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
        r9 = r2.b.a(r2.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014e, code lost:
        r3 = r4.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
        if (r3 != 0) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
        r3 = r28.A;
        r4 = r28.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
        if (r3 >= r4) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0158, code lost:
        r28.A += r5.a(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
        r11 = r28.f.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r6 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0179, code lost:
        if (r28.A >= r28.z) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017b, code lost:
        r13 = r28.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017d, code lost:
        if (r13 != 0) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017f, code lost:
        r1.k(r11, r3, r6);
        r28.f.G(0);
        r13 = r28.f.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018e, code lost:
        if (r13 <= 0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0190, code lost:
        r28.B = r13 - 1;
        r28.e.G(0);
        r5.c(r28.e, 4);
        r5.c(r28.f, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
        if (r28.F.length <= 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b3, code lost:
        if (defpackage.pwo.e(r4.f.l, r11[4]) == false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b5, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b7, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b8, code lost:
        r28.C = r13;
        r28.A += 5;
        r28.z += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cc, code lost:
        throw defpackage.pjq.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cf, code lost:
        if (r28.C == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d1, code lost:
        r28.g.C(r13);
        r1.k(r28.g.a, 0, r28.B);
        r5.c(r28.g, r28.B);
        r13 = r28.B;
        r14 = r28.g;
        r14 = defpackage.pwo.b(r14.a, r14.c);
        r28.g.G("video/hevc".equals(r4.f.l) ? 1 : 0);
        r28.g.F(r14);
        defpackage.asf.f(r9, r28.g, r28.F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020f, code lost:
        r13 = r5.a(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0214, code lost:
        r28.A += r13;
        r28.B -= r13;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0224, code lost:
        if (r2.j != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
        r8 = r2.d.g[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0237, code lost:
        if (r2.b.k[r2.f] == false) goto L370;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0057 A[SYNTHETIC] */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r29, defpackage.azv r30) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbw.d(azf, azv):int");
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        int i;
        this.D = azhVar;
        c();
        bab[] babVarArr = new bab[2];
        this.E = babVarArr;
        bab babVar = this.n;
        int i2 = 0;
        if (babVar != null) {
            babVarArr[0] = babVar;
            i = 1;
        } else {
            i = 0;
        }
        bab[] babVarArr2 = (bab[]) pxi.X(babVarArr, i);
        this.E = babVarArr2;
        for (bab babVar2 : babVarArr2) {
            babVar2.rx(b);
        }
        this.F = new bab[this.c.size()];
        int i3 = 100;
        while (i2 < this.F.length) {
            int i4 = i3 + 1;
            bab pT = this.D.pT(i3, 3);
            pT.rx((Format) this.c.get(i2));
            this.F[i2] = pT;
            i2++;
            i3 = i4;
        }
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((bbv) this.d.valueAt(i)).e();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        c();
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        return bcb.a(azfVar, true);
    }

    public bbw(byte[] bArr) {
        this(Collections.emptyList(), null);
    }

    public bbw(List list, bab babVar) {
        this.c = Collections.unmodifiableList(list);
        this.n = babVar;
        this.j = new por();
        this.k = new pwu(16);
        this.e = new pwu(pwo.a);
        this.f = new pwu(5);
        this.g = new pwu();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new pwu(bArr);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.d = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = azh.a;
        this.E = new bab[0];
        this.F = new bab[0];
    }
}
