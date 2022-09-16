package defpackage;
/* compiled from: PG */
/* renamed from: docs  reason: default package */
/* loaded from: classes6.dex */
public final class docs extends dsqw<docs, docr> implements dssk {
    public static final docs d;
    private static volatile dssr<docs> i;
    public int a;
    public dsrj<drfc> b = dssu.b;
    public boolean c;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    static {
        docs docsVar = new docs();
        d = docsVar;
        dsqw.cc(docs.class, docsVar);
    }

    private docs() {
    }

    public static /* synthetic */ void b(docs docsVar) {
        docsVar.a |= 1;
        docsVar.e = true;
    }

    public static /* synthetic */ void c(docs docsVar) {
        docsVar.a |= 64;
        docsVar.h = true;
    }

    public static /* synthetic */ void d(docs docsVar) {
        docsVar.a |= 4;
        docsVar.f = true;
    }

    public static /* synthetic */ void e(docs docsVar) {
        docsVar.a |= 8;
        docsVar.g = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(d, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0001\u0000\u0002ဇ\u0000\u0005ဇ\u0002\u0006ဇ\u0003\b\u001b\nဇ\u0006\u000bဇ\u0007", new Object[]{"a", "e", "f", "g", "b", drfc.class, "h", "c"});
            }
            if (i3 == 3) {
                return new docs();
            }
            if (i3 == 4) {
                return new docr();
            }
            if (i3 == 5) {
                return d;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<docs> dssrVar = i;
            if (dssrVar == null) {
                synchronized (docs.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
