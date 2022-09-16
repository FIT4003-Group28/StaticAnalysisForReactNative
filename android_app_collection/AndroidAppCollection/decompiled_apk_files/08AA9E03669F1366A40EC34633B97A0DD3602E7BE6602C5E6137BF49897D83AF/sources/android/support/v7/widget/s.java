package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.support.v7.a.a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static final RectF f1011a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1012b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f1013c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1014d = false;
    private float e = -1.0f;
    private float f = -1.0f;
    private float g = -1.0f;
    private int[] h = new int[0];
    private boolean i = false;
    private TextPaint j;
    private final TextView k;
    private final Context l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(TextView textView) {
        this.k = textView;
        this.l = this.k.getContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.l.obtainStyledAttributes(attributeSet, a.j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(a.j.AppCompatTextView_autoSizeTextType)) {
            this.f1013c = obtainStyledAttributes.getInt(a.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(a.j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(a.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(a.j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(a.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(a.j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(a.j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(a.j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (k()) {
            if (this.f1013c != 1) {
                return;
            }
            if (!this.i) {
                DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a(dimension2, dimension3, dimension);
            }
            i();
            return;
        }
        this.f1013c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (k()) {
            switch (i) {
                case 0:
                    j();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (!i()) {
                        return;
                    }
                    f();
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        if (k()) {
            DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (!i()) {
                return;
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, int i) {
        if (k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.h = a(iArr2);
                if (!h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.i = false;
            }
            if (!i()) {
                return;
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f1013c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return Math.round(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return Math.round(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return Math.round(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        return this.h;
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.h = a(iArr);
            h();
        }
    }

    private boolean h() {
        int length = this.h.length;
        this.i = length > 0;
        if (this.i) {
            this.f1013c = 1;
            this.f = this.h[0];
            this.g = this.h[length - 1];
            this.e = -1.0f;
        }
        return this.i;
    }

    private int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void a(float f, float f2, float f3) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1013c = 1;
            this.f = f;
            this.g = f2;
            this.e = f3;
            this.i = false;
        }
    }

    private boolean i() {
        if (k() && this.f1013c == 1) {
            if (!this.i || this.h.length == 0) {
                float round = Math.round(this.f);
                int i = 1;
                while (Math.round(this.e + round) <= Math.round(this.g)) {
                    i++;
                    round += this.e;
                }
                int[] iArr = new int[i];
                float f = this.f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.e;
                }
                this.h = a(iArr);
            }
            this.f1014d = true;
        } else {
            this.f1014d = false;
        }
        return this.f1014d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (!g()) {
            return;
        }
        if (this.f1014d) {
            if (this.k.getMeasuredHeight() <= 0 || this.k.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = ((Boolean) a((Object) this.k, "getHorizontallyScrolling", (String) false)).booleanValue() ? PKIFailureInfo.badCertTemplate : (this.k.getMeasuredWidth() - this.k.getTotalPaddingLeft()) - this.k.getTotalPaddingRight();
            int height = (this.k.getHeight() - this.k.getCompoundPaddingBottom()) - this.k.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            synchronized (f1011a) {
                f1011a.setEmpty();
                f1011a.right = measuredWidth;
                f1011a.bottom = height;
                float a2 = a(f1011a);
                if (a2 != this.k.getTextSize()) {
                    a(0, a2);
                }
            }
        }
        this.f1014d = true;
    }

    private void j() {
        this.f1013c = 0;
        this.f = -1.0f;
        this.g = -1.0f;
        this.e = -1.0f;
        this.h = new int[0];
        this.f1014d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f) {
        Resources resources;
        if (this.l == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.l.getResources();
        }
        a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void a(float f) {
        if (f != this.k.getPaint().getTextSize()) {
            this.k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.k.isInLayout() : false;
            if (this.k.getLayout() == null) {
                return;
            }
            this.f1014d = false;
            try {
                Method a2 = a("nullLayouts");
                if (a2 != null) {
                    a2.invoke(this.k, new Object[0]);
                }
            } catch (Exception e) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
            }
            if (!isInLayout) {
                this.k.requestLayout();
            } else {
                this.k.forceLayout();
            }
            this.k.invalidate();
        }
    }

    private int a(RectF rectF) {
        int length = this.h.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            if (a(this.h[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i2;
                i2 = i5;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.h[i3];
    }

    private boolean a(int i, RectF rectF) {
        StaticLayout a2;
        CharSequence transformation;
        CharSequence text = this.k.getText();
        TransformationMethod transformationMethod = this.k.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.k)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.k.getMaxLines() : -1;
        if (this.j == null) {
            this.j = new TextPaint();
        } else {
            this.j.reset();
        }
        this.j.set(this.k.getPaint());
        this.j.setTextSize(i);
        Layout.Alignment alignment = (Layout.Alignment) a((Object) this.k, "getLayoutAlignment", (String) Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            a2 = a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            a2 = a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && ((float) a2.getHeight()) <= rectF.bottom;
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) a((Object) this.k, "getTextDirectionHeuristic", (String) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.j, i).setAlignment(alignment).setLineSpacing(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier()).setIncludePad(this.k.getIncludeFontPadding()).setBreakStrategy(this.k.getBreakStrategy()).setHyphenationFrequency(this.k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            floatValue = this.k.getLineSpacingMultiplier();
            floatValue2 = this.k.getLineSpacingExtra();
            booleanValue = this.k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) a((Object) this.k, "getLineSpacingMultiplier", (String) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) a((Object) this.k, "getLineSpacingExtra", (String) Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))).floatValue();
            booleanValue = ((Boolean) a((Object) this.k, "getIncludeFontPadding", (String) true)).booleanValue();
        }
        return new StaticLayout(charSequence, this.j, i, alignment, floatValue, floatValue2, booleanValue);
    }

    private <T> T a(Object obj, String str, T t) {
        try {
            return (T) a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    private Method a(String str) {
        try {
            Method method = f1012b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1012b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return k() && this.f1013c != 0;
    }

    private boolean k() {
        return !(this.k instanceof i);
    }
}
