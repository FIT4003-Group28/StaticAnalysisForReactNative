package defpackage;
/* compiled from: PG */
/* renamed from: ahna  reason: default package */
/* loaded from: classes2.dex */
public final class ahna extends dsqw<ahna, ahmx> implements dssk {
    public static final ahna g;
    private static volatile dssr<ahna> h;
    public int a;
    public dsrj<ahmz> b = dssu.b;
    public long c;
    public long d;
    public float e;
    public float f;

    static {
        ahna ahnaVar = new ahna();
        g = ahnaVar;
        dsqw.cc(ahna.class, ahnaVar);
    }

    private ahna() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001\u0004ခ\u0002\u0005ခ\u0003", new Object[]{"a", "b", ahmz.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ahna();
            }
            if (i2 == 4) {
                return new ahmx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ahna> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ahna.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
