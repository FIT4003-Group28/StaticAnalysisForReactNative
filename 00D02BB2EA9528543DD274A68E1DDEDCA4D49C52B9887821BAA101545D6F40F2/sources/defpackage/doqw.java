package defpackage;
/* compiled from: PG */
/* renamed from: doqw  reason: default package */
/* loaded from: classes6.dex */
public final class doqw extends dsqw<doqw, doqu> implements dssk {
    public static final doqw c;
    private static volatile dssr<doqw> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        doqw doqwVar = new doqw();
        c = doqwVar;
        dsqw.cc(doqw.class, doqwVar);
    }

    private doqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\u000bြ\u0000", new Object[]{"b", "a", docu.class, doan.class, dnwp.class, doaf.class, dofn.class, dnjp.class, doqh.class, doez.class, dodm.class, dnms.class, dofb.class});
            }
            if (i2 == 3) {
                return new doqw();
            }
            if (i2 == 4) {
                return new doqu();
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
            dssr<doqw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doqw.class) {
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
