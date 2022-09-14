package com.facebook.react.modules.network;

import c.t;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* compiled from: ProgressResponseBody.java */
/* loaded from: classes.dex */
public class h extends ResponseBody {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseBody f3637a;

    /* renamed from: b  reason: collision with root package name */
    private final f f3638b;

    /* renamed from: c  reason: collision with root package name */
    private c.e f3639c;

    /* renamed from: d  reason: collision with root package name */
    private long f3640d = 0;

    public h(ResponseBody responseBody, f fVar) {
        this.f3637a = responseBody;
        this.f3638b = fVar;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f3637a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f3637a.contentLength();
    }

    public long a() {
        return this.f3640d;
    }

    @Override // okhttp3.ResponseBody
    public c.e source() {
        if (this.f3639c == null) {
            this.f3639c = c.l.a(a(this.f3637a.source()));
        }
        return this.f3639c;
    }

    private t a(t tVar) {
        return new c.h(tVar) { // from class: com.facebook.react.modules.network.h.1
            @Override // c.h, c.t
            public long read(c.c cVar, long j) {
                long read = super.read(cVar, j);
                int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                h.this.f3640d += i != 0 ? read : 0L;
                h.this.f3638b.a(h.this.f3640d, h.this.f3637a.contentLength(), i == 0);
                return read;
            }
        };
    }
}
