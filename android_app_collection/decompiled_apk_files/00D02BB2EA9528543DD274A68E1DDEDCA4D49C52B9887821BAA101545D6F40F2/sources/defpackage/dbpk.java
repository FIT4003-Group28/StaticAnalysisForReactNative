package defpackage;

import android.os.Parcelable;
import com.google.android.apps.maps.R;
import com.google.common.android.concurrent.FutureCallbackRegistry$FutureListenerLifecycleObserver;
import com.google.common.android.concurrent.ParcelableFuture;
/* compiled from: PG */
/* renamed from: dbpk  reason: default package */
/* loaded from: classes5.dex */
public final class dbpk {
    public final dbty<gn> a;
    private final k b;
    private final dbpe<?> c;
    private final FutureCallbackRegistry$FutureListenerLifecycleObserver d = new e() { // from class: com.google.common.android.concurrent.FutureCallbackRegistry$FutureListenerLifecycleObserver
        private boolean b = false;

        @Override // defpackage.f
        public final void a(m mVar) {
        }

        @Override // defpackage.f
        public final void b(m mVar) {
            dbpk.this.d().e(dbpk.this.a.a());
        }

        @Override // defpackage.f
        public final void c(m mVar) {
            dbpk.this.d().e(dbpk.this.a.a());
            if (!this.b) {
                k Nh = mVar.Nh();
                final dbpk dbpkVar = dbpk.this;
                Nh.a(new e() { // from class: com.google.common.android.concurrent.FutureCallbackRegistry$LaterFutureListenerLifecycleObserver
                    @Override // defpackage.f
                    public final void a(m mVar2) {
                    }

                    @Override // defpackage.f
                    public final void b(m mVar2) {
                    }

                    @Override // defpackage.f
                    public final void c(m mVar2) {
                        dbpk.this.d().g = true;
                    }

                    @Override // defpackage.f
                    public final void d(m mVar2) {
                    }

                    @Override // defpackage.f
                    public final void e(m mVar2) {
                    }

                    @Override // defpackage.f
                    public final void f(m mVar2) {
                    }
                });
                this.b = true;
            }
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
            dbpt d = dbpk.this.d();
            gn a = dbpk.this.a.a();
            boolean z = true;
            dbsk.a(a != null);
            gn gnVar = d.c;
            if (gnVar != null) {
                if (a != gnVar) {
                    z = false;
                }
                dbsk.l(z);
                d.c = null;
                for (ParcelableFuture parcelableFuture : d.b) {
                    parcelableFuture.b(null);
                }
            }
        }

        @Override // defpackage.f
        public final void f(m mVar) {
        }
    };
    private boolean e = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.android.concurrent.FutureCallbackRegistry$FutureListenerLifecycleObserver] */
    private dbpk(k kVar, dbty<gn> dbtyVar, dbpe<?> dbpeVar) {
        boolean z = false;
        dbsk.m(((o) kVar).a == j.INITIALIZED ? true : z, "FutureCallbackRegistry must be created in onCreate of the Activity/Fragment.");
        this.b = kVar;
        this.a = dbtyVar;
        this.c = dbpeVar;
    }

    public static dbpk a(final fd fdVar) {
        fdVar.J();
        o oVar = fdVar.Z;
        fdVar.getClass();
        dbty dbtyVar = new dbty(fdVar) { // from class: dbpf
            private final fd a;

            {
                this.a = fdVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.R();
            }
        };
        dbpe<Object> dbpeVar = dbpe.a;
        dbpi dbpiVar = dbpi.b;
        return new dbpk(oVar, dbtyVar, dbpeVar);
    }

    public static <V extends Parcelable> dbpj<V> c(dehn<V> dehnVar) {
        return new dbpj<>(dehnVar);
    }

    public final <V> void b(dbpj<V> dbpjVar, dbpg<Void, ? super V> dbpgVar) {
        gn a = this.a.a();
        boolean z = false;
        dbsk.m(!a.J() && !a.u, "Called when state-loss is possible.");
        dbpt d = d();
        dbpt.i();
        int i = d.a.i(dbpgVar);
        dbsk.m(i != -1, "Callback not registered.");
        int g = d.a.g(i);
        final ParcelableFuture parcelableFuture = new ParcelableFuture(g, dbpjVar.a);
        dbpt.i();
        dbsk.m(d.a.b(g) != null, "Callback not registered.");
        if (d.c != null) {
            z = true;
        }
        dbsk.m(z, "Listening outside of callback window.");
        dbsk.m(d.g, "Executing tasks from lifecycle methods is disallowed since it can result in unnecessary operations during configuration changes or other lifecycle transitions.");
        dbsk.m(!d.ad, "Calling listen() from FutureCallbackRegistry callbacks is disallowed because hopping through the UI thread adds extra latency. Chain the new Future to the original Future using Futures.transformAsync instead.");
        parcelableFuture.c.Pk(new Runnable(parcelableFuture) { // from class: dbpu
            private final ParcelableFuture a;

            {
                this.a = parcelableFuture;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        }, dege.a);
        d.b.add(parcelableFuture);
        parcelableFuture.b(d);
        if (!parcelableFuture.a()) {
            d.g(d.a.b(g), parcelableFuture);
        }
    }

    public final dbpt d() {
        gn a = this.a.a();
        dbpt dbptVar = (dbpt) a.H("__future_listener_manager");
        if (dbptVar == null) {
            dbptVar = new dbpt();
            gz b = a.b();
            b.y(dbptVar, "__future_listener_manager");
            b.g();
        }
        dbpe<?> dbpeVar = this.c;
        dbsk.s(dbpeVar);
        dbptVar.d = dbpeVar;
        return dbptVar;
    }

    public final void e(dbpg<?, ?> dbpgVar) {
        boolean z = true;
        dbsk.b(true, "Use an R.id value as the callbackId");
        if (!this.e) {
            this.b.a(this.d);
            this.e = true;
        }
        dbpt d = d();
        dbpt.i();
        dbsk.m(!d.f, "Callbacks must be registered in onCreate().");
        if (d.a.b(R.id.welcome_offer_captured_callback_id) != null) {
            z = false;
        }
        dbsk.m(z, "Callback already registered.");
        ain<dbpg<?, ?>> ainVar = d.a;
        dbsk.s(dbpgVar);
        ainVar.e(R.id.welcome_offer_captured_callback_id, dbpgVar);
    }
}
