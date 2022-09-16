package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aabt  reason: default package */
/* loaded from: classes.dex */
public final class aabt {
    public final ScheduledExecutorService a;
    public final afvn b;
    public final afwe c;
    public final aasw d;
    public final aasz e;
    public final qys f;
    private final acrq g;

    public aabt(ScheduledExecutorService scheduledExecutorService, acrq acrqVar, afvn afvnVar, afwe afweVar, aasw aaswVar, aasz aaszVar, qys qysVar) {
        this.a = scheduledExecutorService;
        this.g = acrqVar;
        this.b = afvnVar;
        this.c = afweVar;
        this.d = aaswVar;
        this.e = aaszVar;
        this.f = qysVar;
    }

    public static boolean a(zgp zgpVar, String str) {
        return zgpVar.d(str) != null;
    }

    public final void b(int i) {
        aopa createBuilder = arcx.a.createBuilder();
        createBuilder.copyOnWrite();
        arcx arcxVar = (arcx) createBuilder.instance;
        arcxVar.c = i - 1;
        arcxVar.b |= 1;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cA((arcx) createBuilder.mo39build());
        this.g.a((arrh) a.mo39build());
    }
}
