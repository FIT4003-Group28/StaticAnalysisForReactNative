package defpackage;
/* compiled from: PG */
/* renamed from: bjxo  reason: default package */
/* loaded from: classes3.dex */
final class bjxo implements btzi<djrg, djri> {
    final /* synthetic */ bjxp a;

    public bjxo(bjxp bjxpVar) {
        this.a = bjxpVar;
    }

    @Override // defpackage.btzi
    public final void QY(final btzr<djrg> btzrVar, btzy btzyVar) {
        this.a.c.b(new Runnable(this, btzrVar) { // from class: bjxn
            private final bjxo a;
            private final btzr b;

            {
                this.a = this;
                this.b = btzrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.d((djrg) this.b.a);
            }
        });
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djrg> btzrVar, djri djriVar) {
        this.a.b.b(new bjfa(4, 2));
    }
}
