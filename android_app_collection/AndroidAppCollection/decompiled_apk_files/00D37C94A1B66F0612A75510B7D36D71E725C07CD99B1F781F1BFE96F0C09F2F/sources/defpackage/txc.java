package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: txc  reason: default package */
/* loaded from: classes4.dex */
public final class txc implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public txc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final txb get() {
        return new txb(((txh) this.a).get(), (snc) this.b.get(), (trv) this.c.get(), (ampq) this.d.get(), (Executor) this.e.get());
    }
}
