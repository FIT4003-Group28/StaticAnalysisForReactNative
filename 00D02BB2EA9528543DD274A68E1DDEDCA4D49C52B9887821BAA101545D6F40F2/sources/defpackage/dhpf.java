package defpackage;
/* compiled from: PG */
/* renamed from: dhpf  reason: default package */
/* loaded from: classes.dex */
public final class dhpf extends dsqw<dhpf, dhpe> implements dssk {
    public static final dhpf i;
    private static volatile dssr<dhpf> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public String h = "";

    static {
        dhpf dhpfVar = new dhpf();
        i = dhpfVar;
        dsqw.cc(dhpf.class, dhpfVar);
    }

    private dhpf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\bခ\u0005\tဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dhpf();
            }
            if (i3 == 4) {
                return new dhpe();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dhpf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhpf.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
