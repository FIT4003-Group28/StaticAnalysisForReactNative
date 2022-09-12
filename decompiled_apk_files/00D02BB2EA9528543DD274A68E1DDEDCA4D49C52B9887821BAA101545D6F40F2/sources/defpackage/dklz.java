package defpackage;
/* compiled from: PG */
/* renamed from: dklz  reason: default package */
/* loaded from: classes.dex */
public final class dklz extends dsqw<dklz, dklg> implements dssk {
    public static final dklz o;
    private static volatile dssr<dklz> q;
    public boolean a;
    public dkls b;
    public dklk c;
    public dkly d;
    public dklo e;
    public dklu f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private int p;

    static {
        dklz dklzVar = new dklz();
        o = dklzVar;
        dsqw.cc(dklz.class, dklzVar);
    }

    private dklz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\u000e\u0000\u0001\u0002\u001a\u000e\u0000\u0000\u0000\u0002ဉ\u0004\u0003ဉ\u0005\u0004ဉ\u0006\u0006ဉ\u0007\bဇ\u0001\u000bဉ\b\u0010ဇ\r\u0012ဇ\u000f\u0013ဇ\u0010\u0014ဇ\u0011\u0015ဇ\u0012\u0017ဇ\u0014\u0019ဇ\u0016\u001aဇ\u0017", new Object[]{"p", "b", "c", "d", "e", "a", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new dklz();
            }
            if (i2 == 4) {
                return new dklg();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dklz> dssrVar = q;
            if (dssrVar == null) {
                synchronized (dklz.class) {
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
}
