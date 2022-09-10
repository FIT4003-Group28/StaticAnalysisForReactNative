package defpackage;
/* compiled from: PG */
/* renamed from: ailn  reason: default package */
/* loaded from: classes2.dex */
public final class ailn extends dsqw<ailn, ailm> implements dssk {
    public static final ailn b;
    private static volatile dssr<ailn> c;
    public dsrj<ailr> a = dssu.b;

    static {
        ailn ailnVar = new ailn();
        b = ailnVar;
        dsqw.cc(ailn.class, ailnVar);
    }

    private ailn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ailr.class});
            }
            if (i2 == 3) {
                return new ailn();
            }
            if (i2 == 4) {
                return new ailm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ailn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
