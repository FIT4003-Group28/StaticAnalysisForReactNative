package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alaz  reason: default package */
/* loaded from: classes.dex */
public final class alaz {
    public final azqb a;
    public final snc b;
    public final azqb c;
    public final ScheduledExecutorService d;
    public final PriorityQueue e = new PriorityQueue();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Map g = new ConcurrentHashMap();
    public boolean h = false;
    private ScheduledFuture i;

    public alaz(azqb azqbVar, snc sncVar, ScheduledExecutorService scheduledExecutorService, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = sncVar;
        this.d = scheduledExecutorService;
        this.c = azqbVar2;
    }

    public final void a(alax alaxVar) {
        this.f.add(alaxVar);
    }

    public final void b(afvm afvmVar, String str, String str2, String str3) {
        final alay alayVar = new alay(afvmVar, str, str2, this.b.c() + Math.max(0L, 50L), str3);
        this.d.execute(new Runnable() { // from class: alat
            @Override // java.lang.Runnable
            public final void run() {
                alaz alazVar = alaz.this;
                alazVar.e.add(alayVar);
                alazVar.g();
            }
        });
    }

    public final void c() {
        this.d.execute(new alar(this, 1));
    }

    public final void d(avuq avuqVar) {
        String str;
        String str2;
        avuqVar.getClass();
        avup avupVar = avuqVar.c;
        if (avupVar == null) {
            avupVar = avup.a;
        }
        if ((avupVar.b & 1) != 0) {
            avup avupVar2 = avuqVar.c;
            if (avupVar2 == null) {
                avupVar2 = avup.a;
            }
            str = avupVar2.c;
        } else {
            str = null;
        }
        avup avupVar3 = avuqVar.c;
        if (avupVar3 == null) {
            avupVar3 = avup.a;
        }
        if ((avupVar3.b & 2) != 0) {
            avup avupVar4 = avuqVar.c;
            if (avupVar4 == null) {
                avupVar4 = avup.a;
            }
            str2 = avupVar4.d;
        } else {
            str2 = null;
        }
        if (str != null || str2 != null) {
            for (avus avusVar : avuqVar.d) {
                int i = avusVar.b;
                if ((i & 128) != 0) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        alax alaxVar = (alax) it.next();
                        if (avusVar.f == null) {
                            avyw avywVar = avyw.a;
                        }
                        alaxVar.g();
                    }
                } else if ((i & 2) != 0) {
                    Iterator it2 = this.f.iterator();
                    while (it2.hasNext()) {
                        alax alaxVar2 = (alax) it2.next();
                        augw augwVar = avusVar.c;
                        if (augwVar == null) {
                            augwVar = augw.a;
                        }
                        alaxVar2.a(str, str2, augwVar);
                    }
                } else if ((i & 32) != 0) {
                    Iterator it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        alax alaxVar3 = (alax) it3.next();
                        avvd avvdVar = avusVar.d;
                        if (avvdVar == null) {
                            avvdVar = avvd.a;
                        }
                        alaxVar3.d(str, str2, avvdVar);
                    }
                } else if ((i & 64) != 0) {
                    Iterator it4 = this.f.iterator();
                    while (it4.hasNext()) {
                        alax alaxVar4 = (alax) it4.next();
                        avhj avhjVar = avusVar.e;
                        if (avhjVar == null) {
                            avhjVar = avhj.a;
                        }
                        alaxVar4.b(str, str2, avhjVar);
                    }
                } else if ((i & 256) != 0) {
                    Iterator it5 = this.f.iterator();
                    while (it5.hasNext()) {
                        alax alaxVar5 = (alax) it5.next();
                        avtl avtlVar = avusVar.g;
                        if (avtlVar == null) {
                            avtlVar = avtl.a;
                        }
                        alaxVar5.c(str, str2, avtlVar);
                    }
                }
            }
            boolean z = false;
            for (avur avurVar : avuqVar.e) {
                if ((avurVar.b & 2) != 0) {
                    avia aviaVar = avurVar.c;
                    if (aviaVar == null) {
                        aviaVar = avia.a;
                    }
                    avia aviaVar2 = aviaVar;
                    afvm afvmVar = !TextUtils.isEmpty(str) ? (afvm) this.g.get(str) : null;
                    if (afvmVar == null && !TextUtils.isEmpty(str2)) {
                        afvmVar = (afvm) this.g.get(str2);
                    }
                    if (afvmVar == null) {
                        afvmVar = afvl.a;
                    }
                    this.e.add(new alay(afvmVar, str, str2, aviaVar2.c + this.b.c(), aviaVar2.d));
                    int i2 = aviaVar2.c;
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Iterator it6 = this.f.iterator();
            while (it6.hasNext()) {
                ((alax) it6.next()).e(str2);
                e(str, str2);
            }
            return;
        }
        throw new IllegalStateException("Cannot find frontendId or videoId in response");
    }

    public final void e(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.g.remove(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.g.remove(str2);
        }
    }

    public final void f(alax alaxVar) {
        this.f.remove(alaxVar);
    }

    public final void g() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        if (this.h || this.e.isEmpty()) {
            return;
        }
        long c = ((alay) this.e.peek()).d - this.b.c();
        if (c <= 0) {
            this.d.execute(new Runnable() { // from class: alas
                @Override // java.lang.Runnable
                public final void run() {
                    alaz alazVar = alaz.this;
                    afw afwVar = new afw();
                    long c2 = alazVar.b.c();
                    while (!alazVar.e.isEmpty() && ((alay) alazVar.e.peek()).d < 2000 + c2) {
                        alay alayVar = (alay) alazVar.e.poll();
                        List list = (List) afwVar.get(alayVar.a);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(alayVar);
                        afwVar.put(alayVar.a, list);
                        if (afwVar.j == 64) {
                            break;
                        }
                    }
                    alazVar.g();
                    for (afvm afvmVar : afwVar.keySet()) {
                        afvmVar.d().length();
                        List<alay> list2 = (List) afwVar.get(afvmVar);
                        list2.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        aopa createBuilder = asfk.a.createBuilder();
                        for (alay alayVar2 : list2) {
                            if (!TextUtils.isEmpty(alayVar2.b)) {
                                alazVar.g.put(alayVar2.b, afvmVar);
                            }
                            if (!TextUtils.isEmpty(alayVar2.c)) {
                                alazVar.g.put(alayVar2.c, afvmVar);
                            }
                        }
                        for (alay alayVar3 : list2) {
                            if (!TextUtils.isEmpty(alayVar3.e)) {
                                arrayList2.add(alayVar3.e);
                            } else if (!TextUtils.isEmpty(alayVar3.b)) {
                                aopa createBuilder2 = avup.a.createBuilder();
                                String str = alayVar3.b;
                                createBuilder2.copyOnWrite();
                                avup avupVar = (avup) createBuilder2.instance;
                                str.getClass();
                                avupVar.b |= 1;
                                avupVar.c = str;
                                arrayList.add((avup) createBuilder2.mo39build());
                            } else if (!TextUtils.isEmpty(alayVar3.c)) {
                                aopa createBuilder3 = avup.a.createBuilder();
                                String str2 = alayVar3.c;
                                createBuilder3.copyOnWrite();
                                avup avupVar2 = (avup) createBuilder3.instance;
                                str2.getClass();
                                avupVar2.b |= 2;
                                avupVar2.d = str2;
                                arrayList.add((avup) createBuilder3.mo39build());
                            }
                        }
                        createBuilder.copyOnWrite();
                        asfk asfkVar = (asfk) createBuilder.instance;
                        aopu aopuVar = asfkVar.d;
                        if (!aopuVar.c()) {
                            asfkVar.d = aopi.mutableCopy(aopuVar);
                        }
                        aonk.addAll((Iterable) arrayList, (List) asfkVar.d);
                        createBuilder.copyOnWrite();
                        asfk asfkVar2 = (asfk) createBuilder.instance;
                        aopu aopuVar2 = asfkVar2.e;
                        if (!aopuVar2.c()) {
                            asfkVar2.e = aopi.mutableCopy(aopuVar2);
                        }
                        aonk.addAll((Iterable) arrayList2, (List) asfkVar2.e);
                        albc albcVar = (albc) alazVar.c.get();
                        boolean z = ((zdj) alazVar.a.get()).a;
                        alaw alawVar = new alaw(alazVar, list2);
                        aarl aarlVar = albcVar.c;
                        alan alanVar = new alan(albcVar.e, afvmVar, ((asfk) createBuilder.mo39build()).mo52toBuilder());
                        if (!z) {
                            alanVar.r = 3;
                        }
                        alanVar.i();
                        aarlVar.e(alanVar, alawVar);
                    }
                }
            });
        } else {
            this.i = this.d.schedule(new Runnable() { // from class: alas
                @Override // java.lang.Runnable
                public final void run() {
                    alaz alazVar = alaz.this;
                    afw afwVar = new afw();
                    long c2 = alazVar.b.c();
                    while (!alazVar.e.isEmpty() && ((alay) alazVar.e.peek()).d < 2000 + c2) {
                        alay alayVar = (alay) alazVar.e.poll();
                        List list = (List) afwVar.get(alayVar.a);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(alayVar);
                        afwVar.put(alayVar.a, list);
                        if (afwVar.j == 64) {
                            break;
                        }
                    }
                    alazVar.g();
                    for (afvm afvmVar : afwVar.keySet()) {
                        afvmVar.d().length();
                        List<alay> list2 = (List) afwVar.get(afvmVar);
                        list2.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        aopa createBuilder = asfk.a.createBuilder();
                        for (alay alayVar2 : list2) {
                            if (!TextUtils.isEmpty(alayVar2.b)) {
                                alazVar.g.put(alayVar2.b, afvmVar);
                            }
                            if (!TextUtils.isEmpty(alayVar2.c)) {
                                alazVar.g.put(alayVar2.c, afvmVar);
                            }
                        }
                        for (alay alayVar3 : list2) {
                            if (!TextUtils.isEmpty(alayVar3.e)) {
                                arrayList2.add(alayVar3.e);
                            } else if (!TextUtils.isEmpty(alayVar3.b)) {
                                aopa createBuilder2 = avup.a.createBuilder();
                                String str = alayVar3.b;
                                createBuilder2.copyOnWrite();
                                avup avupVar = (avup) createBuilder2.instance;
                                str.getClass();
                                avupVar.b |= 1;
                                avupVar.c = str;
                                arrayList.add((avup) createBuilder2.mo39build());
                            } else if (!TextUtils.isEmpty(alayVar3.c)) {
                                aopa createBuilder3 = avup.a.createBuilder();
                                String str2 = alayVar3.c;
                                createBuilder3.copyOnWrite();
                                avup avupVar2 = (avup) createBuilder3.instance;
                                str2.getClass();
                                avupVar2.b |= 2;
                                avupVar2.d = str2;
                                arrayList.add((avup) createBuilder3.mo39build());
                            }
                        }
                        createBuilder.copyOnWrite();
                        asfk asfkVar = (asfk) createBuilder.instance;
                        aopu aopuVar = asfkVar.d;
                        if (!aopuVar.c()) {
                            asfkVar.d = aopi.mutableCopy(aopuVar);
                        }
                        aonk.addAll((Iterable) arrayList, (List) asfkVar.d);
                        createBuilder.copyOnWrite();
                        asfk asfkVar2 = (asfk) createBuilder.instance;
                        aopu aopuVar2 = asfkVar2.e;
                        if (!aopuVar2.c()) {
                            asfkVar2.e = aopi.mutableCopy(aopuVar2);
                        }
                        aonk.addAll((Iterable) arrayList2, (List) asfkVar2.e);
                        albc albcVar = (albc) alazVar.c.get();
                        boolean z = ((zdj) alazVar.a.get()).a;
                        alaw alawVar = new alaw(alazVar, list2);
                        aarl aarlVar = albcVar.c;
                        alan alanVar = new alan(albcVar.e, afvmVar, ((asfk) createBuilder.mo39build()).mo52toBuilder());
                        if (!z) {
                            alanVar.r = 3;
                        }
                        alanVar.i();
                        aarlVar.e(alanVar, alawVar);
                    }
                }
            }, c, TimeUnit.MILLISECONDS);
        }
    }
}
