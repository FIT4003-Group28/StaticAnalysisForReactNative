package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.media.AudioAttributesCompat;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: hx  reason: default package */
/* loaded from: classes3.dex */
public final class hx {
    public hx(int i) {
        aqu aquVar;
        int i2 = AudioAttributesCompat.b;
        if (Build.VERSION.SDK_INT >= 26) {
            aquVar = new aqv();
        } else {
            aquVar = new aqu();
        }
        aquVar.a.setLegacyStreamType(i);
        new AudioAttributesCompat(aquVar.a());
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (aao.a != null && aao.a.c == view) {
            aao.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (aao.b != null && aao.b.c == view) {
                aao.b.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new aao(view, charSequence);
    }

    public static int b(yl ylVar, xd xdVar, View view, View view2, xw xwVar, boolean z) {
        if (xwVar.aq() == 0 || ylVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(xw.bm(view) - xw.bm(view2)) + 1;
        }
        return Math.min(xdVar.k(), xdVar.a(view2) - xdVar.d(view));
    }

    public static int c(yl ylVar, xd xdVar, View view, View view2, xw xwVar, boolean z, boolean z2) {
        int max;
        if (xwVar.aq() == 0 || ylVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(xw.bm(view), xw.bm(view2));
        int max2 = Math.max(xw.bm(view), xw.bm(view2));
        if (z2) {
            max = Math.max(0, (ylVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        return !z ? max : Math.round((max * (Math.abs(xdVar.a(view2) - xdVar.d(view)) / (Math.abs(xw.bm(view) - xw.bm(view2)) + 1))) + (xdVar.j() - xdVar.d(view)));
    }

    public static int d(yl ylVar, xd xdVar, View view, View view2, xw xwVar, boolean z) {
        if (xwVar.aq() == 0 || ylVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return ylVar.a();
        }
        return (int) (((xdVar.a(view2) - xdVar.d(view)) / (Math.abs(xw.bm(view) - xw.bm(view2)) + 1)) * ylVar.a());
    }

    public static int e(Layout layout) {
        if (layout == null) {
            return 0;
        }
        return layout.getHeight();
    }

    public static TextDirectionHeuristic f(alk alkVar) {
        return alkVar == alq.a ? TextDirectionHeuristics.LTR : alkVar == alq.b ? TextDirectionHeuristics.RTL : alkVar == alq.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : alkVar == alq.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : alkVar == alq.e ? TextDirectionHeuristics.ANYRTL_LTR : alkVar == alq.f ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static StaticLayout g(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, alk alkVar) {
        try {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, f(alkVar), f, f2, z, truncateAt, i3, i4);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, f(alkVar), f, f2, z, truncateAt, i3, i4);
            }
            throw e;
        }
    }

    public static StaticLayout h(CharSequence charSequence, int i, TextPaint textPaint, int i2, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i3, int i4, alk alkVar) {
        try {
            return g(charSequence, i, textPaint, i2, alignment, f, f2, z, truncateAt, i3, i4, alkVar);
        } catch (LinkageError unused) {
            return new StaticLayout(charSequence, 0, i, textPaint, i2, alignment, f, f2, z, truncateAt, i3);
        }
    }

    public static int i(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException();
            }
        }
        return 0;
    }

    public static String j(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return null;
    }

    public static byte[] k(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return null;
    }

    public hx() {
    }
}
