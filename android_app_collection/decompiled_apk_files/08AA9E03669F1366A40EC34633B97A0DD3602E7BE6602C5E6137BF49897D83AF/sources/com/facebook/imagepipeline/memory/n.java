package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: NativePooledByteBufferFactory.java */
/* loaded from: classes.dex */
public class n implements com.facebook.common.g.h {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.common.g.k f2958a;

    /* renamed from: b  reason: collision with root package name */
    private final l f2959b;

    public n(l lVar, com.facebook.common.g.k kVar) {
        this.f2959b = lVar;
        this.f2958a = kVar;
    }

    @Override // com.facebook.common.g.h
    /* renamed from: b */
    public m a(InputStream inputStream) {
        o oVar = new o(this.f2959b);
        try {
            return a(inputStream, oVar);
        } finally {
            oVar.close();
        }
    }

    @Override // com.facebook.common.g.h
    /* renamed from: b */
    public m a(byte[] bArr) {
        o oVar = new o(this.f2959b, bArr.length);
        try {
            try {
                oVar.write(bArr, 0, bArr.length);
                return oVar.a();
            } catch (IOException e) {
                throw com.facebook.common.d.m.b(e);
            }
        } finally {
            oVar.close();
        }
    }

    @Override // com.facebook.common.g.h
    /* renamed from: b */
    public m a(InputStream inputStream, int i) {
        o oVar = new o(this.f2959b, i);
        try {
            return a(inputStream, oVar);
        } finally {
            oVar.close();
        }
    }

    m a(InputStream inputStream, o oVar) {
        this.f2958a.a(inputStream, oVar);
        return oVar.a();
    }

    @Override // com.facebook.common.g.h
    /* renamed from: b */
    public o a() {
        return new o(this.f2959b);
    }

    @Override // com.facebook.common.g.h
    /* renamed from: b */
    public o a(int i) {
        return new o(this.f2959b, i);
    }
}
