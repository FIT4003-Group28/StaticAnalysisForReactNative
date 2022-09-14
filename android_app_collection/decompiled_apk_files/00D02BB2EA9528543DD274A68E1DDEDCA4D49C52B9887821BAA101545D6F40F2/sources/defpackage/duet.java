package defpackage;
/* compiled from: PG */
/* renamed from: duet  reason: default package */
/* loaded from: classes6.dex */
public final class duet extends dsqw<duet, duem> implements dssk {
    public static final duet e;
    private static volatile dssr<duet> g;
    public dufm a;
    public String b = "";
    public dsrj<dues> c;
    public dayn d;
    private int f;

    static {
        duet duetVar = new duet();
        e = duetVar;
        dsqw.cc(duet.class, duetVar);
    }

    private duet() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0007\u001b\bဉ\u0005", new Object[]{"f", "a", "b", "c", dues.class, "d"});
            }
            if (i2 == 3) {
                return new duet();
            }
            if (i2 == 4) {
                return new duem();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duet> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duet.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
