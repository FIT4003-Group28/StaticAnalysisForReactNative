package defpackage;

import defpackage.dssj;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: cvhq  reason: default package */
/* loaded from: classes5.dex */
public final class cvhq<S extends dssj> implements buir<S> {
    public static final /* synthetic */ int b = 0;
    private static final Executor i = dege.a;
    public final Executor a;
    private final dssj c;
    private final String d;
    private final CronetEngine e;
    private final buid f;
    private final cvhk g;
    private final cqat h;

    public cvhq(dssj dssjVar, String str, CronetEngine cronetEngine, buid buidVar, cvhk cvhkVar, cqat cqatVar, Executor executor) {
        this.c = dssjVar;
        this.d = str;
        this.e = cronetEngine;
        this.f = buidVar;
        this.g = cvhkVar;
        this.h = cqatVar;
        dbsk.t(executor, "Null executor for Threads.NETWORK_THREADPOOL)");
        this.a = executor;
    }

    @Override // defpackage.buir
    public final dehn<S> a(buic buicVar, btzu btzuVar) {
        deig d = deig.d();
        this.f.c(buicVar);
        try {
            URL url = new URL(this.d);
            dssj dssjVar = this.c;
            if (dssjVar instanceof dmli) {
                dmlg ca = dmli.e.ca((dmli) dssjVar);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                ((dmli) ca.b).d = dmlh.a(3);
                String a = this.g.a();
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                a.getClass();
                ((dmli) ca.b).c = a;
                buab<String> b2 = buicVar.b("apiToken");
                if (b2 != null) {
                    String b3 = b2.b();
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    b3.getClass();
                    ((dmli) ca.b).b = b3;
                }
                buab<String> b4 = buicVar.b("ZwiebackCookie");
                if (b4 != null) {
                    String b5 = b4.b();
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    b5.getClass();
                    ((dmli) ca.b).a = b5;
                }
                dssjVar = ca.bK();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(dssjVar.bS());
            bvgs bvgsVar = new bvgs(byteArrayOutputStream, btzuVar, this.h);
            cvhp cvhpVar = new cvhp(this, d);
            CronetEngine cronetEngine = this.e;
            String url2 = url.toString();
            Executor executor = i;
            UrlRequest.Builder mo42allowDirectExecutor = cronetEngine.mo29newUrlRequestBuilder(url2, cvhpVar, executor).mo42allowDirectExecutor();
            mo42allowDirectExecutor.mo47setUploadDataProvider(bvgsVar, executor);
            mo42allowDirectExecutor.mo45setHttpMethod("POST").mo41addHeader("Content-Type", "application/x-protobuf").mo41addHeader("X-Goog-Api-Key", this.g.a.a()).mo41addHeader("X-Android-Package", this.g.a()).mo41addHeader("X-Android-Cert", this.g.b.a());
            mo42allowDirectExecutor.mo43build().start();
        } catch (Exception e) {
            d.k(e);
        }
        return d;
    }
}
