package defpackage;

import java.util.LinkedList;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cyva  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyva<T> {
    private final Queue<T> a = new LinkedList();
    private boolean b = true;

    public final synchronized void a(T t) {
        if (this.b) {
            this.a.add(t);
        } else {
            b(t);
        }
    }

    protected abstract void b(T t);

    public final synchronized void c() {
        while (!this.a.isEmpty()) {
            b(this.a.poll());
        }
        this.b = false;
    }
}
