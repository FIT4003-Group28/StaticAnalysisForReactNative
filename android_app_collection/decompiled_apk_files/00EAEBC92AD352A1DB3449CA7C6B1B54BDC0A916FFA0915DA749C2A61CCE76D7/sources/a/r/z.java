package a.r;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static x f724a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<a.e.a<ViewGroup, ArrayList<x>>>> f725b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f726c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        x f727b;

        /* renamed from: c  reason: collision with root package name */
        ViewGroup f728c;

        /* renamed from: a.r.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0036a extends y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.e.a f729a;

            C0036a(a.e.a aVar) {
                this.f729a = aVar;
            }

            @Override // a.r.x.f
            public void e(x xVar) {
                ((ArrayList) this.f729a.get(a.this.f728c)).remove(xVar);
                xVar.mo24b(this);
            }
        }

        a(x xVar, ViewGroup viewGroup) {
            this.f727b = xVar;
            this.f728c = viewGroup;
        }

        private void a() {
            this.f728c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f728c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!z.f726c.remove(this.f728c)) {
                return true;
            }
            a.e.a<ViewGroup, ArrayList<x>> a2 = z.a();
            ArrayList<x> arrayList = a2.get(this.f728c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a2.put(this.f728c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f727b);
            this.f727b.mo20a(new C0036a(a2));
            this.f727b.a(this.f728c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).e(this.f728c);
                }
            }
            this.f727b.a(this.f728c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            z.f726c.remove(this.f728c);
            ArrayList<x> arrayList = z.a().get(this.f728c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<x> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.f728c);
                }
            }
            this.f727b.a(true);
        }
    }

    static a.e.a<ViewGroup, ArrayList<x>> a() {
        a.e.a<ViewGroup, ArrayList<x>> aVar;
        WeakReference<a.e.a<ViewGroup, ArrayList<x>>> weakReference = f725b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            a.e.a<ViewGroup, ArrayList<x>> aVar2 = new a.e.a<>();
            f725b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    public static void a(ViewGroup viewGroup, x xVar) {
        if (f726c.contains(viewGroup) || !a.g.m.v.I(viewGroup)) {
            return;
        }
        f726c.add(viewGroup);
        if (xVar == null) {
            xVar = f724a;
        }
        x clone = xVar.clone();
        c(viewGroup, clone);
        u.a(viewGroup, null);
        b(viewGroup, clone);
    }

    private static void b(ViewGroup viewGroup, x xVar) {
        if (xVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(xVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void c(ViewGroup viewGroup, x xVar) {
        ArrayList<x> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<x> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(viewGroup);
            }
        }
        if (xVar != null) {
            xVar.a(viewGroup, true);
        }
        u a2 = u.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
