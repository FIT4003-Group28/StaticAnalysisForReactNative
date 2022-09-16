package com.google.protobuf;

import com.google.protobuf.ac;
import com.google.protobuf.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: UnknownFieldSet.java */
/* loaded from: classes.dex */
public final class at implements ac {

    /* renamed from: a  reason: collision with root package name */
    private static final at f4376a = new at(Collections.emptyMap(), Collections.emptyMap());

    /* renamed from: c  reason: collision with root package name */
    private static final c f4377c = new c();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, b> f4378b;

    @Override // com.google.protobuf.ad
    public boolean isInitialized() {
        return true;
    }

    private at() {
        this.f4378b = null;
    }

    public static a a() {
        return a.f();
    }

    public static a a(at atVar) {
        return a().a(atVar);
    }

    public static at b() {
        return f4376a;
    }

    @Override // com.google.protobuf.ad
    /* renamed from: c */
    public at E() {
        return f4376a;
    }

    at(Map<Integer, b> map, Map<Integer, b> map2) {
        this.f4378b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at) && this.f4378b.equals(((at) obj).f4378b);
    }

    public int hashCode() {
        return this.f4378b.hashCode();
    }

    public Map<Integer, b> d() {
        return this.f4378b;
    }

    @Override // com.google.protobuf.ac
    public void writeTo(h hVar) {
        for (Map.Entry<Integer, b> entry : this.f4378b.entrySet()) {
            entry.getValue().a(entry.getKey().intValue(), hVar);
        }
    }

    public String toString() {
        return ap.a(this);
    }

    @Override // com.google.protobuf.ac
    public f toByteString() {
        try {
            f.e b2 = f.b(getSerializedSize());
            writeTo(b2.b());
            return b2.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // com.google.protobuf.ac
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            h a2 = h.a(bArr);
            writeTo(a2);
            a2.c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // com.google.protobuf.ac
    public int getSerializedSize() {
        int i = 0;
        for (Map.Entry<Integer, b> entry : this.f4378b.entrySet()) {
            i += entry.getValue().a(entry.getKey().intValue());
        }
        return i;
    }

    public void a(h hVar) {
        for (Map.Entry<Integer, b> entry : this.f4378b.entrySet()) {
            entry.getValue().b(entry.getKey().intValue(), hVar);
        }
    }

    public int e() {
        int i = 0;
        for (Map.Entry<Integer, b> entry : this.f4378b.entrySet()) {
            i += entry.getValue().b(entry.getKey().intValue());
        }
        return i;
    }

    @Override // com.google.protobuf.ac
    /* renamed from: f */
    public a D() {
        return a().a(this);
    }

    /* compiled from: UnknownFieldSet.java */
    /* loaded from: classes.dex */
    public static final class a implements ac.a {

        /* renamed from: a  reason: collision with root package name */
        private Map<Integer, b> f4379a;

        /* renamed from: b  reason: collision with root package name */
        private int f4380b;

        /* renamed from: c  reason: collision with root package name */
        private b.a f4381c;

        @Override // com.google.protobuf.ad
        public boolean isInitialized() {
            return true;
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a f() {
            a aVar = new a();
            aVar.g();
            return aVar;
        }

        private b.a b(int i) {
            if (this.f4381c != null) {
                if (i == this.f4380b) {
                    return this.f4381c;
                }
                b(this.f4380b, this.f4381c.a());
            }
            if (i == 0) {
                return null;
            }
            b bVar = this.f4379a.get(Integer.valueOf(i));
            this.f4380b = i;
            this.f4381c = b.a();
            if (bVar != null) {
                this.f4381c.a(bVar);
            }
            return this.f4381c;
        }

        @Override // com.google.protobuf.ac.a
        /* renamed from: a */
        public at t() {
            at atVar;
            b(0);
            if (this.f4379a.isEmpty()) {
                atVar = at.b();
            } else {
                atVar = new at(Collections.unmodifiableMap(this.f4379a), null);
            }
            this.f4379a = null;
            return atVar;
        }

        public at b() {
            return t();
        }

        /* renamed from: c */
        public a clone() {
            b(0);
            return at.a().a(new at(this.f4379a, null));
        }

        @Override // com.google.protobuf.ad
        /* renamed from: d */
        public at E() {
            return at.b();
        }

        private void g() {
            this.f4379a = Collections.emptyMap();
            this.f4380b = 0;
            this.f4381c = null;
        }

        public a a(at atVar) {
            if (atVar != at.b()) {
                for (Map.Entry entry : atVar.f4378b.entrySet()) {
                    a(((Integer) entry.getKey()).intValue(), (b) entry.getValue());
                }
            }
            return this;
        }

        public a a(int i, b bVar) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (a(i)) {
                b(i).a(bVar);
            } else {
                b(i, bVar);
            }
            return this;
        }

        public a a(int i, int i2) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            b(i).a(i2);
            return this;
        }

        public boolean a(int i) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            return i == this.f4380b || this.f4379a.containsKey(Integer.valueOf(i));
        }

        public a b(int i, b bVar) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            if (this.f4381c != null && this.f4380b == i) {
                this.f4381c = null;
                this.f4380b = 0;
            }
            if (this.f4379a.isEmpty()) {
                this.f4379a = new TreeMap();
            }
            this.f4379a.put(Integer.valueOf(i), bVar);
            return this;
        }

        public a a(g gVar) {
            int a2;
            do {
                a2 = gVar.a();
                if (a2 == 0) {
                    break;
                }
            } while (a(a2, gVar));
            return this;
        }

        public boolean a(int i, g gVar) {
            int b2 = ay.b(i);
            switch (ay.a(i)) {
                case 0:
                    b(b2).a(gVar.e());
                    return true;
                case 1:
                    b(b2).b(gVar.g());
                    return true;
                case 2:
                    b(b2).a(gVar.l());
                    return true;
                case 3:
                    a a2 = at.a();
                    gVar.a(b2, a2, n.a());
                    b(b2).a(a2.t());
                    return true;
                case 4:
                    return false;
                case 5:
                    b(b2).a(gVar.h());
                    return true;
                default:
                    throw u.h();
            }
        }

        @Override // com.google.protobuf.ac.a
        /* renamed from: a */
        public a c(g gVar, p pVar) {
            return a(gVar);
        }
    }

    /* compiled from: UnknownFieldSet.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final b f4382a = a().a();

        /* renamed from: b  reason: collision with root package name */
        private List<Long> f4383b;

        /* renamed from: c  reason: collision with root package name */
        private List<Integer> f4384c;

        /* renamed from: d  reason: collision with root package name */
        private List<Long> f4385d;
        private List<f> e;
        private List<at> f;

        b() {
        }

        public static a a() {
            return a.c();
        }

        public List<Long> b() {
            return this.f4383b;
        }

        public List<Integer> c() {
            return this.f4384c;
        }

        public List<Long> d() {
            return this.f4385d;
        }

        public List<f> e() {
            return this.e;
        }

        public List<at> f() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Arrays.equals(g(), ((b) obj).g());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(g());
        }

        private Object[] g() {
            return new Object[]{this.f4383b, this.f4384c, this.f4385d, this.e, this.f};
        }

        public void a(int i, h hVar) {
            for (Long l : this.f4383b) {
                hVar.b(i, l.longValue());
            }
            for (Integer num : this.f4384c) {
                hVar.d(i, num.intValue());
            }
            for (Long l2 : this.f4385d) {
                hVar.c(i, l2.longValue());
            }
            for (f fVar : this.e) {
                hVar.a(i, fVar);
            }
            for (at atVar : this.f) {
                hVar.e(i, atVar);
            }
        }

        public int a(int i) {
            int i2 = 0;
            for (Long l : this.f4383b) {
                i2 += h.e(i, l.longValue());
            }
            for (Integer num : this.f4384c) {
                i2 += h.h(i, num.intValue());
            }
            for (Long l2 : this.f4385d) {
                i2 += h.f(i, l2.longValue());
            }
            for (f fVar : this.e) {
                i2 += h.c(i, fVar);
            }
            for (at atVar : this.f) {
                i2 += h.f(i, atVar);
            }
            return i2;
        }

        public void b(int i, h hVar) {
            for (f fVar : this.e) {
                hVar.b(i, fVar);
            }
        }

        public int b(int i) {
            int i2 = 0;
            for (f fVar : this.e) {
                i2 += h.d(i, fVar);
            }
            return i2;
        }

        /* compiled from: UnknownFieldSet.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private b f4386a;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static a c() {
                a aVar = new a();
                aVar.f4386a = new b();
                return aVar;
            }

            public b a() {
                if (this.f4386a.f4383b == null) {
                    this.f4386a.f4383b = Collections.emptyList();
                } else {
                    this.f4386a.f4383b = Collections.unmodifiableList(this.f4386a.f4383b);
                }
                if (this.f4386a.f4384c == null) {
                    this.f4386a.f4384c = Collections.emptyList();
                } else {
                    this.f4386a.f4384c = Collections.unmodifiableList(this.f4386a.f4384c);
                }
                if (this.f4386a.f4385d == null) {
                    this.f4386a.f4385d = Collections.emptyList();
                } else {
                    this.f4386a.f4385d = Collections.unmodifiableList(this.f4386a.f4385d);
                }
                if (this.f4386a.e == null) {
                    this.f4386a.e = Collections.emptyList();
                } else {
                    this.f4386a.e = Collections.unmodifiableList(this.f4386a.e);
                }
                if (this.f4386a.f == null) {
                    this.f4386a.f = Collections.emptyList();
                } else {
                    this.f4386a.f = Collections.unmodifiableList(this.f4386a.f);
                }
                b bVar = this.f4386a;
                this.f4386a = null;
                return bVar;
            }

            public a a(b bVar) {
                if (!bVar.f4383b.isEmpty()) {
                    if (this.f4386a.f4383b == null) {
                        this.f4386a.f4383b = new ArrayList();
                    }
                    this.f4386a.f4383b.addAll(bVar.f4383b);
                }
                if (!bVar.f4384c.isEmpty()) {
                    if (this.f4386a.f4384c == null) {
                        this.f4386a.f4384c = new ArrayList();
                    }
                    this.f4386a.f4384c.addAll(bVar.f4384c);
                }
                if (!bVar.f4385d.isEmpty()) {
                    if (this.f4386a.f4385d == null) {
                        this.f4386a.f4385d = new ArrayList();
                    }
                    this.f4386a.f4385d.addAll(bVar.f4385d);
                }
                if (!bVar.e.isEmpty()) {
                    if (this.f4386a.e == null) {
                        this.f4386a.e = new ArrayList();
                    }
                    this.f4386a.e.addAll(bVar.e);
                }
                if (!bVar.f.isEmpty()) {
                    if (this.f4386a.f == null) {
                        this.f4386a.f = new ArrayList();
                    }
                    this.f4386a.f.addAll(bVar.f);
                }
                return this;
            }

            public a a(long j) {
                if (this.f4386a.f4383b == null) {
                    this.f4386a.f4383b = new ArrayList();
                }
                this.f4386a.f4383b.add(Long.valueOf(j));
                return this;
            }

            public a a(int i) {
                if (this.f4386a.f4384c == null) {
                    this.f4386a.f4384c = new ArrayList();
                }
                this.f4386a.f4384c.add(Integer.valueOf(i));
                return this;
            }

            public a b(long j) {
                if (this.f4386a.f4385d == null) {
                    this.f4386a.f4385d = new ArrayList();
                }
                this.f4386a.f4385d.add(Long.valueOf(j));
                return this;
            }

            public a a(f fVar) {
                if (this.f4386a.e == null) {
                    this.f4386a.e = new ArrayList();
                }
                this.f4386a.e.add(fVar);
                return this;
            }

            public a a(at atVar) {
                if (this.f4386a.f == null) {
                    this.f4386a.f = new ArrayList();
                }
                this.f4386a.f.add(atVar);
                return this;
            }
        }
    }

    /* compiled from: UnknownFieldSet.java */
    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.c<at> {
        @Override // com.google.protobuf.ai
        /* renamed from: c */
        public at d(g gVar, p pVar) {
            a a2 = at.a();
            try {
                a2.a(gVar);
                return a2.b();
            } catch (u e) {
                throw e.a(a2.b());
            } catch (IOException e2) {
                throw new u(e2).a(a2.b());
            }
        }
    }

    @Override // com.google.protobuf.ac
    /* renamed from: g */
    public final c getParserForType() {
        return f4377c;
    }
}
