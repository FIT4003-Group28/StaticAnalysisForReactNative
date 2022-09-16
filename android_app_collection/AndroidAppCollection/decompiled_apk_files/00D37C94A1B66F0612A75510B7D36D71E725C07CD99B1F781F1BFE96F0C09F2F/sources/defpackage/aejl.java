package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: aejl  reason: default package */
/* loaded from: classes.dex */
public final class aejl implements afht {
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    private final afgz b;
    private final aflf c;
    private final ExecutorService d;
    private final Function e;

    public aejl(afle afleVar, afgz afgzVar, afld afldVar, ExecutorService executorService, Function function) {
        this.b = afgzVar;
        this.d = executorService;
        this.e = function;
        this.c = afleVar.a(afldVar, 6);
    }

    public static final void d(afhr afhrVar, int i, afkn afknVar) {
        aopa createBuilder = aeiq.a.createBuilder();
        createBuilder.copyOnWrite();
        aeiq aeiqVar = (aeiq) createBuilder.instance;
        aeiqVar.b |= 1;
        aeiqVar.c = i;
        adzc b = afknVar.b();
        createBuilder.copyOnWrite();
        aeiq aeiqVar2 = (aeiq) createBuilder.instance;
        b.getClass();
        aeiqVar2.d = b;
        aeiqVar2.b |= 2;
        try {
            aeir aeirVar = (aeir) aopi.parseFrom(aeir.a, afhrVar.a.a("netFailed", ((aeiq) createBuilder.mo39build()).toByteArray()), aoos.b());
        } catch (aopx e) {
            throw new RuntimeException("Unexpected protobuf error", e);
        }
    }

    @Override // defpackage.afht
    public final aeih a(aeig aeigVar) {
        this.a.remove(Integer.valueOf(aeigVar.b));
        return aeih.a;
    }

