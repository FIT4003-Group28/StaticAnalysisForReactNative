package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ayda  reason: default package */
/* loaded from: classes2.dex */
final class ayda implements ayeo {
    private final ayco a;
    private final aycv b;
    private InputStream c;
    private axyy d;

    public ayda(ayco aycoVar, aycv aycvVar) {
        this.a = aycoVar;
        this.b = aycvVar;
    }

    @Override // defpackage.ayeo
    public final axyb a() {
        throw null;
    }

    @Override // defpackage.ayeo
    public final void b(ayhk ayhkVar) {
    }

    @Override // defpackage.ayeo
    public final void c(Status status) {
        synchronized (this.a) {
            this.a.h(status);
        }
    }

    @Override // defpackage.ayml
    public final void d() {
    }

    @Override // defpackage.ayeo
    public final void e() {
        try {
            synchronized (this.b) {
                axyy axyyVar = this.d;
                if (axyyVar != null) {
                    this.b.b(axyyVar);
                }
                this.b.d();
                aycv aycvVar = this.b;
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    aycvVar.c(inputStream);
                }
                aycvVar.e();
                aycvVar.f();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.g(e.a);
            }
        }
    }

    @Override // defpackage.ayml
    public final void f() {
    }

    @Override // defpackage.ayml
    public final void g(int i) {
        synchronized (this.a) {
            this.a.m(i);
        }
    }

    @Override // defpackage.ayml
    public final void h(axyr axyrVar) {
    }

    @Override // defpackage.ayeo
    public final void i(axyy axyyVar) {
        this.d = axyyVar;
    }

    @Override // defpackage.ayeo
    public final void j(axzb axzbVar) {
    }

    @Override // defpackage.ayeo
    public final void k(int i) {
    }

    @Override // defpackage.ayeo
    public final void l(int i) {
    }

    @Override // defpackage.ayeo
    public final void m(ayeq ayeqVar) {
        synchronized (this.a) {
            this.a.k(this.b, ayeqVar);
        }
        if (this.b.g()) {
            ayeqVar.e();
        }
    }

    @Override // defpackage.ayml
    public final void n(InputStream inputStream) {
        if (this.c == null) {
            this.c = inputStream;
            return;
        }
        synchronized (this.a) {
            this.a.g(Status.n.withDescription("too many messages"));
        }
    }

    @Override // defpackage.ayml
    public final boolean o() {
        return this.b.g();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(valueOf2).length());
        sb.append("SingleMessageClientStream[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
