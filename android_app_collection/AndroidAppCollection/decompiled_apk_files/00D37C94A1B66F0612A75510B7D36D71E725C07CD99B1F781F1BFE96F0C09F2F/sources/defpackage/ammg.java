package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ammg  reason: default package */
/* loaded from: classes.dex */
public final class ammg implements amme, amkl {
    public static final amzy a = amzy.l("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final snc b;
    public final ankx c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e = new AtomicLong(2100000);
    private final amlk f;
    private final azqb g;
    private final amms h;
    private final amky i;

    public ammg(amlk amlkVar, snc sncVar, ankx ankxVar, azqb azqbVar, amms ammsVar, amky amkyVar) {
        this.f = amlkVar;
        this.b = sncVar;
        this.c = ankxVar;
        this.g = azqbVar;
        this.h = ammsVar;
        this.i = amkyVar;
    }

    @Override // defpackage.amkl
    public final Map a() {
        amum h = amup.h();
        for (Map.Entry entry : this.d.entrySet()) {
            h.f((UUID) entry.getKey(), ((amnd) entry.getValue()).a().d);
        }
        return h.b();
    }

    @Override // defpackage.amme
    public final amlv b(String str, amlt amltVar, ammp ammpVar) {
        return c(str, amltVar, this.b.c(), this.b.d(), ammpVar);
    }

    @Override // defpackage.amme
    public final amlv c(String str, amlt amltVar, long j, long j2, ammp ammpVar) {
        amlv a2 = amna.a();
        if (a2 != null) {
            amna.k(a2, str);
        }
        UUID b = this.i.b();
        float f = this.h.a;
        b.getLeastSignificantBits();
        aopa createBuilder = ammq.a.createBuilder();
        long leastSignificantBits = b.getLeastSignificantBits();
        createBuilder.copyOnWrite();
        ammq ammqVar = (ammq) createBuilder.instance;
        ammqVar.b |= 2;
        ammqVar.d = leastSignificantBits;
        long mostSignificantBits = b.getMostSignificantBits();
        createBuilder.copyOnWrite();
        ammq ammqVar2 = (ammq) createBuilder.instance;
        ammqVar2.b |= 1;
        ammqVar2.c = mostSignificantBits;
        createBuilder.copyOnWrite();
        ammq ammqVar3 = (ammq) createBuilder.instance;
        ammqVar3.b |= 4;
        ammqVar3.f = j;
        createBuilder.copyOnWrite();
        ammq ammqVar4 = (ammq) createBuilder.instance;
        ammqVar4.b |= 8;
        ammqVar4.g = j2;
        createBuilder.copyOnWrite();
        ammq ammqVar5 = (ammq) createBuilder.instance;
        ammqVar5.i = ammpVar.d;
        ammqVar5.b |= 32;
        ammq ammqVar6 = (ammq) createBuilder.mo39build();
        long g = ammpVar == ammp.REALTIME ? j2 : this.b.g();
        amnb amnbVar = new amnb(str, amltVar);
        amnd amndVar = new amnd(this, b, ammqVar6, amnbVar, g);
        amlm amlmVar = new amlm(amnbVar, b, amndVar, this.b, g, ammpVar == ammp.UPTIME);
        amlk amlkVar = this.f;
        if (amlkVar.d.compareAndSet(false, true)) {
            amlkVar.c.execute(new amlh(amlkVar));
        }
        amlj amljVar = new amlj(amlmVar, amlkVar.b);
        amlk.a.put(amljVar, Boolean.TRUE);
        amli amliVar = amljVar.a;
        ankx ankxVar = this.c;
        amndVar.d = amliVar;
        amliVar.qY(amndVar, ankxVar);
        this.d.put(b, amndVar);
        amna.e(amlmVar);
        return amlmVar;
    }

    public void d(ammq ammqVar, SparseArray sparseArray, String str) {
        amlv a2 = amna.a();
        amna.e(new amlg(str, amlg.c, amls.a));
        try {
            RuntimeException runtimeException = null;
            for (ammd ammdVar : (Set) this.g.get()) {
                try {
                    ammdVar.b();
                } catch (RuntimeException e) {
                    if (runtimeException == null) {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException == null) {
                return;
            }
            throw runtimeException;
        } finally {
            amna.e(a2);
        }
    }
}
