package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import java.util.Collections;
/* loaded from: classes.dex */
public class e<O extends a.d> implements g<O> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6808a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.gms.common.api.a<O> f6809b;

    /* renamed from: c  reason: collision with root package name */
    private final O f6810c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.b<O> f6811d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6812e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.m f6813f;

    /* renamed from: g  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.e f6814g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.gms.common.api.internal.m f6815a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f6816b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0147a {

            /* renamed from: a  reason: collision with root package name */
            private com.google.android.gms.common.api.internal.m f6817a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f6818b;

            public C0147a a(com.google.android.gms.common.api.internal.m mVar) {
                s.a(mVar, "StatusExceptionMapper must not be null.");
                this.f6817a = mVar;
                return this;
            }

            public a a() {
                if (this.f6817a == null) {
                    this.f6817a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.f6818b == null) {
                    this.f6818b = Looper.getMainLooper();
                }
                return new a(this.f6817a, this.f6818b);
            }
        }

        static {
            new C0147a().a();
        }

        private a(com.google.android.gms.common.api.internal.m mVar, Account account, Looper looper) {
            this.f6815a = mVar;
            this.f6816b = looper;
        }
    }

    public e(Context context, com.google.android.gms.common.api.a<O> aVar, O o, a aVar2) {
        s.a(context, "Null context is not permitted.");
        s.a(aVar, "Api must not be null.");
        s.a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f6808a = context.getApplicationContext();
        this.f6809b = aVar;
        this.f6810c = o;
        Looper looper = aVar2.f6816b;
        this.f6811d = com.google.android.gms.common.api.internal.b.a(this.f6809b, this.f6810c);
        new z(this);
        this.f6814g = com.google.android.gms.common.api.internal.e.a(this.f6808a);
        this.f6812e = this.f6814g.a();
        this.f6813f = aVar2.f6815a;
        this.f6814g.a((e<?>) this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.m r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.a(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.m):void");
    }

    private final <TResult, A extends a.b> c.e.a.b.g.h<TResult> a(int i, com.google.android.gms.common.api.internal.n<A, TResult> nVar) {
        c.e.a.b.g.i iVar = new c.e.a.b.g.i();
        this.f6814g.a(this, i, nVar, iVar, this.f6813f);
        return iVar.a();
    }

    public <TResult, A extends a.b> c.e.a.b.g.h<TResult> a(com.google.android.gms.common.api.internal.n<A, TResult> nVar) {
        return a(0, nVar);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.a$f] */
    public a.f a(Looper looper, e.a<O> aVar) {
        return this.f6809b.b().a(this.f6808a, looper, a().a(), (com.google.android.gms.common.internal.d) this.f6810c, (f.a) aVar, (f.b) aVar);
    }

    public i0 a(Context context, Handler handler) {
        return new i0(context, handler, a().a());
    }

    protected d.a a() {
        Account b2;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        d.a aVar = new d.a();
        O o = this.f6810c;
        if (!(o instanceof a.d.b) || (a3 = ((a.d.b) o).a()) == null) {
            O o2 = this.f6810c;
            b2 = o2 instanceof a.d.InterfaceC0145a ? ((a.d.InterfaceC0145a) o2).b() : null;
        } else {
            b2 = a3.q();
        }
        aVar.a(b2);
        O o3 = this.f6810c;
        aVar.a((!(o3 instanceof a.d.b) || (a2 = ((a.d.b) o3).a()) == null) ? Collections.emptySet() : a2.v());
        aVar.a(this.f6808a.getClass().getName());
        aVar.b(this.f6808a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> c.e.a.b.g.h<TResult> b(com.google.android.gms.common.api.internal.n<A, TResult> nVar) {
        return a(1, nVar);
    }

    public com.google.android.gms.common.api.internal.b<O> b() {
        return this.f6811d;
    }

    public O c() {
        return this.f6810c;
    }

    public final int d() {
        return this.f6812e;
    }
}
