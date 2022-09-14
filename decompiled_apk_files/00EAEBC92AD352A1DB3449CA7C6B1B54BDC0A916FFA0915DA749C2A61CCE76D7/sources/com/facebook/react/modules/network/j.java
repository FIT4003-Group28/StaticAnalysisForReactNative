package com.facebook.react.modules.network;

import h.v;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* loaded from: classes.dex */
public class j extends ResponseBody {

    /* renamed from: b  reason: collision with root package name */
    private final ResponseBody f5725b;

    /* renamed from: c  reason: collision with root package name */
    private final h f5726c;

    /* renamed from: d  reason: collision with root package name */
    private h.e f5727d;

    /* renamed from: e  reason: collision with root package name */
    private long f5728e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.h {
        a(v vVar) {
            super(vVar);
        }

        @Override // h.h, h.v
        public long read(h.c cVar, long j) {
            long read = super.read(cVar, j);
            int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
            j.this.f5728e += i != 0 ? read : 0L;
            j.this.f5726c.a(j.this.f5728e, j.this.f5725b.contentLength(), i == 0);
            return read;
        }
    }

    public j(ResponseBody responseBody, h hVar) {
        this.f5725b = responseBody;
        this.f5726c = hVar;
    }

    private v b(v vVar) {
        return new a(vVar);
    }

    public long a() {
        return this.f5728e;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f5725b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f5725b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public h.e source() {
        if (this.f5727d == null) {
            this.f5727d = h.l.a(b(this.f5725b.source()));
        }
        return this.f5727d;
    }
}
