package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.ScaleXSpan;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajvi  reason: default package */
/* loaded from: classes.dex */
public final class ajvi extends ajvo {
    private final ajxz f;

    public ajvi(Context context, ajxz ajxzVar, ajvm ajvmVar, boolean z, ajvp ajvpVar, boolean z2) {
        super(context, ajvmVar, z, ajvpVar, z2);
        ajxzVar.getClass();
        this.f = ajxzVar;
    }

    private final void h(String str, StringBuilder sb) {
        if (!this.c || sb == null) {
            return;
        }
        sb.append(str);
    }

    public final void a(String str, avhn avhnVar, float f, Object obj, int i, SpannableStringBuilder spannableStringBuilder, StringBuilder sb) {
        f(obj, i, spannableStringBuilder);
        ajvg ajvgVar = new ajvg();
        ajvgVar.a = obj;
        ajvgVar.b = i;
        int length = spannableStringBuilder.length();
        ajvgVar.c = length;
        ajvgVar.d = length + str.length();
        ajvgVar.e = f;
        spannableStringBuilder.append((CharSequence) str);
        h(c(avhnVar), sb);
        h(" ", sb);
        this.e.a(ajvgVar, avhnVar, Math.round(f), this);
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, StringBuilder sb, List list, float f, Object obj, int i, boolean z) {
        Object imageSpan;
        f(obj, i, spannableStringBuilder);
        if (list == null || list.size() <= 0) {
            return;
        }
        float dimension = this.a.getResources().getDimension(R.dimen.badge_height);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajvh ajvhVar = (ajvh) it.next();
            if (!z || (ajvhVar.b != arhr.VERIFIED && ajvhVar.b != arhr.OWNER)) {
                if (f != 0.0f) {
                    spannableStringBuilder.append(" ");
                    if (f != 1.0f) {
                        spannableStringBuilder.setSpan(new ScaleXSpan(f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                }
                avhn avhnVar = ajvhVar.a;
                if (avhnVar != null) {
                    a(" ", avhnVar, dimension, obj, i, spannableStringBuilder, sb);
                } else if (ajvhVar.b != arhr.UNKNOWN) {
                    int a = this.f.a(ajvhVar.b);
                    if (a != 0) {
                        Drawable mutate = akf.a(this.a, a).mutate();
                        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        Integer num = ajvhVar.d;
                        if (num != null) {
                            mutate.setTint(num.intValue());
                        }
                        if (this.b) {
                            imageSpan = new ajvn(mutate);
                        } else {
                            imageSpan = new ImageSpan(mutate);
                        }
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    if (!TextUtils.isEmpty(ajvhVar.c)) {
                        h(ajvhVar.c, sb);
                        h(" ", sb);
                    }
                }
            }
        }
    }
}
