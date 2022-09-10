package com.google.android.apps.gmm.map.internal.store.resource;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmGlideModule implements chc {
    @dzsi
    private byd a;
    private boolean b = false;

    @dzsi
    final synchronized byd a() {
        if (this.b) {
            return this.a;
        }
        this.b = true;
        if (!((btvq) btsr.a(btvq.class)).rp().getEnableFeatureParameters().O) {
            return null;
        }
        btnk rA = ((btnj) btsr.a(btnj.class)).rA();
        if (rA != null) {
            this.a = new amee(rA);
        }
        return this.a;
    }

    @Override // defpackage.chb
    public final void b(final Context context, brj brjVar) {
        byr a;
        btvo rp = ((btvq) btsr.a(btvq.class)).rp();
        byd a2 = a();
        if (a2 != null) {
            brjVar.a(new chw().m(bwe.b));
            brjVar.h = a2;
            ((bvkt) btsr.a(bvkt.class)).sN().k(new Runnable(context) { // from class: amed
                private final Context a;

                {
                    this.a = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dehn a3;
                    Context context2 = this.a;
                    final btnm btnmVar = new btnm(bdn.g(context2), ((irz) btsr.a(irz.class)).ts());
                    try {
                        try {
                            bbo bboVar = new bbo();
                            bboVar.e("worker_name_key", "GlideDiskCacheExpirationServiceWorker");
                            bbp a4 = bboVar.a();
                            bbk bbkVar = new bbk();
                            bbkVar.c = 1;
                            bbkVar.a = false;
                            final bci f = new bch(GmmWorkerWrapper.class, 1L, TimeUnit.DAYS).d("glide.cache.periodic").c(a4).b(bbkVar.a()).f();
                            a3 = deew.h(btnmVar.a.f("glide.cache.periodic", 2, f).a(), new dbrn(btnmVar, f) { // from class: btnl
                                private final btnm a;
                                private final bci b;

                                {
                                    this.a = btnmVar;
                                    this.b = f;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    btnm btnmVar2 = this.a;
                                    try {
                                        return this.b.a;
                                    } catch (RuntimeException e) {
                                        btnmVar2.b.c(8, e);
                                        return bbx.c();
                                    }
                                }
                            }, dege.a);
                        } catch (RuntimeException e) {
                            btnmVar.b.c(8, e);
                            a3 = deha.a(bbx.c());
                        }
                        a3.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }, ((bvrk) btsr.a(bvrk.class)).sV(), bvkw.ON_STARTUP_FULLY_COMPLETE);
        } else {
            brjVar.a(new chw().m(bwe.a));
        }
        byp bypVar = new byp(context);
        boolean z = true;
        if (rp.getEnableFeatureParameters().aw >= 0) {
            float min = Math.min(2, rp.getEnableFeatureParameters().aw);
            cjn.a(min >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            bypVar.d = min;
        }
        if (rp.getEnableFeatureParameters().ax >= 0) {
            float min2 = Math.min(4, rp.getEnableFeatureParameters().ax);
            if (min2 < 0.0f) {
                z = false;
            }
            cjn.a(z, "Bitmap pool screens must be greater than or equal to 0");
            bypVar.e = min2;
        }
        brjVar.i = bypVar.a();
        dvcz memoryManagementParameters = rp.getMemoryManagementParameters();
        int i = memoryManagementParameters.i;
        if (memoryManagementParameters.h || memoryManagementParameters.j) {
            ckcw rU = ((ckcu) btsr.a(ckcu.class)).rU();
            boolean z2 = memoryManagementParameters.j;
            long j = i;
            brjVar.m = new amec((a.b * j) / 100, rU, z2);
            brjVar.d = new ameb((a.a * j) / 100, rU, z2);
        }
    }

    @Override // defpackage.chf
    public final void c(bru bruVar) {
        bruVar.a.b(Uri.class, InputStream.class, new amdx());
        bruVar.a.c(cac.class, InputStream.class, new amef());
    }
}
