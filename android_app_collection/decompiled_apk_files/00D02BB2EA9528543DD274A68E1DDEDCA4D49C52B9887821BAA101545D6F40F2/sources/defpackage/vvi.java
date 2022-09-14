package defpackage;
/* compiled from: PG */
/* renamed from: vvi  reason: default package */
/* loaded from: classes7.dex */
public final class vvi extends dsqw<vvi, vvh> implements vvj {
    public static final vvi f;
    private static volatile dssr<vvi> g;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public long e;

    static {
        vvi vviVar = new vvi();
        f = vviVar;
        dsqw.cc(vvi.class, vviVar);
    }

    private vvi() {
    }

    public static /* synthetic */ void c(vvi vviVar) {
        vviVar.a |= 4;
        vviVar.d = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဇ\u0002\u0004ဃ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new vvi();
            }
            if (i2 == 4) {
                return new vvh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vvi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (vvi.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.vvj
    public final boolean a() {
        return (this.a & 1) != 0;
    }

    @Override // defpackage.vvj
    public final long b() {
        return this.b;
    }
}
