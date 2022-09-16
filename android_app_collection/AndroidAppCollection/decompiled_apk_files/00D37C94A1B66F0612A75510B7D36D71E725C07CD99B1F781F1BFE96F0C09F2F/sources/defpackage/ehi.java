package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import com.google.cardboard.sdk.R;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: ehi  reason: default package */
/* loaded from: classes3.dex */
public final class ehi {
    public static anmk a;
    private static dvj b;

    public static aurt a(int i, int i2, String str) {
        aopa createBuilder = aurt.a.createBuilder();
        int max = Math.max(1, i2);
        int i3 = 0;
        while (i3 < 1440) {
            aopa createBuilder2 = aurn.a.createBuilder();
            aqkm o = o(i3);
            createBuilder2.copyOnWrite();
            aurn aurnVar = (aurn) createBuilder2.instance;
            o.getClass();
            aurnVar.c = o;
            aurnVar.b |= 2;
            boolean z = i3 == (i / max) * max;
            createBuilder2.copyOnWrite();
            aurn aurnVar2 = (aurn) createBuilder2.instance;
            aurnVar2.b |= 4;
            aurnVar2.d = z;
            aopa createBuilder3 = aurp.a.createBuilder();
            aurn aurnVar3 = (aurn) createBuilder2.mo39build();
            createBuilder3.copyOnWrite();
            aurp aurpVar = (aurp) createBuilder3.instance;
            aurnVar3.getClass();
            aurpVar.c = aurnVar3;
            aurpVar.b = 190692730;
            createBuilder.copyOnWrite();
            aurt aurtVar = (aurt) createBuilder.instance;
            aurp aurpVar2 = (aurp) createBuilder3.mo39build();
            aurpVar2.getClass();
            aurtVar.a();
            aurtVar.f.add(aurpVar2);
            i3 += max;
        }
        aopa mo43clone = createBuilder.mo43clone();
        arag h = ajgl.h(str);
        mo43clone.copyOnWrite();
        aurt aurtVar2 = (aurt) mo43clone.instance;
        h.getClass();
        aurtVar2.d = h;
        aurtVar2.b |= 2;
        return (aurt) mo43clone.mo39build();
    }

