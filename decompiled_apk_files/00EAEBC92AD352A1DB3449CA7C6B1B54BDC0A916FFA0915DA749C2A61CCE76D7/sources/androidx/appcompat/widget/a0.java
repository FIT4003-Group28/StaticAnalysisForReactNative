package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {
    private static final RectF k = new RectF();
    private static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1195a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1196b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1197c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1198d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1199e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1200f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1201g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1202h;
    private final TextView i;
    private final Context j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextView textView) {
        this.i = textView;
        this.j = this.i.getContext();
    }

    private int a(RectF rectF) {
        int length = this.f1200f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (a(this.f1200f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1200f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1202h, i, alignment, ((Float) a(this.i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.i, "mIncludePad", true)).booleanValue());
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field a2 = a(str);
            return a2 == null ? t : (T) a2.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private static Field a(String str) {
        try {
            Field field = m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private void a(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() == null) {
                return;
            }
            this.f1196b = false;
            try {
                Method b2 = b("nullLayouts");
                if (b2 != null) {
                    b2.invoke(this.i, new Object[0]);
                }
            } catch (Exception e2) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
            }
            if (!isInLayout) {
                this.i.requestLayout();
            } else {
                this.i.forceLayout();
            }
            this.i.invalidate();
        }
    }

    private void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        } else {
            this.f1195a = 1;
            this.f1198d = f2;
            this.f1199e = f3;
            this.f1197c = f4;
            this.f1201g = false;
        }
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1200f = a(iArr);
            j();
        }
    }

    private boolean a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        a(i);
        StaticLayout a2 = a(text, (Layout.Alignment) b(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && ((float) a2.getHeight()) <= rectF.bottom;
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

    private StaticLayout b(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1202h, i, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    private StaticLayout b(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1202h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.i.getTextDirectionHeuristic() : (TextDirectionHeuristic) b(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private static <T> T b(Object obj, String str, T t) {
        try {
            return (T) b(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private static Method b(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private void h() {
        this.f1195a = 0;
        this.f1198d = -1.0f;
        this.f1199e = -1.0f;
        this.f1197c = -1.0f;
        this.f1200f = new int[0];
        this.f1196b = false;
    }

    private boolean i() {
        if (!k() || this.f1195a != 1) {
            this.f1196b = false;
        } else {
            if (!this.f1201g || this.f1200f.length == 0) {
                int floor = ((int) Math.floor((this.f1199e - this.f1198d) / this.f1197c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1198d + (i * this.f1197c));
                }
                this.f1200f = a(iArr);
            }
            this.f1196b = true;
        }
        return this.f1196b;
    }

    private boolean j() {
        int length = this.f1200f.length;
        this.f1201g = length > 0;
        if (this.f1201g) {
            this.f1195a = 1;
            int[] iArr = this.f1200f;
            this.f1198d = iArr[0];
            this.f1199e = iArr[length - 1];
            this.f1197c = -1.0f;
        }
        return this.f1201g;
    }

    private boolean k() {
        return !(this.i instanceof k);
    }

    StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? b(charSequence, alignment, i, i2) : i3 >= 16 ? b(charSequence, alignment, i) : a(charSequence, alignment, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (!g()) {
            return;
        }
        if (this.f1196b) {
            if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.i.isHorizontallyScrollable() : ((Boolean) b(this.i, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
            int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            synchronized (k) {
                k.setEmpty();
                k.right = measuredWidth;
                k.bottom = height;
                float a2 = a(k);
                if (a2 != this.i.getTextSize()) {
                    a(0, a2);
                }
            }
        }
        this.f1196b = true;
    }

    void a(int i) {
        TextPaint textPaint = this.f1202h;
        if (textPaint == null) {
            this.f1202h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1202h.set(this.i.getPaint());
        this.f1202h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f2) {
        Context context = this.j;
        a(TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        if (k()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (!i()) {
                return;
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, a.a.j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTextView_autoSizeTextType)) {
            this.f1195a = obtainStyledAttributes.getInt(a.a.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(a.a.j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(a.a.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(a.a.j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(a.a.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(a.a.j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(a.a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!k()) {
            this.f1195a = 0;
        } else if (this.f1195a != 1) {
        } else {
            if (!this.f1201g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
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
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1200f = a(iArr2);
                if (!j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1201g = false;
            }
            if (!i()) {
                return;
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return Math.round(this.f1199e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        if (k()) {
            if (i == 0) {
                h();
            } else if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            } else {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (!i()) {
                    return;
                }
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return Math.round(this.f1198d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return Math.round(this.f1197c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        return this.f1200f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1195a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return k() && this.f1195a != 0;
    }
}
