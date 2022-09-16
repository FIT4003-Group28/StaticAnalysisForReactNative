package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: affp  reason: default package */
/* loaded from: classes.dex */
public final class affp extends afev {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private String F;
    private String G;
    private int H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private final Handler f41J;
    public final aetv c;
    public final afmq d;
    public awan e;
    private final aepf f;
    private final yrj g;
    private final PlayerConfigModel h;
    private final adzz i;
    private final amqo j;
    private final float k;
    private final float l;
    private final boolean m;
    private final int n;
    private final amqo o;
    private final affo p;
    private final String q;
    private final String r;
    private final afkm s;
    private int t;
    private int u;
    private final afmw v;
    private long w;
    private float x;
    private boolean y;
    private aegx z;

    public affp(aepf aepfVar, yrj yrjVar, PlayerConfigModel playerConfigModel, adzz adzzVar, boolean z, afmw afmwVar, aegx aegxVar, amqo amqoVar, float f, float f2, String str, String str2, afjz afjzVar, amqo amqoVar2, afkm afkmVar, aeub aeubVar, aetv aetvVar) {
        super(afjzVar, aeubVar);
        this.D = Integer.MAX_VALUE;
        this.E = 0;
        this.F = "";
        this.G = "";
        this.H = 0;
        this.I = 0;
        this.f41J = new Handler(Looper.getMainLooper());
        this.c = aetvVar;
        this.f = aepfVar;
        this.g = yrjVar;
        this.h = playerConfigModel;
        this.i = adzzVar;
        this.m = z;
        afmv afmvVar = (afmv) afmwVar.get();
        this.t = afmvVar.c;
        this.u = afmvVar.d;
        this.v = afmwVar;
        this.z = aegxVar;
        this.j = amqoVar;
        this.k = f;
        this.l = f2;
        this.x = 1.0f;
        this.q = str;
        this.w = Long.MIN_VALUE;
        this.A = false;
        this.n = afjzVar.aq();
        this.o = amqoVar2;
        this.r = str2;
        this.p = (!afjzVar.h.h() || !((awuk) ((yve) afjzVar.h.c()).c()).c) ? new affn() : new affm();
        this.s = afkmVar;
        afmq afmqVar = afjzVar.i;
        this.d = afmqVar;
        this.e = afmqVar.b(str2);
        if (afmqVar.f() && aetvVar != null) {
            aetvVar.z(this.e);
        }
        this.C = false;
    }

    static final aeuq j(List list, afes afesVar) {
        if (!list.isEmpty()) {
            afet afetVar = (afet) list.get(0);
            long j = afetVar.c;
            long j2 = afetVar.b;
            aeup aeupVar = new aeup();
            aeupVar.b(j - j2);
            aeupVar.c(afesVar.a());
            return aeupVar.a();
        }
        aeup aeupVar2 = new aeup();
        aeupVar2.b(10000000L);
        aeupVar2.c(afesVar.a());
        return aeupVar2.a();
    }

    private final float k() {
        return awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY.equals(this.e) ? this.l : this.k;
    }

    private static int l(int i, int i2) {
        return i > 0 ? i : i2 <= 240 ? 48000 : 128000;
    }

    private final int m() {
        return aeha.b(this.z, this.t, this.u, k(), this.A);
    }

    private final long n(long j, aeuq aeuqVar, long j2) {
        aqwu aqwuVar = this.h.c.e;
        if (aqwuVar == null) {
            aqwuVar = aqwu.b;
        }
        if (aqwuVar.X) {
            if (j2 <= 0) {
                return 0L;
            }
            aqwu aqwuVar2 = this.h.c.e;
            if (aqwuVar2 == null) {
                aqwuVar2 = aqwu.b;
            }
            if (!aqwuVar2.Y) {
                long j3 = aeuqVar.a;
                return Math.max(0L, (j + j3) - ((j3 * aeuqVar.a()) / j2));
            }
            double d = j;
            Double.isNaN(d);
            return (long) Math.max(0.0d, d / (1.0d - Math.min(j2 / aeuqVar.a(), 0.8d)));
        }
        return j;
    }

    private final afes o(afes[] afesVarArr, long j) {
        int i = i();
        int m = m();
        afes afesVar = null;
        for (afes afesVar2 : afesVarArr) {
            if (q(afesVar2) && (r(afesVar2, j) || h(this.i, afesVar2, this.q, this.h, j))) {
                if (afesVar2.b() <= i && afesVar2.b() >= m) {
                    return afesVar2;
                }
                if (afesVar == null) {
                    afesVar = afesVar2;
                }
            }
        }
        return afesVar;
    }

