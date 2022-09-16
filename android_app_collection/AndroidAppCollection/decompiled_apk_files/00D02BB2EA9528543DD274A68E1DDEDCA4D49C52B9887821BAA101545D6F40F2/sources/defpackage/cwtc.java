package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwtc  reason: default package */
/* loaded from: classes.dex */
public final class cwtc implements cwsz {
    private final Context a;
    private final cwrb b;
    private final dzsj<dehq> c;
    private final dzsj<cwuc> d;
    private final dzsj<cwrk> e;
    private final AtomicReference<cwsz> f;
    private final dzsj<Set<cwwr>> g;

    public cwtc(Context context, cwrb cwrbVar, dzsj<dehq> dzsjVar, dzsj<cwuc> dzsjVar2, dzsj<Set<cwwr>> dzsjVar3, dzsj<cwrk> dzsjVar4) {
        AtomicReference<cwsz> atomicReference = new AtomicReference<>();
        this.f = atomicReference;
        int i = cwsy.b;
        dbsk.l(true);
        this.a = context;
        this.b = cwrbVar;
        this.c = dzsjVar;
        this.d = dzsjVar2;
        this.e = dzsjVar4;
        this.g = dzsjVar3;
        cwtb cwtbVar = new cwtb(cwrbVar);
        try {
            WeakHashMap<Thread, dazz> weakHashMap = dbaa.b;
            cwuc a = dzsjVar2.a();
            a.b(cwtbVar);
            if (a.b) {
                b();
                return;
            }
            atomicReference.set(dzsjVar4.a());
            if (a.b) {
                b();
                return;
            }
            for (cwwr cwwrVar : dzsjVar3.a()) {
                a.b(cwwrVar);
                cwwrVar.g();
                if (cwwrVar instanceof cwtw) {
                    cwtw cwtwVar = (cwtw) cwwrVar;
                    synchronized (cwtbVar) {
                        if (!cwtbVar.b) {
                            cwtbVar.a.add(cwtwVar);
                        } else {
                            cwtwVar.c();
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
            b();
        }
    }

    @Override // defpackage.cwsz
    public final dbty<dehq> a() {
        dbty<dehq> a = z().a();
        if (a != null) {
            return a;
        }
        final dzsj<dehq> dzsjVar = this.c;
        dzsjVar.getClass();
        return new dbty(dzsjVar) { // from class: cwta
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a();
            }
        };
    }

    @Override // defpackage.cwsz
    public final void b() {
        cwsz andSet = this.f.getAndSet(new cwsw());
        if (andSet != null) {
            andSet.b();
        }
        try {
            cwrb cwrbVar = this.b;
            Application application = (Application) this.a;
            cwre cwreVar = cwrbVar.a;
            application.unregisterActivityLifecycleCallbacks(cwreVar.a);
            application.unregisterComponentCallbacks(cwreVar.a);
        } catch (RuntimeException unused) {
        }
    }

    @Override // defpackage.cwsz
    public final boolean c(cwud cwudVar) {
        return z().c(cwudVar);
    }

    @Override // defpackage.cwsz
    public final dehn<Void> d(Runnable runnable) {
        return z().d(runnable);
    }

    @Override // defpackage.cwsz
    public final void e() {
        z().e();
    }

    @Override // defpackage.cwsz
    public final void f(String str) {
        z().f(str);
    }

    @Override // defpackage.cwsz
    public final void g(String str) {
        z().g(str);
    }

    @Override // defpackage.cwsz
    public final void h(cxaj cxajVar) {
        z().h(cxajVar);
    }

    @Override // defpackage.cwsz
    public final void i(String str) {
        z().i(str);
    }

    @Override // defpackage.cwsz
    public final void j(String str) {
        z().j(str);
    }

    @Override // defpackage.cwsz
    public final cxdh k() {
        return z().k();
    }

    @Override // defpackage.cwsz
    public final void l() {
        z().l();
    }

    @Override // defpackage.cwsz
    public final void m(String str) {
        z().m(str);
    }

    @Override // defpackage.cwsz
    public final void n(String str, boolean z, @dzsi dzze dzzeVar) {
        z().n(str, z, dzzeVar);
    }

    @Override // defpackage.cwsz
    public final void o(String str) {
        z().o(str);
    }

    @Override // defpackage.cwsz
    public final boolean p() {
        return z().p();
    }

    @Override // defpackage.cwsz
    public final void q(String str) {
        z().q(str);
    }

    @Override // defpackage.cwsz
    public final void r(String str) {
        z().r(str);
    }

    @Override // defpackage.cwsz
    public final void s(String str, dzze dzzeVar) {
        z().s(str, dzzeVar);
    }

    @Override // defpackage.cwsz
    public final void t(String str) {
        z().t(str);
    }

    @Override // defpackage.cwsz
    public final void u(String str, dzze dzzeVar) {
        z().u(str, dzzeVar);
    }

    @Override // defpackage.cwsz
    public final void v(String str, int i) {
        z().v(str, i);
    }

    @Override // defpackage.cwsz
    public final void w(String str, String str2, dzze dzzeVar, int i) {
        z().w(str, str2, dzzeVar, 1);
    }

    @Override // defpackage.cwsz
    public final void x(String str, @dzsi dzze dzzeVar) {
        z().x(str, dzzeVar);
    }

    @Override // defpackage.cwsz
    public final void y(@dzsi cxdh cxdhVar, String str, int i) {
        z().y(cxdhVar, str, i);
    }

    final cwsz z() {
        return this.f.get();
    }
}
