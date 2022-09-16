package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afwl  reason: default package */
/* loaded from: classes.dex */
public final class afwl implements afwz {
    protected final ymt a;
    public final Executor b;
    public final snc c;
    private final afsv e;
    private final yqw f;
    private final afvn g;
    private final Set h;

    public afwl(ymt ymtVar, Executor executor, afsv afsvVar, snc sncVar, yqw yqwVar, afvn afvnVar, Set set) {
        ymtVar.getClass();
        this.a = ymtVar;
        executor.getClass();
        this.b = executor;
        afsvVar.getClass();
        this.e = afsvVar;
        sncVar.getClass();
        this.c = sncVar;
        yqwVar.getClass();
        this.f = yqwVar;
        afvnVar.getClass();
        this.g = afvnVar;
        set.getClass();
        this.h = set;
    }

    @Override // defpackage.afwz
    public final synchronized void a() {
        ylr.b();
        long c = this.c.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        yms b = this.a.b();
        while (b.hasNext()) {
            ort ortVar = (ort) b.next();
            if (ortVar.k > c) {
                if (ortVar.l > 0 && ortVar.n + ortVar.o <= c) {
                }
                arrayList.add(new alrz(ortVar.c, ortVar.j));
            }
            arrayList2.add(ortVar.c);
        }
        b.a();
        int i = 0;
        if (arrayList.size() > this.e.c()) {
            int size = arrayList.size() - this.e.c();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((alrz) arrayList.get(i2)).a);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.a.d();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.a.n((String) arrayList2.get(i3));
            }
            this.a.i();
            this.a.f();
        }
        ArrayList<aopa> arrayList3 = new ArrayList();
        yms b2 = this.a.b();
        while (b2.hasNext()) {
            ort ortVar2 = (ort) b2.next();
            if (i < this.e.a()) {
                arrayList3.add(ortVar2.mo52toBuilder());
            }
            i++;
        }
        b2.a();
        this.a.d();
        for (aopa aopaVar : arrayList3) {
            this.a.n(((ort) aopaVar.instance).c);
        }
        this.a.i();
        this.a.f();
        for (final aopa aopaVar2 : arrayList3) {
            ort ortVar3 = (ort) aopaVar2.instance;
            int i4 = ortVar3.l;
            if (i4 > 0) {
                if (i4 <= ortVar3.p.size()) {
                    ort ortVar4 = (ort) aopaVar2.instance;
                    if (c >= ortVar4.m + ortVar4.p.a(i4 - 1)) {
                    }
                }
                d(aopaVar2);
            }
            afzf a = afzj.a(afwi.a, new cez() { // from class: afwh
                @Override // defpackage.cez
                public final void kV(final cff cffVar) {
                    final afwl afwlVar = afwl.this;
                    final aopa aopaVar3 = aopaVar2;
                    afwlVar.b.execute(new Runnable() { // from class: afwk
                        @Override // java.lang.Runnable
                        public final void run() {
                            afwl afwlVar2 = afwl.this;
                            aopa aopaVar4 = aopaVar3;
                            cff cffVar2 = cffVar;
                            ort ortVar5 = (ort) aopaVar4.instance;
                            if (ortVar5.l >= ortVar5.p.size() || ahfc.e(cffVar2)) {
                                return;
                            }
                            ort ortVar6 = (ort) aopaVar4.instance;
                            if (ortVar6.o == 0) {
                                return;
                            }
                            int i5 = ortVar6.l;
                            aopaVar4.copyOnWrite();
                            ort ortVar7 = (ort) aopaVar4.instance;
                            ortVar7.b |= 256;
                            ortVar7.l = i5 + 1;
                            long c2 = afwlVar2.c.c();
                            aopaVar4.copyOnWrite();
                            ort ortVar8 = (ort) aopaVar4.instance;
                            ortVar8.b |= 512;
                            ortVar8.m = c2;
                            afwlVar2.d(aopaVar4);
                        }
                    });
                }
            });
            if (((ort) aopaVar2.instance).n == 0) {
                aopaVar2.copyOnWrite();
                ort ortVar5 = (ort) aopaVar2.instance;
                ortVar5.b |= 1024;
                ortVar5.n = c;
            }
            if ((((ort) aopaVar2.instance).b & 8) == 0) {
                a.kV(new afwg("malformed request proto"));
            } else {
                this.f.a(new afwn((ort) aopaVar2.mo39build(), a, this.c, this.e, this.g, this.h));
            }
        }
    }

    @Override // defpackage.afwz
    public final synchronized void b(afxa afxaVar) {
        ylr.b();
        aopa createBuilder = ort.a.createBuilder();
        String uuid = UUID.randomUUID().toString();
        createBuilder.copyOnWrite();
        ort ortVar = (ort) createBuilder.instance;
        uuid.getClass();
        ortVar.b |= 1;
        ortVar.c = uuid;
        String str = ((afwo) afxaVar).c;
        createBuilder.copyOnWrite();
        ort ortVar2 = (ort) createBuilder.instance;
        ortVar2.b |= 64;
        ortVar2.j = str;
        long j = ((afwo) afxaVar).k;
        createBuilder.copyOnWrite();
        ort ortVar3 = (ort) createBuilder.instance;
        ortVar3.b |= 128;
        ortVar3.k = j;
        long j2 = ((afwo) afxaVar).l;
        createBuilder.copyOnWrite();
        ort ortVar4 = (ort) createBuilder.instance;
        ortVar4.b |= 2048;
        ortVar4.o = j2;
        long c = ((afwo) afxaVar).b.c();
        createBuilder.copyOnWrite();
        ort ortVar5 = (ort) createBuilder.instance;
        ortVar5.b |= 32;
        ortVar5.i = c;
        String str2 = ((yua) afxaVar).d;
        createBuilder.copyOnWrite();
        ort ortVar6 = (ort) createBuilder.instance;
        str2.getClass();
        ortVar6.b |= 8;
        ortVar6.e = str2;
        int i = ((yua) afxaVar).j;
        createBuilder.copyOnWrite();
        ort ortVar7 = (ort) createBuilder.instance;
        ortVar7.b |= 4;
        ortVar7.d = i - 1;
        String d = ((afwo) afxaVar).a.d();
        createBuilder.copyOnWrite();
        ort ortVar8 = (ort) createBuilder.instance;
        ortVar8.b |= 4096;
        ortVar8.q = d;
        List list = ((afwo) afxaVar).m;
        createBuilder.copyOnWrite();
        ort ortVar9 = (ort) createBuilder.instance;
        aopt aoptVar = ortVar9.p;
        if (!aoptVar.c()) {
            ortVar9.p = aopi.mutableCopy(aoptVar);
        }
        aonk.addAll((Iterable) list, (List) ortVar9.p);
        try {
            byte[] qA = ((yua) afxaVar).qA();
            if (qA != null) {
                aoob x = aoob.x(qA);
                createBuilder.copyOnWrite();
                ort ortVar10 = (ort) createBuilder.instance;
                ortVar10.b |= 16;
                ortVar10.h = x;
            }
        } catch (ceq e) {
            String valueOf = String.valueOf(e.getLocalizedMessage());
            zep.b(valueOf.length() != 0 ? "Auth failure: ".concat(valueOf) : new String("Auth failure: "));
        }
        for (Map.Entry entry : ((yua) afxaVar).f().entrySet()) {
            aopa createBuilder2 = orp.a.createBuilder();
            String str3 = (String) entry.getKey();
            createBuilder2.copyOnWrite();
            orp orpVar = (orp) createBuilder2.instance;
            str3.getClass();
            orpVar.b |= 1;
            orpVar.c = str3;
            String str4 = (String) entry.getValue();
            createBuilder2.copyOnWrite();
            orp orpVar2 = (orp) createBuilder2.instance;
            str4.getClass();
            orpVar2.b |= 2;
            orpVar2.d = str4;
            createBuilder.copyOnWrite();
            ort ortVar11 = (ort) createBuilder.instance;
            orp orpVar3 = (orp) createBuilder2.mo39build();
            orpVar3.getClass();
            aopu aopuVar = ortVar11.f;
            if (!aopuVar.c()) {
                ortVar11.f = aopi.mutableCopy(aopuVar);
            }
            ortVar11.f.add(orpVar3);
        }
        for (aswe asweVar : ((afwo) afxaVar).n) {
            int i2 = asweVar.g;
            createBuilder.copyOnWrite();
            ort ortVar12 = (ort) createBuilder.instance;
            aopq aopqVar = ortVar12.g;
            if (!aopqVar.c()) {
                ortVar12.g = aopi.mutableCopy(aopqVar);
            }
            ortVar12.g.g(i2);
        }
        ort ortVar13 = (ort) createBuilder.mo39build();
        this.a.l(ortVar13.c, ortVar13);
    }

    @Override // defpackage.afwz
    public final boolean c() {
        return !this.a.b().hasNext();
    }

    public final void d(final aopa aopaVar) {
        this.b.execute(new Runnable() { // from class: afwj
            @Override // java.lang.Runnable
            public final void run() {
                afwl afwlVar = afwl.this;
                aopa aopaVar2 = aopaVar;
                afwlVar.a.d();
                try {
                    String.format(Locale.US, "Requeue request with %d errors to %s", Integer.valueOf(((ort) aopaVar2.instance).l), ((ort) aopaVar2.instance).e);
                    afwlVar.a.l(((ort) aopaVar2.instance).c, (ort) aopaVar2.mo39build());
                    afwlVar.a.i();
                } finally {
                    afwlVar.a.f();
                }
            }
        });
    }
}
