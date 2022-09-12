package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
@Deprecated
/* renamed from: jme  reason: default package */
/* loaded from: classes7.dex */
final class jme implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnDrawListener {
    public final View a;
    public final List<Runnable> b = Collections.synchronizedList(new ArrayList());
    public final List<Runnable> c = Collections.synchronizedList(new ArrayList());
    public final List<Runnable> d = Collections.synchronizedList(new ArrayList());
    private final AtomicReference<jmd> g = new AtomicReference<>(jmd.UNKNOWN);
    private final Rect h = new Rect();
    public final Object e = new Object();
    public boolean f = false;
    private final Rect i = new Rect();

    public jme(View view) {
        this.a = view;
    }

    private final void b() {
        this.a.getGlobalVisibleRect(this.i);
        jmd jmdVar = this.a.isShown() ? jmd.VISIBLE : jmd.HIDDEN;
        jmd andSet = this.g.getAndSet(jmdVar);
        if (andSet == jmdVar) {
            if (this.i.equals(this.h)) {
                return;
            }
            if (jmdVar == jmd.VISIBLE) {
                for (Runnable runnable : this.c) {
                    runnable.run();
                }
            }
            this.h.set(this.i);
        } else if (jmdVar == jmd.VISIBLE) {
            for (Runnable runnable2 : this.b) {
                runnable2.run();
            }
        } else if (andSet != jmd.UNKNOWN) {
            for (Runnable runnable3 : this.d) {
                runnable3.run();
            }
        }
    }

    public final void a() {
        synchronized (this.e) {
            if (!this.f) {
                return;
            }
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.getViewTreeObserver().removeOnDrawListener(this);
            this.f = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b();
    }
}
