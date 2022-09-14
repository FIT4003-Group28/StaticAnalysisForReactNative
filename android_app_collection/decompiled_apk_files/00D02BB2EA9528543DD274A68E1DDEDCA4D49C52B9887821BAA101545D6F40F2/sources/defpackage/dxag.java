package defpackage;
/* compiled from: PG */
/* renamed from: dxag  reason: default package */
/* loaded from: classes6.dex */
public final class dxag extends dsqw<dxag, dxaf> implements dssk {
    public static final dxag i;
    private static volatile dssr<dxag> k;
    public int a;
    public dxae b;
    public dwzq e;
    public long f;
    public int h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public String g = "";

    static {
        dxag dxagVar = new dxag();
        i = dxagVar;
        dsqw.cc(dxag.class, dxagVar);
    }

    private dxag() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0007ဈ\u0006\bဋ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dxag();
            }
            if (i3 == 4) {
                return new dxaf();
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
            dssr<dxag> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dxag.class) {
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
