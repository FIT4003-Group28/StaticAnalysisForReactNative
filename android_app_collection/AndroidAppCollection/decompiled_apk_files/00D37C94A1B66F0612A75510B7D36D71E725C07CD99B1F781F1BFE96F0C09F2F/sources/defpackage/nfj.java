package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: nfj  reason: default package */
/* loaded from: classes3.dex */
public final class nfj {
    public static boolean a(Context context) {
        AccessibilityManager a = zdg.a(context);
        return a != null && a.isEnabled();
    }

    public static auie[] b(List list) {
        auie[] auieVarArr = new auie[list.size()];
        for (int i = 0; i < list.size(); i++) {
            auieVarArr[i] = (auie) list.get(i);
        }
        return auieVarArr;
    }

    public static auif[] c(List list) {
        auif[] auifVarArr = new auif[list.size()];
        for (int i = 0; i < list.size(); i++) {
            auifVarArr[i] = (auif) list.get(i);
        }
        return auifVarArr;
    }

    public static void e(TextView textView, RatingBar ratingBar, float f, int i, int i2) {
        if (textView == null || ratingBar == null) {
            return;
        }
        if (f <= 0.0f) {
            textView.setVisibility(8);
            ratingBar.setVisibility(8);
            return;
        }
        if (f > 5.0f) {
            f = 5.0f;
        }
        textView.setText(String.format(Locale.getDefault(), "%1.1f", Float.valueOf(f)));
        textView.setVisibility(0);
        String valueOf = String.valueOf(textView.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append(valueOf);
        sb.append(" stars");
        textView.setContentDescription(sb.toString());
        textView.setTextColor(i);
        ratingBar.setRating(f);
        ratingBar.setVisibility(0);
        ((LayerDrawable) ratingBar.getProgressDrawable()).getDrawable(2).setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
    }

    public static void f(TextView textView, Spanned spanned) {
        if (textView != null) {
            zag.m(textView, spanned);
        }
    }

    public static boolean h(boolean z) {
        return !z;
    }

    public static View i(View view, ViewGroup viewGroup, String str, String str2, boolean z, Context context, int i) {
        TextView k = k(view, viewGroup, context, i);
        ViewGroup.LayoutParams layoutParams = k.getLayoutParams();
        layoutParams.height = -2;
        k.setLayoutParams(layoutParams);
        k.setSingleLine(false);
        l(k, str, str2);
        m(k, z, false, context);
        return k;
    }

    public static View j(View view, ViewGroup viewGroup, String str, String str2, boolean z, boolean z2, Context context, int i) {
        TextView k = k(view, viewGroup, context, i);
        k.setSingleLine(false);
        l(k, str, str2);
        m(k, z, z2, context);
        return k;
    }

    private static TextView k(View view, ViewGroup viewGroup, Context context, int i) {
        LayoutInflater from = LayoutInflater.from(context);
        if (view == null) {
            return (TextView) from.inflate(i, viewGroup, false);
        }
        return (TextView) view;
    }

    private static void l(TextView textView, String str, String str2) {
        if (true == str.isEmpty()) {
            str = str2;
        }
        textView.setText(str);
    }

    private static void m(TextView textView, boolean z, boolean z2, Context context) {
        int d;
        if (!z) {
            d = zhn.d(context, R.attr.adText1);
        } else if (z2) {
            d = zhn.d(context, R.attr.ytTextSecondaryInverse);
        } else {
            d = zhn.d(context, R.attr.adText2);
        }
        textView.setTextColor(d);
    }

    public static void d(boolean z, final ggz ggzVar, aafo aafoVar, ajrs ajrsVar, final mcj mcjVar, mxt mxtVar, apzg apzgVar) {
        if (!z || ggzVar == null || aafoVar == null || ajrsVar == null || mcjVar == null) {
            mxtVar.q(apzgVar);
        } else if (mcjVar.b(ggzVar, aafoVar, ajrsVar.a, ajrsVar.e(), new ajrn() { // from class: mwu
            @Override // defpackage.ajrn
            public final void oq(Map map) {
                mcj.this.a(ggzVar, map);
            }
        })) {
        } else {
            mxtVar.q(apzgVar);
        }
    }

    public static void g(ImageView imageView, avhn avhnVar, ajmy ajmyVar) {
        if (imageView == null || avhnVar == null) {
            imageView.setVisibility(8);
            return;
        }
        ajmyVar.h(imageView, avhnVar);
        imageView.setVisibility(0);
    }
}
