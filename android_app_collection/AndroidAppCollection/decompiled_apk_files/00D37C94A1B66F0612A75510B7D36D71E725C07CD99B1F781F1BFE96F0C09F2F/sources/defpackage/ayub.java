package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ayub  reason: default package */
/* loaded from: classes2.dex */
public final class ayub extends aynx {
    final aypt b;
    final ayqb c;
    final AtomicInteger d = new AtomicInteger();

    public ayub(aypt ayptVar, ayqb ayqbVar) {
        this.b = ayptVar;
        this.c = ayqbVar;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        this.b.ad(bameVar);
        if (this.d.incrementAndGet() == 1) {
            this.b.ar(this.c);
        }
    }
}
