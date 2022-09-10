package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyze  reason: default package */
/* loaded from: classes6.dex */
public final class dyze<RespT> extends dyza<RespT> {
    private final dyyz<RespT> a;
    private RespT b;

    public dyze(dyyz<RespT> dyyzVar) {
        this.a = dyyzVar;
    }

    @Override // defpackage.dyew
    public final void a(dyhw dyhwVar) {
    }

    @Override // defpackage.dyew
    public final void b(dyjb dyjbVar, dyhw dyhwVar) {
        if (dyjbVar.i()) {
            if (this.b == null) {
                this.a.k(dyjb.l.g("No value received for unary call").k(dyhwVar));
            }
            this.a.j(this.b);
            return;
        }
        this.a.k(dyjbVar.k(dyhwVar));
    }

    @Override // defpackage.dyza
    public final void e() {
        this.a.a.c(2);
    }

    @Override // defpackage.dyew
    public final void c(RespT respt) {
        if (this.b == null) {
            this.b = respt;
            return;
        }
        throw dyjb.l.g("More than one value received for unary call").j();
    }
}
