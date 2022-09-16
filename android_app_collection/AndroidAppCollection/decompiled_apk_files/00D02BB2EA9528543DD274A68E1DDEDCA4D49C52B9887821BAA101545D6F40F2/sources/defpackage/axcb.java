package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axcb  reason: default package */
/* loaded from: classes3.dex */
public final class axcb implements btzi<dviq, dviw> {
    final /* synthetic */ long a;
    final /* synthetic */ awwt b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Executor d;
    final /* synthetic */ Map e;
    final /* synthetic */ Map f;
    final /* synthetic */ axce g;
    final /* synthetic */ btlu h;
    final /* synthetic */ axcf i;

    public axcb(axcf axcfVar, long j, awwt awwtVar, boolean z, Executor executor, Map map, Map map2, axce axceVar, btlu btluVar) {
        this.i = axcfVar;
        this.a = j;
        this.b = awwtVar;
        this.c = z;
        this.d = executor;
        this.e = map;
        this.f = map2;
        this.g = axceVar;
        this.h = btluVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dviq> btzrVar, btzy btzyVar) {
        this.i.c(btzyVar, btzrVar.a, this.g, this.h, this.b.b(), this.f);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dviq> btzrVar, dviw dviwVar) {
        dviw dviwVar2 = dviwVar;
        int i = dviwVar2.Z;
        if (i > 0) {
            long j = this.a;
            long j2 = i;
            List<awwl> n = this.b.n();
            boolean z = this.c;
            Executor executor = this.d;
            btzw btzwVar = btzrVar.e;
            if (btzwVar != null) {
                deha.q(btzwVar.a(), new axcc(n, j, btzrVar, j2, z), executor);
            }
        }
        Runnable j3 = this.b.j();
        if (!this.c && j3 != null) {
            j3.run();
        }
        dcpd<awvv<?>> it = this.b.b().iterator();
        while (it.hasNext()) {
            awvv<?> next = it.next();
            awwa awwaVar = awwy.a(next).l(dviwVar2) == 2 ? awwa.DATA_COMPLETE_FROM_SERVER : ((awwa) this.e.get(next)) == awwa.DATA_COMPLETE_FROM_CACHE_REFETCH_IN_PROGRESS ? awwa.DATA_COMPLETE_FROM_CACHE_REFETCH_FAILED : awwa.DATA_INCOMPLETE_FETCH_FAILED;
            this.i.d(next, awwaVar);
            this.f.put(next, awwaVar);
        }
        if (this.b.b().contains(awvv.e) && awwy.a(awvv.e).l(dviwVar2) == 2) {
            dxio<akgd> dxioVar = this.i.d;
            dccx F = dcdc.F();
            dccx F2 = dcdc.F();
            dccx F3 = dcdc.F();
            dvih dvihVar = btzrVar.a.p;
            if (dvihVar == null) {
                dvihVar = dvih.d;
            }
            for (dpwv dpwvVar : dvihVar.b) {
                F2.g(dpwvVar.b);
            }
            dvhs dvhsVar = dviwVar2.A;
            if (dvhsVar == null) {
                dvhsVar = dvhs.d;
            }
            for (ditt dittVar : dvhsVar.b) {
                if ((dittVar.a & 2048) != 0) {
                    F.g(akgc.b(dittVar));
                } else {
                    F3.g(dittVar.c);
                }
            }
            dxioVar.a().b(F2.f(), F.f(), F3.f());
        }
        this.g.a(dviwVar2, btzrVar.a, this.h, (int) TimeUnit.MILLISECONDS.toSeconds(this.i.a.b()), this.f);
    }
}
