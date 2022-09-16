package defpackage;
/* compiled from: PG */
/* renamed from: avlg  reason: default package */
/* loaded from: classes3.dex */
public final class avlg extends dsqw<avlg, avlf> implements dssk {
    public static final avlg d;
    private static volatile dssr<avlg> f;
    public int a;
    public long b;
    public dltm c;
    private byte e = 2;

    static {
        avlg avlgVar = new avlg();
        d = avlgVar;
        dsqw.cc(avlg.class, avlgVar);
    }

    private avlg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new avlg();
            }
            if (i2 == 4) {
                return new avlf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<avlg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (avlg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
