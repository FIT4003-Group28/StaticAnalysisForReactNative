package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: agl  reason: default package */
/* loaded from: classes.dex */
public final class agl {
    public final ArrayDeque<agj> a;
    private final Runnable b;

    public agl() {
        this(null);
    }

    public final void a() {
        Iterator<agj> descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            agj next = descendingIterator.next();
            if (next.b) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public agl(Runnable runnable) {
        this.a = new ArrayDeque<>();
        this.b = runnable;
    }
}
