package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: ft  reason: default package */
/* loaded from: classes3.dex */
public final class ft {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !l(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int d(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !l(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int f(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence h(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!l(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static String j(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean k(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] m(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int n(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int o(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!l(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        r7 = r0.getName();
        r10 = r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r10 == 89650992) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r10 == 1191572447) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r7.equals("selector") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r7.equals("gradient") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        r10 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r10 == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r10 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
        r7 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r7.equals("gradient") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        r7 = g(r4, r28, r6, defpackage.bq.d);
        r14 = c(r7, r0, "startX", 8, 0.0f);
        r15 = c(r7, r0, "startY", 9, 0.0f);
        r16 = c(r7, r0, "endX", 10, 0.0f);
        r17 = c(r7, r0, "endY", 11, 0.0f);
        r10 = c(r7, r0, "centerX", 3, 0.0f);
        r2 = c(r7, r0, "centerY", 4, 0.0f);
        r13 = e(r7, r0, "type", 2, 0);
        r8 = o(r7, r0, "startColor", 0);
        r18 = l(r0, "centerColor");
        r3 = o(r7, r0, "centerColor", 7);
        r11 = o(r7, r0, "endColor", 1);
        r9 = e(r7, r0, "tileMode", 6, 0);
        r21 = c(r7, r0, "gradientRadius", 5, 0.0f);
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
        if (r7 == 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
        r10 = r0.getDepth();
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r10 >= r2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
        if (r7 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
        if (r7 != 2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r10 > r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
        if (r0.getName().equals("item") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
        r7 = g(r4, r28, r6, defpackage.bq.e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r15 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        if (r24 == false) goto L83;
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
        if (r12.size() <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017b, code lost:
        r0 = new defpackage.cao(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0182, code lost:
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
        if (r18 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0187, code lost:
        r0 = new defpackage.cao(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018d, code lost:
        r0 = new defpackage.cao(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0193, code lost:
        if (r13 == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0196, code lost:
        if (r13 == 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0198, code lost:
        r1 = new android.graphics.LinearGradient(r14, r23, r16, r17, r0.b, r0.a, t(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r1 = new android.graphics.SweepGradient(r22, r2, r0.b, r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c2, code lost:
        if (r21 <= 0.0f) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
        r1 = new android.graphics.RadialGradient(r22, r2, r21, r0.b, r0.a, t(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e2, code lost:
        r2 = new defpackage.gk(r1, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e5, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ee, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020c, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022b, code lost:
        r0 = defpackage.gj.b(r4, r0, r6, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0235, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0239, code lost:
        r2 = new defpackage.gk(null, r0, r0.getDefaultColor());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023f, code lost:
        android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", r0);
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0247, code lost:
        if (r2 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gk p(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.p(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):gk");
    }

    public static int q(TypedArray typedArray, XmlPullParser xmlPullParser, int i) {
        if (!l(xmlPullParser, "interpolator")) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static TypedValue r(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!l(xmlPullParser, "value")) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    public static int s(int i) {
        if (i <= 4) {
            return 8;
        }
        return i + i;
    }

    public static Shader.TileMode t(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static List u(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(x(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(x(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void v(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static int w(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static List x(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static du b(Context context, dp dpVar, boolean z, boolean z2) {
        int rd;
        dm dmVar = dpVar.R;
        int i = 0;
        int i2 = dmVar == null ? 0 : dmVar.f;
        if (z2) {
            if (z) {
                rd = dpVar.re();
            } else {
                rd = dpVar.rf();
            }
        } else if (z) {
            rd = dpVar.rc();
        } else {
            rd = dpVar.rd();
        }
        dpVar.ad(0, 0, 0, 0);
        ViewGroup viewGroup = dpVar.N;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            dpVar.N.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = dpVar.N;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (rd != 0) {
                i = rd;
            } else if (i2 != 0) {
                if (i2 == 4097) {
                    i = true != z ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
                } else if (i2 == 8194) {
                    i = true != z ? R.animator.fragment_close_exit : R.animator.fragment_close_enter;
                } else if (i2 != 8197) {
                    if (i2 == 4099) {
                        i = true != z ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter;
                    } else if (i2 != 4100) {
                        i = -1;
                    } else if (z) {
                        i = w(context, 16842936);
                    } else {
                        i = w(context, 16842937);
                    }
                } else if (z) {
                    i = w(context, 16842938);
                } else {
                    i = w(context, 16842939);
                }
            }
            if (i != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation != null) {
                            return new du(loadAnimation);
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (loadAnimator != null) {
                        return new du(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                    if (loadAnimation2 != null) {
                        return new du(loadAnimation2);
                    }
                }
            }
            return null;
        }
        return null;
    }
}
