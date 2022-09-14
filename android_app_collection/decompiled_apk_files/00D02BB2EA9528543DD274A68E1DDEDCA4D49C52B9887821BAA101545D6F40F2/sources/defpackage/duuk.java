package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: duuk  reason: default package */
/* loaded from: classes.dex */
public final class duuk extends dsqw<duuk, duuj> implements duul {
    public static final duuk k;
    private static volatile dssr<duuk> o;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean i;
    public boolean j;
    private int l;
    private int m;
    private int n;
    public int a = 2;
    public String b = "";
    public String c = "";
    public dsrf h = dsqz.b;

    static {
        duuk duukVar = new duuk();
        k = duukVar;
        dsqw.cc(duuk.class, duukVar);
    }

    private duuk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0003\u0001O\n\u0000\u0001\u0000\u0001င\u0000\u001eဈ\u001b\u001fဈ\u001c ဇ\u001d!ဇ\u001e(\u00163ဇ\u001f6ဇ$Mဇ'OဇF", new Object[]{"l", "m", "n", "a", "b", "c", "d", "e", "h", "f", "g", "i", "j"});
            }
            if (i2 == 3) {
                return new duuk();
            }
            if (i2 == 4) {
                return new duuj();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duuk> dssrVar = o;
            if (dssrVar == null) {
                synchronized (duuk.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.duul
    public final int a() {
        return this.a;
    }

    @Override // defpackage.duul
    public final String b() {
        return this.b;
    }

    @Override // defpackage.duul
    public final String c() {
        return this.c;
    }

    @Override // defpackage.duul
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.duul
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.duul
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.duul
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.duul
    public final List<Integer> h() {
        return this.h;
    }

    @Override // defpackage.duul
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.duul
    public final boolean j() {
        return this.j;
    }
}
