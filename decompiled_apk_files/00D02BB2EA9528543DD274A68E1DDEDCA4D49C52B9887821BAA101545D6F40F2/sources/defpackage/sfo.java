package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfo  reason: default package */
/* loaded from: classes7.dex */
public final class sfo implements degu<dopk> {
    final /* synthetic */ bxmh a;
    final /* synthetic */ sfy b;

    public sfo(sfy sfyVar, bxmh bxmhVar) {
        this.b = sfyVar;
        this.a = bxmhVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof qdr)) {
            rzr F = this.b.F();
            final bxmh bxmhVar = this.a;
            F.a(new Runnable(this, bxmhVar) { // from class: sfn
                private final sfo a;
                private final bxmh b;

                {
                    this.a = this;
                    this.b = bxmhVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    sfo sfoVar = this.a;
                    sfoVar.b.u(this.b);
                }
            });
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        if (dopkVar != null) {
            this.b.r();
        }
    }
}
