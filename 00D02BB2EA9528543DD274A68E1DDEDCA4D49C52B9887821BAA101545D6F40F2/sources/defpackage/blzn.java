package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: blzn  reason: default package */
/* loaded from: classes3.dex */
public final class blzn {
    @dzsi
    public static cqfc a(Activity activity, blzm blzmVar) {
        blzm blzmVar2 = blzm.NONE;
        int ordinal = blzmVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return new blzk(activity);
            }
            if (ordinal == 3) {
                return new blzj();
            }
            return null;
        }
        return new blzh();
    }

    @dzsi
    public static cqtd b(dgkm dgkmVar, @dzsi cqss cqssVar) {
        int i;
        blzm blzmVar = blzm.NONE;
        int a = dgkj.a(dgkmVar.e);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 2) {
            i = 2131231586;
        } else if (i2 == 3) {
            i = 2131231584;
        } else if (i2 != 4) {
            return null;
        } else {
            i = 2131231585;
        }
        if (cqssVar != null) {
            return cqrt.g(i, cqssVar);
        }
        return cqrt.f(i);
    }

    public static Float c(Context context, float f) {
        int e = cqsz.c().e(context);
        float e2 = cqsg.i(cqsg.f(cqsz.c(), Float.valueOf(0.8f)), cqrp.d(238.0d), cqrp.d(420.0d)).e(context);
        return Float.valueOf(((e2 + ((e - e2) / 4.0f)) * bvox.e(bvox.b(context))) + (f / 5.0f));
    }

    public static void d(Context context, View view, boolean z) {
        boolean z2;
        float f;
        View d = cqkx.d(view, bltv.a);
        View d2 = cqkx.d(view, bltv.b);
        View d3 = cqkx.d(view, bltv.c);
        View d4 = cqkx.d(view, bltv.e);
        View d5 = cqkx.d(view, bltv.f);
        View d6 = cqkx.d(view, bltv.g);
        View d7 = cqkx.d(view, bltv.h);
        View d8 = cqkx.d(view, bltv.d);
        View d9 = cqkx.d(view, blsw.a);
        View d10 = cqkx.d(view, blsw.b);
        View d11 = cqkx.d(view, blsw.c);
        View d12 = cqkx.d(view, bltv.i);
        view.setAlpha(1.0f);
        if (d2 == null || d3 == null || d == null) {
            z2 = z;
        } else {
            d2.setTranslationY(z ? d3.getHeight() / 2 : 0.0f);
            d.setTranslationY(z ? d3.getHeight() / 2 : 0.0f);
            int height = d3.getHeight();
            if (d3.getHeight() > d2.getHeight()) {
                float height2 = d2.getHeight() / d3.getHeight();
                if (true != z) {
                    height2 = 1.0f;
                }
                d3.setScaleY(height2);
                height = d2.getHeight();
            }
            if (z) {
                f = (-height) / 2;
                z2 = true;
            } else {
                z2 = false;
                f = 0.0f;
            }
            d3.setTranslationY(f);
        }
        if (d6 != null) {
            d6.setAlpha(1.0f);
            ((TextView) d6).setMaxLines(1);
        }
        if (d7 != null) {
            d7.setAlpha(0.0f);
            ((TextView) d7).setMaxHeight(0);
        }
        g(context, d4, z2, 1.22f);
        g(context, d5, z2, 1.17f);
        f(context, d8, z2, 25);
        f(context, d9, z2, 20);
        f(context, d10, z2, 20);
        f(context, d11, z2, 20);
        if (d12 != null) {
            d12.setAlpha(true != z2 ? 1.0f : 0.0f);
        }
    }

    public static cqfc e() {
        return new blzl();
    }

    private static void f(Context context, @dzsi View view, boolean z, int i) {
        if (view != null) {
            float f = 0.0f;
            view.setTranslationY(z ? cqrp.d(i).NR(context) : 0.0f);
            if (true != z) {
                f = 1.0f;
            }
            view.setAlpha(f);
        }
    }

    private static void g(Context context, @dzsi View view, boolean z, float f) {
        if (view != null) {
            view.setTranslationY(z ? cqrp.d(10.0d).NR(context) : 0.0f);
            if (true != z) {
                f = 1.0f;
            }
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }
}
