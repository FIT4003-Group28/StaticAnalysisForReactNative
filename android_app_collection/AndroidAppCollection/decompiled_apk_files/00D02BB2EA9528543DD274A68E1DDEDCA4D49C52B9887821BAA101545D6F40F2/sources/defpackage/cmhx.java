package defpackage;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: PG */
/* renamed from: cmhx  reason: default package */
/* loaded from: classes5.dex */
public final class cmhx extends cmfy {
    private static final Pattern f = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern g = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern h = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern i = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern j = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern k = Pattern.compile("^(\\d+) (\\d+)$");
    private static final cmhv l = new cmhv(30.0f, 1, 1);
    private static final cmhu m = new cmhu(15);
    private final XmlPullParserFactory n;

    public cmhx() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static String[] n(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : cmny.u(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static cmib o(XmlPullParser xmlPullParser, cmib cmibVar) {
        char c;
        Matcher matcher;
        Layout.Alignment alignment;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            char c2 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        cmibVar = p(cmibVar);
                        cmibVar.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    cmibVar = p(cmibVar);
                    try {
                        cmibVar.b(cmms.a(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        if (String.valueOf(attributeValue).length() == 0) {
                            new String("Failed parsing background value: ");
                            break;
                        } else {
                            break;
                        }
                    }
                case 2:
                    cmibVar = p(cmibVar);
                    try {
                        cmibVar.c(cmms.a(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        if (String.valueOf(attributeValue).length() == 0) {
                            new String("Failed parsing color value: ");
                            break;
                        } else {
                            break;
                        }
                    }
                case 3:
                    cmibVar = p(cmibVar);
                    cmibVar.a = attributeValue;
                    break;
                case 4:
                    try {
                        cmibVar = p(cmibVar);
                        String[] u = cmny.u(attributeValue, "\\s+");
                        int length = u.length;
                        if (length == 1) {
                            matcher = h.matcher(attributeValue);
                        } else if (length == 2) {
                            matcher = h.matcher(u[1]);
                        } else {
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("Invalid number of entries for fontSize: ");
                            sb.append(length);
                            sb.append(".");
                            throw new cmgc(sb.toString());
                        }
                        if (matcher.matches()) {
                            String group = matcher.group(3);
                            cmmn.f(group);
                            int hashCode = group.hashCode();
                            if (hashCode != 37) {
                                if (hashCode != 3240) {
                                    if (hashCode == 3592 && group.equals("px")) {
                                        c2 = 0;
                                    }
                                } else if (group.equals("em")) {
                                    c2 = 1;
                                }
                            } else if (group.equals("%")) {
                                c2 = 2;
                            }
                            if (c2 == 0) {
                                cmibVar.j = 1;
                            } else if (c2 == 1) {
                                cmibVar.j = 2;
                            } else if (c2 == 2) {
                                cmibVar.j = 3;
                            } else {
                                StringBuilder sb2 = new StringBuilder(group.length() + 30);
                                sb2.append("Invalid unit for fontSize: '");
                                sb2.append(group);
                                sb2.append("'.");
                                throw new cmgc(sb2.toString());
                            }
                            String group2 = matcher.group(1);
                            cmmn.f(group2);
                            cmibVar.k = Float.parseFloat(group2);
                            break;
                        } else {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                            sb3.append("Invalid expression for fontSize: '");
                            sb3.append(attributeValue);
                            sb3.append("'.");
                            throw new cmgc(sb3.toString());
                        }
                    } catch (cmgc unused3) {
                        if (String.valueOf(attributeValue).length() == 0) {
                            new String("Failed parsing fontSize value: ");
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 5:
                    cmibVar = p(cmibVar);
                    cmibVar.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 6:
                    cmibVar = p(cmibVar);
                    cmibVar.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    String x = cmny.x(attributeValue);
                    switch (x.hashCode()) {
                        case -1364013995:
                            if (x.equals("center")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 100571:
                            if (x.equals("end")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 3317767:
                            if (x.equals("left")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 108511772:
                            if (x.equals("right")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 109757538:
                            if (x.equals("start")) {
                                c2 = 1;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0 || c2 == 1) {
                        cmibVar = p(cmibVar);
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else if (c2 == 2 || c2 == 3) {
                        cmibVar = p(cmibVar);
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else if (c2 != 4) {
                        break;
                    } else {
                        cmibVar = p(cmibVar);
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                    cmibVar.o = alignment;
                    break;
                case '\b':
                    String x2 = cmny.x(attributeValue);
                    int hashCode2 = x2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && x2.equals("none")) {
                            c2 = 0;
                        }
                    } else if (x2.equals("all")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            break;
                        } else {
                            cmibVar = p(cmibVar);
                            cmibVar.p = 1;
                            break;
                        }
                    } else {
                        cmibVar = p(cmibVar);
                        cmibVar.p = 0;
                        break;
                    }
                    break;
                case '\t':
                    String x3 = cmny.x(attributeValue);
                    switch (x3.hashCode()) {
                        case -618561360:
                            if (x3.equals("baseContainer")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (x3.equals("container")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -250518009:
                            if (x3.equals("delimiter")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (x3.equals("textContainer")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (x3.equals("base")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (x3.equals("text")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1 && c2 != 2) {
                            if (c2 != 3 && c2 != 4) {
                                if (c2 != 5) {
                                    break;
                                } else {
                                    cmibVar = p(cmibVar);
                                    cmibVar.m = 4;
                                    break;
                                }
                            } else {
                                cmibVar = p(cmibVar);
                                cmibVar.m = 3;
                                break;
                            }
                        } else {
                            cmibVar = p(cmibVar);
                            cmibVar.m = 2;
                            break;
                        }
                    } else {
                        cmibVar = p(cmibVar);
                        cmibVar.m = 1;
                        break;
                    }
                case '\n':
                    String x4 = cmny.x(attributeValue);
                    int hashCode3 = x4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && x4.equals("after")) {
                            c2 = 1;
                        }
                    } else if (x4.equals("before")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            break;
                        } else {
                            cmibVar = p(cmibVar);
                            cmibVar.n = 2;
                            break;
                        }
                    } else {
                        cmibVar = p(cmibVar);
                        cmibVar.n = 1;
                        break;
                    }
                case 11:
                    String x5 = cmny.x(attributeValue);
                    switch (x5.hashCode()) {
                        case -1461280213:
                            if (x5.equals("nounderline")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (x5.equals("underline")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (x5.equals("nolinethrough")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (x5.equals("linethrough")) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2) {
                                if (c2 != 3) {
                                    break;
                                } else {
                                    cmibVar = p(cmibVar);
                                    cmibVar.g = 0;
                                    break;
                                }
                            } else {
                                cmibVar = p(cmibVar);
                                cmibVar.g = 1;
                                break;
                            }
                        } else {
                            cmibVar = p(cmibVar);
                            cmibVar.f = 0;
                            break;
                        }
                    } else {
                        cmibVar = p(cmibVar);
                        cmibVar.f = 1;
                        break;
                    }
            }
        }
        return cmibVar;
    }

    private static cmib p(cmib cmibVar) {
        return cmibVar == null ? new cmib() : cmibVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
        if (r12.equals("s") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long q(java.lang.String r12, defpackage.cmhv r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhx.q(java.lang.String, cmhv):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0281 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028d A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, LOOP:1: B:119:0x028d->B:269:0x0532, LOOP_START, PHI: r4 r6 r13 
      PHI: (r4v9 java.lang.String) = (r4v3 java.lang.String), (r4v45 java.lang.String) binds: [B:118:0x028b, B:269:0x0532] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v9 java.util.HashMap) = (r6v1 java.util.HashMap), (r6v34 java.util.HashMap) binds: [B:118:0x028b, B:269:0x0532] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v12 cmhv) = (r13v8 cmhv), (r13v14 cmhv) binds: [B:118:0x028b, B:269:0x0532] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0456 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, TRY_LEAVE, TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04f8 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198 A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ff A[Catch: IOException -> 0x074b, XmlPullParserException -> 0x0755, TRY_ENTER, TryCatch #17 {IOException -> 0x074b, XmlPullParserException -> 0x0755, blocks: (B:3:0x0008, B:6:0x0070, B:8:0x007a, B:11:0x0089, B:13:0x008f, B:15:0x0097, B:17:0x009e, B:19:0x00a6, B:21:0x00b0, B:25:0x00d0, B:27:0x00de, B:29:0x00e5, B:31:0x00f1, B:33:0x00fc, B:35:0x010e, B:37:0x011a, B:39:0x0122, B:42:0x0129, B:44:0x0137, B:47:0x0146, B:62:0x018e, B:81:0x01ed, B:84:0x01ff, B:86:0x0205, B:88:0x020d, B:90:0x0215, B:92:0x021d, B:94:0x0225, B:96:0x022d, B:98:0x0233, B:100:0x023b, B:102:0x0243, B:104:0x0249, B:106:0x024f, B:108:0x0255, B:110:0x025d, B:113:0x0266, B:383:0x072b, B:116:0x0281, B:117:0x0287, B:119:0x028d, B:121:0x0296, B:123:0x02a5, B:125:0x02af, B:127:0x02c3, B:129:0x02c7, B:266:0x0526, B:131:0x02d2, B:134:0x02dc, B:256:0x04f8, B:138:0x02eb, B:140:0x02f3, B:144:0x030c, B:162:0x0375, B:164:0x037d, B:167:0x038c, B:184:0x03fc, B:186:0x0404, B:206:0x0447, B:208:0x0456, B:235:0x049f, B:169:0x03ac, B:172:0x03b6, B:173:0x03bd, B:176:0x03c5, B:179:0x03cf, B:182:0x03d7, B:236:0x04ab, B:239:0x04b6, B:240:0x04bc, B:243:0x04c7, B:147:0x032a, B:150:0x0333, B:151:0x0339, B:154:0x0343, B:157:0x034c, B:160:0x0353, B:244:0x04cd, B:247:0x04d8, B:248:0x04de, B:251:0x04e9, B:257:0x04fe, B:259:0x050a, B:261:0x0513, B:263:0x0519, B:264:0x0520, B:271:0x0540, B:274:0x0561, B:308:0x05ca, B:310:0x05d2, B:363:0x0685, B:324:0x0609, B:311:0x05d7, B:314:0x05e0, B:321:0x05f6, B:322:0x05fb, B:323:0x0602, B:330:0x061f, B:334:0x062e, B:337:0x0634, B:344:0x0646, B:346:0x064d, B:350:0x0655, B:352:0x0666, B:354:0x066b, B:65:0x0198, B:67:0x01a4, B:70:0x01ad, B:73:0x01b4, B:75:0x01d1, B:78:0x01da, B:48:0x014f, B:50:0x0153, B:52:0x0159, B:53:0x0171, B:57:0x0178, B:59:0x0180, B:22:0x00c3, B:23:0x00ca, B:367:0x06a3, B:370:0x06e8, B:372:0x06f2, B:374:0x0707, B:378:0x071e, B:382:0x0728, B:387:0x0743, B:388:0x074a), top: B:429:0x0008 }] */
    @Override // defpackage.cmfy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.cmga m(byte[] r50, int r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhx.m(byte[], int, boolean):cmga");
    }
}
