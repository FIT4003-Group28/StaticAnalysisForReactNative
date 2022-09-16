package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: yse  reason: default package */
/* loaded from: classes4.dex */
public final class yse extends yqh {
    protected final azqb a;
    protected final azqb b;
    protected final ysj c;
    protected final zav d;
    private final boolean e;
    private final int f;
    private final int g;

    public yse(ysf ysfVar) {
        this.a = ysfVar.a;
        this.b = ysfVar.c;
        yqj yqjVar = ysfVar.d;
        this.e = yqjVar.d;
        this.f = yqjVar.a;
        this.g = yqjVar.b;
        if (!ysfVar.e) {
            synchronized (ysfVar) {
                if (!ysfVar.e) {
                    ysfVar.f = ysfVar.d.c ? new zav() : null;
                    ysfVar.e = true;
                }
            }
        }
        this.d = ysfVar.f;
        this.c = (ysj) ysfVar.b.get();
    }

    @Override // defpackage.yqh
    public final yrb a(yqv yqvVar) {
        String str = yqvVar.a;
        osf a = ((zgr) this.b.get()).a(str);
        String a2 = a.a(str);
        if (a2 == null) {
            String str2 = a.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21 + str.length());
            sb.append("Request blocked by ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            zep.l(sb.toString());
            throw new yue(a);
        }
        if (this.d != null) {
            zav.e(a2);
        }
        ysk yskVar = new ysk(this.f, this.g);
        ysb ysbVar = new ysb(yskVar, this.e, this);
        UrlRequest.Builder mo551newUrlRequestBuilder = ((CronetEngine) this.a.get()).mo551newUrlRequestBuilder(a2, ysbVar, yskVar);
        mo551newUrlRequestBuilder.mo567setHttpMethod(zav.f(yqvVar.e));
        yqp yqpVar = yqvVar.b;
        ysj ysjVar = this.c;
        ArrayList arrayList = new ArrayList(yqpVar.b.size());
        for (Map.Entry entry : yqpVar.b) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), (String) entry.getValue()));
        }
        ysjVar.b(mo551newUrlRequestBuilder, Collections.unmodifiableList(arrayList));
        yqt yqtVar = yqvVar.c;
        if (yqtVar != null) {
            ByteBuffer b = yqtVar.b();
            mo551newUrlRequestBuilder.mo569setUploadDataProvider(b != null ? UploadDataProviders.create(b) : new ysc(yqtVar), yskVar);
        }
        mo551newUrlRequestBuilder.mo568setPriority(yqvVar.d);
        UrlRequest mo565build = mo551newUrlRequestBuilder.mo565build();
        mo565build.start();
        if (!yskVar.c) {
            yskVar.c(mo565build, yskVar.a + yskVar.b);
        }
        while (!yskVar.c) {
            yskVar.c(mo565build, yskVar.b);
        }
        ysbVar.a();
        ysbVar.a();
        if (ysbVar.b) {
            return (yrb) ysbVar.c;
        }
        throw new IOException();
    }
}
