package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dvsl  reason: default package */
/* loaded from: classes.dex */
public final class dvsl extends dsqw<dvsl, dvse> implements dvsm {
    public static final dvsl o;
    private static volatile dssr<dvsl> q;
    public int a;
    public String b = "";
    public boolean c;
    public int d;
    public dsrj<String> e;
    public boolean f;
    public int g;
    public int h;
    public dvsg i;
    public dvsk j;
    public float k;
    public int l;
    public boolean m;
    public boolean n;
    private int p;

    static {
        dvsl dvslVar = new dvsl();
        o = dvslVar;
        dsqw.cc(dvsl.class, dvslVar);
    }

    private dvsl() {
        dssu<Object> dssuVar = dssu.b;
        this.e = dssu.b;
        dsqz dsqzVar = dsqz.b;
        this.f = true;
        this.g = 10;
        this.h = 5;
        this.k = 0.5f;
        this.l = 10;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0002\u0001B\r\u0000\u0001\u0000\u0001ဈ\u0001\u0005ဇ\t\tင\r\u0012င\u0014\u001bဉ\u001c\u001eဉ\u001f$င.1ခ(<ဇ9=ဇ:>ဌ\u0005@\u001aBဇ\u0004", new Object[]{"a", "p", "b", "f", "g", "h", "i", "j", "l", "k", "m", "n", "d", dvsh.a, "e", "c"});
            }
            if (i2 == 3) {
                return new dvsl();
            }
            if (i2 == 4) {
                return new dvse();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvsl> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dvsl.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dvsm
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dvsm
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.dvsm
    public final List<String> c() {
        return this.e;
    }

    @Override // defpackage.dvsm
    public final boolean d() {
        return this.f;
    }

    @Override // defpackage.dvsm
    public final int e() {
        return this.g;
    }

    @Override // defpackage.dvsm
    public final int f() {
        return this.h;
    }

    @Override // defpackage.dvsm
    public final dvsg g() {
        dvsg dvsgVar = this.i;
        return dvsgVar == null ? dvsg.b : dvsgVar;
    }

    @Override // defpackage.dvsm
    public final boolean h() {
        return (this.a & 268435456) != 0;
    }

    @Override // defpackage.dvsm
    public final dvsk i() {
        dvsk dvskVar = this.j;
        return dvskVar == null ? dvsk.e : dvskVar;
    }

    @Override // defpackage.dvsm
    public final float j() {
        return this.k;
    }

    @Override // defpackage.dvsm
    public final int k() {
        return this.l;
    }

    @Override // defpackage.dvsm
    public final boolean l() {
        return this.m;
    }

    @Override // defpackage.dvsm
    public final boolean m() {
        return this.n;
    }

    @Override // defpackage.dvsm
    public final int n() {
        int a = dvsi.a(this.d);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
