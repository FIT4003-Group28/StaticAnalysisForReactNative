package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aekq  reason: default package */
/* loaded from: classes.dex */
public final class aekq implements aeld {
    private final aeaf a;
    private final adzz b;
    private final ampg c;
    private final ScheduledExecutorService d;
    private final ScheduledExecutorService e;
    private final aant f;
    private final aekg g;
    private final afjm h;
    private final aelq i;
    private final aadd j;
    private final afkd k;
    private final aeln l;
    private final amqo m;
    private final snc n;
    private final aell o;
    private final aemm p;
    private final aacz q;
    private final afaa r;
    private final afjz s;

    public aekq(aemm aemmVar, aeaf aeafVar, aeai aeaiVar, ampg ampgVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, aant aantVar, aekg aekgVar, afjm afjmVar, aelq aelqVar, aadd aaddVar, aacz aaczVar, afjz afjzVar, afkd afkdVar, aeln aelnVar, afaa afaaVar, amqo amqoVar, snc sncVar, aell aellVar) {
        this.a = aeafVar;
        this.b = aeaiVar;
        this.c = ampgVar;
        this.d = scheduledExecutorService;
        this.e = scheduledExecutorService2;
        this.f = aantVar;
        this.g = aekgVar;
        this.h = afjmVar;
        this.i = aelqVar;
        this.j = aaddVar;
        this.q = aaczVar;
        this.s = afjzVar;
        this.k = afkdVar;
        this.l = aelnVar;
        this.p = aemmVar;
        this.r = afaaVar;
        this.m = amqoVar;
        this.n = sncVar;
        this.o = aellVar;
    }

    @Override // defpackage.aeld
    public final /* bridge */ /* synthetic */ aelb a(aanr aanrVar, aenv aenvVar, aenb aenbVar, aflm aflmVar, aaqk aaqkVar) {
        amqo amqoVar;
        aemm aemmVar = this.p;
        afau afauVar = this.r.a;
        aela aelaVar = null;
        if (afauVar != null) {
            afauVar.q(null);
        }
        aems aemsVar = new aems(aemmVar.c, aemmVar.a, aemmVar.b, aflmVar);
        aeaf aeafVar = this.a;
        adzz adzzVar = this.b;
        Object apply = this.c.apply(aanrVar.b);
        ScheduledExecutorService scheduledExecutorService = this.d;
        ScheduledExecutorService scheduledExecutorService2 = this.e;
        aant aantVar = this.f;
        aekg aekgVar = this.g;
        afjm afjmVar = this.h;
        aelq aelqVar = this.i;
        aadd aaddVar = this.j;
        aacz aaczVar = this.q;
        afjz afjzVar = this.s;
        afkd afkdVar = this.k;
        aeln aelnVar = this.l;
        amqo amqoVar2 = this.m;
        if (aenbVar == null || aaqkVar == null) {
            amqoVar = amqoVar2;
        } else {
            amqoVar = amqoVar2;
            aelaVar = new aela(aaqkVar, aenbVar, aenvVar);
        }
        aeks aeksVar = new aeks(aanrVar, aemsVar, aeafVar, adzzVar, (atb) apply, scheduledExecutorService, scheduledExecutorService2, aantVar, aekgVar, afjmVar, aelqVar, aaddVar, aaczVar, afjzVar, afkdVar, aelnVar, amqoVar, aenvVar, aflmVar, aelaVar, this.n, this.o, ampq.i(aenbVar), ampq.i(aaqkVar));
        String str = aanrVar.g;
        if (str != null) {
            aeksVar.f(str);
        }
        return aeksVar;
    }
}
