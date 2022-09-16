package com.google.apps.tiktok.concurrent.futuresmixin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FuturesMixinImpl extends amfh implements f {
    private final Executor a;
    private final azqb b;
    private final apu c;
    private final amfj d = new amfj();
    private boolean e = false;
    private boolean f = false;
    private final Set g = new HashSet();

    public FuturesMixinImpl(azqb azqbVar, apu apuVar, Executor executor) {
        this.b = azqbVar;
        this.a = executor;
        apuVar.c(this);
        this.c = apuVar;
    }

    private final amfn i() {
        amfn amfnVar = (amfn) ((eo) this.b.get()).f("FuturesMixinFragmentTag");
        if (amfnVar == null) {
            amfnVar = new amfn();
            ex l = ((eo) this.b.get()).l();
            l.r(amfnVar, "FuturesMixinFragmentTag");
            l.d();
        }
        amfnVar.a = this.a;
        return amfnVar;
    }

    private final void j() {
        amfn i = i();
        Iterator it = this.g.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            amfi amfiVar = (amfi) it.next();
            amfe amfeVar = i.b;
            uwp.f();
            Class<?> cls = amfiVar.getClass();
            if (amfeVar.d.containsKey(cls)) {
                if (amfeVar.c.put(Integer.valueOf(((Integer) amfeVar.d.get(cls)).intValue()), amfiVar) != null) {
                    z = false;
                }
                aqxo.B(z, "Attempted to register the callback class % twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices", cls);
            } else {
                int andIncrement = amfe.a.getAndIncrement();
                afw afwVar = amfeVar.d;
                Integer valueOf = Integer.valueOf(andIncrement);
                afwVar.put(cls, valueOf);
                amfeVar.c.put(valueOf, amfiVar);
            }
        }
        this.g.clear();
        this.f = true;
        uwp.i(this.d);
        this.d.a.clear();
        this.e = true;
        i.a.getClass();
        i.d = true;
        amfe amfeVar2 = i.b;
        uwp.f();
        for (Map.Entry entry : amfeVar2.d.entrySet()) {
            aqxo.B(amfeVar2.c.containsKey(entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
        for (ParcelableFuture parcelableFuture : i.c) {
            if (!parcelableFuture.b) {
                amfi amfiVar2 = (amfi) i.b.a(parcelableFuture.a);
                amlp m = amna.m("onPending FuturesMixin", amls.a);
                try {
                    Object obj = parcelableFuture.c;
                    m.close();
                } catch (Throwable th) {
                    try {
                        m.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } else {
                try {
                    i.b.a(parcelableFuture.a);
                } catch (NullPointerException e) {
                    String valueOf2 = String.valueOf(parcelableFuture);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                    sb.append("future=");
                    sb.append(valueOf2);
                    throw new IllegalStateException(sb.toString(), e);
                }
            }
            parcelableFuture.b(i);
        }
    }

    @Override // defpackage.amfh
    public final void g(amfi amfiVar) {
        uwp.f();
        aqxo.z(!this.f, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        aqxo.z(!this.c.a().a(apt.STARTED), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        aqxo.z(!this.e, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        this.g.add(amfiVar);
    }

    @Override // defpackage.amfh
    public final void h(amfg amfgVar, amff amffVar, amfi amfiVar) {
        uwp.f();
        boolean z = true;
        aqxo.z(!((eo) this.b.get()).Z(), "Listen called outside safe window. State loss is possible.");
        amfn i = i();
        ankt anktVar = amfgVar.a;
        Object obj = amffVar.a;
        uwp.f();
        WeakHashMap weakHashMap = amna.a;
        amfe amfeVar = i.b;
        uwp.f();
        Integer num = (Integer) amfeVar.d.get(amfiVar.getClass());
        aqxo.B(num != null, "The callback %s has not been registered", amfiVar.getClass());
        if (amfeVar.a(num.intValue()) != amfiVar) {
            z = false;
        }
        aqxo.B(z, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", amfiVar.getClass());
        ParcelableFuture parcelableFuture = new ParcelableFuture(num.intValue(), obj, anktVar);
        i.c.add(parcelableFuture);
        if (i.d) {
            parcelableFuture.b(i);
            anktVar.isDone();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        if (!this.e) {
            j();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (this.e) {
            amfn i = i();
            i.d = false;
            for (ParcelableFuture parcelableFuture : i.c) {
                parcelableFuture.b(null);
            }
            this.e = false;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        aqxo.z(!this.e, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        j();
    }
}
