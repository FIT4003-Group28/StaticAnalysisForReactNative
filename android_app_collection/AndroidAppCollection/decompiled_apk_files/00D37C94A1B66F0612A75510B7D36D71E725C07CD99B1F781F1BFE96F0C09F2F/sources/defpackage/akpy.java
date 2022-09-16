package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: akpy  reason: default package */
/* loaded from: classes.dex */
public final class akpy implements aaqw {
    private final azqb a;
    private final azqb b;
    private final aacz c;

    public akpy(azqb azqbVar, azqb azqbVar2, aacz aaczVar) {
        this.c = aaczVar;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        if ((this.c.b().b & 262144) != 0) {
            athd athdVar = this.c.b().o;
            if (athdVar == null) {
                athdVar = athd.a;
            }
            int i = athdVar.b;
            if ((33554432 & i) != 0 && (i & 32768) != 0 && athdVar.n && athdVar.j) {
                arow arowVar = ((aroy) aopaVar.instance).c;
                if (arowVar == null) {
                    arowVar = arow.a;
                }
                aopa mo52toBuilder = arowVar.mo52toBuilder();
                atnw b = ((akpu) this.b.get()).b();
                mo52toBuilder.copyOnWrite();
                arow arowVar2 = (arow) mo52toBuilder.instance;
                arowVar2.Q = b.g;
                arowVar2.d |= 524288;
                aopaVar.copyOnWrite();
                aroy aroyVar = (aroy) aopaVar.instance;
                arow arowVar3 = (arow) mo52toBuilder.mo39build();
                arowVar3.getClass();
                aroyVar.c = arowVar3;
                aroyVar.b |= 1;
            }
            if (!athdVar.r || !athdVar.o) {
                return;
            }
            ankt a = ((amfg) this.a.get()).a();
            if (a.isDone()) {
                try {
                    ampq ampqVar = (ampq) a.get();
                    if (!ampqVar.h()) {
                        return;
                    }
                    arow arowVar4 = ((aroy) aopaVar.instance).c;
                    if (arowVar4 == null) {
                        arowVar4 = arow.a;
                    }
                    aopa mo52toBuilder2 = arowVar4.mo52toBuilder();
                    long longValue = ((Long) ampqVar.c()).longValue();
                    mo52toBuilder2.copyOnWrite();
                    arow arowVar5 = (arow) mo52toBuilder2.instance;
                    arowVar5.d |= 1048576;
                    arowVar5.R = longValue / 1024;
                    aopaVar.copyOnWrite();
                    aroy aroyVar2 = (aroy) aopaVar.instance;
                    arow arowVar6 = (arow) mo52toBuilder2.mo39build();
                    arowVar6.getClass();
                    aroyVar2.c = arowVar6;
                    aroyVar2.b |= 1;
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
    }
}
