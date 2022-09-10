package defpackage;

import defpackage.dssj;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
/* compiled from: PG */
/* renamed from: bujg  reason: default package */
/* loaded from: classes4.dex */
public final class bujg<S extends dssj> implements buir<S> {
    public static final /* synthetic */ int f = 0;
    private static final Executor l = dege.a;
    public final dssj a;
    public final btuj b;
    public final cqat c;
    public final ckcw d;
    public final Executor e;
    private final CronetEngine g;
    private final btvg h;
    private final buid i;
    private final dzsj<dmxf> j;
    @dzsi
    private final String k;

    public bujg(dssj dssjVar, CronetEngine cronetEngine, btvg btvgVar, buid buidVar, btuj btujVar, cqat cqatVar, ckcw ckcwVar, Executor executor, dzsj<dmxf> dzsjVar, @dzsi String str) {
        this.a = dssjVar;
        this.g = cronetEngine;
        this.h = btvgVar;
        this.i = buidVar;
        this.c = cqatVar;
        this.d = ckcwVar;
        this.b = btujVar;
        this.e = executor;
        this.j = dzsjVar;
        boolean z = true;
        if (str != null && str.isEmpty()) {
            z = false;
        }
        dbsk.a(z);
        this.k = str;
    }

    private final long c(String str) {
        try {
            String file = new URL(str).getFile();
            long a = buji.a(this.j.a().d);
            int length = file.length() + 1;
            long[] jArr = new long[length];
            jArr[0] = a;
            int i = 0;
            while (i < file.length()) {
                int i2 = i + 1;
                jArr[i2] = buji.a(file.codePointAt(i));
                i = i2;
            }
            long j = 0;
            for (int i3 = 0; i3 < length; i3++) {
                j = ((j * 1729) + jArr[i3]) % 131071;
            }
            return j;
        } catch (MalformedURLException e) {
            throw new btzz(btzy.g.b(e));
        }
    }

    @Override // defpackage.buir
    public final dehn<S> a(buic buicVar, final btzu btzuVar) {
        deig d = deig.d();
        bujf a = bujf.a(this.a);
        try {
            bujd bujdVar = new bujd(this, d, new buje(this, a));
            this.b.a(0L);
            String externalForm = this.h.b().toExternalForm();
            if (!externalForm.endsWith("/")) {
                externalForm = String.valueOf(externalForm).concat("/");
            }
            if (a.equals(bujf.GET_PARAMETERS) && externalForm.endsWith("/vt/")) {
                externalForm = externalForm.substring(0, externalForm.length() - 3);
            }
            String valueOf = String.valueOf(externalForm);
            String str = a.c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            sb.append("?");
            String sb2 = sb.toString();
            String valueOf2 = String.valueOf(ddae.e.i(this.a.bS()));
            String concat = valueOf2.length() != 0 ? "bpb=".concat(valueOf2) : new String("bpb=");
            String valueOf3 = String.valueOf(sb2);
            String valueOf4 = String.valueOf(concat);
            String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.b.b(concat2.length(), false);
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) this.g.mo29newUrlRequestBuilder(concat2, bujdVar, l).mo42allowDirectExecutor();
            builder.mo45setHttpMethod("GET");
            long c = c(concat2);
            this.i.c(buicVar);
            buab<String> b = buicVar.b("Authorization");
            if (b != null) {
                String a2 = b.a();
                String valueOf5 = String.valueOf(b.b());
                builder.mo41addHeader(a2, valueOf5.length() != 0 ? "Bearer ".concat(valueOf5) : new String("Bearer "));
            }
            builder.mo41addHeader("X-Client-Signature", Long.toString(c));
            if (!dbsj.d(this.k)) {
                builder.mo41addHeader("X-Google-Maps-Mobile-API", this.k);
            }
            builder.addRequestAnnotation(buhg.c(this.a.getClass(), btzuVar));
            ExperimentalUrlRequest mo43build = builder.mo43build();
            deha.q(d, new buiy(mo43build), dege.a);
            d.Pk(new Runnable(btzuVar) { // from class: buix
                private final btzu a;

                {
                    this.a = btzuVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    btzu btzuVar2 = this.a;
                    int i = bujg.f;
                    btzuVar2.a();
                }
            }, this.e);
            mo43build.start();
            this.c.f();
            return d;
        } catch (Exception e) {
            d.k(e);
            return d;
        }
    }

    public final void b() {
        byte[] globalMetricsDeltas = this.g.getGlobalMetricsDeltas();
        if (globalMetricsDeltas == null || globalMetricsDeltas.length <= 0) {
            return;
        }
        this.d.m(globalMetricsDeltas, this.i.n);
    }
}
