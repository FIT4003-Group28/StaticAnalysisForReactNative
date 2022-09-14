package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0077a;
import com.google.protobuf.af;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: RepeatedFieldBuilderV3.java */
/* loaded from: classes.dex */
public class am<MType extends com.google.protobuf.a, BType extends a.AbstractC0077a, IType extends af> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private a.b f4329a;

    /* renamed from: b  reason: collision with root package name */
    private List<MType> f4330b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4331c;

    /* renamed from: d  reason: collision with root package name */
    private List<an<MType, BType, IType>> f4332d;
    private boolean e;
    private b<MType, BType, IType> f;
    private a<MType, BType, IType> g;
    private c<MType, BType, IType> h;

    public am(List<MType> list, boolean z, a.b bVar, boolean z2) {
        this.f4330b = list;
        this.f4331c = z;
        this.f4329a = bVar;
        this.e = z2;
    }

    public void b() {
        this.f4329a = null;
    }

    private void f() {
        if (!this.f4331c) {
            this.f4330b = new ArrayList(this.f4330b);
            this.f4331c = true;
        }
    }

    private void g() {
        if (this.f4332d == null) {
            this.f4332d = new ArrayList(this.f4330b.size());
            for (int i = 0; i < this.f4330b.size(); i++) {
                this.f4332d.add(null);
            }
        }
    }

    public int c() {
        return this.f4330b.size();
    }

    public boolean d() {
        return this.f4330b.isEmpty();
    }

    public MType a(int i) {
        return a(i, false);
    }

    private MType a(int i, boolean z) {
        if (this.f4332d == null) {
            return this.f4330b.get(i);
        }
        an<MType, BType, IType> anVar = this.f4332d.get(i);
        if (anVar == null) {
            return this.f4330b.get(i);
        }
        return z ? anVar.c() : anVar.b();
    }

    public BType b(int i) {
        g();
        an<MType, BType, IType> anVar = this.f4332d.get(i);
        if (anVar == null) {
            an<MType, BType, IType> anVar2 = new an<>(this.f4330b.get(i), this, this.e);
            this.f4332d.set(i, anVar2);
            anVar = anVar2;
        }
        return anVar.d();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.protobuf.af, IType extends com.google.protobuf.af] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.protobuf.af, IType extends com.google.protobuf.af] */
    public IType c(int i) {
        if (this.f4332d == null) {
            return this.f4330b.get(i);
        }
        an<MType, BType, IType> anVar = this.f4332d.get(i);
        if (anVar == null) {
            return this.f4330b.get(i);
        }
        return anVar.e();
    }

    public am<MType, BType, IType> a(MType mtype) {
        t.a(mtype);
        f();
        this.f4330b.add(mtype);
        if (this.f4332d != null) {
            this.f4332d.add(null);
        }
        h();
        i();
        return this;
    }

    public am<MType, BType, IType> a(Iterable<? extends MType> iterable) {
        for (MType mtype : iterable) {
            t.a(mtype);
        }
        int i = -1;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() == 0) {
                return this;
            }
            i = collection.size();
        }
        f();
        if (i >= 0 && (this.f4330b instanceof ArrayList)) {
            ((ArrayList) this.f4330b).ensureCapacity(this.f4330b.size() + i);
        }
        for (MType mtype2 : iterable) {
            a((am<MType, BType, IType>) mtype2);
        }
        h();
        i();
        return this;
    }

    public List<MType> e() {
        boolean z;
        this.e = true;
        if (!this.f4331c && this.f4332d == null) {
            return this.f4330b;
        }
        if (!this.f4331c) {
            int i = 0;
            while (true) {
                if (i >= this.f4330b.size()) {
                    z = true;
                    break;
                }
                MType mtype = this.f4330b.get(i);
                an<MType, BType, IType> anVar = this.f4332d.get(i);
                if (anVar != null && anVar.c() != mtype) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return this.f4330b;
            }
        }
        f();
        for (int i2 = 0; i2 < this.f4330b.size(); i2++) {
            this.f4330b.set(i2, a(i2, true));
        }
        this.f4330b = Collections.unmodifiableList(this.f4330b);
        this.f4331c = false;
        return this.f4330b;
    }

    private void h() {
        if (!this.e || this.f4329a == null) {
            return;
        }
        this.f4329a.a();
        this.e = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        h();
    }

    private void i() {
        if (this.f != null) {
            this.f.a();
        }
        if (this.g != null) {
            this.g.a();
        }
        if (this.h != null) {
            this.h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RepeatedFieldBuilderV3.java */
    /* loaded from: classes.dex */
    public static class b<MType extends com.google.protobuf.a, BType extends a.AbstractC0077a, IType extends af> extends AbstractList<MType> implements List<MType> {

        /* renamed from: a  reason: collision with root package name */
        am<MType, BType, IType> f4334a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4334a.c();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public MType get(int i) {
            return this.f4334a.a(i);
        }

        void a() {
            this.modCount++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RepeatedFieldBuilderV3.java */
    /* loaded from: classes.dex */
    public static class a<MType extends com.google.protobuf.a, BType extends a.AbstractC0077a, IType extends af> extends AbstractList<BType> implements List<BType> {

        /* renamed from: a  reason: collision with root package name */
        am<MType, BType, IType> f4333a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4333a.c();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public BType get(int i) {
            return this.f4333a.b(i);
        }

        void a() {
            this.modCount++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RepeatedFieldBuilderV3.java */
    /* loaded from: classes.dex */
    public static class c<MType extends com.google.protobuf.a, BType extends a.AbstractC0077a, IType extends af> extends AbstractList<IType> implements List<IType> {

        /* renamed from: a  reason: collision with root package name */
        am<MType, BType, IType> f4335a;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4335a.c();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public IType get(int i) {
            return this.f4335a.c(i);
        }

        void a() {
            this.modCount++;
        }
    }
}
