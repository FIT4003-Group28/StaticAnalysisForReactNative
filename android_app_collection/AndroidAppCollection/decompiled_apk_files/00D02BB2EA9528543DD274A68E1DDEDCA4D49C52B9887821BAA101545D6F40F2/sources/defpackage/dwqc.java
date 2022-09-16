package defpackage;
/* compiled from: PG */
/* renamed from: dwqc  reason: default package */
/* loaded from: classes6.dex */
public final class dwqc extends dsqw<dwqc, dwpr> implements dssk {
    public static final dwqc g;
    private static volatile dssr<dwqc> i;
    public int a;
    public Object c;
    public dvso e;
    public dwpz f;
    public int b = 0;
    private byte h = 2;
    public dsrj<dwpv> d = dssu.b;

    static {
        dwqc dwqcVar = new dwqc();
        g = dwqcVar;
        dsqw.cc(dwqc.class, dwqcVar);
    }

    private dwqc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u001b\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ᐉ\u0003\u0006ဉ\u0004", new Object[]{"c", "b", "a", "d", dwpv.class, dwpx.class, dwqb.class, dwpt.class, "e", "f"});
            }
            if (i3 == 3) {
                return new dwqc();
            }
            if (i3 == 4) {
                return new dwpr();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwqc> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwqc.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
