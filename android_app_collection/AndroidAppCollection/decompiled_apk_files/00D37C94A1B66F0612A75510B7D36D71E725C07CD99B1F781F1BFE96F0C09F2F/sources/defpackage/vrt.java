package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: vrt  reason: default package */
/* loaded from: classes4.dex */
public final class vrt {
    public int a = 1;
    private final PriorityQueue b = new PriorityQueue(5);
    private final PriorityQueue c = new PriorityQueue(5, Collections.reverseOrder());

    private final vrs g(vrr vrrVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            vrs vrsVar = (vrs) it.next();
            if (vrsVar.b == vrrVar) {
                return vrsVar;
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            vrs vrsVar2 = (vrs) it2.next();
            if (vrsVar2.b == vrrVar) {
                return vrsVar2;
            }
        }
        return null;
    }

    private final synchronized void h() {
        if (this.b.size() < this.a) {
            vrs vrsVar = (vrs) this.c.poll();
            if (vrsVar != null) {
                this.b.add(vrsVar);
                vrsVar.c = false;
                vrsVar.b.a();
            }
        } else {
            viu.d(!this.b.isEmpty());
            vrs vrsVar2 = (vrs) this.c.peek();
            if (vrsVar2 != null) {
                vrs vrsVar3 = (vrs) this.b.peek();
                if (vrsVar2.a > vrsVar3.a && !vrsVar3.c) {
                    vrsVar3.c = true;
                    vrsVar3.b.b();
                }
            }
        }
    }

    public final synchronized void a(vrr vrrVar) {
        vrrVar.getClass();
        vrs g = g(vrrVar);
        if (g == null || !this.b.remove(g)) {
            return;
        }
        this.c.add(g);
        h();
    }

    public final synchronized void b(int i) {
        if (i <= this.a) {
            return;
        }
        this.a = i;
        while (this.b.size() < this.a && !this.c.isEmpty()) {
            vrs vrsVar = (vrs) this.c.poll();
            this.b.add(vrsVar);
            vrsVar.b.a();
        }
    }

    public final synchronized void c(vrr vrrVar, int i) {
        vrrVar.getClass();
        vrs g = g(vrrVar);
        if (g == null) {
            this.c.add(new vrs(i, vrrVar));
        } else if (g.a == i) {
            return;
        } else {
            if (this.c.contains(g)) {
                this.c.remove(g);
                this.c.add(new vrs(i, vrrVar));
            } else {
                this.b.remove(g);
                this.b.add(new vrs(i, vrrVar));
            }
        }
        h();
    }

    public final synchronized void d(vrr vrrVar) {
        vrrVar.getClass();
        vrs g = g(vrrVar);
        if (g != null) {
            this.b.remove(g);
            this.c.remove(g);
            h();
        }
    }

    public final synchronized boolean e(vrr vrrVar) {
        viu.b(f(vrrVar));
        this.b.remove(g(vrrVar));
        int i = this.a;
        if (i == 1) {
            return false;
        }
        this.a = i - 1;
        return true;
    }

    public final synchronized boolean f(vrr vrrVar) {
        boolean z;
        vrs g = g(vrrVar);
        if (g != null) {
            if (this.b.contains(g)) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
