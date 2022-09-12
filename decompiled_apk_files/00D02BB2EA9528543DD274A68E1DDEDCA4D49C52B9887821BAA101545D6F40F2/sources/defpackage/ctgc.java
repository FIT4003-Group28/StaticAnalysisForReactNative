package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: ctgc  reason: default package */
/* loaded from: classes5.dex */
public final class ctgc {
    private final ConcurrentMap<Long, cusm> a = dcjz.j();
    private final ConcurrentMap<Long, ctge> b = dcjz.j();
    private final ConcurrentMap<Long, ctir> c = dcjz.j();
    private final ConcurrentMap<Long, ctgb> d = dcjz.j();
    private final Context e;
    private final ctxo f;
    private final dbsg g;
    private final dbsg h;

    public ctgc(Context context, ctxo ctxoVar, dbsg dbsgVar, dbsg dbsgVar2) {
        this.e = context;
        this.f = ctxoVar;
        this.g = dbsgVar;
        this.h = dbsgVar2;
    }

    public final synchronized cusm a(ctyy ctyyVar) {
        Long valueOf = Long.valueOf(ctyyVar.a());
        if (this.a.containsKey(valueOf)) {
            return this.a.get(valueOf);
        }
        ctim ctimVar = new ctim(this.e, this.f, b(valueOf.longValue()), d(valueOf.longValue()), valueOf.longValue());
        return (cusm) dbsg.j(this.a.putIfAbsent(valueOf, ctimVar)).c(ctimVar);
    }

    public final synchronized ctgb b(long j) {
        ConcurrentMap<Long, ctgb> concurrentMap = this.d;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return this.d.get(valueOf);
        }
        ctgb ctgbVar = new ctgb(this.e, j, this.h);
        return (ctgb) dbsg.j(this.d.putIfAbsent(valueOf, ctgbVar)).c(ctgbVar);
    }

    public final synchronized ctge c(ctyy ctyyVar) {
        Long valueOf = Long.valueOf(ctyyVar.a());
        if (this.b.containsKey(valueOf)) {
            return this.b.get(valueOf);
        }
        ctge ctgeVar = new ctge(this.e, d(valueOf.longValue()), valueOf.longValue());
        return (ctge) dbsg.j(this.b.putIfAbsent(valueOf, ctgeVar)).c(ctgeVar);
    }

    public final synchronized ctir d(long j) {
        ConcurrentMap<Long, ctir> concurrentMap = this.c;
        Long valueOf = Long.valueOf(j);
        if (concurrentMap.containsKey(valueOf)) {
            return this.c.get(valueOf);
        }
        ctir ctirVar = new ctir(b(j));
        return (ctir) dbsg.j(this.c.putIfAbsent(valueOf, ctirVar)).c(ctirVar);
    }
}
