package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bvsx  reason: default package */
/* loaded from: classes.dex */
public class bvsx {
    public static final Pattern b = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");
    public final Resources a;

    public bvsx(Resources resources) {
        this.a = resources;
    }

    public static Spannable g(Drawable drawable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.setSpan(new bvst(drawable), 0, 1, 33);
        return spannableStringBuilder;
    }

    public static final Spannable h(bvsr bvsrVar, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(bvsrVar, 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static final Spannable i(Drawable drawable, float f, float f2, String str) {
        return h(new bvsr(drawable, f, f2), str);
    }

    public static final Spannable j(Drawable drawable, float f, String str) {
        return h(new bvsr(drawable, f), str);
    }

    public final bvsv a(Object obj) {
        return new bvsv(this, obj);
    }

    public final bvsu b(CharSequence charSequence) {
        return new bvsu(this, charSequence);
    }

    public final bvsu c(int i) {
        return new bvsu(this, this.a.getString(i));
    }

    public final bvsu d(int i, int i2) {
        return new bvsu(this, this.a.getQuantityString(i, i2));
    }

    public final Spannable e(Drawable drawable, float f) {
        return j(drawable, f, " ");
    }

    public final Spannable f(Drawable drawable, float f, float f2) {
        return i(drawable, f, f2, " ");
    }
}
