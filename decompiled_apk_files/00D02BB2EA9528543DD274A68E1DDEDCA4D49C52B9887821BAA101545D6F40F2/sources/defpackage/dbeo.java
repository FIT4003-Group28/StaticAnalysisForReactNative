package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbeo  reason: default package */
/* loaded from: classes5.dex */
public final class dbeo<T> implements dbit {
    private final HashSet<dben<T>> a;
    private final ReferenceQueue<T> b;

    public dbeo() {
        HashSet<dben<T>> hashSet = new HashSet<>();
        ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();
        this.a = hashSet;
        this.b = referenceQueue;
    }

    public final void a(T t, Runnable runnable) {
        this.a.add(new dben<>(t, this.b, runnable));
    }

    @Override // defpackage.dbit
    public final void b() {
        Iterator<dben<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.remove();
            it.next().a();
        }
    }

    @Override // defpackage.dbit
    public final void c() {
        dben dbenVar = (dben) this.b.poll();
        while (dbenVar != null) {
            if (this.a.contains(dbenVar)) {
                dbenVar.a();
                this.a.remove(dbenVar);
            }
            dbenVar = (dben) this.b.poll();
        }
        this.a.size();
    }
}
