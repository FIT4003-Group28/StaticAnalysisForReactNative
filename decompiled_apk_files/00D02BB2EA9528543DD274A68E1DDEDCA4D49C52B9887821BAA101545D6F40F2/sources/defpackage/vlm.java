package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vlm  reason: default package */
/* loaded from: classes7.dex */
public final class vlm {
    private static final long c = TimeUnit.SECONDS.toMillis(5);
    public boolean a;
    private final View d;
    private final RecyclerView e;
    private boolean f = true;
    public boolean b = true;
    private final Runnable g = new vlk(this);
    private final abx h = new vll(this);

    public vlm(View view, RecyclerView recyclerView) {
        this.d = view;
        this.e = recyclerView;
    }

    public final void a(boolean z) {
        if (z != this.a) {
            this.a = z;
            if (z) {
                this.f = false;
                c();
                this.e.i(this.h);
                return;
            }
            this.e.j(this.h);
            this.d.clearAnimation();
            this.d.setTranslationY(0.0f);
        }
    }

    public final boolean b() {
        return !this.e.canScrollVertically(1);
    }

    public final void c() {
        boolean z = !b();
        if (!this.f) {
            this.f = true;
            this.b = z;
            this.d.animate().translationY(0.0f).setStartDelay(0L).withEndAction(z ? this.g : deic.a);
            return;
        }
        this.b = false;
        if (!z) {
            return;
        }
        d(true);
    }

    public final void d(boolean z) {
        if (!this.f || this.b) {
            return;
        }
        this.f = false;
        this.d.animate().translationY(this.d.getHeight()).setStartDelay(z ? c : 0L).withEndAction(deic.a);
    }
}