    public static String b(Context context, int i) {
        aqkm o = o(i);
        return DateFormat.getTimeFormat(context).format(new Date(0, 0, 0, o.c, o.d));
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 28:
            case 31:
            case 34:
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
            case 46:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
            case 61:
            case 62:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 73:
            case 75:
            case 80:
            case 81:
            case 83:
            case 86:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 101:
            case 109:
            case 112:
            case 114:
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 137:
            case 138:
            case 139:
            case 140:
            case 144:
            case 147:
            case 149:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 181:
            case 190:
            case 191:
            case 192:
            case 193:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 201:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 222:
            case 224:
            case 225:
            case 226:
            case 229:
            case 230:
            case 234:
            case 235:
            case 236:
            case 237:
            case 252:
            case 257:
            case 258:
            case 272:
            case 274:
            case 275:
            default:
                return 0;
            case 7:
                return 7;
            case 14:
                return 14;
            case 16:
                return 16;
            case 18:
                return 18;
            case 24:
                return 24;
            case 26:
                return 26;
            case 29:
                return 29;
            case 30:
                return 30;
            case 32:
                return 32;
            case 33:
                return 33;
            case 35:
                return 35;
            case 38:
                return 38;
            case 39:
                return 39;
            case 42:
                return 42;
            case 43:
                return 43;
            case 44:
                return 44;
            case 47:
                return 47;
            case 48:
                return 48;
            case 49:
                return 49;
            case 51:
                return 51;
            case 57:
                return 57;
            case 58:
                return 58;
            case 60:
                return 60;
            case 63:
                return 63;
            case 64:
                return 64;
            case 67:
                return 67;
            case 68:
                return 68;
            case 72:
                return 72;
            case 74:
                return 74;
            case 76:
                return 76;
            case 77:
                return 77;
            case 78:
                return 78;
            case 79:
                return 79;
            case 82:
                return 82;
            case 84:
                return 84;
            case 85:
                return 85;
            case 88:
                return 88;
            case 94:
                return 94;
            case 95:
                return 95;
            case 96:
                return 96;
            case 97:
                return 97;
            case 98:
                return 98;
            case 99:
                return 99;
            case 100:
                return 100;
            case 102:
                return 102;
            case 103:
                return 103;
            case 104:
                return 104;
            case 105:
                return 105;
            case 106:
                return 106;
            case 107:
                return 107;
            case 108:
                return 108;
            case 110:
                return 110;
            case 111:
                return 111;
            case 113:
                return 113;
            case 115:
                return 115;
            case 116:
                return 116;
            case 117:
                return 117;
            case 118:
                return 118;
            case 119:
                return 119;
            case 120:
                return 120;
            case 121:
                return 121;
            case 122:
                return 122;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case 132:
                return 132;
            case 133:
                return 133;
            case 134:
                return 134;
            case 135:
                return 135;
            case 136:
                return 136;
            case 141:
                return 141;
            case 142:
                return 142;
            case 143:
                return 143;
            case 145:
                return 145;
            case 146:
                return 146;
            case 148:
                return 148;
            case 150:
                return 150;
            case 151:
                return 151;
            case 152:
                return 152;
            case 153:
                return 153;
            case 154:
                return 154;
            case 180:
                return 180;
            case 182:
                return 182;
            case 183:
                return 183;
            case 184:
                return 184;
            case 185:
                return 185;
            case 186:
                return 186;
            case 187:
                return 187;
            case 188:
                return 188;
            case 189:
                return 189;
            case 194:
                return 194;
            case 200:
                return 200;
            case 202:
                return 202;
            case 203:
                return 203;
            case 204:
                return 204;
            case 205:
                return 205;
            case 206:
                return 206;
            case 218:
                return 218;
            case 219:
                return 219;
            case 220:
                return 220;
            case 221:
                return 221;
            case 223:
                return 223;
            case 227:
                return 227;
            case 228:
                return 228;
            case 231:
                return 231;
            case 232:
                return 232;
            case 233:
                return 233;
            case 238:
                return 238;
            case 239:
                return 239;
            case 240:
                return 240;
            case 241:
                return 241;
            case 242:
                return 242;
            case 243:
                return 243;
            case 244:
                return 244;
            case 245:
                return 245;
            case 246:
                return 246;
            case 247:
                return 247;
            case 248:
                return 248;
            case 249:
                return 249;
            case 250:
                return 250;
            case 251:
                return 251;
            case 253:
                return 253;
            case 254:
                return 254;
            case PrivateKeyType.INVALID /* 255 */:
                return PrivateKeyType.INVALID;
            case 256:
                return 256;
            case 259:
                return 259;
            case 260:
                return 260;
            case 261:
                return 261;
            case 262:
                return 262;
            case 263:
                return 263;
            case 264:
                return 264;
            case 265:
                return 265;
            case 266:
                return 266;
            case 267:
                return 267;
            case 268:
                return 268;
            case 269:
                return 269;
            case 270:
                return 270;
            case 271:
                return 271;
            case 273:
                return 273;
            case 276:
                return 276;
            case 277:
                return 277;
            case 278:
                return 278;
            case 279:
                return 279;
            case 280:
                return 280;
            case 281:
                return 281;
            case 282:
                return 282;
            case 283:
                return 283;
            case 284:
                return 284;
            case 285:
                return 285;
            case 286:
                return 286;
            case 287:
                return 287;
            case 288:
                return 288;
            case 289:
                return 289;
            case 290:
                return 290;
            case 291:
                return 291;
            case 292:
                return 292;
            case 293:
                return 293;
            case 294:
                return 294;
            case 295:
                return 295;
            case 296:
                return 296;
            case 297:
                return 297;
            case 298:
                return 298;
            case 299:
                return 299;
            case 300:
                return 300;
            case 301:
                return 301;
            case 302:
                return 302;
            case 303:
                return 303;
            case 304:
                return 304;
            case 305:
                return 305;
            case 306:
                return 306;
            case 307:
                return 307;
            case 308:
                return 308;
            case 309:
                return 309;
            case 310:
                return 310;
            case 311:
                return 311;
            case 312:
                return 312;
            case 313:
                return 313;
            case 314:
                return 314;
            case 315:
                return 315;
            case 316:
                return 316;
            case 317:
                return 317;
            case 318:
                return 318;
            case 319:
                return 319;
            case 320:
                return 320;
            case 321:
                return 321;
            case 322:
                return 322;
            case 323:
                return 323;
            case 324:
                return 324;
        }
    }

    public static String d(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?");
        for (String str2 : map.keySet()) {
            sb.append(str2);
            sb.append("=");
            sb.append((String) map.get(str2));
            sb.append("&");
        }
        if (sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    public static void f(String str) {
        if (Log.isLoggable("SenderHttpURLConnection", 6)) {
            Log.e("SenderHttpURLConnection", str);
        }
    }

    public static synchronized void g(dvh dvhVar) {
        synchronized (ehi.class) {
            String str = dvhVar.b;
            String str2 = dvhVar.a;
            if (dvhVar.e == null) {
                dvhVar.e = new dvm(dvhVar.f, dvhVar.g);
            }
            dvj dvjVar = new dvj(str, str2, "3", dvhVar.e);
            b = dvjVar;
            if (dvhVar.c <= 0) {
                Log.w("ReporterDefault", "too small batch size :0, changed to 1");
            }
            int i = dvjVar.e;
            dvjVar.f = 1;
            for (Map.Entry entry : dvhVar.d.entrySet()) {
                b.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static synchronized dvj h() {
        dvj dvjVar;
        synchronized (ehi.class) {
            if (b == null) {
                g(new dvh());
            }
            dvjVar = b;
        }
        return dvjVar;
    }

    public static void i(dtq dtqVar) {
        Method c;
        if (a != null) {
            return;
        }
        String str = (String) qdb.s.e();
        if (str == null || str.length() == 0) {
            str = null;
            if (dtqVar != null && (c = dtqVar.c("30h4Fz18uZZbVGzKBLBoKkVF8B42NApMKEHsuvQbqPAyjVAya3fWZA3qi0MZaQmC", "YkD0zXJWncN/k4r6XwqSke5f5DfZ0idBivNJmGcmL5A=")) != null) {
                str = (String) c.invoke(null, new Object[0]);
            }
            if (str == null) {
                return;
            }
        }
        try {
            try {
                anrf anrfVar = (anrf) aopi.parseFrom(anrf.a, k(str, true), aoos.a());
                for (anre anreVar : anrfVar.c) {
                    anrb anrbVar = anreVar.b;
                    if (anrbVar == null) {
                        anrbVar = anrb.a;
                    }
                    int j = answ.j(anrbVar.d);
                    if (j != 0 && j == 2) {
                        throw new GeneralSecurityException("keyset contains secret key material");
                    }
                    anrb anrbVar2 = anreVar.b;
                    if (anrbVar2 == null) {
                        anrbVar2 = anrb.a;
                    }
                    int j2 = answ.j(anrbVar2.d);
                    if (j2 != 0 && j2 == 3) {
                        throw new GeneralSecurityException("keyset contains secret key material");
                    }
                    anrb anrbVar3 = anreVar.b;
                    if (anrbVar3 == null) {
                        anrbVar3 = anrb.a;
                    }
                    int j3 = answ.j(anrbVar3.d);
                    if (j3 != 0 && j3 == 4) {
                        throw new GeneralSecurityException("keyset contains secret key material");
                    }
                }
                anms a2 = anms.a(anrfVar);
                for (anrd anrdVar : anpc.a.b) {
                    if (!anrdVar.c.isEmpty()) {
                        if (!anrdVar.b.isEmpty()) {
                            if (!anrdVar.f.isEmpty()) {
                                if (!anrdVar.f.equals("TinkAead") && !anrdVar.f.equals("TinkMac") && !anrdVar.f.equals("TinkHybridDecrypt") && !anrdVar.f.equals("TinkHybridEncrypt") && !anrdVar.f.equals("TinkPublicKeySign") && !anrdVar.f.equals("TinkPublicKeyVerify") && !anrdVar.f.equals("TinkStreamingAead") && !anrdVar.f.equals("TinkDeterministicAead")) {
                                    anmg a3 = annh.a(anrdVar.f);
                                    annh.g(a3.a());
                                    String str2 = anrdVar.c;
                                    String str3 = anrdVar.b;
                                    int i = anrdVar.d;
                                    annh.l(a3.b(), anrdVar.e);
                                }
                            } else {
                                throw new GeneralSecurityException("Missing catalogue_name.");
                            }
                        } else {
                            throw new GeneralSecurityException("Missing primitive_name.");
                        }
                    } else {
                        throw new GeneralSecurityException("Missing type_url.");
                    }
                }
                annh.g(new ansi(1));
                a = (anmk) a2.b(anmk.class);
            } catch (aopx unused) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IllegalArgumentException | GeneralSecurityException unused2) {
        }
    }

    public static String j(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] k(String str, boolean z) {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unable to decode ".concat(valueOf) : new String("Unable to decode "));
    }

    public static dqo l(dqo dqoVar, dpu dpuVar, dqs dqsVar, Boolean bool, Boolean bool2) {
        dqo dqoVar2 = new dqo();
        Iterator k = dqoVar.k();
        while (k.hasNext()) {
            int intValue = ((Integer) k.next()).intValue();
            if (dqoVar.s(intValue)) {
                dqz a2 = dqsVar.a(dpuVar, Arrays.asList(dqoVar.e(intValue), new dqr(Double.valueOf(intValue)), dqoVar));
                if (a2.g().equals(bool)) {
                    return dqoVar2;
                }
                if (bool2 == null || a2.g().equals(bool2)) {
                    dqoVar2.q(intValue, a2);
                }
            }
        }
        return dqoVar2;
    }

    public static dqo m(dqo dqoVar, dpu dpuVar, dqs dqsVar) {
        return l(dqoVar, dpuVar, dqsVar, null, null);
    }

    public static dqz n(dqo dqoVar, dpu dpuVar, List list, boolean z) {
        dqz dqzVar;
        dqt.n("reduce", 1, list);
        dqt.o("reduce", 2, list);
        dqz b2 = dpuVar.b((dqz) list.get(0));
        if (!(b2 instanceof dqs)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            dqzVar = dpuVar.b((dqz) list.get(1));
            if (dqzVar instanceof dqq) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else if (dqoVar.c() == 0) {
            throw new IllegalStateException("Empty array with no initial value error");
        } else {
            dqzVar = null;
        }
        dqs dqsVar = (dqs) b2;
        int c = dqoVar.c();
        int i = z ? 0 : c - 1;
        int i2 = -1;
        int i3 = z ? c - 1 : 0;
        if (true == z) {
            i2 = 1;
        }
        if (dqzVar == null) {
            dqzVar = dqoVar.e(i);
            i += i2;
        }
        while ((i3 - i) * i2 >= 0) {
            if (dqoVar.s(i)) {
                dqzVar = dqsVar.a(dpuVar, Arrays.asList(dqzVar, dqoVar.e(i), new dqr(Double.valueOf(i)), dqoVar));
                if (dqzVar instanceof dqq) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i2;
            } else {
                i += i2;
            }
        }
        return dqzVar;
    }

    private static aqkm o(int i) {
        aopa createBuilder = aqkm.a.createBuilder();
        createBuilder.copyOnWrite();
        aqkm aqkmVar = (aqkm) createBuilder.instance;
        aqkmVar.b |= 2;
        aqkmVar.d = i;
        return (aqkm) createBuilder.mo39build();
    }
}
