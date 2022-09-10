package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: btwj  reason: default package */
/* loaded from: classes.dex */
public final class btwj extends btvp {
    @dzsi
    public final dxio<ckcw> a;
    private final CountDownLatch b = new CountDownLatch(1);
    private final dxio<btvt> c;
    @dzsi
    private final cqat d;
    @dzsi
    private final Executor e;
    private volatile btvo f;

    public btwj(@dzsi cqat cqatVar, @dzsi Executor executor, @dzsi dxio<ckcw> dxioVar, dxio<btvt> dxioVar2) {
        this.d = cqatVar;
        this.e = executor;
        this.a = dxioVar;
        this.c = dxioVar2;
    }

    private final btvo f(@dzsi final dvgn dvgnVar) {
        if (this.f != null) {
            return this.f;
        }
        if (String.valueOf(dvgnVar == null ? "NO_GROUP" : dvgnVar.name()).length() == 0) {
            new String("ClientParametersBlockingReference.getDelegate: ");
        }
        long e = this.d.e();
        deix.a(this.b);
        final long e2 = this.d.e() - e;
        Executor executor = this.e;
        if (this.a != null) {
            executor.execute(new Runnable(this, dvgnVar, e2) { // from class: btwi
                private final btwj a;
                private final dvgn b;
                private final long c;

                {
                    this.a = this;
                    this.b = dvgnVar;
                    this.c = e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ckha ckhaVar;
                    btwj btwjVar = this.a;
                    dvgn dvgnVar2 = this.b;
                    long j = this.c;
                    ((ckco) btwjVar.a.a().a(ckja.l)).a(dvgnVar2 == null ? -1 : dvgnVar2.ct);
                    ckcw a = btwjVar.a.a();
                    if (dvgnVar2 == null) {
                        ckhaVar = ckja.k;
                    } else {
                        int ordinal = dvgnVar2.ordinal();
                        ckhaVar = ordinal != 2 ? ordinal != 16 ? ordinal != 27 ? ordinal != 53 ? ordinal != 118 ? ckja.j : ckja.e : ckja.i : ckja.h : ckja.g : ckja.f;
                    }
                    ((ckcp) a.a(ckhaVar)).a(j);
                }
            });
        }
        return this.f;
    }

    final synchronized void a(btvo btvoVar) {
        this.f = btvoVar;
        this.b.countDown();
    }

    public final btvo b() {
        return f(null);
    }

    public final synchronized boolean d(@dzsi String str, dspd dspdVar, List<dvgo> list) {
        if (this.f == null) {
            a(new btwq(str, dspdVar, list, this.c));
            return true;
        }
        return e().d(str, dspdVar, list);
    }

    @Override // defpackage.btvo
    public final void dumpInternal(String str, PrintWriter printWriter, List<dvgn> list) {
        b().dumpInternal(str, printWriter, list);
    }

    public final synchronized btwq e() {
        btvo btvoVar;
        if (this.f == null) {
            deix.a(this.b);
        }
        if (this.f instanceof btwq) {
            btvoVar = this.f;
        } else {
            synchronized (this) {
                btwq btwqVar = new btwq(getGmmAccountId(), getNextRequestToken(), new ArrayList(getGroupMap().values()), this.c);
                a(btwqVar);
                btvoVar = btwqVar;
            }
        }
        return (btwq) btvoVar;
    }

    @Override // defpackage.btvo
    public final btvv getExternalInvocationParameters() {
        return b().getExternalInvocationParameters();
    }

    @Override // defpackage.btvo
    @dzsi
    public final String getGmmAccountId() {
        return b().getGmmAccountId();
    }

    @Override // defpackage.btvo
    public final dvgo getGroup(dvgn dvgnVar) {
        return f(dvgnVar).getGroup(dvgnVar);
    }

    @Override // defpackage.btvo
    public final Map<dvgn, dvgo> getGroupMap() {
        return b().getGroupMap();
    }

    @Override // defpackage.btvo
    public final btvx getLoggingInstrumentor() {
        return b().getLoggingInstrumentor();
    }

    @Override // defpackage.btvo
    public final btwd getNavigationParameters() {
        return b().getNavigationParameters();
    }

    @Override // defpackage.btvo
    @dzsi
    public final dspd getNextRequestToken() {
        return b().getNextRequestToken();
    }

    @Override // defpackage.btvo
    public final List<dvgo> getParameterGroupsForRequest() {
        return b().getParameterGroupsForRequest();
    }

    @Override // defpackage.btvo
    public final List<dbsi<String, ?>> getParametersList() {
        return b().getParametersList();
    }
}
