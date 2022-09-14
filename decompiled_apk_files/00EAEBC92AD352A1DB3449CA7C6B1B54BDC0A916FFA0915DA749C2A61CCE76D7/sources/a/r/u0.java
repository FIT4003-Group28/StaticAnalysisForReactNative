package a.r;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class u0 {

    /* renamed from: b  reason: collision with root package name */
    private static Method f683b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f684c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f685d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f686e;

    /* renamed from: a  reason: collision with root package name */
    private float[] f687a;

    @SuppressLint({"PrivateApi"})
    private void a() {
        if (!f684c) {
            try {
                f683b = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                f683b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            f684c = true;
        }
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(s.save_non_transition_alpha, null);
        }
    }

    public void a(View view, float f2) {
        Float f3 = (Float) view.getTag(s.save_non_transition_alpha);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void a(View view, int i) {
        if (!f686e) {
            try {
                f685d = View.class.getDeclaredField("mViewFlags");
                f685d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f686e = true;
        }
        Field field = f685d;
        if (field != null) {
            try {
                f685d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        a();
        Method method = f683b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void a(View view, Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f687a;
        if (fArr == null) {
            fArr = new float[9];
            this.f687a = fArr;
        }
        matrix.getValues(fArr);
        float f2 = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f2 * f2))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f2, sqrt));
        float f3 = fArr[0] / sqrt;
        float f4 = fArr[4] / sqrt;
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3);
        view.setScaleY(f4);
    }

    public float b(View view) {
        Float f2 = (Float) view.getTag(s.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f2 != null ? alpha / f2.floatValue() : alpha;
    }

    public void b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            b(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void c(View view) {
        if (view.getTag(s.save_non_transition_alpha) == null) {
            view.setTag(s.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void c(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            c(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (!matrix2.invert(matrix3)) {
                return;
            }
            matrix.postConcat(matrix3);
        }
    }
}
