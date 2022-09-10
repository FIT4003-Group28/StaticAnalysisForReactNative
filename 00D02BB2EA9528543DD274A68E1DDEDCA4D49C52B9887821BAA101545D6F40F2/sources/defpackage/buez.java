package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetworkException;
/* compiled from: PG */
/* renamed from: buez  reason: default package */
/* loaded from: classes4.dex */
final class buez extends degs {
    final /* synthetic */ bufa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buez(bufa bufaVar, dehn dehnVar) {
        super(dehnVar);
        this.a = bufaVar;
    }

    private final ExecutionException b(ExecutionException executionException) {
        dtyp dtypVar;
        int i;
        Throwable cause = executionException.getCause();
        if (cause instanceof dyjd) {
            dyjd dyjdVar = (dyjd) cause;
            dyjb dyjbVar = dyjdVar.a;
            dyiy dyiyVar = dyjbVar.p;
            Throwable th = dyjbVar.r;
            if (dyiy.UNAVAILABLE.equals(dyiyVar)) {
                if (th instanceof NetworkException) {
                    i = ((NetworkException) th).getErrorCode();
                    dyhs<dtyp> dyhsVar = bufa.a;
                } else {
                    i = 0;
                }
                ((ckco) this.a.b.a(ckip.ap)).a(i);
            }
            btzy b = bvgo.a(dyiyVar.r, th).b(dyjdVar);
            dcdg p = dcdn.p();
            dyhw dyhwVar = dyjdVar.b;
            if (dyhwVar != null && (dtypVar = (dtyp) dyhwVar.h(bufa.a)) != null) {
                for (dsok dsokVar : dtypVar.c) {
                    p.f(dsokVar.a, dsokVar.b);
                }
            }
            dcdn b2 = p.b();
            if (!dbsd.a(b.t, b2)) {
                b = new btzy(b.p, b.q, b.r, b.s, b2);
            }
            throw new ExecutionException(dbsj.e(executionException.getMessage()), new btzz(b));
        }
        throw executionException;
    }

    @Override // defpackage.degr, java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get() {
        try {
            return (dssj) super.get();
        } catch (ExecutionException e) {
            throw b(e);
        }
    }

    @Override // defpackage.degr, java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        try {
            return (dssj) super.get(j, timeUnit);
        } catch (ExecutionException e) {
            throw b(e);
        }
    }
}
