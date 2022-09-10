package defpackage;
/* compiled from: PG */
/* renamed from: dwsn  reason: default package */
/* loaded from: classes6.dex */
public final class dwsn extends dsqw<dwsn, dwsc> implements dssk {
    public static final dwsn k;
    private static volatile dssr<dwsn> m;
    public int a;
    public Object c;
    public Object e;
    public dnqh f;
    public dhjx g;
    public dwpe h;
    public dwsi i;
    public dwrt j;
    public int b = 0;
    public int d = 0;
    private byte l = 2;

    static {
        dwsn dwsnVar = new dwsn();
        k = dwsnVar;
        dsqw.cc(dwsn.class, dwsnVar);
    }

    private dwsn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0002\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဉ\u0001\u0002ြ\u0000\u0003ြ\u0000\u0004ဉ\u0004\u0005ဉ\u0005\u0006ြ\u0001\u0007ြ\u0001\bဉ\b\tᐉ\u0000", new Object[]{"c", "b", "e", "d", "a", "g", dwsk.class, dwse.class, "h", "i", dwsm.class, dwsg.class, "j", "f"});
            }
            if (i2 == 3) {
                return new dwsn();
            }
            if (i2 == 4) {
                return new dwsc();
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
            dssr<dwsn> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dwsn.class) {
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
