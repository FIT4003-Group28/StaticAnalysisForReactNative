package defpackage;

import defpackage.dssj;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UploadDataProvider;
/* compiled from: PG */
/* renamed from: buip  reason: default package */
/* loaded from: classes4.dex */
public final class buip<S extends dssj> implements buir<S> {
    public static final /* synthetic */ int m = 0;
    private static final Executor r = dege.a;
    public final dssj a;
    public final CronetEngine b;
    public final buid c;
    public final dxio<btto> d;
    public final btuj e;
    public final cqat f;
    public final ckcw g;
    public final ckoe h;
    public final ckoe i;
    public final dunt j;
    public final boolean k;
    public final Executor l;
    private final btvg n;
    private final btus o;
    @dzsi
    private final String p;
    private final dssr<S> q;

    public buip(dssj dssjVar, CronetEngine cronetEngine, btvg btvgVar, btus btusVar, buid buidVar, buad buadVar, dxio<btto> dxioVar, btuj btujVar, cqat cqatVar, ckcw ckcwVar, Executor executor, @dzsi String str) {
        this.a = dssjVar;
        this.b = cronetEngine;
        this.n = btvgVar;
        this.o = btusVar;
        this.c = buidVar;
        this.d = dxioVar;
        this.e = btujVar;
        this.l = executor;
        boolean z = true;
        if (str != null && str.isEmpty()) {
            z = false;
        }
        dbsk.a(z);
        this.p = str;
        this.f = cqatVar;
        this.g = ckcwVar;
        this.h = new ckoe();
        this.i = new ckoe();
        dunt duntVar = buadVar.g;
        dbsk.t(duntVar, "Null RequestId. Make sure request_handler is added to the rpc definition.");
        this.j = duntVar;
        dssr<S> dssrVar = (dssr<S>) buadVar.h;
        dbsk.t(dssrVar, "Null response Parser.");
        this.q = dssrVar;
        this.k = buadVar.j;
        Thread.currentThread().getName();
    }

    @Override // defpackage.buir
    public final dehn<S> a(buic buicVar, final btzu btzuVar) {
        dune duneVar;
        if (String.valueOf(this.a.getClass().getSimpleName()).length() == 0) {
            new String("AsyncGmmServerProtocolRpc send ");
        }
        deig d = deig.d();
        this.c.c(buicVar);
        buab<String> b = buicVar.b("apiToken");
        if (b != null) {
            btto a = this.d.a();
            String b2 = b.b();
            if (!a.c.get()) {
                synchronized (a.b) {
                    duneVar = a.b;
                }
                if (duneVar.c) {
                    duneVar.bF();
                    duneVar.c = false;
                }
                dung dungVar = (dung) duneVar.b;
                dung dungVar2 = dung.R;
                b2.getClass();
                dungVar.b |= 8;
                dungVar.w = b2;
                a.c.set(true);
            }
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            btut.e(dataOutputStream, this.o, this.e);
            dssj dssjVar = this.a;
            if (!(dssjVar instanceof dhqq)) {
                if (!(dssjVar instanceof dunb) || !this.k) {
                    this.d.a().a();
                    btto a2 = this.d.a();
                    btuj btujVar = this.e;
                    boolean z = this.a instanceof dunb;
                    dunt duntVar = dunt.UNKNOWN_REQUEST_ID;
                    synchronized (a2.b) {
                        btut.f(a2.c(z), dunt.CLIENT_PROPERTIES_2_REQUEST, dataOutputStream, btujVar);
                    }
                } else {
                    btto a3 = this.d.a();
                    btuj btujVar2 = this.e;
                    dune ca = dung.R.ca(a3.c(true));
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    dung.c((dung) ca.b);
                    String z2 = a3.a.z(bvjk.q, "");
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    dung dungVar3 = (dung) ca.b;
                    z2.getClass();
                    dungVar3.a |= 4096;
                    dungVar3.k = z2;
                    dumq bZ = dumr.c.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dumr dumrVar = (dumr) bZ.b;
                    dumrVar.a |= 1;
                    dumrVar.b = true;
                    dumr bK = bZ.bK();
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    dung dungVar4 = (dung) ca.b;
                    bK.getClass();
                    dungVar4.O = bK;
                    dungVar4.b |= 16777216;
                    dunt duntVar2 = dunt.UNKNOWN_REQUEST_ID;
                    btut.f(ca.bK(), dunt.CLIENT_PROPERTIES_2_REQUEST, dataOutputStream, btujVar2);
                }
            } else {
                btuj btujVar3 = this.e;
                dune ca2 = dung.R.ca(this.d.a().c(false));
                if (ca2.c) {
                    ca2.bF();
                    ca2.c = false;
                }
                dung.c((dung) ca2.b);
                if (ca2.c) {
                    ca2.bF();
                    ca2.c = false;
                }
                dung dungVar5 = (dung) ca2.b;
                dungVar5.a &= -4097;
                dungVar5.k = dung.R.k;
                dunt duntVar3 = dunt.UNKNOWN_REQUEST_ID;
                btut.f(ca2.bK(), dunt.CLIENT_PROPERTIES_2_REQUEST, dataOutputStream, btujVar3);
            }
            btut.f(this.a, this.j, dataOutputStream, this.e);
            dataOutputStream.close();
            URL b3 = this.n.b();
            buim buimVar = new buim(this, byteArrayOutputStream, btzuVar);
            buil builVar = new buil(this, d, new buin(this, btzuVar, this.q));
            CronetEngine cronetEngine = this.b;
            String externalForm = b3.toExternalForm();
            Executor executor = r;
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) cronetEngine.mo29newUrlRequestBuilder(externalForm, builVar, executor).mo42allowDirectExecutor();
            builder.addRequestAnnotation(buhg.c(this.a.getClass(), btzuVar));
            builder.mo47setUploadDataProvider((UploadDataProvider) buimVar, executor);
            builder.mo45setHttpMethod("POST");
            builder.mo41addHeader("Content-Type", "application/binary");
            buab<String> b4 = buicVar.b("Authorization");
            if (b4 != null) {
                String a4 = b4.a();
                String valueOf = String.valueOf(b4.b());
                builder.mo41addHeader(a4, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
            }
            buab<List<ahnc>> buabVar = buicVar.a;
            if (buabVar != null) {
                builder.mo41addHeader(buabVar.a(), btut.d(buabVar.b()));
            }
            if (!dbsj.d(this.p)) {
                builder.mo41addHeader("X-Google-Maps-Mobile-API", this.p);
            }
            buab<String> b5 = buicVar.b("X-Device-Elapsed-Time");
            if (b5 != null) {
                builder.mo41addHeader("X-Device-Elapsed-Time", b5.b());
            }
            buab<String> b6 = buicVar.b("X-Device-Boot-Count");
            if (b6 != null) {
                builder.mo41addHeader("X-Device-Boot-Count", b6.b());
            }
            ExperimentalUrlRequest mo43build = builder.mo43build();
            deha.q(d, new buii(mo43build), dege.a);
            d.Pk(new Runnable(btzuVar) { // from class: buih
                private final btzu a;

                {
                    this.a = btzuVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    btzu btzuVar2 = this.a;
                    int i = buip.m;
                    btzuVar2.a();
                }
            }, this.l);
            mo43build.start();
            return d;
        } catch (Exception e) {
            d.k(e);
            return d;
        }
    }
}
