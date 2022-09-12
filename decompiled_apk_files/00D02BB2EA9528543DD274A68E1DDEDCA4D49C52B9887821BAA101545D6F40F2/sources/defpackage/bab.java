package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
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
/* renamed from: bab  reason: default package */
/* loaded from: classes.dex */
public final class bab {
    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = resources.getAnimation(i);
                return e(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
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

    private static PropertyValuesHolder b(TypedArray typedArray, int i, int i2, int i3, String str) {
        bac bacVar;
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
            i = ((peekValue == null || !d(i7)) && (peekValue2 == null || !d(i8))) ? 0 : 3;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            kf[] a = kg.a(string);
            kf[] a2 = kg.a(string2);
            if (a == null && a2 == null) {
                return null;
            }
            if (a == null) {
                return PropertyValuesHolder.ofObject(str, new baa(), a2);
            }
            baa baaVar = new baa();
            if (a2 != null) {
                if (!kg.c(a, a2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return PropertyValuesHolder.ofObject(str, baaVar, a, a2);
            }
            return PropertyValuesHolder.ofObject(str, baaVar, a);
        }
        if (i == 3) {
            bacVar = bac.a;
        } else {
            i9 = i;
            bacVar = null;
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
                } else if (d(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder == null && bacVar != null) {
                propertyValuesHolder.setEvaluator(bacVar);
                return propertyValuesHolder;
            }
        } else {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (d(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (peekValue2 != null) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (d(i8)) {
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

    private static Keyframe c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static boolean d(int i) {
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
    private static android.animation.Animator e(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bab.e(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    private static ValueAnimator f(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        int i;
        TypedArray typedArray;
        ValueAnimator valueAnimator3;
        TypedArray typedArray2;
        TypedArray e = kb.e(resources, theme, attributeSet, azs.g);
        TypedArray e2 = kb.e(resources, theme, attributeSet, azs.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        int i2 = 1;
        long c = kb.c(e, xmlPullParser, "duration", 1, cpnx.a);
        boolean z = false;
        long c2 = kb.c(e, xmlPullParser, "startOffset", 2, 0);
        int c3 = kb.c(e, xmlPullParser, "valueType", 7, 4);
        if (kb.a(xmlPullParser, "valueFrom") && kb.a(xmlPullParser, "valueTo")) {
            if (c3 == 4) {
                TypedValue peekValue = e.peekValue(5);
                int i3 = peekValue != null ? peekValue.type : 0;
                TypedValue peekValue2 = e.peekValue(6);
                c3 = ((peekValue == null || !d(i3)) && (peekValue2 == null || !d(peekValue2 != null ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder b = b(e, c3, 5, 6, "");
            if (b != null) {
                valueAnimator4.setValues(b);
            }
        }
        valueAnimator4.setDuration(c);
        valueAnimator4.setStartDelay(c2);
        valueAnimator4.setRepeatCount(kb.c(e, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(kb.c(e, xmlPullParser, "repeatMode", 4, 1));
        if (e2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String d = kb.d(e2, xmlPullParser, "pathData", 1);
            if (d != null) {
                String d2 = kb.d(e2, xmlPullParser, "propertyXName", 2);
                String d3 = kb.d(e2, xmlPullParser, "propertyYName", 3);
                if (d2 != null || d3 != null) {
                    Path path = new Path();
                    kf[] a = kg.a(d);
                    if (a != null) {
                        try {
                            kf.a(a, path);
                        } catch (RuntimeException e3) {
                            throw new RuntimeException("Error in parsing " + d, e3);
                        }
                    } else {
                        path = null;
                    }
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f = 0.0f;
                    while (true) {
                        f += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        e = e;
                        i2 = 1;
                        z = false;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, z);
                    int min = Math.min(100, ((int) (f / 0.5f)) + i2);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f2 = f / (min - 1);
                    valueAnimator2 = valueAnimator4;
                    int i4 = 0;
                    float f3 = 0.0f;
                    int i5 = 0;
                    while (i5 < min) {
                        int i6 = min;
                        TypedArray typedArray3 = e;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                        fArr[i5] = fArr3[0];
                        fArr2[i5] = fArr3[1];
                        f3 += f2;
                        int i7 = i4 + 1;
                        if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                            pathMeasure2.nextContour();
                            i4 = i7;
                        }
                        i5++;
                        e = typedArray3;
                        min = i6;
                    }
                    typedArray2 = e;
                    PropertyValuesHolder ofFloat = d2 != null ? PropertyValuesHolder.ofFloat(d2, fArr) : null;
                    PropertyValuesHolder ofFloat2 = d3 != null ? PropertyValuesHolder.ofFloat(d3, fArr2) : null;
                    if (ofFloat == null) {
                        i = 0;
                        objectAnimator.setValues(ofFloat2);
                    } else {
                        i = 0;
                        if (ofFloat2 == null) {
                            objectAnimator.setValues(ofFloat);
                        } else {
                            objectAnimator.setValues(ofFloat, ofFloat2);
                        }
                    }
                } else {
                    throw new InflateException(e2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray2 = e;
                i = 0;
                objectAnimator.setPropertyName(kb.d(e2, xmlPullParser, "propertyName", 0));
            }
            typedArray = typedArray2;
        } else {
            valueAnimator2 = valueAnimator4;
            i = 0;
            typedArray = e;
        }
        int o = kb.o(typedArray, xmlPullParser, i);
        if (o > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, o));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray.recycle();
        if (e2 != null) {
            e2.recycle();
        }
        return valueAnimator3;
    }
}
