package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: een  reason: default package */
/* loaded from: classes6.dex */
final class een implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ eeo a;

    public een(eeo eeoVar) {
        this.a = eeoVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.d.execute(new Runnable(this) { // from class: eem
            private final een a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c.f(ckoi.MAP, bvjz.c(null, durz.EIT_MAIN));
            }
        });
        this.a.j().getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