    private final afes p(afes[] afesVarArr, long j) {
        int length;
        int min = Math.min(i(), this.e == awan.VIDEO_QUALITY_SETTING_DATA_SAVER ? this.b.b() : Integer.MAX_VALUE);
        int length2 = afesVarArr.length - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = afesVarArr.length;
            if (i2 >= length) {
                break;
            } else if (afesVarArr[i2].b() <= min) {
                length2 = i2;
                break;
            } else {
                i2++;
            }
        }
        int m = m();
        while (true) {
            length--;
            if (length >= 0) {
                if (afesVarArr[length].b() >= m) {
                    i = length;
                    break;
                }
            } else {
                break;
            }
        }
        if (length2 < i) {
            while (length2 <= i) {
                afes afesVar = afesVarArr[length2];
                aqwu aqwuVar = this.h.c.e;
                if (aqwuVar == null) {
                    aqwuVar = aqwu.b;
                }
                if (((aqwuVar.aR && this.z.e()) || aeha.f(afesVar.c(), afesVar.b(), this.t, this.u, k())) && u(afesVar, j) && aeha.e(afesVar.a(), l(((Integer) this.j.get()).intValue(), afesVar.b()), this.z, this.h, this.A, this.g.a()) && ((this.z.d() || this.z.c() || !this.y || t(afesVar)) && ((awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY.equals(this.e) || (!aeha.g(afesVar.b(), this.g, this.n) && (this.z.d() || this.z.e() || afeu.c(this.i, this.q, this.h, afesVar)))) && q(afesVar)))) {
                    return afesVarArr[length2];
                }
                length2++;
            }
            return afesVarArr[i];
        }
        return afesVarArr[length2];
    }

    private final boolean q(afes afesVar) {
        return this.C ? !s(afesVar) : afesVar.b() < this.D || s(afesVar);
    }

    private final boolean r(afes afesVar, long j) {
        return afeu.b(this.i, afesVar, this.q, this.h, this.m, j);
    }

    private static boolean s(afes afesVar) {
        return aank.r().contains(Integer.valueOf(ovm.a(afesVar.d())));
    }

    private static boolean t(afes afesVar) {
        return ((Set) aank.bt.get()).contains(Integer.valueOf(ovm.a(afesVar.d())));
    }

    private static boolean u(afes afesVar, long j) {
        return ((long) afesVar.a()) <= j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01da, code lost:
        if (defpackage.wd.a(r5, r13) > 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0461, code lost:
        if (r11.b != r39.E) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
        if (defpackage.wd.a(r5, r13) < 0) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0368 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0380 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0389 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0441 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0470 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x047b A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0488 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0514, TRY_ENTER, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190 A[Catch: all -> 0x0514, TryCatch #1 {all -> 0x0514, blocks: (B:19:0x004e, B:21:0x0057, B:23:0x0063, B:24:0x0079, B:26:0x008f, B:28:0x0099, B:32:0x00a4, B:38:0x00b6, B:40:0x00c0, B:42:0x00c8, B:45:0x00ce, B:47:0x00d6, B:48:0x00d8, B:55:0x0103, B:59:0x0119, B:89:0x0190, B:91:0x0196, B:93:0x019e, B:190:0x0360, B:194:0x036c, B:196:0x037a, B:198:0x0380, B:201:0x0389, B:203:0x0390, B:204:0x03ce, B:220:0x0439, B:222:0x0441, B:224:0x0445, B:235:0x046c, B:237:0x0470, B:239:0x0477, B:241:0x047b, B:243:0x0482, B:245:0x0488, B:246:0x048e, B:247:0x04ee, B:228:0x0455, B:230:0x045d, B:232:0x0463, B:248:0x04fe, B:96:0x01af, B:98:0x01b7, B:105:0x01ce, B:107:0x01d6, B:114:0x01ed, B:173:0x032b, B:178:0x0337, B:184:0x0349, B:117:0x01fc, B:120:0x020b, B:122:0x020f, B:126:0x0218, B:130:0x0245, B:146:0x028f, B:133:0x0252, B:135:0x026e, B:136:0x0270, B:140:0x0277, B:129:0x0239, B:149:0x02ab, B:152:0x02b7, B:154:0x02c4, B:155:0x02c6, B:160:0x02cf, B:163:0x0303, B:165:0x0315, B:166:0x0317, B:169:0x031d, B:111:0x01e2, B:102:0x01c3, B:62:0x0136, B:64:0x0140, B:71:0x0156, B:73:0x015c, B:76:0x0165, B:78:0x0169, B:81:0x0174, B:83:0x0185, B:84:0x0187, B:68:0x014b, B:58:0x010d, B:54:0x00e8, B:205:0x03d7, B:207:0x03e3, B:209:0x03e7, B:211:0x03ed, B:213:0x03f3, B:214:0x0414, B:218:0x0424), top: B:270:0x004e }] */
    @Override // defpackage.afev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r40, long r41, long r43, defpackage.afes[] r45, defpackage.afer r46) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affp.a(java.util.List, long, long, afes[], afer):void");
    }

    @Override // defpackage.afev
    public final void b(boolean z) {
        this.A = z;
    }

    @Override // defpackage.afev
    public final void c() {
        this.C = true;
    }

    @Override // defpackage.afev
    public final void d(float f) {
        this.x = f;
    }

    @Override // defpackage.afev
    public final void e() {
        this.y = true;
    }

    @Override // defpackage.afev
    public final void f(aegx aegxVar) {
        this.z = aegxVar;
    }

    @Override // defpackage.afev
    public final void g(afmv afmvVar) {
        this.t = afmvVar.c;
        this.u = afmvVar.d;
    }

    final int i() {
        return aeha.a(this.z, this.t, this.u, k(), this.A);
    }
}
