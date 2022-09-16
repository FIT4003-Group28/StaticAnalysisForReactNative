package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: lnu  reason: default package */
/* loaded from: classes3.dex */
public final class lnu {
    public final abh a;
    public final Map b;
    public ajzq c;
    public ajrt d;
    public Set e;
    public Set f;
    public Set g;
    private final abc h;

    public lnu() {
        lnq lnqVar = new lnq(this);
        this.h = lnqVar;
        this.a = new abh(lnqVar);
        this.b = new IdentityHashMap();
    }

    public static int a(yo yoVar, ajsm ajsmVar, ajrw ajrwVar) {
        return ajsmVar.indexOf(ajrwVar.getItem(yoVar.b()));
    }

    public static ajru b(yo yoVar) {
        if (yoVar == null) {
            return null;
        }
        if (yoVar instanceof ajrz) {
            return ((ajrz) yoVar).t;
        }
        return akel.g(yoVar.a);
    }

    public static Object c(ajrs ajrsVar, String str, Class cls) {
        Object c = ajrsVar != null ? ajrsVar.c(str) : null;
        if (cls.isInstance(c)) {
            return cls.cast(c);
        }
        return null;
    }

    public static void g(ajrs ajrsVar, String str, Object obj) {
        if (obj != null) {
            ajrsVar.f(str, obj);
        }
    }

    public static void h(Set set, Object obj) {
        if (set == null) {
            return;
        }
        set.remove(obj);
    }

    private static Set l(Set set, Object obj) {
        if (obj == null) {
            return set;
        }
        if (set == null) {
            set = new HashSet();
        }
        set.add(obj);
        return set;
    }

    public final void d(lnr lnrVar) {
        this.g = l(this.g, lnrVar);
    }

    public final void e(lns lnsVar) {
        this.f = l(this.f, lnsVar);
    }

    public final void f(lnt lntVar) {
        this.e = l(this.e, lntVar);
    }

    public final boolean i(RecyclerView recyclerView) {
        return recyclerView == this.c.f60J;
    }

    public final boolean j(yo yoVar) {
        return this.b.get(b(yoVar)) != null;
    }

    public final boolean k(yo yoVar, yo yoVar2) {
        ajsm ajsmVar = (ajsm) this.b.get(b(yoVar));
        return ajsmVar != null && ajsmVar == ((ajsm) this.b.get(b(yoVar2)));
    }
}
