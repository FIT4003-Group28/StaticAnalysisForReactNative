package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vun  reason: default package */
/* loaded from: classes4.dex */
public final class vun {
    private static final Set c;
    public final Context a;
    public final Uri b;
    private final File d;
    private final vum e;
    private final Uri f;
    private final float g;
    private final long h;
    private final long i;
    private final vrc j;
    private final boolean k;
    private final boolean l;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("vide");
        hashSet.add("soun");
    }

    public vun(Context context, File file, Uri uri, long j, long j2, Uri uri2, float f, long j3, vrc vrcVar, vul vulVar, boolean z, long j4) {
        this.a = context;
        this.d = file != null ? file : context.getCacheDir();
        this.b = uri;
        this.f = uri2;
        this.g = f;
        this.h = j3;
        this.j = vrcVar;
        this.k = vulVar.a;
        this.e = new vum(j, j2);
        this.l = z;
        this.i = j4;
    }

    static long a(long[] jArr, long j, long j2, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch = Math.max(0, (binarySearch ^ (-1)) - 1);
        }
        if (!z) {
            binarySearch++;
        }
        return binarySearch < jArr.length ? jArr[binarySearch] : j;
    }

    public static cvq b(Context context, Uri uri) {
        axja g = vqz.g(context, uri);
        try {
            return new cvq(g, vrj.b);
        } catch (IOException e) {
            g.close();
            throw new vqc(e, vqb.ISO_FILE);
        }
    }

    static final axjf e(int i, cxd cxdVar) {
        try {
            StringBuilder sb = new StringBuilder(17);
            sb.append("track-");
            sb.append(i);
            return new axjf(sb.toString(), cxdVar, new cvq[0]);
        } catch (Throwable th) {
            throw new vqc(th, vqb.CREATE_MP4_TRACK);
        }
    }

    public static vun f(Context context, Uri uri, long j, long j2) {
        return g(context, uri, j, j2, new vul());
    }

    public static vun g(Context context, Uri uri, long j, long j2, vul vulVar) {
        return new vun(context, null, uri, j, j2, null, 0.0f, 0L, null, vulVar, false, 0L);
    }

    private final Uri h(String str) {
        return Uri.fromFile(this.d).buildUpon().appendPath(str).build();
    }

    private static boolean i(cxd cxdVar) {
        cwj n;
        cvr cvrVar;
        cwh l = cxdVar.l();
        if (l == null || (n = l.n()) == null) {
            return false;
        }
        Iterator it = n.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                cvrVar = null;
                break;
            }
            cvs cvsVar = (cvs) it.next();
            if (cvsVar instanceof cvr) {
                cvrVar = (cvr) cvsVar;
                break;
            }
        }
        return cvrVar instanceof cwu;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(21:(7:300|301|(1:303)(1:344)|304|(1:306)(1:343)|307|(25:309|310|311|4|5|7|8|(3:10|12|13)(1:294)|14|15|16|17|(3:24|(4:27|(3:29|30|31)(1:33)|32|25)|34)|35|(3:37|38|(6:40|41|(6:45|46|(2:51|52)(3:54|55|(16:57|58|59|60|(3:164|165|(10:167|63|(3:64|(2:66|(2:67|(2:69|(4:73|(5:(1:76)(1:106)|77|(8:80|(3:83|(2:85|(1:87)(3:88|89|90))(3:92|93|94)|81)|95|96|(1:98)(1:101)|99|100|78)|102|103)(1:107)|104|105)(1:160))(1:161)))(2:162|163)|112)|115|(1:159)(1:119)|120|(3:123|(2:124|(5:126|(5:(3:130|(2:132|(1:134)(3:135|136|137))(3:138|139|140)|128)|141|142|(1:144)(1:152)|145)(1:153)|146|(2:148|149)(1:151)|150))|121)|156|157|158))|62|63|(3:64|(0)(0)|112)|115|(1:117)|159|120|(1:121)|156|157|158)(3:175|176|177))|53|42|43)|182|183|(4:273|274|275|276)(12:188|189|(14:192|193|194|195|(1:247)(1:199)|200|(4:203|(2:204|(5:(6:207|(3:210|(2:212|(1:214)(3:215|216|217))(3:218|219|220)|208)|221|222|(1:224)(1:236)|225)(1:237)|226|(1:230)|231|(1:233))(3:238|239|240))|235|201)|241|242|243|244|245|246|190)|248|249|250|(2:253|251)|254|255|(1:257)|258|259)))|283|(2:286|284)|287|250|(1:251)|254|255|(0)|258|259))|7|8|(0)(0)|14|15|16|17|(5:19|22|24|(1:25)|34)|35|(0)|283|(1:284)|287|250|(1:251)|254|255|(0)|258|259)|3|4|5|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0386, code lost:
        r40 = r8;
        r50 = r9;
        r54 = r10;
        r53 = r11;
        r36 = r36 + (r6 * r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0394, code lost:
        if (r15 != r1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0396, code lost:
        r11 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x045a, code lost:
        r3 = r25;
        r7 = r26;
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0705, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0706, code lost:
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02aa A[Catch: all -> 0x066c, TryCatch #6 {all -> 0x066c, blocks: (B:92:0x0274, B:101:0x0292, B:102:0x02a4, B:104:0x02aa, B:105:0x02c4, B:107:0x02c7, B:112:0x02d3, B:115:0x02d9, B:117:0x02e4, B:123:0x0300, B:125:0x0306, B:127:0x0319, B:128:0x0326, B:129:0x032b, B:130:0x032c, B:131:0x0331, B:136:0x033c, B:141:0x0374, B:142:0x0386, B:147:0x03bf, B:149:0x03c9, B:151:0x03cf, B:153:0x03d5, B:154:0x03e4, B:156:0x03ea, B:159:0x0402, B:163:0x040a, B:165:0x0410, B:167:0x041f, B:168:0x042c, B:169:0x0431, B:170:0x0432, B:171:0x0437, B:176:0x0440, B:181:0x0455, B:183:0x0461, B:184:0x04a2, B:185:0x04ad, B:189:0x04bd, B:191:0x04d4), top: B:310:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ea A[Catch: all -> 0x066c, TryCatch #6 {all -> 0x066c, blocks: (B:92:0x0274, B:101:0x0292, B:102:0x02a4, B:104:0x02aa, B:105:0x02c4, B:107:0x02c7, B:112:0x02d3, B:115:0x02d9, B:117:0x02e4, B:123:0x0300, B:125:0x0306, B:127:0x0319, B:128:0x0326, B:129:0x032b, B:130:0x032c, B:131:0x0331, B:136:0x033c, B:141:0x0374, B:142:0x0386, B:147:0x03bf, B:149:0x03c9, B:151:0x03cf, B:153:0x03d5, B:154:0x03e4, B:156:0x03ea, B:159:0x0402, B:163:0x040a, B:165:0x0410, B:167:0x041f, B:168:0x042c, B:169:0x0431, B:170:0x0432, B:171:0x0437, B:176:0x0440, B:181:0x0455, B:183:0x0461, B:184:0x04a2, B:185:0x04ad, B:189:0x04bd, B:191:0x04d4), top: B:310:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0696 A[Catch: IOException -> 0x06f1, LOOP:14: B:265:0x0690->B:267:0x0696, LOOP_END, TryCatch #4 {IOException -> 0x06f1, blocks: (B:262:0x0676, B:263:0x067d, B:199:0x04ec, B:245:0x0644, B:268:0x06a0, B:269:0x06a4, B:271:0x06aa, B:272:0x06b4, B:274:0x06c2, B:275:0x06d1, B:264:0x067e, B:265:0x0690, B:267:0x0696, B:200:0x04ee, B:202:0x04f6, B:204:0x04fc, B:206:0x0502, B:207:0x051b, B:209:0x0521, B:216:0x0547, B:218:0x054d, B:220:0x0562, B:221:0x0574, B:222:0x0579, B:223:0x057a, B:224:0x057f, B:229:0x058e, B:231:0x05a7, B:236:0x05bf, B:238:0x05c5, B:241:0x05ff, B:243:0x063c, B:61:0x01ef, B:63:0x01f6, B:66:0x01fb, B:68:0x0201, B:69:0x020b, B:71:0x0211, B:73:0x021d), top: B:307:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06aa A[Catch: IOException -> 0x06f1, LOOP:13: B:269:0x06a4->B:271:0x06aa, LOOP_END, TryCatch #4 {IOException -> 0x06f1, blocks: (B:262:0x0676, B:263:0x067d, B:199:0x04ec, B:245:0x0644, B:268:0x06a0, B:269:0x06a4, B:271:0x06aa, B:272:0x06b4, B:274:0x06c2, B:275:0x06d1, B:264:0x067e, B:265:0x0690, B:267:0x0696, B:200:0x04ee, B:202:0x04f6, B:204:0x04fc, B:206:0x0502, B:207:0x051b, B:209:0x0521, B:216:0x0547, B:218:0x054d, B:220:0x0562, B:221:0x0574, B:222:0x0579, B:223:0x057a, B:224:0x057f, B:229:0x058e, B:231:0x05a7, B:236:0x05bf, B:238:0x05c5, B:241:0x05ff, B:243:0x063c, B:61:0x01ef, B:63:0x01f6, B:66:0x01fb, B:68:0x0201, B:69:0x020b, B:71:0x0211, B:73:0x021d), top: B:307:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06c2 A[Catch: IOException -> 0x06f1, TryCatch #4 {IOException -> 0x06f1, blocks: (B:262:0x0676, B:263:0x067d, B:199:0x04ec, B:245:0x0644, B:268:0x06a0, B:269:0x06a4, B:271:0x06aa, B:272:0x06b4, B:274:0x06c2, B:275:0x06d1, B:264:0x067e, B:265:0x0690, B:267:0x0696, B:200:0x04ee, B:202:0x04f6, B:204:0x04fc, B:206:0x0502, B:207:0x051b, B:209:0x0521, B:216:0x0547, B:218:0x054d, B:220:0x0562, B:221:0x0574, B:222:0x0579, B:223:0x057a, B:224:0x057f, B:229:0x058e, B:231:0x05a7, B:236:0x05bf, B:238:0x05c5, B:241:0x05ff, B:243:0x063c, B:61:0x01ef, B:63:0x01f6, B:66:0x01fb, B:68:0x0201, B:69:0x020b, B:71:0x0211, B:73:0x021d), top: B:307:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce A[Catch: IOException -> 0x06fe, TRY_LEAVE, TryCatch #13 {IOException -> 0x06fe, blocks: (B:52:0x01c9, B:54:0x01ce), top: B:320:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0211 A[Catch: all -> 0x06de, TryCatch #4 {IOException -> 0x06f1, blocks: (B:262:0x0676, B:263:0x067d, B:199:0x04ec, B:245:0x0644, B:268:0x06a0, B:269:0x06a4, B:271:0x06aa, B:272:0x06b4, B:274:0x06c2, B:275:0x06d1, B:264:0x067e, B:265:0x0690, B:267:0x0696, B:200:0x04ee, B:202:0x04f6, B:204:0x04fc, B:206:0x0502, B:207:0x051b, B:209:0x0521, B:216:0x0547, B:218:0x054d, B:220:0x0562, B:221:0x0574, B:222:0x0579, B:223:0x057a, B:224:0x057f, B:229:0x058e, B:231:0x05a7, B:236:0x05bf, B:238:0x05c5, B:241:0x05ff, B:243:0x063c, B:61:0x01ef, B:63:0x01f6, B:66:0x01fb, B:68:0x0201, B:69:0x020b, B:71:0x0211, B:73:0x021d), top: B:307:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234 A[Catch: IOException -> 0x06f3, TRY_LEAVE, TryCatch #3 {IOException -> 0x06f3, blocks: (B:60:0x01e0, B:75:0x0225, B:77:0x0234), top: B:305:0x01e0 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [long] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vur c() {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vun.c():vur");
    }

    public final List d(cvq cvqVar, cwk cwkVar) {
        cwf l;
        try {
            ArrayList arrayList = new ArrayList();
            for (cxd cxdVar : cwkVar.j(cxd.class)) {
                cwh l2 = cxdVar.l();
                if (l2 != null && (l = l2.l()) != null && c.contains(l.a) && ((!this.l && cvqVar == null) || !i(cxdVar))) {
                    arrayList.add(e(arrayList.size(), cxdVar));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (!(th instanceof vqc)) {
                throw new vqc(th, vqb.GENERATE_OUTPUT_TRACKS);
            }
            throw th;
        }
    }
}
