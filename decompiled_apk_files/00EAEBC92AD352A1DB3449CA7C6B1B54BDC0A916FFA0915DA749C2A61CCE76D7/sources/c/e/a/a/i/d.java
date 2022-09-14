package c.e.a.a.i;

import android.content.Context;
import c.e.a.a.i.s;
import c.e.a.a.i.w.j.b0;
import c.e.a.a.i.w.j.c0;
import c.e.a.a.i.w.j.i0;
import java.util.concurrent.Executor;
import javax.inject.Provider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends s {

    /* renamed from: b  reason: collision with root package name */
    private Provider<Executor> f3703b;

    /* renamed from: c  reason: collision with root package name */
    private Provider<Context> f3704c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f3705d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f3706e;

    /* renamed from: f  reason: collision with root package name */
    private Provider f3707f;

    /* renamed from: g  reason: collision with root package name */
    private Provider<b0> f3708g;

    /* renamed from: h  reason: collision with root package name */
    private Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f3709h;
    private Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> i;
    private Provider<c.e.a.a.i.w.c> j;
    private Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> k;
    private Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> l;
    private Provider<r> m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements s.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f3710a;

        private b() {
        }

        @Override // c.e.a.a.i.s.a
        /* renamed from: a */
        public b mo148a(Context context) {
            d.b.d.a(context);
            this.f3710a = context;
            return this;
        }

        @Override // c.e.a.a.i.s.a
        /* renamed from: a  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ s.a mo148a(Context context) {
            mo148a(context);
            return this;
        }

        @Override // c.e.a.a.i.s.a
        public s a() {
            d.b.d.a(this.f3710a, Context.class);
            return new d(this.f3710a);
        }
    }

    private d(Context context) {
        a(context);
    }

    private void a(Context context) {
        this.f3703b = d.b.a.a(j.a());
        this.f3704c = d.b.c.a(context);
        this.f3705d = com.google.android.datatransport.runtime.backends.j.a(this.f3704c, c.e.a.a.i.y.c.a(), c.e.a.a.i.y.d.a());
        this.f3706e = d.b.a.a(com.google.android.datatransport.runtime.backends.l.a(this.f3704c, this.f3705d));
        this.f3707f = i0.a(this.f3704c, c.e.a.a.i.w.j.f.a(), c.e.a.a.i.w.j.g.a());
        this.f3708g = d.b.a.a(c0.a(c.e.a.a.i.y.c.a(), c.e.a.a.i.y.d.a(), c.e.a.a.i.w.j.h.a(), this.f3707f));
        this.f3709h = c.e.a.a.i.w.g.a(c.e.a.a.i.y.c.a());
        this.i = c.e.a.a.i.w.i.a(this.f3704c, this.f3708g, this.f3709h, c.e.a.a.i.y.d.a());
        Provider<Executor> provider = this.f3703b;
        Provider provider2 = this.f3706e;
        Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> provider3 = this.i;
        Provider<b0> provider4 = this.f3708g;
        this.j = c.e.a.a.i.w.d.a(provider, provider2, provider3, provider4, provider4);
        Provider<Context> provider5 = this.f3704c;
        Provider provider6 = this.f3706e;
        Provider<b0> provider7 = this.f3708g;
        this.k = com.google.android.datatransport.runtime.scheduling.jobscheduling.n.a(provider5, provider6, provider7, this.i, this.f3703b, provider7, c.e.a.a.i.y.c.a());
        Provider<Executor> provider8 = this.f3703b;
        Provider<b0> provider9 = this.f3708g;
        this.l = com.google.android.datatransport.runtime.scheduling.jobscheduling.r.a(provider8, provider9, this.i, provider9);
        this.m = d.b.a.a(t.a(c.e.a.a.i.y.c.a(), c.e.a.a.i.y.d.a(), this.j, this.k, this.l));
    }

    public static s.a c() {
        return new b();
    }

    @Override // c.e.a.a.i.s
    c.e.a.a.i.w.j.c a() {
        return this.f3708g.mo254get();
    }

    @Override // c.e.a.a.i.s
    r b() {
        return this.m.mo254get();
    }
}
