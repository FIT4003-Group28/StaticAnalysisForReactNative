package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aivm  reason: default package */
/* loaded from: classes.dex */
public final class aivm implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;

    public aivm(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
    }

    public static aivk b(snc sncVar, Executor executor, afkf afkfVar, aivf aivfVar, aadd aaddVar, ScheduledExecutorService scheduledExecutorService) {
        return new aivk(sncVar, executor, afkfVar, aivfVar, aaddVar, scheduledExecutorService);
    }

    public static aivm c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        return new aivm(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final aivk get() {
        return b((snc) this.a.get(), (Executor) this.b.get(), (afkf) this.c.get(), ((aivg) this.d).get(), (aadd) this.e.get(), (ScheduledExecutorService) this.f.get());
    }
}