    @Override // defpackage.afht
    public final aejn b(final aejm aejmVar) {
        final int i = aejmVar.b;
        int size = this.a.size();
        final afhr afhrVar = (afhr) this.e.apply(aejmVar);
        if (size >= 12) {
            afkj.e(afki.NET, "NetworkClient inProgressFetchIds size %d exceeds limit.", Integer.valueOf(size));
            afkk afkkVar = new afkk("net", 0L);
            afkkVar.b = "network queue full";
            afkkVar.c = new Throwable();
            d(afhrVar, i, afkkVar.a());
            return aejn.a;
        }
        Set set = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!set.add(valueOf)) {
            afkj.e(afki.NET, "Duplicated fetch ID in NetworkClient: %d", valueOf);
        }
        HashMap hashMap = new HashMap();
        for (aein aeinVar : aejmVar.d) {
            hashMap.put(aeinVar.c, aeinVar.d);
        }
        asx asxVar = new asx();
        asxVar.b(aejmVar.c);
        asxVar.c = 2;
        asxVar.e = hashMap;
        asxVar.d = aejmVar.e.I();
        final asy a = asxVar.a();
        final asv asvVar = this.c.a;
        this.d.submit(new Runnable() { // from class: aejk
            @Override // java.lang.Runnable
            public final void run() {
                Set set2;
                Integer valueOf2;
                byte[] bArr;
                int g;
                aejl aejlVar = aejl.this;
                asy asyVar = a;
                asv asvVar2 = asvVar;
                int i2 = i;
                aejm aejmVar2 = aejmVar;
                afhr afhrVar2 = afhrVar;
                int i3 = aejmVar2.f;
                try {
                } catch (Throwable th) {
                    try {
                        afkk afkkVar2 = new afkk("player.exception", 0L);
                        afkkVar2.c = th;
                        aejl.d(afhrVar2, i2, afkkVar2.a());
                        set2 = aejlVar.a;
                    } catch (Throwable th2) {
                        aejlVar.a.remove(Integer.valueOf(i2));
                        pxi.I(asvVar2);
                        throw th2;
                    }
                }
                if (aejlVar.a.contains(Integer.valueOf(i2))) {
                    try {
                        asvVar2.h(asyVar);
                        try {
                        } catch (aeht e) {
                            afkk afkkVar3 = new afkk("net", 0L);
                            afkkVar3.c = e;
                            aejl.d(afhrVar2, i2, afkkVar3.a());
                        }
                    } catch (IOException e2) {
                        aejl.d(afhrVar2, i2, aejlVar.c(e2));
                    }
                    if (!aehx.c(asvVar2.a())) {
                        aejl.d(afhrVar2, i2, aejlVar.c(new ate("Response not UMP.", asyVar, 1)));
                    } else {
                        aopa createBuilder = aeis.a.createBuilder();
                        createBuilder.copyOnWrite();
                        aeis aeisVar = (aeis) createBuilder.instance;
                        aeisVar.b |= 1;
                        aeisVar.c = i2;
                        createBuilder.copyOnWrite();
                        aeis aeisVar2 = (aeis) createBuilder.instance;
                        aeisVar2.b |= 2;
                        aeisVar2.d = 200;
                        Map a2 = asvVar2.a();
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : a2.entrySet()) {
                            for (String str : (List) entry.getValue()) {
                                aopa createBuilder2 = aein.a.createBuilder();
                                String str2 = (String) entry.getKey();
                                createBuilder2.copyOnWrite();
                                aein aeinVar2 = (aein) createBuilder2.instance;
                                str2.getClass();
                                aeinVar2.b |= 1;
                                aeinVar2.c = str2;
                                createBuilder2.copyOnWrite();
                                aein aeinVar3 = (aein) createBuilder2.instance;
                                str.getClass();
                                aeinVar3.b |= 2;
                                aeinVar3.d = str;
                                arrayList.add((aein) createBuilder2.mo39build());
                            }
                        }
                        createBuilder.copyOnWrite();
                        aeis aeisVar3 = (aeis) createBuilder.instance;
                        aopu aopuVar = aeisVar3.e;
                        if (!aopuVar.c()) {
                            aeisVar3.e = aopi.mutableCopy(aopuVar);
                        }
                        aonk.addAll((Iterable) arrayList, (List) aeisVar3.e);
                        try {
                            aeit aeitVar = (aeit) aopi.parseFrom(aeit.a, afhrVar2.a.a("netPushHttpResponse", ((aeis) createBuilder.mo39build()).toByteArray()), aoos.b());
                            while (true) {
                                try {
                                    Set set3 = aejlVar.a;
                                    valueOf2 = Integer.valueOf(i2);
                                    if (!set3.contains(valueOf2) || (g = asvVar2.g((bArr = new byte[i3]), 0, i3)) == -1) {
                                        break;
                                    }
                                    aopa createBuilder3 = aeiu.a.createBuilder();
                                    createBuilder3.copyOnWrite();
                                    aeiu aeiuVar = (aeiu) createBuilder3.instance;
                                    aeiuVar.b |= 1;
                                    aeiuVar.c = i2;
                                    aoob x = aoob.x(bArr);
                                    createBuilder3.copyOnWrite();
                                    aeiu aeiuVar2 = (aeiu) createBuilder3.instance;
                                    aeiuVar2.b |= 2;
                                    aeiuVar2.d = x;
                                    createBuilder3.copyOnWrite();
                                    aeiu aeiuVar3 = (aeiu) createBuilder3.instance;
                                    aeiuVar3.b |= 4;
                                    aeiuVar3.e = 0;
                                    createBuilder3.copyOnWrite();
                                    aeiu aeiuVar4 = (aeiu) createBuilder3.instance;
                                    aeiuVar4.b |= 8;
                                    aeiuVar4.f = g;
                                    try {
                                        aeiv aeivVar = (aeiv) aopi.parseFrom(aeiv.a, afhrVar2.a.a("netPush", ((aeiu) createBuilder3.mo39build()).toByteArray()), aoos.b());
                                    } catch (aopx e3) {
                                        throw new RuntimeException("Unexpected protobuf error", e3);
                                    }
                                } catch (IOException e4) {
                                    aejl.d(afhrVar2, i2, aejlVar.c(e4));
                                }
                            }
                            if (aejlVar.a.contains(valueOf2)) {
                                aopa createBuilder4 = aeio.a.createBuilder();
                                createBuilder4.copyOnWrite();
                                aeio aeioVar = (aeio) createBuilder4.instance;
                                aeioVar.b |= 1;
                                aeioVar.c = i2;
                                try {
                                    aeip aeipVar = (aeip) aopi.parseFrom(aeip.a, afhrVar2.a.a("netDone", ((aeio) createBuilder4.mo39build()).toByteArray()), aoos.b());
                                } catch (aopx e5) {
                                    throw new RuntimeException("Unexpected protobuf error", e5);
                                }
                            }
                            set2 = aejlVar.a;
                            set2.remove(Integer.valueOf(i2));
                            pxi.I(asvVar2);
                        } catch (aopx e6) {
                            throw new RuntimeException("Unexpected protobuf error", e6);
                        }
                    }
                    afkk afkkVar22 = new afkk("player.exception", 0L);
                    afkkVar22.c = th;
                    aejl.d(afhrVar2, i2, afkkVar22.a());
                    set2 = aejlVar.a;
                    set2.remove(Integer.valueOf(i2));
                    pxi.I(asvVar2);
                }
                set2 = aejlVar.a;
                set2.remove(Integer.valueOf(i2));
                pxi.I(asvVar2);
            }
        });
        return aejn.a;
    }

    public final afkn c(IOException iOException) {
        return this.b.b(iOException);
    }
}
