package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: kb  reason: default package */
/* loaded from: classes.dex */
public final class kb {
    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static String d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean f(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static int g(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static String h(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static CharSequence i(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static CharSequence[] j(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int k(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int l(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        r7 = r0.getName();
        r10 = r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r10 == 89650992) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r10 == 1191572447) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r7.equals("selector") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r7.equals("gradient") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        r10 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r10 == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r10 != 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        r7 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r7.equals("gradient") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        r7 = e(r4, r28, r6, defpackage.dp.d);
        r14 = b(r7, r0, "startX", 8, 0.0f);
        r15 = b(r7, r0, "startY", 9, 0.0f);
        r16 = b(r7, r0, "endX", 10, 0.0f);
        r17 = b(r7, r0, "endY", 11, 0.0f);
        r10 = b(r7, r0, "centerX", 3, 0.0f);
        r2 = b(r7, r0, "centerY", 4, 0.0f);
        r13 = c(r7, r0, "type", 2, 0);
        r8 = m(r7, r0, "startColor", 0);
        r18 = a(r0, "centerColor");
        r3 = m(r7, r0, "centerColor", 7);
        r11 = m(r7, r0, "endColor", 1);
        r9 = c(r7, r0, "tileMode", 6, 0);
        r21 = b(r7, r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r2 = r0.getDepth() + 1;
        r5 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
        if (r7 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
        r10 = r0.getDepth();
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r10 >= r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
        if (r7 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
        if (r7 != 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r10 > r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
        if (r0.getName().equals("item") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
        r7 = e(r4, r28, r6, defpackage.dp.e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r15 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        if (r24 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0137, code lost:
        r24 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r24));
        r5.add(java.lang.Float.valueOf(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016d, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016e, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0173, code lost:
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0179, code lost:
        if (r12.size() <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017b, code lost:
        r0 = new defpackage.js(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
        if (r18 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0187, code lost:
        r0 = new defpackage.js(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018d, code lost:
        r0 = new defpackage.js(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0193, code lost:
        if (r13 == 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0196, code lost:
        if (r13 == 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0198, code lost:
        r1 = new android.graphics.LinearGradient(r14, r23, r16, r17, r0.a, r0.b, defpackage.jt.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r1 = new android.graphics.SweepGradient(r22, r2, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c2, code lost:
        if (r21 <= 0.0f) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
        r1 = new android.graphics.RadialGradient(r22, r2, r21, r0.a, r0.b, defpackage.jt.a(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e2, code lost:
        r2 = new defpackage.jm(r1, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e4, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0229, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022a, code lost:
        r0 = defpackage.jl.b(r4, r0, r6, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0234, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0238, code lost:
        r2 = new defpackage.jm(null, r0, r0.getDefaultColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023b, code lost:
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x023c, code lost:
        if (r2 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x023e, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jm n(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb.n(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):jm");
    }

    public static int o(TypedArray typedArray, XmlPullParser xmlPullParser, int i) {
        if (!a(xmlPullParser, "interpolator")) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static TypedValue p(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!a(xmlPullParser, "value")) {
            return null;
        }
        return typedArray.peekValue(0);
    }
}
