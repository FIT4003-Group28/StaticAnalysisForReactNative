package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azds  reason: default package */
/* loaded from: classes2.dex */
public final class azds extends ayoi {
    final azot a;
    final ayqb b;
    final AtomicInteger c = new AtomicInteger();

    public azds(azot azotVar, ayqb ayqbVar) {
        this.a = azotVar;
        this.b = ayqbVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        this.a.az(ayomVar);
        if (this.c.incrementAndGet() == 1) {
            this.a.a(this.b);
        }
    }
}
