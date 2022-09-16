package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agsd  reason: default package */
/* loaded from: classes.dex */
public final class agsd implements ynl {
    public final axnm a;
    public final azqb b;
    public final azqb c;
    public final azqb d;
    public final yni e;
    public final afvn f;
    public final ScheduledExecutorService g;
    public boolean i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private int m = 0;
    public final AtomicReference h = new AtomicReference();

    public agsd(azqb azqbVar, axnm axnmVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, yni yniVar, afvn afvnVar, azqb azqbVar6, ScheduledExecutorService scheduledExecutorService) {
        this.j = azqbVar;
        this.a = axnmVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.k = azqbVar5;
        this.e = yniVar;
        this.f = afvnVar;
        this.l = azqbVar6;
        this.g = scheduledExecutorService;
    }

    public final void a() {
        agsg agsgVar = (agsg) this.h.get();
        if (agsgVar != null) {
            agsgVar.f();
            this.h.set(null);
        }
    }

    public final void b() {
        if (this.f.t()) {
            e(this.f.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(agsg agsgVar, Collection collection) {
        amuk<String> o;
        if (collection.isEmpty()) {
            return;
        }
        aajs c = ((aahf) this.k.get()).a(agsgVar.a).c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            agrv agrvVar = (agrv) it.next();
            if (!agrvVar.i) {
                String d = aakj.d(169, agrvVar.a);
                d.getClass();
                aqxo.z(!d.isEmpty(), "key cannot be empty");
                aopa createBuilder = atrj.a.createBuilder();
                createBuilder.copyOnWrite();
                atrj atrjVar = (atrj) createBuilder.instance;
                atrjVar.b |= 1;
                atrjVar.c = d;
                atrg atrgVar = new atrg(createBuilder);
                atrf atrfVar = agrvVar.c;
                aopa aopaVar = atrgVar.a;
                aopaVar.copyOnWrite();
                atrj atrjVar2 = (atrj) aopaVar.instance;
                atrfVar.getClass();
                atrjVar2.d = atrfVar;
                atrjVar2.b |= 2;
                Long valueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(agrvVar.d));
                aopa aopaVar2 = atrgVar.a;
                long longValue = valueOf.longValue();
                aopaVar2.copyOnWrite();
                atrj atrjVar3 = (atrj) aopaVar2.instance;
                atrjVar3.b |= 4;
                atrjVar3.e = longValue;
                String str = agrvVar.g;
                aopa aopaVar3 = atrgVar.a;
                aopaVar3.copyOnWrite();
                atrj atrjVar4 = (atrj) aopaVar3.instance;
                str.getClass();
                atrjVar4.b |= 8;
                atrjVar4.f = str;
                Integer valueOf2 = Integer.valueOf(agrvVar.e.get());
                aopa aopaVar4 = atrgVar.a;
                int intValue = valueOf2.intValue();
                aopaVar4.copyOnWrite();
                atrj atrjVar5 = (atrj) aopaVar4.instance;
                atrjVar5.b |= 64;
                atrjVar5.k = intValue;
                Boolean valueOf3 = Boolean.valueOf(agrvVar.j);
                aopa aopaVar5 = atrgVar.a;
                boolean booleanValue = valueOf3.booleanValue();
                aopaVar5.copyOnWrite();
                atrj atrjVar6 = (atrj) aopaVar5.instance;
                atrjVar6.b |= 128;
                atrjVar6.l = booleanValue;
                if (agrvVar.a().h()) {
                    aopa aopaVar6 = atrgVar.a;
                    aopaVar6.copyOnWrite();
                    atrj atrjVar7 = (atrj) aopaVar6.instance;
                    atrjVar7.b |= 16;
                    atrjVar7.g = (String) agrvVar.a().c();
                }
                if (agrvVar.b().h()) {
                    aopa aopaVar7 = atrgVar.a;
                    aopaVar7.copyOnWrite();
                    atrj atrjVar8 = (atrj) aopaVar7.instance;
                    atrjVar8.b |= 32;
                    atrjVar8.i = (String) agrvVar.b().c();
                }
                if (agrvVar.d() && (o = amuk.o(agrvVar.f)) != null && !o.isEmpty()) {
                    for (String str2 : o) {
                        aopa aopaVar8 = atrgVar.a;
                        aopaVar8.copyOnWrite();
                        atrj atrjVar9 = (atrj) aopaVar8.instance;
                        str2.getClass();
                        aopu aopuVar = atrjVar9.h;
                        if (!aopuVar.c()) {
                            atrjVar9.h = aopi.mutableCopy(aopuVar);
                        }
                        atrjVar9.h.add(str2);
                    }
                }
                c.d(atrgVar.a(((aahf) this.k.get()).a(this.f.c())));
            } else {
                c.g(aakj.d(169, agrvVar.a));
            }
        }
        if (!agsgVar.a.d().equals(this.f.c().d())) {
            return;
        }
        try {
            c.b().T();
        } catch (RuntimeException e) {
            zep.d("[Offline] orchestration error writing to store", e);
            a();
            int i = this.m;
            this.m = i + 1;
            if (i >= 5) {
                return;
            }
            b();
        }
    }

    public final void d(atrf atrfVar) {
        if (this.h.get() == null) {
            b();
        }
        agsg agsgVar = (agsg) this.h.get();
        if (agsgVar == null) {
            throw new agse("No active identity");
        }
        c(agsgVar, agsgVar.c(((agrz) this.j.get()).a(atrfVar, null), null));
        ((agsj) this.a.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(afvm afvmVar) {
        agsg agsgVar = (agsg) this.h.get();
        if (agsgVar == null || !agsgVar.a.b().equals(afvmVar.b())) {
            try {
                agsh agshVar = (agsh) this.l.get();
                yrj yrjVar = (yrj) agshVar.a.get();
                yrjVar.getClass();
                acsf acsfVar = (acsf) agshVar.b.get();
                acsfVar.getClass();
                agrz agrzVar = (agrz) agshVar.c.get();
                agrzVar.getClass();
                afvmVar.getClass();
                agsg agsgVar2 = new agsg(yrjVar, acsfVar, agrzVar, afvmVar);
                agsgVar2.e = new agsa(this);
                aahe a = ((aahf) this.k.get()).a(agsgVar2.a);
                amuk amukVar = (amuk) a.j(169).U();
                HashSet hashSet = new HashSet();
                int size = amukVar.size();
                for (int i = 0; i < size; i++) {
                    atri atriVar = (atri) a.f((String) amukVar.get(i)).W();
                    if (atriVar != null) {
                        agrv agrvVar = new agrv(atriVar);
                        if (agrvVar.d()) {
                            agsgVar2.b.put(agrvVar.a, agrvVar);
                        } else if (agrvVar.b().h()) {
                            String str = (String) agrvVar.b().c();
                            if (!agsgVar2.c.containsKey(str)) {
                                agsgVar2.c.put(str, new HashSet());
                            }
                            ((Set) agsgVar2.c.get(str)).add(agrvVar);
                        } else {
                            hashSet.add(agrvVar);
                        }
                    }
                }
                agsgVar2.j(hashSet);
                this.h.set(agsgVar2);
            } catch (RuntimeException e) {
                zep.d("Couldn't initialize orchestration queue", e);
                afus.c(2, 28, "Couldn't initialize orchestration queue", e);
            }
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                this.g.execute(new Runnable() { // from class: agsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        agsd agsdVar = agsd.this;
                        agsdVar.e(agsdVar.f.c());
                    }
                });
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                agsj agsjVar = (agsj) this.a.get();
                ankt anktVar = agsjVar.a;
                if (anktVar != null && !anktVar.isDone()) {
                    agsjVar.a.cancel(true);
                }
                a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
