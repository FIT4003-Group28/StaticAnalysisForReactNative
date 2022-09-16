package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajrf  reason: default package */
/* loaded from: classes.dex */
public final class ajrf implements ajru {
    public final View a;
    public final DisplayMetrics b;
    private final int c;
    private final int d;

    public ajrf(Context context) {
        View view = new View(context);
        this.a = view;
        view.setImportantForAccessibility(2);
        this.b = context.getResources().getDisplayMetrics();
        this.c = zhn.j(context, R.attr.ytSeparator).orElse(0);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.default_line_separator_height);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(ajre ajreVar) {
        int intValue = ((Integer) ajreVar.a.b(new ajrd(this, 2)).e(Integer.valueOf(this.d))).intValue();
        int intValue2 = ((Integer) ajreVar.b.b(new ajrd(this, 1)).e(0)).intValue();
        int intValue3 = ((Integer) ajreVar.c.b(new ajrd(this)).e(0)).intValue();
        this.a.setMinimumHeight(intValue + intValue2 + intValue3);
        this.a.setBackground(new InsetDrawable((Drawable) new ColorDrawable(this.c), this.a.getPaddingLeft(), intValue2, this.a.getPaddingRight(), intValue3));
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((ajre) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
