package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: PG */
/* renamed from: owh  reason: default package */
/* loaded from: classes4.dex */
public class owh extends DefaultHandler implements pcb {
    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private final String b;
    private final XmlPullParserFactory c;

    public owh(String str) {
        this.b = str;
        try {
            this.c = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    protected static final owr A(XmlPullParser xmlPullParser, owr owrVar) {
        long j;
        long j2;
        long e = e(xmlPullParser, "timescale", owrVar != null ? owrVar.g : 1L);
        long j3 = 0;
        long e2 = e(xmlPullParser, "presentationTimeOffset", owrVar != null ? owrVar.h : 0L);
        if (owrVar != null) {
            j3 = owrVar.a;
        }
        long j4 = owrVar != null ? owrVar.b : -1L;
        owj owjVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - parseLong) + 1;
            j = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (owrVar != null) {
            owjVar = owrVar.f;
        }
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "Initialization")) {
                owjVar = x(xmlPullParser);
            }
        } while (!pcu.a(xmlPullParser, "SegmentBase"));
        return new owr(owjVar, e, e2, j, j2);
    }

    private static int B(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        pce.d(i == i2);
        return i;
    }

    protected static float a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = a.matcher(attributeValue);
            if (!matcher.matches()) {
                return f;
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            String group = matcher.group(2);
            return !TextUtils.isEmpty(group) ? parseInt / Integer.parseInt(group) : parseInt;
        }
        return f;
    }

    protected static int b(XmlPullParser xmlPullParser, String str) {
        return c(xmlPullParser, str, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int c(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long d(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : pcx.h(attributeValue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long e(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static String m(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return pcw.a(str, xmlPullParser.getText());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String n(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final owq q(long j, long j2) {
        return new owq(j, j2);
    }

    protected static final int r(XmlPullParser xmlPullParser) {
        int b = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(n(xmlPullParser, "schemeIdUri", null)) ? b(xmlPullParser, "value") : -1;
        do {
            xmlPullParser.next();
        } while (!pcu.a(xmlPullParser, "AudioChannelConfiguration"));
        return b;
    }

    protected static final int s(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 0;
        }
        return !"text".equals(attributeValue) ? -1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long t(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1L;
        }
        Matcher matcher = pcx.e.matcher(attributeValue);
        int i = 0;
        if (!matcher.matches()) {
            throw new ParseException(attributeValue.length() != 0 ? "Invalid date/time format: ".concat(attributeValue) : new String("Invalid date/time format: "), 0);
        }
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (matcher.group(11).equals("-")) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf.length() != 0 ? "0.".concat(valueOf) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long u(XmlPullParser xmlPullParser) {
        return e(xmlPullParser, "d", -1L);
    }

    protected static final owj v(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new owj(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new owj(attributeValue, j, j2);
    }

    protected static final owt w(XmlPullParser xmlPullParser, String str, owt owtVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String[] strArr = new String[5];
            int[] iArr = new int[4];
            String[] strArr2 = new String[4];
            strArr[0] = "";
            int i = 0;
            int i2 = 0;
            while (i < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i);
                if (indexOf == -1) {
                    String valueOf = String.valueOf(strArr[i2]);
                    String valueOf2 = String.valueOf(attributeValue.substring(i));
                    strArr[i2] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    i = attributeValue.length();
                } else if (indexOf != i) {
                    String valueOf3 = String.valueOf(strArr[i2]);
                    String valueOf4 = String.valueOf(attributeValue.substring(i, indexOf));
                    strArr[i2] = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                    i = indexOf;
                } else if (attributeValue.startsWith("$$", i)) {
                    strArr[i2] = String.valueOf(strArr[i2]).concat("$");
                    i += 2;
                } else {
                    int i3 = i + 1;
                    int indexOf2 = attributeValue.indexOf("$", i3);
                    String substring = attributeValue.substring(i3, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        iArr[i2] = 1;
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != -1) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d")) {
                                str2 = String.valueOf(str2).concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        if (substring.equals("Number")) {
                            iArr[i2] = 2;
                        } else if (substring.equals("Bandwidth")) {
                            iArr[i2] = 3;
                        } else if (substring.equals("Time")) {
                            iArr[i2] = 4;
                        } else {
                            throw new IllegalArgumentException(attributeValue.length() != 0 ? "Invalid template: ".concat(attributeValue) : new String("Invalid template: "));
                        }
                        strArr2[i2] = str2;
                    }
                    i2++;
                    strArr[i2] = "";
                    i = indexOf2 + 1;
                }
            }
            return new owt(strArr, iArr, strArr2, i2);
        }
        return owtVar;
    }

    protected static final owj x(XmlPullParser xmlPullParser) {
        return v(xmlPullParser, "sourceURL", "range");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Pair f(XmlPullParser xmlPullParser, String str, long j) {
        xmlPullParser.getAttributeValue(null, "id");
        long d = d(xmlPullParser, "start", j);
        long d2 = d(xmlPullParser, "duration", -1L);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        ows owsVar = null;
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = m(xmlPullParser, str);
                    z = true;
                }
            } else if (pcu.c(xmlPullParser, "AdaptationSet")) {
                arrayList.add(h(xmlPullParser, str, owsVar));
            } else if (pcu.c(xmlPullParser, "SegmentBase")) {
                owsVar = A(xmlPullParser, null);
            } else if (pcu.c(xmlPullParser, "SegmentList")) {
                owsVar = k(xmlPullParser, null);
            } else if (pcu.c(xmlPullParser, "SegmentTemplate")) {
                owsVar = l(xmlPullParser, null);
            }
        } while (!pcu.a(xmlPullParser, "Period"));
        return Pair.create(z(d, arrayList), Long.valueOf(d2));
    }

    protected ovm g(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        return new ovm(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e1, code lost:
        if ("wvtt".equals(r0) == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039b A[LOOP:0: B:3:0x0059->B:119:0x039b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x038f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.owc h(org.xmlpull.v1.XmlPullParser r59, java.lang.String r60, defpackage.ows r61) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owh.h(org.xmlpull.v1.XmlPullParser, java.lang.String, ows):owc");
    }

    protected owd i(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        owv owvVar = null;
        UUID uuid = null;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "cenc:pssh") && xmlPullParser.next() == 4) {
                owvVar = new owv("video/mp4", Base64.decode(xmlPullParser.getText(), 0));
                uuid = pdo.c(owvVar.b);
                z = true;
            }
        } while (!pcu.a(xmlPullParser, "ContentProtection"));
        if (!z || uuid != null) {
            return new owd(attributeValue, uuid, owvVar);
        }
        Log.w("MPDParser", "Skipped unsupported ContentProtection element");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014f A[Catch: ParseException -> 0x0179, XmlPullParserException -> 0x0180, TryCatch #2 {ParseException -> 0x0179, XmlPullParserException -> 0x0180, blocks: (B:3:0x0004, B:5:0x0017, B:7:0x0021, B:9:0x003d, B:12:0x0047, B:15:0x0051, B:17:0x0059, B:22:0x0072, B:25:0x007f, B:49:0x012c, B:61:0x0149, B:63:0x014f, B:65:0x0162, B:66:0x0169, B:58:0x0140, B:59:0x0147, B:27:0x0097, B:29:0x009f, B:31:0x00b3, B:33:0x00be, B:34:0x00c8, B:37:0x00d2, B:41:0x00ed, B:42:0x0109, B:43:0x010a, B:47:0x0124, B:46:0x011e, B:68:0x0171, B:69:0x0178), top: B:77:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162 A[Catch: ParseException -> 0x0179, XmlPullParserException -> 0x0180, TryCatch #2 {ParseException -> 0x0179, XmlPullParserException -> 0x0180, blocks: (B:3:0x0004, B:5:0x0017, B:7:0x0021, B:9:0x003d, B:12:0x0047, B:15:0x0051, B:17:0x0059, B:22:0x0072, B:25:0x007f, B:49:0x012c, B:61:0x0149, B:63:0x014f, B:65:0x0162, B:66:0x0169, B:58:0x0140, B:59:0x0147, B:27:0x0097, B:29:0x009f, B:31:0x00b3, B:33:0x00be, B:34:0x00c8, B:37:0x00d2, B:41:0x00ed, B:42:0x0109, B:43:0x010a, B:47:0x0124, B:46:0x011e, B:68:0x0171, B:69:0x0178), top: B:77:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.owf j(java.lang.String r29, java.io.InputStream r30) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owh.j(java.lang.String, java.io.InputStream):owf");
    }

    protected final owo k(XmlPullParser xmlPullParser, owo owoVar) {
        long e = e(xmlPullParser, "timescale", owoVar != null ? owoVar.g : 1L);
        long e2 = e(xmlPullParser, "presentationTimeOffset", owoVar != null ? owoVar.h : 0L);
        long e3 = e(xmlPullParser, "duration", owoVar != null ? owoVar.b : -1L);
        int c = c(xmlPullParser, "startNumber", owoVar != null ? owoVar.a : 1);
        List list = null;
        List list2 = null;
        owj owjVar = null;
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "Initialization")) {
                owjVar = x(xmlPullParser);
            } else if (pcu.c(xmlPullParser, "SegmentTimeline")) {
                list = o(xmlPullParser);
            } else if (pcu.c(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(v(xmlPullParser, "media", "mediaRange"));
            }
        } while (!pcu.a(xmlPullParser, "SegmentList"));
        if (owoVar != null) {
            if (owjVar == null) {
                owjVar = owoVar.f;
            }
            if (list == null) {
                list = owoVar.c;
            }
            if (list2 == null) {
                list2 = owoVar.d;
            }
        }
        return new owo(owjVar, e, e2, c, e3, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public owp l(XmlPullParser xmlPullParser, owp owpVar) {
        long e = e(xmlPullParser, "timescale", owpVar != null ? owpVar.g : 1L);
        long e2 = e(xmlPullParser, "presentationTimeOffset", owpVar != null ? owpVar.h : 0L);
        long e3 = e(xmlPullParser, "duration", owpVar != null ? owpVar.b : -1L);
        int c = c(xmlPullParser, "startNumber", owpVar != null ? owpVar.a : 1);
        List list = null;
        owt w = w(xmlPullParser, "media", owpVar != null ? owpVar.e : null);
        owt w2 = w(xmlPullParser, "initialization", owpVar != null ? owpVar.d : null);
        owj owjVar = null;
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "Initialization")) {
                owjVar = x(xmlPullParser);
            } else if (pcu.c(xmlPullParser, "SegmentTimeline")) {
                list = o(xmlPullParser);
            }
        } while (!pcu.a(xmlPullParser, "SegmentTemplate"));
        if (owpVar != null) {
            if (owjVar == null) {
                owjVar = owpVar.f;
            }
            if (list == null) {
                list = owpVar.c;
            }
        }
        return new owp(owjVar, e, e2, c, e3, list, w2, w);
    }

    protected List o(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (pcu.c(xmlPullParser, "S")) {
                j = e(xmlPullParser, "t", j);
                long u = u(xmlPullParser);
                int c = c(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < c; i++) {
                    arrayList.add(q(j, u));
                    j += u;
                }
            }
        } while (!pcu.a(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    protected void p(XmlPullParser xmlPullParser) {
    }

    protected owc y(int i, List list, List list2) {
        return new owc(i, list, list2);
    }

    protected owi z(long j, List list) {
        return new owi(j, list);
    }
}
