package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ges  reason: default package */
/* loaded from: classes3.dex */
public class ges {
    public final WeakHashMap a = new WeakHashMap();
    private final WeakReference b;
    private final WeakReference c;
    private final int d;
    private final WeakReference e;
    private zaj f;

    public ges(View view, ger gerVar) {
        this.b = new WeakReference(view);
        this.c = new WeakReference(gerVar.k());
        this.d = gerVar.j();
        this.e = new WeakReference(gerVar);
    }

    private final boolean f(View view) {
        return this.a.containsKey(view) && ((Integer) this.a.get(view)).intValue() == 2;
    }

    private final boolean g(View view) {
        return (this.a.containsKey(view) && ((Integer) this.a.get(view)).intValue() == 1) || f(view);
    }

    protected float a() {
        return 0.25f;
    }

    protected float b() {
        return 0.5f;
    }

    public final int c(View view) {
        xw xwVar;
        View ay;
        RecyclerView recyclerView = (RecyclerView) this.c.get();
        if (view == null || recyclerView == null || (xwVar = recyclerView.n) == null || (ay = xwVar.ay(view)) == null) {
            return -1;
        }
        return recyclerView.c(ay);
    }

    public final Pair d(boolean z) {
        int c;
        int i;
        float a;
        int height;
        ger gerVar = (ger) this.e.get();
        int i2 = gerVar == null ? -1 : gerVar.i();
        if (this.f == null) {
            this.f = new zaj();
        }
        View view = (View) this.b.get();
        View view2 = null;
        float f = 0.0f;
        int i3 = 0;
        for (View view3 : new HashSet(this.a.keySet())) {
            if (this.a.containsKey(view3) && (c = c(view3)) >= 0) {
                zaj.c(this.f, view3, view);
                if (this.d == 0) {
                    i = this.f.a.left;
                } else {
                    i = this.f.a.top;
                }
                if (this.d == 0) {
                    a = this.f.b();
                    height = this.f.a.width();
                } else {
                    a = this.f.a();
                    height = this.f.a.height();
                }
                float f2 = a / height;
                if (f2 < b()) {
                    this.a.put(view3, 0);
                } else {
                    if (!z && f(view3)) {
                        f2 += a();
                    }
                    if (c == i2) {
                        f2 += 0.25f;
                    }
                    float f3 = f2 - f;
                    if (f3 < 0.0f || (f3 <= 0.1f && (i < 0 || i >= i3))) {
                        this.a.put(view3, 0);
                    } else {
                        if (view2 != null && view3 != view2) {
                            this.a.put(view2, 0);
                        }
                        view2 = view3;
                        i3 = i;
                        f = f2;
                    }
                }
            }
        }
        if (!g(view2)) {
            String.valueOf(String.valueOf(view2 == null ? "null" : view2)).length();
            this.a.put(view2, 1);
        }
        return new Pair(view2, Integer.valueOf(c(view2)));
    }

    public final void e(View view) {
        ylr.c();
        if (!this.a.containsKey(view) || !g(view)) {
            return;
        }
        String.valueOf(String.valueOf(view)).length();
        this.a.put(view, 0);
    }
}
