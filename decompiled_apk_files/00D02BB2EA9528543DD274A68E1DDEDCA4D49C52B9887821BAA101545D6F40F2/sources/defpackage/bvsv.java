package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
/* compiled from: PG */
/* renamed from: bvsv  reason: default package */
/* loaded from: classes4.dex */
public class bvsv {
    Object a;
    ClickableSpan c;
    final /* synthetic */ bvsx e;
    int d = 1;
    bvsw b = new bvsw();

    public bvsv(bvsx bvsxVar, Object obj) {
        this.e = bvsxVar;
        this.a = obj;
    }

    public final Spannable c() {
        return d("%s");
    }

    public final SpannableStringBuilder d(String str) {
        SpannableStringBuilder spannableStringBuilder;
        Object obj = this.a;
        if (obj instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) obj;
        } else {
            if (str.equals("%s")) {
                Object obj2 = this.a;
                if (obj2 instanceof CharSequence) {
                    spannableStringBuilder = new SpannableStringBuilder((CharSequence) obj2);
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(String.format(str, this.a));
        }
        this.b.a(spannableStringBuilder, this.d, 0, spannableStringBuilder.length());
        this.b.a.clear();
        ClickableSpan clickableSpan = this.c;
        if (clickableSpan != null) {
            spannableStringBuilder.setSpan(clickableSpan, 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void e(bvsw bvswVar) {
        bvsw bvswVar2 = this.b;
        bvswVar2.b(bvswVar);
        this.b = bvswVar2;
    }

    public final void f(bvsv bvsvVar) {
        SpannableStringBuilder d = d("%s");
        d.append((CharSequence) bvsvVar.c());
        this.a = d;
    }

    public final void g(CharSequence charSequence) {
        SpannableStringBuilder d = d("%s");
        d.append(charSequence);
        this.a = d;
    }

    public final void h(int i) {
        bvsw bvswVar = this.b;
        bvswVar.a.add(new BackgroundColorSpan(i));
        this.b = bvswVar;
    }

    public final void i() {
        bvsw bvswVar = this.b;
        bvswVar.c();
        this.b = bvswVar;
    }

    public final void j(CharacterStyle characterStyle) {
        bvsw bvswVar = this.b;
        bvswVar.d(characterStyle);
        this.b = bvswVar;
    }

    public final void k(ClickableSpan clickableSpan) {
        dbsk.m(this.c == null, "Cannot add multiple click listeners to the same span.");
        this.c = clickableSpan;
    }

    public final void l(int i) {
        bvsw bvswVar = this.b;
        bvswVar.e(i);
        this.b = bvswVar;
    }

    public final void m(int i) {
        bvsw bvswVar = this.b;
        bvswVar.e(this.e.a.getColor(i));
        this.b = bvswVar;
    }

    public final void n() {
        bvsw bvswVar = this.b;
        bvswVar.a.add(new StyleSpan(2));
        this.b = bvswVar;
    }

    public final void o(float f) {
        bvsw bvswVar = this.b;
        bvswVar.f(f);
        this.b = bvswVar;
    }

    public final void p() {
        bvsw bvswVar = this.b;
        bvswVar.a.add(new UnderlineSpan());
        this.b = bvswVar;
    }
}
