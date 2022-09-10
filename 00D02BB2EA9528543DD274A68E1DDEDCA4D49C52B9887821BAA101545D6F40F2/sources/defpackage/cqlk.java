package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqlk  reason: default package */
/* loaded from: classes.dex */
public final class cqlk {
    public final dbyy<cqiw<?>, Integer> a;
    public final List<cqix<?>> b = new ArrayList();
    public final cqkj c;
    public int d;

    public cqlk(cqkj cqkjVar) {
        this.c = cqkjVar;
        this.a = cqkjVar.e;
    }

    public static final void k(View view) {
        cqkf<?> a = cqke.a(view);
        if (a != null) {
            a.e(null);
        }
    }

    private static String l(@dzsi cqiw<?> cqiwVar) {
        return cqiwVar == null ? "null" : cqiwVar.z().replace("com.google.android.apps", "");
    }

    public final <T extends cqkp> void a(cqiw<T> cqiwVar, T t) {
        b(cqgr.fT(cqiwVar, t));
    }

    public final void b(cqix<?> cqixVar) {
        dbsk.t(cqixVar, "Null layout provided");
        this.b.add(cqixVar);
        cqiw<?> a = cqixVar.a();
        boolean z = true;
        if (this.d != 0 && this.a.get(a).intValue() >= this.d) {
            z = false;
        }
        dbsk.b(z, "Cannot add a new layout type once viewTypeCount is evaluated!");
        if (!this.a.containsKey(a)) {
            dbyy<cqiw<?>, Integer> dbyyVar = this.a;
            dbyyVar.put(a, Integer.valueOf(dbyyVar.keySet().size()));
        }
    }

    public final void c() {
        this.b.clear();
    }

    public final int d() {
        return this.b.size();
    }

    public final Object e(int i) {
        return this.b.get(i).b();
    }

    public final int f(int i) {
        cqix<?> cqixVar = this.b.get(i);
        if (!cqixVar.a().A()) {
            return (-i) - 1;
        }
        Integer num = this.a.get(cqixVar.a());
        if (num == null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<cqiw<?>, Integer> entry : this.a.entrySet()) {
                hashMap.put(l(entry.getKey()), entry.getValue());
            }
            dbry c = dbrz.e(",").c("=");
            String a = new dbry(c.a.b(), c.b).a(hashMap);
            if (a.length() > 100) {
                a = String.valueOf(a.substring(0, 100)).concat("...");
            }
            throw new NullPointerException(String.format("Layout %s not in viewTypes. position=%d size=%d [%s]", l(cqixVar.a()), Integer.valueOf(i), Integer.valueOf(((dccf) this.a).c), a));
        }
        return num.intValue();
    }

    public final boolean g(int i) {
        return this.b.get(i).c();
    }

    public final cqiw<?> h(int i) {
        if (i < 0) {
            return this.b.get((-i) - 1).a();
        }
        return this.a.i().get(Integer.valueOf(i));
    }

    public final View i(ViewGroup viewGroup, int i) {
        return this.c.d(h(i), viewGroup, false).c();
    }

    public final void j(View view, int i) {
        cqix<?> cqixVar = this.b.get(i);
        cqkf<?> a = cqke.a(view);
        if (a == null) {
            return;
        }
        if (!cqixVar.a().A() && a.d() == cqixVar.b()) {
            return;
        }
        a.e(cqixVar.b());
    }
}
