package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.ab;
import com.google.protobuf.ac;
import com.google.protobuf.ap;
import com.google.protobuf.ay;
import com.google.protobuf.i;
import com.google.protobuf.q;
import com.google.protobuf.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
/* compiled from: Descriptors.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4605a = Logger.getLogger(j.class.getName());

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract String b();

        public abstract String c();

        public abstract g d();

        public abstract ab j();
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class g extends h {

        /* renamed from: a  reason: collision with root package name */
        private i.o f4648a;

        /* renamed from: b  reason: collision with root package name */
        private final a[] f4649b;

        /* renamed from: c  reason: collision with root package name */
        private final d[] f4650c;

        /* renamed from: d  reason: collision with root package name */
        private final k[] f4651d;
        private final f[] e;
        private final g[] f;
        private final g[] g;
        private final b h;

        /* compiled from: Descriptors.java */
        /* loaded from: classes.dex */
        public interface a {
            n a(g gVar);
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this;
        }

        @Override // com.google.protobuf.j.h
        /* renamed from: a */
        public i.o j() {
            return this.f4648a;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4648a.d();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4648a.d();
        }

        public String e() {
            return this.f4648a.f();
        }

        public i.q f() {
            return this.f4648a.v();
        }

        public List<a> g() {
            return Collections.unmodifiableList(Arrays.asList(this.f4649b));
        }

        public List<g> h() {
            return Collections.unmodifiableList(Arrays.asList(this.g));
        }

        /* compiled from: Descriptors.java */
        /* loaded from: classes.dex */
        public enum b {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");
            

            /* renamed from: d  reason: collision with root package name */
            private final String f4655d;

            b(String str) {
                this.f4655d = str;
            }
        }

        public b i() {
            if (b.PROTO3.f4655d.equals(this.f4648a.z())) {
                return b.PROTO3;
            }
            return b.PROTO2;
        }

        public f a(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (e().length() > 0) {
                str = e() + '.' + str;
            }
            h a2 = this.h.a(str);
            if (a2 != null && (a2 instanceof f) && a2.d() == this) {
                return (f) a2;
            }
            return null;
        }

        public static g a(i.o oVar, g[] gVarArr, boolean z) {
            g gVar = new g(oVar, gVarArr, new b(gVarArr, z), z);
            gVar.l();
            return gVar;
        }

        public static void a(String[] strArr, g[] gVarArr, a aVar) {
            i.o a2;
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            byte[] bytes = sb.toString().getBytes(t.f4753b);
            try {
                try {
                    g a3 = a(i.o.a(bytes), gVarArr, true);
                    n a4 = aVar.a(a3);
                    if (a4 == null) {
                        return;
                    }
                    try {
                        a3.a(i.o.a(bytes, a4));
                    } catch (u e) {
                        throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e);
                    }
                } catch (c e2) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + a2.d() + "\".", e2);
                }
            } catch (u e3) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e3);
            }
        }

        private g(i.o oVar, g[] gVarArr, b bVar, boolean z) {
            this.h = bVar;
            this.f4648a = oVar;
            this.f = (g[]) gVarArr.clone();
            HashMap hashMap = new HashMap();
            for (g gVar : gVarArr) {
                hashMap.put(gVar.b(), gVar);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < oVar.j(); i++) {
                int b2 = oVar.b(i);
                if (b2 < 0 || b2 >= oVar.h()) {
                    throw new c(this, "Invalid public dependency index.");
                }
                String a2 = oVar.a(b2);
                g gVar2 = (g) hashMap.get(a2);
                if (gVar2 != null) {
                    arrayList.add(gVar2);
                } else if (!z) {
                    throw new c(this, "Invalid public dependency: " + a2);
                }
            }
            this.g = new g[arrayList.size()];
            arrayList.toArray(this.g);
            bVar.a(e(), this);
            this.f4649b = new a[oVar.n()];
            for (int i2 = 0; i2 < oVar.n(); i2++) {
                this.f4649b[i2] = new a(oVar.c(i2), this, null, i2);
            }
            this.f4650c = new d[oVar.p()];
            for (int i3 = 0; i3 < oVar.p(); i3++) {
                this.f4650c[i3] = new d(oVar.d(i3), this, null, i3);
            }
            this.f4651d = new k[oVar.r()];
            for (int i4 = 0; i4 < oVar.r(); i4++) {
                this.f4651d[i4] = new k(oVar.e(i4), this, i4);
            }
            this.e = new f[oVar.t()];
            for (int i5 = 0; i5 < oVar.t(); i5++) {
                this.e[i5] = new f(oVar.f(i5), this, null, i5, true);
            }
        }

        g(String str, a aVar) {
            this.h = new b(new g[0], true);
            i.o.a G = i.o.G();
            this.f4648a = G.a(aVar.c() + ".placeholder.proto").b(str).a(aVar.j()).t();
            this.f = new g[0];
            this.g = new g[0];
            this.f4649b = new a[]{aVar};
            this.f4650c = new d[0];
            this.f4651d = new k[0];
            this.e = new f[0];
            this.h.a(str, this);
            this.h.c(aVar);
        }

        private void l() {
            for (a aVar : this.f4649b) {
                aVar.k();
            }
            for (k kVar : this.f4651d) {
                kVar.e();
            }
            for (f fVar : this.e) {
                fVar.A();
            }
        }

        private void a(i.o oVar) {
            this.f4648a = oVar;
            for (int i = 0; i < this.f4649b.length; i++) {
                this.f4649b[i].a(oVar.c(i));
            }
            for (int i2 = 0; i2 < this.f4650c.length; i2++) {
                this.f4650c[i2].a(oVar.d(i2));
            }
            for (int i3 = 0; i3 < this.f4651d.length; i3++) {
                this.f4651d[i3].a(oVar.e(i3));
            }
            for (int i4 = 0; i4 < this.e.length; i4++) {
                this.e[i4].a(oVar.f(i4));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean k() {
            return i() == b.PROTO3;
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        private final int f4608a;

        /* renamed from: b  reason: collision with root package name */
        private i.a f4609b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4610c;

        /* renamed from: d  reason: collision with root package name */
        private final g f4611d;
        private final a e;
        private final a[] f;
        private final d[] g;
        private final f[] h;
        private final f[] i;
        private final C0086j[] j;

        @Override // com.google.protobuf.j.h
        /* renamed from: a */
        public i.a j() {
            return this.f4609b;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4609b.d();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4610c;
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this.f4611d;
        }

        public i.s e() {
            return this.f4609b.r();
        }

        public List<f> f() {
            return Collections.unmodifiableList(Arrays.asList(this.h));
        }

        public List<C0086j> g() {
            return Collections.unmodifiableList(Arrays.asList(this.j));
        }

        public List<f> h() {
            return Collections.unmodifiableList(Arrays.asList(this.i));
        }

        public List<a> i() {
            return Collections.unmodifiableList(Arrays.asList(this.f));
        }

        public boolean a(int i) {
            for (i.a.b bVar : this.f4609b.m()) {
                if (bVar.d() <= i && i < bVar.f()) {
                    return true;
                }
            }
            return false;
        }

        public f a(String str) {
            b bVar = this.f4611d.h;
            h a2 = bVar.a(this.f4610c + '.' + str);
            if (a2 == null || !(a2 instanceof f)) {
                return null;
            }
            return (f) a2;
        }

        public f b(int i) {
            return (f) this.f4611d.h.f4615d.get(new b.a(this, i));
        }

        a(String str) {
            String str2;
            String str3;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str.substring(lastIndexOf + 1);
                str2 = str.substring(0, lastIndexOf);
            } else {
                str2 = "";
                str3 = str;
            }
            this.f4608a = 0;
            this.f4609b = i.a.x().a(str3).a(i.a.b.h().a(1).b(536870912).t()).t();
            this.f4610c = str;
            this.e = null;
            this.f = new a[0];
            this.g = new d[0];
            this.h = new f[0];
            this.i = new f[0];
            this.j = new C0086j[0];
            this.f4611d = new g(str2, this);
        }

        private a(i.a aVar, g gVar, a aVar2, int i) {
            this.f4608a = i;
            this.f4609b = aVar;
            this.f4610c = j.b(gVar, aVar2, aVar.d());
            this.f4611d = gVar;
            this.e = aVar2;
            this.j = new C0086j[aVar.p()];
            for (int i2 = 0; i2 < aVar.p(); i2++) {
                this.j[i2] = new C0086j(aVar.e(i2), gVar, this, i2);
            }
            this.f = new a[aVar.j()];
            for (int i3 = 0; i3 < aVar.j(); i3++) {
                this.f[i3] = new a(aVar.c(i3), gVar, this, i3);
            }
            this.g = new d[aVar.l()];
            for (int i4 = 0; i4 < aVar.l(); i4++) {
                this.g[i4] = new d(aVar.d(i4), gVar, this, i4);
            }
            this.h = new f[aVar.f()];
            for (int i5 = 0; i5 < aVar.f(); i5++) {
                this.h[i5] = new f(aVar.a(i5), gVar, this, i5, false);
            }
            this.i = new f[aVar.h()];
            for (int i6 = 0; i6 < aVar.h(); i6++) {
                this.i[i6] = new f(aVar.b(i6), gVar, this, i6, true);
            }
            for (int i7 = 0; i7 < aVar.p(); i7++) {
                this.j[i7].g = new f[this.j[i7].c()];
                this.j[i7].f = 0;
            }
            for (int i8 = 0; i8 < aVar.f(); i8++) {
                C0086j w = this.h[i8].w();
                if (w != null) {
                    w.g[C0086j.b(w)] = this.h[i8];
                }
            }
            gVar.h.c(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k() {
            for (a aVar : this.f) {
                aVar.k();
            }
            for (f fVar : this.h) {
                fVar.A();
            }
            for (f fVar2 : this.i) {
                fVar2.A();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.a aVar) {
            this.f4609b = aVar;
            for (int i = 0; i < this.f.length; i++) {
                this.f[i].a(aVar.c(i));
            }
            for (int i2 = 0; i2 < this.j.length; i2++) {
                this.j[i2].a(aVar.e(i2));
            }
            for (int i3 = 0; i3 < this.g.length; i3++) {
                this.g[i3].a(aVar.d(i3));
            }
            for (int i4 = 0; i4 < this.h.length; i4++) {
                this.h[i4].a(aVar.a(i4));
            }
            for (int i5 = 0; i5 < this.i.length; i5++) {
                this.i[i5].a(aVar.b(i5));
            }
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class f extends h implements q.a<f>, Comparable<f> {

        /* renamed from: a  reason: collision with root package name */
        private static final ay.a[] f4636a = ay.a.values();

        /* renamed from: b  reason: collision with root package name */
        private final int f4637b;

        /* renamed from: c  reason: collision with root package name */
        private i.k f4638c;

        /* renamed from: d  reason: collision with root package name */
        private final String f4639d;
        private final String e;
        private final g f;
        private final a g;
        private b h;
        private a i;
        private a j;
        private C0086j k;
        private d l;
        private Object m;

        public int a() {
            return this.f4637b;
        }

        @Override // com.google.protobuf.j.h
        /* renamed from: e */
        public i.k j() {
            return this.f4638c;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4638c.d();
        }

        @Override // com.google.protobuf.q.a
        public int f() {
            return this.f4638c.f();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4639d;
        }

        public a g() {
            return this.h.a();
        }

        @Override // com.google.protobuf.q.a
        public ay.b h() {
            return k().a();
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this.f;
        }

        public b i() {
            return this.h;
        }

        @Override // com.google.protobuf.q.a
        public ay.a k() {
            return f4636a[this.h.ordinal()];
        }

        public boolean l() {
            if (this.h != b.STRING) {
                return false;
            }
            if (v().e().j() || d().i() == g.b.PROTO3) {
                return true;
            }
            return d().f().l();
        }

        public boolean m() {
            return i() == b.MESSAGE && p() && y().e().j();
        }

        static {
            if (b.values().length != i.k.c.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public boolean n() {
            return this.f4638c.h() == i.k.b.LABEL_REQUIRED;
        }

        public boolean o() {
            return this.f4638c.h() == i.k.b.LABEL_OPTIONAL;
        }

        @Override // com.google.protobuf.q.a
        public boolean p() {
            return this.f4638c.h() == i.k.b.LABEL_REPEATED;
        }

        @Override // com.google.protobuf.q.a
        public boolean q() {
            if (!r()) {
                return false;
            }
            if (d().i() == g.b.PROTO2) {
                return t().f();
            }
            return !t().e() || t().f();
        }

        public boolean r() {
            return p() && k().c();
        }

        public Object s() {
            if (g() == a.MESSAGE) {
                throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
            }
            return this.m;
        }

        public i.m t() {
            return this.f4638c.v();
        }

        public boolean u() {
            return this.f4638c.m();
        }

        public a v() {
            return this.i;
        }

        public C0086j w() {
            return this.k;
        }

        public a x() {
            if (!u()) {
                throw new UnsupportedOperationException("This field is not an extension.");
            }
            return this.g;
        }

        public a y() {
            if (g() != a.MESSAGE) {
                throw new UnsupportedOperationException("This field is not of message type.");
            }
            return this.j;
        }

        public d z() {
            if (g() != a.ENUM) {
                throw new UnsupportedOperationException("This field is not of enum type.");
            }
            return this.l;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(f fVar) {
            if (fVar.i != this.i) {
                throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
            }
            return f() - fVar.f();
        }

        public String toString() {
            return c();
        }

        /* compiled from: Descriptors.java */
        /* loaded from: classes.dex */
        public enum b {
            DOUBLE(a.DOUBLE),
            FLOAT(a.FLOAT),
            INT64(a.LONG),
            UINT64(a.LONG),
            INT32(a.INT),
            FIXED64(a.LONG),
            FIXED32(a.INT),
            BOOL(a.BOOLEAN),
            STRING(a.STRING),
            GROUP(a.MESSAGE),
            MESSAGE(a.MESSAGE),
            BYTES(a.BYTE_STRING),
            UINT32(a.INT),
            ENUM(a.ENUM),
            SFIXED32(a.INT),
            SFIXED64(a.LONG),
            SINT32(a.INT),
            SINT64(a.LONG);
            
            private a s;

            b(a aVar) {
                this.s = aVar;
            }

            public a a() {
                return this.s;
            }

            public static b a(i.k.c cVar) {
                return values()[cVar.a() - 1];
            }
        }

        /* compiled from: Descriptors.java */
        /* loaded from: classes.dex */
        public enum a {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(false),
            STRING(""),
            BYTE_STRING(com.google.protobuf.f.f4423a),
            ENUM(null),
            MESSAGE(null);
            
            private final Object j;

            a(Object obj) {
                this.j = obj;
            }
        }

        private static String a(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                Character valueOf = Character.valueOf(str.charAt(i));
                if (valueOf.charValue() == '_') {
                    z = true;
                } else if (z) {
                    sb.append(Character.toUpperCase(valueOf.charValue()));
                    z = false;
                } else {
                    sb.append(valueOf);
                }
            }
            return sb.toString();
        }

        private f(i.k kVar, g gVar, a aVar, int i, boolean z) {
            this.f4637b = i;
            this.f4638c = kVar;
            this.f4639d = j.b(gVar, aVar, kVar.d());
            this.f = gVar;
            if (kVar.s()) {
                this.e = kVar.t();
            } else {
                this.e = a(kVar.d());
            }
            if (kVar.i()) {
                this.h = b.a(kVar.j());
            }
            if (f() > 0) {
                if (z) {
                    if (!kVar.m()) {
                        throw new c(this, "FieldDescriptorProto.extendee not set for extension field.");
                    }
                    this.i = null;
                    if (aVar != null) {
                        this.g = aVar;
                    } else {
                        this.g = null;
                    }
                    if (kVar.q()) {
                        throw new c(this, "FieldDescriptorProto.oneof_index set for extension field.");
                    }
                    this.k = null;
                } else if (kVar.m()) {
                    throw new c(this, "FieldDescriptorProto.extendee set for non-extension field.");
                } else {
                    this.i = aVar;
                    if (kVar.q()) {
                        if (kVar.r() < 0 || kVar.r() >= aVar.j().p()) {
                            throw new c(this, "FieldDescriptorProto.oneof_index is out of range for type " + aVar.b());
                        }
                        this.k = aVar.g().get(kVar.r());
                        C0086j.b(this.k);
                    } else {
                        this.k = null;
                    }
                    this.g = null;
                }
                gVar.h.c(this);
                return;
            }
            throw new c(this, "Field numbers must be positive integers.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A() {
            if (this.f4638c.m()) {
                h a2 = this.f.h.a(this.f4638c.n(), this, b.c.TYPES_ONLY);
                if (!(a2 instanceof a)) {
                    throw new c(this, '\"' + this.f4638c.n() + "\" is not a message type.");
                }
                this.i = (a) a2;
                if (!v().a(f())) {
                    throw new c(this, '\"' + v().c() + "\" does not declare " + f() + " as an extension number.");
                }
            }
            if (this.f4638c.k()) {
                h a3 = this.f.h.a(this.f4638c.l(), this, b.c.TYPES_ONLY);
                if (!this.f4638c.i()) {
                    if (a3 instanceof a) {
                        this.h = b.MESSAGE;
                    } else if (a3 instanceof d) {
                        this.h = b.ENUM;
                    } else {
                        throw new c(this, '\"' + this.f4638c.l() + "\" is not a type.");
                    }
                }
                if (g() == a.MESSAGE) {
                    if (!(a3 instanceof a)) {
                        throw new c(this, '\"' + this.f4638c.l() + "\" is not a message type.");
                    }
                    this.j = (a) a3;
                    if (this.f4638c.o()) {
                        throw new c(this, "Messages can't have default values.");
                    }
                } else if (g() == a.ENUM) {
                    if (!(a3 instanceof d)) {
                        throw new c(this, '\"' + this.f4638c.l() + "\" is not an enum type.");
                    }
                    this.l = (d) a3;
                } else {
                    throw new c(this, "Field with primitive type has type_name.");
                }
            } else if (g() == a.MESSAGE || g() == a.ENUM) {
                throw new c(this, "Field with message or enum type missing type_name.");
            }
            if (this.f4638c.v().f() && !r()) {
                throw new c(this, "[packed = true] can only be specified for repeated primitive fields.");
            }
            if (this.f4638c.o()) {
                if (p()) {
                    throw new c(this, "Repeated fields cannot have default values.");
                }
                try {
                    switch (i()) {
                        case INT32:
                        case SINT32:
                        case SFIXED32:
                            this.m = Integer.valueOf(ap.b(this.f4638c.p()));
                            break;
                        case UINT32:
                        case FIXED32:
                            this.m = Integer.valueOf(ap.c(this.f4638c.p()));
                            break;
                        case INT64:
                        case SINT64:
                        case SFIXED64:
                            this.m = Long.valueOf(ap.d(this.f4638c.p()));
                            break;
                        case UINT64:
                        case FIXED64:
                            this.m = Long.valueOf(ap.e(this.f4638c.p()));
                            break;
                        case FLOAT:
                            if (this.f4638c.p().equals("inf")) {
                                this.m = Float.valueOf(Float.POSITIVE_INFINITY);
                                break;
                            } else if (this.f4638c.p().equals("-inf")) {
                                this.m = Float.valueOf(Float.NEGATIVE_INFINITY);
                                break;
                            } else if (this.f4638c.p().equals("nan")) {
                                this.m = Float.valueOf(Float.NaN);
                                break;
                            } else {
                                this.m = Float.valueOf(this.f4638c.p());
                                break;
                            }
                        case DOUBLE:
                            if (this.f4638c.p().equals("inf")) {
                                this.m = Double.valueOf(Double.POSITIVE_INFINITY);
                                break;
                            } else if (this.f4638c.p().equals("-inf")) {
                                this.m = Double.valueOf(Double.NEGATIVE_INFINITY);
                                break;
                            } else if (this.f4638c.p().equals("nan")) {
                                this.m = Double.valueOf(Double.NaN);
                                break;
                            } else {
                                this.m = Double.valueOf(this.f4638c.p());
                                break;
                            }
                        case BOOL:
                            this.m = Boolean.valueOf(this.f4638c.p());
                            break;
                        case STRING:
                            this.m = this.f4638c.p();
                            break;
                        case BYTES:
                            try {
                                this.m = ap.a((CharSequence) this.f4638c.p());
                                break;
                            } catch (ap.a e) {
                                throw new c(this, "Couldn't parse default value: " + e.getMessage(), e);
                            }
                        case ENUM:
                            this.m = this.l.a(this.f4638c.p());
                            if (this.m == null) {
                                throw new c(this, "Unknown enum default value: \"" + this.f4638c.p() + '\"');
                            }
                            break;
                        case MESSAGE:
                        case GROUP:
                            throw new c(this, "Message type had default value.");
                    }
                } catch (NumberFormatException e2) {
                    throw new c(this, "Could not parse default value: \"" + this.f4638c.p() + '\"', e2);
                }
            } else if (p()) {
                this.m = Collections.emptyList();
            } else {
                switch (g()) {
                    case ENUM:
                        this.m = this.l.e().get(0);
                        break;
                    case MESSAGE:
                        this.m = null;
                        break;
                    default:
                        this.m = g().j;
                        break;
                }
            }
            if (!u()) {
                this.f.h.a(this);
            }
            if (this.i == null || !this.i.e().d()) {
                return;
            }
            if (u()) {
                if (o() && i() == b.MESSAGE) {
                    return;
                }
                throw new c(this, "Extensions of MessageSets must be optional messages.");
            }
            throw new c(this, "MessageSets cannot have fields, only extensions.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.k kVar) {
            this.f4638c = kVar;
        }

        @Override // com.google.protobuf.q.a
        public ac.a a(ac.a aVar, ac acVar) {
            return ((ab.a) aVar).c((ab) acVar);
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class d extends h implements t.b<e> {

        /* renamed from: a  reason: collision with root package name */
        private final int f4628a;

        /* renamed from: b  reason: collision with root package name */
        private i.c f4629b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4630c;

        /* renamed from: d  reason: collision with root package name */
        private final g f4631d;
        private final a e;
        private e[] f;
        private final WeakHashMap<Integer, WeakReference<e>> g;

        @Override // com.google.protobuf.j.h
        /* renamed from: a */
        public i.c j() {
            return this.f4629b;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4629b.d();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4630c;
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this.f4631d;
        }

        public List<e> e() {
            return Collections.unmodifiableList(Arrays.asList(this.f));
        }

        public e a(String str) {
            b bVar = this.f4631d.h;
            h a2 = bVar.a(this.f4630c + '.' + str);
            if (a2 == null || !(a2 instanceof e)) {
                return null;
            }
            return (e) a2;
        }

        public e a(int i) {
            return (e) this.f4631d.h.e.get(new b.a(this, i));
        }

        public e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            synchronized (this) {
                Integer num = new Integer(i);
                WeakReference<e> weakReference = this.g.get(num);
                if (weakReference != null) {
                    a2 = weakReference.get();
                }
                if (a2 == null) {
                    a2 = new e(this.f4631d, this, num);
                    this.g.put(num, new WeakReference<>(a2));
                }
            }
            return a2;
        }

        private d(i.c cVar, g gVar, a aVar, int i) {
            this.g = new WeakHashMap<>();
            this.f4628a = i;
            this.f4629b = cVar;
            this.f4630c = j.b(gVar, aVar, cVar.d());
            this.f4631d = gVar;
            this.e = aVar;
            if (cVar.f() == 0) {
                throw new c(this, "Enums must contain at least one value.");
            }
            this.f = new e[cVar.f()];
            for (int i2 = 0; i2 < cVar.f(); i2++) {
                this.f[i2] = new e(cVar.a(i2), gVar, this, i2);
            }
            gVar.h.c(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.c cVar) {
            this.f4629b = cVar;
            for (int i = 0; i < this.f.length; i++) {
                this.f[i].a(cVar.a(i));
            }
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class e extends h implements t.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f4632a;

        /* renamed from: b  reason: collision with root package name */
        private i.g f4633b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4634c;

        /* renamed from: d  reason: collision with root package name */
        private final g f4635d;
        private final d e;
        private Integer f;

        @Override // com.google.protobuf.j.h
        /* renamed from: e */
        public i.g j() {
            return this.f4633b;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4633b.d();
        }

        @Override // com.google.protobuf.t.a
        public int a() {
            return this.f4633b.f();
        }

        public String toString() {
            return this.f4633b.d();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4634c;
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this.f4635d;
        }

        public d f() {
            return this.e;
        }

        private e(i.g gVar, g gVar2, d dVar, int i) {
            this.f4632a = i;
            this.f4633b = gVar;
            this.f4635d = gVar2;
            this.e = dVar;
            this.f4634c = dVar.c() + '.' + gVar.d();
            gVar2.h.c(this);
            gVar2.h.a(this);
        }

        private e(g gVar, d dVar, Integer num) {
            i.g t = i.g.j().a("UNKNOWN_ENUM_VALUE_" + dVar.b() + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + num).a(num.intValue()).t();
            this.f4632a = -1;
            this.f4633b = t;
            this.f4635d = gVar;
            this.e = dVar;
            this.f4634c = dVar.c() + '.' + t.d();
            this.f = num;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.g gVar) {
            this.f4633b = gVar;
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class k extends h {

        /* renamed from: a  reason: collision with root package name */
        private final int f4664a;

        /* renamed from: b  reason: collision with root package name */
        private i.ac f4665b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4666c;

        /* renamed from: d  reason: collision with root package name */
        private final g f4667d;
        private i[] e;

        @Override // com.google.protobuf.j.h
        /* renamed from: a */
        public i.ac j() {
            return this.f4665b;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4665b.d();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4666c;
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this.f4667d;
        }

        private k(i.ac acVar, g gVar, int i) {
            this.f4664a = i;
            this.f4665b = acVar;
            this.f4666c = j.b(gVar, null, acVar.d());
            this.f4667d = gVar;
            this.e = new i[acVar.f()];
            for (int i2 = 0; i2 < acVar.f(); i2++) {
                this.e[i2] = new i(acVar.a(i2), gVar, this, i2);
            }
            gVar.h.c(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            for (i iVar : this.e) {
                iVar.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.ac acVar) {
            this.f4665b = acVar;
            for (int i = 0; i < this.e.length; i++) {
                this.e[i].a(acVar.a(i));
            }
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class i extends h {

        /* renamed from: a  reason: collision with root package name */
        private final int f4656a;

        /* renamed from: b  reason: collision with root package name */
        private i.u f4657b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4658c;

        /* renamed from: d  reason: collision with root package name */
        private final g f4659d;
        private final k e;
        private a f;
        private a g;

        @Override // com.google.protobuf.j.h
        /* renamed from: a */
        public i.u j() {
            return this.f4657b;
        }

        @Override // com.google.protobuf.j.h
        public String b() {
            return this.f4657b.d();
        }

        @Override // com.google.protobuf.j.h
        public String c() {
            return this.f4658c;
        }

        @Override // com.google.protobuf.j.h
        public g d() {
            return this.f4659d;
        }

        private i(i.u uVar, g gVar, k kVar, int i) {
            this.f4656a = i;
            this.f4657b = uVar;
            this.f4659d = gVar;
            this.e = kVar;
            this.f4658c = kVar.c() + '.' + uVar.d();
            gVar.h.c(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            h a2 = this.f4659d.h.a(this.f4657b.f(), this, b.c.TYPES_ONLY);
            if (!(a2 instanceof a)) {
                throw new c(this, '\"' + this.f4657b.f() + "\" is not a message type.");
            }
            this.f = (a) a2;
            h a3 = this.f4659d.h.a(this.f4657b.h(), this, b.c.TYPES_ONLY);
            if (!(a3 instanceof a)) {
                throw new c(this, '\"' + this.f4657b.h() + "\" is not a message type.");
            }
            this.g = (a) a3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.u uVar) {
            this.f4657b = uVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(g gVar, a aVar, String str) {
        if (aVar != null) {
            return aVar.c() + '.' + str;
        } else if (gVar.e().length() <= 0) {
            return str;
        } else {
            return gVar.e() + '.' + str;
        }
    }

    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static class c extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private final String f4625a;

        /* renamed from: b  reason: collision with root package name */
        private final ab f4626b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4627c;

        private c(h hVar, String str) {
            super(hVar.c() + ": " + str);
            this.f4625a = hVar.c();
            this.f4626b = hVar.j();
            this.f4627c = str;
        }

        private c(h hVar, String str, Throwable th) {
            this(hVar, str);
            initCause(th);
        }

        private c(g gVar, String str) {
            super(gVar.b() + ": " + str);
            this.f4625a = gVar.b();
            this.f4626b = gVar.j();
            this.f4627c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Descriptors.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        private boolean f4613b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, h> f4614c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private final Map<a, f> f4615d = new HashMap();
        private final Map<a, e> e = new HashMap();

        /* renamed from: a  reason: collision with root package name */
        private final Set<g> f4612a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Descriptors.java */
        /* loaded from: classes.dex */
        public enum c {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        b(g[] gVarArr, boolean z) {
            this.f4613b = z;
            for (int i = 0; i < gVarArr.length; i++) {
                this.f4612a.add(gVarArr[i]);
                a(gVarArr[i]);
            }
            for (g gVar : this.f4612a) {
                try {
                    a(gVar.e(), gVar);
                } catch (c e) {
                    throw new AssertionError(e);
                }
            }
        }

        private void a(g gVar) {
            for (g gVar2 : gVar.h()) {
                if (this.f4612a.add(gVar2)) {
                    a(gVar2);
                }
            }
        }

        h a(String str) {
            return a(str, c.ALL_SYMBOLS);
        }

        h a(String str, c cVar) {
            h hVar = this.f4614c.get(str);
            if (hVar == null || (cVar != c.ALL_SYMBOLS && ((cVar != c.TYPES_ONLY || !a(hVar)) && (cVar != c.AGGREGATES_ONLY || !b(hVar))))) {
                for (g gVar : this.f4612a) {
                    h hVar2 = gVar.h.f4614c.get(str);
                    if (hVar2 != null && (cVar == c.ALL_SYMBOLS || ((cVar == c.TYPES_ONLY && a(hVar2)) || (cVar == c.AGGREGATES_ONLY && b(hVar2))))) {
                        return hVar2;
                    }
                }
                return null;
            }
            return hVar;
        }

        boolean a(h hVar) {
            return (hVar instanceof a) || (hVar instanceof d);
        }

        boolean b(h hVar) {
            return (hVar instanceof a) || (hVar instanceof d) || (hVar instanceof C0085b) || (hVar instanceof k);
        }

        h a(String str, h hVar, c cVar) {
            h a2;
            String str2;
            if (str.startsWith(".")) {
                str2 = str.substring(1);
                a2 = a(str2, cVar);
            } else {
                int indexOf = str.indexOf(46);
                String substring = indexOf == -1 ? str : str.substring(0, indexOf);
                StringBuilder sb = new StringBuilder(hVar.c());
                while (true) {
                    int lastIndexOf = sb.lastIndexOf(".");
                    if (lastIndexOf == -1) {
                        a2 = a(str, cVar);
                        str2 = str;
                        break;
                    }
                    int i = lastIndexOf + 1;
                    sb.setLength(i);
                    sb.append(substring);
                    h a3 = a(sb.toString(), c.AGGREGATES_ONLY);
                    if (a3 != null) {
                        if (indexOf != -1) {
                            sb.setLength(i);
                            sb.append(str);
                            a2 = a(sb.toString(), cVar);
                        } else {
                            a2 = a3;
                        }
                        str2 = sb.toString();
                    } else {
                        sb.setLength(lastIndexOf);
                    }
                }
            }
            if (a2 == null) {
                if (this.f4613b && cVar == c.TYPES_ONLY) {
                    Logger logger = j.f4605a;
                    logger.warning("The descriptor for message type \"" + str + "\" can not be found and a placeholder is created for it");
                    a aVar = new a(str2);
                    this.f4612a.add(aVar.d());
                    return aVar;
                }
                throw new c(hVar, '\"' + str + "\" is not defined.");
            }
            return a2;
        }

        void c(h hVar) {
            d(hVar);
            String c2 = hVar.c();
            int lastIndexOf = c2.lastIndexOf(46);
            h put = this.f4614c.put(c2, hVar);
            if (put != null) {
                this.f4614c.put(c2, put);
                if (hVar.d() != put.d()) {
                    throw new c(hVar, '\"' + c2 + "\" is already defined in file \"" + put.d().b() + "\".");
                } else if (lastIndexOf == -1) {
                    throw new c(hVar, '\"' + c2 + "\" is already defined.");
                } else {
                    throw new c(hVar, '\"' + c2.substring(lastIndexOf + 1) + "\" is already defined in \"" + c2.substring(0, lastIndexOf) + "\".");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Descriptors.java */
        /* renamed from: com.google.protobuf.j$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0085b extends h {

            /* renamed from: a  reason: collision with root package name */
            private final String f4618a;

            /* renamed from: b  reason: collision with root package name */
            private final String f4619b;

            /* renamed from: c  reason: collision with root package name */
            private final g f4620c;

            @Override // com.google.protobuf.j.h
            public ab j() {
                return this.f4620c.j();
            }

            @Override // com.google.protobuf.j.h
            public String b() {
                return this.f4618a;
            }

            @Override // com.google.protobuf.j.h
            public String c() {
                return this.f4619b;
            }

            @Override // com.google.protobuf.j.h
            public g d() {
                return this.f4620c;
            }

            C0085b(String str, String str2, g gVar) {
                this.f4620c = gVar;
                this.f4619b = str2;
                this.f4618a = str;
            }
        }

        void a(String str, g gVar) {
            String substring;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                substring = str;
            } else {
                a(str.substring(0, lastIndexOf), gVar);
                substring = str.substring(lastIndexOf + 1);
            }
            h put = this.f4614c.put(str, new C0085b(substring, str, gVar));
            if (put != null) {
                this.f4614c.put(str, put);
                if (put instanceof C0085b) {
                    return;
                }
                throw new c(gVar, '\"' + substring + "\" is already defined (as something other than a package) in file \"" + put.d().b() + "\".");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Descriptors.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final h f4616a;

            /* renamed from: b  reason: collision with root package name */
            private final int f4617b;

            a(h hVar, int i) {
                this.f4616a = hVar;
                this.f4617b = i;
            }

            public int hashCode() {
                return (this.f4616a.hashCode() * 65535) + this.f4617b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f4616a == aVar.f4616a && this.f4617b == aVar.f4617b;
            }
        }

        void a(f fVar) {
            a aVar = new a(fVar.v(), fVar.f());
            f put = this.f4615d.put(aVar, fVar);
            if (put != null) {
                this.f4615d.put(aVar, put);
                throw new c(fVar, "Field number " + fVar.f() + " has already been used in \"" + fVar.v().c() + "\" by field \"" + put.b() + "\".");
            }
        }

        void a(e eVar) {
            a aVar = new a(eVar.f(), eVar.a());
            e put = this.e.put(aVar, eVar);
            if (put != null) {
                this.e.put(aVar, put);
            }
        }

        static void d(h hVar) {
            String b2 = hVar.b();
            if (b2.length() == 0) {
                throw new c(hVar, "Missing name.");
            }
            boolean z = true;
            for (int i = 0; i < b2.length(); i++) {
                char charAt = b2.charAt(i);
                if (charAt >= 128) {
                    z = false;
                }
                if (!Character.isLetter(charAt) && charAt != '_' && (!Character.isDigit(charAt) || i <= 0)) {
                    z = false;
                }
            }
            if (z) {
                return;
            }
            throw new c(hVar, '\"' + b2 + "\" is not a valid identifier.");
        }
    }

    /* compiled from: Descriptors.java */
    /* renamed from: com.google.protobuf.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0086j {

        /* renamed from: a  reason: collision with root package name */
        private final int f4660a;

        /* renamed from: b  reason: collision with root package name */
        private i.y f4661b;

        /* renamed from: c  reason: collision with root package name */
        private final String f4662c;

        /* renamed from: d  reason: collision with root package name */
        private final g f4663d;
        private a e;
        private int f;
        private f[] g;

        static /* synthetic */ int b(C0086j c0086j) {
            int i = c0086j.f;
            c0086j.f = i + 1;
            return i;
        }

        public int a() {
            return this.f4660a;
        }

        public a b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i.y yVar) {
            this.f4661b = yVar;
        }

        private C0086j(i.y yVar, g gVar, a aVar, int i) {
            this.f4661b = yVar;
            this.f4662c = j.b(gVar, aVar, yVar.d());
            this.f4663d = gVar;
            this.f4660a = i;
            this.e = aVar;
            this.f = 0;
        }
    }
}
