package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: degb  reason: default package */
/* loaded from: classes6.dex */
public final class degb extends degc {
    final /* synthetic */ degd a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degb(degd degdVar, Callable callable, Executor executor) {
        super(degdVar, executor);
        this.a = degdVar;
        dbsk.s(callable);
        this.c = callable;
    }

    @Override // defpackage.dehm
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.degc
    public final void b(Object obj) {
        this.a.j(obj);
    }

    @Override // defpackage.dehm
    public final Object c() {
        return this.c.call();
    }
}
