package defpackage;
/* compiled from: PG */
/* renamed from: dtkb  reason: default package */
/* loaded from: classes6.dex */
public final class dtkb extends dsqw<dtkb, dtka> implements dssk {
    public static final dtkb f;
    private static volatile dssr<dtkb> h;
    public int a;
    public dtpb b;
    public dtlp c;
    public dtor d;
    public dtnt e;
    private byte g = 2;

    static {
        dtkb dtkbVar = new dtkb();
        f = dtkbVar;
        dsqw.cc(dtkb.class, dtkbVar);
    }

    private dtkb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtkb();
            }
            if (i2 == 4) {
                return new dtka();
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
            dssr<dtkb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtkb.class) {
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
