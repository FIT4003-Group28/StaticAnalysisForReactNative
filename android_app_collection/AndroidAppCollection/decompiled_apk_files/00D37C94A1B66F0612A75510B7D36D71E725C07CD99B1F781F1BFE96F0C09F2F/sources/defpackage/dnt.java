package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dnt  reason: default package */
/* loaded from: classes3.dex */
public final class dnt {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static boolean d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static View e(View view, Object obj) {
        if (obj.equals(view.getTag())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View e = e(viewGroup.getChildAt(i), obj);
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    public static int f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
            }
            if (mode == 1073741824) {
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            }
            throw new IllegalStateException("Unexpected size spec mode");
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    }

    public static void g(int i, int i2, float f, ddj ddjVar) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int ceil = (int) Math.ceil(size / f);
        int ceil2 = (int) Math.ceil(size2 * f);
        if (mode == 0) {
            if (mode2 == 0) {
                ddjVar.a = 0;
                ddjVar.b = 0;
                return;
            }
            mode = 0;
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (ceil > size2) {
                ddjVar.a = ceil2;
                ddjVar.b = size2;
                return;
            }
            ddjVar.a = size;
            ddjVar.b = ceil;
        } else if (mode == 1073741824) {
            ddjVar.a = size;
            if (mode2 == 0 || ceil <= size2) {
                ddjVar.b = ceil;
            } else {
                ddjVar.b = size2;
            }
        } else if (mode2 == 1073741824) {
            ddjVar.b = size2;
            if (mode == 0 || ceil2 <= size) {
                ddjVar.a = ceil2;
            } else {
                ddjVar.a = size;
            }
        } else if (mode == Integer.MIN_VALUE) {
            ddjVar.a = size;
            ddjVar.b = ceil;
        } else if (mode2 != Integer.MIN_VALUE) {
        } else {
            ddjVar.a = ceil2;
            ddjVar.b = size2;
        }
    }

    public static void h(div divVar, Map map) {
        boolean z = dfz.a;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            divVar.a((String) entry.getKey(), entry.getValue());
        }
    }
}
