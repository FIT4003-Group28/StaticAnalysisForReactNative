package defpackage;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nnf  reason: default package */
/* loaded from: classes3.dex */
public final class nnf {
    public final Set a = new HashSet();
    public final ArrayDeque b = new ArrayDeque();
    public final nmx c;

    public nnf(nmx nmxVar, boolean z) {
        g(nmxVar, z);
        this.c = nmxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.b.size();
    }

    public final nmx b() {
        return (nmx) this.b.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ampq c() {
        if (this.b.size() <= 1) {
            return amon.a;
        }
        nmx nmxVar = (nmx) this.b.pop();
        this.a.remove(nmxVar.a);
        nmxVar.a(4);
        return ampq.j(nmxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nmx) it.next()).a(4);
        }
        this.b.clear();
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nmx) it.next()).a(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str) {
        if (!h(str)) {
            return;
        }
        int size = this.b.size();
        while (true) {
            size--;
            if (size <= 0) {
                return;
            }
            nmx nmxVar = (nmx) this.b.peek();
            if (str.equals(nmxVar.a)) {
                return;
            }
            this.b.pop();
            this.a.remove(nmxVar.a);
            nmxVar.a(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(nmx nmxVar, boolean z) {
        if (h(nmxVar.a)) {
            f(nmxVar.a);
            return;
        }
        this.b.push(nmxVar);
        this.a.add(nmxVar.a);
        if (!z) {
            return;
        }
        nmxVar.a(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return this.a.contains(str);
    }
}
