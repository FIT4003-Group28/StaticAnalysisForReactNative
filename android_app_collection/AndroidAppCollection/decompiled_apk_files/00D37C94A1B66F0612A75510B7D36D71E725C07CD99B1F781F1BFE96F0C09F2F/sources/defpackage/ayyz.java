package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayyz  reason: default package */
/* loaded from: classes2.dex */
public final class ayyz extends ayua {
    final aypx c;
    final Callable d;

    public ayyz(aynx aynxVar, Callable callable, aypx aypxVar) {
        super(aynxVar);
        this.c = aypxVar;
        this.d = callable;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        try {
            Object obj = ((ayqy) this.d).a;
            ayrd.b(obj, "The seed supplied is null");
            this.b.ac(new ayyy(bameVar, this.c, obj, aynx.a));
        } catch (Throwable th) {
            bapv.j(th);
            azoc.f(th, bameVar);
        }
    }
}
