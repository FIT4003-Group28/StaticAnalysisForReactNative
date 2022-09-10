package defpackage;
/* compiled from: PG */
/* renamed from: eajd  reason: default package */
/* loaded from: classes6.dex */
public class eajd implements eajx {
    public final eajx b;

    public eajd(eajx eajxVar) {
        if (eajxVar != null) {
            this.b = eajxVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // defpackage.eajx
    public void a(eaiz eaizVar, long j) {
        throw null;
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.b.b();
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        this.b.flush();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length());
        sb.append(simpleName);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
