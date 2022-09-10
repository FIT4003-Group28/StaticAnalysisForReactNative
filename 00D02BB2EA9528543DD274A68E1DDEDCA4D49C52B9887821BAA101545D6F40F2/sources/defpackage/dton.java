package defpackage;
/* compiled from: PG */
/* renamed from: dton  reason: default package */
/* loaded from: classes6.dex */
public final class dton extends dsqs<dton, dtom> implements dsqt {
    public static final dton f;
    private static volatile dssr<dton> j;
    public int a;
    public dtkq b;
    public dthh c;
    public dthb d;
    private dthb g;
    private dthb h;
    private byte i = 2;
    public String e = "";

    static {
        dton dtonVar = new dton();
        f = dtonVar;
        dsqw.cc(dton.class, dtonVar);
    }

    private dton() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0003\u0001ဉ\u0000\u0002ဉ\u0002\u0004ᐉ\u0004\u0005ဈ\u0007\nᐉ\u0005\u000bᐉ\u0006", new Object[]{"a", "b", "c", "d", "e", "g", "h"});
            }
            if (i2 == 3) {
                return new dton();
            }
            if (i2 == 4) {
                return new dtom();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dton> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dton.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
