package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ynb  reason: default package */
/* loaded from: classes4.dex */
public final class ynb {
    public final HashSet a = new HashSet();

    public final void a(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ymy) it.next()).pj(i, i2);
        }
    }

    public final void b(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ymy) it.next()).pk(i, i2);
        }
    }

    public final void c(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ymy) it.next()).d(i, i2);
        }
    }

    public final void d(int i) {
        c(i, 1);
    }

    public final void e(ymy ymyVar) {
        this.a.add(ymyVar);
    }

    public final void f(ymy ymyVar) {
        this.a.remove(ymyVar);
    }

    public final void g() {
        for (ajql ajqlVar : this.a) {
            ajqlVar.pi();
        }
    }
}
