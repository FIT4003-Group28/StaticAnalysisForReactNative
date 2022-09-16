package defpackage;
/* compiled from: PG */
/* renamed from: agye  reason: default package */
/* loaded from: classes2.dex */
public final class agye extends dsqw<agye, agyb> implements dssk {
    public static final agye d;
    private static volatile dssr<agye> e;
    public int a;
    public dsrj<agyd> b = dssu.b;
    public boolean c;

    static {
        agye agyeVar = new agye();
        d = agyeVar;
        dsqw.cc(agye.class, agyeVar);
    }

    private agye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"a", "b", agyd.class, "c"});
            }
            if (i2 == 3) {
                return new agye();
            }
            if (i2 == 4) {
                return new agyb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agye> dssrVar = e;
            if (dssrVar == null) {
                synchronized (agye.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
