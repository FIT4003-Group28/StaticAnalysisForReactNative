package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bsp  reason: default package */
/* loaded from: classes4.dex */
public final class bsp implements bsl {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final cfe j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public bsn f = new bsn();

    public bsp(cfe cfeVar, bsn bsnVar, ByteBuffer byteBuffer, int i) {
        this.j = cfeVar;
        c(bsnVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    private final Bitmap e() {
        Bitmap.Config config;
        Boolean bool = this.h;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.i;
        }
        cfe cfeVar = this.j;
        Bitmap c = cfeVar.a.c(this.t, this.s, config);
        c.setHasAlpha(true);
        return c;
    }

    @Override // defpackage.bsl
    public final void a() {
        this.e = (this.e + 1) % this.f.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
        if (r10.j == r5.h) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0472 A[Catch: all -> 0x04b0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:60:0x00b5, B:62:0x00cd, B:64:0x00d2, B:65:0x00d7, B:67:0x00dd, B:69:0x00e1, B:71:0x00f3, B:73:0x00fc, B:75:0x010b, B:77:0x010f, B:80:0x011a, B:82:0x0122, B:83:0x0126, B:85:0x012c, B:86:0x0130, B:88:0x0136, B:89:0x013c, B:91:0x0150, B:92:0x0159, B:96:0x0177, B:101:0x019c, B:104:0x01a8, B:106:0x01ca, B:113:0x01f5, B:116:0x0206, B:119:0x0210, B:120:0x0219, B:121:0x0221, B:123:0x0227, B:126:0x0234, B:129:0x0241, B:99:0x0184, B:132:0x025d, B:134:0x0269, B:137:0x0270, B:139:0x0286, B:143:0x0293, B:145:0x0299, B:147:0x02a3, B:149:0x02a7, B:151:0x02ab, B:152:0x02b4, B:153:0x02ba, B:155:0x02be, B:166:0x02d2, B:244:0x046e, B:246:0x0472, B:250:0x0479, B:252:0x047d, B:253:0x0483, B:254:0x0496, B:159:0x02c7, B:167:0x02da, B:169:0x02ff, B:172:0x0307, B:183:0x032b, B:185:0x0332, B:187:0x0335, B:191:0x0342, B:194:0x034f, B:196:0x035a, B:200:0x0368, B:199:0x0361, B:237:0x0448, B:202:0x037d, B:204:0x0386, B:205:0x0397, B:207:0x039c, B:210:0x03a5, B:212:0x03b2, B:213:0x03c7, B:215:0x03d0, B:216:0x03d4, B:218:0x03d9, B:221:0x03e0, B:223:0x03eb, B:224:0x0400, B:230:0x041d, B:234:0x042b, B:233:0x0424, B:228:0x0409, B:238:0x045a, B:243:0x0468, B:242:0x0464, B:79:0x0112, B:74:0x0105, B:8:0x000e), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x047d A[Catch: all -> 0x04b0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:60:0x00b5, B:62:0x00cd, B:64:0x00d2, B:65:0x00d7, B:67:0x00dd, B:69:0x00e1, B:71:0x00f3, B:73:0x00fc, B:75:0x010b, B:77:0x010f, B:80:0x011a, B:82:0x0122, B:83:0x0126, B:85:0x012c, B:86:0x0130, B:88:0x0136, B:89:0x013c, B:91:0x0150, B:92:0x0159, B:96:0x0177, B:101:0x019c, B:104:0x01a8, B:106:0x01ca, B:113:0x01f5, B:116:0x0206, B:119:0x0210, B:120:0x0219, B:121:0x0221, B:123:0x0227, B:126:0x0234, B:129:0x0241, B:99:0x0184, B:132:0x025d, B:134:0x0269, B:137:0x0270, B:139:0x0286, B:143:0x0293, B:145:0x0299, B:147:0x02a3, B:149:0x02a7, B:151:0x02ab, B:152:0x02b4, B:153:0x02ba, B:155:0x02be, B:166:0x02d2, B:244:0x046e, B:246:0x0472, B:250:0x0479, B:252:0x047d, B:253:0x0483, B:254:0x0496, B:159:0x02c7, B:167:0x02da, B:169:0x02ff, B:172:0x0307, B:183:0x032b, B:185:0x0332, B:187:0x0335, B:191:0x0342, B:194:0x034f, B:196:0x035a, B:200:0x0368, B:199:0x0361, B:237:0x0448, B:202:0x037d, B:204:0x0386, B:205:0x0397, B:207:0x039c, B:210:0x03a5, B:212:0x03b2, B:213:0x03c7, B:215:0x03d0, B:216:0x03d4, B:218:0x03d9, B:221:0x03e0, B:223:0x03eb, B:224:0x0400, B:230:0x041d, B:234:0x042b, B:233:0x0424, B:228:0x0409, B:238:0x045a, B:243:0x0468, B:242:0x0464, B:79:0x0112, B:74:0x0105, B:8:0x000e), top: B:264:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd A[Catch: all -> 0x04b0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:9:0x0010, B:14:0x001a, B:16:0x0023, B:17:0x002b, B:19:0x003d, B:21:0x0049, B:23:0x004d, B:24:0x0051, B:26:0x0055, B:29:0x0059, B:31:0x005d, B:33:0x0070, B:35:0x0074, B:36:0x007a, B:38:0x007e, B:40:0x0082, B:41:0x0087, B:44:0x008f, B:46:0x0093, B:48:0x0097, B:50:0x009c, B:53:0x00a2, B:55:0x00a6, B:57:0x00ae, B:60:0x00b5, B:62:0x00cd, B:64:0x00d2, B:65:0x00d7, B:67:0x00dd, B:69:0x00e1, B:71:0x00f3, B:73:0x00fc, B:75:0x010b, B:77:0x010f, B:80:0x011a, B:82:0x0122, B:83:0x0126, B:85:0x012c, B:86:0x0130, B:88:0x0136, B:89:0x013c, B:91:0x0150, B:92:0x0159, B:96:0x0177, B:101:0x019c, B:104:0x01a8, B:106:0x01ca, B:113:0x01f5, B:116:0x0206, B:119:0x0210, B:120:0x0219, B:121:0x0221, B:123:0x0227, B:126:0x0234, B:129:0x0241, B:99:0x0184, B:132:0x025d, B:134:0x0269, B:137:0x0270, B:139:0x0286, B:143:0x0293, B:145:0x0299, B:147:0x02a3, B:149:0x02a7, B:151:0x02ab, B:152:0x02b4, B:153:0x02ba, B:155:0x02be, B:166:0x02d2, B:244:0x046e, B:246:0x0472, B:250:0x0479, B:252:0x047d, B:253:0x0483, B:254:0x0496, B:159:0x02c7, B:167:0x02da, B:169:0x02ff, B:172:0x0307, B:183:0x032b, B:185:0x0332, B:187:0x0335, B:191:0x0342, B:194:0x034f, B:196:0x035a, B:200:0x0368, B:199:0x0361, B:237:0x0448, B:202:0x037d, B:204:0x0386, B:205:0x0397, B:207:0x039c, B:210:0x03a5, B:212:0x03b2, B:213:0x03c7, B:215:0x03d0, B:216:0x03d4, B:218:0x03d9, B:221:0x03e0, B:223:0x03eb, B:224:0x0400, B:230:0x041d, B:234:0x042b, B:233:0x0424, B:228:0x0409, B:238:0x045a, B:243:0x0468, B:242:0x0464, B:79:0x0112, B:74:0x0105, B:8:0x000e), top: B:264:0x0003 }] */
    @Override // defpackage.bsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap b() {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsp.b():android.graphics.Bitmap");
    }

    public final synchronized void c(bsn bsnVar, ByteBuffer byteBuffer, int i) {
        int[] iArr;
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.q = 0;
            this.f = bsnVar;
            this.e = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            Iterator<bsm> it = bsnVar.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().g == 3) {
                        this.p = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.r = highestOneBit;
            int i2 = bsnVar.f;
            this.t = i2 / highestOneBit;
            int i3 = bsnVar.g;
            this.s = i3 / highestOneBit;
            this.c = this.j.b(i2 * i3);
            cfe cfeVar = this.j;
            int i4 = this.t * this.s;
            bxl bxlVar = cfeVar.b;
            if (bxlVar == null) {
                iArr = new int[i4];
            } else {
                iArr = (int[]) bxlVar.b(i4, int[].class);
            }
            this.d = iArr;
        } else {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
