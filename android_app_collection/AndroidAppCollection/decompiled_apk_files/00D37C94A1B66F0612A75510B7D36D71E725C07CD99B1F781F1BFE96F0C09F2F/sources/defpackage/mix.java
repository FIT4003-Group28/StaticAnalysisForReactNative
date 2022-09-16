package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: mix  reason: default package */
/* loaded from: classes3.dex */
public final class mix {
    public static boolean a(aacz aaczVar) {
        String ai = eog.ai(aaczVar);
        return ai != null && (ai.equals("small_div_space") || ai.equals("big_div_space"));
    }

    public static boolean b(aacz aaczVar) {
        String ai = eog.ai(aaczVar);
        return ai != null && (ai.equals("small_divider_exp") || ai.equals("small_div_space"));
    }

    public static boolean c(aacz aaczVar) {
        String ai = eog.ai(aaczVar);
        return ai != null && ai.equals("small_div_space");
    }

    public static boolean d(aacz aaczVar) {
        String ai = eog.ai(aaczVar);
        if (ai != null) {
            return ai.equals("small_divider_exp") || ai.equals("small_div_space") || ai.equals("big_divider_exp") || ai.equals("big_div_space");
        }
        return false;
    }

    public static ampq e(Context context, asxl asxlVar, int i, int i2) {
        int k;
        asxk asxkVar = asxlVar.d;
        if (asxkVar == null) {
            asxkVar = asxk.a;
        }
        int ab = almu.ab(asxlVar.c);
        if (ab != 0 && ab == 4) {
            float f = asxkVar.c;
            if (f > 0.0f && f < 1.0f) {
                asxk asxkVar2 = asxlVar.d;
                if (asxkVar2 == null) {
                    asxkVar2 = asxk.a;
                }
                if ((asxkVar2.b & 2) != 0) {
                    float f2 = asxkVar2.d;
                    if (f2 > 0.0f) {
                        k = (int) f2;
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        return ampq.j(Integer.valueOf(Math.min((int) (((zew.i(displayMetrics, zew.k(context)) - i) - i2) * asxkVar2.c), zew.i(displayMetrics, k))));
                    }
                }
                k = zew.k(context);
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                return ampq.j(Integer.valueOf(Math.min((int) (((zew.i(displayMetrics2, zew.k(context)) - i) - i2) * asxkVar2.c), zew.i(displayMetrics2, k))));
            }
        }
        return amon.a;
    }

    public static final Class[] f(mcp mcpVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                mcpVar.m((isw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{isw.class};
    }
}
