package defpackage;
/* compiled from: PG */
/* renamed from: diqz  reason: default package */
/* loaded from: classes6.dex */
public final class diqz extends dsqs<diqz, diqy> implements dsqt {
    public static final diqz f;
    private static volatile dssr<diqz> h;
    public int a;
    public int b;
    public dsrj<dldj> c;
    public dsrj<dlas> d;
    public dsrj<dlas> e;
    private byte g = 2;

    static {
        diqz diqzVar = new diqz();
        f = diqzVar;
        dsqw.cc(diqz.class, diqzVar);
    }

    private diqz() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
        this.d = dssu.b;
        this.e = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0006\t\u0004\u0000\u0003\u0001\u0006ဌ\u0000\u0007Л\b\u001b\t\u001b", new Object[]{"a", "b", dqhy.c(), "c", dldj.class, "d", dlas.class, "e", dlas.class});
            }
            if (i2 == 3) {
                return new diqz();
            }
            if (i2 == 4) {
                return new diqy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<diqz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diqz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
