package defpackage;
/* compiled from: PG */
/* renamed from: dwkz  reason: default package */
/* loaded from: classes6.dex */
public final class dwkz extends dsqw<dwkz, dwkw> implements dssk {
    public static final dwkz k;
    private static volatile dssr<dwkz> m;
    public int a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean j;
    private byte l = 2;
    public String b = "";
    public dsrj<dwky> i = dssu.b;

    static {
        dwkz dwkzVar = new dwkz();
        k = dwkzVar;
        dsqw.cc(dwkz.class, dwkzVar);
    }

    private dwkz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001င\u0001\u0002င\u0002\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0006\u0007Л\bဈ\u0000\tဇ\u0007", new Object[]{"a", "c", "d", "e", "f", "g", "h", "i", dwky.class, "b", "j"});
            }
            if (i2 == 3) {
                return new dwkz();
            }
            if (i2 == 4) {
                return new dwkw();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dwkz> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dwkz.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
