package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.j;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: DynamicMessage.java */
/* loaded from: classes.dex */
public final class k extends com.google.protobuf.a {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f4668a;

    /* renamed from: b  reason: collision with root package name */
    private final q<j.f> f4669b;

    /* renamed from: c  reason: collision with root package name */
    private final j.f[] f4670c;

    /* renamed from: d  reason: collision with root package name */
    private final at f4671d;
    private int e = -1;

    k(j.a aVar, q<j.f> qVar, j.f[] fVarArr, at atVar) {
        this.f4668a = aVar;
        this.f4669b = qVar;
        this.f4670c = fVarArr;
        this.f4671d = atVar;
    }

    public static k a(j.a aVar) {
        return new k(aVar, q.b(), new j.f[aVar.j().p()], at.b());
    }

    public static a b(j.a aVar) {
        return new a(aVar);
    }

    @Override // com.google.protobuf.af
    public j.a getDescriptorForType() {
        return this.f4668a;
    }

    @Override // com.google.protobuf.af
    /* renamed from: a */
    public k F() {
        return a(this.f4668a);
    }

    @Override // com.google.protobuf.af
    public Map<j.f, Object> getAllFields() {
        return this.f4669b.f();
    }

    @Override // com.google.protobuf.a
    public boolean hasOneof(j.C0086j c0086j) {
        a(c0086j);
        return this.f4670c[c0086j.a()] != null;
    }

    @Override // com.google.protobuf.a
    public j.f getOneofFieldDescriptor(j.C0086j c0086j) {
        a(c0086j);
        return this.f4670c[c0086j.a()];
    }

    @Override // com.google.protobuf.af
    public boolean hasField(j.f fVar) {
        a(fVar);
        return this.f4669b.a((q<j.f>) fVar);
    }

    @Override // com.google.protobuf.af
    public Object getField(j.f fVar) {
        a(fVar);
        Object b2 = this.f4669b.b((q<j.f>) fVar);
        if (b2 == null) {
            if (fVar.p()) {
                return Collections.emptyList();
            }
            if (fVar.g() == j.f.a.MESSAGE) {
                return a(fVar.y());
            }
            return fVar.s();
        }
        return b2;
    }

    @Override // com.google.protobuf.af
    public at getUnknownFields() {
        return this.f4671d;
    }

