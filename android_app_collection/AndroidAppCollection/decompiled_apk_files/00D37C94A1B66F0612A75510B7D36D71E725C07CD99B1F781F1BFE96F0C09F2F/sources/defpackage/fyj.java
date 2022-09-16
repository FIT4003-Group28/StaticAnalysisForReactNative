package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: fyj  reason: default package */
/* loaded from: classes3.dex */
public final class fyj implements fyi, zan {
    protected final View a;
    protected View b = null;
    private final zao c;
    private final fyh d;

    public fyj(View view, View view2, fyh fyhVar) {
        this.a = view;
        zao zaoVar = new zao(view2);
        this.c = zaoVar;
        this.d = fyhVar;
        zaoVar.c = this;
    }

    @Override // defpackage.fyi
    public final void a(View view, int i) {
    }

    @Override // defpackage.fyi
    public final void b() {
        this.a.setTranslationY(0.0f);
        this.a.setTranslationX(0.0f);
        View view = this.a;
        view.setTranslationY(-view.getHeight());
    }

    @Override // defpackage.fyi
    public final void c(int i) {
        zgd.t(this.a, zgd.b(zgd.l(0), zgd.k(0), zgd.p(0), zgd.g(51)), FrameLayout.LayoutParams.class);
    }

    @Override // defpackage.fyi
    public final void d() {
    }

    public final void f(View view) {
        this.b = view;
        this.c.c(view);
    }

    @Override // defpackage.zan
    public final void sa(zaj zajVar) {
        View view = this.b;
        if (view == null) {
            return;
        }
        Rect rect = zajVar.a;
        if (!zajVar.e() || (rect.left <= 0 && rect.top <= 0)) {
            this.d.c(true);
            return;
        }
        Rect rect2 = zajVar.a;
        if (lj.e(view) == 1) {
            this.a.setTranslationX(rect2.right - this.a.getWidth());
        } else {
            this.a.setTranslationX(rect2.left);
        }
        this.a.setTranslationY(rect2.top);
        this.d.g();
    }
}
