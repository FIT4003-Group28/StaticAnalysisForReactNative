package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anjh  reason: default package */
/* loaded from: classes.dex */
final class anjh extends anji {
    final /* synthetic */ anjj a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anjh(anjj anjjVar, Callable callable, Executor executor) {
        super(anjjVar, executor);
        this.a = anjjVar;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.anks
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.anks
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.anji
    public final void c(Object obj) {
        this.a.o(obj);
    }
}
