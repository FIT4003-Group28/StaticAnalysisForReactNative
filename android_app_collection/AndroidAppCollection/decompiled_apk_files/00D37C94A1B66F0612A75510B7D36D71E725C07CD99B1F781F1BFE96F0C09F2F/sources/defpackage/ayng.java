package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayng  reason: default package */
/* loaded from: classes2.dex */
public final class ayng extends aynd {
    private final aync a;
    private Object b;

    public ayng(aync ayncVar) {
        this.a = ayncVar;
    }

    @Override // defpackage.axzl
    public final void a(Status status, ayat ayatVar) {
        if (status.f()) {
            if (this.b == null) {
                this.a.e(Status.n.withDescription("No value received for unary call").g());
            }
            this.a.o(this.b);
            return;
        }
        this.a.e(status.g());
    }

    @Override // defpackage.axzl
    public final void b(ayat ayatVar) {
    }

    @Override // defpackage.aynd
    public final void q() {
        this.a.a.d(2);
    }

    @Override // defpackage.axzl
    public final void c(Object obj) {
        if (this.b == null) {
            this.b = obj;
            return;
        }
        throw Status.n.withDescription("More than one value received for unary call").d();
    }
}
