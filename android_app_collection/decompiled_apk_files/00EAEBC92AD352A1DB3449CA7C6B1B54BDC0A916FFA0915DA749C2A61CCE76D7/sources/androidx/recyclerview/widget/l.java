package androidx.recyclerview.widget;

import a.g.m.v;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class l extends a.g.m.a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f2122d;

    /* renamed from: e  reason: collision with root package name */
    private final a f2123e;

    /* loaded from: classes.dex */
    public static class a extends a.g.m.a {

        /* renamed from: d  reason: collision with root package name */
        final l f2124d;

        /* renamed from: e  reason: collision with root package name */
        private Map<View, a.g.m.a> f2125e = new WeakHashMap();

        public a(l lVar) {
            this.f2124d = lVar;
        }

        @Override // a.g.m.a
        public a.g.m.e0.d a(View view) {
            a.g.m.a aVar = this.f2125e.get(view);
            return aVar != null ? aVar.a(view) : super.a(view);
        }

        @Override // a.g.m.a
        public void a(View view, int i) {
            a.g.m.a aVar = this.f2125e.get(view);
            if (aVar != null) {
                aVar.a(view, i);
            } else {
                super.a(view, i);
            }
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            if (!this.f2124d.c() && this.f2124d.f2122d.getLayoutManager() != null) {
                this.f2124d.f2122d.getLayoutManager().a(view, cVar);
                a.g.m.a aVar = this.f2125e.get(view);
                if (aVar != null) {
                    aVar.a(view, cVar);
                    return;
                }
            }
            super.a(view, cVar);
        }

        @Override // a.g.m.a
        public boolean a(View view, int i, Bundle bundle) {
            if (this.f2124d.c() || this.f2124d.f2122d.getLayoutManager() == null) {
                return super.a(view, i, bundle);
            }
            a.g.m.a aVar = this.f2125e.get(view);
            if (aVar != null) {
                if (aVar.a(view, i, bundle)) {
                    return true;
                }
            } else if (super.a(view, i, bundle)) {
                return true;
            }
            return this.f2124d.f2122d.getLayoutManager().a(view, i, bundle);
        }

        @Override // a.g.m.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a.g.m.a aVar = this.f2125e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // a.g.m.a
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a.g.m.a aVar = this.f2125e.get(viewGroup);
            return aVar != null ? aVar.a(viewGroup, view, accessibilityEvent) : super.a(viewGroup, view, accessibilityEvent);
        }

        @Override // a.g.m.a
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            a.g.m.a aVar = this.f2125e.get(view);
            if (aVar != null) {
                aVar.b(view, accessibilityEvent);
            } else {
                super.b(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a.g.m.a c(View view) {
            return this.f2125e.remove(view);
        }

        @Override // a.g.m.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            a.g.m.a aVar = this.f2125e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(View view) {
            a.g.m.a b2 = v.b(view);
            if (b2 == null || b2 == this) {
                return;
            }
            this.f2125e.put(view, b2);
        }

        @Override // a.g.m.a
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            a.g.m.a aVar = this.f2125e.get(view);
            if (aVar != null) {
                aVar.d(view, accessibilityEvent);
            } else {
                super.d(view, accessibilityEvent);
            }
        }
    }

    public l(RecyclerView recyclerView) {
        this.f2122d = recyclerView;
        a.g.m.a b2 = b();
        this.f2123e = (b2 == null || !(b2 instanceof a)) ? new a(this) : (a) b2;
    }

    @Override // a.g.m.a
    public void a(View view, a.g.m.e0.c cVar) {
        super.a(view, cVar);
        if (c() || this.f2122d.getLayoutManager() == null) {
            return;
        }
        this.f2122d.getLayoutManager().a(cVar);
    }

    @Override // a.g.m.a
    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (!c() && this.f2122d.getLayoutManager() != null) {
            return this.f2122d.getLayoutManager().a(i, bundle);
        }
        return false;
    }

    public a.g.m.a b() {
        return this.f2123e;
    }

    @Override // a.g.m.a
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || c()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().a(accessibilityEvent);
    }

    boolean c() {
        return this.f2122d.hasPendingAdapterUpdates();
    }
}
