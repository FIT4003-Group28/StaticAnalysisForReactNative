package a.r;

import a.r.x;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.v {

    /* loaded from: classes.dex */
    class a extends x.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f625a;

        a(h hVar, Rect rect) {
            this.f625a = rect;
        }

        @Override // a.r.x.e
        public Rect a(x xVar) {
            return this.f625a;
        }
    }

    /* loaded from: classes.dex */
    class b implements x.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f627b;

        b(h hVar, View view, ArrayList arrayList) {
            this.f626a = view;
            this.f627b = arrayList;
        }

        @Override // a.r.x.f
        public void a(x xVar) {
        }

        @Override // a.r.x.f
        public void b(x xVar) {
        }

        @Override // a.r.x.f
        public void c(x xVar) {
        }

        @Override // a.r.x.f
        public void d(x xVar) {
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            xVar.mo24b(this);
            this.f626a.setVisibility(8);
            int size = this.f627b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f627b.get(i)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f629b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f630c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f631d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f632e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f633f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f628a = obj;
            this.f629b = arrayList;
            this.f630c = obj2;
            this.f631d = arrayList2;
            this.f632e = obj3;
            this.f633f = arrayList3;
        }

        @Override // a.r.y, a.r.x.f
        public void a(x xVar) {
            Object obj = this.f628a;
            if (obj != null) {
                h.this.a(obj, this.f629b, (ArrayList<View>) null);
            }
            Object obj2 = this.f630c;
            if (obj2 != null) {
                h.this.a(obj2, this.f631d, (ArrayList<View>) null);
            }
            Object obj3 = this.f632e;
            if (obj3 != null) {
                h.this.a(obj3, this.f633f, (ArrayList<View>) null);
            }
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            xVar.mo24b(this);
        }
    }

    /* loaded from: classes.dex */
    class d extends x.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f635a;

        d(h hVar, Rect rect) {
            this.f635a = rect;
        }

        @Override // a.r.x.e
        public Rect a(x xVar) {
            Rect rect = this.f635a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f635a;
        }
    }

    private static boolean a(x xVar) {
        return !androidx.fragment.app.v.a((List) xVar.j()) || !androidx.fragment.app.v.a((List) xVar.k()) || !androidx.fragment.app.v.a((List) xVar.l());
    }

    @Override // androidx.fragment.app.v
    public Object a(Object obj, Object obj2, Object obj3) {
        x xVar = (x) obj;
        x xVar2 = (x) obj2;
        x xVar3 = (x) obj3;
        if (xVar != null && xVar2 != null) {
            b0 b0Var = new b0();
            b0Var.a(xVar);
            b0Var.a(xVar2);
            b0Var.b(1);
            xVar = b0Var;
        } else if (xVar == null) {
            xVar = xVar2 != null ? xVar2 : null;
        }
        if (xVar3 != null) {
            b0 b0Var2 = new b0();
            if (xVar != null) {
                b0Var2.a(xVar);
            }
            b0Var2.a(xVar3);
            return b0Var2;
        }
        return xVar;
    }

    @Override // androidx.fragment.app.v
    public void a(ViewGroup viewGroup, Object obj) {
        z.a(viewGroup, (x) obj);
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((x) obj).a(new d(this, rect));
        }
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, View view) {
        if (obj != null) {
            ((x) obj).mo22a(view);
        }
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((x) obj).mo20a(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((x) obj).mo20a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, ArrayList<View> arrayList) {
        x xVar = (x) obj;
        if (xVar == null) {
            return;
        }
        int i = 0;
        if (xVar instanceof b0) {
            b0 b0Var = (b0) xVar;
            int q = b0Var.q();
            while (i < q) {
                a(b0Var.a(i), arrayList);
                i++;
            }
        } else if (a(xVar) || !androidx.fragment.app.v.a((List) xVar.m())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                xVar.mo22a(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.v
    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        x xVar = (x) obj;
        int i = 0;
        if (xVar instanceof b0) {
            b0 b0Var = (b0) xVar;
            int q = b0Var.q();
            while (i < q) {
                a((Object) b0Var.a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!a(xVar)) {
            List<View> m = xVar.m();
            if (m.size() != arrayList.size() || !m.containsAll(arrayList)) {
                return;
            }
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                xVar.mo22a(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                xVar.mo26d(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.v
    public boolean a(Object obj) {
        return obj instanceof x;
    }

    @Override // androidx.fragment.app.v
    public Object b(Object obj) {
        if (obj != null) {
            return ((x) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.v
    public Object b(Object obj, Object obj2, Object obj3) {
        b0 b0Var = new b0();
        if (obj != null) {
            b0Var.a((x) obj);
        }
        if (obj2 != null) {
            b0Var.a((x) obj2);
        }
        if (obj3 != null) {
            b0Var.a((x) obj3);
        }
        return b0Var;
    }

    @Override // androidx.fragment.app.v
    public void b(Object obj, View view) {
        if (obj != null) {
            ((x) obj).mo26d(view);
        }
    }

    @Override // androidx.fragment.app.v
    public void b(Object obj, View view, ArrayList<View> arrayList) {
        b0 b0Var = (b0) obj;
        List<View> m = b0Var.m();
        m.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.v.a(m, arrayList.get(i));
        }
        m.add(view);
        arrayList.add(view);
        a(b0Var, arrayList);
    }

    @Override // androidx.fragment.app.v
    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        b0 b0Var = (b0) obj;
        if (b0Var != null) {
            b0Var.m().clear();
            b0Var.m().addAll(arrayList2);
            a((Object) b0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.v
    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        b0 b0Var = new b0();
        b0Var.a((x) obj);
        return b0Var;
    }

    @Override // androidx.fragment.app.v
    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((x) obj).a(new a(this, rect));
        }
    }
}
