package com.google.protobuf;

import com.google.protobuf.at;
import com.google.protobuf.j;
import com.google.protobuf.s;
import com.google.protobuf.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
/* compiled from: DescriptorProtos.java */
/* loaded from: classes.dex */
public final class i {
    private static final j.a A;
    private static final s.f B;
    private static final j.a C;
    private static final s.f D;
    private static final j.a E;
    private static final s.f F;
    private static final j.a G;
    private static final s.f H;
    private static final j.a I;
    private static final s.f J;
    private static final j.a K;
    private static final s.f L;
    private static final j.a M;
    private static final s.f N;
    private static final j.a O;
    private static final s.f P;
    private static final j.a Q;
    private static final s.f R;
    private static final j.a S;
    private static final s.f T;
    private static final j.a U;
    private static final s.f V;
    private static final j.a W;
    private static final s.f X;
    private static j.g Y;

    /* renamed from: a  reason: collision with root package name */
    private static final j.a f4450a;

    /* renamed from: b  reason: collision with root package name */
    private static final s.f f4451b;

    /* renamed from: c  reason: collision with root package name */
    private static final j.a f4452c;

    /* renamed from: d  reason: collision with root package name */
    private static final s.f f4453d;
    private static final j.a e;
    private static final s.f f;
    private static final j.a g;
    private static final s.f h;
    private static final j.a i;
    private static final s.f j;
    private static final j.a k;
    private static final s.f l;
    private static final j.a m;
    private static final s.f n;
    private static final j.a o;
    private static final s.f p;
    private static final j.a q;
    private static final s.f r;
    private static final j.a s;
    private static final s.f t;
    private static final j.a u;
    private static final s.f v;
    private static final j.a w;
    private static final s.f x;
    private static final j.a y;
    private static final s.f z;

    /* loaded from: classes.dex */
    public interface ab extends s.e {
    }

    /* loaded from: classes.dex */
    public interface ad extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface af extends s.e {
    }

    /* loaded from: classes.dex */
    public interface ah extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface aj extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface b extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface d extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface f extends s.e {
    }

    /* loaded from: classes.dex */
    public interface h extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface j extends s.e {
    }

    /* loaded from: classes.dex */
    public interface l extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface n extends s.e {
    }

    /* loaded from: classes.dex */
    public interface p extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface r extends s.e {
    }

    /* loaded from: classes.dex */
    public interface t extends s.e {
    }

    /* loaded from: classes.dex */
    public interface v extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface x extends s.e {
    }

    /* loaded from: classes.dex */
    public interface z extends com.google.protobuf.af {
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class o extends com.google.protobuf.s implements p {

        /* renamed from: d  reason: collision with root package name */
        private int f4562d;
        private volatile Object e;
        private volatile Object f;
        private com.google.protobuf.y g;
        private List<Integer> h;
        private List<Integer> i;
        private List<a> j;
        private List<c> k;
        private List<ac> l;
        private List<k> m;
        private q n;
        private ag o;
        private volatile Object p;
        private byte q;
        private static final o r = new o();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<o> f4561a = new com.google.protobuf.c<o>() { // from class: com.google.protobuf.i.o.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public o d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new o(gVar, pVar);
            }
        };

        private o(s.a<?> aVar) {
            super(aVar);
            this.q = (byte) -1;
        }

