package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
/* compiled from: PG */
/* renamed from: cpxt  reason: default package */
/* loaded from: classes5.dex */
final class cpxt {
    public final Window a;
    public dbsg<Integer> b = dbpy.a;
    final /* synthetic */ cpxu c;

    public cpxt(cpxu cpxuVar, Window window) {
        this.c = cpxuVar;
        this.a = window;
    }

    public final void a(final int i) {
        this.c.b.a();
        if (!this.c.b.a()) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this, i) { // from class: cpxi
            private final cpxt a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cpxt cpxtVar = this.a;
                cpxtVar.a.getDecorView().setSystemUiVisibility(this.b);
            }
        });
    }

    public final void b() {
        if (!this.c.b.a() || !this.b.a() || !this.c.e.a()) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this) { // from class: cpxk
            private final cpxt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cpxt cpxtVar = this.a;
                ((ViewGroup.MarginLayoutParams) cpxtVar.a.getDecorView().findViewById(16908290).getLayoutParams()).topMargin = cpxtVar.b.b().intValue() + cpxtVar.c.e.b().intValue();
            }
        });
    }

    public final void c() {
        if (!this.c.b.a()) {
            return;
        }
        final View decorView = this.a.getDecorView();
        if (Build.VERSION.SDK_INT > 27) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this, decorView) { // from class: cpxl
            private final cpxt a;
            private final View b;

            {
                this.a = this;
                this.b = decorView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener(this.a) { // from class: cpxj
                    private final cpxt a;

                    {
                        this.a = r1;
                    }

                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public final void onSystemUiVisibilityChange(int i) {
                        cpxt cpxtVar = this.a;
                        if (!cpxtVar.c.f.a() || cpxtVar.c.f.b().intValue() == i) {
                            return;
                        }
                        cpxtVar.c.f.b();
                        cpxtVar.a(cpxtVar.c.f.b().intValue());
                    }
                });
            }
        });
    }

    public final void d() {
        if (!this.c.b.a() || Build.VERSION.SDK_INT > 27) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this) { // from class: cpxm
            private final cpxt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.getDecorView().setOnSystemUiVisibilityChangeListener(cpxs.a);
            }
        });
    }

    public final void e() {
        if (!this.c.b.a()) {
            return;
        }
        final View decorView = this.a.getDecorView();
        this.b = dbsg.i(Integer.valueOf(((ViewGroup.MarginLayoutParams) decorView.findViewById(16908290).getLayoutParams()).topMargin));
        this.c.b.b().runOnUiThread(new Runnable(this, decorView) { // from class: cpxn
            private final cpxt a;
            private final View b;

            {
                this.a = this;
                this.b = decorView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cpxt cpxtVar = this.a;
                this.b.findViewById(16908290).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(cpxtVar) { // from class: cpxr
                    private final cpxt a;

                    {
                        this.a = cpxtVar;
                    }

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        cpxt cpxtVar2 = this.a;
                        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("#OnApplyWindowInsets(): top inset height = ");
                        sb.append(systemWindowInsetTop);
                        sb.toString();
                        cpxtVar2.c.e = dbsg.i(Integer.valueOf(windowInsets.getSystemWindowInsetTop()));
                        cpxtVar2.b();
                        return windowInsets;
                    }
                });
            }
        });
    }

    public final void f() {
        if (!this.c.b.a()) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this) { // from class: cpxo
            private final cpxt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.getDecorView().findViewById(16908290).setOnApplyWindowInsetsListener(null);
            }
        });
    }

    public final void g() {
        final boolean z = this.c.a.get();
        if (!this.c.b.a()) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this, z) { // from class: cpxp
            private final cpxt a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cpxt cpxtVar = this.a;
                boolean z2 = this.b;
                cpxtVar.a.getDecorView().setSystemUiVisibility((cpxu.d(z2) ^ (-1)) & cpxtVar.a.getDecorView().getSystemUiVisibility());
            }
        });
    }

    public final void h() {
        if (!this.c.b.a()) {
            return;
        }
        this.c.b.b().runOnUiThread(new Runnable(this) { // from class: cpxq
            private final cpxt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cpxt cpxtVar = this.a;
                ((ViewGroup.MarginLayoutParams) cpxtVar.a.getDecorView().findViewById(16908290).getLayoutParams()).topMargin = cpxtVar.b.c(0).intValue();
                cpxtVar.b = dbpy.a;
            }
        });
    }
}
