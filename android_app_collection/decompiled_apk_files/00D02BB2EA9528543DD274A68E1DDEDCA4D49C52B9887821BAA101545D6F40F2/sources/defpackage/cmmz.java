package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: cmmz  reason: default package */
/* loaded from: classes5.dex */
public final class cmmz<T> {
    private final CopyOnWriteArraySet<cmmy<T>> a = new CopyOnWriteArraySet<>();
    private final ArrayDeque<Runnable> b = new ArrayDeque<>();
    private final ArrayDeque<Runnable> c = new ArrayDeque<>();

    public final void a(T t) {
        cmmn.f(t);
        this.a.add(new cmmy<>(t));
    }

    public final void b(T t) {
        Iterator<cmmy<T>> it = this.a.iterator();
        while (it.hasNext()) {
            cmmy<T> next = it.next();
            if (next.a.equals(t)) {
                next.b = true;
                this.a.remove(next);
            }
        }
    }

    public final void c(final cmmx<T> cmmxVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.a);
        this.c.add(new Runnable(copyOnWriteArraySet, cmmxVar) { // from class: cmmw
            private final CopyOnWriteArraySet a;
            private final cmmx b;

            {
                this.a = copyOnWriteArraySet;
                this.b = cmmxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
                cmmx cmmxVar2 = this.b;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    cmmy cmmyVar = (cmmy) it.next();
                    if (!cmmyVar.b) {
                        cmmxVar2.a(cmmyVar.a);
                    }
                }
            }
        });
    }

    public final void d() {
        boolean isEmpty = this.b.isEmpty();
        this.b.addAll(this.c);
        this.c.clear();
        if (!(!isEmpty)) {
            while (!this.b.isEmpty()) {
                this.b.peekFirst().run();
                this.b.removeFirst();
            }
        }
    }

    public final void e(cmmx<T> cmmxVar) {
        c(cmmxVar);
        d();
    }
}
