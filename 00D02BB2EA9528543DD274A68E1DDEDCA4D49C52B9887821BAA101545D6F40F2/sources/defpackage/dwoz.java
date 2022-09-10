package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dwoz  reason: default package */
/* loaded from: classes.dex */
public final class dwoz extends dsqw<dwoz, dwos> implements dwpa {
    public static final dwoz m;
    private static volatile dssr<dwoz> o;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public dsrf e = dsqz.b;
    public dwoy f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private int n;

    static {
        dwoz dwozVar = new dwoz();
        m = dwozVar;
        dsqw.cc(dwoz.class, dwozVar);
    }

    private dwoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0001\u0000\u0001ဇ\u0001\u0002ဇ\u0002\u0003ဇ\u0003\u0004\u0016\u0007ဇ\u0006\bဇ\b\nဇ\n\u000bဇ\u0000\fဇ\u000b\rဇ\f\u000fဇ\u000e\u0010ဉ\u0005", new Object[]{"n", "b", "c", "d", "e", "g", "h", "i", "a", "j", "k", "l", "f"});
            }
            if (i2 == 3) {
                return new dwoz();
            }
            if (i2 == 4) {
                return new dwos();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwoz> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dwoz.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dwpa
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.dwpa
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.dwpa
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.dwpa
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.dwpa
    public final List<Integer> e() {
        return this.e;
    }

    @Override // defpackage.dwpa
    public final dwoy f() {
        dwoy dwoyVar = this.f;
        return dwoyVar == null ? dwoy.b : dwoyVar;
    }

    @Override // defpackage.dwpa
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.dwpa
    public final boolean h() {
        return this.h;
    }

    @Override // defpackage.dwpa
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.dwpa
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.dwpa
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.dwpa
    public final boolean l() {
        return this.l;
    }
}
