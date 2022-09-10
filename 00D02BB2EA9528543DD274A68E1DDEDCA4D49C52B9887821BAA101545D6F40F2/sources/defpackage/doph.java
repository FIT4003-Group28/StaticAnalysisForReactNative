package defpackage;
/* compiled from: PG */
/* renamed from: doph  reason: default package */
/* loaded from: classes6.dex */
public final class doph extends dsqw<doph, dopg> implements dssk {
    public static final doph h;
    private static volatile dssr<doph> j;
    public int a;
    public int e;
    public long f;
    public int g;
    private byte i = 2;
    public String b = "";
    public dsrj<douj> c = dssu.b;
    public dsrj<dooo> d = dssu.b;

    static {
        doph dophVar = new doph();
        h = dophVar;
        dsqw.cc(doph.class, dophVar);
    }

    private doph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0002\u0001ဈ\u0000\u0002Л\u0003Л\u0005ဌ\u0001\u0006ဃ\u0002\u0007င\u0003", new Object[]{"a", "b", "c", douj.class, "d", dooo.class, "e", dool.c(), "f", "g"});
            }
            if (i2 == 3) {
                return new doph();
            }
            if (i2 == 4) {
                return new dopg();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<doph> dssrVar = j;
            if (dssrVar == null) {
                synchronized (doph.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
