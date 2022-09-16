package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: atli  reason: default package */
/* loaded from: classes2.dex */
public final class atli implements atlm {
    private static final bvsw c;
    public final int a;
    @dzsi
    public final bvsx b;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    @dzsi
    private final TextPaint h;
    private final boolean i;
    private final int j;
    private final float k;
    private final float l;
    private final float m;
    @dzsi
    private final dxio<bvsl> n;
    @dzsi
    private final dowa o;
    private final boolean p;
    private final SpannableStringBuilder q;
    private final bvsw r;
    private final List<SpannableStringBuilder> s;
    private boolean t;
    private boolean u;

    static {
        bvsw bvswVar = new bvsw();
        bvswVar.c();
        c = bvswVar;
    }

    public atli(@dzsi Context context, int i, int i2, int i3, boolean z, @dzsi TextPaint textPaint, boolean z2, int i4, float f, float f2, float f3, int i5, @dzsi dxio<bvsl> dxioVar, @dzsi dowa dowaVar) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = textPaint;
        this.i = z2;
        this.j = i4;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.a = i5;
        this.n = dxioVar;
        this.o = dowaVar;
        boolean z3 = true;
        this.p = (i > i2 || i <= 1) ? false : z3;
        bvsw bvswVar = new bvsw();
        bvswVar.f(f2);
        bvswVar.e(i4);
        this.r = bvswVar;
        this.t = false;
        this.u = false;
        this.q = new SpannableStringBuilder();
        if (context != null) {
            this.b = new bvsx(context.getResources());
        } else {
            this.b = null;
        }
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        arrayList.add(new SpannableStringBuilder());
    }

    public static CharSequence l(bvsl bvslVar, int i, dowa dowaVar) {
        return bvslVar.h(i, dowaVar, c, null);
    }

    public static String m(atln atlnVar, amuo amuoVar) {
        atll g = atln.g(atlnVar.a, amuoVar, 3);
        atli atliVar = new atli(null, g.a.size(), 1, 0, true, null, true, 0, 1.0f, 1.0f, 1.0f, 0, null, null);
        atlnVar.d(g.a, g.c, false, null, atliVar);
        dcdc<CharSequence> k = atliVar.k();
        return k.isEmpty() ? "" : k.get(0).toString();
    }

    public static atli n(Context context, boolean z, int i, float f, float f2) {
        return new atli(context, 1, 1, -1, true, null, z, i, f, 1.0f, f2, 0, null, null);
    }

    public static Spannable o(Context context, bvsl bvslVar, int i, amuo amuoVar, dowa dowaVar) {
        Spanned spanned = amuoVar.p;
        if (i <= 0) {
            return p(context, amuoVar);
        }
        CharSequence l = l(bvslVar, i, dowaVar);
        bvsu c2 = new bvsx(context.getResources()).c(R.string.DA_NOTIFICATION_STEP_FORMAT);
        c2.a(l, spanned);
        Spannable c3 = c2.c();
        for (Object obj : c3.getSpans(0, c3.length(), amup.class)) {
            amup amupVar = (amup) obj;
            c3.setSpan(new StyleSpan(1), c3.getSpanStart(amupVar), c3.getSpanEnd(amupVar), 33);
            c3.removeSpan(amupVar);
        }
        return c3;
    }

    public static Spannable p(Context context, amuo amuoVar) {
        amfu a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(amuoVar.p);
        amfi qp = ((amfj) btsr.a(amfj.class)).qp();
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), amup.class)) {
            amup amupVar = (amup) obj;
            String e = amupVar.e();
            Drawable drawable = null;
            if (e != null && qp != null && (a = qp.a(e, String.valueOf(atln.class.getName()).concat("#formatCuesWithIcons()"), null)) != null && a.a() && a.b() == 3) {
                drawable = a.k(context);
            }
            if (drawable != null) {
                int spanStart = spannableStringBuilder.getSpanStart(amupVar);
                int spanEnd = spannableStringBuilder.getSpanEnd(amupVar);
                atli n = n(context, true, 0, 1.0f, 1.0f);
                atln.a(amupVar, n, drawable);
                spannableStringBuilder.replace(spanStart, spanEnd, n.k().get(0));
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), spannableStringBuilder.getSpanStart(amupVar), spannableStringBuilder.getSpanEnd(amupVar), 33);
            }
            spannableStringBuilder.removeSpan(amupVar);
        }
        return spannableStringBuilder;
    }

    private final void q(CharSequence charSequence, boolean z, boolean z2) {
        TextPaint textPaint;
        if (!this.u || !z2) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) dcft.s(this.s);
            int length = spannableStringBuilder.length();
            if (this.q.length() > 0) {
                spannableStringBuilder.append((CharSequence) this.q);
                this.q.clear();
            }
            spannableStringBuilder.append(charSequence);
            if (!this.p || !z || this.s.size() >= this.d) {
                if (!z2 || !this.t || (textPaint = this.h) == null || Layout.getDesiredWidth(spannableStringBuilder, textPaint) <= this.f) {
                    this.t |= z;
                    return;
                } else if (this.s.size() >= this.e) {
                    if (!this.g) {
                        spannableStringBuilder.delete(length, spannableStringBuilder.length());
                    }
                    this.u = true;
                    return;
                } else {
                    this.s.add(new SpannableStringBuilder());
                    this.t = false;
                    spannableStringBuilder.delete(length, spannableStringBuilder.length());
                    j(charSequence, z);
                    return;
                }
            }
            this.s.add(new SpannableStringBuilder());
            this.t = false;
        }
    }

    private final void r(String str, String str2, Drawable drawable) {
        if (this.b == null) {
            return;
        }
        Spannable j = bvsx.j(drawable, 1.2f, str);
        if (dbsj.d(str2)) {
            j(j, true);
            return;
        }
        bvsv a = this.b.a(str2);
        a.o(this.m);
        if (this.i) {
            a.i();
        }
        bvsv a2 = this.b.a(j);
        a2.g(" ");
        a2.f(a);
        j(a2.c(), true);
    }

    private static void s(Spannable spannable, int i, int i2, int i3, float f) {
        spannable.setSpan(new RelativeSizeSpan(f), i, i2, 33);
        spannable.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    @Override // defpackage.atlm
    public final void a(@dzsi String str, String str2, @dzsi String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!dbsj.d(str)) {
            spannableStringBuilder.append((CharSequence) str);
            s(spannableStringBuilder, 0, spannableStringBuilder.length(), this.j, this.k);
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        if (this.i) {
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        }
        int length2 = spannableStringBuilder.length();
        if (!dbsj.d(str3)) {
            spannableStringBuilder.append((CharSequence) str3);
            s(spannableStringBuilder, length2, spannableStringBuilder.length(), this.j, this.k);
        }
        j(spannableStringBuilder, true);
    }

    @Override // defpackage.atlm
    public final void b(@dzsi String str, String str2, @dzsi String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!dbsj.d(str)) {
            spannableStringBuilder.append((CharSequence) str);
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        if (this.i) {
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        }
        if (!dbsj.d(str3)) {
            spannableStringBuilder.append((CharSequence) str3);
        }
        j(spannableStringBuilder, true);
    }

    @Override // defpackage.atlm
    public final void c(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        s(spannableStringBuilder, 0, spannableStringBuilder.length(), this.j, this.l);
        q(spannableStringBuilder, false, false);
    }

    @Override // defpackage.atlm
    public final void d(String str) {
        j(str, false);
    }

    @Override // defpackage.atlm
    public final void e(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(this.l), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.j), 0, spannableStringBuilder.length(), 33);
        j(spannableStringBuilder, false);
    }

    @Override // defpackage.atlm
    public final void f(int i) {
        dxio<bvsl> dxioVar = this.n;
        if (dxioVar == null || this.o == null) {
            return;
        }
        j(dxioVar.a().h(i, this.o, this.i ? c : null, this.r), true);
    }

    @Override // defpackage.atlm
    public final void g(String str) {
        if (this.p) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!str.trim().isEmpty()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.j), 0, spannableStringBuilder.length(), 33);
        }
        this.q.append((CharSequence) spannableStringBuilder);
    }

    @Override // defpackage.atlm
    public final void h(String str, String str2, Drawable drawable) {
        r(str, str2, drawable);
    }

    @Override // defpackage.atlm
    public final void i(String str, String str2, Drawable drawable) {
        r(str, str2, drawable);
    }

    public final void j(CharSequence charSequence, boolean z) {
        q(charSequence, z, true);
    }

    public final dcdc<CharSequence> k() {
        return dcdc.r(this.s);
    }
}
