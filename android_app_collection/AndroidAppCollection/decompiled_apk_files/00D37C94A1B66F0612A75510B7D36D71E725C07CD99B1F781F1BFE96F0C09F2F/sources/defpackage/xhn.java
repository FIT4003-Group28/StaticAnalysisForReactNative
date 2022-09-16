package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xhn  reason: default package */
/* loaded from: classes4.dex */
public final class xhn {
    public final Context a;
    public final ImageView b;
    public final AdCountdownTextView c;
    public final xhv d;
    public final ColorDrawable e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public xhw p;
    private final Resources q;
    private final int r;

    public xhn(Context context, Resources resources, ImageView imageView, AdCountdownTextView adCountdownTextView, float f) {
        this.a = context;
        this.q = resources;
        this.b = imageView;
        this.c = adCountdownTextView;
        ColorDrawable colorDrawable = (ColorDrawable) adCountdownTextView.getBackground();
        this.e = colorDrawable;
        this.f = colorDrawable.getColor();
        this.g = ake.d(context, R.color.skip_ad_button_inverted_background_color);
        int currentTextColor = adCountdownTextView.getCurrentTextColor();
        this.h = currentTextColor;
        this.i = ake.d(context, R.color.skip_ad_button_inverted_foreground_color);
        this.d = new xhv(adCountdownTextView, adCountdownTextView.getText(), currentTextColor, adCountdownTextView.getTextSize(), colorDrawable, f);
        this.k = adCountdownTextView.getPaddingRight();
        this.j = adCountdownTextView.getPaddingLeft();
        this.l = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_width);
        this.m = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_height);
        this.n = adCountdownTextView.a;
        this.o = resources.getInteger(17694720);
        this.r = resources.getInteger(17694722);
    }

    public final void a() {
        lj.q(this.c).a();
    }

    public final void b() {
        this.c.setAlpha(1.0f);
        ln q = lj.q(this.c);
        q.c(0.0f);
        q.d(this.r);
        q.g(5000L);
        q.f(new xhl(this));
    }

    public final void d(int i, int i2) {
        xhv xhvVar = this.d;
        Integer valueOf = Integer.valueOf((i2 + 999) / 1000);
        xhvVar.d(valueOf);
        this.d.a = this.q.getString(i, valueOf);
        this.d.a();
    }

    public final void c(apaq apaqVar) {
        aoyu aoyuVar;
        xhw xhwVar = this.p;
        if (apaqVar == null) {
            aoyuVar = null;
        } else {
            aoyuVar = apaqVar.f;
            if (aoyuVar == null) {
                aoyuVar = aoyu.a;
            }
        }
        xhwVar.c(aoyuVar);
        this.d.b(apaqVar);
        this.d.a();
        this.p.a();
        int i = this.c.getLayoutParams().width;
        int i2 = this.b.getLayoutParams().width;
        if (i != i2) {
            int max = Math.max(i, i2);
            this.c.getLayoutParams().width = max;
            this.b.getLayoutParams().width = max;
        }
    }
}
