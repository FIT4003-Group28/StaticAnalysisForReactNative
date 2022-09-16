package defpackage;

import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: aemt  reason: default package */
/* loaded from: classes.dex */
public final class aemt implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;

    public aemt(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
    }

    public static aemt b(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        return new aemt(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5);
    }

    public static aemm c(ExecutorService executorService, ExecutorService executorService2, snc sncVar, aadd aaddVar, aacz aaczVar) {
        return new aemm(executorService, executorService2, sncVar, aaddVar, aaczVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aemm get() {
        return c((ExecutorService) this.a.get(), (ExecutorService) this.b.get(), (snc) this.c.get(), (aadd) this.d.get(), (aacz) this.e.get());
    }
}
