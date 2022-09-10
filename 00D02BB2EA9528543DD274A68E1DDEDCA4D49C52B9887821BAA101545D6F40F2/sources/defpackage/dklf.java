package defpackage;
/* compiled from: PG */
/* renamed from: dklf  reason: default package */
/* loaded from: classes6.dex */
public final class dklf extends dsqw<dklf, dkle> implements dssk {
    public static final dklf i;
    private static volatile dssr<dklf> k;
    public boolean a;
    public boolean b;
    public boolean c;
    public int d = 54000;
    public int e = cpnx.a;
    public int f = 604800;
    public boolean g;
    public boolean h;
    private int j;

    static {
        dklf dklfVar = new dklf();
        i = dklfVar;
        dsqw.cc(dklf.class, dklfVar);
    }

    private dklf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0004\u0004င\u0005\u0005ဇ\u0001\u0006င\u0006\u0007ဇ\u0007\bဇ\u0002\tဇ\b", new Object[]{"j", "a", "d", "e", "b", "f", "g", "c", "h"});
            }
            if (i3 == 3) {
                return new dklf();
            }
            if (i3 == 4) {
                return new dkle();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dklf> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dklf.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
