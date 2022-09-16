package defpackage;
/* compiled from: PG */
/* renamed from: djdh  reason: default package */
/* loaded from: classes6.dex */
public final class djdh extends dsqw<djdh, djdg> implements dssk {
    public static final djdh f;
    private static volatile dssr<djdh> g;
    public int a;
    public int b;
    public boolean d;
    public dsrj<dqeg> c = dssu.b;
    public String e = "";

    static {
        djdh djdhVar = new djdh();
        f = djdhVar;
        dsqw.cc(djdh.class, djdhVar);
    }

    private djdh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0003ဇ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "c", dqeg.class, "d", "e"});
            }
            if (i2 == 3) {
                return new djdh();
            }
            if (i2 == 4) {
                return new djdg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djdh.class) {
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
}
