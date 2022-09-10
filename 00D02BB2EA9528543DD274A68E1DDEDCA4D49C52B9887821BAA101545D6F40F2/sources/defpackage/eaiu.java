package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: eaiu  reason: default package */
/* loaded from: classes6.dex */
final class eaiu implements eajy {
    final /* synthetic */ eajy a;
    final /* synthetic */ eaiw b;

    public eaiu(eaiw eaiwVar, eajy eajyVar) {
        this.b = eaiwVar;
        this.a = eajyVar;
    }

    @Override // defpackage.eajy
    public final long Te(eaiz eaizVar, long j) {
        this.b.d();
        try {
            try {
                long Te = this.a.Te(eaizVar, j);
                this.b.g(true);
                return Te;
            } catch (IOException e) {
                throw this.b.h(e);
            }
        } catch (Throwable th) {
            this.b.g(false);
            throw th;
        }
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.b;
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.d();
        try {
            try {
                this.a.close();
                this.b.g(true);
            } catch (IOException e) {
                throw this.b.h(e);
            }
        } catch (Throwable th) {
            this.b.g(false);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("AsyncTimeout.source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
