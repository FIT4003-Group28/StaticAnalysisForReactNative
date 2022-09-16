package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azet  reason: default package */
/* loaded from: classes2.dex */
public final class azet extends azdm {
    final ayqe b;
    final Callable c;

    public azet(ayok ayokVar, ayqe ayqeVar, Callable callable) {
        super(ayokVar);
        this.b = ayqeVar;
        this.c = callable;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        try {
            this.a.az(new azes(ayomVar, this.b, ((ayqw) this.c).call()));
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.h(th, ayomVar);
        }
    }
}
