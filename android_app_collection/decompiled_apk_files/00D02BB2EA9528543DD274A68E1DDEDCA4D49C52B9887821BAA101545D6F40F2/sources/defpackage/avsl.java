package defpackage;
/* compiled from: PG */
/* renamed from: avsl  reason: default package */
/* loaded from: classes.dex */
final class avsl {
    final /* synthetic */ avsm a;
    @dzsi
    private btlu b = null;
    private boolean c = false;
    private final crzp<dbsg<Boolean>> d = new crzp(this) { // from class: avsk
        private final avsl a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            this.a.a.d();
        }
    };

    public avsl(avsm avsmVar) {
        this.a = avsmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(avzg avzgVar) {
        btlu a = avzgVar.a().a();
        if (this.c) {
            if (btlu.g(this.b, a)) {
                return;
            }
            this.a.e.p(bvjk.ei, this.b).c(this.d);
        }
        this.b = a;
        this.c = true;
        this.a.e.p(bvjk.ei, a).a(this.d, this.a.c);
    }
}
