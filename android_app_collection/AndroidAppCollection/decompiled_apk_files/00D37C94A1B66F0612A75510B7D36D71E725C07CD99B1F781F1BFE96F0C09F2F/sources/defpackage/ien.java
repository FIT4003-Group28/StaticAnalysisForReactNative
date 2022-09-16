package defpackage;

import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: ien  reason: default package */
/* loaded from: classes3.dex */
public final class ien {
    public View a;
    public View b;
    public View c;
    public View d;
    public TextView e;
    private boolean f;

    public final void a(boolean z) {
        boolean z2 = !z;
        this.f = z2;
        if (z2) {
            c();
        }
    }

    public final void b() {
        c();
        zag.o(this.c, false);
        zag.o(this.b, false);
        this.d.setOnClickListener(null);
        this.d.setClickable(false);
    }

    public final void c() {
        this.a.clearAnimation();
        zag.o(this.a, false);
    }

    public final void d(String str, Runnable runnable) {
        str.getClass();
        c();
        this.e.setText(str);
        boolean z = true;
        zag.o(this.c, true);
        zag.o(this.b, true);
        View view = this.d;
        if (runnable == null) {
            z = false;
        }
        zag.o(view, z);
        if (runnable != null) {
            this.d.setOnClickListener(new iem(runnable));
        }
        hqs.f(this.c);
        hqs.f(this.b);
    }

    public final void e() {
        if (this.f) {
            return;
        }
        hqs.e(this.a, 1500L);
        zag.o(this.b, false);
        this.b.setOnClickListener(null);
        this.b.setClickable(false);
    }
}
