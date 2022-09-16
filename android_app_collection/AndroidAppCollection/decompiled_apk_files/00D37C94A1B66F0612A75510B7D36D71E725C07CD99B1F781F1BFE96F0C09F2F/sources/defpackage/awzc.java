package defpackage;

import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awzc  reason: default package */
/* loaded from: classes2.dex */
public final class awzc implements awyp {
    public final awyz a;
    public final awze b;
    public UrlRequest c;
    private final String d;
    private final String e;
    private final awya f;
    private final CronetEngine g;
    private final ExecutorService h;

    public awzc(String str, String str2, awya awyaVar, CronetEngine cronetEngine, ExecutorService executorService, awyz awyzVar, awze awzeVar) {
        this.d = str;
        this.e = str2;
        this.f = awyaVar;
        this.g = cronetEngine;
        this.h = executorService;
        this.a = awyzVar;
        this.b = awzeVar;
    }

    @Override // defpackage.awyp
    public final ankt a() {
        UrlRequest.Builder mo551newUrlRequestBuilder = this.g.mo551newUrlRequestBuilder(this.d, this.a, this.h);
        mo551newUrlRequestBuilder.mo567setHttpMethod(this.e);
        for (String str : this.f.c()) {
            for (String str2 : this.f.b(str)) {
                mo551newUrlRequestBuilder.mo563addHeader(str, str2);
            }
        }
        mo551newUrlRequestBuilder.mo563addHeader("Content-Type", "application/x-www-form-urlencoded");
        awze awzeVar = this.b;
        mo551newUrlRequestBuilder.mo563addHeader("Content-Length", String.valueOf(awzeVar != null ? awzeVar.c : 0L));
        awze awzeVar2 = this.b;
        if (awzeVar2 != null) {
            mo551newUrlRequestBuilder.mo569setUploadDataProvider(awzeVar2, this.h);
        }
        if (mo551newUrlRequestBuilder instanceof ExperimentalUrlRequest.Builder) {
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) mo551newUrlRequestBuilder;
            builder.setTrafficStatsTag(-1);
            builder.setTrafficStatsUid(-1);
        }
        this.c = mo551newUrlRequestBuilder.mo565build();
        this.h.execute(new awza(this));
        return this.a.a;
    }

    @Override // defpackage.awyp
    public final /* synthetic */ ankt b() {
        return axij.l();
    }

    @Override // defpackage.awyp
    public final awxx c() {
        return this.b.b;
    }

    @Override // defpackage.awyp
    public final String e() {
        return this.d;
    }

    @Override // defpackage.awyp
    public final void f() {
        if (this.c != null) {
            this.h.execute(new awza(this, 1));
        }
    }

    @Override // defpackage.awyp
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.awyp
    public final void j(final axij axijVar, final int i, final int i2) {
        this.h.execute(new Runnable(axijVar, i, i2, null, null) { // from class: awzb
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ axij d;

            @Override // java.lang.Runnable
            public final void run() {
                awzc awzcVar = awzc.this;
                axij axijVar2 = this.d;
                int i3 = this.b;
                int i4 = this.c;
                awyz awyzVar = awzcVar.a;
                awyzVar.b = awzcVar;
                awyzVar.c = axijVar2;
                awze awzeVar = awzcVar.b;
                if (awzeVar != null) {
                    awzeVar.d = i3;
                    awzeVar.e = i4;
                    awzeVar.a = new awzd(axijVar2, awzcVar, null, null);
                }
            }
        });
    }
}
