package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cloa  reason: default package */
/* loaded from: classes5.dex */
public final class cloa {
    public final clnz d;
    public final cmeq e;
    public final cltr f;
    public final HashMap<clny, clnx> g;
    public final Set<clny> h;
    public boolean i;
    public cmlo j;
    public cmfn k = new cmfn();
    public final IdentityHashMap<cmeg, clny> b = new IdentityHashMap<>();
    public final Map<Object, clny> c = new HashMap();
    public final List<clny> a = new ArrayList();

    public cloa(clnz clnzVar, clqv clqvVar, Handler handler) {
        this.d = clnzVar;
        cmeq cmeqVar = new cmeq();
        this.e = cmeqVar;
        cltr cltrVar = new cltr();
        this.f = cltrVar;
        this.g = new HashMap<>();
        this.h = new HashSet();
        cmeqVar.a(handler, clqvVar);
        cltrVar.b(handler, clqvVar);
    }

    private final void h(clny clnyVar) {
        clnx clnxVar = this.g.get(clnyVar);
        if (clnxVar != null) {
            clnxVar.a.m(clnxVar.b);
        }
    }

    private final void i(int i, int i2) {
        while (i < this.a.size()) {
            this.a.get(i).d += i2;
            i++;
        }
    }

    private final void j(clny clnyVar) {
        if (!clnyVar.e || !clnyVar.c.isEmpty()) {
            return;
        }
        clnx remove = this.g.remove(clnyVar);
        cmmn.f(remove);
        remove.a.n(remove.b);
        remove.a.i(remove.c);
        this.h.remove(clnyVar);
    }

    public final int a() {
        return this.a.size();
    }

    public final void b(cmeg cmegVar) {
        clny remove = this.b.remove(cmegVar);
        cmmn.f(remove);
        remove.a.s(cmegVar);
        remove.c.remove(((cmea) cmegVar).b);
        if (!this.b.isEmpty()) {
            d();
        }
        j(remove);
    }

    public final clpb c() {
        if (!this.a.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                clny clnyVar = this.a.get(i2);
                clnyVar.d = i;
                i += clnyVar.a.d.r();
            }
            return new clok(this.a, this.k);
        }
        return clpb.c;
    }

    public final void d() {
        Iterator<clny> it = this.h.iterator();
        while (it.hasNext()) {
            clny next = it.next();
            if (next.c.isEmpty()) {
                h(next);
                it.remove();
            }
        }
    }

    public final void e(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                clny remove = this.a.remove(i2);
                this.c.remove(remove.b);
                i(i2, -remove.a.d.r());
                remove.e = true;
                if (this.i) {
                    j(remove);
                }
            } else {
                return;
            }
        }
    }

    public final void f(clny clnyVar) {
        cmed cmedVar = clnyVar.a;
        cmei cmeiVar = new cmei(this) { // from class: clnv
            private final cloa a;

            {
                this.a = this;
            }

            @Override // defpackage.cmei
            public final void a(clpb clpbVar) {
                ((clnc) this.a.d).d.e(22);
            }
        };
        clnw clnwVar = new clnw(this, clnyVar);
        this.g.put(clnyVar, new clnx(cmedVar, cmeiVar, clnwVar));
        cmedVar.h(cmny.i(), clnwVar);
        cmedVar.j(cmny.i(), clnwVar);
        cmedVar.k(cmeiVar, this.j);
    }

    public final clpb g(int i, List<clny> list, cmfn cmfnVar) {
        if (!list.isEmpty()) {
            this.k = cmfnVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                clny clnyVar = list.get(i2 - i);
                if (i2 > 0) {
                    clny clnyVar2 = this.a.get(i2 - 1);
                    clnyVar.c(clnyVar2.d + clnyVar2.a.d.r());
                } else {
                    clnyVar.c(0);
                }
                i(i2, clnyVar.a.d.r());
                this.a.add(i2, clnyVar);
                this.c.put(clnyVar.b, clnyVar);
                if (this.i) {
                    f(clnyVar);
                    if (this.b.isEmpty()) {
                        this.h.add(clnyVar);
                    } else {
                        h(clnyVar);
                    }
                }
            }
        }
        return c();
    }
}
