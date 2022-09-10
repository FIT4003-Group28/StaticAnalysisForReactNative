package defpackage;
/* compiled from: PG */
/* renamed from: dhum  reason: default package */
/* loaded from: classes6.dex */
public final class dhum extends dsqw<dhum, dhuj> implements dssk {
    public static final dhum d;
    private static volatile dssr<dhum> g;
    public int a;
    public dnwb c;
    private dnqh e;
    private byte f = 2;
    public dsrj<dhul> b = dssu.b;

    static {
        dhum dhumVar = new dhum();
        d = dhumVar;
        dsqw.cc(dhum.class, dhumVar);
    }

    private dhum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", dhul.class, "e", "c"});
            }
            if (i2 == 3) {
                return new dhum();
            }
            if (i2 == 4) {
                return new dhuj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhum> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhum.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
