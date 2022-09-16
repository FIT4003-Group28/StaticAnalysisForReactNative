package defpackage;
/* compiled from: PG */
/* renamed from: dqjy  reason: default package */
/* loaded from: classes6.dex */
public final class dqjy extends dsqw<dqjy, dqjx> implements dssk {
    public static final dqjy j;
    private static volatile dssr<dqjy> k;
    public int a;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean b = true;
    public boolean c = true;
    public dsrj<dpsl> i = dssu.b;

    static {
        dqjy dqjyVar = new dqjy();
        j = dqjyVar;
        dsqw.cc(dqjy.class, dqjyVar);
    }

    private dqjy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\bဇ\u0007\tဇ\b\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", dpsl.class});
            }
            if (i2 == 3) {
                return new dqjy();
            }
            if (i2 == 4) {
                return new dqjx();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqjy> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dqjy.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
