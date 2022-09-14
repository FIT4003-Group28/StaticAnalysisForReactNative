package com.facebook.react.modules.network;

import c.s;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* compiled from: ProgressRequestBody.java */
/* loaded from: classes.dex */
public class g extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBody f3631a;

    /* renamed from: b  reason: collision with root package name */
    private final f f3632b;

    /* renamed from: c  reason: collision with root package name */
    private c.d f3633c;

    public g(RequestBody requestBody, f fVar) {
        this.f3631a = requestBody;
        this.f3632b = fVar;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f3631a.contentType();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.f3631a.contentLength();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(c.d dVar) {
        if (this.f3633c == null) {
            this.f3633c = c.l.a(a(dVar));
        }
        this.f3631a.writeTo(this.f3633c);
        this.f3633c.flush();
    }

    private s a(s sVar) {
        return new c.g(sVar) { // from class: com.facebook.react.modules.network.g.1

            /* renamed from: a  reason: collision with root package name */
            long f3634a = 0;

            /* renamed from: b  reason: collision with root package name */
            long f3635b = 0;

            @Override // c.g, c.s
            public void write(c.c cVar, long j) {
                super.write(cVar, j);
                if (this.f3635b == 0) {
                    this.f3635b = g.this.contentLength();
                }
                this.f3634a += j;
                g.this.f3632b.a(this.f3634a, this.f3635b, this.f3634a == this.f3635b);
            }
        };
    }
}
