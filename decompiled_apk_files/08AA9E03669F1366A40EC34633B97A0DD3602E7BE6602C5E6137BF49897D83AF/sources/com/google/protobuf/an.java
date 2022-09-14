package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0077a;
import com.google.protobuf.af;
/* compiled from: SingleFieldBuilderV3.java */
/* loaded from: classes.dex */
public class an<MType extends a, BType extends a.AbstractC0077a, IType extends af> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private a.b f4336a;

    /* renamed from: b  reason: collision with root package name */
    private BType f4337b;

    /* renamed from: c  reason: collision with root package name */
    private MType f4338c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4339d;

    public an(MType mtype, a.b bVar, boolean z) {
        this.f4338c = (MType) t.a(mtype);
        this.f4336a = bVar;
        this.f4339d = z;
    }

    public MType b() {
        if (this.f4338c == null) {
            this.f4338c = (MType) this.f4337b.r();
        }
        return this.f4338c;
    }

    public MType c() {
        this.f4339d = true;
        return b();
    }

    public BType d() {
        if (this.f4337b == null) {
            this.f4337b = (BType) this.f4338c.newBuilderForType(this);
            this.f4337b.c(this.f4338c);
            this.f4337b.b();
        }
        return this.f4337b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [MType extends com.google.protobuf.a, IType extends com.google.protobuf.af] */
    /* JADX WARN: Type inference failed for: r0v2, types: [BType extends com.google.protobuf.a$a, IType extends com.google.protobuf.af] */
    public IType e() {
        if (this.f4337b != null) {
            return this.f4337b;
        }
        return this.f4338c;
    }

    public an<MType, BType, IType> a(MType mtype) {
        this.f4338c = (MType) t.a(mtype);
        if (this.f4337b != null) {
            this.f4337b.c();
            this.f4337b = null;
        }
        f();
        return this;
    }

    public an<MType, BType, IType> b(MType mtype) {
        if (this.f4337b == null && this.f4338c == this.f4338c.F()) {
            this.f4338c = mtype;
        } else {
            d().c(mtype);
        }
        f();
        return this;
    }

    private void f() {
        if (this.f4337b != null) {
            this.f4338c = null;
        }
        if (!this.f4339d || this.f4336a == null) {
            return;
        }
        this.f4336a.a();
        this.f4339d = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        f();
    }
}
