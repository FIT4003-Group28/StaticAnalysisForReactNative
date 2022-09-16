package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: ojz  reason: default package */
/* loaded from: classes3.dex */
public final class ojz implements Closeable, ydp, ynl {
    public final oa a;
    private final azqb b;
    private final ydq c;

    public ojz(oa oaVar, ydq ydqVar, azqb azqbVar) {
        this.a = oaVar;
        this.c = ydqVar;
        this.b = azqbVar;
    }

    public final void a() {
        this.c.d(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.e(this);
    }

    @Override // defpackage.ydp
    public final void h() {
        ((afuy) this.b.get()).a();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                yhx yhxVar = (yhx) obj;
                this.a.onBackPressed();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{yhx.class};
    }

    @Override // defpackage.ydp
    public final void mE() {
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        ((afuy) this.b.get()).a();
    }
}
