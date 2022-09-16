package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: axcf  reason: default package */
/* loaded from: classes.dex */
public final class axcf {
    public final cqat a;
    public final axcg b;
    public final dxio<akfa> c;
    public final dxio<akgd> d;
    private final Map<awvv<?>, axcd> e = new aif();
    private final buon f;
    private final btpc g;
    private final Executor h;

    public axcf(cqat cqatVar, dxio<akfa> dxioVar, buon buonVar, axcg axcgVar, btpc btpcVar, Executor executor, dxio<akgd> dxioVar2) {
        this.a = cqatVar;
        this.b = axcgVar;
        this.c = dxioVar;
        this.f = buonVar;
        this.g = btpcVar;
        this.h = executor;
        this.d = dxioVar2;
    }

    public final synchronized Set<awvv<?>> a(Set<awvv<?>> set, Map<awvv<?>, awwa> map) {
        aih aihVar;
        aihVar = new aih();
        for (awvv<?> awvvVar : set) {
            if (this.e.containsKey(awvvVar)) {
                axcd axcdVar = this.e.get(awvvVar);
                if (this.a.e() < axcdVar.b + axcdVar.c) {
                    map.put(awvvVar, axcdVar.a);
                }
            }
            aihVar.add(awvvVar);
        }
        return aihVar;
    }

    public final void b(boolean z, dviq dviqVar, axce axceVar, awvx awvxVar, Map<awvv<?>, awwa> map, Map<awvv<?>, awwa> map2) {
        btlu j = this.c.a().j();
        if (!this.g.j()) {
            c(btzy.k, dviqVar, axceVar, j, awvxVar.d().b(), new aif());
            return;
        }
        axcb axcbVar = new axcb(this, this.a.e(), awvxVar.d(), z, this.h, map, map2, axceVar, j);
        buac a = this.f.a();
        a.e = j;
        a.f = awvxVar.a().f();
        this.f.c().b(dviqVar, axcbVar, this.h);
    }

    public final void c(btzy btzyVar, @dzsi dviq dviqVar, axce axceVar, @dzsi btlu btluVar, Set<awvv<?>> set, Map<awvv<?>, awwa> map) {
        bttq bttqVar = btzyVar.p;
        for (awvv<?> awvvVar : set) {
            d(awvvVar, awwa.DATA_INCOMPLETE_FETCH_FAILED);
            map.put(awvvVar, awwa.DATA_INCOMPLETE_FETCH_FAILED);
        }
        axceVar.a(null, dviqVar, btluVar, (int) TimeUnit.MILLISECONDS.toSeconds(this.a.b()), map);
    }

    public final synchronized void d(awvv<?> awvvVar, awwa awwaVar) {
        if (awwaVar != awwa.DATA_COMPLETE_FROM_SERVER && awwaVar != awwa.DATA_COMPLETE_FROM_CACHE_NO_REFETCH_NEEDED) {
            if (awwaVar == awwa.DATA_INCOMPLETE_FETCH_FAILED && !this.g.j()) {
                return;
            }
            if (this.e.containsKey(awvvVar)) {
                axcd axcdVar = this.e.get(awvvVar);
                axcdVar.a = awwaVar;
                axcdVar.b = this.a.e();
                long j = axcdVar.c;
                axcdVar.c = Math.min(j + j, 8000L);
                return;
            }
            this.e.put(awvvVar, new axcd(awwaVar, this.a.e()));
            return;
        }
        this.e.remove(awvvVar);
    }
}
