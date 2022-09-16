package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class y implements c.d.d.g.h {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.d.g.k f5273a;

    /* renamed from: b  reason: collision with root package name */
    private final v f5274b;

    public y(v vVar, c.d.d.g.k kVar) {
        this.f5274b = vVar;
        this.f5273a = kVar;
    }

    @Override // c.d.d.g.h
    /* renamed from: a  reason: collision with other method in class */
    public x mo188a(InputStream inputStream) {
        z zVar = new z(this.f5274b);
        try {
            return a(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    @Override // c.d.d.g.h
    /* renamed from: a  reason: collision with other method in class */
    public x mo189a(InputStream inputStream, int i) {
        z zVar = new z(this.f5274b, i);
        try {
            return a(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    x a(InputStream inputStream, z zVar) {
        this.f5273a.a(inputStream, zVar);
        return zVar.mo193a();
    }

    @Override // c.d.d.g.h
    /* renamed from: a  reason: collision with other method in class */
    public x mo190a(byte[] bArr) {
        z zVar = new z(this.f5274b, bArr.length);
        try {
            try {
                zVar.write(bArr, 0, bArr.length);
                return zVar.mo193a();
            } catch (IOException e2) {
                c.d.d.d.n.a(e2);
                throw null;
            }
        } finally {
            zVar.close();
        }
    }

    @Override // c.d.d.g.h
    /* renamed from: a  reason: collision with other method in class */
    public z mo191a() {
        return new z(this.f5274b);
    }

    @Override // c.d.d.g.h
    /* renamed from: a  reason: collision with other method in class */
    public z mo192a(int i) {
        return new z(this.f5274b, i);
    }
}
