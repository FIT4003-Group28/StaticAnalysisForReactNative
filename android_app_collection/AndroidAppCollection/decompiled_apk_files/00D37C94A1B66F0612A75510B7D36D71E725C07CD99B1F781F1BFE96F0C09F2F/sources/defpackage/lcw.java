package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: lcw  reason: default package */
/* loaded from: classes3.dex */
public final class lcw {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public lcw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
    }

    public final lcv a(String str) {
        fnp fnpVar = (fnp) this.a.get();
        fnpVar.getClass();
        acgf acgfVar = (acgf) this.b.get();
        acgfVar.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.get();
        scheduledExecutorService.getClass();
        str.getClass();
        return new lcv(fnpVar, acgfVar, scheduledExecutorService, str, null);
    }
}
