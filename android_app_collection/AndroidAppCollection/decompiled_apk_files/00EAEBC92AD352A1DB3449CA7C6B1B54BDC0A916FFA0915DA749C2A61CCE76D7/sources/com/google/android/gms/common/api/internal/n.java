package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
/* loaded from: classes.dex */
public abstract class n<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.common.d[] f6902a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6903b;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        private l<A, c.e.a.b.g.i<ResultT>> f6904a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6905b;

        /* renamed from: c  reason: collision with root package name */
        private com.google.android.gms.common.d[] f6906c;

        private a() {
            this.f6905b = true;
        }

        public a<A, ResultT> a(l<A, c.e.a.b.g.i<ResultT>> lVar) {
            this.f6904a = lVar;
            return this;
        }

        public a<A, ResultT> a(boolean z) {
            this.f6905b = z;
            return this;
        }

        public a<A, ResultT> a(com.google.android.gms.common.d... dVarArr) {
            this.f6906c = dVarArr;
            return this;
        }

        public n<A, ResultT> a() {
            com.google.android.gms.common.internal.s.a(this.f6904a != null, "execute parameter required");
            return new m0(this, this.f6906c, this.f6905b);
        }
    }

    private n(com.google.android.gms.common.d[] dVarArr, boolean z) {
        this.f6902a = dVarArr;
        this.f6903b = z;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> c() {
        return new a<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(A a2, c.e.a.b.g.i<ResultT> iVar);

    public boolean a() {
        return this.f6903b;
    }

    public final com.google.android.gms.common.d[] b() {
        return this.f6902a;
    }
}
