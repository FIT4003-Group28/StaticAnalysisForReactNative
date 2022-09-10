package defpackage;
/* compiled from: PG */
/* renamed from: azgf  reason: default package */
/* loaded from: classes3.dex */
final class azgf implements degu<baad> {
    final /* synthetic */ ddho a;
    final /* synthetic */ azgh b;

    public azgf(azgh azghVar, ddho ddhoVar) {
        this.b = azghVar;
        this.a = ddhoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        final baad baadVar2 = baadVar;
        batm batmVar = this.b.e;
        final ddho ddhoVar = this.a;
        batmVar.a(new Runnable(this, baadVar2, ddhoVar) { // from class: azge
            private final azgf a;
            private final baad b;
            private final ddho c;

            {
                this.a = this;
                this.b = baadVar2;
                this.c = ddhoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azgf azgfVar = this.a;
                azgfVar.b.g.a().i(this.b, this.c);
            }
        });
    }
}
