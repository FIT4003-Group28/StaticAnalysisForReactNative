package defpackage;

import com.google.geo.imagery.viewer.api.PhotoHandle;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dfrb  reason: default package */
/* loaded from: classes6.dex */
public final class dfrb extends dfqz {
    private static final AtomicInteger p = new AtomicInteger();
    public final dfuo l;
    public final dfum m;
    public final dftd n;
    private final int q;
    private final dhjz r;

    public dfrb(Executor executor, Executor executor2, @dzsi dfua dfuaVar, dfuk dfukVar, dfuh dfuhVar, dfrr dfrrVar, dfrh dfrhVar, dfum dfumVar, dfuo dfuoVar, List<dfqz> list, @dzsi dfqt dfqtVar) {
        super(executor, executor2, dfuaVar, dfukVar, dfuhVar, dfrrVar, dfrhVar, list, dfqtVar);
        this.l = dfuoVar;
        this.m = dfumVar;
        this.q = p.getAndIncrement();
        dhjz dhjzVar = this.e.e.b;
        this.r = dhjzVar == null ? dhjz.e : dhjzVar;
        PhotoHandle a = dfrhVar.a();
        this.n = a != null ? a.b() : dftd.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dfqz
    public final void b(PhotoHandle photoHandle, @dzsi dfqt dfqtVar) {
        dfuj<?> dfujVar;
        if (dfqtVar != null) {
            dhjz dhjzVar = this.e.e.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            dfqtVar.c(9, dhjzVar);
        }
        synchronized (this.k) {
            dfujVar = this.j;
        }
        dhjz dhjzVar2 = this.e.e.b;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        float c = (float) dfug.c(dhjzVar2, this.r);
        if (dfujVar != null) {
            dfrh dfrhVar = this.i;
            Runnable e = e(dfqtVar, dfujVar, c);
            int i = this.q;
            if (dfrhVar.d() || !dfrhVar.j.g(photoHandle, e, i)) {
                return;
            }
            dfrhVar.h.a(350L);
        }
    }
}
