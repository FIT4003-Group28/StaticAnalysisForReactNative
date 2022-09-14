package defpackage;
/* compiled from: PG */
/* renamed from: dtlh  reason: default package */
/* loaded from: classes6.dex */
public final class dtlh extends dsqw<dtlh, dtlg> implements dssk {
    public static final dtlh i;
    private static volatile dssr<dtlh> k;
    public int a;
    public int e;
    public dthb g;
    private byte j = 2;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public String d = "";
    public dsrj<String> f = dssu.b;
    public String h = "";

    static {
        dtlh dtlhVar = new dtlh();
        i = dtlhVar;
        dsqw.cc(dtlh.class, dtlhVar);
    }

    private dtlh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဌ\u0002\u0005\u001a\u0006ᐉ\u0003\u0007ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", drkp.c(), "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dtlh();
            }
            if (i3 == 4) {
                return new dtlg();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dtlh> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dtlh.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
