package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.Locale;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: zhn  reason: default package */
/* loaded from: classes4.dex */
public final class zhn {
    private static void A(int i) {
        if (i != 0) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid attribute resource ID (%d)", 0));
    }

    public static ayoc a(final ankt anktVar) {
        return ayoc.i(new ayoe() { // from class: zhj
            @Override // defpackage.ayoe
            public final void a(azam azamVar) {
                ankt anktVar2 = ankt.this;
                anlz.A(anktVar2, new zhm(azamVar), anjk.a);
                ayqi.f(azamVar, new ayqg(new zhl(anktVar2)));
            }
        });
    }

    public static ayob b(final aynr aynrVar) {
        return new ayob() { // from class: zhi
            @Override // defpackage.ayob
            public final bamd a(aynx aynxVar) {
                return aynxVar.R(aynr.this.P(new Object()).g());
            }
        };
    }

    public static aynr c(final ankt anktVar) {
        return aynr.j(new aynt() { // from class: zhg
            @Override // defpackage.aynt
            public final void a(aysm aysmVar) {
                ankt anktVar2 = ankt.this;
                anlz.A(anktVar2, new zhh(aysmVar), anjk.a);
                aysmVar.d(new zhl(anktVar2, 1));
            }
        });
    }

    public static int d(Context context, int i) {
        context.getClass();
        A(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw z(i);
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return context.getResources().getColor(typedValue.resourceId);
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format("Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)), e);
                }
            }
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color (attr = %d, type = %d)", Integer.valueOf(i), Integer.valueOf(typedValue.type)));
        }
        return typedValue.data;
    }

    public static int e(Context context, int i) {
        context.getClass();
        A(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw z(i);
        }
        if (typedValue.type == 1) {
            return typedValue.resourceId;
        }
        throw new UnsupportedOperationException(String.format("Type of attribute is not a resource ID (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()));
    }

    public static ColorStateList f(Context context, int i) {
        context.getClass();
        A(i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            try {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
                if (colorStateList == null) {
                    throw z(i);
                }
                return colorStateList;
            } catch (Resources.NotFoundException e) {
                throw new UnsupportedOperationException(String.format("Type of attribute is not a color state list (attr = %d, value = %s)", Integer.valueOf(i), obtainStyledAttributes.getString(0)), e);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable g(Context context, int i) {
        context.getClass();
        A(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw z(i);
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return gw.f(context.getResources(), typedValue.resourceId, context.getTheme());
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format("Type of attribute is not a reference to a drawable (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()), e);
                }
            }
            throw new UnsupportedOperationException(String.format("Type of attribute is not a color or a reference to a drawable (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()));
        }
        return new ColorDrawable(typedValue.data);
    }

    public static Optional h(Context context, int i) {
        context.getClass();
        A(i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{i});
        try {
            return Optional.ofNullable(obtainStyledAttributes.getColorStateList(0));
        } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            return Optional.empty();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Optional i(Context context, int i) {
        context.getClass();
        A(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return Optional.empty();
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return Optional.ofNullable(gw.f(context.getResources(), typedValue.resourceId, context.getTheme()));
                } catch (Resources.NotFoundException unused) {
                    return Optional.empty();
                }
            }
            return Optional.empty();
        }
        return Optional.of(new ColorDrawable(typedValue.data));
    }

    public static OptionalInt j(Context context, int i) {
        context.getClass();
        return k(context.getResources(), context.getTheme(), i);
    }

    public static OptionalInt k(Resources resources, Resources.Theme theme, int i) {
        A(i);
        TypedValue typedValue = new TypedValue();
        if (!theme.resolveAttribute(i, typedValue, true)) {
            return OptionalInt.empty();
        }
        if (typedValue.type < 28 || typedValue.type > 31) {
            if (typedValue.type == 3) {
                try {
                    return OptionalInt.of(gw.a(resources, typedValue.resourceId, theme));
                } catch (Resources.NotFoundException unused) {
                    return OptionalInt.empty();
                }
            }
            return OptionalInt.empty();
        }
        return OptionalInt.of(typedValue.data);
    }

    public static OptionalInt l(Context context, int i) {
        A(i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return OptionalInt.empty();
        }
        if (typedValue.type == 1) {
            return OptionalInt.of(typedValue.resourceId);
        }
        return OptionalInt.empty();
    }

    public static int m(Context context) {
        A(R.attr.ytThemeType);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.ytThemeType, typedValue, true)) {
            throw z(R.attr.ytThemeType);
        }
        if (typedValue.type < 16 || typedValue.type > 31) {
            throw new UnsupportedOperationException(String.format("Type of attribute is not an integer (attr = %d, value = %s)", Integer.valueOf((int) R.attr.ytThemeType), typedValue.coerceToString()));
        }
        return typedValue.data;
    }

    public static Context n(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, zfo.a);
            i = obtainAttributes.getResourceId(0, i);
            obtainAttributes.recycle();
        }
        return i > 0 ? new ContextThemeWrapper(context, i) : context;
    }

    public static final String o() {
        return UUID.randomUUID().toString();
    }

    public static String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String q(String str, String str2) {
        boolean z;
        zgh.m(str2);
        if (!babj.c(str) && !babj.c("%s")) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int indexOf = str.toString().indexOf("%s".toString(), i);
                if (indexOf == -1) {
                    break;
                }
                i2++;
                i = indexOf + "%s".length();
            }
            if (i2 == 1) {
                z = true;
                aqxo.p(z);
                return p(str, str2);
            }
        }
        z = false;
        aqxo.p(z);
        return p(str, str2);
    }

    public static int r(int i, int i2) {
        return i | (i2 << 6);
    }

    public static int s(int i) {
        return i & ((int) t(6));
    }

    static long t(int i) {
        return (1 << i) - 1;
    }

    static long u(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long v(int i) {
        return t(i >> 6);
    }

    public static long w(long j, int i) {
        return (j >> s(i)) & v(i);
    }

    public static long x(long j, int i, long j2, long j3, long j4) {
        return y(j, i, (u(j2, j3, (v(i) * j4) + j3) - j3) / j4);
    }

    public static long y(long j, int i, long j2) {
        int s = s(i);
        long v = v(i);
        return (j & ((v << s) ^ (-1))) | ((u(j2, 0L, v) & v) << s);
    }

    private static Resources.NotFoundException z(int i) {
        return new Resources.NotFoundException(String.format("Attribute not defined by theme (attr = %d)", Integer.valueOf(i)));
    }
}
