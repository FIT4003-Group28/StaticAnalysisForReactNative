package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azif  reason: default package */
/* loaded from: classes2.dex */
public final class azif extends azdm {
    final aypx b;
    final Callable c;

    public azif(ayok ayokVar, Callable callable, aypx aypxVar) {
        super(ayokVar);
        this.b = aypxVar;
        this.c = callable;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            Object obj = ((ayqy) this.c).a;
            ayrd.b(obj, "The seed supplied is null");
            this.a.az(new azie(ayomVar, this.b, obj));
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.h(th, ayomVar);
        }
    }
}
