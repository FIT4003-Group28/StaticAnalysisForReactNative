package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: sdb  reason: default package */
/* loaded from: classes4.dex */
public final class sdb {
    public boolean a;
    public final List b;

    public sdb(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(ete eteVar) {
        this.b.add(eteVar);
    }

    public final void b(ete eteVar) {
        this.b.remove(eteVar);
    }

    public final void c(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        for (ete eteVar : this.b) {
            eteVar.g(z);
        }
    }

    public sdb() {
        this.b = sbv.d();
    }
}
