package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: albi  reason: default package */
/* loaded from: classes.dex */
public abstract class albi implements albu {
    public final int a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public albi(int i) {
        this.a = i;
    }

    @Override // defpackage.albu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.albu
    public final synchronized void b(albt albtVar) {
        if (this.b.isEmpty()) {
            e();
        }
        this.b.add(albtVar);
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((albt) it.next()).sb(this);
        }
    }

    @Override // defpackage.albu
    public final synchronized void d(albt albtVar) {
        if (this.b.isEmpty()) {
            return;
        }
        this.b.remove(albtVar);
        if (!this.b.isEmpty()) {
            return;
        }
        f();
    }

    protected abstract void e();

    public boolean equals(Object obj) {
        return (obj instanceof albu) && this.a == ((albu) obj).a();
    }

    protected abstract void f();

    public int hashCode() {
        return this.a;
    }
}
