package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aime  reason: default package */
/* loaded from: classes.dex */
public final class aime implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public aime(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    public static aimd b(snc sncVar, aine aineVar, aink ainkVar, Executor executor) {
        return new aimd(sncVar, aineVar, ainkVar, executor);
    }

    public static aime c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        return new aime(azqbVar, azqbVar2, azqbVar3, azqbVar4);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aimd get() {
        return b((snc) this.a.get(), ((ainf) this.b).get(), ((ainl) this.c).get(), (Executor) this.d.get());
    }
}
