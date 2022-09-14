package com.google.protobuf;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.protobuf.a;
import com.google.protobuf.ab;
import com.google.protobuf.ag;
import com.google.protobuf.at;
import com.google.protobuf.ay;
import com.google.protobuf.j;
import com.google.protobuf.t;
import com.google.protobuf.v;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: GeneratedMessageV3.java */
/* loaded from: classes.dex */
public abstract class s extends com.google.protobuf.a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    protected static boolean f4719b = false;

    /* renamed from: c  reason: collision with root package name */
    protected at f4720c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: GeneratedMessageV3.java */
    /* loaded from: classes.dex */
    public interface b extends a.b {
    }

    /* loaded from: classes.dex */
    public interface e extends af {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void V() {
    }

    protected abstract ab.a b(b bVar);

    protected abstract f b();

    /* JADX INFO: Access modifiers changed from: protected */
    public s() {
        this.f4720c = at.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(a<?> aVar) {
        this.f4720c = aVar.getUnknownFields();
    }

    @Override // com.google.protobuf.ac
    public ai<? extends s> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.af
    public j.a getDescriptorForType() {
        return b().f4734a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<j.f, Object> a(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<j.f> f2 = b().f4734a.f();
        int i = 0;
        while (i < f2.size()) {
            j.f fVar = f2.get(i);
            j.C0086j w = fVar.w();
            if (w != null) {
                i += w.c() - 1;
                if (!hasOneof(w)) {
                    i++;
                } else {
                    fVar = getOneofFieldDescriptor(w);
                    if (!z && fVar.g() == j.f.a.STRING) {
                        treeMap.put(fVar, a(fVar));
                    } else {
                        treeMap.put(fVar, getField(fVar));
                    }
                    i++;
                }
            } else {
                if (fVar.p()) {
                    List list = (List) getField(fVar);
                    if (!list.isEmpty()) {
                        treeMap.put(fVar, list);
                    }
                } else {
                    if (!hasField(fVar)) {
                    }
                    if (!z) {
                    }
                    treeMap.put(fVar, getField(fVar));
                }
                i++;
            }
        }
        return treeMap;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ad
    public boolean isInitialized() {
        for (j.f fVar : getDescriptorForType().f()) {
            if (fVar.n() && !hasField(fVar)) {
                return false;
            }
            if (fVar.g() == j.f.a.MESSAGE) {
                if (fVar.p()) {
                    for (ab abVar : (List) getField(fVar)) {
                        if (!abVar.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (hasField(fVar) && !((ab) getField(fVar)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.af
    public Map<j.f, Object> getAllFields() {
        return Collections.unmodifiableMap(a(false));
    }

    Map<j.f, Object> U() {
        return Collections.unmodifiableMap(a(true));
    }

    @Override // com.google.protobuf.a
    public boolean hasOneof(j.C0086j c0086j) {
        return b().a(c0086j).a(this);
    }

    @Override // com.google.protobuf.a
    public j.f getOneofFieldDescriptor(j.C0086j c0086j) {
        return b().a(c0086j).b(this);
    }

    @Override // com.google.protobuf.af
    public boolean hasField(j.f fVar) {
        return b().a(fVar).c(this);
    }

    @Override // com.google.protobuf.af
    public Object getField(j.f fVar) {
        return b().a(fVar).a(this);
    }

    Object a(j.f fVar) {
        return b().a(fVar).b(this);
    }

    public at getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(g gVar, at.a aVar, p pVar, int i) {
        return aVar.a(i, gVar);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ac
    public void writeTo(h hVar) {
        ag.a((ab) this, U(), hVar, false);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ac
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        this.memoizedSize = ag.a(this, U());
        return this.memoizedSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.a
    public ab.a newBuilderForType(final a.b bVar) {
        return b(new b() { // from class: com.google.protobuf.s.1
            @Override // com.google.protobuf.a.b
            public void a() {
                bVar.a();
            }
        });
    }

    /* compiled from: GeneratedMessageV3.java */
    /* loaded from: classes.dex */
    public static abstract class a<BuilderType extends a<BuilderType>> extends a.AbstractC0077a<BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private b f4723a;

        /* renamed from: b  reason: collision with root package name */
        private a<BuilderType>.C0087a f4724b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4725c;

        /* renamed from: d  reason: collision with root package name */
        private at f4726d;

        protected abstract f e();

        /* JADX INFO: Access modifiers changed from: protected */
        public a() {
            this(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(b bVar) {
            this.f4726d = at.b();
            this.f4723a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.a.AbstractC0077a
        public void c() {
            this.f4723a = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void u() {
            if (this.f4723a != null) {
                b();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0077a
        public void b() {
            this.f4725c = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean v() {
            return this.f4725c;
        }

        @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a
        /* renamed from: q */
        public BuilderType d() {
            BuilderType buildertype = (BuilderType) F().C();
            buildertype.c(r());
            return buildertype;
        }

        public j.a getDescriptorForType() {
            return e().f4734a;
        }

        @Override // com.google.protobuf.af
        public Map<j.f, Object> getAllFields() {
            return Collections.unmodifiableMap(f());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<j.f, Object> f() {
            TreeMap treeMap = new TreeMap();
            List<j.f> f = e().f4734a.f();
            int i = 0;
            while (i < f.size()) {
                j.f fVar = f.get(i);
                j.C0086j w = fVar.w();
                if (w != null) {
                    i += w.c() - 1;
                    if (!a(w)) {
                        i++;
                    } else {
                        fVar = b(w);
                        treeMap.put(fVar, getField(fVar));
                        i++;
                    }
                } else {
                    if (fVar.p()) {
                        List list = (List) getField(fVar);
                        if (!list.isEmpty()) {
                            treeMap.put(fVar, list);
                        }
                    } else {
                        if (!hasField(fVar)) {
                        }
                        treeMap.put(fVar, getField(fVar));
                    }
                    i++;
                }
            }
            return treeMap;
        }

        @Override // com.google.protobuf.ab.a
        public ab.a b(j.f fVar) {
            return e().a(fVar).a();
        }

        @Override // com.google.protobuf.a.AbstractC0077a
        public boolean a(j.C0086j c0086j) {
            return e().a(c0086j).a(this);
        }

        @Override // com.google.protobuf.a.AbstractC0077a
        public j.f b(j.C0086j c0086j) {
            return e().a(c0086j).b(this);
        }

        @Override // com.google.protobuf.af
        public boolean hasField(j.f fVar) {
            return e().a(fVar).b(this);
        }

        @Override // com.google.protobuf.af
        public Object getField(j.f fVar) {
            Object a2 = e().a(fVar).a(this);
            return fVar.p() ? Collections.unmodifiableList((List) a2) : a2;
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: d */
        public BuilderType f(j.f fVar, Object obj) {
            e().a(fVar).a(this, obj);
            return this;
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: c */
        public BuilderType e(j.f fVar, Object obj) {
            e().a(fVar).b(this, obj);
            return this;
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: e */
        public BuilderType f(at atVar) {
            this.f4726d = atVar;
            x();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0077a
        /* renamed from: d */
        public BuilderType a(at atVar) {
            this.f4726d = at.a(this.f4726d).a(atVar).t();
            x();
            return this;
        }

        @Override // com.google.protobuf.ad
        public boolean isInitialized() {
            for (j.f fVar : getDescriptorForType().f()) {
                if (fVar.n() && !hasField(fVar)) {
                    return false;
                }
                if (fVar.g() == j.f.a.MESSAGE) {
                    if (fVar.p()) {
                        for (ab abVar : (List) getField(fVar)) {
                            if (!abVar.isInitialized()) {
                                return false;
                            }
                        }
                        continue;
                    } else if (hasField(fVar) && !((ab) getField(fVar)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4726d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* renamed from: com.google.protobuf.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0087a implements b {
            private C0087a() {
            }

            @Override // com.google.protobuf.a.b
            public void a() {
                a.this.x();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b w() {
            if (this.f4724b == null) {
                this.f4724b = new C0087a();
            }
            return this.f4724b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void x() {
            if (!this.f4725c || this.f4723a == null) {
                return;
            }
            this.f4723a.a();
            this.f4725c = false;
        }

        protected z f(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }

        protected z g(int i) {
            throw new RuntimeException("No map fields found in " + getClass().getName());
        }
    }

    /* compiled from: GeneratedMessageV3.java */
    /* loaded from: classes.dex */
    public static abstract class d<MessageType extends d> extends s implements e<MessageType> {

        /* renamed from: a  reason: collision with root package name */
        private final q<j.f> f4729a;

        /* JADX INFO: Access modifiers changed from: protected */
        public d() {
            this.f4729a = q.a();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d(c<MessageType, ?> cVar) {
            super(cVar);
            this.f4729a = cVar.g();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean W() {
            return this.f4729a.h();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public boolean isInitialized() {
            return super.isInitialized() && W();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        public boolean a(g gVar, at.a aVar, p pVar, int i) {
            return ag.a(gVar, aVar, pVar, getDescriptorForType(), new ag.b(this.f4729a), i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        public void V() {
            this.f4729a.c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public class a {

            /* renamed from: b  reason: collision with root package name */
            private final Iterator<Map.Entry<j.f, Object>> f4731b;

            /* renamed from: c  reason: collision with root package name */
            private Map.Entry<j.f, Object> f4732c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f4733d;

            private a(boolean z) {
                this.f4731b = d.this.f4729a.g();
                if (this.f4731b.hasNext()) {
                    this.f4732c = this.f4731b.next();
                }
                this.f4733d = z;
            }

            public void a(int i, h hVar) {
                while (this.f4732c != null && this.f4732c.getKey().f() < i) {
                    j.f key = this.f4732c.getKey();
                    if (this.f4733d && key.h() == ay.b.MESSAGE && !key.p()) {
                        if (this.f4732c instanceof v.a) {
                            hVar.b(key.f(), ((v.a) this.f4732c).a().c());
                        } else {
                            hVar.b(key.f(), (ab) this.f4732c.getValue());
                        }
                    } else {
                        q.a(key, this.f4732c.getValue(), hVar);
                    }
                    if (this.f4731b.hasNext()) {
                        this.f4732c = this.f4731b.next();
                    } else {
                        this.f4732c = null;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d<MessageType>.a X() {
            return new a(false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public int Y() {
            return this.f4729a.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Map<j.f, Object> Z() {
            return this.f4729a.f();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public Map<j.f, Object> getAllFields() {
            Map a2 = a(false);
            a2.putAll(Z());
            return Collections.unmodifiableMap(a2);
        }

        @Override // com.google.protobuf.s
        public Map<j.f, Object> U() {
            Map a2 = a(false);
            a2.putAll(Z());
            return Collections.unmodifiableMap(a2);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public boolean hasField(j.f fVar) {
            if (fVar.u()) {
                b(fVar);
                return this.f4729a.a((q<j.f>) fVar);
            }
            return super.hasField(fVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public Object getField(j.f fVar) {
            if (fVar.u()) {
                b(fVar);
                Object b2 = this.f4729a.b((q<j.f>) fVar);
                if (b2 != null) {
                    return b2;
                }
                if (fVar.p()) {
                    return Collections.emptyList();
                }
                if (fVar.g() == j.f.a.MESSAGE) {
                    return k.a(fVar.y());
                }
                return fVar.s();
            }
            return super.getField(fVar);
        }

        private void b(j.f fVar) {
            if (fVar.v() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* compiled from: GeneratedMessageV3.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends d, BuilderType extends c<MessageType, BuilderType>> extends a<BuilderType> implements e<MessageType> {

        /* renamed from: a  reason: collision with root package name */
        private q<j.f> f4728a;

        /* JADX INFO: Access modifiers changed from: protected */
        public c() {
            this.f4728a = q.b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(b bVar) {
            super(bVar);
            this.f4728a = q.b();
        }

        private void f() {
            if (this.f4728a.d()) {
                this.f4728a = this.f4728a.clone();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean k() {
            return this.f4728a.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public q<j.f> g() {
            this.f4728a.c();
            return this.f4728a;
        }

        @Override // com.google.protobuf.s.a, com.google.protobuf.ad
        public boolean isInitialized() {
            return super.isInitialized() && k();
        }

        @Override // com.google.protobuf.s.a, com.google.protobuf.af
        public Map<j.f, Object> getAllFields() {
            Map f = f();
            f.putAll(this.f4728a.f());
            return Collections.unmodifiableMap(f);
        }

        @Override // com.google.protobuf.s.a, com.google.protobuf.af
        public Object getField(j.f fVar) {
            if (fVar.u()) {
                a(fVar);
                Object b2 = this.f4728a.b((q<j.f>) fVar);
                if (b2 != null) {
                    return b2;
                }
                if (fVar.g() == j.f.a.MESSAGE) {
                    return k.a(fVar.y());
                }
                return fVar.s();
            }
            return super.getField(fVar);
        }

        @Override // com.google.protobuf.s.a, com.google.protobuf.af
        public boolean hasField(j.f fVar) {
            if (fVar.u()) {
                a(fVar);
                return this.f4728a.a((q<j.f>) fVar);
            }
            return super.hasField(fVar);
        }

        @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
        /* renamed from: h */
        public BuilderType f(j.f fVar, Object obj) {
            if (fVar.u()) {
                a(fVar);
                f();
                this.f4728a.a((q<j.f>) fVar, obj);
                x();
                return this;
            }
            return (BuilderType) super.f(fVar, obj);
        }

        @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
        /* renamed from: g */
        public BuilderType e(j.f fVar, Object obj) {
            if (fVar.u()) {
                a(fVar);
                f();
                this.f4728a.b((q<j.f>) fVar, obj);
                x();
                return this;
            }
            return (BuilderType) super.e(fVar, obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void a(d dVar) {
            f();
            this.f4728a.a(dVar.f4729a);
            x();
        }

        private void a(j.f fVar) {
            if (fVar.v() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method b(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object b(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected z g(int i) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    /* compiled from: GeneratedMessageV3.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final j.a f4734a;

        /* renamed from: b  reason: collision with root package name */
        private final a[] f4735b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f4736c;

        /* renamed from: d  reason: collision with root package name */
        private final c[] f4737d;
        private volatile boolean e = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public interface a {
            ab.a a();

            Object a(a aVar);

            Object a(s sVar);

            void a(a aVar, Object obj);

            Object b(s sVar);

            void b(a aVar, Object obj);

            boolean b(a aVar);

            boolean c(s sVar);
        }

        public f(j.a aVar, String[] strArr) {
            this.f4734a = aVar;
            this.f4736c = strArr;
            this.f4735b = new a[aVar.f().size()];
            this.f4737d = new c[aVar.g().size()];
        }

        public f a(Class<? extends s> cls, Class<? extends a> cls2) {
            if (this.e) {
                return this;
            }
            synchronized (this) {
                if (this.e) {
                    return this;
                }
                int length = this.f4735b.length;
                int i2 = 0;
                while (true) {
                    String str = null;
                    if (i2 >= length) {
                        break;
                    }
                    j.f fVar = this.f4734a.f().get(i2);
                    if (fVar.w() != null) {
                        str = this.f4736c[fVar.w().a() + length];
                    }
                    String str2 = str;
                    if (fVar.p()) {
                        if (fVar.g() == j.f.a.MESSAGE) {
                            if (fVar.m()) {
                                this.f4735b[i2] = new b(fVar, this.f4736c[i2], cls, cls2);
                            } else {
                                this.f4735b[i2] = new C0088f(fVar, this.f4736c[i2], cls, cls2);
                            }
                        } else if (fVar.g() == j.f.a.ENUM) {
                            this.f4735b[i2] = new d(fVar, this.f4736c[i2], cls, cls2);
                        } else {
                            this.f4735b[i2] = new e(fVar, this.f4736c[i2], cls, cls2);
                        }
                    } else if (fVar.g() == j.f.a.MESSAGE) {
                        this.f4735b[i2] = new i(fVar, this.f4736c[i2], cls, cls2, str2);
                    } else if (fVar.g() == j.f.a.ENUM) {
                        this.f4735b[i2] = new g(fVar, this.f4736c[i2], cls, cls2, str2);
                    } else if (fVar.g() == j.f.a.STRING) {
                        this.f4735b[i2] = new j(fVar, this.f4736c[i2], cls, cls2, str2);
                    } else {
                        this.f4735b[i2] = new h(fVar, this.f4736c[i2], cls, cls2, str2);
                    }
                    i2++;
                }
                int length2 = this.f4737d.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    this.f4737d[i3] = new c(this.f4734a, this.f4736c[i3 + length], cls, cls2);
                }
                this.e = true;
                this.f4736c = null;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(j.f fVar) {
            if (fVar.v() != this.f4734a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fVar.u()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f4735b[fVar.a()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a(j.C0086j c0086j) {
            if (c0086j.b() != this.f4734a) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
            return this.f4737d[c0086j.a()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            private final j.a f4740a;

            /* renamed from: b  reason: collision with root package name */
            private final Method f4741b;

            /* renamed from: c  reason: collision with root package name */
            private final Method f4742c;

            /* renamed from: d  reason: collision with root package name */
            private final Method f4743d;

            c(j.a aVar, String str, Class<? extends s> cls, Class<? extends a> cls2) {
                this.f4740a = aVar;
                this.f4741b = s.b(cls, "get" + str + "Case", new Class[0]);
                this.f4742c = s.b(cls2, "get" + str + "Case", new Class[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("clear");
                sb.append(str);
                this.f4743d = s.b(cls2, sb.toString(), new Class[0]);
            }

            public boolean a(s sVar) {
                return ((t.a) s.b(this.f4741b, sVar, new Object[0])).a() != 0;
            }

            public boolean a(a aVar) {
                return ((t.a) s.b(this.f4742c, aVar, new Object[0])).a() != 0;
            }

            public j.f b(s sVar) {
                int a2 = ((t.a) s.b(this.f4741b, sVar, new Object[0])).a();
                if (a2 > 0) {
                    return this.f4740a.b(a2);
                }
                return null;
            }

            public j.f b(a aVar) {
                int a2 = ((t.a) s.b(this.f4742c, aVar, new Object[0])).a();
                if (a2 > 0) {
                    return this.f4740a.b(a2);
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(j.g gVar) {
            return gVar.i() == j.g.b.PROTO2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static class h implements a {

            /* renamed from: a  reason: collision with root package name */
            protected final Class<?> f4748a;

            /* renamed from: b  reason: collision with root package name */
            protected final Method f4749b;

            /* renamed from: c  reason: collision with root package name */
            protected final Method f4750c;

            /* renamed from: d  reason: collision with root package name */
            protected final Method f4751d;
            protected final Method e;
            protected final Method f;
            protected final Method g;
            protected final Method h;
            protected final Method i;
            protected final j.f j;
            protected final boolean k;
            protected final boolean l;

            h(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2, String str2) {
                Method method;
                Method method2;
                Method method3;
                this.j = fVar;
                this.k = fVar.w() != null;
                this.l = f.b(fVar.d()) || (!this.k && fVar.g() == j.f.a.MESSAGE);
                this.f4749b = s.b(cls, "get" + str, new Class[0]);
                this.f4750c = s.b(cls2, "get" + str, new Class[0]);
                this.f4748a = this.f4749b.getReturnType();
                this.f4751d = s.b(cls2, "set" + str, this.f4748a);
                Method method4 = null;
                if (this.l) {
                    method = s.b(cls, "has" + str, new Class[0]);
                } else {
                    method = null;
                }
                this.e = method;
                if (this.l) {
                    method2 = s.b(cls2, "has" + str, new Class[0]);
                } else {
                    method2 = null;
                }
                this.f = method2;
                this.g = s.b(cls2, "clear" + str, new Class[0]);
                if (this.k) {
                    method3 = s.b(cls, "get" + str2 + "Case", new Class[0]);
                } else {
                    method3 = null;
                }
                this.h = method3;
                if (this.k) {
                    method4 = s.b(cls2, "get" + str2 + "Case", new Class[0]);
                }
                this.i = method4;
            }

            private int d(s sVar) {
                return ((t.a) s.b(this.h, sVar, new Object[0])).a();
            }

            private int c(a aVar) {
                return ((t.a) s.b(this.i, aVar, new Object[0])).a();
            }

            @Override // com.google.protobuf.s.f.a
            public Object a(s sVar) {
                return s.b(this.f4749b, sVar, new Object[0]);
            }

            @Override // com.google.protobuf.s.f.a
            public Object a(a aVar) {
                return s.b(this.f4750c, aVar, new Object[0]);
            }

            @Override // com.google.protobuf.s.f.a
            public Object b(s sVar) {
                return a(sVar);
            }

            @Override // com.google.protobuf.s.f.a
            public void a(a aVar, Object obj) {
                s.b(this.f4751d, aVar, obj);
            }

            @Override // com.google.protobuf.s.f.a
            public void b(a aVar, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.s.f.a
            public boolean c(s sVar) {
                if (this.l) {
                    return ((Boolean) s.b(this.e, sVar, new Object[0])).booleanValue();
                }
                if (!this.k) {
                    return !a(sVar).equals(this.j.s());
                }
                return d(sVar) == this.j.f();
            }

            @Override // com.google.protobuf.s.f.a
            public boolean b(a aVar) {
                if (this.l) {
                    return ((Boolean) s.b(this.f, aVar, new Object[0])).booleanValue();
                }
                if (!this.k) {
                    return !a(aVar).equals(this.j.s());
                }
                return c(aVar) == this.j.f();
            }

            @Override // com.google.protobuf.s.f.a
            public ab.a a() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static class e implements a {

            /* renamed from: a  reason: collision with root package name */
            protected final Class f4744a;

            /* renamed from: b  reason: collision with root package name */
            protected final Method f4745b;

            /* renamed from: c  reason: collision with root package name */
            protected final Method f4746c;

            /* renamed from: d  reason: collision with root package name */
            protected final Method f4747d;
            protected final Method e;
            protected final Method f;
            protected final Method g;
            protected final Method h;
            protected final Method i;
            protected final Method j;

            e(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2) {
                this.f4745b = s.b(cls, "get" + str + "List", new Class[0]);
                this.f4746c = s.b(cls2, "get" + str + "List", new Class[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("get");
                sb.append(str);
                this.f4747d = s.b(cls, sb.toString(), Integer.TYPE);
                this.e = s.b(cls2, "get" + str, Integer.TYPE);
                this.f4744a = this.f4747d.getReturnType();
                this.f = s.b(cls2, "set" + str, Integer.TYPE, this.f4744a);
                this.g = s.b(cls2, ProductAction.ACTION_ADD + str, this.f4744a);
                this.h = s.b(cls, "get" + str + "Count", new Class[0]);
                this.i = s.b(cls2, "get" + str + "Count", new Class[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("clear");
                sb2.append(str);
                this.j = s.b(cls2, sb2.toString(), new Class[0]);
            }

            @Override // com.google.protobuf.s.f.a
            public Object a(s sVar) {
                return s.b(this.f4745b, sVar, new Object[0]);
            }

            @Override // com.google.protobuf.s.f.a
            public Object a(a aVar) {
                return s.b(this.f4746c, aVar, new Object[0]);
            }

            @Override // com.google.protobuf.s.f.a
            public Object b(s sVar) {
                return a(sVar);
            }

            @Override // com.google.protobuf.s.f.a
            public void a(a aVar, Object obj) {
                d(aVar);
                for (Object obj2 : (List) obj) {
                    b(aVar, obj2);
                }
            }

            public Object a(s sVar, int i) {
                return s.b(this.f4747d, sVar, Integer.valueOf(i));
            }

            public Object a(a aVar, int i) {
                return s.b(this.e, aVar, Integer.valueOf(i));
            }

            @Override // com.google.protobuf.s.f.a
            public void b(a aVar, Object obj) {
                s.b(this.g, aVar, obj);
            }

            @Override // com.google.protobuf.s.f.a
            public boolean c(s sVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.s.f.a
            public boolean b(a aVar) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            public int d(s sVar) {
                return ((Integer) s.b(this.h, sVar, new Object[0])).intValue();
            }

            public int c(a aVar) {
                return ((Integer) s.b(this.i, aVar, new Object[0])).intValue();
            }

            public void d(a aVar) {
                s.b(this.j, aVar, new Object[0]);
            }

            @Override // com.google.protobuf.s.f.a
            public ab.a a() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final j.f f4738a;

            /* renamed from: b  reason: collision with root package name */
            private final ab f4739b;

            b(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2) {
                this.f4738a = fVar;
                this.f4739b = e((s) s.b(s.b(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).d();
            }

            private z<?, ?> e(s sVar) {
                return sVar.g(this.f4738a.f());
            }

            private z<?, ?> e(a aVar) {
                return aVar.f(this.f4738a.f());
            }

            private z<?, ?> f(a aVar) {
                return aVar.g(this.f4738a.f());
            }

            private ab a(ab abVar) {
                if (abVar == null) {
                    return null;
                }
                return this.f4739b.getClass().isInstance(abVar) ? abVar : this.f4739b.B().c(abVar).s();
            }

            @Override // com.google.protobuf.s.f.a
            public Object a(s sVar) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < d(sVar); i++) {
                    arrayList.add(a(sVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.s.f.a
            public Object a(a aVar) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < c(aVar); i++) {
                    arrayList.add(a(aVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.s.f.a
            public Object b(s sVar) {
                return a(sVar);
            }

            @Override // com.google.protobuf.s.f.a
            public void a(a aVar, Object obj) {
                d(aVar);
                for (Object obj2 : (List) obj) {
                    b(aVar, obj2);
                }
            }

            public Object a(s sVar, int i) {
                return e(sVar).b().get(i);
            }

            public Object a(a aVar, int i) {
                return e(aVar).b().get(i);
            }

            @Override // com.google.protobuf.s.f.a
            public void b(a aVar, Object obj) {
                f(aVar).c().add(a((ab) obj));
            }

            @Override // com.google.protobuf.s.f.a
            public boolean c(s sVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.s.f.a
            public boolean b(a aVar) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public int d(s sVar) {
                return e(sVar).b().size();
            }

            public int c(a aVar) {
                return e(aVar).b().size();
            }

            public void d(a aVar) {
                f(aVar).c().clear();
            }

            @Override // com.google.protobuf.s.f.a
            public ab.a a() {
                return this.f4739b.C();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static final class g extends h {
            private j.d m;
            private Method n;
            private Method o;
            private boolean p;
            private Method q;
            private Method r;
            private Method s;

            g(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2, String str2) {
                super(fVar, str, cls, cls2, str2);
                this.m = fVar.z();
                this.n = s.b(this.f4748a, "valueOf", j.e.class);
                this.o = s.b(this.f4748a, "getValueDescriptor", new Class[0]);
                this.p = fVar.d().k();
                if (this.p) {
                    this.q = s.b(cls, "get" + str + "Value", new Class[0]);
                    this.r = s.b(cls2, "get" + str + "Value", new Class[0]);
                    this.s = s.b(cls2, "set" + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public Object a(s sVar) {
                if (this.p) {
                    return this.m.b(((Integer) s.b(this.q, sVar, new Object[0])).intValue());
                }
                return s.b(this.o, super.a(sVar), new Object[0]);
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public Object a(a aVar) {
                if (this.p) {
                    return this.m.b(((Integer) s.b(this.r, aVar, new Object[0])).intValue());
                }
                return s.b(this.o, super.a(aVar), new Object[0]);
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public void a(a aVar, Object obj) {
                if (this.p) {
                    s.b(this.s, aVar, Integer.valueOf(((j.e) obj).a()));
                } else {
                    super.a(aVar, s.b(this.n, (Object) null, obj));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static final class d extends e {
            private j.d k;
            private final Method l;
            private final Method m;
            private boolean n;
            private Method o;
            private Method p;
            private Method q;
            private Method r;

            d(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2) {
                super(fVar, str, cls, cls2);
                this.k = fVar.z();
                this.l = s.b(this.f4744a, "valueOf", j.e.class);
                this.m = s.b(this.f4744a, "getValueDescriptor", new Class[0]);
                this.n = fVar.d().k();
                if (this.n) {
                    this.o = s.b(cls, "get" + str + "Value", Integer.TYPE);
                    this.p = s.b(cls2, "get" + str + "Value", Integer.TYPE);
                    this.q = s.b(cls2, "set" + str + "Value", Integer.TYPE, Integer.TYPE);
                    this.r = s.b(cls2, ProductAction.ACTION_ADD + str + "Value", Integer.TYPE);
                }
            }

            @Override // com.google.protobuf.s.f.e, com.google.protobuf.s.f.a
            public Object a(s sVar) {
                ArrayList arrayList = new ArrayList();
                int d2 = d(sVar);
                for (int i = 0; i < d2; i++) {
                    arrayList.add(a(sVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.s.f.e, com.google.protobuf.s.f.a
            public Object a(a aVar) {
                ArrayList arrayList = new ArrayList();
                int c2 = c(aVar);
                for (int i = 0; i < c2; i++) {
                    arrayList.add(a(aVar, i));
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.s.f.e
            public Object a(s sVar, int i) {
                if (!this.n) {
                    return s.b(this.m, super.a(sVar, i), new Object[0]);
                }
                return this.k.b(((Integer) s.b(this.o, sVar, Integer.valueOf(i))).intValue());
            }

            @Override // com.google.protobuf.s.f.e
            public Object a(a aVar, int i) {
                if (!this.n) {
                    return s.b(this.m, super.a(aVar, i), new Object[0]);
                }
                return this.k.b(((Integer) s.b(this.p, aVar, Integer.valueOf(i))).intValue());
            }

            @Override // com.google.protobuf.s.f.e, com.google.protobuf.s.f.a
            public void b(a aVar, Object obj) {
                if (this.n) {
                    s.b(this.r, aVar, Integer.valueOf(((j.e) obj).a()));
                } else {
                    super.b(aVar, s.b(this.l, (Object) null, obj));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static final class j extends h {
            private final Method m;
            private final Method n;
            private final Method o;

            j(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2, String str2) {
                super(fVar, str, cls, cls2, str2);
                this.m = s.b(cls, "get" + str + "Bytes", new Class[0]);
                this.n = s.b(cls2, "get" + str + "Bytes", new Class[0]);
                this.o = s.b(cls2, "set" + str + "Bytes", com.google.protobuf.f.class);
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public Object b(s sVar) {
                return s.b(this.m, sVar, new Object[0]);
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public void a(a aVar, Object obj) {
                if (obj instanceof com.google.protobuf.f) {
                    s.b(this.o, aVar, obj);
                } else {
                    super.a(aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* loaded from: classes.dex */
        public static final class i extends h {
            private final Method m;
            private final Method n;

            i(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2, String str2) {
                super(fVar, str, cls, cls2, str2);
                this.m = s.b(this.f4748a, "newBuilder", new Class[0]);
                this.n = s.b(cls2, "get" + str + "Builder", new Class[0]);
            }

            private Object a(Object obj) {
                return this.f4748a.isInstance(obj) ? obj : ((ab.a) s.b(this.m, (Object) null, new Object[0])).c((ab) obj).r();
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public void a(a aVar, Object obj) {
                super.a(aVar, a(obj));
            }

            @Override // com.google.protobuf.s.f.h, com.google.protobuf.s.f.a
            public ab.a a() {
                return (ab.a) s.b(this.m, (Object) null, new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: GeneratedMessageV3.java */
        /* renamed from: com.google.protobuf.s$f$f  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0088f extends e {
            private final Method k;
            private final Method l;

            C0088f(j.f fVar, String str, Class<? extends s> cls, Class<? extends a> cls2) {
                super(fVar, str, cls, cls2);
                this.k = s.b(this.f4744a, "newBuilder", new Class[0]);
                this.l = s.b(cls2, "get" + str + "Builder", Integer.TYPE);
            }

            private Object a(Object obj) {
                return this.f4744a.isInstance(obj) ? obj : ((ab.a) s.b(this.k, (Object) null, new Object[0])).c((ab) obj).s();
            }

            @Override // com.google.protobuf.s.f.e, com.google.protobuf.s.f.a
            public void b(a aVar, Object obj) {
                super.b(aVar, a(obj));
            }

            @Override // com.google.protobuf.s.f.e, com.google.protobuf.s.f.a
            public ab.a a() {
                return (ab.a) s.b(this.k, (Object) null, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(int i, Object obj) {
        if (obj instanceof String) {
            return h.b(i, (String) obj);
        }
        return h.c(i, (com.google.protobuf.f) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(Object obj) {
        if (obj instanceof String) {
            return h.b((String) obj);
        }
        return h.b((com.google.protobuf.f) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(h hVar, int i, Object obj) {
        if (obj instanceof String) {
            hVar.a(i, (String) obj);
        } else {
            hVar.a(i, (com.google.protobuf.f) obj);
        }
    }
}