    static boolean a(j.a aVar, q<j.f> qVar) {
        for (j.f fVar : aVar.f()) {
            if (fVar.n() && !qVar.a((q<j.f>) fVar)) {
                return false;
            }
        }
        return qVar.h();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ad
    public boolean isInitialized() {
        return a(this.f4668a, this.f4669b);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ac
    public void writeTo(h hVar) {
        if (this.f4668a.e().d()) {
            this.f4669b.b(hVar);
            this.f4671d.a(hVar);
            return;
        }
        this.f4669b.a(hVar);
        this.f4671d.writeTo(hVar);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ac
    public int getSerializedSize() {
        int i;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        if (this.f4668a.e().d()) {
            i = this.f4669b.j() + this.f4671d.e();
        } else {
            i = this.f4669b.i() + this.f4671d.getSerializedSize();
        }
        this.e = i;
        return i;
    }

    @Override // com.google.protobuf.ab
    /* renamed from: b */
    public a C() {
        return new a(this.f4668a);
    }

    @Override // com.google.protobuf.ac
    /* renamed from: c */
    public a D() {
        return C().c(this);
    }

    @Override // com.google.protobuf.ac
    public ai<k> getParserForType() {
        return new c<k>() { // from class: com.google.protobuf.k.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public k d(g gVar, p pVar) {
                a b2 = k.b(k.this.f4668a);
                try {
                    b2.c(gVar, pVar);
                    return b2.r();
                } catch (u e) {
                    throw e.a(b2.r());
                } catch (IOException e2) {
                    throw new u(e2).a(b2.r());
                }
            }
        };
    }

    private void a(j.f fVar) {
        if (fVar.v() != this.f4668a) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    private void a(j.C0086j c0086j) {
        if (c0086j.b() != this.f4668a) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    /* compiled from: DynamicMessage.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0077a<a> {

        /* renamed from: a  reason: collision with root package name */
        private final j.a f4673a;

        /* renamed from: b  reason: collision with root package name */
        private q<j.f> f4674b;

        /* renamed from: c  reason: collision with root package name */
        private final j.f[] f4675c;

        /* renamed from: d  reason: collision with root package name */
        private at f4676d;

        private a(j.a aVar) {
            this.f4673a = aVar;
            this.f4674b = q.a();
            this.f4676d = at.b();
            this.f4675c = new j.f[aVar.j().p()];
        }

        @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
        /* renamed from: d */
        public a c(ab abVar) {
            if (abVar instanceof k) {
                k kVar = (k) abVar;
                if (kVar.f4668a != this.f4673a) {
                    throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
                }
                i();
                this.f4674b.a(kVar.f4669b);
                a(kVar.f4671d);
                for (int i = 0; i < this.f4675c.length; i++) {
                    if (this.f4675c[i] == null) {
                        this.f4675c[i] = kVar.f4670c[i];
                    } else if (kVar.f4670c[i] != null && this.f4675c[i] != kVar.f4670c[i]) {
                        this.f4674b.c((q<j.f>) this.f4675c[i]);
                        this.f4675c[i] = kVar.f4670c[i];
                    }
                }
                return this;
            }
            return (a) super.c(abVar);
        }

        @Override // com.google.protobuf.ac.a
        /* renamed from: e */
        public k t() {
            if (!isInitialized()) {
                throw b(new k(this.f4673a, this.f4674b, (j.f[]) Arrays.copyOf(this.f4675c, this.f4675c.length), this.f4676d));
            }
            return r();
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: f */
        public k r() {
            this.f4674b.c();
            return new k(this.f4673a, this.f4674b, (j.f[]) Arrays.copyOf(this.f4675c, this.f4675c.length), this.f4676d);
        }

        @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a
        /* renamed from: g */
        public a d() {
            a aVar = new a(this.f4673a);
            aVar.f4674b.a(this.f4674b);
            aVar.a(this.f4676d);
            System.arraycopy(this.f4675c, 0, aVar.f4675c, 0, this.f4675c.length);
            return aVar;
        }

        @Override // com.google.protobuf.ad
        public boolean isInitialized() {
            return k.a(this.f4673a, this.f4674b);
        }

        @Override // com.google.protobuf.ab.a, com.google.protobuf.af
        public j.a getDescriptorForType() {
            return this.f4673a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: h */
        public k F() {
            return k.a(this.f4673a);
        }

        @Override // com.google.protobuf.af
        public Map<j.f, Object> getAllFields() {
            return this.f4674b.f();
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: a */
        public a b(j.f fVar) {
            c(fVar);
            if (fVar.g() != j.f.a.MESSAGE) {
                throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
            }
            return new a(fVar.y());
        }

        @Override // com.google.protobuf.a.AbstractC0077a
        public boolean a(j.C0086j c0086j) {
            c(c0086j);
            return this.f4675c[c0086j.a()] != null;
        }

        @Override // com.google.protobuf.a.AbstractC0077a
        public j.f b(j.C0086j c0086j) {
            c(c0086j);
            return this.f4675c[c0086j.a()];
        }

        @Override // com.google.protobuf.af
        public boolean hasField(j.f fVar) {
            c(fVar);
            return this.f4674b.a((q<j.f>) fVar);
        }

        @Override // com.google.protobuf.af
        public Object getField(j.f fVar) {
            c(fVar);
            Object b2 = this.f4674b.b((q<j.f>) fVar);
            if (b2 == null) {
                if (fVar.p()) {
                    return Collections.emptyList();
                }
                if (fVar.g() == j.f.a.MESSAGE) {
                    return k.a(fVar.y());
                }
                return fVar.s();
            }
            return b2;
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: a */
        public a f(j.f fVar, Object obj) {
            c(fVar);
            i();
            if (fVar.i() == j.f.b.ENUM) {
                d(fVar, obj);
            }
            j.C0086j w = fVar.w();
            if (w != null) {
                int a2 = w.a();
                j.f fVar2 = this.f4675c[a2];
                if (fVar2 != null && fVar2 != fVar) {
                    this.f4674b.c((q<j.f>) fVar2);
                }
                this.f4675c[a2] = fVar;
            } else if (fVar.d().i() == j.g.b.PROTO3 && !fVar.p() && fVar.g() != j.f.a.MESSAGE && obj.equals(fVar.s())) {
                this.f4674b.c((q<j.f>) fVar);
                return this;
            }
            this.f4674b.a((q<j.f>) fVar, obj);
            return this;
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: b */
        public a e(j.f fVar, Object obj) {
            c(fVar);
            i();
            this.f4674b.b((q<j.f>) fVar, obj);
            return this;
        }

        @Override // com.google.protobuf.af
        public at getUnknownFields() {
            return this.f4676d;
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: b */
        public a f(at atVar) {
            if (getDescriptorForType().d().i() == j.g.b.PROTO3) {
                return this;
            }
            this.f4676d = atVar;
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0077a
        /* renamed from: c */
        public a a(at atVar) {
            if (getDescriptorForType().d().i() == j.g.b.PROTO3) {
                return this;
            }
            this.f4676d = at.a(this.f4676d).a(atVar).t();
            return this;
        }

        private void c(j.f fVar) {
            if (fVar.v() != this.f4673a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void c(j.C0086j c0086j) {
            if (c0086j.b() != this.f4673a) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
        }

        private void c(j.f fVar, Object obj) {
            t.a(obj);
            if (!(obj instanceof j.e)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void d(j.f fVar, Object obj) {
            if (fVar.p()) {
                for (Object obj2 : (List) obj) {
                    c(fVar, obj2);
                }
                return;
            }
            c(fVar, obj);
        }

        private void i() {
            if (this.f4674b.d()) {
                this.f4674b = this.f4674b.clone();
            }
        }
    }
}
