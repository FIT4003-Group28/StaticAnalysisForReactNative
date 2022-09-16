package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: adn  reason: default package */
/* loaded from: classes.dex */
public class adn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyguardManager c(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return aek.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (!(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        KeyguardManager c = c(context);
        if (c == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return aek.b(c);
        }
        return aej.a(c);
    }

    public static Animator g(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = resources.getAnimation(i);
                return k(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
            } catch (IOException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static Keyframe h(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static PropertyValuesHolder i(TypedArray typedArray, int i, int i2, int i3, String str) {
        bos bosVar;
        int i4;
        PropertyValuesHolder ofInt;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        int i7 = peekValue != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        int i8 = peekValue2 != null ? peekValue2.type : 0;
        int i9 = 3;
        if (i == 4) {
            i = ((peekValue == null || !j(i7)) && (peekValue2 == null || !j(i8))) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            hb[] v = iy.v(string);
            hb[] v2 = iy.v(string2);
            if (v == null && v2 == null) {
                return null;
            }
            if (v == null) {
                return PropertyValuesHolder.ofObject(str, new bor(), v2);
            }
            bor borVar = new bor();
            if (v2 != null) {
                if (!iy.u(v, v2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return PropertyValuesHolder.ofObject(str, borVar, v, v2);
            }
            return PropertyValuesHolder.ofObject(str, borVar, v);
        }
        if (i == 3) {
            bosVar = bos.a;
        } else {
            i9 = i;
            bosVar = null;
        }
        if (i9 == 0) {
            if (peekValue != null) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (peekValue2 != null) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (peekValue == null) {
            if (peekValue2 != null) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (j(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder == null && bosVar != null) {
                propertyValuesHolder.setEvaluator(bosVar);
                return propertyValuesHolder;
            }
        } else {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (j(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (peekValue2 != null) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (j(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i5);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    private static boolean j(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0304, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0305, code lost:
        if (r32 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0307, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0309, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0314, code lost:
        if (r14 >= r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0316, code lost:
        r1[r3] = (android.animation.Animator) r13.get(r14);
        r14 = r14 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
        if (r33 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0326, code lost:
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x032a, code lost:
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032d, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator k(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adn.k(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        ValueAnimator valueAnimator3;
        TypedArray typedArray2;
        PropertyValuesHolder propertyValuesHolder;
        TypedArray g = ft.g(resources, theme, attributeSet, boj.g);
        TypedArray g2 = ft.g(resources, theme, attributeSet, boj.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long e = ft.e(g, xmlPullParser, "duration", 1, 300);
        int i = 0;
        long e2 = ft.e(g, xmlPullParser, "startOffset", 2, 0);
        int e3 = ft.e(g, xmlPullParser, "valueType", 7, 4);
        if (ft.l(xmlPullParser, "valueFrom") && ft.l(xmlPullParser, "valueTo")) {
            if (e3 == 4) {
                TypedValue peekValue = g.peekValue(5);
                int i2 = peekValue != null ? peekValue.type : 0;
                TypedValue peekValue2 = g.peekValue(6);
                e3 = ((peekValue == null || !j(i2)) && (peekValue2 == null || !j(peekValue2 != null ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder i3 = i(g, e3, 5, 6, "");
            if (i3 != null) {
                valueAnimator4.setValues(i3);
            }
        }
        valueAnimator4.setDuration(e);
        valueAnimator4.setStartDelay(e2);
        valueAnimator4.setRepeatCount(ft.e(g, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(ft.e(g, xmlPullParser, "repeatMode", 4, 1));
        if (g2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String i4 = ft.i(g2, xmlPullParser, "pathData", 1);
            if (i4 != null) {
                String i5 = ft.i(g2, xmlPullParser, "propertyXName", 2);
                String i6 = ft.i(g2, xmlPullParser, "propertyYName", 3);
                if (i5 != null || i6 != null) {
                    Path t = iy.t(i4);
                    PathMeasure pathMeasure = new PathMeasure(t, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f = 0.0f;
                    do {
                        f += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(t, false);
                    int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f2 = f / (min - 1);
                    valueAnimator2 = valueAnimator4;
                    typedArray2 = g;
                    int i7 = 0;
                    float f3 = 0.0f;
                    while (true) {
                        propertyValuesHolder = null;
                        if (i >= min) {
                            break;
                        }
                        int i8 = min;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i7)).floatValue(), fArr3, null);
                        fArr[i] = fArr3[0];
                        fArr2[i] = fArr3[1];
                        f3 += f2;
                        int i9 = i7 + 1;
                        if (i9 < arrayList.size() && f3 > ((Float) arrayList.get(i9)).floatValue()) {
                            pathMeasure2.nextContour();
                            i7 = i9;
                        }
                        i++;
                        min = i8;
                    }
                    PropertyValuesHolder ofFloat = i5 != null ? PropertyValuesHolder.ofFloat(i5, fArr) : null;
                    if (i6 != null) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(i6, fArr2);
                    }
                    if (ofFloat == null) {
                        i = 0;
                        objectAnimator.setValues(propertyValuesHolder);
                    } else {
                        i = 0;
                        if (propertyValuesHolder == null) {
                            objectAnimator.setValues(ofFloat);
                        } else {
                            objectAnimator.setValues(ofFloat, propertyValuesHolder);
                        }
                    }
                } else {
                    throw new InflateException(g2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray2 = g;
                objectAnimator.setPropertyName(ft.i(g2, xmlPullParser, "propertyName", 0));
            }
            typedArray = typedArray2;
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = g;
        }
        int q = ft.q(typedArray, xmlPullParser, i);
        if (q > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, q));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray.recycle();
        if (g2 != null) {
            g2.recycle();
        }
        return valueAnimator3;
    }

    public boolean e() {
        return false;
    }

    public boolean f(int[] iArr) {
        return false;
    }
}
