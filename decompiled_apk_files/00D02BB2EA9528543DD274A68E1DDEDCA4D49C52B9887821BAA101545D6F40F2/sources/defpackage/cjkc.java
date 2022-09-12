package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cjkc  reason: default package */
/* loaded from: classes4.dex */
public final class cjkc implements ViewTreeObserver.OnPreDrawListener {
    private boolean a;
    private boolean b;
    private final cjkb c;
    private final View d;
    private final int e;
    private final dzve<Rect, dztc> f;

    /* JADX WARN: Multi-variable type inference failed */
    public cjkc(View view, int i, dzve<? super Rect, dztc> dzveVar) {
        dzvx.c(view, "view");
        this.d = view;
        this.e = i;
        this.f = dzveVar;
        this.a = true;
        this.c = new cjkb();
        view.getViewTreeObserver().addOnPreDrawListener(this);
        b();
    }

    public final void a() {
        if (this.a) {
            ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
            dzvx.b(viewTreeObserver, "view.viewTreeObserver");
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            this.a = false;
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        return true;
    }

    private final void b() {
        int i = this.e;
        View findViewById = i == 0 ? this.d : this.d.findViewById(i);
        if (findViewById != null) {
            Rect rect = null;
            if (findViewById.isShown()) {
                cjkb cjkbVar = this.c;
                int[] iArr = cjkbVar.a;
                findViewById.getLocationOnScreen(iArr);
                Rect rect2 = cjkbVar.c;
                int i2 = iArr[0];
                rect2.set(i2, iArr[1], findViewById.getWidth() + i2, iArr[1] + findViewById.getHeight());
                if (!dzvx.d(cjkbVar.c, cjkbVar.b)) {
                    rect = cjkbVar.c;
                    cjkbVar.b.set(rect);
                }
                if (rect != null) {
                    this.f.a(rect);
                }
            } else if (this.b) {
                a();
                this.f.a(null);
            }
            this.b = findViewById.isShown();
        }
    }
}