        private o() {
            this.q = (byte) -1;
            this.e = "";
            this.f = "";
            this.g = com.google.protobuf.x.f4766a;
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            this.j = Collections.emptyList();
            this.k = Collections.emptyList();
            this.l = Collections.emptyList();
            this.m = Collections.emptyList();
            this.p = "";
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private o(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    try {
                        try {
                            try {
                                int a3 = gVar.a();
                                q.a aVar = null;
                                ag.a D = null;
                                switch (a3) {
                                    case 0:
                                        break;
                                    case 10:
                                        com.google.protobuf.f l = gVar.l();
                                        this.f4562d |= 1;
                                        this.e = l;
                                        continue;
                                    case 18:
                                        com.google.protobuf.f l2 = gVar.l();
                                        this.f4562d |= 2;
                                        this.f = l2;
                                        continue;
                                    case 26:
                                        com.google.protobuf.f l3 = gVar.l();
                                        if (!(z2 & true)) {
                                            this.g = new com.google.protobuf.x();
                                            z2 |= true;
                                        }
                                        this.g.a(l3);
                                        continue;
                                    case 34:
                                        if (!(z2 & true)) {
                                            this.j = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.j.add(gVar.a(a.f4454a, pVar));
                                        continue;
                                    case 42:
                                        if (!(z2 & true)) {
                                            this.k = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.k.add(gVar.a(c.f4509a, pVar));
                                        continue;
                                    case 50:
                                        if (!(z2 & true)) {
                                            this.l = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.l.add(gVar.a(ac.f4475a, pVar));
                                        continue;
                                    case 58:
                                        if (!(z2 & true)) {
                                            this.m = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.m.add(gVar.a(k.f4533a, pVar));
                                        continue;
                                    case 66:
                                        aVar = (this.f4562d & 4) == 4 ? this.n.D() : aVar;
                                        this.n = (q) gVar.a(q.f4567a, pVar);
                                        if (aVar != null) {
                                            aVar.a(this.n);
                                            this.n = aVar.r();
                                        }
                                        this.f4562d |= 4;
                                        continue;
                                    case 74:
                                        D = (this.f4562d & 8) == 8 ? this.o.D() : D;
                                        this.o = (ag) gVar.a(ag.f4487a, pVar);
                                        if (D != null) {
                                            D.a(this.o);
                                            this.o = D.r();
                                        }
                                        this.f4562d |= 8;
                                        continue;
                                    case 80:
                                        if (!(z2 & true)) {
                                            this.h = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.h.add(Integer.valueOf(gVar.f()));
                                        continue;
                                    case 82:
                                        int c2 = gVar.c(gVar.s());
                                        if (!(z2 & true) && gVar.u() > 0) {
                                            this.h = new ArrayList();
                                            z2 |= true;
                                        }
                                        while (gVar.u() > 0) {
                                            this.h.add(Integer.valueOf(gVar.f()));
                                        }
                                        gVar.d(c2);
                                        continue;
                                        break;
                                    case 88:
                                        if (!(z2 & true)) {
                                            this.i = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.i.add(Integer.valueOf(gVar.f()));
                                        continue;
                                    case 90:
                                        int c3 = gVar.c(gVar.s());
                                        if (!(z2 & true) && gVar.u() > 0) {
                                            this.i = new ArrayList();
                                            z2 |= true;
                                        }
                                        while (gVar.u() > 0) {
                                            this.i.add(Integer.valueOf(gVar.f()));
                                        }
                                        gVar.d(c3);
                                        continue;
                                        break;
                                    case 98:
                                        com.google.protobuf.f l4 = gVar.l();
                                        this.f4562d |= 16;
                                        this.p = l4;
                                        continue;
                                    default:
                                        if (!a(gVar, a2, pVar, a3)) {
                                            break;
                                        } else {
                                            continue;
                                        }
                                }
                                z = true;
                            } catch (IOException e) {
                                throw new com.google.protobuf.u(e).a(this);
                            }
                        } catch (com.google.protobuf.u e2) {
                            throw e2.a(this);
                        }
                    } finally {
                        if (z2 & true) {
                            this.g = this.g.e();
                        }
                        if (z2 & true) {
                            this.j = Collections.unmodifiableList(this.j);
                        }
                        if (z2 & true) {
                            this.k = Collections.unmodifiableList(this.k);
                        }
                        if (z2 & true) {
                            this.l = Collections.unmodifiableList(this.l);
                        }
                        if (z2 & true) {
                            this.m = Collections.unmodifiableList(this.m);
                        }
                        if (z2 & true) {
                            this.h = Collections.unmodifiableList(this.h);
                        }
                        if (z2 & true) {
                            this.i = Collections.unmodifiableList(this.i);
                        }
                        this.f4720c = a2.t();
                        V();
                    }
                } else {
                    return;
                }
            }
        }

        public static final j.a a() {
            return i.f4452c;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.f4453d.a(o.class, a.class);
        }

        public boolean c() {
            return (this.f4562d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public boolean e() {
            return (this.f4562d & 2) == 2;
        }

        public String f() {
            Object obj = this.f;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.f = e;
            }
            return e;
        }

        public al g() {
            return this.g;
        }

        public int h() {
            return this.g.size();
        }

        public String a(int i) {
            return (String) this.g.get(i);
        }

        public List<Integer> i() {
            return this.h;
        }

        public int j() {
            return this.h.size();
        }

        public int b(int i) {
            return this.h.get(i).intValue();
        }

        public List<Integer> k() {
            return this.i;
        }

        public int l() {
            return this.i.size();
        }

        public List<a> m() {
            return this.j;
        }

        public int n() {
            return this.j.size();
        }

        public a c(int i) {
            return this.j.get(i);
        }

        public List<c> o() {
            return this.k;
        }

        public int p() {
            return this.k.size();
        }

        public c d(int i) {
            return this.k.get(i);
        }

        public List<ac> q() {
            return this.l;
        }

        public int r() {
            return this.l.size();
        }

        public ac e(int i) {
            return this.l.get(i);
        }

        public List<k> s() {
            return this.m;
        }

        public int t() {
            return this.m.size();
        }

        public k f(int i) {
            return this.m.get(i);
        }

        public boolean u() {
            return (this.f4562d & 4) == 4;
        }

        public q v() {
            return this.n == null ? q.S() : this.n;
        }

        public boolean w() {
            return (this.f4562d & 8) == 8;
        }

        public ag x() {
            return this.o == null ? ag.h() : this.o;
        }

        public boolean y() {
            return (this.f4562d & 16) == 16;
        }

        public String z() {
            Object obj = this.p;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.p = e;
            }
            return e;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.q;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < n(); i++) {
                if (!c(i).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < p(); i2++) {
                if (!d(i2).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < r(); i3++) {
                if (!e(i3).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < t(); i4++) {
                if (!f(i4).isInitialized()) {
                    this.q = (byte) 0;
                    return false;
                }
            }
            if (u() && !v().isInitialized()) {
                this.q = (byte) 0;
                return false;
            }
            this.q = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4562d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            if ((this.f4562d & 2) == 2) {
                com.google.protobuf.s.a(hVar, 2, this.f);
            }
            for (int i = 0; i < this.g.size(); i++) {
                com.google.protobuf.s.a(hVar, 3, this.g.c(i));
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                hVar.a(4, this.j.get(i2));
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                hVar.a(5, this.k.get(i3));
            }
            for (int i4 = 0; i4 < this.l.size(); i4++) {
                hVar.a(6, this.l.get(i4));
            }
            for (int i5 = 0; i5 < this.m.size(); i5++) {
                hVar.a(7, this.m.get(i5));
            }
            if ((this.f4562d & 4) == 4) {
                hVar.a(8, v());
            }
            if ((this.f4562d & 8) == 8) {
                hVar.a(9, x());
            }
            for (int i6 = 0; i6 < this.h.size(); i6++) {
                hVar.b(10, this.h.get(i6).intValue());
            }
            for (int i7 = 0; i7 < this.i.size(); i7++) {
                hVar.b(11, this.i.get(i7).intValue());
            }
            if ((this.f4562d & 16) == 16) {
                com.google.protobuf.s.a(hVar, 12, this.p);
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int a2 = (this.f4562d & 1) == 1 ? com.google.protobuf.s.a(1, this.e) + 0 : 0;
            if ((this.f4562d & 2) == 2) {
                a2 += com.google.protobuf.s.a(2, this.f);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                i2 += a(this.g.c(i3));
            }
            int size = a2 + i2 + (g().size() * 1);
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                size += com.google.protobuf.h.c(4, this.j.get(i4));
            }
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                size += com.google.protobuf.h.c(5, this.k.get(i5));
            }
            for (int i6 = 0; i6 < this.l.size(); i6++) {
                size += com.google.protobuf.h.c(6, this.l.get(i6));
            }
            for (int i7 = 0; i7 < this.m.size(); i7++) {
                size += com.google.protobuf.h.c(7, this.m.get(i7));
            }
            if ((this.f4562d & 4) == 4) {
                size += com.google.protobuf.h.c(8, v());
            }
            if ((this.f4562d & 8) == 8) {
                size += com.google.protobuf.h.c(9, x());
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.h.size(); i9++) {
                i8 += com.google.protobuf.h.i(this.h.get(i9).intValue());
            }
            int size2 = size + i8 + (i().size() * 1);
            int i10 = 0;
            for (int i11 = 0; i11 < this.i.size(); i11++) {
                i10 += com.google.protobuf.h.i(this.i.get(i11).intValue());
            }
            int size3 = size2 + i10 + (k().size() * 1);
            if ((this.f4562d & 16) == 16) {
                size3 += com.google.protobuf.s.a(12, this.p);
            }
            int serializedSize = size3 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return super.equals(obj);
            }
            o oVar = (o) obj;
            boolean z = c() == oVar.c();
            if (c()) {
                z = z && d().equals(oVar.d());
            }
            boolean z2 = z && e() == oVar.e();
            if (e()) {
                z2 = z2 && f().equals(oVar.f());
            }
            boolean z3 = (((((((z2 && g().equals(oVar.g())) && i().equals(oVar.i())) && k().equals(oVar.k())) && m().equals(oVar.m())) && o().equals(oVar.o())) && q().equals(oVar.q())) && s().equals(oVar.s())) && u() == oVar.u();
            if (u()) {
                z3 = z3 && v().equals(oVar.v());
            }
            boolean z4 = z3 && w() == oVar.w();
            if (w()) {
                z4 = z4 && x().equals(oVar.x());
            }
            boolean z5 = z4 && y() == oVar.y();
            if (y()) {
                z5 = z5 && z().equals(oVar.z());
            }
            return z5 && this.f4720c.equals(oVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
            }
            if (h() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + g().hashCode();
            }
            if (j() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + i().hashCode();
            }
            if (l() > 0) {
                hashCode = (((hashCode * 37) + 11) * 53) + k().hashCode();
            }
            if (n() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + m().hashCode();
            }
            if (p() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + o().hashCode();
            }
            if (r() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + q().hashCode();
            }
            if (t() > 0) {
                hashCode = (((hashCode * 37) + 7) * 53) + s().hashCode();
            }
            if (u()) {
                hashCode = (((hashCode * 37) + 8) * 53) + v().hashCode();
            }
            if (w()) {
                hashCode = (((hashCode * 37) + 9) * 53) + x().hashCode();
            }
            if (y()) {
                hashCode = (((hashCode * 37) + 12) * 53) + z().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static o a(byte[] bArr) {
            return f4561a.b(bArr);
        }

        public static o a(byte[] bArr, com.google.protobuf.p pVar) {
            return f4561a.b(bArr, pVar);
        }

        @Override // com.google.protobuf.ab
        /* renamed from: A */
        public a C() {
            return G();
        }

        public static a G() {
            return r.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: H */
        public a D() {
            return this == r ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements p {

            /* renamed from: a  reason: collision with root package name */
            private int f4563a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4564b;

            /* renamed from: c  reason: collision with root package name */
            private Object f4565c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.y f4566d;
            private List<Integer> e;
            private List<Integer> f;
            private List<a> g;
            private am<a, a.C0081a, b> h;
            private List<c> i;
            private am<c, c.a, d> j;
            private List<ac> k;
            private am<ac, ac.a, ad> l;
            private List<k> m;
            private am<k, k.a, l> n;
            private q o;
            private an<q, q.a, r> p;
            private ag q;
            private an<ag, ag.a, ah> r;
            private Object s;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.f4453d.a(o.class, a.class);
            }

            private a() {
                this.f4564b = "";
                this.f4565c = "";
                this.f4566d = com.google.protobuf.x.f4766a;
                this.e = Collections.emptyList();
                this.f = Collections.emptyList();
                this.g = Collections.emptyList();
                this.i = Collections.emptyList();
                this.k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = null;
                this.q = null;
                this.s = "";
                y();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4564b = "";
                this.f4565c = "";
                this.f4566d = com.google.protobuf.x.f4766a;
                this.e = Collections.emptyList();
                this.f = Collections.emptyList();
                this.g = Collections.emptyList();
                this.i = Collections.emptyList();
                this.k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = null;
                this.q = null;
                this.s = "";
                y();
            }

            private void y() {
                if (com.google.protobuf.s.f4719b) {
                    D();
                    H();
                    J();
                    L();
                    M();
                    N();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.f4452c;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public o F() {
                return o.I();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public o t() {
                o r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public o r() {
                o oVar = new o(this);
                int i = this.f4563a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                oVar.e = this.f4564b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                oVar.f = this.f4565c;
                if ((this.f4563a & 4) == 4) {
                    this.f4566d = this.f4566d.e();
                    this.f4563a &= -5;
                }
                oVar.g = this.f4566d;
                if ((this.f4563a & 8) == 8) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.f4563a &= -9;
                }
                oVar.h = this.e;
                if ((this.f4563a & 16) == 16) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.f4563a &= -17;
                }
                oVar.i = this.f;
                if (this.h != null) {
                    oVar.j = this.h.e();
                } else {
                    if ((this.f4563a & 32) == 32) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.f4563a &= -33;
                    }
                    oVar.j = this.g;
                }
                if (this.j != null) {
                    oVar.k = this.j.e();
                } else {
                    if ((this.f4563a & 64) == 64) {
                        this.i = Collections.unmodifiableList(this.i);
                        this.f4563a &= -65;
                    }
                    oVar.k = this.i;
                }
                if (this.l != null) {
                    oVar.l = this.l.e();
                } else {
                    if ((this.f4563a & 128) == 128) {
                        this.k = Collections.unmodifiableList(this.k);
                        this.f4563a &= -129;
                    }
                    oVar.l = this.k;
                }
                if (this.n != null) {
                    oVar.m = this.n.e();
                } else {
                    if ((this.f4563a & 256) == 256) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.f4563a &= -257;
                    }
                    oVar.m = this.m;
                }
                if ((i & 512) == 512) {
                    i2 |= 4;
                }
                if (this.p == null) {
                    oVar.n = this.o;
                } else {
                    oVar.n = this.p.c();
                }
                if ((i & 1024) == 1024) {
                    i2 |= 8;
                }
                if (this.r == null) {
                    oVar.o = this.q;
                } else {
                    oVar.o = this.r.c();
                }
                if ((i & 2048) == 2048) {
                    i2 |= 16;
                }
                oVar.p = this.s;
                oVar.f4562d = i2;
                u();
                return oVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof o) {
                    return a((o) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(o oVar) {
                if (oVar == o.I()) {
                    return this;
                }
                if (oVar.c()) {
                    this.f4563a |= 1;
                    this.f4564b = oVar.e;
                    x();
                }
                if (oVar.e()) {
                    this.f4563a |= 2;
                    this.f4565c = oVar.f;
                    x();
                }
                if (!oVar.g.isEmpty()) {
                    if (this.f4566d.isEmpty()) {
                        this.f4566d = oVar.g;
                        this.f4563a &= -5;
                    } else {
                        z();
                        this.f4566d.addAll(oVar.g);
                    }
                    x();
                }
                if (!oVar.h.isEmpty()) {
                    if (this.e.isEmpty()) {
                        this.e = oVar.h;
                        this.f4563a &= -9;
                    } else {
                        A();
                        this.e.addAll(oVar.h);
                    }
                    x();
                }
                if (!oVar.i.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = oVar.i;
                        this.f4563a &= -17;
                    } else {
                        B();
                        this.f.addAll(oVar.i);
                    }
                    x();
                }
                am<k, k.a, l> amVar = null;
                if (this.h == null) {
                    if (!oVar.j.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = oVar.j;
                            this.f4563a &= -33;
                        } else {
                            C();
                            this.g.addAll(oVar.j);
                        }
                        x();
                    }
                } else if (!oVar.j.isEmpty()) {
                    if (!this.h.d()) {
                        this.h.a(oVar.j);
                    } else {
                        this.h.b();
                        this.h = null;
                        this.g = oVar.j;
                        this.f4563a &= -33;
                        this.h = com.google.protobuf.s.f4719b ? D() : null;
                    }
                }
                if (this.j == null) {
                    if (!oVar.k.isEmpty()) {
                        if (this.i.isEmpty()) {
                            this.i = oVar.k;
                            this.f4563a &= -65;
                        } else {
                            G();
                            this.i.addAll(oVar.k);
                        }
                        x();
                    }
                } else if (!oVar.k.isEmpty()) {
                    if (!this.j.d()) {
                        this.j.a(oVar.k);
                    } else {
                        this.j.b();
                        this.j = null;
                        this.i = oVar.k;
                        this.f4563a &= -65;
                        this.j = com.google.protobuf.s.f4719b ? H() : null;
                    }
                }
                if (this.l == null) {
                    if (!oVar.l.isEmpty()) {
                        if (this.k.isEmpty()) {
                            this.k = oVar.l;
                            this.f4563a &= -129;
                        } else {
                            I();
                            this.k.addAll(oVar.l);
                        }
                        x();
                    }
                } else if (!oVar.l.isEmpty()) {
                    if (!this.l.d()) {
                        this.l.a(oVar.l);
                    } else {
                        this.l.b();
                        this.l = null;
                        this.k = oVar.l;
                        this.f4563a &= -129;
                        this.l = com.google.protobuf.s.f4719b ? J() : null;
                    }
                }
                if (this.n == null) {
                    if (!oVar.m.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = oVar.m;
                            this.f4563a &= -257;
                        } else {
                            K();
                            this.m.addAll(oVar.m);
                        }
                        x();
                    }
                } else if (!oVar.m.isEmpty()) {
                    if (!this.n.d()) {
                        this.n.a(oVar.m);
                    } else {
                        this.n.b();
                        this.n = null;
                        this.m = oVar.m;
                        this.f4563a &= -257;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = L();
                        }
                        this.n = amVar;
                    }
                }
                if (oVar.u()) {
                    a(oVar.v());
                }
                if (oVar.w()) {
                    a(oVar.x());
                }
                if (oVar.y()) {
                    this.f4563a |= 2048;
                    this.s = oVar.p;
                    x();
                }
                d(oVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < k(); i2++) {
                    if (!b(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < l(); i3++) {
                    if (!c(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < m(); i4++) {
                    if (!d(i4).isInitialized()) {
                        return false;
                    }
                }
                return !n() || o().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.o.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$o> r1 = com.google.protobuf.i.o.f4561a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$o r3 = (com.google.protobuf.i.o) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$o r4 = (com.google.protobuf.i.o) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.o.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$o$a");
            }

            public a a(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.f4563a |= 1;
                this.f4564b = str;
                x();
                return this;
            }

            public a b(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.f4563a |= 2;
                this.f4565c = str;
                x();
                return this;
            }

            private void z() {
                if ((this.f4563a & 4) != 4) {
                    this.f4566d = new com.google.protobuf.x(this.f4566d);
                    this.f4563a |= 4;
                }
            }

            private void A() {
                if ((this.f4563a & 8) != 8) {
                    this.e = new ArrayList(this.e);
                    this.f4563a |= 8;
                }
            }

            private void B() {
                if ((this.f4563a & 16) != 16) {
                    this.f = new ArrayList(this.f);
                    this.f4563a |= 16;
                }
            }

            private void C() {
                if ((this.f4563a & 32) != 32) {
                    this.g = new ArrayList(this.g);
                    this.f4563a |= 32;
                }
            }

            public int j() {
                if (this.h == null) {
                    return this.g.size();
                }
                return this.h.c();
            }

            public a a(int i) {
                if (this.h == null) {
                    return this.g.get(i);
                }
                return this.h.a(i);
            }

            public a a(a aVar) {
                if (this.h != null) {
                    this.h.a((am<a, a.C0081a, b>) aVar);
                } else if (aVar == null) {
                    throw new NullPointerException();
                } else {
                    C();
                    this.g.add(aVar);
                    x();
                }
                return this;
            }

            private am<a, a.C0081a, b> D() {
                if (this.h == null) {
                    this.h = new am<>(this.g, (this.f4563a & 32) == 32, w(), v());
                    this.g = null;
                }
                return this.h;
            }

            private void G() {
                if ((this.f4563a & 64) != 64) {
                    this.i = new ArrayList(this.i);
                    this.f4563a |= 64;
                }
            }

            public int k() {
                if (this.j == null) {
                    return this.i.size();
                }
                return this.j.c();
            }

            public c b(int i) {
                if (this.j == null) {
                    return this.i.get(i);
                }
                return this.j.a(i);
            }

            private am<c, c.a, d> H() {
                if (this.j == null) {
                    this.j = new am<>(this.i, (this.f4563a & 64) == 64, w(), v());
                    this.i = null;
                }
                return this.j;
            }

            private void I() {
                if ((this.f4563a & 128) != 128) {
                    this.k = new ArrayList(this.k);
                    this.f4563a |= 128;
                }
            }

            public int l() {
                if (this.l == null) {
                    return this.k.size();
                }
                return this.l.c();
            }

            public ac c(int i) {
                if (this.l == null) {
                    return this.k.get(i);
                }
                return this.l.a(i);
            }

            private am<ac, ac.a, ad> J() {
                if (this.l == null) {
                    this.l = new am<>(this.k, (this.f4563a & 128) == 128, w(), v());
                    this.k = null;
                }
                return this.l;
            }

            private void K() {
                if ((this.f4563a & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.f4563a |= 256;
                }
            }

            public int m() {
                if (this.n == null) {
                    return this.m.size();
                }
                return this.n.c();
            }

            public k d(int i) {
                if (this.n == null) {
                    return this.m.get(i);
                }
                return this.n.a(i);
            }

            private am<k, k.a, l> L() {
                if (this.n == null) {
                    this.n = new am<>(this.m, (this.f4563a & 256) == 256, w(), v());
                    this.m = null;
                }
                return this.n;
            }

            public boolean n() {
                return (this.f4563a & 512) == 512;
            }

            public q o() {
                if (this.p == null) {
                    return this.o == null ? q.S() : this.o;
                }
                return this.p.b();
            }

            public a a(q qVar) {
                if (this.p == null) {
                    if ((this.f4563a & 512) == 512 && this.o != null && this.o != q.S()) {
                        this.o = q.a(this.o).a(qVar).r();
                    } else {
                        this.o = qVar;
                    }
                    x();
                } else {
                    this.p.b(qVar);
                }
                this.f4563a |= 512;
                return this;
            }

            private an<q, q.a, r> M() {
                if (this.p == null) {
                    this.p = new an<>(o(), w(), v());
                    this.o = null;
                }
                return this.p;
            }

            public ag p() {
                if (this.r == null) {
                    return this.q == null ? ag.h() : this.q;
                }
                return this.r.b();
            }

            public a a(ag agVar) {
                if (this.r == null) {
                    if ((this.f4563a & 1024) == 1024 && this.q != null && this.q != ag.h()) {
                        this.q = ag.a(this.q).a(agVar).r();
                    } else {
                        this.q = agVar;
                    }
                    x();
                } else {
                    this.r.b(agVar);
                }
                this.f4563a |= 1024;
                return this;
            }

            private an<ag, ag.a, ah> N() {
                if (this.r == null) {
                    this.r = new an<>(p(), w(), v());
                    this.q = null;
                }
                return this.r;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static o I() {
            return r;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<o> getParserForType() {
            return f4561a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: J */
        public o F() {
            return r;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class a extends com.google.protobuf.s implements b {

        /* renamed from: d  reason: collision with root package name */
        private int f4455d;
        private volatile Object e;
        private List<k> f;
        private List<k> g;
        private List<a> h;
        private List<c> i;
        private List<b> j;
        private List<y> k;
        private s l;
        private List<d> m;
        private com.google.protobuf.y n;
        private byte o;
        private static final a p = new a();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<a> f4454a = new com.google.protobuf.c<a>() { // from class: com.google.protobuf.i.a.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public a d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new a(gVar, pVar);
            }
        };

        /* loaded from: classes.dex */
        public interface c extends com.google.protobuf.af {
        }

        /* loaded from: classes.dex */
        public interface e extends com.google.protobuf.af {
        }

        private a(s.a<?> aVar) {
            super(aVar);
            this.o = (byte) -1;
        }

        private a() {
            this.o = (byte) -1;
            this.e = "";
            this.f = Collections.emptyList();
            this.g = Collections.emptyList();
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            this.j = Collections.emptyList();
            this.k = Collections.emptyList();
            this.m = Collections.emptyList();
            this.n = com.google.protobuf.x.f4766a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int a3 = gVar.a();
                        switch (a3) {
                            case 0:
                                break;
                            case 10:
                                com.google.protobuf.f l = gVar.l();
                                this.f4455d |= 1;
                                this.e = l;
                                continue;
                            case 18:
                                if (!(z2 & true)) {
                                    this.f = new ArrayList();
                                    z2 |= true;
                                }
                                this.f.add(gVar.a(k.f4533a, pVar));
                                continue;
                            case 26:
                                if (!(z2 & true)) {
                                    this.h = new ArrayList();
                                    z2 |= true;
                                }
                                this.h.add(gVar.a(f4454a, pVar));
                                continue;
                            case 34:
                                if (!(z2 & true)) {
                                    this.i = new ArrayList();
                                    z2 |= true;
                                }
                                this.i.add(gVar.a(c.f4509a, pVar));
                                continue;
                            case 42:
                                if (!(z2 & true)) {
                                    this.j = new ArrayList();
                                    z2 |= true;
                                }
                                this.j.add(gVar.a(b.f4460a, pVar));
                                continue;
                            case 50:
                                if (!(z2 & true)) {
                                    this.g = new ArrayList();
                                    z2 |= true;
                                }
                                this.g.add(gVar.a(k.f4533a, pVar));
                                continue;
                            case 58:
                                s.a D = (this.f4455d & 2) == 2 ? this.l.D() : null;
                                this.l = (s) gVar.a(s.f4577a, pVar);
                                if (D != null) {
                                    D.a(this.l);
                                    this.l = D.r();
                                }
                                this.f4455d |= 2;
                                continue;
                            case 66:
                                if (!(z2 & true)) {
                                    this.k = new ArrayList();
                                    z2 |= true;
                                }
                                this.k.add(gVar.a(y.f4599a, pVar));
                                continue;
                            case 74:
                                if (!(z2 & true)) {
                                    this.m = new ArrayList();
                                    z2 |= true;
                                }
                                this.m.add(gVar.a(d.f4465a, pVar));
                                continue;
                            case 82:
                                com.google.protobuf.f l2 = gVar.l();
                                if (!(z2 & true)) {
                                    this.n = new com.google.protobuf.x();
                                    z2 |= true;
                                }
                                this.n.a(l2);
                                continue;
                            default:
                                if (!a(gVar, a2, pVar, a3)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e2) {
                        throw e2.a(this);
                    } catch (IOException e3) {
                        throw new com.google.protobuf.u(e3).a(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if (z2 & true) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if (z2 & true) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if (z2 & true) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    if (z2 & true) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if (z2 & true) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if (z2 & true) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    if (z2 & true) {
                        this.n = this.n.e();
                    }
                    this.f4720c = a2.t();
                    V();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f = Collections.unmodifiableList(this.f);
            }
            if (z2 & true) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if (z2 & true) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if (z2 & true) {
                this.j = Collections.unmodifiableList(this.j);
            }
            if (z2 & true) {
                this.g = Collections.unmodifiableList(this.g);
            }
            if (z2 & true) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if (z2 & true) {
                this.m = Collections.unmodifiableList(this.m);
            }
            if (z2 & true) {
                this.n = this.n.e();
            }
            this.f4720c = a2.t();
            V();
        }

        public static final j.a a() {
            return i.e;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.f.a(a.class, C0081a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class b extends com.google.protobuf.s implements c {

            /* renamed from: d  reason: collision with root package name */
            private int f4461d;
            private int e;
            private int f;
            private byte g;
            private static final b h = new b();
            @Deprecated

            /* renamed from: a  reason: collision with root package name */
            public static final com.google.protobuf.ai<b> f4460a = new com.google.protobuf.c<b>() { // from class: com.google.protobuf.i.a.b.1
                @Override // com.google.protobuf.ai
                /* renamed from: c */
                public b d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                    return new b(gVar, pVar);
                }
            };

            private b(s.a<?> aVar) {
                super(aVar);
                this.g = (byte) -1;
            }

            private b() {
                this.g = (byte) -1;
                this.e = 0;
                this.f = 0;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.af
            public final at getUnknownFields() {
                return this.f4720c;
            }

            private b(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                this();
                at.a a2 = at.a();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 8) {
                                    this.f4461d |= 1;
                                    this.e = gVar.f();
                                } else if (a3 != 16) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    this.f4461d |= 2;
                                    this.f = gVar.f();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        } catch (IOException e2) {
                            throw new com.google.protobuf.u(e2).a(this);
                        }
                    } finally {
                        this.f4720c = a2.t();
                        V();
                    }
                }
            }

            public static final j.a a() {
                return i.g;
            }

            @Override // com.google.protobuf.s
            protected s.f b() {
                return i.h.a(b.class, C0082a.class);
            }

            public boolean c() {
                return (this.f4461d & 1) == 1;
            }

            public int d() {
                return this.e;
            }

            public boolean e() {
                return (this.f4461d & 2) == 2;
            }

            public int f() {
                return this.f;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                byte b2 = this.g;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.g = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public void writeTo(com.google.protobuf.h hVar) {
                if ((this.f4461d & 1) == 1) {
                    hVar.b(1, this.e);
                }
                if ((this.f4461d & 2) == 2) {
                    hVar.b(2, this.f);
                }
                this.f4720c.writeTo(hVar);
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.f4461d & 1) == 1) {
                    i2 = 0 + com.google.protobuf.h.f(1, this.e);
                }
                if ((this.f4461d & 2) == 2) {
                    i2 += com.google.protobuf.h.f(2, this.f);
                }
                int serializedSize = i2 + this.f4720c.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return super.equals(obj);
                }
                b bVar = (b) obj;
                boolean z = c() == bVar.c();
                if (c()) {
                    z = z && d() == bVar.d();
                }
                boolean z2 = z && e() == bVar.e();
                if (e()) {
                    z2 = z2 && f() == bVar.f();
                }
                return z2 && this.f4720c.equals(bVar.f4720c);
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + a().hashCode();
                if (c()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + d();
                }
                if (e()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + f();
                }
                int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.ab
            /* renamed from: g */
            public C0082a C() {
                return h();
            }

            public static C0082a h() {
                return h.D();
            }

            @Override // com.google.protobuf.ac
            /* renamed from: i */
            public C0082a D() {
                return this == h ? new C0082a() : new C0082a().a(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.s
            /* renamed from: a */
            public C0082a b(s.b bVar) {
                return new C0082a(bVar);
            }

            /* compiled from: DescriptorProtos.java */
            /* renamed from: com.google.protobuf.i$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0082a extends s.a<C0082a> implements c {

                /* renamed from: a  reason: collision with root package name */
                private int f4462a;

                /* renamed from: b  reason: collision with root package name */
                private int f4463b;

                /* renamed from: c  reason: collision with root package name */
                private int f4464c;

                @Override // com.google.protobuf.s.a, com.google.protobuf.ad
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.s.a
                protected s.f e() {
                    return i.h.a(b.class, C0082a.class);
                }

                private C0082a() {
                    j();
                }

                private C0082a(s.b bVar) {
                    super(bVar);
                    j();
                }

                private void j() {
                    boolean z = com.google.protobuf.s.f4719b;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
                public j.a getDescriptorForType() {
                    return i.g;
                }

                @Override // com.google.protobuf.af
                /* renamed from: f */
                public b F() {
                    return b.j();
                }

                @Override // com.google.protobuf.ac.a
                /* renamed from: g */
                public b t() {
                    b r = r();
                    if (!r.isInitialized()) {
                        throw b(r);
                    }
                    return r;
                }

                @Override // com.google.protobuf.ab.a
                /* renamed from: h */
                public b r() {
                    b bVar = new b(this);
                    int i = this.f4462a;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    bVar.e = this.f4463b;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    bVar.f = this.f4464c;
                    bVar.f4461d = i2;
                    u();
                    return bVar;
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: i */
                public C0082a q() {
                    return (C0082a) super.d();
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: a */
                public C0082a f(j.f fVar, Object obj) {
                    return (C0082a) super.f(fVar, obj);
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public C0082a e(j.f fVar, Object obj) {
                    return (C0082a) super.e(fVar, obj);
                }

                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
                /* renamed from: d */
                public C0082a c(com.google.protobuf.ab abVar) {
                    if (abVar instanceof b) {
                        return a((b) abVar);
                    }
                    super.c(abVar);
                    return this;
                }

                public C0082a a(b bVar) {
                    if (bVar == b.j()) {
                        return this;
                    }
                    if (bVar.c()) {
                        a(bVar.d());
                    }
                    if (bVar.e()) {
                        b(bVar.f());
                    }
                    d(bVar.f4720c);
                    x();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
                /* renamed from: d */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.google.protobuf.i.a.b.C0082a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.ai<com.google.protobuf.i$a$b> r1 = com.google.protobuf.i.a.b.f4460a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        com.google.protobuf.i$a$b r3 = (com.google.protobuf.i.a.b) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        if (r3 == 0) goto Le
                        r2.a(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        com.google.protobuf.i$a$b r4 = (com.google.protobuf.i.a.b) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.a(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.a.b.C0082a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$a$b$a");
                }

                public C0082a a(int i) {
                    this.f4462a |= 1;
                    this.f4463b = i;
                    x();
                    return this;
                }

                public C0082a b(int i) {
                    this.f4462a |= 2;
                    this.f4464c = i;
                    x();
                    return this;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public final C0082a f(at atVar) {
                    return (C0082a) super.f(atVar);
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: c */
                public final C0082a d(at atVar) {
                    return (C0082a) super.a(atVar);
                }
            }

            public static b j() {
                return h;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.ac
            public com.google.protobuf.ai<b> getParserForType() {
                return f4460a;
            }

            @Override // com.google.protobuf.af
            /* renamed from: k */
            public b F() {
                return h;
            }
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class d extends com.google.protobuf.s implements e {

            /* renamed from: d  reason: collision with root package name */
            private int f4466d;
            private int e;
            private int f;
            private byte g;
            private static final d h = new d();
            @Deprecated

            /* renamed from: a  reason: collision with root package name */
            public static final com.google.protobuf.ai<d> f4465a = new com.google.protobuf.c<d>() { // from class: com.google.protobuf.i.a.d.1
                @Override // com.google.protobuf.ai
                /* renamed from: c */
                public d d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                    return new d(gVar, pVar);
                }
            };

            private d(s.a<?> aVar) {
                super(aVar);
                this.g = (byte) -1;
            }

            private d() {
                this.g = (byte) -1;
                this.e = 0;
                this.f = 0;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.af
            public final at getUnknownFields() {
                return this.f4720c;
            }

            private d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                this();
                at.a a2 = at.a();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 8) {
                                    this.f4466d |= 1;
                                    this.e = gVar.f();
                                } else if (a3 != 16) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    this.f4466d |= 2;
                                    this.f = gVar.f();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        } catch (IOException e2) {
                            throw new com.google.protobuf.u(e2).a(this);
                        }
                    } finally {
                        this.f4720c = a2.t();
                        V();
                    }
                }
            }

            public static final j.a a() {
                return i.i;
            }

            @Override // com.google.protobuf.s
            protected s.f b() {
                return i.j.a(d.class, C0083a.class);
            }

            public boolean c() {
                return (this.f4466d & 1) == 1;
            }

            public int d() {
                return this.e;
            }

            public boolean e() {
                return (this.f4466d & 2) == 2;
            }

            public int f() {
                return this.f;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                byte b2 = this.g;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.g = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public void writeTo(com.google.protobuf.h hVar) {
                if ((this.f4466d & 1) == 1) {
                    hVar.b(1, this.e);
                }
                if ((this.f4466d & 2) == 2) {
                    hVar.b(2, this.f);
                }
                this.f4720c.writeTo(hVar);
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.f4466d & 1) == 1) {
                    i2 = 0 + com.google.protobuf.h.f(1, this.e);
                }
                if ((this.f4466d & 2) == 2) {
                    i2 += com.google.protobuf.h.f(2, this.f);
                }
                int serializedSize = i2 + this.f4720c.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return super.equals(obj);
                }
                d dVar = (d) obj;
                boolean z = c() == dVar.c();
                if (c()) {
                    z = z && d() == dVar.d();
                }
                boolean z2 = z && e() == dVar.e();
                if (e()) {
                    z2 = z2 && f() == dVar.f();
                }
                return z2 && this.f4720c.equals(dVar.f4720c);
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + a().hashCode();
                if (c()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + d();
                }
                if (e()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + f();
                }
                int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.ab
            /* renamed from: g */
            public C0083a C() {
                return h();
            }

            public static C0083a h() {
                return h.D();
            }

            @Override // com.google.protobuf.ac
            /* renamed from: i */
            public C0083a D() {
                return this == h ? new C0083a() : new C0083a().a(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.s
            /* renamed from: a */
            public C0083a b(s.b bVar) {
                return new C0083a(bVar);
            }

            /* compiled from: DescriptorProtos.java */
            /* renamed from: com.google.protobuf.i$a$d$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0083a extends s.a<C0083a> implements e {

                /* renamed from: a  reason: collision with root package name */
                private int f4467a;

                /* renamed from: b  reason: collision with root package name */
                private int f4468b;

                /* renamed from: c  reason: collision with root package name */
                private int f4469c;

                @Override // com.google.protobuf.s.a, com.google.protobuf.ad
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.s.a
                protected s.f e() {
                    return i.j.a(d.class, C0083a.class);
                }

                private C0083a() {
                    j();
                }

                private C0083a(s.b bVar) {
                    super(bVar);
                    j();
                }

                private void j() {
                    boolean z = com.google.protobuf.s.f4719b;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
                public j.a getDescriptorForType() {
                    return i.i;
                }

                @Override // com.google.protobuf.af
                /* renamed from: f */
                public d F() {
                    return d.j();
                }

                @Override // com.google.protobuf.ac.a
                /* renamed from: g */
                public d t() {
                    d r = r();
                    if (!r.isInitialized()) {
                        throw b(r);
                    }
                    return r;
                }

                @Override // com.google.protobuf.ab.a
                /* renamed from: h */
                public d r() {
                    d dVar = new d(this);
                    int i = this.f4467a;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    dVar.e = this.f4468b;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    dVar.f = this.f4469c;
                    dVar.f4466d = i2;
                    u();
                    return dVar;
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: i */
                public C0083a q() {
                    return (C0083a) super.d();
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: a */
                public C0083a f(j.f fVar, Object obj) {
                    return (C0083a) super.f(fVar, obj);
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public C0083a e(j.f fVar, Object obj) {
                    return (C0083a) super.e(fVar, obj);
                }

                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
                /* renamed from: d */
                public C0083a c(com.google.protobuf.ab abVar) {
                    if (abVar instanceof d) {
                        return a((d) abVar);
                    }
                    super.c(abVar);
                    return this;
                }

                public C0083a a(d dVar) {
                    if (dVar == d.j()) {
                        return this;
                    }
                    if (dVar.c()) {
                        a(dVar.d());
                    }
                    if (dVar.e()) {
                        b(dVar.f());
                    }
                    d(dVar.f4720c);
                    x();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
                /* renamed from: d */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.google.protobuf.i.a.d.C0083a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.ai<com.google.protobuf.i$a$d> r1 = com.google.protobuf.i.a.d.f4465a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        com.google.protobuf.i$a$d r3 = (com.google.protobuf.i.a.d) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        if (r3 == 0) goto Le
                        r2.a(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        com.google.protobuf.i$a$d r4 = (com.google.protobuf.i.a.d) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.a(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.a.d.C0083a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$a$d$a");
                }

                public C0083a a(int i) {
                    this.f4467a |= 1;
                    this.f4468b = i;
                    x();
                    return this;
                }

                public C0083a b(int i) {
                    this.f4467a |= 2;
                    this.f4469c = i;
                    x();
                    return this;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public final C0083a f(at atVar) {
                    return (C0083a) super.f(atVar);
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: c */
                public final C0083a d(at atVar) {
                    return (C0083a) super.a(atVar);
                }
            }

            public static d j() {
                return h;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.ac
            public com.google.protobuf.ai<d> getParserForType() {
                return f4465a;
            }

            @Override // com.google.protobuf.af
            /* renamed from: k */
            public d F() {
                return h;
            }
        }

        public boolean c() {
            return (this.f4455d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e2 = fVar.e();
            if (fVar.f()) {
                this.e = e2;
            }
            return e2;
        }

        public List<k> e() {
            return this.f;
        }

        public int f() {
            return this.f.size();
        }

        public k a(int i) {
            return this.f.get(i);
        }

        public List<k> g() {
            return this.g;
        }

        public int h() {
            return this.g.size();
        }

        public k b(int i) {
            return this.g.get(i);
        }

        public List<a> i() {
            return this.h;
        }

        public int j() {
            return this.h.size();
        }

        public a c(int i) {
            return this.h.get(i);
        }

        public List<c> k() {
            return this.i;
        }

        public int l() {
            return this.i.size();
        }

        public c d(int i) {
            return this.i.get(i);
        }

        public List<b> m() {
            return this.j;
        }

        public int n() {
            return this.j.size();
        }

        public List<y> o() {
            return this.k;
        }

        public int p() {
            return this.k.size();
        }

        public y e(int i) {
            return this.k.get(i);
        }

        public boolean q() {
            return (this.f4455d & 2) == 2;
        }

        public s r() {
            return this.l == null ? s.p() : this.l;
        }

        public List<d> s() {
            return this.m;
        }

        public int t() {
            return this.m.size();
        }

        public al u() {
            return this.n;
        }

        public int v() {
            return this.n.size();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.o;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < f(); i++) {
                if (!a(i).isInitialized()) {
                    this.o = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < h(); i2++) {
                if (!b(i2).isInitialized()) {
                    this.o = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < j(); i3++) {
                if (!c(i3).isInitialized()) {
                    this.o = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < l(); i4++) {
                if (!d(i4).isInitialized()) {
                    this.o = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < p(); i5++) {
                if (!e(i5).isInitialized()) {
                    this.o = (byte) 0;
                    return false;
                }
            }
            if (q() && !r().isInitialized()) {
                this.o = (byte) 0;
                return false;
            }
            this.o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4455d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            for (int i = 0; i < this.f.size(); i++) {
                hVar.a(2, this.f.get(i));
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                hVar.a(3, this.h.get(i2));
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                hVar.a(4, this.i.get(i3));
            }
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                hVar.a(5, this.j.get(i4));
            }
            for (int i5 = 0; i5 < this.g.size(); i5++) {
                hVar.a(6, this.g.get(i5));
            }
            if ((this.f4455d & 2) == 2) {
                hVar.a(7, r());
            }
            for (int i6 = 0; i6 < this.k.size(); i6++) {
                hVar.a(8, this.k.get(i6));
            }
            for (int i7 = 0; i7 < this.m.size(); i7++) {
                hVar.a(9, this.m.get(i7));
            }
            for (int i8 = 0; i8 < this.n.size(); i8++) {
                com.google.protobuf.s.a(hVar, 10, this.n.c(i8));
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int a2 = (this.f4455d & 1) == 1 ? com.google.protobuf.s.a(1, this.e) + 0 : 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                a2 += com.google.protobuf.h.c(2, this.f.get(i2));
            }
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                a2 += com.google.protobuf.h.c(3, this.h.get(i3));
            }
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                a2 += com.google.protobuf.h.c(4, this.i.get(i4));
            }
            for (int i5 = 0; i5 < this.j.size(); i5++) {
                a2 += com.google.protobuf.h.c(5, this.j.get(i5));
            }
            for (int i6 = 0; i6 < this.g.size(); i6++) {
                a2 += com.google.protobuf.h.c(6, this.g.get(i6));
            }
            if ((this.f4455d & 2) == 2) {
                a2 += com.google.protobuf.h.c(7, r());
            }
            for (int i7 = 0; i7 < this.k.size(); i7++) {
                a2 += com.google.protobuf.h.c(8, this.k.get(i7));
            }
            for (int i8 = 0; i8 < this.m.size(); i8++) {
                a2 += com.google.protobuf.h.c(9, this.m.get(i8));
            }
            int i9 = 0;
            for (int i10 = 0; i10 < this.n.size(); i10++) {
                i9 += a(this.n.c(i10));
            }
            int size = a2 + i9 + (u().size() * 1) + this.f4720c.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            boolean z = c() == aVar.c();
            if (c()) {
                z = z && d().equals(aVar.d());
            }
            boolean z2 = ((((((z && e().equals(aVar.e())) && g().equals(aVar.g())) && i().equals(aVar.i())) && k().equals(aVar.k())) && m().equals(aVar.m())) && o().equals(aVar.o())) && q() == aVar.q();
            if (q()) {
                z2 = z2 && r().equals(aVar.r());
            }
            return ((z2 && s().equals(aVar.s())) && u().equals(aVar.u())) && this.f4720c.equals(aVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (f() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
            }
            if (h() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + g().hashCode();
            }
            if (j() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + i().hashCode();
            }
            if (l() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + k().hashCode();
            }
            if (n() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + m().hashCode();
            }
            if (p() > 0) {
                hashCode = (((hashCode * 37) + 8) * 53) + o().hashCode();
            }
            if (q()) {
                hashCode = (((hashCode * 37) + 7) * 53) + r().hashCode();
            }
            if (t() > 0) {
                hashCode = (((hashCode * 37) + 9) * 53) + s().hashCode();
            }
            if (v() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + u().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: w */
        public C0081a C() {
            return x();
        }

        public static C0081a x() {
            return p.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: y */
        public C0081a D() {
            return this == p ? new C0081a() : new C0081a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0081a b(s.b bVar) {
            return new C0081a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* renamed from: com.google.protobuf.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0081a extends s.a<C0081a> implements b {

            /* renamed from: a  reason: collision with root package name */
            private int f4456a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4457b;

            /* renamed from: c  reason: collision with root package name */
            private List<k> f4458c;

            /* renamed from: d  reason: collision with root package name */
            private am<k, k.a, l> f4459d;
            private List<k> e;
            private am<k, k.a, l> f;
            private List<a> g;
            private am<a, C0081a, b> h;
            private List<c> i;
            private am<c, c.a, d> j;
            private List<b> k;
            private am<b, b.C0082a, c> l;
            private List<y> m;
            private am<y, y.a, z> n;
            private s o;
            private an<s, s.a, t> p;
            private List<d> q;
            private am<d, d.C0083a, e> r;
            private com.google.protobuf.y s;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.f.a(a.class, C0081a.class);
            }

            private C0081a() {
                this.f4457b = "";
                this.f4458c = Collections.emptyList();
                this.e = Collections.emptyList();
                this.g = Collections.emptyList();
                this.i = Collections.emptyList();
                this.k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = null;
                this.q = Collections.emptyList();
                this.s = com.google.protobuf.x.f4766a;
                y();
            }

            private C0081a(s.b bVar) {
                super(bVar);
                this.f4457b = "";
                this.f4458c = Collections.emptyList();
                this.e = Collections.emptyList();
                this.g = Collections.emptyList();
                this.i = Collections.emptyList();
                this.k = Collections.emptyList();
                this.m = Collections.emptyList();
                this.o = null;
                this.q = Collections.emptyList();
                this.s = com.google.protobuf.x.f4766a;
                y();
            }

            private void y() {
                if (com.google.protobuf.s.f4719b) {
                    A();
                    C();
                    G();
                    I();
                    K();
                    M();
                    N();
                    P();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.e;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public a F() {
                return a.z();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public a t() {
                a r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public a r() {
                a aVar = new a(this);
                int i = this.f4456a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                aVar.e = this.f4457b;
                if (this.f4459d != null) {
                    aVar.f = this.f4459d.e();
                } else {
                    if ((this.f4456a & 2) == 2) {
                        this.f4458c = Collections.unmodifiableList(this.f4458c);
                        this.f4456a &= -3;
                    }
                    aVar.f = this.f4458c;
                }
                if (this.f != null) {
                    aVar.g = this.f.e();
                } else {
                    if ((this.f4456a & 4) == 4) {
                        this.e = Collections.unmodifiableList(this.e);
                        this.f4456a &= -5;
                    }
                    aVar.g = this.e;
                }
                if (this.h != null) {
                    aVar.h = this.h.e();
                } else {
                    if ((this.f4456a & 8) == 8) {
                        this.g = Collections.unmodifiableList(this.g);
                        this.f4456a &= -9;
                    }
                    aVar.h = this.g;
                }
                if (this.j != null) {
                    aVar.i = this.j.e();
                } else {
                    if ((this.f4456a & 16) == 16) {
                        this.i = Collections.unmodifiableList(this.i);
                        this.f4456a &= -17;
                    }
                    aVar.i = this.i;
                }
                if (this.l != null) {
                    aVar.j = this.l.e();
                } else {
                    if ((this.f4456a & 32) == 32) {
                        this.k = Collections.unmodifiableList(this.k);
                        this.f4456a &= -33;
                    }
                    aVar.j = this.k;
                }
                if (this.n != null) {
                    aVar.k = this.n.e();
                } else {
                    if ((this.f4456a & 64) == 64) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.f4456a &= -65;
                    }
                    aVar.k = this.m;
                }
                if ((i & 128) == 128) {
                    i2 |= 2;
                }
                if (this.p == null) {
                    aVar.l = this.o;
                } else {
                    aVar.l = this.p.c();
                }
                if (this.r != null) {
                    aVar.m = this.r.e();
                } else {
                    if ((this.f4456a & 256) == 256) {
                        this.q = Collections.unmodifiableList(this.q);
                        this.f4456a &= -257;
                    }
                    aVar.m = this.q;
                }
                if ((this.f4456a & 512) == 512) {
                    this.s = this.s.e();
                    this.f4456a &= -513;
                }
                aVar.n = this.s;
                aVar.f4455d = i2;
                u();
                return aVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0081a q() {
                return (C0081a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0081a f(j.f fVar, Object obj) {
                return (C0081a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0081a e(j.f fVar, Object obj) {
                return (C0081a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0081a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof a) {
                    return a((a) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0081a a(a aVar) {
                if (aVar == a.z()) {
                    return this;
                }
                if (aVar.c()) {
                    this.f4456a |= 1;
                    this.f4457b = aVar.e;
                    x();
                }
                am<d, d.C0083a, e> amVar = null;
                if (this.f4459d == null) {
                    if (!aVar.f.isEmpty()) {
                        if (this.f4458c.isEmpty()) {
                            this.f4458c = aVar.f;
                            this.f4456a &= -3;
                        } else {
                            z();
                            this.f4458c.addAll(aVar.f);
                        }
                        x();
                    }
                } else if (!aVar.f.isEmpty()) {
                    if (!this.f4459d.d()) {
                        this.f4459d.a(aVar.f);
                    } else {
                        this.f4459d.b();
                        this.f4459d = null;
                        this.f4458c = aVar.f;
                        this.f4456a &= -3;
                        this.f4459d = com.google.protobuf.s.f4719b ? A() : null;
                    }
                }
                if (this.f == null) {
                    if (!aVar.g.isEmpty()) {
                        if (this.e.isEmpty()) {
                            this.e = aVar.g;
                            this.f4456a &= -5;
                        } else {
                            B();
                            this.e.addAll(aVar.g);
                        }
                        x();
                    }
                } else if (!aVar.g.isEmpty()) {
                    if (!this.f.d()) {
                        this.f.a(aVar.g);
                    } else {
                        this.f.b();
                        this.f = null;
                        this.e = aVar.g;
                        this.f4456a &= -5;
                        this.f = com.google.protobuf.s.f4719b ? C() : null;
                    }
                }
                if (this.h == null) {
                    if (!aVar.h.isEmpty()) {
                        if (this.g.isEmpty()) {
                            this.g = aVar.h;
                            this.f4456a &= -9;
                        } else {
                            D();
                            this.g.addAll(aVar.h);
                        }
                        x();
                    }
                } else if (!aVar.h.isEmpty()) {
                    if (!this.h.d()) {
                        this.h.a(aVar.h);
                    } else {
                        this.h.b();
                        this.h = null;
                        this.g = aVar.h;
                        this.f4456a &= -9;
                        this.h = com.google.protobuf.s.f4719b ? G() : null;
                    }
                }
                if (this.j == null) {
                    if (!aVar.i.isEmpty()) {
                        if (this.i.isEmpty()) {
                            this.i = aVar.i;
                            this.f4456a &= -17;
                        } else {
                            H();
                            this.i.addAll(aVar.i);
                        }
                        x();
                    }
                } else if (!aVar.i.isEmpty()) {
                    if (!this.j.d()) {
                        this.j.a(aVar.i);
                    } else {
                        this.j.b();
                        this.j = null;
                        this.i = aVar.i;
                        this.f4456a &= -17;
                        this.j = com.google.protobuf.s.f4719b ? I() : null;
                    }
                }
                if (this.l == null) {
                    if (!aVar.j.isEmpty()) {
                        if (this.k.isEmpty()) {
                            this.k = aVar.j;
                            this.f4456a &= -33;
                        } else {
                            J();
                            this.k.addAll(aVar.j);
                        }
                        x();
                    }
                } else if (!aVar.j.isEmpty()) {
                    if (!this.l.d()) {
                        this.l.a(aVar.j);
                    } else {
                        this.l.b();
                        this.l = null;
                        this.k = aVar.j;
                        this.f4456a &= -33;
                        this.l = com.google.protobuf.s.f4719b ? K() : null;
                    }
                }
                if (this.n == null) {
                    if (!aVar.k.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = aVar.k;
                            this.f4456a &= -65;
                        } else {
                            L();
                            this.m.addAll(aVar.k);
                        }
                        x();
                    }
                } else if (!aVar.k.isEmpty()) {
                    if (!this.n.d()) {
                        this.n.a(aVar.k);
                    } else {
                        this.n.b();
                        this.n = null;
                        this.m = aVar.k;
                        this.f4456a &= -65;
                        this.n = com.google.protobuf.s.f4719b ? M() : null;
                    }
                }
                if (aVar.q()) {
                    a(aVar.r());
                }
                if (this.r == null) {
                    if (!aVar.m.isEmpty()) {
                        if (this.q.isEmpty()) {
                            this.q = aVar.m;
                            this.f4456a &= -257;
                        } else {
                            O();
                            this.q.addAll(aVar.m);
                        }
                        x();
                    }
                } else if (!aVar.m.isEmpty()) {
                    if (!this.r.d()) {
                        this.r.a(aVar.m);
                    } else {
                        this.r.b();
                        this.r = null;
                        this.q = aVar.m;
                        this.f4456a &= -257;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = P();
                        }
                        this.r = amVar;
                    }
                }
                if (!aVar.n.isEmpty()) {
                    if (this.s.isEmpty()) {
                        this.s = aVar.n;
                        this.f4456a &= -513;
                    } else {
                        Q();
                        this.s.addAll(aVar.n);
                    }
                    x();
                }
                d(aVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < k(); i2++) {
                    if (!b(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < l(); i3++) {
                    if (!c(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < m(); i4++) {
                    if (!d(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < n(); i5++) {
                    if (!e(i5).isInitialized()) {
                        return false;
                    }
                }
                return !o() || p().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.a.C0081a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$a> r1 = com.google.protobuf.i.a.f4454a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$a r3 = (com.google.protobuf.i.a) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$a r4 = (com.google.protobuf.i.a) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.a.C0081a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$a$a");
            }

            public C0081a a(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.f4456a |= 1;
                this.f4457b = str;
                x();
                return this;
            }

            private void z() {
                if ((this.f4456a & 2) != 2) {
                    this.f4458c = new ArrayList(this.f4458c);
                    this.f4456a |= 2;
                }
            }

            public int j() {
                if (this.f4459d == null) {
                    return this.f4458c.size();
                }
                return this.f4459d.c();
            }

            public k a(int i) {
                if (this.f4459d == null) {
                    return this.f4458c.get(i);
                }
                return this.f4459d.a(i);
            }

            private am<k, k.a, l> A() {
                if (this.f4459d == null) {
                    this.f4459d = new am<>(this.f4458c, (this.f4456a & 2) == 2, w(), v());
                    this.f4458c = null;
                }
                return this.f4459d;
            }

            private void B() {
                if ((this.f4456a & 4) != 4) {
                    this.e = new ArrayList(this.e);
                    this.f4456a |= 4;
                }
            }

            public int k() {
                if (this.f == null) {
                    return this.e.size();
                }
                return this.f.c();
            }

            public k b(int i) {
                if (this.f == null) {
                    return this.e.get(i);
                }
                return this.f.a(i);
            }

            private am<k, k.a, l> C() {
                if (this.f == null) {
                    this.f = new am<>(this.e, (this.f4456a & 4) == 4, w(), v());
                    this.e = null;
                }
                return this.f;
            }

            private void D() {
                if ((this.f4456a & 8) != 8) {
                    this.g = new ArrayList(this.g);
                    this.f4456a |= 8;
                }
            }

            public int l() {
                if (this.h == null) {
                    return this.g.size();
                }
                return this.h.c();
            }

            public a c(int i) {
                if (this.h == null) {
                    return this.g.get(i);
                }
                return this.h.a(i);
            }

            private am<a, C0081a, b> G() {
                if (this.h == null) {
                    this.h = new am<>(this.g, (this.f4456a & 8) == 8, w(), v());
                    this.g = null;
                }
                return this.h;
            }

            private void H() {
                if ((this.f4456a & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.f4456a |= 16;
                }
            }

            public int m() {
                if (this.j == null) {
                    return this.i.size();
                }
                return this.j.c();
            }

            public c d(int i) {
                if (this.j == null) {
                    return this.i.get(i);
                }
                return this.j.a(i);
            }

            private am<c, c.a, d> I() {
                if (this.j == null) {
                    this.j = new am<>(this.i, (this.f4456a & 16) == 16, w(), v());
                    this.i = null;
                }
                return this.j;
            }

            private void J() {
                if ((this.f4456a & 32) != 32) {
                    this.k = new ArrayList(this.k);
                    this.f4456a |= 32;
                }
            }

            public C0081a a(b bVar) {
                if (this.l != null) {
                    this.l.a((am<b, b.C0082a, c>) bVar);
                } else if (bVar == null) {
                    throw new NullPointerException();
                } else {
                    J();
                    this.k.add(bVar);
                    x();
                }
                return this;
            }

            private am<b, b.C0082a, c> K() {
                if (this.l == null) {
                    this.l = new am<>(this.k, (this.f4456a & 32) == 32, w(), v());
                    this.k = null;
                }
                return this.l;
            }

            private void L() {
                if ((this.f4456a & 64) != 64) {
                    this.m = new ArrayList(this.m);
                    this.f4456a |= 64;
                }
            }

            public int n() {
                if (this.n == null) {
                    return this.m.size();
                }
                return this.n.c();
            }

            public y e(int i) {
                if (this.n == null) {
                    return this.m.get(i);
                }
                return this.n.a(i);
            }

            private am<y, y.a, z> M() {
                if (this.n == null) {
                    this.n = new am<>(this.m, (this.f4456a & 64) == 64, w(), v());
                    this.m = null;
                }
                return this.n;
            }

            public boolean o() {
                return (this.f4456a & 128) == 128;
            }

            public s p() {
                if (this.p == null) {
                    return this.o == null ? s.p() : this.o;
                }
                return this.p.b();
            }

            public C0081a a(s sVar) {
                if (this.p == null) {
                    if ((this.f4456a & 128) == 128 && this.o != null && this.o != s.p()) {
                        this.o = s.a(this.o).a(sVar).r();
                    } else {
                        this.o = sVar;
                    }
                    x();
                } else {
                    this.p.b(sVar);
                }
                this.f4456a |= 128;
                return this;
            }

            private an<s, s.a, t> N() {
                if (this.p == null) {
                    this.p = new an<>(p(), w(), v());
                    this.o = null;
                }
                return this.p;
            }

            private void O() {
                if ((this.f4456a & 256) != 256) {
                    this.q = new ArrayList(this.q);
                    this.f4456a |= 256;
                }
            }

            private am<d, d.C0083a, e> P() {
                if (this.r == null) {
                    this.r = new am<>(this.q, (this.f4456a & 256) == 256, w(), v());
                    this.q = null;
                }
                return this.r;
            }

            private void Q() {
                if ((this.f4456a & 512) != 512) {
                    this.s = new com.google.protobuf.x(this.s);
                    this.f4456a |= 512;
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0081a f(at atVar) {
                return (C0081a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0081a d(at atVar) {
                return (C0081a) super.a(atVar);
            }
        }

        public static a z() {
            return p;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<a> getParserForType() {
            return f4454a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: A */
        public a F() {
            return p;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class k extends com.google.protobuf.s implements l {

        /* renamed from: d  reason: collision with root package name */
        private int f4534d;
        private volatile Object e;
        private int f;
        private int g;
        private int h;
        private volatile Object i;
        private volatile Object j;
        private volatile Object k;
        private int l;
        private volatile Object m;
        private m n;
        private byte o;
        private static final k p = new k();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<k> f4533a = new com.google.protobuf.c<k>() { // from class: com.google.protobuf.i.k.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public k d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new k(gVar, pVar);
            }
        };

        private k(s.a<?> aVar) {
            super(aVar);
            this.o = (byte) -1;
        }

        private k() {
            this.o = (byte) -1;
            this.e = "";
            this.f = 0;
            this.g = 1;
            this.h = 1;
            this.i = "";
            this.j = "";
            this.k = "";
            this.l = 0;
            this.m = "";
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        private k(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a3 = gVar.a();
                        switch (a3) {
                            case 0:
                                break;
                            case 10:
                                com.google.protobuf.f l = gVar.l();
                                this.f4534d = 1 | this.f4534d;
                                this.e = l;
                                continue;
                            case 18:
                                com.google.protobuf.f l2 = gVar.l();
                                this.f4534d |= 32;
                                this.j = l2;
                                continue;
                            case 24:
                                this.f4534d |= 2;
                                this.f = gVar.f();
                                continue;
                            case 32:
                                int n = gVar.n();
                                if (b.a(n) == null) {
                                    a2.a(4, n);
                                } else {
                                    this.f4534d |= 4;
                                    this.g = n;
                                    continue;
                                }
                            case 40:
                                int n2 = gVar.n();
                                if (c.a(n2) == null) {
                                    a2.a(5, n2);
                                } else {
                                    this.f4534d |= 8;
                                    this.h = n2;
                                    continue;
                                }
                            case 50:
                                com.google.protobuf.f l3 = gVar.l();
                                this.f4534d |= 16;
                                this.i = l3;
                                continue;
                            case 58:
                                com.google.protobuf.f l4 = gVar.l();
                                this.f4534d |= 64;
                                this.k = l4;
                                continue;
                            case 66:
                                m.a D = (this.f4534d & 512) == 512 ? this.n.D() : null;
                                this.n = (m) gVar.a(m.f4547a, pVar);
                                if (D != null) {
                                    D.a(this.n);
                                    this.n = D.r();
                                }
                                this.f4534d |= 512;
                                continue;
                            case 72:
                                this.f4534d |= 128;
                                this.l = gVar.f();
                                continue;
                            case 82:
                                com.google.protobuf.f l5 = gVar.l();
                                this.f4534d |= 256;
                                this.m = l5;
                                continue;
                            default:
                                if (!a(gVar, a2, pVar, a3)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.k;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.l.a(k.class, a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public enum c implements ak {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);
            
            private static final t.b<c> s = new t.b<c>() { // from class: com.google.protobuf.i.k.c.1
            };
            private static final c[] t = values();
            private final int u;

            @Override // com.google.protobuf.t.a
            public final int a() {
                return this.u;
            }

            @Deprecated
            public static c a(int i) {
                return b(i);
            }

            public static c b(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            c(int i) {
                this.u = i;
            }
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public enum b implements ak {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);
            

            /* renamed from: d  reason: collision with root package name */
            private static final t.b<b> f4542d = new t.b<b>() { // from class: com.google.protobuf.i.k.b.1
            };
            private static final b[] e = values();
            private final int f;

            @Override // com.google.protobuf.t.a
            public final int a() {
                return this.f;
            }

            @Deprecated
            public static b a(int i) {
                return b(i);
            }

            public static b b(int i) {
                switch (i) {
                    case 1:
                        return LABEL_OPTIONAL;
                    case 2:
                        return LABEL_REQUIRED;
                    case 3:
                        return LABEL_REPEATED;
                    default:
                        return null;
                }
            }

            b(int i) {
                this.f = i;
            }
        }

        public boolean c() {
            return (this.f4534d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public boolean e() {
            return (this.f4534d & 2) == 2;
        }

        public int f() {
            return this.f;
        }

        public boolean g() {
            return (this.f4534d & 4) == 4;
        }

        public b h() {
            b a2 = b.a(this.g);
            return a2 == null ? b.LABEL_OPTIONAL : a2;
        }

        public boolean i() {
            return (this.f4534d & 8) == 8;
        }

        public c j() {
            c a2 = c.a(this.h);
            return a2 == null ? c.TYPE_DOUBLE : a2;
        }

        public boolean k() {
            return (this.f4534d & 16) == 16;
        }

        public String l() {
            Object obj = this.i;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.i = e;
            }
            return e;
        }

        public boolean m() {
            return (this.f4534d & 32) == 32;
        }

        public String n() {
            Object obj = this.j;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.j = e;
            }
            return e;
        }

        public boolean o() {
            return (this.f4534d & 64) == 64;
        }

        public String p() {
            Object obj = this.k;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.k = e;
            }
            return e;
        }

        public boolean q() {
            return (this.f4534d & 128) == 128;
        }

        public int r() {
            return this.l;
        }

        public boolean s() {
            return (this.f4534d & 256) == 256;
        }

        public String t() {
            Object obj = this.m;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.m = e;
            }
            return e;
        }

        public boolean u() {
            return (this.f4534d & 512) == 512;
        }

        public m v() {
            return this.n == null ? m.t() : this.n;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.o;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (u() && !v().isInitialized()) {
                this.o = (byte) 0;
                return false;
            }
            this.o = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4534d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            if ((this.f4534d & 32) == 32) {
                com.google.protobuf.s.a(hVar, 2, this.j);
            }
            if ((this.f4534d & 2) == 2) {
                hVar.b(3, this.f);
            }
            if ((this.f4534d & 4) == 4) {
                hVar.e(4, this.g);
            }
            if ((this.f4534d & 8) == 8) {
                hVar.e(5, this.h);
            }
            if ((this.f4534d & 16) == 16) {
                com.google.protobuf.s.a(hVar, 6, this.i);
            }
            if ((this.f4534d & 64) == 64) {
                com.google.protobuf.s.a(hVar, 7, this.k);
            }
            if ((this.f4534d & 512) == 512) {
                hVar.a(8, v());
            }
            if ((this.f4534d & 128) == 128) {
                hVar.b(9, this.l);
            }
            if ((this.f4534d & 256) == 256) {
                com.google.protobuf.s.a(hVar, 10, this.m);
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f4534d & 1) == 1) {
                i2 = 0 + com.google.protobuf.s.a(1, this.e);
            }
            if ((this.f4534d & 32) == 32) {
                i2 += com.google.protobuf.s.a(2, this.j);
            }
            if ((this.f4534d & 2) == 2) {
                i2 += com.google.protobuf.h.f(3, this.f);
            }
            if ((this.f4534d & 4) == 4) {
                i2 += com.google.protobuf.h.i(4, this.g);
            }
            if ((this.f4534d & 8) == 8) {
                i2 += com.google.protobuf.h.i(5, this.h);
            }
            if ((this.f4534d & 16) == 16) {
                i2 += com.google.protobuf.s.a(6, this.i);
            }
            if ((this.f4534d & 64) == 64) {
                i2 += com.google.protobuf.s.a(7, this.k);
            }
            if ((this.f4534d & 512) == 512) {
                i2 += com.google.protobuf.h.c(8, v());
            }
            if ((this.f4534d & 128) == 128) {
                i2 += com.google.protobuf.h.f(9, this.l);
            }
            if ((this.f4534d & 256) == 256) {
                i2 += com.google.protobuf.s.a(10, this.m);
            }
            int serializedSize = i2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return super.equals(obj);
            }
            k kVar = (k) obj;
            boolean z = c() == kVar.c();
            if (c()) {
                z = z && d().equals(kVar.d());
            }
            boolean z2 = z && e() == kVar.e();
            if (e()) {
                z2 = z2 && f() == kVar.f();
            }
            boolean z3 = z2 && g() == kVar.g();
            if (g()) {
                z3 = z3 && this.g == kVar.g;
            }
            boolean z4 = z3 && i() == kVar.i();
            if (i()) {
                z4 = z4 && this.h == kVar.h;
            }
            boolean z5 = z4 && k() == kVar.k();
            if (k()) {
                z5 = z5 && l().equals(kVar.l());
            }
            boolean z6 = z5 && m() == kVar.m();
            if (m()) {
                z6 = z6 && n().equals(kVar.n());
            }
            boolean z7 = z6 && o() == kVar.o();
            if (o()) {
                z7 = z7 && p().equals(kVar.p());
            }
            boolean z8 = z7 && q() == kVar.q();
            if (q()) {
                z8 = z8 && r() == kVar.r();
            }
            boolean z9 = z8 && s() == kVar.s();
            if (s()) {
                z9 = z9 && t().equals(kVar.t());
            }
            boolean z10 = z9 && u() == kVar.u();
            if (u()) {
                z10 = z10 && v().equals(kVar.v());
            }
            return z10 && this.f4720c.equals(kVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 3) * 53) + f();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 4) * 53) + this.g;
            }
            if (i()) {
                hashCode = (((hashCode * 37) + 5) * 53) + this.h;
            }
            if (k()) {
                hashCode = (((hashCode * 37) + 6) * 53) + l().hashCode();
            }
            if (m()) {
                hashCode = (((hashCode * 37) + 2) * 53) + n().hashCode();
            }
            if (o()) {
                hashCode = (((hashCode * 37) + 7) * 53) + p().hashCode();
            }
            if (q()) {
                hashCode = (((hashCode * 37) + 9) * 53) + r();
            }
            if (s()) {
                hashCode = (((hashCode * 37) + 10) * 53) + t().hashCode();
            }
            if (u()) {
                hashCode = (((hashCode * 37) + 8) * 53) + v().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: w */
        public a C() {
            return x();
        }

        public static a x() {
            return p.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: y */
        public a D() {
            return this == p ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements l {

            /* renamed from: a  reason: collision with root package name */
            private int f4535a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4536b;

            /* renamed from: c  reason: collision with root package name */
            private int f4537c;

            /* renamed from: d  reason: collision with root package name */
            private int f4538d;
            private int e;
            private Object f;
            private Object g;
            private Object h;
            private int i;
            private Object j;
            private m k;
            private an<m, m.a, n> l;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.l.a(k.class, a.class);
            }

            private a() {
                this.f4536b = "";
                this.f4538d = 1;
                this.e = 1;
                this.f = "";
                this.g = "";
                this.h = "";
                this.j = "";
                this.k = null;
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4536b = "";
                this.f4538d = 1;
                this.e = 1;
                this.f = "";
                this.g = "";
                this.h = "";
                this.j = "";
                this.k = null;
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    m();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.k;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public k F() {
                return k.z();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public k t() {
                k r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public k r() {
                k kVar = new k(this);
                int i = this.f4535a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                kVar.e = this.f4536b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                kVar.f = this.f4537c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                kVar.g = this.f4538d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                kVar.h = this.e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                kVar.i = this.f;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                kVar.j = this.g;
                if ((i & 64) == 64) {
                    i2 |= 64;
                }
                kVar.k = this.h;
                if ((i & 128) == 128) {
                    i2 |= 128;
                }
                kVar.l = this.i;
                if ((i & 256) == 256) {
                    i2 |= 256;
                }
                kVar.m = this.j;
                if ((i & 512) == 512) {
                    i2 |= 512;
                }
                if (this.l == null) {
                    kVar.n = this.k;
                } else {
                    kVar.n = this.l.c();
                }
                kVar.f4534d = i2;
                u();
                return kVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof k) {
                    return a((k) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(k kVar) {
                if (kVar == k.z()) {
                    return this;
                }
                if (kVar.c()) {
                    this.f4535a |= 1;
                    this.f4536b = kVar.e;
                    x();
                }
                if (kVar.e()) {
                    a(kVar.f());
                }
                if (kVar.g()) {
                    a(kVar.h());
                }
                if (kVar.i()) {
                    a(kVar.j());
                }
                if (kVar.k()) {
                    this.f4535a |= 16;
                    this.f = kVar.i;
                    x();
                }
                if (kVar.m()) {
                    this.f4535a |= 32;
                    this.g = kVar.j;
                    x();
                }
                if (kVar.o()) {
                    this.f4535a |= 64;
                    this.h = kVar.k;
                    x();
                }
                if (kVar.q()) {
                    b(kVar.r());
                }
                if (kVar.s()) {
                    this.f4535a |= 256;
                    this.j = kVar.m;
                    x();
                }
                if (kVar.u()) {
                    a(kVar.v());
                }
                d(kVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return !j() || k().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.k.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$k> r1 = com.google.protobuf.i.k.f4533a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$k r3 = (com.google.protobuf.i.k) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$k r4 = (com.google.protobuf.i.k) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.k.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$k$a");
            }

            public a a(int i) {
                this.f4535a |= 2;
                this.f4537c = i;
                x();
                return this;
            }

            public a a(b bVar) {
                if (bVar == null) {
                    throw new NullPointerException();
                }
                this.f4535a |= 4;
                this.f4538d = bVar.a();
                x();
                return this;
            }

            public a a(c cVar) {
                if (cVar == null) {
                    throw new NullPointerException();
                }
                this.f4535a |= 8;
                this.e = cVar.a();
                x();
                return this;
            }

            public a b(int i) {
                this.f4535a |= 128;
                this.i = i;
                x();
                return this;
            }

            public boolean j() {
                return (this.f4535a & 512) == 512;
            }

            public m k() {
                if (this.l == null) {
                    return this.k == null ? m.t() : this.k;
                }
                return this.l.b();
            }

            public a a(m mVar) {
                if (this.l == null) {
                    if ((this.f4535a & 512) == 512 && this.k != null && this.k != m.t()) {
                        this.k = m.a(this.k).a(mVar).r();
                    } else {
                        this.k = mVar;
                    }
                    x();
                } else {
                    this.l.b(mVar);
                }
                this.f4535a |= 512;
                return this;
            }

            private an<m, m.a, n> m() {
                if (this.l == null) {
                    this.l = new an<>(k(), w(), v());
                    this.k = null;
                }
                return this.l;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static k z() {
            return p;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<k> getParserForType() {
            return f4533a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: A */
        public k F() {
            return p;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class y extends com.google.protobuf.s implements z {

        /* renamed from: d  reason: collision with root package name */
        private int f4600d;
        private volatile Object e;
        private aa f;
        private byte g;
        private static final y h = new y();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<y> f4599a = new com.google.protobuf.c<y>() { // from class: com.google.protobuf.i.y.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public y d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new y(gVar, pVar);
            }
        };

        private y(s.a<?> aVar) {
            super(aVar);
            this.g = (byte) -1;
        }

        private y() {
            this.g = (byte) -1;
            this.e = "";
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        private y(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 == 10) {
                                com.google.protobuf.f l = gVar.l();
                                this.f4600d = 1 | this.f4600d;
                                this.e = l;
                            } else if (a3 != 18) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                aa.a D = (this.f4600d & 2) == 2 ? this.f.D() : null;
                                this.f = (aa) gVar.a(aa.f4470a, pVar);
                                if (D != null) {
                                    D.a(this.f);
                                    this.f = D.r();
                                }
                                this.f4600d |= 2;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.m;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.n.a(y.class, a.class);
        }

        public boolean c() {
            return (this.f4600d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public boolean e() {
            return (this.f4600d & 2) == 2;
        }

        public aa f() {
            return this.f == null ? aa.h() : this.f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.g;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (e() && !f().isInitialized()) {
                this.g = (byte) 0;
                return false;
            }
            this.g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4600d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            if ((this.f4600d & 2) == 2) {
                hVar.a(2, f());
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f4600d & 1) == 1) {
                i2 = 0 + com.google.protobuf.s.a(1, this.e);
            }
            if ((this.f4600d & 2) == 2) {
                i2 += com.google.protobuf.h.c(2, f());
            }
            int serializedSize = i2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return super.equals(obj);
            }
            y yVar = (y) obj;
            boolean z = c() == yVar.c();
            if (c()) {
                z = z && d().equals(yVar.d());
            }
            boolean z2 = z && e() == yVar.e();
            if (e()) {
                z2 = z2 && f().equals(yVar.f());
            }
            return z2 && this.f4720c.equals(yVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: g */
        public a C() {
            return h();
        }

        public static a h() {
            return h.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: i */
        public a D() {
            return this == h ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements z {

            /* renamed from: a  reason: collision with root package name */
            private int f4601a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4602b;

            /* renamed from: c  reason: collision with root package name */
            private aa f4603c;

            /* renamed from: d  reason: collision with root package name */
            private an<aa, aa.a, ab> f4604d;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.n.a(y.class, a.class);
            }

            private a() {
                this.f4602b = "";
                this.f4603c = null;
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4602b = "";
                this.f4603c = null;
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    m();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.m;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public y F() {
                return y.j();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public y t() {
                y r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public y r() {
                y yVar = new y(this);
                int i = this.f4601a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                yVar.e = this.f4602b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                if (this.f4604d == null) {
                    yVar.f = this.f4603c;
                } else {
                    yVar.f = this.f4604d.c();
                }
                yVar.f4600d = i2;
                u();
                return yVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof y) {
                    return a((y) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(y yVar) {
                if (yVar == y.j()) {
                    return this;
                }
                if (yVar.c()) {
                    this.f4601a |= 1;
                    this.f4602b = yVar.e;
                    x();
                }
                if (yVar.e()) {
                    a(yVar.f());
                }
                d(yVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return !j() || k().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.y.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$y> r1 = com.google.protobuf.i.y.f4599a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$y r3 = (com.google.protobuf.i.y) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$y r4 = (com.google.protobuf.i.y) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.y.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$y$a");
            }

            public boolean j() {
                return (this.f4601a & 2) == 2;
            }

            public aa k() {
                if (this.f4604d == null) {
                    return this.f4603c == null ? aa.h() : this.f4603c;
                }
                return this.f4604d.b();
            }

            public a a(aa aaVar) {
                if (this.f4604d == null) {
                    if ((this.f4601a & 2) == 2 && this.f4603c != null && this.f4603c != aa.h()) {
                        this.f4603c = aa.a(this.f4603c).a(aaVar).r();
                    } else {
                        this.f4603c = aaVar;
                    }
                    x();
                } else {
                    this.f4604d.b(aaVar);
                }
                this.f4601a |= 2;
                return this;
            }

            private an<aa, aa.a, ab> m() {
                if (this.f4604d == null) {
                    this.f4604d = new an<>(k(), w(), v());
                    this.f4603c = null;
                }
                return this.f4604d;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static y j() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<y> getParserForType() {
            return f4599a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public y F() {
            return h;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.s implements d {

        /* renamed from: d  reason: collision with root package name */
        private int f4510d;
        private volatile Object e;
        private List<g> f;
        private e g;
        private byte h;
        private static final c i = new c();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<c> f4509a = new com.google.protobuf.c<c>() { // from class: com.google.protobuf.i.c.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public c d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new c(gVar, pVar);
            }
        };

        private c(s.a<?> aVar) {
            super(aVar);
            this.h = (byte) -1;
        }

        private c() {
            this.h = (byte) -1;
            this.e = "";
            this.f = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private c(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 == 10) {
                                com.google.protobuf.f l = gVar.l();
                                this.f4510d = 1 | this.f4510d;
                                this.e = l;
                            } else if (a3 == 18) {
                                if (!(z2 & true)) {
                                    this.f = new ArrayList();
                                    z2 |= true;
                                }
                                this.f.add(gVar.a(g.f4521a, pVar));
                            } else if (a3 != 26) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                e.a D = (this.f4510d & 2) == 2 ? this.g.D() : null;
                                this.g = (e) gVar.a(e.f4515a, pVar);
                                if (D != null) {
                                    D.a(this.g);
                                    this.g = D.r();
                                }
                                this.f4510d |= 2;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.o;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.p.a(c.class, a.class);
        }

        public boolean c() {
            return (this.f4510d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public List<g> e() {
            return this.f;
        }

        public int f() {
            return this.f.size();
        }

        public g a(int i2) {
            return this.f.get(i2);
        }

        public boolean g() {
            return (this.f4510d & 2) == 2;
        }

        public e h() {
            return this.g == null ? e.l() : this.g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < f(); i2++) {
                if (!a(i2).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            if (g() && !h().isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4510d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                hVar.a(2, this.f.get(i2));
            }
            if ((this.f4510d & 2) == 2) {
                hVar.a(3, h());
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            int a2 = (this.f4510d & 1) == 1 ? com.google.protobuf.s.a(1, this.e) + 0 : 0;
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                a2 += com.google.protobuf.h.c(2, this.f.get(i3));
            }
            if ((this.f4510d & 2) == 2) {
                a2 += com.google.protobuf.h.c(3, h());
            }
            int serializedSize = a2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            boolean z = c() == cVar.c();
            if (c()) {
                z = z && d().equals(cVar.d());
            }
            boolean z2 = (z && e().equals(cVar.e())) && g() == cVar.g();
            if (g()) {
                z2 = z2 && h().equals(cVar.h());
            }
            return z2 && this.f4720c.equals(cVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (f() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public a C() {
            return j();
        }

        public static a j() {
            return i.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public a D() {
            return this == i ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements d {

            /* renamed from: a  reason: collision with root package name */
            private int f4511a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4512b;

            /* renamed from: c  reason: collision with root package name */
            private List<g> f4513c;

            /* renamed from: d  reason: collision with root package name */
            private am<g, g.a, h> f4514d;
            private e e;
            private an<e, e.a, f> f;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.p.a(c.class, a.class);
            }

            private a() {
                this.f4512b = "";
                this.f4513c = Collections.emptyList();
                this.e = null;
                m();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4512b = "";
                this.f4513c = Collections.emptyList();
                this.e = null;
                m();
            }

            private void m() {
                if (com.google.protobuf.s.f4719b) {
                    o();
                    p();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.o;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public c F() {
                return c.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public c t() {
                c r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public c r() {
                c cVar = new c(this);
                int i = this.f4511a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.e = this.f4512b;
                if (this.f4514d != null) {
                    cVar.f = this.f4514d.e();
                } else {
                    if ((this.f4511a & 2) == 2) {
                        this.f4513c = Collections.unmodifiableList(this.f4513c);
                        this.f4511a &= -3;
                    }
                    cVar.f = this.f4513c;
                }
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                if (this.f == null) {
                    cVar.g = this.e;
                } else {
                    cVar.g = this.f.c();
                }
                cVar.f4510d = i2;
                u();
                return cVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof c) {
                    return a((c) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(c cVar) {
                if (cVar == c.l()) {
                    return this;
                }
                if (cVar.c()) {
                    this.f4511a |= 1;
                    this.f4512b = cVar.e;
                    x();
                }
                if (this.f4514d == null) {
                    if (!cVar.f.isEmpty()) {
                        if (this.f4513c.isEmpty()) {
                            this.f4513c = cVar.f;
                            this.f4511a &= -3;
                        } else {
                            n();
                            this.f4513c.addAll(cVar.f);
                        }
                        x();
                    }
                } else if (!cVar.f.isEmpty()) {
                    if (!this.f4514d.d()) {
                        this.f4514d.a(cVar.f);
                    } else {
                        this.f4514d.b();
                        am<g, g.a, h> amVar = null;
                        this.f4514d = null;
                        this.f4513c = cVar.f;
                        this.f4511a &= -3;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = o();
                        }
                        this.f4514d = amVar;
                    }
                }
                if (cVar.g()) {
                    a(cVar.h());
                }
                d(cVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return !k() || l().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.c.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$c> r1 = com.google.protobuf.i.c.f4509a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$c r3 = (com.google.protobuf.i.c) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$c r4 = (com.google.protobuf.i.c) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.c.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$c$a");
            }

            private void n() {
                if ((this.f4511a & 2) != 2) {
                    this.f4513c = new ArrayList(this.f4513c);
                    this.f4511a |= 2;
                }
            }

            public int j() {
                if (this.f4514d == null) {
                    return this.f4513c.size();
                }
                return this.f4514d.c();
            }

            public g a(int i) {
                if (this.f4514d == null) {
                    return this.f4513c.get(i);
                }
                return this.f4514d.a(i);
            }

            private am<g, g.a, h> o() {
                if (this.f4514d == null) {
                    this.f4514d = new am<>(this.f4513c, (this.f4511a & 2) == 2, w(), v());
                    this.f4513c = null;
                }
                return this.f4514d;
            }

            public boolean k() {
                return (this.f4511a & 4) == 4;
            }

            public e l() {
                if (this.f == null) {
                    return this.e == null ? e.l() : this.e;
                }
                return this.f.b();
            }

            public a a(e eVar) {
                if (this.f == null) {
                    if ((this.f4511a & 4) == 4 && this.e != null && this.e != e.l()) {
                        this.e = e.a(this.e).a(eVar).r();
                    } else {
                        this.e = eVar;
                    }
                    x();
                } else {
                    this.f.b(eVar);
                }
                this.f4511a |= 4;
                return this;
            }

            private an<e, e.a, f> p() {
                if (this.f == null) {
                    this.f = new an<>(l(), w(), v());
                    this.e = null;
                }
                return this.f;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static c l() {
            return i;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<c> getParserForType() {
            return f4509a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public c F() {
            return i;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class g extends com.google.protobuf.s implements h {

        /* renamed from: d  reason: collision with root package name */
        private int f4522d;
        private volatile Object e;
        private int f;
        private C0084i g;
        private byte h;
        private static final g i = new g();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<g> f4521a = new com.google.protobuf.c<g>() { // from class: com.google.protobuf.i.g.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public g d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new g(gVar, pVar);
            }
        };

        private g(s.a<?> aVar) {
            super(aVar);
            this.h = (byte) -1;
        }

        private g() {
            this.h = (byte) -1;
            this.e = "";
            this.f = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        private g(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 10) {
                                    com.google.protobuf.f l = gVar.l();
                                    this.f4522d = 1 | this.f4522d;
                                    this.e = l;
                                } else if (a3 == 16) {
                                    this.f4522d |= 2;
                                    this.f = gVar.f();
                                } else if (a3 != 26) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    C0084i.a D = (this.f4522d & 4) == 4 ? this.g.D() : null;
                                    this.g = (C0084i) gVar.a(C0084i.f4527a, pVar);
                                    if (D != null) {
                                        D.a(this.g);
                                        this.g = D.r();
                                    }
                                    this.f4522d |= 4;
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.q;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.r.a(g.class, a.class);
        }

        public boolean c() {
            return (this.f4522d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public boolean e() {
            return (this.f4522d & 2) == 2;
        }

        public int f() {
            return this.f;
        }

        public boolean g() {
            return (this.f4522d & 4) == 4;
        }

        public C0084i h() {
            return this.g == null ? C0084i.j() : this.g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (g() && !h().isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4522d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            if ((this.f4522d & 2) == 2) {
                hVar.b(2, this.f);
            }
            if ((this.f4522d & 4) == 4) {
                hVar.a(3, h());
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f4522d & 1) == 1) {
                i3 = 0 + com.google.protobuf.s.a(1, this.e);
            }
            if ((this.f4522d & 2) == 2) {
                i3 += com.google.protobuf.h.f(2, this.f);
            }
            if ((this.f4522d & 4) == 4) {
                i3 += com.google.protobuf.h.c(3, h());
            }
            int serializedSize = i3 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return super.equals(obj);
            }
            g gVar = (g) obj;
            boolean z = c() == gVar.c();
            if (c()) {
                z = z && d().equals(gVar.d());
            }
            boolean z2 = z && e() == gVar.e();
            if (e()) {
                z2 = z2 && f() == gVar.f();
            }
            boolean z3 = z2 && g() == gVar.g();
            if (g()) {
                z3 = z3 && h().equals(gVar.h());
            }
            return z3 && this.f4720c.equals(gVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + f();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public a C() {
            return j();
        }

        public static a j() {
            return i.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public a D() {
            return this == i ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements h {

            /* renamed from: a  reason: collision with root package name */
            private int f4523a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4524b;

            /* renamed from: c  reason: collision with root package name */
            private int f4525c;

            /* renamed from: d  reason: collision with root package name */
            private C0084i f4526d;
            private an<C0084i, C0084i.a, j> e;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.r.a(g.class, a.class);
            }

            private a() {
                this.f4524b = "";
                this.f4526d = null;
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4524b = "";
                this.f4526d = null;
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    m();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.q;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public g F() {
                return g.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public g t() {
                g r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public g r() {
                g gVar = new g(this);
                int i = this.f4523a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                gVar.e = this.f4524b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                gVar.f = this.f4525c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                if (this.e == null) {
                    gVar.g = this.f4526d;
                } else {
                    gVar.g = this.e.c();
                }
                gVar.f4522d = i2;
                u();
                return gVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof g) {
                    return a((g) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(g gVar) {
                if (gVar == g.l()) {
                    return this;
                }
                if (gVar.c()) {
                    this.f4523a |= 1;
                    this.f4524b = gVar.e;
                    x();
                }
                if (gVar.e()) {
                    a(gVar.f());
                }
                if (gVar.g()) {
                    a(gVar.h());
                }
                d(gVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return !j() || k().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.g.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$g> r1 = com.google.protobuf.i.g.f4521a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$g r3 = (com.google.protobuf.i.g) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$g r4 = (com.google.protobuf.i.g) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.g.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$g$a");
            }

            public a a(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.f4523a |= 1;
                this.f4524b = str;
                x();
                return this;
            }

            public a a(int i) {
                this.f4523a |= 2;
                this.f4525c = i;
                x();
                return this;
            }

            public boolean j() {
                return (this.f4523a & 4) == 4;
            }

            public C0084i k() {
                if (this.e == null) {
                    return this.f4526d == null ? C0084i.j() : this.f4526d;
                }
                return this.e.b();
            }

            public a a(C0084i c0084i) {
                if (this.e == null) {
                    if ((this.f4523a & 4) == 4 && this.f4526d != null && this.f4526d != C0084i.j()) {
                        this.f4526d = C0084i.a(this.f4526d).a(c0084i).r();
                    } else {
                        this.f4526d = c0084i;
                    }
                    x();
                } else {
                    this.e.b(c0084i);
                }
                this.f4523a |= 4;
                return this;
            }

            private an<C0084i, C0084i.a, j> m() {
                if (this.e == null) {
                    this.e = new an<>(k(), w(), v());
                    this.f4526d = null;
                }
                return this.e;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static g l() {
            return i;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<g> getParserForType() {
            return f4521a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public g F() {
            return i;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class ac extends com.google.protobuf.s implements ad {

        /* renamed from: d  reason: collision with root package name */
        private int f4476d;
        private volatile Object e;
        private List<u> f;
        private ae g;
        private byte h;
        private static final ac i = new ac();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<ac> f4475a = new com.google.protobuf.c<ac>() { // from class: com.google.protobuf.i.ac.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ac d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ac(gVar, pVar);
            }
        };

        private ac(s.a<?> aVar) {
            super(aVar);
            this.h = (byte) -1;
        }

        private ac() {
            this.h = (byte) -1;
            this.e = "";
            this.f = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ac(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 == 10) {
                                com.google.protobuf.f l = gVar.l();
                                this.f4476d = 1 | this.f4476d;
                                this.e = l;
                            } else if (a3 == 18) {
                                if (!(z2 & true)) {
                                    this.f = new ArrayList();
                                    z2 |= true;
                                }
                                this.f.add(gVar.a(u.f4583a, pVar));
                            } else if (a3 != 26) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                ae.a D = (this.f4476d & 2) == 2 ? this.g.D() : null;
                                this.g = (ae) gVar.a(ae.f4481a, pVar);
                                if (D != null) {
                                    D.a(this.g);
                                    this.g = D.r();
                                }
                                this.f4476d |= 2;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.s;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.t.a(ac.class, a.class);
        }

        public boolean c() {
            return (this.f4476d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public List<u> e() {
            return this.f;
        }

        public int f() {
            return this.f.size();
        }

        public u a(int i2) {
            return this.f.get(i2);
        }

        public boolean g() {
            return (this.f4476d & 2) == 2;
        }

        public ae h() {
            return this.g == null ? ae.j() : this.g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < f(); i2++) {
                if (!a(i2).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            if (g() && !h().isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4476d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                hVar.a(2, this.f.get(i2));
            }
            if ((this.f4476d & 2) == 2) {
                hVar.a(3, h());
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            int a2 = (this.f4476d & 1) == 1 ? com.google.protobuf.s.a(1, this.e) + 0 : 0;
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                a2 += com.google.protobuf.h.c(2, this.f.get(i3));
            }
            if ((this.f4476d & 2) == 2) {
                a2 += com.google.protobuf.h.c(3, h());
            }
            int serializedSize = a2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ac)) {
                return super.equals(obj);
            }
            ac acVar = (ac) obj;
            boolean z = c() == acVar.c();
            if (c()) {
                z = z && d().equals(acVar.d());
            }
            boolean z2 = (z && e().equals(acVar.e())) && g() == acVar.g();
            if (g()) {
                z2 = z2 && h().equals(acVar.h());
            }
            return z2 && this.f4720c.equals(acVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (f() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public a C() {
            return j();
        }

        public static a j() {
            return i.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public a D() {
            return this == i ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements ad {

            /* renamed from: a  reason: collision with root package name */
            private int f4477a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4478b;

            /* renamed from: c  reason: collision with root package name */
            private List<u> f4479c;

            /* renamed from: d  reason: collision with root package name */
            private am<u, u.a, v> f4480d;
            private ae e;
            private an<ae, ae.a, af> f;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.t.a(ac.class, a.class);
            }

            private a() {
                this.f4478b = "";
                this.f4479c = Collections.emptyList();
                this.e = null;
                m();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4478b = "";
                this.f4479c = Collections.emptyList();
                this.e = null;
                m();
            }

            private void m() {
                if (com.google.protobuf.s.f4719b) {
                    o();
                    p();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.s;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ac F() {
                return ac.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ac t() {
                ac r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ac r() {
                ac acVar = new ac(this);
                int i = this.f4477a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                acVar.e = this.f4478b;
                if (this.f4480d != null) {
                    acVar.f = this.f4480d.e();
                } else {
                    if ((this.f4477a & 2) == 2) {
                        this.f4479c = Collections.unmodifiableList(this.f4479c);
                        this.f4477a &= -3;
                    }
                    acVar.f = this.f4479c;
                }
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                if (this.f == null) {
                    acVar.g = this.e;
                } else {
                    acVar.g = this.f.c();
                }
                acVar.f4476d = i2;
                u();
                return acVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ac) {
                    return a((ac) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(ac acVar) {
                if (acVar == ac.l()) {
                    return this;
                }
                if (acVar.c()) {
                    this.f4477a |= 1;
                    this.f4478b = acVar.e;
                    x();
                }
                if (this.f4480d == null) {
                    if (!acVar.f.isEmpty()) {
                        if (this.f4479c.isEmpty()) {
                            this.f4479c = acVar.f;
                            this.f4477a &= -3;
                        } else {
                            n();
                            this.f4479c.addAll(acVar.f);
                        }
                        x();
                    }
                } else if (!acVar.f.isEmpty()) {
                    if (!this.f4480d.d()) {
                        this.f4480d.a(acVar.f);
                    } else {
                        this.f4480d.b();
                        am<u, u.a, v> amVar = null;
                        this.f4480d = null;
                        this.f4479c = acVar.f;
                        this.f4477a &= -3;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = o();
                        }
                        this.f4480d = amVar;
                    }
                }
                if (acVar.g()) {
                    a(acVar.h());
                }
                d(acVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return !k() || l().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.ac.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$ac> r1 = com.google.protobuf.i.ac.f4475a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$ac r3 = (com.google.protobuf.i.ac) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$ac r4 = (com.google.protobuf.i.ac) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.ac.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$ac$a");
            }

            private void n() {
                if ((this.f4477a & 2) != 2) {
                    this.f4479c = new ArrayList(this.f4479c);
                    this.f4477a |= 2;
                }
            }

            public int j() {
                if (this.f4480d == null) {
                    return this.f4479c.size();
                }
                return this.f4480d.c();
            }

            public u a(int i) {
                if (this.f4480d == null) {
                    return this.f4479c.get(i);
                }
                return this.f4480d.a(i);
            }

            private am<u, u.a, v> o() {
                if (this.f4480d == null) {
                    this.f4480d = new am<>(this.f4479c, (this.f4477a & 2) == 2, w(), v());
                    this.f4479c = null;
                }
                return this.f4480d;
            }

            public boolean k() {
                return (this.f4477a & 4) == 4;
            }

            public ae l() {
                if (this.f == null) {
                    return this.e == null ? ae.j() : this.e;
                }
                return this.f.b();
            }

            public a a(ae aeVar) {
                if (this.f == null) {
                    if ((this.f4477a & 4) == 4 && this.e != null && this.e != ae.j()) {
                        this.e = ae.a(this.e).a(aeVar).r();
                    } else {
                        this.e = aeVar;
                    }
                    x();
                } else {
                    this.f.b(aeVar);
                }
                this.f4477a |= 4;
                return this;
            }

            private an<ae, ae.a, af> p() {
                if (this.f == null) {
                    this.f = new an<>(l(), w(), v());
                    this.e = null;
                }
                return this.f;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static ac l() {
            return i;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ac> getParserForType() {
            return f4475a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public ac F() {
            return i;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class u extends com.google.protobuf.s implements v {

        /* renamed from: d  reason: collision with root package name */
        private int f4584d;
        private volatile Object e;
        private volatile Object f;
        private volatile Object g;
        private w h;
        private boolean i;
        private boolean j;
        private byte k;
        private static final u l = new u();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<u> f4583a = new com.google.protobuf.c<u>() { // from class: com.google.protobuf.i.u.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public u d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new u(gVar, pVar);
            }
        };

        private u(s.a<?> aVar) {
            super(aVar);
            this.k = (byte) -1;
        }

        private u() {
            this.k = (byte) -1;
            this.e = "";
            this.f = "";
            this.g = "";
            this.i = false;
            this.j = false;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        private u(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 10) {
                                    com.google.protobuf.f l2 = gVar.l();
                                    this.f4584d = 1 | this.f4584d;
                                    this.e = l2;
                                } else if (a3 == 18) {
                                    com.google.protobuf.f l3 = gVar.l();
                                    this.f4584d |= 2;
                                    this.f = l3;
                                } else if (a3 == 26) {
                                    com.google.protobuf.f l4 = gVar.l();
                                    this.f4584d |= 4;
                                    this.g = l4;
                                } else if (a3 == 34) {
                                    w.a D = (this.f4584d & 8) == 8 ? this.h.D() : null;
                                    this.h = (w) gVar.a(w.f4589a, pVar);
                                    if (D != null) {
                                        D.a(this.h);
                                        this.h = D.r();
                                    }
                                    this.f4584d |= 8;
                                } else if (a3 == 40) {
                                    this.f4584d |= 16;
                                    this.i = gVar.i();
                                } else if (a3 != 48) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    this.f4584d |= 32;
                                    this.j = gVar.i();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.u;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.v.a(u.class, a.class);
        }

        public boolean c() {
            return (this.f4584d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public boolean e() {
            return (this.f4584d & 2) == 2;
        }

        public String f() {
            Object obj = this.f;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.f = e;
            }
            return e;
        }

        public boolean g() {
            return (this.f4584d & 4) == 4;
        }

        public String h() {
            Object obj = this.g;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.g = e;
            }
            return e;
        }

        public boolean i() {
            return (this.f4584d & 8) == 8;
        }

        public w j() {
            return this.h == null ? w.l() : this.h;
        }

        public boolean k() {
            return (this.f4584d & 16) == 16;
        }

        public boolean l() {
            return this.i;
        }

        public boolean m() {
            return (this.f4584d & 32) == 32;
        }

        public boolean n() {
            return this.j;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.k;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (i() && !j().isInitialized()) {
                this.k = (byte) 0;
                return false;
            }
            this.k = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if ((this.f4584d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            if ((this.f4584d & 2) == 2) {
                com.google.protobuf.s.a(hVar, 2, this.f);
            }
            if ((this.f4584d & 4) == 4) {
                com.google.protobuf.s.a(hVar, 3, this.g);
            }
            if ((this.f4584d & 8) == 8) {
                hVar.a(4, j());
            }
            if ((this.f4584d & 16) == 16) {
                hVar.a(5, this.i);
            }
            if ((this.f4584d & 32) == 32) {
                hVar.a(6, this.j);
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f4584d & 1) == 1) {
                i2 = 0 + com.google.protobuf.s.a(1, this.e);
            }
            if ((this.f4584d & 2) == 2) {
                i2 += com.google.protobuf.s.a(2, this.f);
            }
            if ((this.f4584d & 4) == 4) {
                i2 += com.google.protobuf.s.a(3, this.g);
            }
            if ((this.f4584d & 8) == 8) {
                i2 += com.google.protobuf.h.c(4, j());
            }
            if ((this.f4584d & 16) == 16) {
                i2 += com.google.protobuf.h.b(5, this.i);
            }
            if ((this.f4584d & 32) == 32) {
                i2 += com.google.protobuf.h.b(6, this.j);
            }
            int serializedSize = i2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return super.equals(obj);
            }
            u uVar = (u) obj;
            boolean z = c() == uVar.c();
            if (c()) {
                z = z && d().equals(uVar.d());
            }
            boolean z2 = z && e() == uVar.e();
            if (e()) {
                z2 = z2 && f().equals(uVar.f());
            }
            boolean z3 = z2 && g() == uVar.g();
            if (g()) {
                z3 = z3 && h().equals(uVar.h());
            }
            boolean z4 = z3 && i() == uVar.i();
            if (i()) {
                z4 = z4 && j().equals(uVar.j());
            }
            boolean z5 = z4 && k() == uVar.k();
            if (k()) {
                z5 = z5 && l() == uVar.l();
            }
            boolean z6 = z5 && m() == uVar.m();
            if (m()) {
                z6 = z6 && n() == uVar.n();
            }
            return z6 && this.f4720c.equals(uVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
            }
            if (i()) {
                hashCode = (((hashCode * 37) + 4) * 53) + j().hashCode();
            }
            if (k()) {
                hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.t.a(l());
            }
            if (m()) {
                hashCode = (((hashCode * 37) + 6) * 53) + com.google.protobuf.t.a(n());
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: o */
        public a C() {
            return p();
        }

        public static a p() {
            return l.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: q */
        public a D() {
            return this == l ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements v {

            /* renamed from: a  reason: collision with root package name */
            private int f4585a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4586b;

            /* renamed from: c  reason: collision with root package name */
            private Object f4587c;

            /* renamed from: d  reason: collision with root package name */
            private Object f4588d;
            private w e;
            private an<w, w.a, x> f;
            private boolean g;
            private boolean h;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.v.a(u.class, a.class);
            }

            private a() {
                this.f4586b = "";
                this.f4587c = "";
                this.f4588d = "";
                this.e = null;
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4586b = "";
                this.f4587c = "";
                this.f4588d = "";
                this.e = null;
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    m();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.u;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public u F() {
                return u.r();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public u t() {
                u r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public u r() {
                u uVar = new u(this);
                int i = this.f4585a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                uVar.e = this.f4586b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                uVar.f = this.f4587c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                uVar.g = this.f4588d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                if (this.f == null) {
                    uVar.h = this.e;
                } else {
                    uVar.h = this.f.c();
                }
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                uVar.i = this.g;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                uVar.j = this.h;
                uVar.f4584d = i2;
                u();
                return uVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof u) {
                    return a((u) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(u uVar) {
                if (uVar == u.r()) {
                    return this;
                }
                if (uVar.c()) {
                    this.f4585a |= 1;
                    this.f4586b = uVar.e;
                    x();
                }
                if (uVar.e()) {
                    this.f4585a |= 2;
                    this.f4587c = uVar.f;
                    x();
                }
                if (uVar.g()) {
                    this.f4585a |= 4;
                    this.f4588d = uVar.g;
                    x();
                }
                if (uVar.i()) {
                    a(uVar.j());
                }
                if (uVar.k()) {
                    a(uVar.l());
                }
                if (uVar.m()) {
                    b(uVar.n());
                }
                d(uVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return !j() || k().isInitialized();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.u.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$u> r1 = com.google.protobuf.i.u.f4583a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$u r3 = (com.google.protobuf.i.u) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$u r4 = (com.google.protobuf.i.u) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.u.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$u$a");
            }

            public boolean j() {
                return (this.f4585a & 8) == 8;
            }

            public w k() {
                if (this.f == null) {
                    return this.e == null ? w.l() : this.e;
                }
                return this.f.b();
            }

            public a a(w wVar) {
                if (this.f == null) {
                    if ((this.f4585a & 8) == 8 && this.e != null && this.e != w.l()) {
                        this.e = w.a(this.e).a(wVar).r();
                    } else {
                        this.e = wVar;
                    }
                    x();
                } else {
                    this.f.b(wVar);
                }
                this.f4585a |= 8;
                return this;
            }

            private an<w, w.a, x> m() {
                if (this.f == null) {
                    this.f = new an<>(k(), w(), v());
                    this.e = null;
                }
                return this.f;
            }

            public a a(boolean z) {
                this.f4585a |= 16;
                this.g = z;
                x();
                return this;
            }

            public a b(boolean z) {
                this.f4585a |= 32;
                this.h = z;
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static u r() {
            return l;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<u> getParserForType() {
            return f4583a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: s */
        public u F() {
            return l;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class q extends s.d<q> implements r {

        /* renamed from: d  reason: collision with root package name */
        private int f4568d;
        private volatile Object e;
        private volatile Object f;
        private boolean g;
        private boolean h;
        private boolean i;
        private int j;
        private volatile Object k;
        private boolean l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        private volatile Object q;
        private volatile Object r;
        private volatile Object s;
        private volatile Object t;
        private List<ai> u;
        private byte v;
        private static final q w = new q();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<q> f4567a = new com.google.protobuf.c<q>() { // from class: com.google.protobuf.i.q.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public q d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new q(gVar, pVar);
            }
        };

        private q(s.c<q, ?> cVar) {
            super(cVar);
            this.v = (byte) -1;
        }

        private q() {
            this.v = (byte) -1;
            this.e = "";
            this.f = "";
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = 1;
            this.k = "";
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = "";
            this.r = "";
            this.s = "";
            this.t = "";
            this.u = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private q(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!z) {
                    try {
                        try {
                            try {
                                int a3 = gVar.a();
                                switch (a3) {
                                    case 0:
                                        break;
                                    case 10:
                                        com.google.protobuf.f l = gVar.l();
                                        this.f4568d = 1 | this.f4568d;
                                        this.e = l;
                                        continue;
                                    case 66:
                                        com.google.protobuf.f l2 = gVar.l();
                                        this.f4568d |= 2;
                                        this.f = l2;
                                        continue;
                                    case 72:
                                        int n = gVar.n();
                                        if (b.a(n) == null) {
                                            a2.a(9, n);
                                        } else {
                                            this.f4568d |= 32;
                                            this.j = n;
                                            continue;
                                        }
                                    case 80:
                                        this.f4568d |= 4;
                                        this.g = gVar.i();
                                        continue;
                                    case 90:
                                        com.google.protobuf.f l3 = gVar.l();
                                        this.f4568d |= 64;
                                        this.k = l3;
                                        continue;
                                    case 128:
                                        this.f4568d |= 128;
                                        this.l = gVar.i();
                                        continue;
                                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                                        this.f4568d |= 256;
                                        this.m = gVar.i();
                                        continue;
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /* 144 */:
                                        this.f4568d |= 512;
                                        this.n = gVar.i();
                                        continue;
                                    case CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256 /* 160 */:
                                        this.f4568d |= 8;
                                        this.h = gVar.i();
                                        continue;
                                    case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                                        this.f4568d |= 1024;
                                        this.o = gVar.i();
                                        continue;
                                    case 216:
                                        this.f4568d |= 16;
                                        this.i = gVar.i();
                                        continue;
                                    case 248:
                                        this.f4568d |= 2048;
                                        this.p = gVar.i();
                                        continue;
                                    case 290:
                                        com.google.protobuf.f l4 = gVar.l();
                                        this.f4568d |= 4096;
                                        this.q = l4;
                                        continue;
                                    case 298:
                                        com.google.protobuf.f l5 = gVar.l();
                                        this.f4568d |= PKIFailureInfo.certRevoked;
                                        this.r = l5;
                                        continue;
                                    case 314:
                                        com.google.protobuf.f l6 = gVar.l();
                                        this.f4568d |= 16384;
                                        this.s = l6;
                                        continue;
                                    case 322:
                                        com.google.protobuf.f l7 = gVar.l();
                                        this.f4568d |= 32768;
                                        this.t = l7;
                                        continue;
                                    case 7994:
                                        if ((i & PKIFailureInfo.notAuthorized) != 65536) {
                                            this.u = new ArrayList();
                                            i |= PKIFailureInfo.notAuthorized;
                                        }
                                        this.u.add(gVar.a(ai.f4498a, pVar));
                                        continue;
                                    default:
                                        if (!a(gVar, a2, pVar, a3)) {
                                            break;
                                        } else {
                                            continue;
                                        }
                                }
                                z = true;
                            } catch (com.google.protobuf.u e) {
                                throw e.a(this);
                            }
                        } catch (IOException e2) {
                            throw new com.google.protobuf.u(e2).a(this);
                        }
                    } finally {
                        if ((i & PKIFailureInfo.notAuthorized) == 65536) {
                            this.u = Collections.unmodifiableList(this.u);
                        }
                        this.f4720c = a2.t();
                        V();
                    }
                } else {
                    return;
                }
            }
        }

        public static final j.a a() {
            return i.w;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.x.a(q.class, a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public enum b implements ak {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);
            

            /* renamed from: d  reason: collision with root package name */
            private static final t.b<b> f4576d = new t.b<b>() { // from class: com.google.protobuf.i.q.b.1
            };
            private static final b[] e = values();
            private final int f;

            @Override // com.google.protobuf.t.a
            public final int a() {
                return this.f;
            }

            @Deprecated
            public static b a(int i) {
                return b(i);
            }

            public static b b(int i) {
                switch (i) {
                    case 1:
                        return SPEED;
                    case 2:
                        return CODE_SIZE;
                    case 3:
                        return LITE_RUNTIME;
                    default:
                        return null;
                }
            }

            b(int i) {
                this.f = i;
            }
        }

        public boolean c() {
            return (this.f4568d & 1) == 1;
        }

        public String d() {
            Object obj = this.e;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.e = e;
            }
            return e;
        }

        public boolean e() {
            return (this.f4568d & 2) == 2;
        }

        public String f() {
            Object obj = this.f;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.f = e;
            }
            return e;
        }

        public boolean g() {
            return (this.f4568d & 4) == 4;
        }

        public boolean h() {
            return this.g;
        }

        @Deprecated
        public boolean i() {
            return (this.f4568d & 8) == 8;
        }

        @Deprecated
        public boolean j() {
            return this.h;
        }

        public boolean k() {
            return (this.f4568d & 16) == 16;
        }

        public boolean l() {
            return this.i;
        }

        public boolean m() {
            return (this.f4568d & 32) == 32;
        }

        public b n() {
            b a2 = b.a(this.j);
            return a2 == null ? b.SPEED : a2;
        }

        public boolean o() {
            return (this.f4568d & 64) == 64;
        }

        public String p() {
            Object obj = this.k;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.k = e;
            }
            return e;
        }

        public boolean q() {
            return (this.f4568d & 128) == 128;
        }

        public boolean r() {
            return this.l;
        }

        public boolean s() {
            return (this.f4568d & 256) == 256;
        }

        public boolean t() {
            return this.m;
        }

        public boolean u() {
            return (this.f4568d & 512) == 512;
        }

        public boolean v() {
            return this.n;
        }

        public boolean w() {
            return (this.f4568d & 1024) == 1024;
        }

        public boolean x() {
            return this.o;
        }

        public boolean y() {
            return (this.f4568d & 2048) == 2048;
        }

        public boolean z() {
            return this.p;
        }

        public boolean A() {
            return (this.f4568d & 4096) == 4096;
        }

        public String G() {
            Object obj = this.q;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.q = e;
            }
            return e;
        }

        public boolean H() {
            return (this.f4568d & PKIFailureInfo.certRevoked) == 8192;
        }

        public String I() {
            Object obj = this.r;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.r = e;
            }
            return e;
        }

        public boolean J() {
            return (this.f4568d & 16384) == 16384;
        }

        public String K() {
            Object obj = this.s;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.s = e;
            }
            return e;
        }

        public boolean L() {
            return (this.f4568d & 32768) == 32768;
        }

        public String M() {
            Object obj = this.t;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.t = e;
            }
            return e;
        }

        public List<ai> N() {
            return this.u;
        }

        public int O() {
            return this.u.size();
        }

        public ai a(int i) {
            return this.u.get(i);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.v;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < O(); i++) {
                if (!a(i).isInitialized()) {
                    this.v = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.v = (byte) 0;
                return false;
            }
            this.v = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4568d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 1, this.e);
            }
            if ((this.f4568d & 2) == 2) {
                com.google.protobuf.s.a(hVar, 8, this.f);
            }
            if ((this.f4568d & 32) == 32) {
                hVar.e(9, this.j);
            }
            if ((this.f4568d & 4) == 4) {
                hVar.a(10, this.g);
            }
            if ((this.f4568d & 64) == 64) {
                com.google.protobuf.s.a(hVar, 11, this.k);
            }
            if ((this.f4568d & 128) == 128) {
                hVar.a(16, this.l);
            }
            if ((this.f4568d & 256) == 256) {
                hVar.a(17, this.m);
            }
            if ((this.f4568d & 512) == 512) {
                hVar.a(18, this.n);
            }
            if ((this.f4568d & 8) == 8) {
                hVar.a(20, this.h);
            }
            if ((this.f4568d & 1024) == 1024) {
                hVar.a(23, this.o);
            }
            if ((this.f4568d & 16) == 16) {
                hVar.a(27, this.i);
            }
            if ((this.f4568d & 2048) == 2048) {
                hVar.a(31, this.p);
            }
            if ((this.f4568d & 4096) == 4096) {
                com.google.protobuf.s.a(hVar, 36, this.q);
            }
            if ((this.f4568d & PKIFailureInfo.certRevoked) == 8192) {
                com.google.protobuf.s.a(hVar, 37, this.r);
            }
            if ((this.f4568d & 16384) == 16384) {
                com.google.protobuf.s.a(hVar, 39, this.s);
            }
            if ((this.f4568d & 32768) == 32768) {
                com.google.protobuf.s.a(hVar, 40, this.t);
            }
            for (int i = 0; i < this.u.size(); i++) {
                hVar.a(999, this.u.get(i));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int a2 = (this.f4568d & 1) == 1 ? com.google.protobuf.s.a(1, this.e) + 0 : 0;
            if ((this.f4568d & 2) == 2) {
                a2 += com.google.protobuf.s.a(8, this.f);
            }
            if ((this.f4568d & 32) == 32) {
                a2 += com.google.protobuf.h.i(9, this.j);
            }
            if ((this.f4568d & 4) == 4) {
                a2 += com.google.protobuf.h.b(10, this.g);
            }
            if ((this.f4568d & 64) == 64) {
                a2 += com.google.protobuf.s.a(11, this.k);
            }
            if ((this.f4568d & 128) == 128) {
                a2 += com.google.protobuf.h.b(16, this.l);
            }
            if ((this.f4568d & 256) == 256) {
                a2 += com.google.protobuf.h.b(17, this.m);
            }
            if ((this.f4568d & 512) == 512) {
                a2 += com.google.protobuf.h.b(18, this.n);
            }
            if ((this.f4568d & 8) == 8) {
                a2 += com.google.protobuf.h.b(20, this.h);
            }
            if ((this.f4568d & 1024) == 1024) {
                a2 += com.google.protobuf.h.b(23, this.o);
            }
            if ((this.f4568d & 16) == 16) {
                a2 += com.google.protobuf.h.b(27, this.i);
            }
            if ((this.f4568d & 2048) == 2048) {
                a2 += com.google.protobuf.h.b(31, this.p);
            }
            if ((this.f4568d & 4096) == 4096) {
                a2 += com.google.protobuf.s.a(36, this.q);
            }
            if ((this.f4568d & PKIFailureInfo.certRevoked) == 8192) {
                a2 += com.google.protobuf.s.a(37, this.r);
            }
            if ((this.f4568d & 16384) == 16384) {
                a2 += com.google.protobuf.s.a(39, this.s);
            }
            if ((this.f4568d & 32768) == 32768) {
                a2 += com.google.protobuf.s.a(40, this.t);
            }
            for (int i2 = 0; i2 < this.u.size(); i2++) {
                a2 += com.google.protobuf.h.c(999, this.u.get(i2));
            }
            int Y = a2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return super.equals(obj);
            }
            q qVar = (q) obj;
            boolean z = c() == qVar.c();
            if (c()) {
                z = z && d().equals(qVar.d());
            }
            boolean z2 = z && e() == qVar.e();
            if (e()) {
                z2 = z2 && f().equals(qVar.f());
            }
            boolean z3 = z2 && g() == qVar.g();
            if (g()) {
                z3 = z3 && h() == qVar.h();
            }
            boolean z4 = z3 && i() == qVar.i();
            if (i()) {
                z4 = z4 && j() == qVar.j();
            }
            boolean z5 = z4 && k() == qVar.k();
            if (k()) {
                z5 = z5 && l() == qVar.l();
            }
            boolean z6 = z5 && m() == qVar.m();
            if (m()) {
                z6 = z6 && this.j == qVar.j;
            }
            boolean z7 = z6 && o() == qVar.o();
            if (o()) {
                z7 = z7 && p().equals(qVar.p());
            }
            boolean z8 = z7 && q() == qVar.q();
            if (q()) {
                z8 = z8 && r() == qVar.r();
            }
            boolean z9 = z8 && s() == qVar.s();
            if (s()) {
                z9 = z9 && t() == qVar.t();
            }
            boolean z10 = z9 && u() == qVar.u();
            if (u()) {
                z10 = z10 && v() == qVar.v();
            }
            boolean z11 = z10 && w() == qVar.w();
            if (w()) {
                z11 = z11 && x() == qVar.x();
            }
            boolean z12 = z11 && y() == qVar.y();
            if (y()) {
                z12 = z12 && z() == qVar.z();
            }
            boolean z13 = z12 && A() == qVar.A();
            if (A()) {
                z13 = z13 && G().equals(qVar.G());
            }
            boolean z14 = z13 && H() == qVar.H();
            if (H()) {
                z14 = z14 && I().equals(qVar.I());
            }
            boolean z15 = z14 && J() == qVar.J();
            if (J()) {
                z15 = z15 && K().equals(qVar.K());
            }
            boolean z16 = z15 && L() == qVar.L();
            if (L()) {
                z16 = z16 && M().equals(qVar.M());
            }
            return ((z16 && N().equals(qVar.N())) && this.f4720c.equals(qVar.f4720c)) && Z().equals(qVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 8) * 53) + f().hashCode();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 10) * 53) + com.google.protobuf.t.a(h());
            }
            if (i()) {
                hashCode = (((hashCode * 37) + 20) * 53) + com.google.protobuf.t.a(j());
            }
            if (k()) {
                hashCode = (((hashCode * 37) + 27) * 53) + com.google.protobuf.t.a(l());
            }
            if (m()) {
                hashCode = (((hashCode * 37) + 9) * 53) + this.j;
            }
            if (o()) {
                hashCode = (((hashCode * 37) + 11) * 53) + p().hashCode();
            }
            if (q()) {
                hashCode = (((hashCode * 37) + 16) * 53) + com.google.protobuf.t.a(r());
            }
            if (s()) {
                hashCode = (((hashCode * 37) + 17) * 53) + com.google.protobuf.t.a(t());
            }
            if (u()) {
                hashCode = (((hashCode * 37) + 18) * 53) + com.google.protobuf.t.a(v());
            }
            if (w()) {
                hashCode = (((hashCode * 37) + 23) * 53) + com.google.protobuf.t.a(x());
            }
            if (y()) {
                hashCode = (((hashCode * 37) + 31) * 53) + com.google.protobuf.t.a(z());
            }
            if (A()) {
                hashCode = (((hashCode * 37) + 36) * 53) + G().hashCode();
            }
            if (H()) {
                hashCode = (((hashCode * 37) + 37) * 53) + I().hashCode();
            }
            if (J()) {
                hashCode = (((hashCode * 37) + 39) * 53) + K().hashCode();
            }
            if (L()) {
                hashCode = (((hashCode * 37) + 40) * 53) + M().hashCode();
            }
            if (O() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + N().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: P */
        public a C() {
            return Q();
        }

        public static a Q() {
            return w.D();
        }

        public static a a(q qVar) {
            return w.D().a(qVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: R */
        public a D() {
            return this == w ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<q, a> implements r {

            /* renamed from: a  reason: collision with root package name */
            private int f4569a;

            /* renamed from: b  reason: collision with root package name */
            private Object f4570b;

            /* renamed from: c  reason: collision with root package name */
            private Object f4571c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f4572d;
            private boolean e;
            private boolean f;
            private int g;
            private Object h;
            private boolean i;
            private boolean j;
            private boolean k;
            private boolean l;
            private boolean m;
            private Object n;
            private Object o;
            private Object p;
            private Object q;
            private List<ai> r;
            private am<ai, ai.a, aj> s;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.x.a(q.class, a.class);
            }

            private a() {
                this.f4570b = "";
                this.f4571c = "";
                this.g = 1;
                this.h = "";
                this.n = "";
                this.o = "";
                this.p = "";
                this.q = "";
                this.r = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4570b = "";
                this.f4571c = "";
                this.g = 1;
                this.h = "";
                this.n = "";
                this.o = "";
                this.p = "";
                this.q = "";
                this.r = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.w;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public q F() {
                return q.S();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public q t() {
                q r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public q r() {
                q qVar = new q(this);
                int i = this.f4569a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                qVar.e = this.f4570b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                qVar.f = this.f4571c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                qVar.g = this.f4572d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                qVar.h = this.e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                qVar.i = this.f;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                qVar.j = this.g;
                if ((i & 64) == 64) {
                    i2 |= 64;
                }
                qVar.k = this.h;
                if ((i & 128) == 128) {
                    i2 |= 128;
                }
                qVar.l = this.i;
                if ((i & 256) == 256) {
                    i2 |= 256;
                }
                qVar.m = this.j;
                if ((i & 512) == 512) {
                    i2 |= 512;
                }
                qVar.n = this.k;
                if ((i & 1024) == 1024) {
                    i2 |= 1024;
                }
                qVar.o = this.l;
                if ((i & 2048) == 2048) {
                    i2 |= 2048;
                }
                qVar.p = this.m;
                if ((i & 4096) == 4096) {
                    i2 |= 4096;
                }
                qVar.q = this.n;
                if ((i & PKIFailureInfo.certRevoked) == 8192) {
                    i2 |= PKIFailureInfo.certRevoked;
                }
                qVar.r = this.o;
                if ((i & 16384) == 16384) {
                    i2 |= 16384;
                }
                qVar.s = this.p;
                if ((i & 32768) == 32768) {
                    i2 |= 32768;
                }
                qVar.t = this.q;
                if (this.s != null) {
                    qVar.u = this.s.e();
                } else {
                    if ((this.f4569a & PKIFailureInfo.notAuthorized) == 65536) {
                        this.r = Collections.unmodifiableList(this.r);
                        this.f4569a &= -65537;
                    }
                    qVar.u = this.r;
                }
                qVar.f4568d = i2;
                u();
                return qVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof q) {
                    return a((q) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(q qVar) {
                if (qVar == q.S()) {
                    return this;
                }
                if (qVar.c()) {
                    this.f4569a |= 1;
                    this.f4570b = qVar.e;
                    x();
                }
                if (qVar.e()) {
                    this.f4569a |= 2;
                    this.f4571c = qVar.f;
                    x();
                }
                if (qVar.g()) {
                    a(qVar.h());
                }
                if (qVar.i()) {
                    b(qVar.j());
                }
                if (qVar.k()) {
                    c(qVar.l());
                }
                if (qVar.m()) {
                    a(qVar.n());
                }
                if (qVar.o()) {
                    this.f4569a |= 64;
                    this.h = qVar.k;
                    x();
                }
                if (qVar.q()) {
                    d(qVar.r());
                }
                if (qVar.s()) {
                    e(qVar.t());
                }
                if (qVar.u()) {
                    f(qVar.v());
                }
                if (qVar.w()) {
                    g(qVar.x());
                }
                if (qVar.y()) {
                    h(qVar.z());
                }
                if (qVar.A()) {
                    this.f4569a |= 4096;
                    this.n = qVar.q;
                    x();
                }
                if (qVar.H()) {
                    this.f4569a |= PKIFailureInfo.certRevoked;
                    this.o = qVar.r;
                    x();
                }
                if (qVar.J()) {
                    this.f4569a |= 16384;
                    this.p = qVar.s;
                    x();
                }
                if (qVar.L()) {
                    this.f4569a |= 32768;
                    this.q = qVar.t;
                    x();
                }
                if (this.s == null) {
                    if (!qVar.u.isEmpty()) {
                        if (this.r.isEmpty()) {
                            this.r = qVar.u;
                            this.f4569a &= -65537;
                        } else {
                            m();
                            this.r.addAll(qVar.u);
                        }
                        x();
                    }
                } else if (!qVar.u.isEmpty()) {
                    if (!this.s.d()) {
                        this.s.a(qVar.u);
                    } else {
                        this.s.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.s = null;
                        this.r = qVar.u;
                        this.f4569a = (-65537) & this.f4569a;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.s = amVar;
                    }
                }
                a((s.d) qVar);
                d(qVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.q.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$q> r1 = com.google.protobuf.i.q.f4567a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$q r3 = (com.google.protobuf.i.q) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$q r4 = (com.google.protobuf.i.q) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.q.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$q$a");
            }

            public a a(boolean z) {
                this.f4569a |= 4;
                this.f4572d = z;
                x();
                return this;
            }

            @Deprecated
            public a b(boolean z) {
                this.f4569a |= 8;
                this.e = z;
                x();
                return this;
            }

            public a c(boolean z) {
                this.f4569a |= 16;
                this.f = z;
                x();
                return this;
            }

            public a a(b bVar) {
                if (bVar == null) {
                    throw new NullPointerException();
                }
                this.f4569a |= 32;
                this.g = bVar.a();
                x();
                return this;
            }

            public a d(boolean z) {
                this.f4569a |= 128;
                this.i = z;
                x();
                return this;
            }

            public a e(boolean z) {
                this.f4569a |= 256;
                this.j = z;
                x();
                return this;
            }

            public a f(boolean z) {
                this.f4569a |= 512;
                this.k = z;
                x();
                return this;
            }

            public a g(boolean z) {
                this.f4569a |= 1024;
                this.l = z;
                x();
                return this;
            }

            public a h(boolean z) {
                this.f4569a |= 2048;
                this.m = z;
                x();
                return this;
            }

            private void m() {
                if ((this.f4569a & PKIFailureInfo.notAuthorized) != 65536) {
                    this.r = new ArrayList(this.r);
                    this.f4569a |= PKIFailureInfo.notAuthorized;
                }
            }

            public int j() {
                if (this.s == null) {
                    return this.r.size();
                }
                return this.s.c();
            }

            public ai a(int i) {
                if (this.s == null) {
                    return this.r.get(i);
                }
                return this.s.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.s == null) {
                    this.s = new am<>(this.r, (this.f4569a & PKIFailureInfo.notAuthorized) == 65536, w(), v());
                    this.r = null;
                }
                return this.s;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static q S() {
            return w;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<q> getParserForType() {
            return f4567a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: T */
        public q F() {
            return w;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class s extends s.d<s> implements t {

        /* renamed from: d  reason: collision with root package name */
        private int f4578d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private List<ai> i;
        private byte j;
        private static final s k = new s();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<s> f4577a = new com.google.protobuf.c<s>() { // from class: com.google.protobuf.i.s.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public s d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new s(gVar, pVar);
            }
        };

        private s(s.c<s, ?> cVar) {
            super(cVar);
            this.j = (byte) -1;
        }

        private s() {
            this.j = (byte) -1;
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private s(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 8) {
                                    this.f4578d |= 1;
                                    this.e = gVar.i();
                                } else if (a3 == 16) {
                                    this.f4578d |= 2;
                                    this.f = gVar.i();
                                } else if (a3 == 24) {
                                    this.f4578d |= 4;
                                    this.g = gVar.i();
                                } else if (a3 == 56) {
                                    this.f4578d |= 8;
                                    this.h = gVar.i();
                                } else if (a3 != 7994) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    if (!(z2 & true)) {
                                        this.i = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.i.add(gVar.a(ai.f4498a, pVar));
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.y;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.z.a(s.class, a.class);
        }

        public boolean c() {
            return (this.f4578d & 1) == 1;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return (this.f4578d & 2) == 2;
        }

        public boolean f() {
            return this.f;
        }

        public boolean g() {
            return (this.f4578d & 4) == 4;
        }

        public boolean h() {
            return this.g;
        }

        public boolean i() {
            return (this.f4578d & 8) == 8;
        }

        public boolean j() {
            return this.h;
        }

        public List<ai> k() {
            return this.i;
        }

        public int l() {
            return this.i.size();
        }

        public ai a(int i) {
            return this.i.get(i);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.j;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < l(); i++) {
                if (!a(i).isInitialized()) {
                    this.j = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.j = (byte) 0;
                return false;
            }
            this.j = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4578d & 1) == 1) {
                hVar.a(1, this.e);
            }
            if ((this.f4578d & 2) == 2) {
                hVar.a(2, this.f);
            }
            if ((this.f4578d & 4) == 4) {
                hVar.a(3, this.g);
            }
            if ((this.f4578d & 8) == 8) {
                hVar.a(7, this.h);
            }
            for (int i = 0; i < this.i.size(); i++) {
                hVar.a(999, this.i.get(i));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int b2 = (this.f4578d & 1) == 1 ? com.google.protobuf.h.b(1, this.e) + 0 : 0;
            if ((this.f4578d & 2) == 2) {
                b2 += com.google.protobuf.h.b(2, this.f);
            }
            if ((this.f4578d & 4) == 4) {
                b2 += com.google.protobuf.h.b(3, this.g);
            }
            if ((this.f4578d & 8) == 8) {
                b2 += com.google.protobuf.h.b(7, this.h);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                b2 += com.google.protobuf.h.c(999, this.i.get(i2));
            }
            int Y = b2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s)) {
                return super.equals(obj);
            }
            s sVar = (s) obj;
            boolean z = c() == sVar.c();
            if (c()) {
                z = z && d() == sVar.d();
            }
            boolean z2 = z && e() == sVar.e();
            if (e()) {
                z2 = z2 && f() == sVar.f();
            }
            boolean z3 = z2 && g() == sVar.g();
            if (g()) {
                z3 = z3 && h() == sVar.h();
            }
            boolean z4 = z3 && i() == sVar.i();
            if (i()) {
                z4 = z4 && j() == sVar.j();
            }
            return ((z4 && k().equals(sVar.k())) && this.f4720c.equals(sVar.f4720c)) && Z().equals(sVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.t.a(d());
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.t.a(f());
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.t.a(h());
            }
            if (i()) {
                hashCode = (((hashCode * 37) + 7) * 53) + com.google.protobuf.t.a(j());
            }
            if (l() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + k().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: m */
        public a C() {
            return n();
        }

        public static a n() {
            return k.D();
        }

        public static a a(s sVar) {
            return k.D().a(sVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: o */
        public a D() {
            return this == k ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<s, a> implements t {

            /* renamed from: a  reason: collision with root package name */
            private int f4579a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f4580b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f4581c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f4582d;
            private boolean e;
            private List<ai> f;
            private am<ai, ai.a, aj> g;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.z.a(s.class, a.class);
            }

            private a() {
                this.f = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.y;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public s F() {
                return s.p();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public s t() {
                s r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public s r() {
                s sVar = new s(this);
                int i = this.f4579a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                sVar.e = this.f4580b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                sVar.f = this.f4581c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                sVar.g = this.f4582d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                sVar.h = this.e;
                if (this.g != null) {
                    sVar.i = this.g.e();
                } else {
                    if ((this.f4579a & 16) == 16) {
                        this.f = Collections.unmodifiableList(this.f);
                        this.f4579a &= -17;
                    }
                    sVar.i = this.f;
                }
                sVar.f4578d = i2;
                u();
                return sVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof s) {
                    return a((s) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(s sVar) {
                if (sVar == s.p()) {
                    return this;
                }
                if (sVar.c()) {
                    a(sVar.d());
                }
                if (sVar.e()) {
                    b(sVar.f());
                }
                if (sVar.g()) {
                    c(sVar.h());
                }
                if (sVar.i()) {
                    d(sVar.j());
                }
                if (this.g == null) {
                    if (!sVar.i.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = sVar.i;
                            this.f4579a &= -17;
                        } else {
                            m();
                            this.f.addAll(sVar.i);
                        }
                        x();
                    }
                } else if (!sVar.i.isEmpty()) {
                    if (!this.g.d()) {
                        this.g.a(sVar.i);
                    } else {
                        this.g.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.g = null;
                        this.f = sVar.i;
                        this.f4579a &= -17;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.g = amVar;
                    }
                }
                a((s.d) sVar);
                d(sVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.s.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$s> r1 = com.google.protobuf.i.s.f4577a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$s r3 = (com.google.protobuf.i.s) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$s r4 = (com.google.protobuf.i.s) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.s.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$s$a");
            }

            public a a(boolean z) {
                this.f4579a |= 1;
                this.f4580b = z;
                x();
                return this;
            }

            public a b(boolean z) {
                this.f4579a |= 2;
                this.f4581c = z;
                x();
                return this;
            }

            public a c(boolean z) {
                this.f4579a |= 4;
                this.f4582d = z;
                x();
                return this;
            }

            public a d(boolean z) {
                this.f4579a |= 8;
                this.e = z;
                x();
                return this;
            }

            private void m() {
                if ((this.f4579a & 16) != 16) {
                    this.f = new ArrayList(this.f);
                    this.f4579a |= 16;
                }
            }

            public int j() {
                if (this.g == null) {
                    return this.f.size();
                }
                return this.g.c();
            }

            public ai a(int i) {
                if (this.g == null) {
                    return this.f.get(i);
                }
                return this.g.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.g == null) {
                    this.g = new am<>(this.f, (this.f4579a & 16) == 16, w(), v());
                    this.f = null;
                }
                return this.g;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static s p() {
            return k;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<s> getParserForType() {
            return f4577a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: q */
        public s F() {
            return k;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class m extends s.d<m> implements n {

        /* renamed from: d  reason: collision with root package name */
        private int f4548d;
        private int e;
        private boolean f;
        private int g;
        private boolean h;
        private boolean i;
        private boolean j;
        private List<ai> k;
        private byte l;
        private static final m m = new m();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<m> f4547a = new com.google.protobuf.c<m>() { // from class: com.google.protobuf.i.m.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public m d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new m(gVar, pVar);
            }
        };

        private m(s.c<m, ?> cVar) {
            super(cVar);
            this.l = (byte) -1;
        }

        private m() {
            this.l = (byte) -1;
            this.e = 0;
            this.f = false;
            this.g = 0;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private m(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 == 8) {
                                int n = gVar.n();
                                if (b.a(n) == null) {
                                    a2.a(1, n);
                                } else {
                                    this.f4548d = 1 | this.f4548d;
                                    this.e = n;
                                }
                            } else if (a3 == 16) {
                                this.f4548d |= 2;
                                this.f = gVar.i();
                            } else if (a3 == 24) {
                                this.f4548d |= 16;
                                this.i = gVar.i();
                            } else if (a3 == 40) {
                                this.f4548d |= 8;
                                this.h = gVar.i();
                            } else if (a3 == 48) {
                                int n2 = gVar.n();
                                if (c.a(n2) == null) {
                                    a2.a(6, n2);
                                } else {
                                    this.f4548d |= 4;
                                    this.g = n2;
                                }
                            } else if (a3 == 80) {
                                this.f4548d |= 32;
                                this.j = gVar.i();
                            } else if (a3 != 7994) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.k = new ArrayList();
                                    z2 |= true;
                                }
                                this.k.add(gVar.a(ai.f4498a, pVar));
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.A;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.B.a(m.class, a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public enum b implements ak {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);
            

            /* renamed from: d  reason: collision with root package name */
            private static final t.b<b> f4556d = new t.b<b>() { // from class: com.google.protobuf.i.m.b.1
            };
            private static final b[] e = values();
            private final int f;

            @Override // com.google.protobuf.t.a
            public final int a() {
                return this.f;
            }

            @Deprecated
            public static b a(int i) {
                return b(i);
            }

            public static b b(int i) {
                switch (i) {
                    case 0:
                        return STRING;
                    case 1:
                        return CORD;
                    case 2:
                        return STRING_PIECE;
                    default:
                        return null;
                }
            }

            b(int i) {
                this.f = i;
            }
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public enum c implements ak {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);
            

            /* renamed from: d  reason: collision with root package name */
            private static final t.b<c> f4560d = new t.b<c>() { // from class: com.google.protobuf.i.m.c.1
            };
            private static final c[] e = values();
            private final int f;

            @Override // com.google.protobuf.t.a
            public final int a() {
                return this.f;
            }

            @Deprecated
            public static c a(int i) {
                return b(i);
            }

            public static c b(int i) {
                switch (i) {
                    case 0:
                        return JS_NORMAL;
                    case 1:
                        return JS_STRING;
                    case 2:
                        return JS_NUMBER;
                    default:
                        return null;
                }
            }

            c(int i) {
                this.f = i;
            }
        }

        public boolean c() {
            return (this.f4548d & 1) == 1;
        }

        public b d() {
            b a2 = b.a(this.e);
            return a2 == null ? b.STRING : a2;
        }

        public boolean e() {
            return (this.f4548d & 2) == 2;
        }

        public boolean f() {
            return this.f;
        }

        public boolean g() {
            return (this.f4548d & 4) == 4;
        }

        public c h() {
            c a2 = c.a(this.g);
            return a2 == null ? c.JS_NORMAL : a2;
        }

        public boolean i() {
            return (this.f4548d & 8) == 8;
        }

        public boolean j() {
            return this.h;
        }

        public boolean k() {
            return (this.f4548d & 16) == 16;
        }

        public boolean l() {
            return this.i;
        }

        public boolean m() {
            return (this.f4548d & 32) == 32;
        }

        public boolean n() {
            return this.j;
        }

        public List<ai> o() {
            return this.k;
        }

        public int p() {
            return this.k.size();
        }

        public ai a(int i) {
            return this.k.get(i);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.l;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < p(); i++) {
                if (!a(i).isInitialized()) {
                    this.l = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.l = (byte) 0;
                return false;
            }
            this.l = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4548d & 1) == 1) {
                hVar.e(1, this.e);
            }
            if ((this.f4548d & 2) == 2) {
                hVar.a(2, this.f);
            }
            if ((this.f4548d & 16) == 16) {
                hVar.a(3, this.i);
            }
            if ((this.f4548d & 8) == 8) {
                hVar.a(5, this.h);
            }
            if ((this.f4548d & 4) == 4) {
                hVar.e(6, this.g);
            }
            if ((this.f4548d & 32) == 32) {
                hVar.a(10, this.j);
            }
            for (int i = 0; i < this.k.size(); i++) {
                hVar.a(999, this.k.get(i));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = (this.f4548d & 1) == 1 ? com.google.protobuf.h.i(1, this.e) + 0 : 0;
            if ((this.f4548d & 2) == 2) {
                i2 += com.google.protobuf.h.b(2, this.f);
            }
            if ((this.f4548d & 16) == 16) {
                i2 += com.google.protobuf.h.b(3, this.i);
            }
            if ((this.f4548d & 8) == 8) {
                i2 += com.google.protobuf.h.b(5, this.h);
            }
            if ((this.f4548d & 4) == 4) {
                i2 += com.google.protobuf.h.i(6, this.g);
            }
            if ((this.f4548d & 32) == 32) {
                i2 += com.google.protobuf.h.b(10, this.j);
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                i2 += com.google.protobuf.h.c(999, this.k.get(i3));
            }
            int Y = i2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return super.equals(obj);
            }
            m mVar = (m) obj;
            boolean z = c() == mVar.c();
            if (c()) {
                z = z && this.e == mVar.e;
            }
            boolean z2 = z && e() == mVar.e();
            if (e()) {
                z2 = z2 && f() == mVar.f();
            }
            boolean z3 = z2 && g() == mVar.g();
            if (g()) {
                z3 = z3 && this.g == mVar.g;
            }
            boolean z4 = z3 && i() == mVar.i();
            if (i()) {
                z4 = z4 && j() == mVar.j();
            }
            boolean z5 = z4 && k() == mVar.k();
            if (k()) {
                z5 = z5 && l() == mVar.l();
            }
            boolean z6 = z5 && m() == mVar.m();
            if (m()) {
                z6 = z6 && n() == mVar.n();
            }
            return ((z6 && o().equals(mVar.o())) && this.f4720c.equals(mVar.f4720c)) && Z().equals(mVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.e;
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.t.a(f());
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 6) * 53) + this.g;
            }
            if (i()) {
                hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.t.a(j());
            }
            if (k()) {
                hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.t.a(l());
            }
            if (m()) {
                hashCode = (((hashCode * 37) + 10) * 53) + com.google.protobuf.t.a(n());
            }
            if (p() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + o().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: q */
        public a C() {
            return r();
        }

        public static a r() {
            return m.D();
        }

        public static a a(m mVar) {
            return m.D().a(mVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: s */
        public a D() {
            return this == m ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<m, a> implements n {

            /* renamed from: a  reason: collision with root package name */
            private int f4549a;

            /* renamed from: b  reason: collision with root package name */
            private int f4550b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f4551c;

            /* renamed from: d  reason: collision with root package name */
            private int f4552d;
            private boolean e;
            private boolean f;
            private boolean g;
            private List<ai> h;
            private am<ai, ai.a, aj> i;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.B.a(m.class, a.class);
            }

            private a() {
                this.f4550b = 0;
                this.f4552d = 0;
                this.h = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4550b = 0;
                this.f4552d = 0;
                this.h = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.A;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public m F() {
                return m.t();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public m t() {
                m r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public m r() {
                m mVar = new m(this);
                int i = this.f4549a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                mVar.e = this.f4550b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                mVar.f = this.f4551c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                mVar.g = this.f4552d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                mVar.h = this.e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                mVar.i = this.f;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                mVar.j = this.g;
                if (this.i != null) {
                    mVar.k = this.i.e();
                } else {
                    if ((this.f4549a & 64) == 64) {
                        this.h = Collections.unmodifiableList(this.h);
                        this.f4549a &= -65;
                    }
                    mVar.k = this.h;
                }
                mVar.f4548d = i2;
                u();
                return mVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof m) {
                    return a((m) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(m mVar) {
                if (mVar == m.t()) {
                    return this;
                }
                if (mVar.c()) {
                    a(mVar.d());
                }
                if (mVar.e()) {
                    a(mVar.f());
                }
                if (mVar.g()) {
                    a(mVar.h());
                }
                if (mVar.i()) {
                    b(mVar.j());
                }
                if (mVar.k()) {
                    c(mVar.l());
                }
                if (mVar.m()) {
                    d(mVar.n());
                }
                if (this.i == null) {
                    if (!mVar.k.isEmpty()) {
                        if (this.h.isEmpty()) {
                            this.h = mVar.k;
                            this.f4549a &= -65;
                        } else {
                            m();
                            this.h.addAll(mVar.k);
                        }
                        x();
                    }
                } else if (!mVar.k.isEmpty()) {
                    if (!this.i.d()) {
                        this.i.a(mVar.k);
                    } else {
                        this.i.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.i = null;
                        this.h = mVar.k;
                        this.f4549a &= -65;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.i = amVar;
                    }
                }
                a((s.d) mVar);
                d(mVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.m.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$m> r1 = com.google.protobuf.i.m.f4547a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$m r3 = (com.google.protobuf.i.m) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$m r4 = (com.google.protobuf.i.m) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.m.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$m$a");
            }

            public a a(b bVar) {
                if (bVar == null) {
                    throw new NullPointerException();
                }
                this.f4549a |= 1;
                this.f4550b = bVar.a();
                x();
                return this;
            }

            public a a(boolean z) {
                this.f4549a |= 2;
                this.f4551c = z;
                x();
                return this;
            }

            public a a(c cVar) {
                if (cVar == null) {
                    throw new NullPointerException();
                }
                this.f4549a |= 4;
                this.f4552d = cVar.a();
                x();
                return this;
            }

            public a b(boolean z) {
                this.f4549a |= 8;
                this.e = z;
                x();
                return this;
            }

            public a c(boolean z) {
                this.f4549a |= 16;
                this.f = z;
                x();
                return this;
            }

            public a d(boolean z) {
                this.f4549a |= 32;
                this.g = z;
                x();
                return this;
            }

            private void m() {
                if ((this.f4549a & 64) != 64) {
                    this.h = new ArrayList(this.h);
                    this.f4549a |= 64;
                }
            }

            public int j() {
                if (this.i == null) {
                    return this.h.size();
                }
                return this.i.c();
            }

            public ai a(int i) {
                if (this.i == null) {
                    return this.h.get(i);
                }
                return this.i.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.i == null) {
                    this.i = new am<>(this.h, (this.f4549a & 64) == 64, w(), v());
                    this.h = null;
                }
                return this.i;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static m t() {
            return m;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<m> getParserForType() {
            return f4547a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: u */
        public m F() {
            return m;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class aa extends s.d<aa> implements ab {

        /* renamed from: d  reason: collision with root package name */
        private List<ai> f4471d;
        private byte e;
        private static final aa f = new aa();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<aa> f4470a = new com.google.protobuf.c<aa>() { // from class: com.google.protobuf.i.aa.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public aa d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new aa(gVar, pVar);
            }
        };

        private aa(s.c<aa, ?> cVar) {
            super(cVar);
            this.e = (byte) -1;
        }

        private aa() {
            this.e = (byte) -1;
            this.f4471d = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private aa(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 != 7994) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f4471d = new ArrayList();
                                    z2 |= true;
                                }
                                this.f4471d.add(gVar.a(ai.f4498a, pVar));
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f4471d = Collections.unmodifiableList(this.f4471d);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.C;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.D.a(aa.class, a.class);
        }

        public List<ai> c() {
            return this.f4471d;
        }

        public int d() {
            return this.f4471d.size();
        }

        public ai a(int i) {
            return this.f4471d.get(i);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < d(); i++) {
                if (!a(i).isInitialized()) {
                    this.e = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.e = (byte) 0;
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            for (int i = 0; i < this.f4471d.size(); i++) {
                hVar.a(999, this.f4471d.get(i));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4471d.size(); i3++) {
                i2 += com.google.protobuf.h.c(999, this.f4471d.get(i3));
            }
            int Y = i2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof aa)) {
                return super.equals(obj);
            }
            aa aaVar = (aa) obj;
            return ((c().equals(aaVar.c())) && this.f4720c.equals(aaVar.f4720c)) && Z().equals(aaVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (d() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + c().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: e */
        public a C() {
            return f();
        }

        public static a f() {
            return f.D();
        }

        public static a a(aa aaVar) {
            return f.D().a(aaVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: g */
        public a D() {
            return this == f ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<aa, a> implements ab {

            /* renamed from: a  reason: collision with root package name */
            private int f4472a;

            /* renamed from: b  reason: collision with root package name */
            private List<ai> f4473b;

            /* renamed from: c  reason: collision with root package name */
            private am<ai, ai.a, aj> f4474c;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.D.a(aa.class, a.class);
            }

            private a() {
                this.f4473b = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4473b = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.C;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public aa F() {
                return aa.h();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public aa t() {
                aa r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public aa r() {
                aa aaVar = new aa(this);
                int i = this.f4472a;
                if (this.f4474c != null) {
                    aaVar.f4471d = this.f4474c.e();
                } else {
                    if ((this.f4472a & 1) == 1) {
                        this.f4473b = Collections.unmodifiableList(this.f4473b);
                        this.f4472a &= -2;
                    }
                    aaVar.f4471d = this.f4473b;
                }
                u();
                return aaVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof aa) {
                    return a((aa) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(aa aaVar) {
                if (aaVar == aa.h()) {
                    return this;
                }
                if (this.f4474c == null) {
                    if (!aaVar.f4471d.isEmpty()) {
                        if (this.f4473b.isEmpty()) {
                            this.f4473b = aaVar.f4471d;
                            this.f4472a &= -2;
                        } else {
                            m();
                            this.f4473b.addAll(aaVar.f4471d);
                        }
                        x();
                    }
                } else if (!aaVar.f4471d.isEmpty()) {
                    if (!this.f4474c.d()) {
                        this.f4474c.a(aaVar.f4471d);
                    } else {
                        this.f4474c.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.f4474c = null;
                        this.f4473b = aaVar.f4471d;
                        this.f4472a &= -2;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.f4474c = amVar;
                    }
                }
                a((s.d) aaVar);
                d(aaVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.aa.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$aa> r1 = com.google.protobuf.i.aa.f4470a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$aa r3 = (com.google.protobuf.i.aa) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$aa r4 = (com.google.protobuf.i.aa) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.aa.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$aa$a");
            }

            private void m() {
                if ((this.f4472a & 1) != 1) {
                    this.f4473b = new ArrayList(this.f4473b);
                    this.f4472a |= 1;
                }
            }

            public int j() {
                if (this.f4474c == null) {
                    return this.f4473b.size();
                }
                return this.f4474c.c();
            }

            public ai a(int i) {
                if (this.f4474c == null) {
                    return this.f4473b.get(i);
                }
                return this.f4474c.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.f4474c == null) {
                    List<ai> list = this.f4473b;
                    boolean z = true;
                    if ((this.f4472a & 1) != 1) {
                        z = false;
                    }
                    this.f4474c = new am<>(list, z, w(), v());
                    this.f4473b = null;
                }
                return this.f4474c;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static aa h() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<aa> getParserForType() {
            return f4470a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: i */
        public aa F() {
            return f;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class e extends s.d<e> implements f {

        /* renamed from: d  reason: collision with root package name */
        private int f4516d;
        private boolean e;
        private boolean f;
        private List<ai> g;
        private byte h;
        private static final e i = new e();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<e> f4515a = new com.google.protobuf.c<e>() { // from class: com.google.protobuf.i.e.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public e d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new e(gVar, pVar);
            }
        };

        private e(s.c<e, ?> cVar) {
            super(cVar);
            this.h = (byte) -1;
        }

        private e() {
            this.h = (byte) -1;
            this.e = false;
            this.f = false;
            this.g = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 16) {
                                    this.f4516d |= 1;
                                    this.e = gVar.i();
                                } else if (a3 == 24) {
                                    this.f4516d |= 2;
                                    this.f = gVar.i();
                                } else if (a3 != 7994) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    if (!(z2 & true)) {
                                        this.g = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.g.add(gVar.a(ai.f4498a, pVar));
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.E;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.F.a(e.class, a.class);
        }

        public boolean c() {
            return (this.f4516d & 1) == 1;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return (this.f4516d & 2) == 2;
        }

        public boolean f() {
            return this.f;
        }

        public List<ai> g() {
            return this.g;
        }

        public int h() {
            return this.g.size();
        }

        public ai a(int i2) {
            return this.g.get(i2);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < h(); i2++) {
                if (!a(i2).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.h = (byte) 0;
                return false;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4516d & 1) == 1) {
                hVar.a(2, this.e);
            }
            if ((this.f4516d & 2) == 2) {
                hVar.a(3, this.f);
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                hVar.a(999, this.g.get(i2));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            int b2 = (this.f4516d & 1) == 1 ? com.google.protobuf.h.b(2, this.e) + 0 : 0;
            if ((this.f4516d & 2) == 2) {
                b2 += com.google.protobuf.h.b(3, this.f);
            }
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                b2 += com.google.protobuf.h.c(999, this.g.get(i3));
            }
            int Y = b2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return super.equals(obj);
            }
            e eVar = (e) obj;
            boolean z = c() == eVar.c();
            if (c()) {
                z = z && d() == eVar.d();
            }
            boolean z2 = z && e() == eVar.e();
            if (e()) {
                z2 = z2 && f() == eVar.f();
            }
            return ((z2 && g().equals(eVar.g())) && this.f4720c.equals(eVar.f4720c)) && Z().equals(eVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.t.a(d());
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.t.a(f());
            }
            if (h() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + g().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public a C() {
            return j();
        }

        public static a j() {
            return i.D();
        }

        public static a a(e eVar) {
            return i.D().a(eVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public a D() {
            return this == i ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<e, a> implements f {

            /* renamed from: a  reason: collision with root package name */
            private int f4517a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f4518b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f4519c;

            /* renamed from: d  reason: collision with root package name */
            private List<ai> f4520d;
            private am<ai, ai.a, aj> e;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.F.a(e.class, a.class);
            }

            private a() {
                this.f4520d = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4520d = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.E;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public e F() {
                return e.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public e t() {
                e r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public e r() {
                e eVar = new e(this);
                int i = this.f4517a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                eVar.e = this.f4518b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                eVar.f = this.f4519c;
                if (this.e != null) {
                    eVar.g = this.e.e();
                } else {
                    if ((this.f4517a & 4) == 4) {
                        this.f4520d = Collections.unmodifiableList(this.f4520d);
                        this.f4517a &= -5;
                    }
                    eVar.g = this.f4520d;
                }
                eVar.f4516d = i2;
                u();
                return eVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof e) {
                    return a((e) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(e eVar) {
                if (eVar == e.l()) {
                    return this;
                }
                if (eVar.c()) {
                    a(eVar.d());
                }
                if (eVar.e()) {
                    b(eVar.f());
                }
                if (this.e == null) {
                    if (!eVar.g.isEmpty()) {
                        if (this.f4520d.isEmpty()) {
                            this.f4520d = eVar.g;
                            this.f4517a &= -5;
                        } else {
                            m();
                            this.f4520d.addAll(eVar.g);
                        }
                        x();
                    }
                } else if (!eVar.g.isEmpty()) {
                    if (!this.e.d()) {
                        this.e.a(eVar.g);
                    } else {
                        this.e.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.e = null;
                        this.f4520d = eVar.g;
                        this.f4517a &= -5;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.e = amVar;
                    }
                }
                a((s.d) eVar);
                d(eVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.e.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$e> r1 = com.google.protobuf.i.e.f4515a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$e r3 = (com.google.protobuf.i.e) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$e r4 = (com.google.protobuf.i.e) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.e.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$e$a");
            }

            public a a(boolean z) {
                this.f4517a |= 1;
                this.f4518b = z;
                x();
                return this;
            }

            public a b(boolean z) {
                this.f4517a |= 2;
                this.f4519c = z;
                x();
                return this;
            }

            private void m() {
                if ((this.f4517a & 4) != 4) {
                    this.f4520d = new ArrayList(this.f4520d);
                    this.f4517a |= 4;
                }
            }

            public int j() {
                if (this.e == null) {
                    return this.f4520d.size();
                }
                return this.e.c();
            }

            public ai a(int i) {
                if (this.e == null) {
                    return this.f4520d.get(i);
                }
                return this.e.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.e == null) {
                    this.e = new am<>(this.f4520d, (this.f4517a & 4) == 4, w(), v());
                    this.f4520d = null;
                }
                return this.e;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static e l() {
            return i;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<e> getParserForType() {
            return f4515a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public e F() {
            return i;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* renamed from: com.google.protobuf.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0084i extends s.d<C0084i> implements j {

        /* renamed from: d  reason: collision with root package name */
        private int f4528d;
        private boolean e;
        private List<ai> f;
        private byte g;
        private static final C0084i h = new C0084i();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<C0084i> f4527a = new com.google.protobuf.c<C0084i>() { // from class: com.google.protobuf.i.i.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public C0084i d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new C0084i(gVar, pVar);
            }
        };

        private C0084i(s.c<C0084i, ?> cVar) {
            super(cVar);
            this.g = (byte) -1;
        }

        private C0084i() {
            this.g = (byte) -1;
            this.e = false;
            this.f = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C0084i(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 8) {
                                    this.f4528d |= 1;
                                    this.e = gVar.i();
                                } else if (a3 != 7994) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    if (!(z2 & true)) {
                                        this.f = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f.add(gVar.a(ai.f4498a, pVar));
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.G;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.H.a(C0084i.class, a.class);
        }

        public boolean c() {
            return (this.f4528d & 1) == 1;
        }

        public boolean d() {
            return this.e;
        }

        public List<ai> e() {
            return this.f;
        }

        public int f() {
            return this.f.size();
        }

        public ai a(int i) {
            return this.f.get(i);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.g;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < f(); i++) {
                if (!a(i).isInitialized()) {
                    this.g = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.g = (byte) 0;
                return false;
            }
            this.g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4528d & 1) == 1) {
                hVar.a(1, this.e);
            }
            for (int i = 0; i < this.f.size(); i++) {
                hVar.a(999, this.f.get(i));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int b2 = (this.f4528d & 1) == 1 ? com.google.protobuf.h.b(1, this.e) + 0 : 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                b2 += com.google.protobuf.h.c(999, this.f.get(i2));
            }
            int Y = b2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0084i)) {
                return super.equals(obj);
            }
            C0084i c0084i = (C0084i) obj;
            boolean z = c() == c0084i.c();
            if (c()) {
                z = z && d() == c0084i.d();
            }
            return ((z && e().equals(c0084i.e())) && this.f4720c.equals(c0084i.f4720c)) && Z().equals(c0084i.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.t.a(d());
            }
            if (f() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + e().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: g */
        public a C() {
            return h();
        }

        public static a h() {
            return h.D();
        }

        public static a a(C0084i c0084i) {
            return h.D().a(c0084i);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: i */
        public a D() {
            return this == h ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* renamed from: com.google.protobuf.i$i$a */
        /* loaded from: classes.dex */
        public static final class a extends s.c<C0084i, a> implements j {

            /* renamed from: a  reason: collision with root package name */
            private int f4529a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f4530b;

            /* renamed from: c  reason: collision with root package name */
            private List<ai> f4531c;

            /* renamed from: d  reason: collision with root package name */
            private am<ai, ai.a, aj> f4532d;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.H.a(C0084i.class, a.class);
            }

            private a() {
                this.f4531c = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4531c = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.G;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public C0084i F() {
                return C0084i.j();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public C0084i t() {
                C0084i r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public C0084i r() {
                C0084i c0084i = new C0084i(this);
                int i = 1;
                if ((this.f4529a & 1) != 1) {
                    i = 0;
                }
                c0084i.e = this.f4530b;
                if (this.f4532d != null) {
                    c0084i.f = this.f4532d.e();
                } else {
                    if ((this.f4529a & 2) == 2) {
                        this.f4531c = Collections.unmodifiableList(this.f4531c);
                        this.f4529a &= -3;
                    }
                    c0084i.f = this.f4531c;
                }
                c0084i.f4528d = i;
                u();
                return c0084i;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof C0084i) {
                    return a((C0084i) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(C0084i c0084i) {
                if (c0084i == C0084i.j()) {
                    return this;
                }
                if (c0084i.c()) {
                    a(c0084i.d());
                }
                if (this.f4532d == null) {
                    if (!c0084i.f.isEmpty()) {
                        if (this.f4531c.isEmpty()) {
                            this.f4531c = c0084i.f;
                            this.f4529a &= -3;
                        } else {
                            m();
                            this.f4531c.addAll(c0084i.f);
                        }
                        x();
                    }
                } else if (!c0084i.f.isEmpty()) {
                    if (!this.f4532d.d()) {
                        this.f4532d.a(c0084i.f);
                    } else {
                        this.f4532d.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.f4532d = null;
                        this.f4531c = c0084i.f;
                        this.f4529a &= -3;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.f4532d = amVar;
                    }
                }
                a((s.d) c0084i);
                d(c0084i.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.C0084i.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$i> r1 = com.google.protobuf.i.C0084i.f4527a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$i r3 = (com.google.protobuf.i.C0084i) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$i r4 = (com.google.protobuf.i.C0084i) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.C0084i.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$i$a");
            }

            public a a(boolean z) {
                this.f4529a |= 1;
                this.f4530b = z;
                x();
                return this;
            }

            private void m() {
                if ((this.f4529a & 2) != 2) {
                    this.f4531c = new ArrayList(this.f4531c);
                    this.f4529a |= 2;
                }
            }

            public int j() {
                if (this.f4532d == null) {
                    return this.f4531c.size();
                }
                return this.f4532d.c();
            }

            public ai a(int i) {
                if (this.f4532d == null) {
                    return this.f4531c.get(i);
                }
                return this.f4532d.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.f4532d == null) {
                    this.f4532d = new am<>(this.f4531c, (this.f4529a & 2) == 2, w(), v());
                    this.f4531c = null;
                }
                return this.f4532d;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static C0084i j() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<C0084i> getParserForType() {
            return f4527a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public C0084i F() {
            return h;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class ae extends s.d<ae> implements af {

        /* renamed from: d  reason: collision with root package name */
        private int f4482d;
        private boolean e;
        private List<ai> f;
        private byte g;
        private static final ae h = new ae();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<ae> f4481a = new com.google.protobuf.c<ae>() { // from class: com.google.protobuf.i.ae.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ae d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ae(gVar, pVar);
            }
        };

        private ae(s.c<ae, ?> cVar) {
            super(cVar);
            this.g = (byte) -1;
        }

        private ae() {
            this.g = (byte) -1;
            this.e = false;
            this.f = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ae(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 264) {
                                    this.f4482d |= 1;
                                    this.e = gVar.i();
                                } else if (a3 != 7994) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    if (!(z2 & true)) {
                                        this.f = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f.add(gVar.a(ai.f4498a, pVar));
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.I;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.J.a(ae.class, a.class);
        }

        public boolean c() {
            return (this.f4482d & 1) == 1;
        }

        public boolean d() {
            return this.e;
        }

        public List<ai> e() {
            return this.f;
        }

        public int f() {
            return this.f.size();
        }

        public ai a(int i) {
            return this.f.get(i);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.g;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < f(); i++) {
                if (!a(i).isInitialized()) {
                    this.g = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.g = (byte) 0;
                return false;
            }
            this.g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4482d & 1) == 1) {
                hVar.a(33, this.e);
            }
            for (int i = 0; i < this.f.size(); i++) {
                hVar.a(999, this.f.get(i));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int b2 = (this.f4482d & 1) == 1 ? com.google.protobuf.h.b(33, this.e) + 0 : 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                b2 += com.google.protobuf.h.c(999, this.f.get(i2));
            }
            int Y = b2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ae)) {
                return super.equals(obj);
            }
            ae aeVar = (ae) obj;
            boolean z = c() == aeVar.c();
            if (c()) {
                z = z && d() == aeVar.d();
            }
            return ((z && e().equals(aeVar.e())) && this.f4720c.equals(aeVar.f4720c)) && Z().equals(aeVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 33) * 53) + com.google.protobuf.t.a(d());
            }
            if (f() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + e().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: g */
        public a C() {
            return h();
        }

        public static a h() {
            return h.D();
        }

        public static a a(ae aeVar) {
            return h.D().a(aeVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: i */
        public a D() {
            return this == h ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<ae, a> implements af {

            /* renamed from: a  reason: collision with root package name */
            private int f4483a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f4484b;

            /* renamed from: c  reason: collision with root package name */
            private List<ai> f4485c;

            /* renamed from: d  reason: collision with root package name */
            private am<ai, ai.a, aj> f4486d;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.J.a(ae.class, a.class);
            }

            private a() {
                this.f4485c = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4485c = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.I;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ae F() {
                return ae.j();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ae t() {
                ae r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ae r() {
                ae aeVar = new ae(this);
                int i = 1;
                if ((this.f4483a & 1) != 1) {
                    i = 0;
                }
                aeVar.e = this.f4484b;
                if (this.f4486d != null) {
                    aeVar.f = this.f4486d.e();
                } else {
                    if ((this.f4483a & 2) == 2) {
                        this.f4485c = Collections.unmodifiableList(this.f4485c);
                        this.f4483a &= -3;
                    }
                    aeVar.f = this.f4485c;
                }
                aeVar.f4482d = i;
                u();
                return aeVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ae) {
                    return a((ae) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(ae aeVar) {
                if (aeVar == ae.j()) {
                    return this;
                }
                if (aeVar.c()) {
                    a(aeVar.d());
                }
                if (this.f4486d == null) {
                    if (!aeVar.f.isEmpty()) {
                        if (this.f4485c.isEmpty()) {
                            this.f4485c = aeVar.f;
                            this.f4483a &= -3;
                        } else {
                            m();
                            this.f4485c.addAll(aeVar.f);
                        }
                        x();
                    }
                } else if (!aeVar.f.isEmpty()) {
                    if (!this.f4486d.d()) {
                        this.f4486d.a(aeVar.f);
                    } else {
                        this.f4486d.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.f4486d = null;
                        this.f4485c = aeVar.f;
                        this.f4483a &= -3;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.f4486d = amVar;
                    }
                }
                a((s.d) aeVar);
                d(aeVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.ae.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$ae> r1 = com.google.protobuf.i.ae.f4481a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$ae r3 = (com.google.protobuf.i.ae) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$ae r4 = (com.google.protobuf.i.ae) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.ae.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$ae$a");
            }

            public a a(boolean z) {
                this.f4483a |= 1;
                this.f4484b = z;
                x();
                return this;
            }

            private void m() {
                if ((this.f4483a & 2) != 2) {
                    this.f4485c = new ArrayList(this.f4485c);
                    this.f4483a |= 2;
                }
            }

            public int j() {
                if (this.f4486d == null) {
                    return this.f4485c.size();
                }
                return this.f4486d.c();
            }

            public ai a(int i) {
                if (this.f4486d == null) {
                    return this.f4485c.get(i);
                }
                return this.f4486d.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.f4486d == null) {
                    this.f4486d = new am<>(this.f4485c, (this.f4483a & 2) == 2, w(), v());
                    this.f4485c = null;
                }
                return this.f4486d;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static ae j() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ae> getParserForType() {
            return f4481a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public ae F() {
            return h;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class w extends s.d<w> implements x {

        /* renamed from: d  reason: collision with root package name */
        private int f4590d;
        private boolean e;
        private int f;
        private List<ai> g;
        private byte h;
        private static final w i = new w();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<w> f4589a = new com.google.protobuf.c<w>() { // from class: com.google.protobuf.i.w.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public w d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new w(gVar, pVar);
            }
        };

        private w(s.c<w, ?> cVar) {
            super(cVar);
            this.h = (byte) -1;
        }

        private w() {
            this.h = (byte) -1;
            this.e = false;
            this.f = 0;
            this.g = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private w(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 == 264) {
                                this.f4590d |= 1;
                                this.e = gVar.i();
                            } else if (a3 == 272) {
                                int n = gVar.n();
                                if (b.a(n) == null) {
                                    a2.a(34, n);
                                } else {
                                    this.f4590d |= 2;
                                    this.f = n;
                                }
                            } else if (a3 != 7994) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.g = new ArrayList();
                                    z2 |= true;
                                }
                                this.g.add(gVar.a(ai.f4498a, pVar));
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.K;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.L.a(w.class, a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public enum b implements ak {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);
            

            /* renamed from: d  reason: collision with root package name */
            private static final t.b<b> f4598d = new t.b<b>() { // from class: com.google.protobuf.i.w.b.1
            };
            private static final b[] e = values();
            private final int f;

            @Override // com.google.protobuf.t.a
            public final int a() {
                return this.f;
            }

            @Deprecated
            public static b a(int i) {
                return b(i);
            }

            public static b b(int i) {
                switch (i) {
                    case 0:
                        return IDEMPOTENCY_UNKNOWN;
                    case 1:
                        return NO_SIDE_EFFECTS;
                    case 2:
                        return IDEMPOTENT;
                    default:
                        return null;
                }
            }

            b(int i) {
                this.f = i;
            }
        }

        public boolean c() {
            return (this.f4590d & 1) == 1;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return (this.f4590d & 2) == 2;
        }

        public b f() {
            b a2 = b.a(this.f);
            return a2 == null ? b.IDEMPOTENCY_UNKNOWN : a2;
        }

        public List<ai> g() {
            return this.g;
        }

        public int h() {
            return this.g.size();
        }

        public ai a(int i2) {
            return this.g.get(i2);
        }

        @Override // com.google.protobuf.s.d, com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i2 = 0; i2 < h(); i2++) {
                if (!a(i2).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            if (!W()) {
                this.h = (byte) 0;
                return false;
            }
            this.h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            s.d<MessageType>.a X = X();
            if ((this.f4590d & 1) == 1) {
                hVar.a(33, this.e);
            }
            if ((this.f4590d & 2) == 2) {
                hVar.e(34, this.f);
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                hVar.a(999, this.g.get(i2));
            }
            X.a(536870912, hVar);
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i2 = this.memoizedSize;
            if (i2 != -1) {
                return i2;
            }
            int b2 = (this.f4590d & 1) == 1 ? com.google.protobuf.h.b(33, this.e) + 0 : 0;
            if ((this.f4590d & 2) == 2) {
                b2 += com.google.protobuf.h.i(34, this.f);
            }
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                b2 += com.google.protobuf.h.c(999, this.g.get(i3));
            }
            int Y = b2 + Y() + this.f4720c.getSerializedSize();
            this.memoizedSize = Y;
            return Y;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof w)) {
                return super.equals(obj);
            }
            w wVar = (w) obj;
            boolean z = c() == wVar.c();
            if (c()) {
                z = z && d() == wVar.d();
            }
            boolean z2 = z && e() == wVar.e();
            if (e()) {
                z2 = z2 && this.f == wVar.f;
            }
            return ((z2 && g().equals(wVar.g())) && this.f4720c.equals(wVar.f4720c)) && Z().equals(wVar.Z());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 33) * 53) + com.google.protobuf.t.a(d());
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 34) * 53) + this.f;
            }
            if (h() > 0) {
                hashCode = (((hashCode * 37) + 999) * 53) + g().hashCode();
            }
            int hashFields = (hashFields(hashCode, Z()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public a C() {
            return j();
        }

        public static a j() {
            return i.D();
        }

        public static a a(w wVar) {
            return i.D().a(wVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public a D() {
            return this == i ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.c<w, a> implements x {

            /* renamed from: a  reason: collision with root package name */
            private int f4591a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f4592b;

            /* renamed from: c  reason: collision with root package name */
            private int f4593c;

            /* renamed from: d  reason: collision with root package name */
            private List<ai> f4594d;
            private am<ai, ai.a, aj> e;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.L.a(w.class, a.class);
            }

            private a() {
                this.f4593c = 0;
                this.f4594d = Collections.emptyList();
                l();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4593c = 0;
                this.f4594d = Collections.emptyList();
                l();
            }

            private void l() {
                if (com.google.protobuf.s.f4719b) {
                    n();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.K;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public w F() {
                return w.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public w t() {
                w r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public w r() {
                w wVar = new w(this);
                int i = this.f4591a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                wVar.e = this.f4592b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                wVar.f = this.f4593c;
                if (this.e != null) {
                    wVar.g = this.e.e();
                } else {
                    if ((this.f4591a & 4) == 4) {
                        this.f4594d = Collections.unmodifiableList(this.f4594d);
                        this.f4591a &= -5;
                    }
                    wVar.g = this.f4594d;
                }
                wVar.f4590d = i2;
                u();
                return wVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: a */
            public a h(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.c
            /* renamed from: b */
            public a g(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof w) {
                    return a((w) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(w wVar) {
                if (wVar == w.l()) {
                    return this;
                }
                if (wVar.c()) {
                    a(wVar.d());
                }
                if (wVar.e()) {
                    a(wVar.f());
                }
                if (this.e == null) {
                    if (!wVar.g.isEmpty()) {
                        if (this.f4594d.isEmpty()) {
                            this.f4594d = wVar.g;
                            this.f4591a &= -5;
                        } else {
                            m();
                            this.f4594d.addAll(wVar.g);
                        }
                        x();
                    }
                } else if (!wVar.g.isEmpty()) {
                    if (!this.e.d()) {
                        this.e.a(wVar.g);
                    } else {
                        this.e.b();
                        am<ai, ai.a, aj> amVar = null;
                        this.e = null;
                        this.f4594d = wVar.g;
                        this.f4591a &= -5;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = n();
                        }
                        this.e = amVar;
                    }
                }
                a((s.d) wVar);
                d(wVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.c, com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return k();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.w.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$w> r1 = com.google.protobuf.i.w.f4589a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$w r3 = (com.google.protobuf.i.w) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$w r4 = (com.google.protobuf.i.w) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.w.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$w$a");
            }

            public a a(boolean z) {
                this.f4591a |= 1;
                this.f4592b = z;
                x();
                return this;
            }

            public a a(b bVar) {
                if (bVar == null) {
                    throw new NullPointerException();
                }
                this.f4591a |= 2;
                this.f4593c = bVar.a();
                x();
                return this;
            }

            private void m() {
                if ((this.f4591a & 4) != 4) {
                    this.f4594d = new ArrayList(this.f4594d);
                    this.f4591a |= 4;
                }
            }

            public int j() {
                if (this.e == null) {
                    return this.f4594d.size();
                }
                return this.e.c();
            }

            public ai a(int i) {
                if (this.e == null) {
                    return this.f4594d.get(i);
                }
                return this.e.a(i);
            }

            private am<ai, ai.a, aj> n() {
                if (this.e == null) {
                    this.e = new am<>(this.f4594d, (this.f4591a & 4) == 4, w(), v());
                    this.f4594d = null;
                }
                return this.e;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static w l() {
            return i;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<w> getParserForType() {
            return f4589a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public w F() {
            return i;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class ai extends com.google.protobuf.s implements aj {

        /* renamed from: d  reason: collision with root package name */
        private int f4499d;
        private List<b> e;
        private volatile Object f;
        private long g;
        private long h;
        private double i;
        private com.google.protobuf.f j;
        private volatile Object k;
        private byte l;
        private static final ai m = new ai();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<ai> f4498a = new com.google.protobuf.c<ai>() { // from class: com.google.protobuf.i.ai.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ai d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ai(gVar, pVar);
            }
        };

        /* loaded from: classes.dex */
        public interface c extends com.google.protobuf.af {
        }

        private ai(s.a<?> aVar) {
            super(aVar);
            this.l = (byte) -1;
        }

        private ai() {
            this.l = (byte) -1;
            this.e = Collections.emptyList();
            this.f = "";
            this.g = 0L;
            this.h = 0L;
            this.i = 0.0d;
            this.j = com.google.protobuf.f.f4423a;
            this.k = "";
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ai(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 == 18) {
                                if (!(z2 & true)) {
                                    this.e = new ArrayList();
                                    z2 |= true;
                                }
                                this.e.add(gVar.a(b.f4504a, pVar));
                            } else if (a3 == 26) {
                                com.google.protobuf.f l = gVar.l();
                                this.f4499d |= 1;
                                this.f = l;
                            } else if (a3 == 32) {
                                this.f4499d |= 2;
                                this.g = gVar.d();
                            } else if (a3 == 40) {
                                this.f4499d |= 4;
                                this.h = gVar.e();
                            } else if (a3 == 49) {
                                this.f4499d |= 8;
                                this.i = gVar.b();
                            } else if (a3 == 58) {
                                this.f4499d |= 16;
                                this.j = gVar.l();
                            } else if (a3 != 66) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                com.google.protobuf.f l2 = gVar.l();
                                this.f4499d = 32 | this.f4499d;
                                this.k = l2;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.M;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.N.a(ai.class, a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class b extends com.google.protobuf.s implements c {

            /* renamed from: d  reason: collision with root package name */
            private int f4505d;
            private volatile Object e;
            private boolean f;
            private byte g;
            private static final b h = new b();
            @Deprecated

            /* renamed from: a  reason: collision with root package name */
            public static final com.google.protobuf.ai<b> f4504a = new com.google.protobuf.c<b>() { // from class: com.google.protobuf.i.ai.b.1
                @Override // com.google.protobuf.ai
                /* renamed from: c */
                public b d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                    return new b(gVar, pVar);
                }
            };

            private b(s.a<?> aVar) {
                super(aVar);
                this.g = (byte) -1;
            }

            private b() {
                this.g = (byte) -1;
                this.e = "";
                this.f = false;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.af
            public final at getUnknownFields() {
                return this.f4720c;
            }

            private b(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                this();
                at.a a2 = at.a();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int a3 = gVar.a();
                            if (a3 != 0) {
                                if (a3 == 10) {
                                    com.google.protobuf.f l = gVar.l();
                                    this.f4505d = 1 | this.f4505d;
                                    this.e = l;
                                } else if (a3 != 16) {
                                    if (!a(gVar, a2, pVar, a3)) {
                                    }
                                } else {
                                    this.f4505d |= 2;
                                    this.f = gVar.i();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        } catch (IOException e2) {
                            throw new com.google.protobuf.u(e2).a(this);
                        }
                    } finally {
                        this.f4720c = a2.t();
                        V();
                    }
                }
            }

            public static final j.a a() {
                return i.O;
            }

            @Override // com.google.protobuf.s
            protected s.f b() {
                return i.P.a(b.class, a.class);
            }

            public boolean c() {
                return (this.f4505d & 1) == 1;
            }

            public String d() {
                Object obj = this.e;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
                String e = fVar.e();
                if (fVar.f()) {
                    this.e = e;
                }
                return e;
            }

            public boolean e() {
                return (this.f4505d & 2) == 2;
            }

            public boolean f() {
                return this.f;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                byte b2 = this.g;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (!c()) {
                    this.g = (byte) 0;
                    return false;
                } else if (!e()) {
                    this.g = (byte) 0;
                    return false;
                } else {
                    this.g = (byte) 1;
                    return true;
                }
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public void writeTo(com.google.protobuf.h hVar) {
                if ((this.f4505d & 1) == 1) {
                    com.google.protobuf.s.a(hVar, 1, this.e);
                }
                if ((this.f4505d & 2) == 2) {
                    hVar.a(2, this.f);
                }
                this.f4720c.writeTo(hVar);
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.f4505d & 1) == 1) {
                    i2 = 0 + com.google.protobuf.s.a(1, this.e);
                }
                if ((this.f4505d & 2) == 2) {
                    i2 += com.google.protobuf.h.b(2, this.f);
                }
                int serializedSize = i2 + this.f4720c.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return super.equals(obj);
                }
                b bVar = (b) obj;
                boolean z = c() == bVar.c();
                if (c()) {
                    z = z && d().equals(bVar.d());
                }
                boolean z2 = z && e() == bVar.e();
                if (e()) {
                    z2 = z2 && f() == bVar.f();
                }
                return z2 && this.f4720c.equals(bVar.f4720c);
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + a().hashCode();
                if (c()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
                }
                if (e()) {
                    hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.t.a(f());
                }
                int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.ab
            /* renamed from: g */
            public a C() {
                return h();
            }

            public static a h() {
                return h.D();
            }

            @Override // com.google.protobuf.ac
            /* renamed from: i */
            public a D() {
                return this == h ? new a() : new a().a(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.s
            /* renamed from: a */
            public a b(s.b bVar) {
                return new a(bVar);
            }

            /* compiled from: DescriptorProtos.java */
            /* loaded from: classes.dex */
            public static final class a extends s.a<a> implements c {

                /* renamed from: a  reason: collision with root package name */
                private int f4506a;

                /* renamed from: b  reason: collision with root package name */
                private Object f4507b;

                /* renamed from: c  reason: collision with root package name */
                private boolean f4508c;

                @Override // com.google.protobuf.s.a
                protected s.f e() {
                    return i.P.a(b.class, a.class);
                }

                private a() {
                    this.f4507b = "";
                    l();
                }

                private a(s.b bVar) {
                    super(bVar);
                    this.f4507b = "";
                    l();
                }

                private void l() {
                    boolean z = com.google.protobuf.s.f4719b;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
                public j.a getDescriptorForType() {
                    return i.O;
                }

                @Override // com.google.protobuf.af
                /* renamed from: f */
                public b F() {
                    return b.j();
                }

                @Override // com.google.protobuf.ac.a
                /* renamed from: g */
                public b t() {
                    b r = r();
                    if (!r.isInitialized()) {
                        throw b(r);
                    }
                    return r;
                }

                @Override // com.google.protobuf.ab.a
                /* renamed from: h */
                public b r() {
                    b bVar = new b(this);
                    int i = this.f4506a;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    bVar.e = this.f4507b;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    bVar.f = this.f4508c;
                    bVar.f4505d = i2;
                    u();
                    return bVar;
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: i */
                public a q() {
                    return (a) super.d();
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: a */
                public a f(j.f fVar, Object obj) {
                    return (a) super.f(fVar, obj);
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public a e(j.f fVar, Object obj) {
                    return (a) super.e(fVar, obj);
                }

                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
                /* renamed from: d */
                public a c(com.google.protobuf.ab abVar) {
                    if (abVar instanceof b) {
                        return a((b) abVar);
                    }
                    super.c(abVar);
                    return this;
                }

                public a a(b bVar) {
                    if (bVar == b.j()) {
                        return this;
                    }
                    if (bVar.c()) {
                        this.f4506a |= 1;
                        this.f4507b = bVar.e;
                        x();
                    }
                    if (bVar.e()) {
                        a(bVar.f());
                    }
                    d(bVar.f4720c);
                    x();
                    return this;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ad
                public final boolean isInitialized() {
                    return j() && k();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
                /* renamed from: d */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.google.protobuf.i.ai.b.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.ai<com.google.protobuf.i$ai$b> r1 = com.google.protobuf.i.ai.b.f4504a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        com.google.protobuf.i$ai$b r3 = (com.google.protobuf.i.ai.b) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        if (r3 == 0) goto Le
                        r2.a(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        com.google.protobuf.i$ai$b r4 = (com.google.protobuf.i.ai.b) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.a(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.ai.b.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$ai$b$a");
                }

                public boolean j() {
                    return (this.f4506a & 1) == 1;
                }

                public boolean k() {
                    return (this.f4506a & 2) == 2;
                }

                public a a(boolean z) {
                    this.f4506a |= 2;
                    this.f4508c = z;
                    x();
                    return this;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public final a f(at atVar) {
                    return (a) super.f(atVar);
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: c */
                public final a d(at atVar) {
                    return (a) super.a(atVar);
                }
            }

            public static b j() {
                return h;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.ac
            public com.google.protobuf.ai<b> getParserForType() {
                return f4504a;
            }

            @Override // com.google.protobuf.af
            /* renamed from: k */
            public b F() {
                return h;
            }
        }

        public List<b> c() {
            return this.e;
        }

        public int d() {
            return this.e.size();
        }

        public b a(int i) {
            return this.e.get(i);
        }

        public boolean e() {
            return (this.f4499d & 1) == 1;
        }

        public String f() {
            Object obj = this.f;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.f = e;
            }
            return e;
        }

        public boolean g() {
            return (this.f4499d & 2) == 2;
        }

        public long h() {
            return this.g;
        }

        public boolean i() {
            return (this.f4499d & 4) == 4;
        }

        public long j() {
            return this.h;
        }

        public boolean k() {
            return (this.f4499d & 8) == 8;
        }

        public double l() {
            return this.i;
        }

        public boolean m() {
            return (this.f4499d & 16) == 16;
        }

        public com.google.protobuf.f n() {
            return this.j;
        }

        public boolean o() {
            return (this.f4499d & 32) == 32;
        }

        public String p() {
            Object obj = this.k;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
            String e = fVar.e();
            if (fVar.f()) {
                this.k = e;
            }
            return e;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.l;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            for (int i = 0; i < d(); i++) {
                if (!a(i).isInitialized()) {
                    this.l = (byte) 0;
                    return false;
                }
            }
            this.l = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            for (int i = 0; i < this.e.size(); i++) {
                hVar.a(2, this.e.get(i));
            }
            if ((this.f4499d & 1) == 1) {
                com.google.protobuf.s.a(hVar, 3, this.f);
            }
            if ((this.f4499d & 2) == 2) {
                hVar.b(4, this.g);
            }
            if ((this.f4499d & 4) == 4) {
                hVar.a(5, this.h);
            }
            if ((this.f4499d & 8) == 8) {
                hVar.a(6, this.i);
            }
            if ((this.f4499d & 16) == 16) {
                hVar.a(7, this.j);
            }
            if ((this.f4499d & 32) == 32) {
                com.google.protobuf.s.a(hVar, 8, this.k);
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                i2 += com.google.protobuf.h.c(2, this.e.get(i3));
            }
            if ((this.f4499d & 1) == 1) {
                i2 += com.google.protobuf.s.a(3, this.f);
            }
            if ((this.f4499d & 2) == 2) {
                i2 += com.google.protobuf.h.e(4, this.g);
            }
            if ((this.f4499d & 4) == 4) {
                i2 += com.google.protobuf.h.d(5, this.h);
            }
            if ((this.f4499d & 8) == 8) {
                i2 += com.google.protobuf.h.b(6, this.i);
            }
            if ((this.f4499d & 16) == 16) {
                i2 += com.google.protobuf.h.c(7, this.j);
            }
            if ((this.f4499d & 32) == 32) {
                i2 += com.google.protobuf.s.a(8, this.k);
            }
            int serializedSize = i2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ai)) {
                return super.equals(obj);
            }
            ai aiVar = (ai) obj;
            boolean z = (c().equals(aiVar.c())) && e() == aiVar.e();
            if (e()) {
                z = z && f().equals(aiVar.f());
            }
            boolean z2 = z && g() == aiVar.g();
            if (g()) {
                z2 = z2 && h() == aiVar.h();
            }
            boolean z3 = z2 && i() == aiVar.i();
            if (i()) {
                z3 = z3 && j() == aiVar.j();
            }
            boolean z4 = z3 && k() == aiVar.k();
            if (k()) {
                z4 = z4 && Double.doubleToLongBits(l()) == Double.doubleToLongBits(aiVar.l());
            }
            boolean z5 = z4 && m() == aiVar.m();
            if (m()) {
                z5 = z5 && n().equals(aiVar.n());
            }
            boolean z6 = z5 && o() == aiVar.o();
            if (o()) {
                z6 = z6 && p().equals(aiVar.p());
            }
            return z6 && this.f4720c.equals(aiVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (d() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + c().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
            }
            if (g()) {
                hashCode = (((hashCode * 37) + 4) * 53) + com.google.protobuf.t.a(h());
            }
            if (i()) {
                hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.t.a(j());
            }
            if (k()) {
                hashCode = (((hashCode * 37) + 6) * 53) + com.google.protobuf.t.a(Double.doubleToLongBits(l()));
            }
            if (m()) {
                hashCode = (((hashCode * 37) + 7) * 53) + n().hashCode();
            }
            if (o()) {
                hashCode = (((hashCode * 37) + 8) * 53) + p().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: q */
        public a C() {
            return r();
        }

        public static a r() {
            return m.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: s */
        public a D() {
            return this == m ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements aj {

            /* renamed from: a  reason: collision with root package name */
            private int f4500a;

            /* renamed from: b  reason: collision with root package name */
            private List<b> f4501b;

            /* renamed from: c  reason: collision with root package name */
            private am<b, b.a, c> f4502c;

            /* renamed from: d  reason: collision with root package name */
            private Object f4503d;
            private long e;
            private long f;
            private double g;
            private com.google.protobuf.f h;
            private Object i;

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.N.a(ai.class, a.class);
            }

            private a() {
                this.f4501b = Collections.emptyList();
                this.f4503d = "";
                this.h = com.google.protobuf.f.f4423a;
                this.i = "";
                k();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4501b = Collections.emptyList();
                this.f4503d = "";
                this.h = com.google.protobuf.f.f4423a;
                this.i = "";
                k();
            }

            private void k() {
                if (com.google.protobuf.s.f4719b) {
                    m();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.M;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ai F() {
                return ai.t();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ai t() {
                ai r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ai r() {
                ai aiVar = new ai(this);
                int i = this.f4500a;
                int i2 = 1;
                if (this.f4502c != null) {
                    aiVar.e = this.f4502c.e();
                } else {
                    if ((this.f4500a & 1) == 1) {
                        this.f4501b = Collections.unmodifiableList(this.f4501b);
                        this.f4500a &= -2;
                    }
                    aiVar.e = this.f4501b;
                }
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                aiVar.f = this.f4503d;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                aiVar.g = this.e;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                aiVar.h = this.f;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                aiVar.i = this.g;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                aiVar.j = this.h;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                aiVar.k = this.i;
                aiVar.f4499d = i2;
                u();
                return aiVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ai) {
                    return a((ai) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(ai aiVar) {
                if (aiVar == ai.t()) {
                    return this;
                }
                if (this.f4502c == null) {
                    if (!aiVar.e.isEmpty()) {
                        if (this.f4501b.isEmpty()) {
                            this.f4501b = aiVar.e;
                            this.f4500a &= -2;
                        } else {
                            l();
                            this.f4501b.addAll(aiVar.e);
                        }
                        x();
                    }
                } else if (!aiVar.e.isEmpty()) {
                    if (!this.f4502c.d()) {
                        this.f4502c.a(aiVar.e);
                    } else {
                        this.f4502c.b();
                        am<b, b.a, c> amVar = null;
                        this.f4502c = null;
                        this.f4501b = aiVar.e;
                        this.f4500a &= -2;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = m();
                        }
                        this.f4502c = amVar;
                    }
                }
                if (aiVar.e()) {
                    this.f4500a |= 2;
                    this.f4503d = aiVar.f;
                    x();
                }
                if (aiVar.g()) {
                    a(aiVar.h());
                }
                if (aiVar.i()) {
                    b(aiVar.j());
                }
                if (aiVar.k()) {
                    a(aiVar.l());
                }
                if (aiVar.m()) {
                    a(aiVar.n());
                }
                if (aiVar.o()) {
                    this.f4500a |= 64;
                    this.i = aiVar.k;
                    x();
                }
                d(aiVar.f4720c);
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                for (int i = 0; i < j(); i++) {
                    if (!a(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.ai.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$ai> r1 = com.google.protobuf.i.ai.f4498a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$ai r3 = (com.google.protobuf.i.ai) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$ai r4 = (com.google.protobuf.i.ai) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.ai.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$ai$a");
            }

            private void l() {
                if ((this.f4500a & 1) != 1) {
                    this.f4501b = new ArrayList(this.f4501b);
                    this.f4500a |= 1;
                }
            }

            public int j() {
                if (this.f4502c == null) {
                    return this.f4501b.size();
                }
                return this.f4502c.c();
            }

            public b a(int i) {
                if (this.f4502c == null) {
                    return this.f4501b.get(i);
                }
                return this.f4502c.a(i);
            }

            private am<b, b.a, c> m() {
                if (this.f4502c == null) {
                    List<b> list = this.f4501b;
                    boolean z = true;
                    if ((this.f4500a & 1) != 1) {
                        z = false;
                    }
                    this.f4502c = new am<>(list, z, w(), v());
                    this.f4501b = null;
                }
                return this.f4502c;
            }

            public a a(long j) {
                this.f4500a |= 4;
                this.e = j;
                x();
                return this;
            }

            public a b(long j) {
                this.f4500a |= 8;
                this.f = j;
                x();
                return this;
            }

            public a a(double d2) {
                this.f4500a |= 16;
                this.g = d2;
                x();
                return this;
            }

            public a a(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f4500a |= 32;
                this.h = fVar;
                x();
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static ai t() {
            return m;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ai> getParserForType() {
            return f4498a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: u */
        public ai F() {
            return m;
        }
    }

    /* compiled from: DescriptorProtos.java */
    /* loaded from: classes.dex */
    public static final class ag extends com.google.protobuf.s implements ah {

        /* renamed from: d  reason: collision with root package name */
        private List<b> f4488d;
        private byte e;
        private static final ag f = new ag();
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.protobuf.ai<ag> f4487a = new com.google.protobuf.c<ag>() { // from class: com.google.protobuf.i.ag.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ag d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ag(gVar, pVar);
            }
        };

        /* loaded from: classes.dex */
        public interface c extends com.google.protobuf.af {
        }

        private ag(s.a<?> aVar) {
            super(aVar);
            this.e = (byte) -1;
        }

        private ag() {
            this.e = (byte) -1;
            this.f4488d = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4720c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ag(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            at.a a2 = at.a();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a3 = gVar.a();
                        if (a3 != 0) {
                            if (a3 != 10) {
                                if (!a(gVar, a2, pVar, a3)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f4488d = new ArrayList();
                                    z2 |= true;
                                }
                                this.f4488d.add(gVar.a(b.f4492a, pVar));
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f4488d = Collections.unmodifiableList(this.f4488d);
                    }
                    this.f4720c = a2.t();
                    V();
                }
            }
        }

        public static final j.a a() {
            return i.Q;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return i.R.a(ag.class, a.class);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class b extends com.google.protobuf.s implements c {

            /* renamed from: d  reason: collision with root package name */
            private int f4493d;
            private List<Integer> e;
            private int f;
            private List<Integer> g;
            private int h;
            private volatile Object i;
            private volatile Object j;
            private com.google.protobuf.y k;
            private byte l;
            private static final b m = new b();
            @Deprecated

            /* renamed from: a  reason: collision with root package name */
            public static final com.google.protobuf.ai<b> f4492a = new com.google.protobuf.c<b>() { // from class: com.google.protobuf.i.ag.b.1
                @Override // com.google.protobuf.ai
                /* renamed from: c */
                public b d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                    return new b(gVar, pVar);
                }
            };

            private b(s.a<?> aVar) {
                super(aVar);
                this.f = -1;
                this.h = -1;
                this.l = (byte) -1;
            }

            private b() {
                this.f = -1;
                this.h = -1;
                this.l = (byte) -1;
                this.e = Collections.emptyList();
                this.g = Collections.emptyList();
                this.i = "";
                this.j = "";
                this.k = com.google.protobuf.x.f4766a;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.af
            public final at getUnknownFields() {
                return this.f4720c;
            }

            private b(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                this();
                at.a a2 = at.a();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (z) {
                        break;
                    }
                    try {
                        try {
                            try {
                                int a3 = gVar.a();
                                if (a3 != 0) {
                                    if (a3 == 8) {
                                        if (!(z2 & true)) {
                                            this.e = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.e.add(Integer.valueOf(gVar.f()));
                                    } else if (a3 == 10) {
                                        int c2 = gVar.c(gVar.s());
                                        if (!(z2 & true) && gVar.u() > 0) {
                                            this.e = new ArrayList();
                                            z2 |= true;
                                        }
                                        while (gVar.u() > 0) {
                                            this.e.add(Integer.valueOf(gVar.f()));
                                        }
                                        gVar.d(c2);
                                    } else if (a3 == 16) {
                                        if (!(z2 & true)) {
                                            this.g = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.g.add(Integer.valueOf(gVar.f()));
                                    } else if (a3 == 18) {
                                        int c3 = gVar.c(gVar.s());
                                        if (!(z2 & true) && gVar.u() > 0) {
                                            this.g = new ArrayList();
                                            z2 |= true;
                                        }
                                        while (gVar.u() > 0) {
                                            this.g.add(Integer.valueOf(gVar.f()));
                                        }
                                        gVar.d(c3);
                                    } else if (a3 == 26) {
                                        com.google.protobuf.f l = gVar.l();
                                        this.f4493d |= 1;
                                        this.i = l;
                                    } else if (a3 == 34) {
                                        com.google.protobuf.f l2 = gVar.l();
                                        this.f4493d |= 2;
                                        this.j = l2;
                                    } else if (a3 != 50) {
                                        if (!a(gVar, a2, pVar, a3)) {
                                        }
                                    } else {
                                        com.google.protobuf.f l3 = gVar.l();
                                        if (!(z2 & true)) {
                                            this.k = new com.google.protobuf.x();
                                            z2 |= true;
                                        }
                                        this.k.a(l3);
                                    }
                                }
                                z = true;
                            } catch (com.google.protobuf.u e) {
                                throw e.a(this);
                            }
                        } catch (IOException e2) {
                            throw new com.google.protobuf.u(e2).a(this);
                        }
                    } finally {
                        if (z2 & true) {
                            this.e = Collections.unmodifiableList(this.e);
                        }
                        if (z2 & true) {
                            this.g = Collections.unmodifiableList(this.g);
                        }
                        if (z2 & true) {
                            this.k = this.k.e();
                        }
                        this.f4720c = a2.t();
                        V();
                    }
                }
            }

            public static final j.a a() {
                return i.S;
            }

            @Override // com.google.protobuf.s
            protected s.f b() {
                return i.T.a(b.class, a.class);
            }

            public List<Integer> c() {
                return this.e;
            }

            public int d() {
                return this.e.size();
            }

            public List<Integer> e() {
                return this.g;
            }

            public int f() {
                return this.g.size();
            }

            public boolean g() {
                return (this.f4493d & 1) == 1;
            }

            public String h() {
                Object obj = this.i;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
                String e = fVar.e();
                if (fVar.f()) {
                    this.i = e;
                }
                return e;
            }

            public boolean i() {
                return (this.f4493d & 2) == 2;
            }

            public String j() {
                Object obj = this.j;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.f fVar = (com.google.protobuf.f) obj;
                String e = fVar.e();
                if (fVar.f()) {
                    this.j = e;
                }
                return e;
            }

            public al k() {
                return this.k;
            }

            public int l() {
                return this.k.size();
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                byte b2 = this.l;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.l = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public void writeTo(com.google.protobuf.h hVar) {
                getSerializedSize();
                if (c().size() > 0) {
                    hVar.c(10);
                    hVar.c(this.f);
                }
                for (int i = 0; i < this.e.size(); i++) {
                    hVar.b(this.e.get(i).intValue());
                }
                if (e().size() > 0) {
                    hVar.c(18);
                    hVar.c(this.h);
                }
                for (int i2 = 0; i2 < this.g.size(); i2++) {
                    hVar.b(this.g.get(i2).intValue());
                }
                if ((this.f4493d & 1) == 1) {
                    com.google.protobuf.s.a(hVar, 3, this.i);
                }
                if ((this.f4493d & 2) == 2) {
                    com.google.protobuf.s.a(hVar, 4, this.j);
                }
                for (int i3 = 0; i3 < this.k.size(); i3++) {
                    com.google.protobuf.s.a(hVar, 6, this.k.c(i3));
                }
                this.f4720c.writeTo(hVar);
            }

            @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.e.size(); i3++) {
                    i2 += com.google.protobuf.h.i(this.e.get(i3).intValue());
                }
                int i4 = i2 + 0;
                if (!c().isEmpty()) {
                    i4 = i4 + 1 + com.google.protobuf.h.i(i2);
                }
                this.f = i2;
                int i5 = 0;
                for (int i6 = 0; i6 < this.g.size(); i6++) {
                    i5 += com.google.protobuf.h.i(this.g.get(i6).intValue());
                }
                int i7 = i4 + i5;
                if (!e().isEmpty()) {
                    i7 = i7 + 1 + com.google.protobuf.h.i(i5);
                }
                this.h = i5;
                if ((this.f4493d & 1) == 1) {
                    i7 += com.google.protobuf.s.a(3, this.i);
                }
                if ((this.f4493d & 2) == 2) {
                    i7 += com.google.protobuf.s.a(4, this.j);
                }
                int i8 = 0;
                for (int i9 = 0; i9 < this.k.size(); i9++) {
                    i8 += a(this.k.c(i9));
                }
                int size = i7 + i8 + (k().size() * 1) + this.f4720c.getSerializedSize();
                this.memoizedSize = size;
                return size;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return super.equals(obj);
                }
                b bVar = (b) obj;
                boolean z = ((c().equals(bVar.c())) && e().equals(bVar.e())) && g() == bVar.g();
                if (g()) {
                    z = z && h().equals(bVar.h());
                }
                boolean z2 = z && i() == bVar.i();
                if (i()) {
                    z2 = z2 && j().equals(bVar.j());
                }
                return (z2 && k().equals(bVar.k())) && this.f4720c.equals(bVar.f4720c);
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + a().hashCode();
                if (d() > 0) {
                    hashCode = (((hashCode * 37) + 1) * 53) + c().hashCode();
                }
                if (f() > 0) {
                    hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
                }
                if (g()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
                }
                if (i()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + j().hashCode();
                }
                if (l() > 0) {
                    hashCode = (((hashCode * 37) + 6) * 53) + k().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.google.protobuf.ab
            /* renamed from: m */
            public a C() {
                return n();
            }

            public static a n() {
                return m.D();
            }

            @Override // com.google.protobuf.ac
            /* renamed from: o */
            public a D() {
                return this == m ? new a() : new a().a(this);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.s
            /* renamed from: a */
            public a b(s.b bVar) {
                return new a(bVar);
            }

            /* compiled from: DescriptorProtos.java */
            /* loaded from: classes.dex */
            public static final class a extends s.a<a> implements c {

                /* renamed from: a  reason: collision with root package name */
                private int f4494a;

                /* renamed from: b  reason: collision with root package name */
                private List<Integer> f4495b;

                /* renamed from: c  reason: collision with root package name */
                private List<Integer> f4496c;

                /* renamed from: d  reason: collision with root package name */
                private Object f4497d;
                private Object e;
                private com.google.protobuf.y f;

                @Override // com.google.protobuf.s.a, com.google.protobuf.ad
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.s.a
                protected s.f e() {
                    return i.T.a(b.class, a.class);
                }

                private a() {
                    this.f4495b = Collections.emptyList();
                    this.f4496c = Collections.emptyList();
                    this.f4497d = "";
                    this.e = "";
                    this.f = com.google.protobuf.x.f4766a;
                    j();
                }

                private a(s.b bVar) {
                    super(bVar);
                    this.f4495b = Collections.emptyList();
                    this.f4496c = Collections.emptyList();
                    this.f4497d = "";
                    this.e = "";
                    this.f = com.google.protobuf.x.f4766a;
                    j();
                }

                private void j() {
                    boolean z = com.google.protobuf.s.f4719b;
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
                public j.a getDescriptorForType() {
                    return i.S;
                }

                @Override // com.google.protobuf.af
                /* renamed from: f */
                public b F() {
                    return b.p();
                }

                @Override // com.google.protobuf.ac.a
                /* renamed from: g */
                public b t() {
                    b r = r();
                    if (!r.isInitialized()) {
                        throw b(r);
                    }
                    return r;
                }

                @Override // com.google.protobuf.ab.a
                /* renamed from: h */
                public b r() {
                    b bVar = new b(this);
                    int i = this.f4494a;
                    int i2 = 1;
                    if ((this.f4494a & 1) == 1) {
                        this.f4495b = Collections.unmodifiableList(this.f4495b);
                        this.f4494a &= -2;
                    }
                    bVar.e = this.f4495b;
                    if ((this.f4494a & 2) == 2) {
                        this.f4496c = Collections.unmodifiableList(this.f4496c);
                        this.f4494a &= -3;
                    }
                    bVar.g = this.f4496c;
                    if ((i & 4) != 4) {
                        i2 = 0;
                    }
                    bVar.i = this.f4497d;
                    if ((i & 8) == 8) {
                        i2 |= 2;
                    }
                    bVar.j = this.e;
                    if ((this.f4494a & 16) == 16) {
                        this.f = this.f.e();
                        this.f4494a &= -17;
                    }
                    bVar.k = this.f;
                    bVar.f4493d = i2;
                    u();
                    return bVar;
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: i */
                public a q() {
                    return (a) super.d();
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: a */
                public a f(j.f fVar, Object obj) {
                    return (a) super.f(fVar, obj);
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public a e(j.f fVar, Object obj) {
                    return (a) super.e(fVar, obj);
                }

                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
                /* renamed from: d */
                public a c(com.google.protobuf.ab abVar) {
                    if (abVar instanceof b) {
                        return a((b) abVar);
                    }
                    super.c(abVar);
                    return this;
                }

                public a a(b bVar) {
                    if (bVar == b.p()) {
                        return this;
                    }
                    if (!bVar.e.isEmpty()) {
                        if (this.f4495b.isEmpty()) {
                            this.f4495b = bVar.e;
                            this.f4494a &= -2;
                        } else {
                            k();
                            this.f4495b.addAll(bVar.e);
                        }
                        x();
                    }
                    if (!bVar.g.isEmpty()) {
                        if (this.f4496c.isEmpty()) {
                            this.f4496c = bVar.g;
                            this.f4494a &= -3;
                        } else {
                            l();
                            this.f4496c.addAll(bVar.g);
                        }
                        x();
                    }
                    if (bVar.g()) {
                        this.f4494a |= 4;
                        this.f4497d = bVar.i;
                        x();
                    }
                    if (bVar.i()) {
                        this.f4494a |= 8;
                        this.e = bVar.j;
                        x();
                    }
                    if (!bVar.k.isEmpty()) {
                        if (this.f.isEmpty()) {
                            this.f = bVar.k;
                            this.f4494a &= -17;
                        } else {
                            m();
                            this.f.addAll(bVar.k);
                        }
                        x();
                    }
                    d(bVar.f4720c);
                    x();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
                /* renamed from: d */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.google.protobuf.i.ag.b.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                    /*
                        r2 = this;
                        r0 = 0
                        com.google.protobuf.ai<com.google.protobuf.i$ag$b> r1 = com.google.protobuf.i.ag.b.f4492a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        com.google.protobuf.i$ag$b r3 = (com.google.protobuf.i.ag.b) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                        if (r3 == 0) goto Le
                        r2.a(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1f
                    L11:
                        r3 = move-exception
                        com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        com.google.protobuf.i$ag$b r4 = (com.google.protobuf.i.ag.b) r4     // Catch: java.lang.Throwable -> Lf
                        java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                        throw r3     // Catch: java.lang.Throwable -> L1d
                    L1d:
                        r3 = move-exception
                        r0 = r4
                    L1f:
                        if (r0 == 0) goto L24
                        r2.a(r0)
                    L24:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.ag.b.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$ag$b$a");
                }

                private void k() {
                    if ((this.f4494a & 1) != 1) {
                        this.f4495b = new ArrayList(this.f4495b);
                        this.f4494a |= 1;
                    }
                }

                private void l() {
                    if ((this.f4494a & 2) != 2) {
                        this.f4496c = new ArrayList(this.f4496c);
                        this.f4494a |= 2;
                    }
                }

                private void m() {
                    if ((this.f4494a & 16) != 16) {
                        this.f = new com.google.protobuf.x(this.f);
                        this.f4494a |= 16;
                    }
                }

                @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
                /* renamed from: b */
                public final a f(at atVar) {
                    return (a) super.f(atVar);
                }

                @Override // com.google.protobuf.s.a
                /* renamed from: c */
                public final a d(at atVar) {
                    return (a) super.a(atVar);
                }
            }

            public static b p() {
                return m;
            }

            @Override // com.google.protobuf.s, com.google.protobuf.ac
            public com.google.protobuf.ai<b> getParserForType() {
                return f4492a;
            }

            @Override // com.google.protobuf.af
            /* renamed from: q */
            public b F() {
                return m;
            }
        }

        public List<b> c() {
            return this.f4488d;
        }

        public int d() {
            return this.f4488d.size();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            for (int i = 0; i < this.f4488d.size(); i++) {
                hVar.a(1, this.f4488d.get(i));
            }
            this.f4720c.writeTo(hVar);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4488d.size(); i3++) {
                i2 += com.google.protobuf.h.c(1, this.f4488d.get(i3));
            }
            int serializedSize = i2 + this.f4720c.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ag)) {
                return super.equals(obj);
            }
            ag agVar = (ag) obj;
            return (c().equals(agVar.c())) && this.f4720c.equals(agVar.f4720c);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (d() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + c().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: e */
        public a C() {
            return f();
        }

        public static a f() {
            return f.D();
        }

        public static a a(ag agVar) {
            return f.D().a(agVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: g */
        public a D() {
            return this == f ? new a() : new a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public a b(s.b bVar) {
            return new a(bVar);
        }

        /* compiled from: DescriptorProtos.java */
        /* loaded from: classes.dex */
        public static final class a extends s.a<a> implements ah {

            /* renamed from: a  reason: collision with root package name */
            private int f4489a;

            /* renamed from: b  reason: collision with root package name */
            private List<b> f4490b;

            /* renamed from: c  reason: collision with root package name */
            private am<b, b.a, c> f4491c;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return i.R.a(ag.class, a.class);
            }

            private a() {
                this.f4490b = Collections.emptyList();
                j();
            }

            private a(s.b bVar) {
                super(bVar);
                this.f4490b = Collections.emptyList();
                j();
            }

            private void j() {
                if (com.google.protobuf.s.f4719b) {
                    l();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return i.Q;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ag F() {
                return ag.h();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ag t() {
                ag r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ag r() {
                ag agVar = new ag(this);
                int i = this.f4489a;
                if (this.f4491c != null) {
                    agVar.f4488d = this.f4491c.e();
                } else {
                    if ((this.f4489a & 1) == 1) {
                        this.f4490b = Collections.unmodifiableList(this.f4490b);
                        this.f4489a &= -2;
                    }
                    agVar.f4488d = this.f4490b;
                }
                u();
                return agVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public a q() {
                return (a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public a f(j.f fVar, Object obj) {
                return (a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public a e(j.f fVar, Object obj) {
                return (a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ag) {
                    return a((ag) abVar);
                }
                super.c(abVar);
                return this;
            }

            public a a(ag agVar) {
                if (agVar == ag.h()) {
                    return this;
                }
                if (this.f4491c == null) {
                    if (!agVar.f4488d.isEmpty()) {
                        if (this.f4490b.isEmpty()) {
                            this.f4490b = agVar.f4488d;
                            this.f4489a &= -2;
                        } else {
                            k();
                            this.f4490b.addAll(agVar.f4488d);
                        }
                        x();
                    }
                } else if (!agVar.f4488d.isEmpty()) {
                    if (!this.f4491c.d()) {
                        this.f4491c.a(agVar.f4488d);
                    } else {
                        this.f4491c.b();
                        am<b, b.a, c> amVar = null;
                        this.f4491c = null;
                        this.f4490b = agVar.f4488d;
                        this.f4489a &= -2;
                        if (com.google.protobuf.s.f4719b) {
                            amVar = l();
                        }
                        this.f4491c = amVar;
                    }
                }
                d(agVar.f4720c);
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.google.protobuf.i.ag.a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai<com.google.protobuf.i$ag> r1 = com.google.protobuf.i.ag.f4487a     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    com.google.protobuf.i$ag r3 = (com.google.protobuf.i.ag) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.u -> L11
                    if (r3 == 0) goto Le
                    r2.a(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1f
                L11:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.google.protobuf.i$ag r4 = (com.google.protobuf.i.ag) r4     // Catch: java.lang.Throwable -> Lf
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
                    throw r3     // Catch: java.lang.Throwable -> L1d
                L1d:
                    r3 = move-exception
                    r0 = r4
                L1f:
                    if (r0 == 0) goto L24
                    r2.a(r0)
                L24:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.ag.a.c(com.google.protobuf.g, com.google.protobuf.p):com.google.protobuf.i$ag$a");
            }

            private void k() {
                if ((this.f4489a & 1) != 1) {
                    this.f4490b = new ArrayList(this.f4490b);
                    this.f4489a |= 1;
                }
            }

            private am<b, b.a, c> l() {
                if (this.f4491c == null) {
                    List<b> list = this.f4490b;
                    boolean z = true;
                    if ((this.f4489a & 1) != 1) {
                        z = false;
                    }
                    this.f4491c = new am<>(list, z, w(), v());
                    this.f4490b = null;
                }
                return this.f4491c;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final a f(at atVar) {
                return (a) super.f(atVar);
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final a d(at atVar) {
                return (a) super.a(atVar);
            }
        }

        public static ag h() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ag> getParserForType() {
            return f4487a;
        }

        @Override // com.google.protobuf.af
        /* renamed from: i */
        public ag F() {
            return f;
        }
    }

    public static j.g a() {
        return Y;
    }

    static {
        j.g.a(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"G\n\u0011FileDescriptorSet\u00122\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProto\"Û\u0003\n\u0013FileDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007package\u0018\u0002 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u0012\u0019\n\u0011public_dependency\u0018\n \u0003(\u0005\u0012\u0017\n\u000fweak_dependency\u0018\u000b \u0003(\u0005\u00126\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u00128\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.", "ServiceDescriptorProto\u00128\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u0012-\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptions\u00129\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfo\u0012\u000e\n\u0006syntax\u0018\f \u0001(\t\"ð\u0004\n\u000fDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00124\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00128\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00125\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorPr", "oto\u00127\n\tenum_type\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u0012H\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRange\u00129\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProto\u00120\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptions\u0012F\n\u000ereserved_range\u0018\t \u0003(\u000b2..google.protobuf.DescriptorProto.ReservedRange\u0012\u0015\n\rreserved_name\u0018\n \u0003(\t\u001a,\n\u000eExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\u001a+\n\rReservedRang", "e\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"¼\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000e2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012\u0013\n\u000boneof_index\u0018\t \u0001(\u0005\u0012\u0011\n\tjson_name\u0018\n \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptions\"¶\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE", "_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\"T\n\u0014OneofDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012.\n\u0007options\u0018\u0002 \u0001(\u000b2\u001d.google.pro", "tobuf.OneofOptions\"\u008c\u0001\n\u0013EnumDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptions\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.proto", "buf.ServiceOptions\"Á\u0001\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ninput_type\u0018\u0002 \u0001(\t\u0012\u0013\n\u000boutput_type\u0018\u0003 \u0001(\t\u0012/\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptions\u0012\u001f\n\u0010client_streaming\u0018\u0005 \u0001(\b:\u0005false\u0012\u001f\n\u0010server_streaming\u0018\u0006 \u0001(\b:\u0005false\"´\u0005\n\u000bFileOptions\u0012\u0014\n\fjava_package\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014java_outer_classname\u0018\b \u0001(\t\u0012\"\n\u0013java_multiple_files\u0018\n \u0001(\b:\u0005false\u0012)\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\bB\u0002\u0018\u0001\u0012%\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005false", "\u0012F\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEED\u0012\u0012\n\ngo_package\u0018\u000b \u0001(\t\u0012\"\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005false\u0012$\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005false\u0012\"\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005false\u0012\u001f\n\u0010cc_enable_arenas\u0018\u001f \u0001(\b:\u0005false\u0012\u0019\n\u0011objc_class_prefix\u0018$ \u0001(\t\u0012\u0018\n\u0010csharp_namespace\u0018% \u0001(\t\u0012\u0014\n\fswift_prefix\u0018' \u0001(\t\u0012\u0018\n\u0010php_class_prefix\u0018( \u0001(\t\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.goo", "gle.protobuf.UninterpretedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b&\u0010'\"ò\u0001\n\u000eMessageOptions\u0012&\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005false\u0012.\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0011\n\tmap_entry\u0018\u0007 \u0001(\b\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\b\u0010\tJ\u0004\b\t\u0010\n\"\u009e\u0003\n\fFieldOptions\u0012:\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.prot", "obuf.FieldOptions.CType:\u0006STRING\u0012\u000e\n\u0006packed\u0018\u0002 \u0001(\b\u0012?\n\u0006jstype\u0018\u0006 \u0001(\u000e2$.google.protobuf.FieldOptions.JSType:\tJS_NORMAL\u0012\u0013\n\u0004lazy\u0018\u0005 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0013\n\u0004weak\u0018\n \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002\"5\n\u0006JSType\u0012\r\n\tJS_NORMAL\u0010\u0000\u0012\r\n\tJS_STRING\u0010\u0001\u0012\r\n\tJS_NUMBER\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005\"^\n\fOneofOptions\u0012C\n\u0014uninterpr", "eted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0093\u0001\n\u000bEnumOptions\u0012\u0013\n\u000ballow_alias\u0018\u0002 \u0001(\b\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0005\u0010\u0006\"}\n\u0010EnumValueOptions\u0012\u0019\n\ndeprecated\u0018\u0001 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"{\n\u000eServiceOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012C\n\u0014uninter", "preted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u00ad\u0002\n\rMethodOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012_\n\u0011idempotency_level\u0018\" \u0001(\u000e2/.google.protobuf.MethodOptions.IdempotencyLevel:\u0013IDEMPOTENCY_UNKNOWN\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"P\n\u0010IdempotencyLevel\u0012\u0017\n\u0013IDEMPOTENCY_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fNO_SIDE_EFFECTS\u0010\u0001\u0012\u000e\n\nIDEMPOTENT\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009e\u0002\n\u0013UninterpretedOption\u0012;\n", "\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.UninterpretedOption.NamePart\u0012\u0018\n\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0006 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u0012\u0017\n\u000faggregate_value\u0018\b \u0001(\t\u001a3\n\bNamePart\u0012\u0011\n\tname_part\u0018\u0001 \u0002(\t\u0012\u0014\n\fis_extension\u0018\u0002 \u0002(\b\"Õ\u0001\n\u000eSourceCodeInfo\u0012:\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.Location\u001a\u0086\u0001\n\bLocation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0010\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0018\n\u0010leadin", "g_comments\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011trailing_comments\u0018\u0004 \u0001(\t\u0012!\n\u0019leading_detached_comments\u0018\u0006 \u0003(\t\"§\u0001\n\u0011GeneratedCodeInfo\u0012A\n\nannotation\u0018\u0001 \u0003(\u000b2-.google.protobuf.GeneratedCodeInfo.Annotation\u001aO\n\nAnnotation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0013\n\u000bsource_file\u0018\u0002 \u0001(\t\u0012\r\n\u0005begin\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0004 \u0001(\u0005B\u008c\u0001\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001Z>github.com/golang/protobuf/protoc-gen-go/descriptor;descriptor¢\u0002\u0003GPBª\u0002\u001aGoogle.Protobuf.Reflection"}, new j.g[0], new j.g.a() { // from class: com.google.protobuf.i.1
            @Override // com.google.protobuf.j.g.a
            public com.google.protobuf.n a(j.g gVar) {
                j.g unused = i.Y = gVar;
                return null;
            }
        });
        f4450a = a().g().get(0);
        f4451b = new s.f(f4450a, new String[]{"File"});
        f4452c = a().g().get(1);
        f4453d = new s.f(f4452c, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", "Service", "Extension", "Options", "SourceCodeInfo", "Syntax"});
        e = a().g().get(2);
        f = new s.f(e, new String[]{"Name", "Field", "Extension", "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options", "ReservedRange", "ReservedName"});
        g = e.i().get(0);
        h = new s.f(g, new String[]{"Start", "End"});
        i = e.i().get(1);
        j = new s.f(i, new String[]{"Start", "End"});
        k = a().g().get(3);
        l = new s.f(k, new String[]{"Name", "Number", "Label", "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "JsonName", "Options"});
        m = a().g().get(4);
        n = new s.f(m, new String[]{"Name", "Options"});
        o = a().g().get(5);
        p = new s.f(o, new String[]{"Name", "Value", "Options"});
        q = a().g().get(6);
        r = new s.f(q, new String[]{"Name", "Number", "Options"});
        s = a().g().get(7);
        t = new s.f(s, new String[]{"Name", "Method", "Options"});
        u = a().g().get(8);
        v = new s.f(u, new String[]{"Name", "InputType", "OutputType", "Options", "ClientStreaming", "ServerStreaming"});
        w = a().g().get(9);
        x = new s.f(w, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "Deprecated", "CcEnableArenas", "ObjcClassPrefix", "CsharpNamespace", "SwiftPrefix", "PhpClassPrefix", "UninterpretedOption"});
        y = a().g().get(10);
        z = new s.f(y, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "MapEntry", "UninterpretedOption"});
        A = a().g().get(11);
        B = new s.f(A, new String[]{"Ctype", "Packed", "Jstype", "Lazy", "Deprecated", "Weak", "UninterpretedOption"});
        C = a().g().get(12);
        D = new s.f(C, new String[]{"UninterpretedOption"});
        E = a().g().get(13);
        F = new s.f(E, new String[]{"AllowAlias", "Deprecated", "UninterpretedOption"});
        G = a().g().get(14);
        H = new s.f(G, new String[]{"Deprecated", "UninterpretedOption"});
        I = a().g().get(15);
        J = new s.f(I, new String[]{"Deprecated", "UninterpretedOption"});
        K = a().g().get(16);
        L = new s.f(K, new String[]{"Deprecated", "IdempotencyLevel", "UninterpretedOption"});
        M = a().g().get(17);
        N = new s.f(M, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        O = M.i().get(0);
        P = new s.f(O, new String[]{"NamePart", "IsExtension"});
        Q = a().g().get(18);
        R = new s.f(Q, new String[]{"Location"});
        S = Q.i().get(0);
        T = new s.f(S, new String[]{"Path", "Span", "LeadingComments", "TrailingComments", "LeadingDetachedComments"});
        U = a().g().get(19);
        V = new s.f(U, new String[]{"Annotation"});
        W = U.i().get(0);
        X = new s.f(W, new String[]{"Path", "SourceFile", "Begin", "End"});
    }
}
