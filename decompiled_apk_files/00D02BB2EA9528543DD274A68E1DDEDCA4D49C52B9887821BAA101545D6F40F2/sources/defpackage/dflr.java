package defpackage;

import com.google.ar.core.EarthNetworkCallResult;
import com.google.ar.core.EarthNetworkCallbackInterface;
import com.google.ar.core.EarthNetworkClientInterface;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: dflr  reason: default package */
/* loaded from: classes6.dex */
public final class dflr implements EarthNetworkClientInterface {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).asReadOnlyBuffer();
    public final dbsg<dll> b;
    public final Executor c;
    public final dll d;
    private final Map<EarthNetworkClientInterface.ServiceMethod, dyeu> e;
    private final Executor f;
    private final dflc g;

    public dflr(dll dllVar, dbsg dbsgVar, Executor executor, Executor executor2, dflc dflcVar) {
        this.d = dllVar;
        this.b = dbsgVar;
        this.c = executor;
        this.f = executor2;
        this.g = dflcVar;
        dyeu a2 = dllVar.a();
        dcdg p = dcdn.p();
        p.f(EarthNetworkClientInterface.ServiceMethod.FACADES, a2);
        p.f(EarthNetworkClientInterface.ServiceMethod.LOCALIZE, a2);
        p.f(EarthNetworkClientInterface.ServiceMethod.WARMUP, a2);
        p.f(EarthNetworkClientInterface.ServiceMethod.TERRAIN_POINT, a2);
        p.f(EarthNetworkClientInterface.ServiceMethod.TERRAIN_CELL, a2);
        if (dbsgVar.a()) {
            p.f(EarthNetworkClientInterface.ServiceMethod.BLUESKY, ((dll) dbsgVar.b()).a());
        }
        this.e = p.b();
    }

    private final <Req extends dssj, Resp extends dssj> void b(ByteBuffer byteBuffer, final EarthNetworkCallbackInterface earthNetworkCallbackInterface, dssr<Req> dssrVar, final dbrn<Req, dehn<Resp>> dbrnVar) {
        if (a()) {
            return;
        }
        try {
            final Req m = dssrVar.m(byteBuffer);
            Executor executor = this.f;
            if (!(executor instanceof ExecutorService) || !((ExecutorService) executor).isShutdown()) {
                this.f.execute(new Runnable(this, dbrnVar, m, earthNetworkCallbackInterface) { // from class: dflo
                    private final dflr a;
                    private final dbrn b;
                    private final dssj c;
                    private final EarthNetworkCallbackInterface d;

                    {
                        this.a = this;
                        this.b = dbrnVar;
                        this.c = m;
                        this.d = earthNetworkCallbackInterface;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dflr dflrVar = this.a;
                        dbrn dbrnVar2 = this.b;
                        dssj dssjVar = this.c;
                        EarthNetworkCallbackInterface earthNetworkCallbackInterface2 = this.d;
                        if (dflrVar.a()) {
                            return;
                        }
                        deha.q((dehn) dbrnVar2.a(dssjVar), new dflq(earthNetworkCallbackInterface2, dssjVar), dflrVar.c);
                    }
                });
            } else {
                c(earthNetworkCallbackInterface, dyiy.FAILED_PRECONDITION);
            }
        } catch (dsrm unused) {
            dssrVar.getClass();
            c(earthNetworkCallbackInterface, dyiy.FAILED_PRECONDITION);
        }
    }

    private final void c(final EarthNetworkCallbackInterface earthNetworkCallbackInterface, final dyiy dyiyVar) {
        if (earthNetworkCallbackInterface != null && !a()) {
            this.c.execute(new Runnable(earthNetworkCallbackInterface, dyiyVar) { // from class: dflp
                private final EarthNetworkCallbackInterface a;
                private final dyiy b;

                {
                    this.a = earthNetworkCallbackInterface;
                    this.b = dyiyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.run(new EarthNetworkCallResult(dflr.a, this.b.r));
                }
            });
        }
    }

    public final boolean a() {
        Executor executor = this.c;
        if (executor instanceof ExecutorService) {
            return ((ExecutorService) executor).isShutdown();
        }
        return false;
    }

    @Override // com.google.ar.core.EarthNetworkClientInterface
    public final void post(EarthNetworkClientInterface.ServiceMethod serviceMethod, ByteBuffer byteBuffer, EarthNetworkCallbackInterface earthNetworkCallbackInterface) {
        EarthNetworkClientInterface.ServiceMethod serviceMethod2 = EarthNetworkClientInterface.ServiceMethod.LOCALIZE;
        int ordinal = serviceMethod.ordinal();
        if (ordinal == 0) {
            dbsk.l(this.e.containsKey(serviceMethod));
            this.g.d(dflc.d);
            final dfnh a2 = dfni.a(this.e.get(serviceMethod));
            a2.getClass();
            b(byteBuffer, earthNetworkCallbackInterface, (dssr) dfnd.a.cu(7), new dbrn(a2) { // from class: dflj
                private final dfnh a;

                {
                    this.a = a2;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dfnh dfnhVar = this.a;
                    dfnd dfndVar = (dfnd) obj;
                    dyeu dyeuVar = dfnhVar.a;
                    dyib<dfnd, dfnf> dyibVar = dfni.a;
                    if (dyibVar == null) {
                        synchronized (dfni.class) {
                            dyibVar = dfni.a;
                            if (dyibVar == null) {
                                dyhx c = dyib.c();
                                c.c = dyhz.UNARY;
                                c.d = dyib.b("google.geo.ar.v1.LocalizeService", "Localize");
                                c.e = true;
                                c.a = dyyq.b(dfnd.a);
                                c.b = dyyq.b(dfnf.a);
                                dyibVar = c.a();
                                dfni.a = dyibVar;
                            }
                        }
                    }
                    return dyzf.d(dyeuVar.a(dyibVar, dfnhVar.b), dfndVar);
                }
            });
        } else if (ordinal == 1) {
            dbsk.l(this.e.containsKey(serviceMethod));
            final dfmq dfmqVar = (dfmq) dfmq.e(new dfmp(), this.e.get(serviceMethod));
            dfmqVar.getClass();
            b(byteBuffer, earthNetworkCallbackInterface, (dssr) dfmt.a.cu(7), new dbrn(dfmqVar) { // from class: dfli
                private final dfmq a;

                {
                    this.a = dfmqVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dfmq dfmqVar2 = this.a;
                    dfmt dfmtVar = (dfmt) obj;
                    dyeu dyeuVar = dfmqVar2.a;
                    dyib<dfmt, dfmv> dyibVar = dfmr.a;
                    if (dyibVar == null) {
                        synchronized (dfmr.class) {
                            dyibVar = dfmr.a;
                            if (dyibVar == null) {
                                dyhx c = dyib.c();
                                c.c = dyhz.UNARY;
                                c.d = dyib.b("google.geo.ar.v1.FacadesService", "FindFacades");
                                c.e = true;
                                c.a = dyyq.b(dfmt.a);
                                c.b = dyyq.b(dfmv.a);
                                dyibVar = c.a();
                                dfmr.a = dyibVar;
                            }
                        }
                    }
                    return dyzf.d(dyeuVar.a(dyibVar, dfmqVar2.b), dfmtVar);
                }
            });
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    dbsk.l(this.e.containsKey(serviceMethod));
                    final dfnh a3 = dfni.a(this.e.get(serviceMethod));
                    a3.getClass();
                    b(byteBuffer, earthNetworkCallbackInterface, (dssr) dfnu.a.cu(7), new dbrn(a3) { // from class: dfll
                        private final dfnh a;

                        {
                            this.a = a3;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            dfnh dfnhVar = this.a;
                            dfnu dfnuVar = (dfnu) obj;
                            dyeu dyeuVar = dfnhVar.a;
                            dyib<dfnu, dfnw> dyibVar = dfni.b;
                            if (dyibVar == null) {
                                synchronized (dfni.class) {
                                    dyibVar = dfni.b;
                                    if (dyibVar == null) {
                                        dyhx c = dyib.c();
                                        c.c = dyhz.UNARY;
                                        c.d = dyib.b("google.geo.ar.v1.LocalizeService", "WarmUpCache");
                                        c.e = true;
                                        c.a = dyyq.b(dfnu.a);
                                        c.b = dyyq.b(dfnw.a);
                                        dyibVar = c.a();
                                        dfni.b = dyibVar;
                                    }
                                }
                            }
                            return dyzf.d(dyeuVar.a(dyibVar, dfnhVar.b), dfnuVar);
                        }
                    });
                    return;
                } else if (ordinal == 4) {
                    dbsk.l(this.e.containsKey(serviceMethod));
                    final dfnr a4 = dfns.a(this.e.get(serviceMethod));
                    a4.getClass();
                    b(byteBuffer, earthNetworkCallbackInterface, (dssr) dfly.a.cu(7), new dbrn(a4) { // from class: dflm
                        private final dfnr a;

                        {
                            this.a = a4;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            dfnr dfnrVar = this.a;
                            dfly dflyVar = (dfly) obj;
                            dyeu dyeuVar = dfnrVar.a;
                            dyib<dfly, dfma> dyibVar = dfns.a;
                            if (dyibVar == null) {
                                synchronized (dfns.class) {
                                    dyibVar = dfns.a;
                                    if (dyibVar == null) {
                                        dyhx c = dyib.c();
                                        c.c = dyhz.UNARY;
                                        c.d = dyib.b("google.geo.ar.v1.TerrainService", "BatchQueryElevations");
                                        c.e = true;
                                        c.a = dyyq.b(dfly.a);
                                        c.b = dyyq.b(dfma.a);
                                        dyibVar = c.a();
                                        dfns.a = dyibVar;
                                    }
                                }
                            }
                            return dyzf.d(dyeuVar.a(dyibVar, dfnrVar.b), dflyVar);
                        }
                    });
                    return;
                } else if (ordinal == 5) {
                    dbsk.l(this.e.containsKey(serviceMethod));
                    final dfnr a5 = dfns.a(this.e.get(serviceMethod));
                    a5.getClass();
                    b(byteBuffer, earthNetworkCallbackInterface, (dssr) dfnn.a.cu(7), new dbrn(a5) { // from class: dfln
                        private final dfnr a;

                        {
                            this.a = a5;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            dfnr dfnrVar = this.a;
                            dfnn dfnnVar = (dfnn) obj;
                            dyeu dyeuVar = dfnrVar.a;
                            dyib<dfnn, dfnp> dyibVar = dfns.b;
                            if (dyibVar == null) {
                                synchronized (dfns.class) {
                                    dyibVar = dfns.b;
                                    if (dyibVar == null) {
                                        dyhx c = dyib.c();
                                        c.c = dyhz.UNARY;
                                        c.d = dyib.b("google.geo.ar.v1.TerrainService", "QueryTerrainMeshes");
                                        c.e = true;
                                        c.a = dyyq.b(dfnn.a);
                                        c.b = dyyq.b(dfnp.a);
                                        dyibVar = c.a();
                                        dfns.b = dyibVar;
                                    }
                                }
                            }
                            return dyzf.d(dyeuVar.a(dyibVar, dfnrVar.b), dfnnVar);
                        }
                    });
                    return;
                }
            } else if (this.e.containsKey(serviceMethod)) {
                final dhiv dhivVar = (dhiv) dhiv.e(new dhiu(), this.e.get(serviceMethod));
                dhivVar.getClass();
                b(byteBuffer, earthNetworkCallbackInterface, (dssr) dhir.a.cu(7), new dbrn(dhivVar) { // from class: dflk
                    private final dhiv a;

                    {
                        this.a = dhivVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        dhiv dhivVar2 = this.a;
                        dhir dhirVar = (dhir) obj;
                        dyeu dyeuVar = dhivVar2.a;
                        dyib<dhir, dhit> dyibVar = dhiw.a;
                        if (dyibVar == null) {
                            synchronized (dhiw.class) {
                                dyibVar = dhiw.a;
                                if (dyibVar == null) {
                                    dyhx c = dyib.c();
                                    c.c = dyhz.UNARY;
                                    c.d = dyib.b("google.internal.android.location.bluesky.v1beta1.KeplerService", "GetGridProbabilities");
                                    c.e = true;
                                    c.a = dyyq.b(dhir.a);
                                    c.b = dyyq.b(dhit.a);
                                    dyibVar = c.a();
                                    dhiw.a = dyibVar;
                                }
                            }
                        }
                        return dyzf.d(dyeuVar.a(dyibVar, dhivVar2.b), dhirVar);
                    }
                });
                return;
            }
            c(earthNetworkCallbackInterface, dyiy.FAILED_PRECONDITION);
        }
    }
}
