package com.facebook.react.modules.network;

import h.u;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* loaded from: classes.dex */
public class i extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBody f5721a;

    /* renamed from: b  reason: collision with root package name */
    private final h f5722b;

    /* renamed from: c  reason: collision with root package name */
    private long f5723c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        private void b() {
            long a2 = a();
            long contentLength = i.this.contentLength();
            i.this.f5722b.a(a2, contentLength, a2 == contentLength);
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) {
            super.write(i);
            b();
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            super.write(bArr, i, i2);
            b();
        }
    }

    public i(RequestBody requestBody, h hVar) {
        this.f5721a = requestBody;
        this.f5722b = hVar;
    }

    private u a(h.d dVar) {
        return h.l.a(new a(dVar.m()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.f5723c == 0) {
            this.f5723c = this.f5721a.contentLength();
        }
        return this.f5723c;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f5721a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(h.d dVar) {
        h.d a2 = h.l.a(a(dVar));
        contentLength();
        this.f5721a.writeTo(a2);
        a2.flush();
    }
}
