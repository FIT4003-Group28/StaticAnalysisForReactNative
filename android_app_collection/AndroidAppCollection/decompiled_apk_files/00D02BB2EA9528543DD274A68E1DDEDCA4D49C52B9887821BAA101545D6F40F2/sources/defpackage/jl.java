package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.apps.maps.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: jl  reason: default package */
/* loaded from: classes.dex */
public final class jl {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, asAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object[], java.lang.Object] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20];
            int[] iArr2 = new int[20];
            int i2 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr3 = dp.a;
                    if (theme == null) {
                        obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr3);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                    }
                    int color = obtainStyledAttributes.getColor(0, -65281);
                    float f = 1.0f;
                    if (obtainStyledAttributes.hasValue(i)) {
                        f = obtainStyledAttributes.getFloat(i, 1.0f);
                    } else if (obtainStyledAttributes.hasValue(2)) {
                        f = obtainStyledAttributes.getFloat(2, 1.0f);
                    }
                    obtainStyledAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i3 = 0;
                    for (int i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha) {
                            int i5 = i3 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i3] = attributeNameResource;
                            i3 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                    int round = (16777215 & color) | (Math.round(Color.alpha(color) * f) << 24);
                    int i6 = i2 + 1;
                    if (i6 > iArr2.length) {
                        int[] iArr5 = new int[ju.a(i2)];
                        System.arraycopy(iArr2, 0, iArr5, 0, i2);
                        iArr2 = iArr5;
                    }
                    iArr2[i2] = round;
                    if (i6 > iArr.length) {
                        ?? r8 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), ju.a(i2));
                        System.arraycopy(iArr, 0, r8, 0, i2);
                        iArr = r8;
                    }
                    iArr[i2] = trimStateSet;
                    iArr = iArr;
                    i2 = i6;
                }
                i = 1;
            }
            int[] iArr6 = new int[i2];
            int[][] iArr7 = new int[i2];
            System.arraycopy(iArr2, 0, iArr6, 0, i2);
            System.arraycopy(iArr, 0, iArr7, 0, i2);
            return new ColorStateList(iArr7, iArr6);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
