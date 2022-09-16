package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afuy  reason: default package */
/* loaded from: classes.dex */
public final class afuy implements ynl {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private static final long b = TimeUnit.MINUTES.toSeconds(30);
    private final String c;
    private final yjs d;

    public afuy(yjs yjsVar, String str) {
        yjsVar.getClass();
        this.d = yjsVar;
        zgh.m(str);
        this.c = str;
    }

    public final synchronized void a() {
        this.d.e(this.c, 0L, true, 1, null, null, false);
    }

    public final synchronized void b() {
        this.d.d(this.c, a, b, false, 1, false, null, null);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                a();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
