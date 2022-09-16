package defpackage;

import android.text.Layout;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: PG */
/* renamed from: pub  reason: default package */
/* loaded from: classes4.dex */
public final class pub extends psi {
    private final XmlPullParserFactory i;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern b = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final ptz h = new ptz(30.0f, 1, 1);
    private static final ajno j = new ajno(15);

    public pub() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.i = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
        if (r12.equals("s") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long s(java.lang.String r12, defpackage.ptz r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.s(java.lang.String, ptz):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment t(String str) {
        char c2;
        String g2 = akzj.g(str);
        switch (g2.hashCode()) {
            case -1364013995:
                if (g2.equals("center")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (g2.equals("end")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (g2.equals("left")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (g2.equals("right")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (g2.equals("start")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c2 == 2 || c2 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c2 == 4) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return null;
    }

    private static pue u(pue pueVar) {
        return pueVar == null ? new pue() : pueVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static pue v(XmlPullParser xmlPullParser, pue pueVar) {
        char c2;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            char c3 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        pueVar = u(pueVar);
                        pueVar.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    pueVar = u(pueVar);
                    try {
                        pueVar.b(pvs.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        String valueOf = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf.length() != 0 ? "Failed parsing background value: ".concat(valueOf) : new String("Failed parsing background value: "));
                        break;
                    }
                case 2:
                    pueVar = u(pueVar);
                    try {
                        pueVar.c(pvs.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        String valueOf2 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf2.length() != 0 ? "Failed parsing color value: ".concat(valueOf2) : new String("Failed parsing color value: "));
                        break;
                    }
                case 3:
                    pueVar = u(pueVar);
                    pueVar.a = attributeValue;
                    break;
                case 4:
                    try {
                        pueVar = u(pueVar);
                        String[] Z = pxi.Z(attributeValue, "\\s+");
                        int length = Z.length;
                        if (length == 1) {
                            matcher = e.matcher(attributeValue);
                        } else if (length == 2) {
                            matcher = e.matcher(Z[1]);
                            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        } else {
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("Invalid number of entries for fontSize: ");
                            sb.append(length);
                            sb.append(".");
                            throw new psm(sb.toString());
                        }
                        if (matcher.matches()) {
                            String group = matcher.group(3);
                            ptx.a(group);
                            int hashCode = group.hashCode();
                            if (hashCode != 37) {
                                if (hashCode != 3240) {
                                    if (hashCode == 3592 && group.equals("px")) {
                                        c3 = 0;
                                    }
                                } else if (group.equals("em")) {
                                    c3 = 1;
                                }
                            } else if (group.equals("%")) {
                                c3 = 2;
                            }
                            if (c3 == 0) {
                                pueVar.j = 1;
                            } else if (c3 == 1) {
                                pueVar.j = 2;
                            } else if (c3 == 2) {
                                pueVar.j = 3;
                            } else {
                                StringBuilder sb2 = new StringBuilder(group.length() + 30);
                                sb2.append("Invalid unit for fontSize: '");
                                sb2.append(group);
                                sb2.append("'.");
                                throw new psm(sb2.toString());
                            }
                            String group2 = matcher.group(1);
                            ptx.a(group2);
                            pueVar.k = Float.parseFloat(group2);
                            break;
                        } else {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                            sb3.append("Invalid expression for fontSize: '");
                            sb3.append(attributeValue);
                            sb3.append("'.");
                            throw new psm(sb3.toString());
                        }
                    } catch (psm unused3) {
                        String valueOf3 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf3.length() != 0 ? "Failed parsing fontSize value: ".concat(valueOf3) : new String("Failed parsing fontSize value: "));
                        break;
                    }
                case 5:
                    pueVar = u(pueVar);
                    pueVar.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 6:
                    pueVar = u(pueVar);
                    pueVar.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    pueVar = u(pueVar);
                    pueVar.o = t(attributeValue);
                    break;
                case '\b':
                    pueVar = u(pueVar);
                    pueVar.p = t(attributeValue);
                    break;
                case '\t':
                    String g2 = akzj.g(attributeValue);
                    int hashCode2 = g2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && g2.equals("none")) {
                            c3 = 0;
                        }
                    } else if (g2.equals("all")) {
                        c3 = 1;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            break;
                        } else {
                            pueVar = u(pueVar);
                            pueVar.q = 1;
                            break;
                        }
                    } else {
                        pueVar = u(pueVar);
                        pueVar.q = 0;
                        break;
                    }
                    break;
                case '\n':
                    String g3 = akzj.g(attributeValue);
                    switch (g3.hashCode()) {
                        case -618561360:
                            if (g3.equals("baseContainer")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (g3.equals("container")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (g3.equals("delimiter")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (g3.equals("textContainer")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (g3.equals("base")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (g3.equals("text")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1 && c3 != 2) {
                            if (c3 != 3 && c3 != 4) {
                                if (c3 != 5) {
                                    break;
                                } else {
                                    pueVar = u(pueVar);
                                    pueVar.m = 4;
                                    break;
                                }
                            } else {
                                pueVar = u(pueVar);
                                pueVar.m = 3;
                                break;
                            }
                        } else {
                            pueVar = u(pueVar);
                            pueVar.m = 2;
                            break;
                        }
                    } else {
                        pueVar = u(pueVar);
                        pueVar.m = 1;
                        break;
                    }
                case 11:
                    String g4 = akzj.g(attributeValue);
                    int hashCode3 = g4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && g4.equals("after")) {
                            c3 = 1;
                        }
                    } else if (g4.equals("before")) {
                        c3 = 0;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            break;
                        } else {
                            pueVar = u(pueVar);
                            pueVar.n = 2;
                            break;
                        }
                    } else {
                        pueVar = u(pueVar);
                        pueVar.n = 1;
                        break;
                    }
                    break;
                case '\f':
                    String g5 = akzj.g(attributeValue);
                    switch (g5.hashCode()) {
                        case -1461280213:
                            if (g5.equals("nounderline")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (g5.equals("underline")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (g5.equals("nolinethrough")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (g5.equals("linethrough")) {
                                c3 = 0;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    break;
                                } else {
                                    pueVar = u(pueVar);
                                    pueVar.g = 0;
                                    break;
                                }
                            } else {
                                pueVar = u(pueVar);
                                pueVar.g = 1;
                                break;
                            }
                        } else {
                            pueVar = u(pueVar);
                            pueVar.f = 0;
                            break;
                        }
                    } else {
                        pueVar = u(pueVar);
                        pueVar.f = 1;
                        break;
                    }
                case '\r':
                    pueVar = u(pueVar);
                    pueVar.r = pty.a(attributeValue);
                    break;
                case 14:
                    pueVar = u(pueVar);
                    Matcher matcher2 = a.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (!matcher2.matches()) {
                        String valueOf4 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf4.length() != 0 ? "Invalid value for shear: ".concat(valueOf4) : new String("Invalid value for shear: "));
                    } else {
                        try {
                            String group3 = matcher2.group(1);
                            ptx.a(group3);
                            f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                        } catch (NumberFormatException e2) {
                            String valueOf5 = String.valueOf(attributeValue);
                            pns.f("TtmlDecoder", valueOf5.length() != 0 ? "Failed to parse shear: ".concat(valueOf5) : new String("Failed to parse shear: "), e2);
                        }
                    }
                    pueVar.s = f2;
                    break;
            }
        }
        return pueVar;
    }

    private static String[] w(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : pxi.Z(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029f A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b4 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, LOOP:1: B:125:0x02b4->B:282:0x05a3, LOOP_START, PHI: r2 r6 r9 
      PHI: (r2v33 ptz) = (r2v10 ptz), (r2v63 ptz) binds: [B:124:0x02b2, B:282:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v38 java.util.HashMap) = (r6v1 java.util.HashMap), (r6v73 java.util.HashMap) binds: [B:124:0x02b2, B:282:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v30 java.lang.String) = (r9v12 java.lang.String), (r9v52 java.lang.String) binds: [B:124:0x02b2, B:282:0x05a3] A[DONT_GENERATE, DONT_INLINE], TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b4 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TRY_LEAVE, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0447 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TRY_LEAVE, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0499 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TRY_LEAVE, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x051f A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0565 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06f0 A[Catch: psm -> 0x06fe, IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TRY_LEAVE, TryCatch #0 {psm -> 0x06fe, blocks: (B:371:0x06eb, B:373:0x06f0), top: B:418:0x06eb }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0226 A[Catch: IOException -> 0x07d8, XmlPullParserException -> 0x07e2, TRY_ENTER, TryCatch #18 {IOException -> 0x07d8, XmlPullParserException -> 0x07e2, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:14:0x0091, B:16:0x0099, B:18:0x00a0, B:20:0x00a8, B:22:0x00b4, B:26:0x00d6, B:28:0x00e4, B:30:0x00eb, B:32:0x00f7, B:34:0x0102, B:67:0x01a9, B:87:0x0214, B:90:0x0226, B:92:0x022c, B:94:0x0234, B:96:0x023c, B:98:0x0244, B:100:0x024c, B:102:0x0254, B:104:0x025a, B:106:0x0262, B:108:0x026a, B:110:0x0270, B:112:0x0276, B:114:0x027e, B:116:0x0286, B:119:0x028f, B:121:0x029f, B:402:0x07b5, B:123:0x02ae, B:125:0x02b4, B:127:0x02bd, B:129:0x02cc, B:131:0x02d6, B:133:0x02ea, B:135:0x02ee, B:279:0x0595, B:137:0x02f9, B:140:0x0303, B:269:0x0565, B:144:0x0312, B:146:0x031a, B:150:0x0333, B:169:0x03ac, B:171:0x03b4, B:174:0x03c3, B:193:0x043f, B:195:0x0447, B:215:0x048a, B:217:0x0499, B:244:0x04e2, B:176:0x03e3, B:178:0x03eb, B:180:0x03f5, B:179:0x03f0, B:181:0x03fa, B:184:0x0402, B:186:0x040a, B:188:0x0414, B:187:0x040f, B:191:0x041a, B:245:0x04ef, B:247:0x04f9, B:249:0x0503, B:248:0x04fe, B:250:0x0507, B:252:0x0511, B:254:0x051b, B:253:0x0516, B:255:0x051f, B:152:0x0351, B:154:0x0359, B:156:0x0363, B:155:0x035e, B:157:0x0367, B:160:0x0371, B:162:0x0379, B:164:0x0383, B:163:0x037e, B:167:0x0388, B:256:0x0527, B:258:0x0531, B:260:0x053b, B:259:0x0536, B:261:0x053f, B:263:0x0549, B:265:0x0553, B:264:0x054e, B:266:0x0557, B:270:0x056b, B:272:0x0577, B:274:0x0582, B:276:0x0588, B:277:0x058f, B:284:0x05b1, B:287:0x05d2, B:337:0x0682, B:321:0x063c, B:323:0x0644, B:382:0x070c, B:324:0x064a, B:327:0x0654, B:334:0x066e, B:335:0x0673, B:336:0x067b, B:344:0x069a, B:369:0x06da, B:371:0x06eb, B:373:0x06f0, B:362:0x06cc, B:70:0x01b4, B:72:0x01c0, B:74:0x01c8, B:76:0x01d2, B:75:0x01cd, B:79:0x01d7, B:81:0x01f6, B:83:0x01fe, B:85:0x0208, B:84:0x0203, B:37:0x011c, B:39:0x0128, B:41:0x0130, B:43:0x013b, B:42:0x0135, B:46:0x0140, B:48:0x014e, B:51:0x015d, B:52:0x0168, B:54:0x016c, B:56:0x0172, B:57:0x018a, B:61:0x0191, B:63:0x0199, B:65:0x01a4, B:64:0x019e, B:23:0x00c7, B:24:0x00ce, B:386:0x072a, B:389:0x076f, B:391:0x0779, B:393:0x078e, B:397:0x07a8, B:401:0x07b2, B:406:0x07d0, B:407:0x07d7), top: B:450:0x0008, inners: #1, #3, #7, #9, #15 }] */
    @Override // defpackage.psi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.psk g(byte[] r51, int r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.g(byte[], int, boolean):psk");
    }
}
