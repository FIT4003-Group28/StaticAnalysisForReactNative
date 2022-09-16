package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: fxw  reason: default package */
/* loaded from: classes3.dex */
public final class fxw implements fyi {
    private final int a;
    private final int b;
    private final int c;
    private final View d;
    private final fyh e;
    private int f;

    public fxw(Context context, View view, fyh fyhVar) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = zew.i(displayMetrics, 16);
        this.b = zew.i(displayMetrics, 80);
        this.c = zew.i(displayMetrics, 640);
        this.d = view;
        this.e = fyhVar;
    }

    @Override // defpackage.fyi
    public final void a(View view, int i) {
        int i2;
        this.f += i;
        if (!view.canScrollVertically(-1) || (i2 = this.f) < (-this.c)) {
            this.e.g();
            this.f = 0;
        } else if (i2 <= this.b) {
        } else {
            this.e.c(true);
            this.f = 0;
        }
    }

    @Override // defpackage.fyi
    public final void b() {
        this.d.setTranslationY(0.0f);
        this.d.setTranslationX(0.0f);
        this.f = 0;
    }

    @Override // defpackage.fyi
    public final void c(int i) {
        zgd.t(this.d, zgd.b(zgd.l(0), zgd.k(this.a), zgd.e(i + this.a), zgd.g(8388693)), FrameLayout.LayoutParams.class);
    }

    @Override // defpackage.fyi
    public final void d() {
        this.f = 0;
    }
}
