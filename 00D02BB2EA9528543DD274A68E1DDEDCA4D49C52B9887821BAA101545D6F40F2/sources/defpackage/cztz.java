package defpackage;

import android.animation.TimeInterpolator;
import android.app.Application;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import java.util.List;
/* compiled from: PG */
/* renamed from: cztz  reason: default package */
/* loaded from: classes.dex */
public class cztz {
    private static final String f = "cztz";
    private static final TimeInterpolator g = new czuh();
    public WindowManager a;
    @dzsi
    public cztt b;
    @dzsi
    public cztt c;
    public boolean d;
    public final Application e;
    private boolean h;
    private final Point j;
    private boolean k;
    @dzsi
    private Toast l;
    private final Runnable m = new cztv(this);
    private final View.OnTouchListener n = new cztw(this);
    private final cztx o = new cztx(this);
    private final Handler i = new Handler(Looper.getMainLooper());

    public cztz(Application application) {
        dbsk.s(application);
        this.e = application;
        this.a = (WindowManager) application.getSystemService("window");
        this.j = new Point();
    }

    private static final ViewPropertyAnimator f(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.setInterpolator(g).setDuration(300L);
    }

    public final void a(final cztt czttVar) {
        cztr cztrVar;
        ViewPropertyAnimator b;
        dbsk.s(czttVar);
        int i = 1;
        if (this.k) {
            czuf.a(f, "disableShowingToasts is true, but asked to show toast: ", czttVar);
        } else if (this.b != null) {
            czuf.a(f, "Showing toast, but currentToast was not null.");
            this.c = czttVar;
            e(4);
        } else {
            this.b = czttVar;
            czttVar.b.setOnTouchListener(this.n);
            this.b.c.setOnTouchListener(this.n);
            czttVar.k.add(this.o);
            this.i.removeCallbacks(this.m);
            Handler handler = this.i;
            Runnable runnable = this.m;
            if (czue.a(this.e)) {
                cztrVar = cztr.ACCESSIBILITY_EXTRA_LONG;
            } else {
                cztrVar = czttVar.e;
            }
            handler.postDelayed(runnable, (int) cztrVar.f);
            czttVar.c(false);
            View view = czttVar.b;
            int i2 = czttVar.h;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            layoutParams.format = -3;
            if (!this.h) {
                layoutParams.type = 2005;
            }
            layoutParams.setTitle(cztt.class.getSimpleName());
            layoutParams.gravity = i2;
            layoutParams.flags = 262184;
            view.setLayoutParams(layoutParams);
            String str = f;
            String valueOf = String.valueOf(czttVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Showing toast: ");
            sb.append(valueOf);
            czuf.a(str, sb.toString());
            try {
                this.a.addView(view, view.getLayoutParams());
            } catch (Exception e) {
                czuf.b(f, e, "addView failed while showing toast.");
                d((WindowManager) this.e.getSystemService("window"), false);
                try {
                    this.a.addView(view, view.getLayoutParams());
                } catch (Exception e2) {
                    this.b = null;
                    czuf.b(f, e2, "addView failed while showing toast with System WINDOW_SERVICE; falling back to regular toast.");
                    if (czttVar.e == cztr.SHORT) {
                        i = 0;
                    }
                    Toast makeText = Toast.makeText(this.e, czttVar.d, i);
                    this.l = makeText;
                    makeText.show();
                    return;
                }
            }
            View view2 = czttVar.b;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) view2.getLayoutParams();
            this.a.getDefaultDisplay().getSize(this.j);
            view2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(this.j.x, 1073741824), 0, layoutParams2.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(this.j.y, 1073741824), 0, layoutParams2.height));
            View view3 = czttVar.b;
            View view4 = czttVar.c;
            int i3 = czttVar.h;
            if (i3 == 3) {
                view4.setTranslationX(-view3.getMeasuredWidth());
            } else if (i3 == 5) {
                view4.setTranslationX(view3.getMeasuredWidth());
            } else if (i3 == 48) {
                view4.setTranslationY(-view3.getMeasuredHeight());
            } else if (i3 == 80) {
                view4.setTranslationY(view3.getMeasuredHeight());
            } else {
                throw new UnsupportedOperationException("Only TOP, LEFT, RIGHT, or BOTTOM gravity is supported.");
            }
            f(czttVar.c.animate()).translationX(0.0f).translationY(0.0f).withEndAction(new Runnable(this, czttVar) { // from class: cztu
                private final cztz a;
                private final cztt b;

                {
                    this.a = this;
                    this.b = czttVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cztz cztzVar = this.a;
                    cztt czttVar2 = this.b;
                    cztzVar.b.c(true);
                    boolean z = czttVar2.i;
                }
            });
            List<czuc> list = czttVar.f;
            int i4 = ((dcmi) list).c;
            for (int i5 = 0; i5 < i4; i5++) {
                czuc czucVar = list.get(i5);
                if (czucVar != null && (b = czucVar.b()) != null) {
                    f(b);
                }
            }
            boolean z = czttVar.i;
            Application application = this.e;
            String str2 = czttVar.d;
            String simpleName = cztz.class.getSimpleName();
            AccessibilityManager accessibilityManager = (AccessibilityManager) application.getSystemService("accessibility");
            if (!accessibilityManager.isEnabled()) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
            obtain.getText().add(str2);
            obtain.setClassName(simpleName);
            obtain.setPackageName(application.getPackageName());
            try {
                accessibilityManager.sendAccessibilityEvent(obtain);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void b(boolean z) {
        this.k = z;
        if (z) {
            e(5);
        }
    }

    public final boolean c(int i) {
        cztt czttVar = this.b;
        return czttVar != null && czttVar.d.equals(this.e.getString(i));
    }

    public final void d(WindowManager windowManager, boolean z) {
        this.a = windowManager;
        this.h = z;
    }

    public final void e(int i) {
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator a;
        this.i.removeCallbacks(this.m);
        Toast toast = this.l;
        if (toast != null) {
            toast.cancel();
            this.l = null;
        }
        cztt czttVar = this.b;
        if (czttVar == null || this.d) {
            return;
        }
        czuf.a(f, "Dismissing toast.");
        this.d = true;
        czttVar.c(false);
        View view = czttVar.b;
        ViewPropertyAnimator f2 = f(czttVar.c.animate());
        int i2 = czttVar.h;
        if (i2 == 3) {
            translationX = f2.translationX(-view.getWidth());
        } else if (i2 == 5) {
            translationX = f2.translationX(view.getWidth());
        } else if (i2 == 48) {
            translationX = f2.translationY(-view.getHeight());
        } else if (i2 == 80) {
            translationX = f2.translationY(view.getHeight());
        } else {
            throw new UnsupportedOperationException("Only TOP, LEFT, RIGHT, or BOTTOM gravity is supported.");
        }
        translationX.withEndAction(new czty(this, view));
        List<czuc> list = czttVar.f;
        int i3 = ((dcmi) list).c;
        for (int i4 = 0; i4 < i3; i4++) {
            czuc czucVar = list.get(i4);
            if (czucVar != null && (a = czucVar.a()) != null) {
                f(a);
            }
        }
        czua czuaVar = czttVar.g;
        if (czuaVar == null) {
            return;
        }
        czuaVar.a(i);
    }
}
