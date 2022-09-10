package defpackage;

import android.util.SparseIntArray;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: alxz  reason: default package */
/* loaded from: classes.dex */
public final class alxz extends alxs {
    private final dzmd<alxp> e;
    private final dzjj<alxl> f;
    private final dzjj<alwd> g;
    private final dzjj<dmmm> h;
    private final dzjj<dmlu> i;
    private final dzjj<alxp> j;
    private final boolean k;
    @dzsi
    private final alxv l;
    private static final dcqe d = dcqe.c("alxz");
    public static final alxp c = new alxp(0, new alxo[]{alxo.c}, new byte[]{0}, null, false);

    public alxz() {
        this(null, false);
    }

    public static alxs g(byte[] bArr, dmwb dmwbVar, dwwg dwwgVar) {
        try {
            float f = dwwgVar.d;
            return new alxz(new alxv(bArr, dmwbVar), dwwgVar.b);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException("unpackProtoLazily: Error in parsing multiZoomStyleTable", e);
        }
    }

    @dzsi
    private static SparseIntArray i(dmvi dmviVar) {
        if (dmviVar.d() <= 0 || dmviVar.f() <= 0) {
            return null;
        }
        int min = Math.min(dmviVar.d(), dmviVar.f());
        SparseIntArray sparseIntArray = new SparseIntArray(min);
        while (true) {
            min--;
            if (min < 0) {
                return sparseIntArray;
            }
            sparseIntArray.put(dmviVar.e(min), dmviVar.g(min));
        }
    }

