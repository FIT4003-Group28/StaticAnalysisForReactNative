package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbxt  reason: default package */
/* loaded from: classes3.dex */
final class bbxt extends cqtd {
    public bbxt(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getResources().getColor(R.color.qu_google_blue_500));
        gradientDrawable.setShape(1);
        int round = Math.round(context.getResources().getDisplayMetrics().density * 24.0f);
        gradientDrawable.setSize(round, round);
        return gradientDrawable;
    }
}
