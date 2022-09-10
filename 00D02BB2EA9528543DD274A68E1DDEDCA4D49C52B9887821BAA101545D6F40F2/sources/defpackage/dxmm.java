package defpackage;
/* compiled from: PG */
/* renamed from: dxmm  reason: default package */
/* loaded from: classes6.dex */
public final class dxmm extends dsqw<dxmm, dxml> implements dssk {
    public static final dxmm j;
    private static volatile dssr<dxmm> k;
    public Object b;
    public Object d;
    public dxnc f;
    public long g;
    public int h;
    public int i;
    public int a = 0;
    public int c = 0;
    public String e = "";

    static {
        dxmm dxmmVar = new dxmm();
        j = dxmmVar;
        dsqw.cc(dxmm.class, dxmmVar);
    }

    private dxmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0000\r\u0002\u0000\u0002É\r\u0000\u0000\u0000\u0002\f\u0003Ȉ\u0004\t\u0005\u0002\u0006\fe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000É<\u0001", new Object[]{"b", "a", "d", "c", "h", "e", "f", "g", "i", dxnz.class, dxme.class, dxol.class, dxnv.class, dxmc.class, dxod.class, dxoh.class, dxod.class});
            }
            if (i2 == 3) {
                return new dxmm();
            }
            if (i2 == 4) {
                return new dxml();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmm> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dxmm.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
