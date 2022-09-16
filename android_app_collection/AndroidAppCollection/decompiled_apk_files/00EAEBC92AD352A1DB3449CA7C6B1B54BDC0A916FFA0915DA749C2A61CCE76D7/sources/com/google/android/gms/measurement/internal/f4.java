package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f4 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a  reason: collision with root package name */
    private final d5 f7285a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7286b;

    /* renamed from: c  reason: collision with root package name */
    private String f7287c;

    /* renamed from: d  reason: collision with root package name */
    private String f7288d;

    /* renamed from: e  reason: collision with root package name */
    private String f7289e;

    /* renamed from: f  reason: collision with root package name */
    private String f7290f;

    /* renamed from: g  reason: collision with root package name */
    private long f7291g;

    /* renamed from: h  reason: collision with root package name */
    private long f7292h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(d5 d5Var, String str) {
        com.google.android.gms.common.internal.s.a(d5Var);
        com.google.android.gms.common.internal.s.b(str);
        this.f7285a = d5Var;
        this.f7286b = str;
        this.f7285a.a().g();
    }

    public final boolean A() {
        this.f7285a.a().g();
        return this.o;
    }

    public final long B() {
        this.f7285a.a().g();
        return this.f7291g;
    }

    public final long C() {
        this.f7285a.a().g();
        return this.F;
    }

    public final long D() {
        this.f7285a.a().g();
        return this.G;
    }

    public final void E() {
        this.f7285a.a().g();
        long j = this.f7291g + 1;
        if (j > 2147483647L) {
            this.f7285a.c().v().a("Bundle index overflow. appId", z3.a(this.f7286b));
            j = 0;
        }
        this.E = true;
        this.f7291g = j;
    }

    public final long F() {
        this.f7285a.a().g();
        return this.x;
    }

    public final long G() {
        this.f7285a.a().g();
        return this.y;
    }

    public final long H() {
        this.f7285a.a().g();
        return this.z;
    }

    public final long I() {
        this.f7285a.a().g();
        return this.A;
    }

    public final void a(long j) {
        this.f7285a.a().g();
        this.E |= this.f7292h != j;
        this.f7292h = j;
    }

    public final void a(Boolean bool) {
        this.f7285a.a().g();
        this.E |= !z9.a(this.t, bool);
        this.t = bool;
    }

    public final void a(String str) {
        this.f7285a.a().g();
        this.E |= !z9.c(this.f7287c, str);
        this.f7287c = str;
    }

    public final void a(List<String> list) {
        this.f7285a.a().g();
        if (!z9.a(this.v, list)) {
            this.E = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }

    public final void a(boolean z) {
        this.f7285a.a().g();
        this.E |= this.o != z;
        this.o = z;
    }

    public final boolean a() {
        this.f7285a.a().g();
        return this.E;
    }

    public final long b() {
        this.f7285a.a().g();
        return this.C;
    }

    public final void b(long j) {
        this.f7285a.a().g();
        this.E |= this.i != j;
        this.i = j;
    }

    public final void b(String str) {
        this.f7285a.a().g();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.c(this.f7288d, str);
        this.f7288d = str;
    }

    public final void b(boolean z) {
        this.f7285a.a().g();
        this.E |= this.q != z;
        this.q = z;
    }

    public final long c() {
        this.f7285a.a().g();
        return this.B;
    }

    public final void c(long j) {
        this.f7285a.a().g();
        this.E |= this.k != j;
        this.k = j;
    }

    public final void c(String str) {
        this.f7285a.a().g();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.c(this.s, str);
        this.s = str;
    }

    public final void c(boolean z) {
        this.f7285a.a().g();
        this.E |= this.r != z;
        this.r = z;
    }

    public final String d() {
        this.f7285a.a().g();
        return this.D;
    }

    public final void d(long j) {
        this.f7285a.a().g();
        this.E |= this.m != j;
        this.m = j;
    }

    public final void d(String str) {
        this.f7285a.a().g();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.c(this.w, str);
        this.w = str;
    }

    public final String e() {
        this.f7285a.a().g();
        String str = this.D;
        i((String) null);
        return str;
    }

    public final void e(long j) {
        this.f7285a.a().g();
        this.E |= this.n != j;
        this.n = j;
    }

    public final void e(String str) {
        this.f7285a.a().g();
        this.E |= !z9.c(this.f7289e, str);
        this.f7289e = str;
    }

    public final long f() {
        this.f7285a.a().g();
        return this.p;
    }

    public final void f(long j) {
        this.f7285a.a().g();
        this.E |= this.u != j;
        this.u = j;
    }

    public final void f(String str) {
        this.f7285a.a().g();
        this.E |= !z9.c(this.f7290f, str);
        this.f7290f = str;
    }

    public final void g(long j) {
        boolean z = true;
        com.google.android.gms.common.internal.s.a(j >= 0);
        this.f7285a.a().g();
        boolean z2 = this.E;
        if (this.f7291g == j) {
            z = false;
        }
        this.E = z | z2;
        this.f7291g = j;
    }

    public final void g(String str) {
        this.f7285a.a().g();
        this.E |= !z9.c(this.j, str);
        this.j = str;
    }

    public final boolean g() {
        this.f7285a.a().g();
        return this.q;
    }

    public final void h(long j) {
        this.f7285a.a().g();
        this.E |= this.F != j;
        this.F = j;
    }

    public final void h(String str) {
        this.f7285a.a().g();
        this.E |= !z9.c(this.l, str);
        this.l = str;
    }

    public final boolean h() {
        this.f7285a.a().g();
        return this.r;
    }

    public final Boolean i() {
        this.f7285a.a().g();
        return this.t;
    }

    public final void i(long j) {
        this.f7285a.a().g();
        this.E |= this.G != j;
        this.G = j;
    }

    public final void i(String str) {
        this.f7285a.a().g();
        this.E |= !z9.c(this.D, str);
        this.D = str;
    }

    public final List<String> j() {
        this.f7285a.a().g();
        return this.v;
    }

    public final void j(long j) {
        this.f7285a.a().g();
        this.E |= this.x != j;
        this.x = j;
    }

    public final void k() {
        this.f7285a.a().g();
        this.E = false;
    }

    public final void k(long j) {
        this.f7285a.a().g();
        this.E |= this.y != j;
        this.y = j;
    }

    public final String l() {
        this.f7285a.a().g();
        return this.f7286b;
    }

    public final void l(long j) {
        this.f7285a.a().g();
        this.E |= this.z != j;
        this.z = j;
    }

    public final String m() {
        this.f7285a.a().g();
        return this.f7287c;
    }

    public final void m(long j) {
        this.f7285a.a().g();
        this.E |= this.A != j;
        this.A = j;
    }

    public final String n() {
        this.f7285a.a().g();
        return this.f7288d;
    }

    public final void n(long j) {
        this.f7285a.a().g();
        this.E |= this.C != j;
        this.C = j;
    }

    public final String o() {
        this.f7285a.a().g();
        return this.s;
    }

    public final void o(long j) {
        this.f7285a.a().g();
        this.E |= this.B != j;
        this.B = j;
    }

    public final String p() {
        this.f7285a.a().g();
        return this.w;
    }

    public final void p(long j) {
        this.f7285a.a().g();
        this.E |= this.p != j;
        this.p = j;
    }

    public final String q() {
        this.f7285a.a().g();
        return this.f7289e;
    }

    public final String r() {
        this.f7285a.a().g();
        return this.f7290f;
    }

    public final long s() {
        this.f7285a.a().g();
        return this.f7292h;
    }

    public final long t() {
        this.f7285a.a().g();
        return this.i;
    }

    public final String u() {
        this.f7285a.a().g();
        return this.j;
    }

    public final long v() {
        this.f7285a.a().g();
        return this.k;
    }

    public final String w() {
        this.f7285a.a().g();
        return this.l;
    }

    public final long x() {
        this.f7285a.a().g();
        return this.m;
    }

    public final long y() {
        this.f7285a.a().g();
        return this.n;
    }

    public final long z() {
        this.f7285a.a().g();
        return this.u;
    }
}
