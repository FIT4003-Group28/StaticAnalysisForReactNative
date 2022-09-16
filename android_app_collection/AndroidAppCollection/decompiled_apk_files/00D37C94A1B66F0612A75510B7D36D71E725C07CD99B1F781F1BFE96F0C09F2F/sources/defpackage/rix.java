package defpackage;

import android.text.TextUtils;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rix  reason: default package */
/* loaded from: classes4.dex */
public final class rix {
    private boolean A;
    private String B;
    private long C;
    private String D;
    private long E;
    private long F;
    public final rlx a;
    public Boolean b;
    public List c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public String j;
    public boolean k;
    private final String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private long q;
    private long r;
    private long s;
    private String t;
    private long u;
    private String v;
    private long w;
    private long x;
    private boolean y;
    private long z;

    public rix(rlx rlxVar, String str) {
        qnm.b(rlxVar);
        qnm.l(str);
        this.a = rlxVar;
        this.l = str;
        rlxVar.r();
    }

    public final void A(String str) {
        this.a.r();
        this.k |= !rps.aq(this.v, str);
        this.v = str;
    }

    public final void B(String str) {
        this.a.r();
        this.k |= !rps.aq(this.t, str);
        this.t = str;
    }

    public final void C(long j) {
        this.a.r();
        this.k |= this.u != j;
        this.u = j;
    }

    public final void D(long j) {
        this.a.r();
        this.k |= this.E != j;
        this.E = j;
    }

    public final void E(long j) {
        this.a.r();
        this.k |= this.x != j;
        this.x = j;
    }

    public final void F(long j) {
        this.a.r();
        this.k |= this.C != j;
        this.C = j;
    }

    public final void G(long j) {
        this.a.r();
        this.k |= this.F != j;
        this.F = j;
    }

    public final void H(String str) {
        this.a.r();
        this.k |= !rps.aq(this.p, str);
        this.p = str;
    }

    public final void I(String str) {
        this.a.r();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= true ^ rps.aq(this.D, str);
        this.D = str;
    }

    public final void J(String str) {
        this.a.r();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= true ^ rps.aq(this.n, str);
        this.n = str;
    }

    public final void K(long j) {
        this.a.r();
        this.k |= this.w != j;
        this.w = j;
    }

    public final void L(String str) {
        this.a.r();
        this.k |= !rps.aq(this.j, str);
        this.j = str;
    }

    public final void M(long j) {
        this.a.r();
        this.k |= this.s != j;
        this.s = j;
    }

    public final void N(long j) {
        boolean z = true;
        qnm.c(j >= 0);
        this.a.r();
        boolean z2 = this.k;
        if (this.q == j) {
            z = false;
        }
        this.k = z | z2;
        this.q = j;
    }

    public final void O(long j) {
        this.a.r();
        this.k |= this.r != j;
        this.r = j;
    }

    public final void P(boolean z) {
        this.a.r();
        this.k |= this.y != z;
        this.y = z;
    }

    public final void Q(String str) {
        this.a.r();
        this.k |= !rps.aq(this.o, str);
        this.o = str;
    }

    public final boolean R() {
        this.a.r();
        return this.A;
    }

    public final boolean S() {
        this.a.r();
        return this.y;
    }

    public final long a() {
        this.a.r();
        return this.z;
    }

    public final long b() {
        this.a.r();
        return this.u;
    }

    public final long c() {
        this.a.r();
        return this.E;
    }

    public final long d() {
        this.a.r();
        return this.x;
    }

    public final long e() {
        this.a.r();
        return this.C;
    }

    public final long f() {
        this.a.r();
        return this.F;
    }

    public final long g() {
        this.a.r();
        return this.w;
    }

    public final long h() {
        this.a.r();
        return this.s;
    }

    public final long i() {
        this.a.r();
        return this.q;
    }

    public final long j() {
        this.a.r();
        return this.r;
    }

    public final Boolean k() {
        this.a.r();
        return this.b;
    }

    public final String l() {
        this.a.r();
        return this.B;
    }

    public final String m() {
        this.a.r();
        return this.l;
    }

    public final String n() {
        this.a.r();
        return this.m;
    }

    public final String o() {
        this.a.r();
        return this.v;
    }

    public final String p() {
        this.a.r();
        return this.t;
    }

    public final String q() {
        this.a.r();
        return this.p;
    }

    public final String r() {
        this.a.r();
        return this.D;
    }

    public final String s() {
        this.a.r();
        return this.n;
    }

    public final String t() {
        this.a.r();
        return this.o;
    }

    public final List u() {
        this.a.r();
        return this.c;
    }

    public final void v() {
        this.a.r();
        long j = this.q + 1;
        if (j > 2147483647L) {
            this.a.aG().f.b("Bundle index overflow. appId", rks.a(this.l));
            j = 0;
        }
        this.k = true;
        this.q = j;
    }

    public final void w(String str) {
        this.a.r();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= true ^ rps.aq(this.B, str);
        this.B = str;
    }

    public final void x(boolean z) {
        this.a.r();
        this.k |= this.A != z;
        this.A = z;
    }

    public final void y(long j) {
        this.a.r();
        this.k |= this.z != j;
        this.z = j;
    }

    public final void z(String str) {
        this.a.r();
        this.k |= !rps.aq(this.m, str);
        this.m = str;
    }
}
