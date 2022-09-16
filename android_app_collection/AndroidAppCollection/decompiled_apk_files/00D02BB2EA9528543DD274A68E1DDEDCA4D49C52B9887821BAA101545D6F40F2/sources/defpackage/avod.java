package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: avod  reason: default package */
/* loaded from: classes3.dex */
public final class avod extends avil {
    public static final dcqe a = dcqe.c("avod");
    public final dbty<awcy> b;
    public final avnk c;
    public final dxio<ahjq> d;
    public final bvjj e;
    public final cqat f;
    public final dxio<akfa> g;
    public final cjqy h;
    public final avop i;
    private final awnd j;
    private final Context k;

    public avod(dbty<awcy> dbtyVar, awnd awndVar, avnk avnkVar, dxio<ahjq> dxioVar, bvjj bvjjVar, cqat cqatVar, dxio<akfa> dxioVar2, cjqy cjqyVar, avop avopVar, Context context) {
        this.b = dbtyVar;
        this.j = awndVar;
        this.c = avnkVar;
        this.d = dxioVar;
        this.e = bvjjVar;
        this.f = cqatVar;
        this.g = dxioVar2;
        this.h = cjqyVar;
        this.i = avopVar;
        this.k = context;
    }

    public static <T> T e(byte[] bArr, dssr<T> dssrVar, drtc drtcVar, int i) {
        if (bArr == null) {
            String valueOf = String.valueOf(dssrVar.getClass().getSimpleName());
            throw avln.a(drtcVar, i, valueOf.length() != 0 ? "Proto is null: ".concat(valueOf) : new String("Proto is null: "));
        }
        try {
            return dssrVar.j(bArr);
        } catch (dsrm e) {
            throw avln.a(drtcVar, i, e.toString());
        }
    }

    @Override // defpackage.avim
    public final void b(final avhe avheVar) {
        awnd awndVar = this.j;
        awnc awncVar = avnu.a;
        avheVar.getClass();
        awnb awnbVar = new awnb(avheVar) { // from class: avnv
            private final avhe a;

            {
                this.a = avheVar;
            }

            @Override // defpackage.awnb
            public final void a(Object obj) {
                this.a.e((byte[]) obj);
            }
        };
        avheVar.getClass();
        awndVar.a("externalSearchGetVersion", awncVar, awnbVar, new awmz(avheVar) { // from class: avnw
            private final avhe a;

            {
                this.a = avheVar;
            }

            @Override // defpackage.awmz
            public final void a(byte[] bArr) {
                this.a.f(bArr);
            }
        });
    }

