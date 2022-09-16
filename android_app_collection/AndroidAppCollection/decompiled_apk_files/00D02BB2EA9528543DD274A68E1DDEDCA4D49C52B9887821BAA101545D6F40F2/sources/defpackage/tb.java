package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: tb  reason: default package */
/* loaded from: classes7.dex */
public final class tb<T> {
    private static final Object c = new Object();
    private static Executor d;
    public Executor a;
    private final tt<T> b;

    public tb(tt<T> ttVar) {
        this.b = ttVar;
    }

    public final tc<T> a() {
        if (this.a == null) {
            synchronized (c) {
                if (d == null) {
                    d = Executors.newFixedThreadPool(2);
                }
            }
            this.a = d;
        }
        return new tc<>(this.a, this.b);
    }
}
