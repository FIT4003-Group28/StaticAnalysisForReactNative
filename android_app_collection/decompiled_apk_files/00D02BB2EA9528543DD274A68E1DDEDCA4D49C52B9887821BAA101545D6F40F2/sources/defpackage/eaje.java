package defpackage;
/* compiled from: PG */
/* renamed from: eaje  reason: default package */
/* loaded from: classes6.dex */
public class eaje implements eajy {
    public final eajy d;

    public eaje(eajy eajyVar) {
        if (eajyVar != null) {
            this.d = eajyVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // defpackage.eajy
    public long Te(eaiz eaizVar, long j) {
        throw null;
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.d.b();
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String obj = this.d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(obj).length());
        sb.append(simpleName);
        sb.append("(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
