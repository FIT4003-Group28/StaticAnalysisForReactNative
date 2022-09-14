package android.support.b.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.support.v4.b.b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: classes.dex */
public class e {
    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return a(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i) {
        return a(context, resources, theme, i, 1.0f);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser animation;
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                animation = resources.getAnimation(i);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (XmlPullParserException e2) {
            e = e2;
        }
        try {
            Animator a2 = a(context, resources, theme, animation, f);
            if (animation != null) {
                animation.close();
            }
            return a2;
        } catch (IOException e3) {
            e = e3;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e4) {
            e = e4;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e);
            throw notFoundException2;
        } catch (Throwable th2) {
            th = th2;
            xmlResourceParser = animation;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<b.C0006b[]> {

        /* renamed from: a  reason: collision with root package name */
        private b.C0006b[] f118a;

        private a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public b.C0006b[] evaluate(float f, b.C0006b[] c0006bArr, b.C0006b[] c0006bArr2) {
            if (!android.support.v4.b.b.a(c0006bArr, c0006bArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.f118a == null || !android.support.v4.b.b.a(this.f118a, c0006bArr)) {
                this.f118a = android.support.v4.b.b.a(c0006bArr);
            }
            for (int i = 0; i < c0006bArr.length; i++) {
                this.f118a[i].a(c0006bArr[i], c0006bArr2[i], f);
            }
            return this.f118a;
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !a(i7)) && (!z2 || !a(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            b.C0006b[] b2 = android.support.v4.b.b.b(string);
            b.C0006b[] b3 = android.support.v4.b.b.b(string2);
            if (b2 == null && b3 == null) {
                return null;
            }
            if (b2 == null) {
                if (b3 == null) {
                    return null;
                }
                return PropertyValuesHolder.ofObject(str, new a(), b3);
            }
            a aVar = new a();
            if (b3 == null) {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, b2);
            } else if (!android.support.v4.b.b.a(b2, b3)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, b2, b3);
            }
            return ofObject;
        }
        f a2 = i == 3 ? f.a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, BitmapDescriptorFactory.HUE_RED);
                } else {
                    f2 = typedArray.getFloat(i2, BitmapDescriptorFactory.HUE_RED);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        f3 = typedArray.getFloat(i3, BitmapDescriptorFactory.HUE_RED);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                } else {
                    f = typedArray.getFloat(i3, BitmapDescriptorFactory.HUE_RED);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, BitmapDescriptorFactory.HUE_RED);
            } else if (a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                } else if (a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
            } else if (a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        }
        if (propertyValuesHolder == null || a2 == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(a2);
        return propertyValuesHolder;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a2 = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "duration", 1, 300);
        long a3 = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a4 = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (android.support.v4.a.a.c.a(xmlPullParser, "valueFrom") && android.support.v4.a.a.c.a(xmlPullParser, "valueTo")) {
            if (a4 == 4) {
                a4 = a(typedArray, 5, 6);
            }
            PropertyValuesHolder a5 = a(typedArray, a4, 5, 6, "");
            if (a5 != null) {
                valueAnimator.setValues(a5);
            }
        }
        valueAnimator.setDuration(a2);
        valueAnimator.setStartDelay(a3);
        valueAnimator.setRepeatCount(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            a(valueAnimator, typedArray2, a4, f, xmlPullParser);
        }
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a2 = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "pathData", 1);
        if (a2 != null) {
            String a3 = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "propertyXName", 2);
            String a4 = android.support.v4.a.a.c.a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a3 == null && a4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            a(android.support.v4.b.b.a(a2), objectAnimator, f * 0.5f, a3, a4);
            return;
        }
        objectAnimator.setPropertyName(android.support.v4.a.a.c.a(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        char c2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        float f2 = BitmapDescriptorFactory.HUE_RED;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / (min - 1);
        int i = 0;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4, fArr3, null);
            fArr[i] = fArr3[c2];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                f4 -= ((Float) arrayList.get(i3)).floatValue();
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
            c2 = 0;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.b.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static PropertyValuesHolder[] a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.i);
                    String a3 = android.support.v4.a.a.c.a(a2, xmlPullParser, "propertyName", 3);
                    int a4 = android.support.v4.a.a.c.a(a2, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder a5 = a(context, resources, theme, xmlPullParser, a3, a4);
                    if (a5 == null) {
                        a5 = a(a2, a4, 0, 1, a3);
                    }
                    if (a5 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(a5);
                    }
                    a2.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    private static int a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.j);
        int i = 0;
        TypedValue b2 = android.support.v4.a.a.c.b(a2, xmlPullParser, "value", 0);
        if ((b2 != null) && a(b2.type)) {
            i = 3;
        }
        a2.recycle();
        return i;
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !a(i3)) && (!z || !a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    private static PropertyValuesHolder a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        int i2 = i;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe a2 = a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (a2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a2);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < BitmapDescriptorFactory.HUE_RED) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), a(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != BitmapDescriptorFactory.HUE_RED) {
                if (fraction2 < BitmapDescriptorFactory.HUE_RED) {
                    keyframe.setFraction(BitmapDescriptorFactory.HUE_RED);
                } else {
                    arrayList.add(0, a(keyframe, (float) BitmapDescriptorFactory.HUE_RED));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < BitmapDescriptorFactory.HUE_RED) {
                    if (i3 == 0) {
                        keyframe3.setFraction(BitmapDescriptorFactory.HUE_RED);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < BitmapDescriptorFactory.HUE_RED; i6++) {
                                i5 = i6;
                            }
                            a(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static Keyframe a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        Keyframe ofInt;
        TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.j);
        float a3 = android.support.v4.a.a.c.a(a2, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b2 = android.support.v4.a.a.c.b(a2, xmlPullParser, "value", 0);
        boolean z = b2 != null;
        if (i == 4) {
            i = (!z || !a(b2.type)) ? 0 : 3;
        }
        if (z) {
            if (i != 3) {
                switch (i) {
                    case 0:
                        ofInt = Keyframe.ofFloat(a3, android.support.v4.a.a.c.a(a2, xmlPullParser, "value", 0, (float) BitmapDescriptorFactory.HUE_RED));
                        break;
                    case 1:
                        break;
                    default:
                        ofInt = null;
                        break;
                }
            }
            ofInt = Keyframe.ofInt(a3, android.support.v4.a.a.c.a(a2, xmlPullParser, "value", 0, 0));
        } else if (i == 0) {
            ofInt = Keyframe.ofFloat(a3);
        } else {
            ofInt = Keyframe.ofInt(a3);
        }
        int c2 = android.support.v4.a.a.c.c(a2, xmlPullParser, "interpolator", 1, 0);
        if (c2 > 0) {
            ofInt.setInterpolator(d.a(context, c2));
        }
        a2.recycle();
        return ofInt;
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a2 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.g);
        TypedArray a3 = android.support.v4.a.a.c.a(resources, theme, attributeSet, android.support.b.a.a.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, a2, a3, f, xmlPullParser);
        int c2 = android.support.v4.a.a.c.c(a2, xmlPullParser, "interpolator", 0, 0);
        if (c2 > 0) {
            valueAnimator.setInterpolator(d.a(context, c2));
        }
        a2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator;
    }
}
