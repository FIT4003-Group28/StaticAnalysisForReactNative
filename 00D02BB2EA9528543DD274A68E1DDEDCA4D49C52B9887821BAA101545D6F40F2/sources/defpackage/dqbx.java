package defpackage;
/* compiled from: PG */
/* renamed from: dqbx  reason: default package */
/* loaded from: classes6.dex */
public final class dqbx extends dsqw<dqbx, dqbw> implements dssk {
    public static final dqbx c;
    private static volatile dssr<dqbx> e;
    public int a;
    public dfpo b;
    private byte d = 2;

    static {
        dqbx dqbxVar = new dqbx();
        c = dqbxVar;
        dsqw.cc(dqbx.class, dqbxVar);
    }

    private dqbx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqbx();
            }
            if (i2 == 4) {
                return new dqbw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dqbx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqbx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
