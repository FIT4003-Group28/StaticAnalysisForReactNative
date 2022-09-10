package defpackage;
/* compiled from: PG */
/* renamed from: dwpg  reason: default package */
/* loaded from: classes6.dex */
public final class dwpg extends dsqw<dwpg, dwpf> implements dssk {
    public static final dwpg c;
    private static volatile dssr<dwpg> d;
    public int a = 0;
    public Object b;

    static {
        dwpg dwpgVar = new dwpg();
        c = dwpgVar;
        dsqw.cc(dwpg.class, dwpgVar);
    }

    private dwpg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002်\u0000\u0003ျ\u0000", new Object[]{"b", "a", dwpj.class});
            }
            if (i2 == 3) {
                return new dwpg();
            }
            if (i2 == 4) {
                return new dwpf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwpg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
