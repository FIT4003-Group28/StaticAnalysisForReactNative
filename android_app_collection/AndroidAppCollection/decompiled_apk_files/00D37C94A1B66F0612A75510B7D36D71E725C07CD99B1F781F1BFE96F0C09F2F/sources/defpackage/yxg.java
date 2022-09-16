package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: yxg  reason: default package */
/* loaded from: classes4.dex */
final class yxg implements Callable {
    private final Callable a;
    private final yxb b;
    private final yxj c;

    public yxg(yxb yxbVar, Callable callable) {
        this.a = callable;
        this.b = yxbVar;
        yxj yxjVar = new yxj("SPAWN", yxbVar.f, 2);
        this.c = yxjVar;
        yxbVar.a(yxjVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        yxd.k(this.b);
        this.c.b();
        try {
            return this.a.call();
        } finally {
        }
    }
}