    private static void j(dmuw dmuwVar, alxl[] alxlVarArr) {
        if (dmuwVar.m() || dmuwVar.o()) {
            int i = 0;
            while (true) {
                if (i >= alxlVarArr.length) {
                    for (alxl alxlVar : alxlVarArr) {
                        if (dmuwVar.m()) {
                            alxlVar.i = amgj.c(dmuwVar.l(), amgk.NO_WRAP);
                        }
                        if (dmuwVar.o()) {
                            alxlVar.j = amgj.c(dmuwVar.n(), amgk.NO_WRAP);
                        }
                    }
                    return;
                } else if (!alxlVarArr[i].i.d() || !alxlVarArr[i].j.d()) {
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    private static dmlu k(dmtj dmtjVar) {
        dmlt bZ = dmlu.d.bZ();
        bZ.bO(dmtjVar.p, dmtjVar.q, dmtjVar.r);
        return bZ.bK();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(defpackage.dmun r9, java.util.concurrent.atomic.AtomicLong r10, defpackage.alxy r11) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alxz.m(dmun, java.util.concurrent.atomic.AtomicLong, alxy):void");
    }

    @Override // defpackage.alxs
    public final alxp a(long j) {
        alxp i;
        synchronized (this.e) {
            i = this.e.i(j);
        }
        return i == null ? l(j) : i;
    }

    @Override // defpackage.alxs
    public final alxp b(int i) {
        if (this.l != null) {
            synchronized (this) {
                if (!this.j.d(i)) {
                    dzjj<alxp> dzjjVar = this.j;
                    alxv alxvVar = this.l;
                    dzjjVar.a(i, a(alxvVar != null ? alxvVar.b(i) : -1));
                }
            }
            return this.j.i(i);
        }
        return c;
    }

    @Override // defpackage.alxs
    public final int c() {
        return this.e.j;
    }

    @Override // defpackage.alxs
    public final byte[] d() {
        alxv alxvVar = this.l;
        return alxvVar != null ? alxvVar.d : alxs.b;
    }

    public final void h(long j, alxp alxpVar) {
        synchronized (this.e) {
            this.e.a(j, alxpVar);
        }
    }

    private alxz(@dzsi alxv alxvVar, boolean z) {
        this.e = new dzmd<>();
        this.f = new dzjg();
        this.g = new dzjg();
        this.h = new dzjg();
        this.i = new dzjg();
        this.j = new dzjg();
        this.l = alxvVar;
        this.k = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02b4 A[Catch: dsrm | IndexOutOfBoundsException -> 0x0436, IndexOutOfBoundsException -> 0x0438, all -> 0x0533, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000d, B:10:0x0013, B:13:0x0017, B:15:0x003b, B:22:0x0051, B:24:0x0057, B:170:0x042d, B:186:0x0442, B:26:0x006f, B:29:0x0077, B:31:0x0081, B:33:0x00a8, B:35:0x00af, B:37:0x00bb, B:39:0x00d5, B:38:0x00c6, B:41:0x00df, B:43:0x00e5, B:44:0x00f7, B:46:0x0102, B:48:0x010e, B:50:0x0118, B:52:0x0152, B:53:0x0154, B:55:0x015e, B:56:0x0160, B:58:0x016a, B:60:0x0173, B:62:0x0179, B:64:0x0193, B:66:0x019d, B:68:0x01a3, B:70:0x01c5, B:72:0x01cb, B:75:0x01ea, B:77:0x01ef, B:79:0x01f9, B:81:0x020f, B:80:0x0202, B:83:0x0213, B:85:0x0219, B:86:0x022b, B:87:0x0231, B:88:0x0235, B:90:0x023b, B:92:0x024f, B:94:0x0261, B:96:0x0275, B:101:0x0296, B:103:0x029c, B:106:0x02ac, B:108:0x02b4, B:110:0x02be, B:116:0x02f3, B:118:0x02f9, B:119:0x0303, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x031f, B:127:0x0325, B:128:0x032f, B:130:0x0335, B:132:0x033f, B:145:0x039c, B:147:0x03a8, B:149:0x03b2, B:151:0x03b6, B:133:0x0348, B:134:0x0355, B:136:0x035b, B:137:0x0365, B:138:0x0371, B:140:0x0377, B:141:0x0384, B:143:0x038a, B:144:0x0394, B:111:0x02c8, B:112:0x02d7, B:114:0x02dd, B:105:0x02a2, B:98:0x027f, B:99:0x0292, B:115:0x02e9, B:152:0x03b8, B:154:0x03be, B:156:0x03da, B:158:0x03df, B:160:0x03ea, B:161:0x03f0, B:162:0x03f5, B:164:0x03fd, B:165:0x0401, B:167:0x0406, B:65:0x019a, B:49:0x0115, B:45:0x00fa, B:168:0x041f, B:187:0x0455, B:192:0x0469, B:195:0x046d, B:197:0x0486, B:221:0x0514, B:198:0x0496, B:200:0x049c, B:201:0x04ad, B:204:0x04bc, B:205:0x04c1, B:207:0x04c7, B:218:0x050e, B:210:0x04d2, B:211:0x04da, B:213:0x04e0, B:214:0x04f1, B:215:0x04fa, B:217:0x0500, B:219:0x0511, B:228:0x051e, B:190:0x045e, B:229:0x052f), top: B:238:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d7 A[Catch: dsrm | IndexOutOfBoundsException -> 0x0436, IndexOutOfBoundsException -> 0x0438, all -> 0x0533, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000d, B:10:0x0013, B:13:0x0017, B:15:0x003b, B:22:0x0051, B:24:0x0057, B:170:0x042d, B:186:0x0442, B:26:0x006f, B:29:0x0077, B:31:0x0081, B:33:0x00a8, B:35:0x00af, B:37:0x00bb, B:39:0x00d5, B:38:0x00c6, B:41:0x00df, B:43:0x00e5, B:44:0x00f7, B:46:0x0102, B:48:0x010e, B:50:0x0118, B:52:0x0152, B:53:0x0154, B:55:0x015e, B:56:0x0160, B:58:0x016a, B:60:0x0173, B:62:0x0179, B:64:0x0193, B:66:0x019d, B:68:0x01a3, B:70:0x01c5, B:72:0x01cb, B:75:0x01ea, B:77:0x01ef, B:79:0x01f9, B:81:0x020f, B:80:0x0202, B:83:0x0213, B:85:0x0219, B:86:0x022b, B:87:0x0231, B:88:0x0235, B:90:0x023b, B:92:0x024f, B:94:0x0261, B:96:0x0275, B:101:0x0296, B:103:0x029c, B:106:0x02ac, B:108:0x02b4, B:110:0x02be, B:116:0x02f3, B:118:0x02f9, B:119:0x0303, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x031f, B:127:0x0325, B:128:0x032f, B:130:0x0335, B:132:0x033f, B:145:0x039c, B:147:0x03a8, B:149:0x03b2, B:151:0x03b6, B:133:0x0348, B:134:0x0355, B:136:0x035b, B:137:0x0365, B:138:0x0371, B:140:0x0377, B:141:0x0384, B:143:0x038a, B:144:0x0394, B:111:0x02c8, B:112:0x02d7, B:114:0x02dd, B:105:0x02a2, B:98:0x027f, B:99:0x0292, B:115:0x02e9, B:152:0x03b8, B:154:0x03be, B:156:0x03da, B:158:0x03df, B:160:0x03ea, B:161:0x03f0, B:162:0x03f5, B:164:0x03fd, B:165:0x0401, B:167:0x0406, B:65:0x019a, B:49:0x0115, B:45:0x00fa, B:168:0x041f, B:187:0x0455, B:192:0x0469, B:195:0x046d, B:197:0x0486, B:221:0x0514, B:198:0x0496, B:200:0x049c, B:201:0x04ad, B:204:0x04bc, B:205:0x04c1, B:207:0x04c7, B:218:0x050e, B:210:0x04d2, B:211:0x04da, B:213:0x04e0, B:214:0x04f1, B:215:0x04fa, B:217:0x0500, B:219:0x0511, B:228:0x051e, B:190:0x045e, B:229:0x052f), top: B:238:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03be A[Catch: dsrm | IndexOutOfBoundsException -> 0x0436, IndexOutOfBoundsException -> 0x0438, all -> 0x0533, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000d, B:10:0x0013, B:13:0x0017, B:15:0x003b, B:22:0x0051, B:24:0x0057, B:170:0x042d, B:186:0x0442, B:26:0x006f, B:29:0x0077, B:31:0x0081, B:33:0x00a8, B:35:0x00af, B:37:0x00bb, B:39:0x00d5, B:38:0x00c6, B:41:0x00df, B:43:0x00e5, B:44:0x00f7, B:46:0x0102, B:48:0x010e, B:50:0x0118, B:52:0x0152, B:53:0x0154, B:55:0x015e, B:56:0x0160, B:58:0x016a, B:60:0x0173, B:62:0x0179, B:64:0x0193, B:66:0x019d, B:68:0x01a3, B:70:0x01c5, B:72:0x01cb, B:75:0x01ea, B:77:0x01ef, B:79:0x01f9, B:81:0x020f, B:80:0x0202, B:83:0x0213, B:85:0x0219, B:86:0x022b, B:87:0x0231, B:88:0x0235, B:90:0x023b, B:92:0x024f, B:94:0x0261, B:96:0x0275, B:101:0x0296, B:103:0x029c, B:106:0x02ac, B:108:0x02b4, B:110:0x02be, B:116:0x02f3, B:118:0x02f9, B:119:0x0303, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x031f, B:127:0x0325, B:128:0x032f, B:130:0x0335, B:132:0x033f, B:145:0x039c, B:147:0x03a8, B:149:0x03b2, B:151:0x03b6, B:133:0x0348, B:134:0x0355, B:136:0x035b, B:137:0x0365, B:138:0x0371, B:140:0x0377, B:141:0x0384, B:143:0x038a, B:144:0x0394, B:111:0x02c8, B:112:0x02d7, B:114:0x02dd, B:105:0x02a2, B:98:0x027f, B:99:0x0292, B:115:0x02e9, B:152:0x03b8, B:154:0x03be, B:156:0x03da, B:158:0x03df, B:160:0x03ea, B:161:0x03f0, B:162:0x03f5, B:164:0x03fd, B:165:0x0401, B:167:0x0406, B:65:0x019a, B:49:0x0115, B:45:0x00fa, B:168:0x041f, B:187:0x0455, B:192:0x0469, B:195:0x046d, B:197:0x0486, B:221:0x0514, B:198:0x0496, B:200:0x049c, B:201:0x04ad, B:204:0x04bc, B:205:0x04c1, B:207:0x04c7, B:218:0x050e, B:210:0x04d2, B:211:0x04da, B:213:0x04e0, B:214:0x04f1, B:215:0x04fa, B:217:0x0500, B:219:0x0511, B:228:0x051e, B:190:0x045e, B:229:0x052f), top: B:238:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb A[Catch: dsrm | IndexOutOfBoundsException -> 0x0436, IndexOutOfBoundsException -> 0x0438, all -> 0x0533, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000d, B:10:0x0013, B:13:0x0017, B:15:0x003b, B:22:0x0051, B:24:0x0057, B:170:0x042d, B:186:0x0442, B:26:0x006f, B:29:0x0077, B:31:0x0081, B:33:0x00a8, B:35:0x00af, B:37:0x00bb, B:39:0x00d5, B:38:0x00c6, B:41:0x00df, B:43:0x00e5, B:44:0x00f7, B:46:0x0102, B:48:0x010e, B:50:0x0118, B:52:0x0152, B:53:0x0154, B:55:0x015e, B:56:0x0160, B:58:0x016a, B:60:0x0173, B:62:0x0179, B:64:0x0193, B:66:0x019d, B:68:0x01a3, B:70:0x01c5, B:72:0x01cb, B:75:0x01ea, B:77:0x01ef, B:79:0x01f9, B:81:0x020f, B:80:0x0202, B:83:0x0213, B:85:0x0219, B:86:0x022b, B:87:0x0231, B:88:0x0235, B:90:0x023b, B:92:0x024f, B:94:0x0261, B:96:0x0275, B:101:0x0296, B:103:0x029c, B:106:0x02ac, B:108:0x02b4, B:110:0x02be, B:116:0x02f3, B:118:0x02f9, B:119:0x0303, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x031f, B:127:0x0325, B:128:0x032f, B:130:0x0335, B:132:0x033f, B:145:0x039c, B:147:0x03a8, B:149:0x03b2, B:151:0x03b6, B:133:0x0348, B:134:0x0355, B:136:0x035b, B:137:0x0365, B:138:0x0371, B:140:0x0377, B:141:0x0384, B:143:0x038a, B:144:0x0394, B:111:0x02c8, B:112:0x02d7, B:114:0x02dd, B:105:0x02a2, B:98:0x027f, B:99:0x0292, B:115:0x02e9, B:152:0x03b8, B:154:0x03be, B:156:0x03da, B:158:0x03df, B:160:0x03ea, B:161:0x03f0, B:162:0x03f5, B:164:0x03fd, B:165:0x0401, B:167:0x0406, B:65:0x019a, B:49:0x0115, B:45:0x00fa, B:168:0x041f, B:187:0x0455, B:192:0x0469, B:195:0x046d, B:197:0x0486, B:221:0x0514, B:198:0x0496, B:200:0x049c, B:201:0x04ad, B:204:0x04bc, B:205:0x04c1, B:207:0x04c7, B:218:0x050e, B:210:0x04d2, B:211:0x04da, B:213:0x04e0, B:214:0x04f1, B:215:0x04fa, B:217:0x0500, B:219:0x0511, B:228:0x051e, B:190:0x045e, B:229:0x052f), top: B:238:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023b A[Catch: dsrm | IndexOutOfBoundsException -> 0x0436, IndexOutOfBoundsException -> 0x0438, all -> 0x0533, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000d, B:10:0x0013, B:13:0x0017, B:15:0x003b, B:22:0x0051, B:24:0x0057, B:170:0x042d, B:186:0x0442, B:26:0x006f, B:29:0x0077, B:31:0x0081, B:33:0x00a8, B:35:0x00af, B:37:0x00bb, B:39:0x00d5, B:38:0x00c6, B:41:0x00df, B:43:0x00e5, B:44:0x00f7, B:46:0x0102, B:48:0x010e, B:50:0x0118, B:52:0x0152, B:53:0x0154, B:55:0x015e, B:56:0x0160, B:58:0x016a, B:60:0x0173, B:62:0x0179, B:64:0x0193, B:66:0x019d, B:68:0x01a3, B:70:0x01c5, B:72:0x01cb, B:75:0x01ea, B:77:0x01ef, B:79:0x01f9, B:81:0x020f, B:80:0x0202, B:83:0x0213, B:85:0x0219, B:86:0x022b, B:87:0x0231, B:88:0x0235, B:90:0x023b, B:92:0x024f, B:94:0x0261, B:96:0x0275, B:101:0x0296, B:103:0x029c, B:106:0x02ac, B:108:0x02b4, B:110:0x02be, B:116:0x02f3, B:118:0x02f9, B:119:0x0303, B:121:0x0309, B:122:0x0313, B:124:0x0319, B:125:0x031f, B:127:0x0325, B:128:0x032f, B:130:0x0335, B:132:0x033f, B:145:0x039c, B:147:0x03a8, B:149:0x03b2, B:151:0x03b6, B:133:0x0348, B:134:0x0355, B:136:0x035b, B:137:0x0365, B:138:0x0371, B:140:0x0377, B:141:0x0384, B:143:0x038a, B:144:0x0394, B:111:0x02c8, B:112:0x02d7, B:114:0x02dd, B:105:0x02a2, B:98:0x027f, B:99:0x0292, B:115:0x02e9, B:152:0x03b8, B:154:0x03be, B:156:0x03da, B:158:0x03df, B:160:0x03ea, B:161:0x03f0, B:162:0x03f5, B:164:0x03fd, B:165:0x0401, B:167:0x0406, B:65:0x019a, B:49:0x0115, B:45:0x00fa, B:168:0x041f, B:187:0x0455, B:192:0x0469, B:195:0x046d, B:197:0x0486, B:221:0x0514, B:198:0x0496, B:200:0x049c, B:201:0x04ad, B:204:0x04bc, B:205:0x04c1, B:207:0x04c7, B:218:0x050e, B:210:0x04d2, B:211:0x04da, B:213:0x04e0, B:214:0x04f1, B:215:0x04fa, B:217:0x0500, B:219:0x0511, B:228:0x051e, B:190:0x045e, B:229:0x052f), top: B:238:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized defpackage.alxp l(long r26) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alxz.l(long):alxp");
    }
}