    @Override // defpackage.avim
    public final void c(final byte[] bArr, final avhe avheVar) {
        awnd awndVar = this.j;
        awnc awncVar = new awnc(this, bArr) { // from class: avnx
            private final avod a;
            private final byte[] b;

            {
                this.a = this;
                this.b = bArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:286:0x066b, code lost:
                if (r5 == 0) goto L283;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
                if (r9.d <= r4.d) goto L247;
             */
            /* JADX WARN: Removed duplicated region for block: B:218:0x0512 A[Catch: avln -> 0x0074, all -> 0x0619, Exception -> 0x061c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {avln -> 0x0074, blocks: (B:13:0x005b, B:16:0x0062, B:17:0x006a, B:30:0x0092, B:32:0x0096, B:37:0x00a8, B:44:0x00c8, B:46:0x00cc, B:49:0x00e4, B:56:0x0101, B:58:0x0110, B:59:0x0116, B:62:0x0139, B:65:0x0176, B:68:0x018c, B:71:0x01ab, B:76:0x0225, B:82:0x0265, B:85:0x026d, B:88:0x0285, B:91:0x028d, B:94:0x02a3, B:97:0x02ab, B:100:0x02c9, B:104:0x02e5, B:108:0x0307, B:110:0x0311, B:111:0x0317, B:113:0x0326, B:114:0x032c, B:118:0x0338, B:122:0x035f, B:124:0x0363, B:125:0x0365, B:126:0x0373, B:128:0x0379, B:130:0x0385, B:131:0x038b, B:133:0x039a, B:134:0x03a0, B:136:0x03ab, B:138:0x03b1, B:139:0x03b7, B:141:0x03c6, B:142:0x03cc, B:144:0x03d3, B:146:0x03e0, B:147:0x03e2, B:149:0x03e8, B:150:0x03ee, B:152:0x0400, B:153:0x0402, B:155:0x0408, B:156:0x040e, B:158:0x0428, B:159:0x042e, B:161:0x0442, B:162:0x0444, B:164:0x0448, B:165:0x044e, B:167:0x0461, B:168:0x0463, B:170:0x0467, B:171:0x0469, B:173:0x046f, B:174:0x0475, B:176:0x048e, B:177:0x0494, B:182:0x04ae, B:185:0x04b4, B:188:0x04c2, B:191:0x04cc, B:202:0x04e1, B:204:0x04e9, B:205:0x04eb, B:207:0x04f3, B:208:0x04f5, B:218:0x0512, B:18:0x006b, B:19:0x0073), top: B:293:0x0052 }] */
            /* JADX WARN: Removed duplicated region for block: B:223:0x052c A[Catch: avln -> 0x0617, all -> 0x0619, Exception -> 0x061c, TryCatch #1 {Exception -> 0x061c, blocks: (B:3:0x0007, B:5:0x0020, B:13:0x005b, B:16:0x0062, B:17:0x006a, B:27:0x008b, B:30:0x0092, B:32:0x0096, B:35:0x009a, B:37:0x00a8, B:44:0x00c8, B:46:0x00cc, B:49:0x00e4, B:54:0x00ef, B:56:0x0101, B:58:0x0110, B:59:0x0116, B:60:0x012b, B:62:0x0139, B:63:0x013f, B:65:0x0176, B:66:0x017c, B:68:0x018c, B:69:0x0192, B:71:0x01ab, B:72:0x01b1, B:74:0x01e4, B:76:0x0225, B:77:0x022b, B:78:0x0245, B:80:0x024b, B:82:0x0265, B:83:0x0267, B:85:0x026d, B:86:0x0273, B:88:0x0285, B:89:0x0287, B:91:0x028d, B:92:0x0293, B:94:0x02a3, B:95:0x02a5, B:97:0x02ab, B:98:0x02b1, B:100:0x02c9, B:101:0x02cf, B:104:0x02e5, B:105:0x02f0, B:106:0x0301, B:108:0x0307, B:110:0x0311, B:111:0x0317, B:113:0x0326, B:114:0x032c, B:116:0x0332, B:118:0x0338, B:119:0x033e, B:122:0x035f, B:124:0x0363, B:125:0x0365, B:126:0x0373, B:128:0x0379, B:130:0x0385, B:131:0x038b, B:133:0x039a, B:134:0x03a0, B:136:0x03ab, B:138:0x03b1, B:139:0x03b7, B:141:0x03c6, B:142:0x03cc, B:144:0x03d3, B:146:0x03e0, B:147:0x03e2, B:149:0x03e8, B:150:0x03ee, B:152:0x0400, B:153:0x0402, B:155:0x0408, B:156:0x040e, B:158:0x0428, B:159:0x042e, B:161:0x0442, B:162:0x0444, B:164:0x0448, B:165:0x044e, B:167:0x0461, B:168:0x0463, B:170:0x0467, B:171:0x0469, B:173:0x046f, B:174:0x0475, B:176:0x048e, B:177:0x0494, B:178:0x04a3, B:180:0x04aa, B:182:0x04ae, B:183:0x04b0, B:185:0x04b4, B:186:0x04b6, B:188:0x04c2, B:189:0x04c4, B:191:0x04cc, B:192:0x04ce, B:202:0x04e1, B:204:0x04e9, B:205:0x04eb, B:207:0x04f3, B:208:0x04f5, B:216:0x050e, B:218:0x0512, B:219:0x0518, B:221:0x0524, B:223:0x052c, B:224:0x0537, B:226:0x0541, B:227:0x0547, B:229:0x0559, B:231:0x055d, B:232:0x055f, B:234:0x0565, B:235:0x056b, B:237:0x0581, B:238:0x0587, B:240:0x0596, B:241:0x059c, B:242:0x05a4, B:246:0x05cc, B:247:0x05d4, B:248:0x05d5, B:249:0x05df, B:39:0x00af, B:18:0x006b, B:19:0x0073, B:23:0x007b, B:25:0x0081, B:250:0x05e0, B:251:0x05ea, B:252:0x05eb, B:253:0x05f5, B:254:0x05f6, B:255:0x0600, B:256:0x0601, B:257:0x060b, B:258:0x060c, B:259:0x0616), top: B:294:0x0007, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:226:0x0541 A[Catch: avln -> 0x0617, all -> 0x0619, Exception -> 0x061c, TryCatch #1 {Exception -> 0x061c, blocks: (B:3:0x0007, B:5:0x0020, B:13:0x005b, B:16:0x0062, B:17:0x006a, B:27:0x008b, B:30:0x0092, B:32:0x0096, B:35:0x009a, B:37:0x00a8, B:44:0x00c8, B:46:0x00cc, B:49:0x00e4, B:54:0x00ef, B:56:0x0101, B:58:0x0110, B:59:0x0116, B:60:0x012b, B:62:0x0139, B:63:0x013f, B:65:0x0176, B:66:0x017c, B:68:0x018c, B:69:0x0192, B:71:0x01ab, B:72:0x01b1, B:74:0x01e4, B:76:0x0225, B:77:0x022b, B:78:0x0245, B:80:0x024b, B:82:0x0265, B:83:0x0267, B:85:0x026d, B:86:0x0273, B:88:0x0285, B:89:0x0287, B:91:0x028d, B:92:0x0293, B:94:0x02a3, B:95:0x02a5, B:97:0x02ab, B:98:0x02b1, B:100:0x02c9, B:101:0x02cf, B:104:0x02e5, B:105:0x02f0, B:106:0x0301, B:108:0x0307, B:110:0x0311, B:111:0x0317, B:113:0x0326, B:114:0x032c, B:116:0x0332, B:118:0x0338, B:119:0x033e, B:122:0x035f, B:124:0x0363, B:125:0x0365, B:126:0x0373, B:128:0x0379, B:130:0x0385, B:131:0x038b, B:133:0x039a, B:134:0x03a0, B:136:0x03ab, B:138:0x03b1, B:139:0x03b7, B:141:0x03c6, B:142:0x03cc, B:144:0x03d3, B:146:0x03e0, B:147:0x03e2, B:149:0x03e8, B:150:0x03ee, B:152:0x0400, B:153:0x0402, B:155:0x0408, B:156:0x040e, B:158:0x0428, B:159:0x042e, B:161:0x0442, B:162:0x0444, B:164:0x0448, B:165:0x044e, B:167:0x0461, B:168:0x0463, B:170:0x0467, B:171:0x0469, B:173:0x046f, B:174:0x0475, B:176:0x048e, B:177:0x0494, B:178:0x04a3, B:180:0x04aa, B:182:0x04ae, B:183:0x04b0, B:185:0x04b4, B:186:0x04b6, B:188:0x04c2, B:189:0x04c4, B:191:0x04cc, B:192:0x04ce, B:202:0x04e1, B:204:0x04e9, B:205:0x04eb, B:207:0x04f3, B:208:0x04f5, B:216:0x050e, B:218:0x0512, B:219:0x0518, B:221:0x0524, B:223:0x052c, B:224:0x0537, B:226:0x0541, B:227:0x0547, B:229:0x0559, B:231:0x055d, B:232:0x055f, B:234:0x0565, B:235:0x056b, B:237:0x0581, B:238:0x0587, B:240:0x0596, B:241:0x059c, B:242:0x05a4, B:246:0x05cc, B:247:0x05d4, B:248:0x05d5, B:249:0x05df, B:39:0x00af, B:18:0x006b, B:19:0x0073, B:23:0x007b, B:25:0x0081, B:250:0x05e0, B:251:0x05ea, B:252:0x05eb, B:253:0x05f5, B:254:0x05f6, B:255:0x0600, B:256:0x0601, B:257:0x060b, B:258:0x060c, B:259:0x0616), top: B:294:0x0007, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:248:0x05d5 A[Catch: avln -> 0x0617, all -> 0x0619, Exception -> 0x061c, TryCatch #1 {Exception -> 0x061c, blocks: (B:3:0x0007, B:5:0x0020, B:13:0x005b, B:16:0x0062, B:17:0x006a, B:27:0x008b, B:30:0x0092, B:32:0x0096, B:35:0x009a, B:37:0x00a8, B:44:0x00c8, B:46:0x00cc, B:49:0x00e4, B:54:0x00ef, B:56:0x0101, B:58:0x0110, B:59:0x0116, B:60:0x012b, B:62:0x0139, B:63:0x013f, B:65:0x0176, B:66:0x017c, B:68:0x018c, B:69:0x0192, B:71:0x01ab, B:72:0x01b1, B:74:0x01e4, B:76:0x0225, B:77:0x022b, B:78:0x0245, B:80:0x024b, B:82:0x0265, B:83:0x0267, B:85:0x026d, B:86:0x0273, B:88:0x0285, B:89:0x0287, B:91:0x028d, B:92:0x0293, B:94:0x02a3, B:95:0x02a5, B:97:0x02ab, B:98:0x02b1, B:100:0x02c9, B:101:0x02cf, B:104:0x02e5, B:105:0x02f0, B:106:0x0301, B:108:0x0307, B:110:0x0311, B:111:0x0317, B:113:0x0326, B:114:0x032c, B:116:0x0332, B:118:0x0338, B:119:0x033e, B:122:0x035f, B:124:0x0363, B:125:0x0365, B:126:0x0373, B:128:0x0379, B:130:0x0385, B:131:0x038b, B:133:0x039a, B:134:0x03a0, B:136:0x03ab, B:138:0x03b1, B:139:0x03b7, B:141:0x03c6, B:142:0x03cc, B:144:0x03d3, B:146:0x03e0, B:147:0x03e2, B:149:0x03e8, B:150:0x03ee, B:152:0x0400, B:153:0x0402, B:155:0x0408, B:156:0x040e, B:158:0x0428, B:159:0x042e, B:161:0x0442, B:162:0x0444, B:164:0x0448, B:165:0x044e, B:167:0x0461, B:168:0x0463, B:170:0x0467, B:171:0x0469, B:173:0x046f, B:174:0x0475, B:176:0x048e, B:177:0x0494, B:178:0x04a3, B:180:0x04aa, B:182:0x04ae, B:183:0x04b0, B:185:0x04b4, B:186:0x04b6, B:188:0x04c2, B:189:0x04c4, B:191:0x04cc, B:192:0x04ce, B:202:0x04e1, B:204:0x04e9, B:205:0x04eb, B:207:0x04f3, B:208:0x04f5, B:216:0x050e, B:218:0x0512, B:219:0x0518, B:221:0x0524, B:223:0x052c, B:224:0x0537, B:226:0x0541, B:227:0x0547, B:229:0x0559, B:231:0x055d, B:232:0x055f, B:234:0x0565, B:235:0x056b, B:237:0x0581, B:238:0x0587, B:240:0x0596, B:241:0x059c, B:242:0x05a4, B:246:0x05cc, B:247:0x05d4, B:248:0x05d5, B:249:0x05df, B:39:0x00af, B:18:0x006b, B:19:0x0073, B:23:0x007b, B:25:0x0081, B:250:0x05e0, B:251:0x05ea, B:252:0x05eb, B:253:0x05f5, B:254:0x05f6, B:255:0x0600, B:256:0x0601, B:257:0x060b, B:258:0x060c, B:259:0x0616), top: B:294:0x0007, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:273:0x0632 A[Catch: all -> 0x0619, TryCatch #2 {all -> 0x0619, blocks: (B:3:0x0007, B:5:0x0020, B:13:0x005b, B:16:0x0062, B:17:0x006a, B:271:0x0628, B:273:0x0632, B:275:0x0636, B:276:0x0638, B:278:0x0647, B:280:0x064b, B:281:0x064d, B:283:0x065c, B:285:0x0663, B:288:0x066e, B:289:0x0673, B:284:0x065f, B:27:0x008b, B:30:0x0092, B:32:0x0096, B:35:0x009a, B:37:0x00a8, B:44:0x00c8, B:46:0x00cc, B:49:0x00e4, B:54:0x00ef, B:56:0x0101, B:58:0x0110, B:59:0x0116, B:60:0x012b, B:62:0x0139, B:63:0x013f, B:65:0x0176, B:66:0x017c, B:68:0x018c, B:69:0x0192, B:71:0x01ab, B:72:0x01b1, B:74:0x01e4, B:76:0x0225, B:77:0x022b, B:78:0x0245, B:80:0x024b, B:82:0x0265, B:83:0x0267, B:85:0x026d, B:86:0x0273, B:88:0x0285, B:89:0x0287, B:91:0x028d, B:92:0x0293, B:94:0x02a3, B:95:0x02a5, B:97:0x02ab, B:98:0x02b1, B:100:0x02c9, B:101:0x02cf, B:104:0x02e5, B:105:0x02f0, B:106:0x0301, B:108:0x0307, B:110:0x0311, B:111:0x0317, B:113:0x0326, B:114:0x032c, B:116:0x0332, B:118:0x0338, B:119:0x033e, B:122:0x035f, B:124:0x0363, B:125:0x0365, B:126:0x0373, B:128:0x0379, B:130:0x0385, B:131:0x038b, B:133:0x039a, B:134:0x03a0, B:136:0x03ab, B:138:0x03b1, B:139:0x03b7, B:141:0x03c6, B:142:0x03cc, B:144:0x03d3, B:146:0x03e0, B:147:0x03e2, B:149:0x03e8, B:150:0x03ee, B:152:0x0400, B:153:0x0402, B:155:0x0408, B:156:0x040e, B:158:0x0428, B:159:0x042e, B:161:0x0442, B:162:0x0444, B:164:0x0448, B:165:0x044e, B:167:0x0461, B:168:0x0463, B:170:0x0467, B:171:0x0469, B:173:0x046f, B:174:0x0475, B:176:0x048e, B:177:0x0494, B:178:0x04a3, B:180:0x04aa, B:182:0x04ae, B:183:0x04b0, B:185:0x04b4, B:186:0x04b6, B:188:0x04c2, B:189:0x04c4, B:191:0x04cc, B:192:0x04ce, B:202:0x04e1, B:204:0x04e9, B:205:0x04eb, B:207:0x04f3, B:208:0x04f5, B:216:0x050e, B:218:0x0512, B:219:0x0518, B:221:0x0524, B:223:0x052c, B:224:0x0537, B:226:0x0541, B:227:0x0547, B:229:0x0559, B:231:0x055d, B:232:0x055f, B:234:0x0565, B:235:0x056b, B:237:0x0581, B:238:0x0587, B:240:0x0596, B:241:0x059c, B:242:0x05a4, B:246:0x05cc, B:247:0x05d4, B:248:0x05d5, B:249:0x05df, B:39:0x00af, B:18:0x006b, B:19:0x0073, B:23:0x007b, B:25:0x0081, B:250:0x05e0, B:251:0x05ea, B:252:0x05eb, B:253:0x05f5, B:254:0x05f6, B:255:0x0600, B:256:0x0601, B:257:0x060b, B:258:0x060c, B:259:0x0616, B:266:0x061e, B:267:0x0624), top: B:295:0x0007, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: all -> 0x0619, Exception -> 0x061c, avln -> 0x0625, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x061c, blocks: (B:3:0x0007, B:5:0x0020, B:13:0x005b, B:16:0x0062, B:17:0x006a, B:27:0x008b, B:30:0x0092, B:32:0x0096, B:35:0x009a, B:37:0x00a8, B:44:0x00c8, B:46:0x00cc, B:49:0x00e4, B:54:0x00ef, B:56:0x0101, B:58:0x0110, B:59:0x0116, B:60:0x012b, B:62:0x0139, B:63:0x013f, B:65:0x0176, B:66:0x017c, B:68:0x018c, B:69:0x0192, B:71:0x01ab, B:72:0x01b1, B:74:0x01e4, B:76:0x0225, B:77:0x022b, B:78:0x0245, B:80:0x024b, B:82:0x0265, B:83:0x0267, B:85:0x026d, B:86:0x0273, B:88:0x0285, B:89:0x0287, B:91:0x028d, B:92:0x0293, B:94:0x02a3, B:95:0x02a5, B:97:0x02ab, B:98:0x02b1, B:100:0x02c9, B:101:0x02cf, B:104:0x02e5, B:105:0x02f0, B:106:0x0301, B:108:0x0307, B:110:0x0311, B:111:0x0317, B:113:0x0326, B:114:0x032c, B:116:0x0332, B:118:0x0338, B:119:0x033e, B:122:0x035f, B:124:0x0363, B:125:0x0365, B:126:0x0373, B:128:0x0379, B:130:0x0385, B:131:0x038b, B:133:0x039a, B:134:0x03a0, B:136:0x03ab, B:138:0x03b1, B:139:0x03b7, B:141:0x03c6, B:142:0x03cc, B:144:0x03d3, B:146:0x03e0, B:147:0x03e2, B:149:0x03e8, B:150:0x03ee, B:152:0x0400, B:153:0x0402, B:155:0x0408, B:156:0x040e, B:158:0x0428, B:159:0x042e, B:161:0x0442, B:162:0x0444, B:164:0x0448, B:165:0x044e, B:167:0x0461, B:168:0x0463, B:170:0x0467, B:171:0x0469, B:173:0x046f, B:174:0x0475, B:176:0x048e, B:177:0x0494, B:178:0x04a3, B:180:0x04aa, B:182:0x04ae, B:183:0x04b0, B:185:0x04b4, B:186:0x04b6, B:188:0x04c2, B:189:0x04c4, B:191:0x04cc, B:192:0x04ce, B:202:0x04e1, B:204:0x04e9, B:205:0x04eb, B:207:0x04f3, B:208:0x04f5, B:216:0x050e, B:218:0x0512, B:219:0x0518, B:221:0x0524, B:223:0x052c, B:224:0x0537, B:226:0x0541, B:227:0x0547, B:229:0x0559, B:231:0x055d, B:232:0x055f, B:234:0x0565, B:235:0x056b, B:237:0x0581, B:238:0x0587, B:240:0x0596, B:241:0x059c, B:242:0x05a4, B:246:0x05cc, B:247:0x05d4, B:248:0x05d5, B:249:0x05df, B:39:0x00af, B:18:0x006b, B:19:0x0073, B:23:0x007b, B:25:0x0081, B:250:0x05e0, B:251:0x05ea, B:252:0x05eb, B:253:0x05f5, B:254:0x05f6, B:255:0x0600, B:256:0x0601, B:257:0x060b, B:258:0x060c, B:259:0x0616), top: B:294:0x0007, outer: #2 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 1666
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.avnx.call():java.lang.Object");
            }
        };
        avheVar.getClass();
        awnb awnbVar = new awnb(avheVar) { // from class: avny
            private final avhe a;

            {
                this.a = avheVar;
            }

            @Override // defpackage.awnb
            public final void a(Object obj) {
                this.a.e((byte[]) obj);
            }
        };
        avheVar.getClass();
        awndVar.a("externalSearch", awncVar, awnbVar, new awmz(avheVar) { // from class: avnz
            private final avhe a;

            {
                this.a = avheVar;
            }

            @Override // defpackage.awmz
            public final void a(byte[] bArr2) {
                this.a.f(bArr2);
            }
        });
    }

    @Override // defpackage.avim
    public final void d(byte[] bArr, final avhe avheVar) {
        awnd awndVar = this.j;
        awnc awncVar = new awnc() { // from class: avoa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                throw new avlo(drtc.UNIMPLEMENTED);
            }
        };
        avheVar.getClass();
        awnb awnbVar = new awnb(avheVar) { // from class: avob
            private final avhe a;

            {
                this.a = avheVar;
            }

            @Override // defpackage.awnb
            public final void a(Object obj) {
                this.a.e((byte[]) obj);
            }
        };
        avheVar.getClass();
        awndVar.a("externalSearchDirections", awncVar, awnbVar, new awmz(avheVar) { // from class: avoc
            private final avhe a;

            {
                this.a = avheVar;
            }

            @Override // defpackage.awmz
            public final void a(byte[] bArr2) {
                this.a.f(bArr2);
            }
        });
    }

    @Override // defpackage.clb, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        PackageManager packageManager = this.k.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (btsj.a(this.k, str)) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
            }
        }
        String valueOf = String.valueOf(packageManager.getNameForUid(Binder.getCallingUid()));
        throw new SecurityException(valueOf.length() != 0 ? "Unknown caller: ".concat(valueOf) : new String("Unknown caller: "));
    }
}
