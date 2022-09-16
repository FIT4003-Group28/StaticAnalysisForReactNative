package defpackage;
/* compiled from: PG */
/* renamed from: ailh  reason: default package */
/* loaded from: classes2.dex */
public final class ailh extends dsqw<ailh, ailg> implements dssk {
    public static final ailh b;
    private static volatile dssr<ailh> c;
    public dsrj<doep> a = dssu.b;

    static {
        ailh ailhVar = new ailh();
        b = ailhVar;
        dsqw.cc(ailh.class, ailhVar);
    }

    private ailh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doep.class});
            }
            if (i2 == 3) {
                return new ailh();
            }
            if (i2 == 4) {
                return new ailg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ailh.class) {
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

    public final void b() {
        dsrj<doep> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
