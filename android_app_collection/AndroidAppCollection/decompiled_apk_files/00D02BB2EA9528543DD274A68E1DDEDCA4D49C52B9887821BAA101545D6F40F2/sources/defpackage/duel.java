package defpackage;
/* compiled from: PG */
/* renamed from: duel  reason: default package */
/* loaded from: classes6.dex */
public final class duel extends dsqw<duel, duek> implements dssk {
    public static final duel c;
    private static volatile dssr<duel> e;
    public String a = "";
    public int b;
    private int d;

    static {
        duel duelVar = new duel();
        c = duelVar;
        dsqw.cc(duel.class, duelVar);
    }

    private duel() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", duej.c()});
            }
            if (i2 == 3) {
                return new duel();
            }
            if (i2 == 4) {
                return new duek();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duel> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duel.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
