package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: zag  reason: default package */
/* loaded from: classes4.dex */
public final class zag {
    public static float a(Context context, float f, float f2) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float h = zew.h(displayMetrics, f2);
        float ceil = ((float) Math.ceil(zew.h(displayMetrics, f) / h)) * h;
        if (ceil > zew.k(context)) {
            ceil -= h;
        }
        double d = h;
        Double.isNaN(d);
        if (ceil < d * 1.5d) {
            ceil = h * 1.5f;
        }
        return zew.g(displayMetrics, ceil);
    }

    public static float b(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public static int c(Context context, ListAdapter listAdapter, ViewGroup viewGroup) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(zew.l(context), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int i = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        while (i < count) {
            int itemViewType = listAdapter.getItemViewType(i);
            int i4 = itemViewType != i3 ? itemViewType : i3;
            if (itemViewType != i3) {
                view = null;
            }
            view = listAdapter.getView(i, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
            i++;
            i3 = i4;
        }
        return i2;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f = i;
        int width = bitmap.getWidth();
        float f2 = i2;
        int height = bitmap.getHeight();
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f / width, f2 / height, f3, f4);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        int width2 = bitmap.getWidth();
        canvas.drawBitmap(bitmap, f3 - (width2 / 2), f4 - (bitmap.getHeight() / 2), new Paint(2));
        return createBitmap;
    }

    public static Drawable e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i == 1 ? new int[]{R.attr.selectableItemBackgroundBorderless} : new int[]{R.attr.selectableItemBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static Drawable f(Context context, int i, int i2) {
        Drawable a = akf.a(context, i);
        a.mutate().setColorFilter(zhn.d(context, i2), PorterDuff.Mode.SRC_IN);
        return a;
    }

    public static View g(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById == null || !(findViewById instanceof ViewStub)) {
            return view.findViewById(i2);
        }
        return ((ViewStub) findViewById).inflate();
    }

    public static void h(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.getWindow().getDecorView();
        }
        if (currentFocus != null) {
            i(currentFocus);
        }
    }

    public static void i(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void j(EditText editText) {
        Editable text = editText.getText();
        Selection.setSelection(text, text.length());
    }

    public static void k(View view, Drawable drawable) {
        l(view, drawable, 0);
    }

    public static void l(View view, Drawable drawable, int i) {
        boolean z = drawable instanceof zaf;
        if (!z || ((zaf) drawable).b != i) {
            Drawable e = e(view.getContext(), i);
            if (e == null) {
                zav.c(view, drawable);
                return;
            } else if (drawable == null) {
                zav.c(view, e);
                return;
            } else {
                if (z) {
                    drawable = ((zaf) drawable).a;
                }
                zav.c(view, new zaf(drawable, e, i));
                return;
            }
        }
        view.setBackground(drawable);
    }

    public static void m(TextView textView, CharSequence charSequence) {
        n(textView, charSequence, 0);
    }

    public static void n(TextView textView, CharSequence charSequence, int i) {
        textView.setText(charSequence);
        if (true == TextUtils.isEmpty(charSequence)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public static void o(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public static void p(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    public static void q(Context context, int i, int i2) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), i, i2).show();
        }
    }

    public static void r(Context context, CharSequence charSequence, int i) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), charSequence, i).show();
        }
    }

    public static boolean s(View view, View view2) {
        if (view instanceof ViewParent) {
            return t((ViewParent) view, view2);
        }
        return view2 == view;
    }

    public static boolean t(ViewParent viewParent, View view) {
        while (view != null) {
            if (view != viewParent) {
                if (view.getParent() instanceof View) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void u(View view, boolean z, int i, yzh yzhVar) {
        yzw yzwVar;
        Drawable background = view.getBackground();
        if (background instanceof yzw) {
            yzwVar = (yzw) background;
        } else {
            view.setBackground(null);
            yzw yzwVar2 = new yzw(view.getContext(), background);
            zav.c(view, yzwVar2);
            yzwVar = yzwVar2;
        }
        if (i != 0 && yzhVar != null) {
            yzhVar.b(yzwVar.getDrawable(1), i);
            yzwVar.invalidateSelf();
        }
        yzwVar.getDrawable(1).setAlpha(true != z ? 0 : PrivateKeyType.INVALID);
        yzwVar.invalidateSelf();
    }

    public static zgu v(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (zfm.a.c == null) {
                zfm.a.c = new zgu(packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            }
            return zfm.a.c;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("PackageManager did not find our package name!", e);
        }
    }
}
