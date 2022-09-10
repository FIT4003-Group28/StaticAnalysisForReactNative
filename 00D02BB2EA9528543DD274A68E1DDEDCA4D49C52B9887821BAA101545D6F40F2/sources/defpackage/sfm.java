package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfm  reason: default package */
/* loaded from: classes7.dex */
public final class sfm implements degu<dopk> {
    final /* synthetic */ saw a;
    final /* synthetic */ sfy b;

    public sfm(sfy sfyVar, saw sawVar) {
        this.b = sfyVar;
        this.a = sawVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.F().a(new Runnable(this) { // from class: sfl
            private final sfm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.f();
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        dopk dopkVar2 = dopkVar;
        if (dopkVar2 != null) {
            this.b.G(dopkVar2, this.a.j());
        }
    }
}
