package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoxz  reason: default package */
/* loaded from: classes2.dex */
public final class aoxz implements btzi<djcq, djcu> {
    final /* synthetic */ aoyd a;

    public aoxz(aoyd aoydVar) {
        this.a = aoydVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djcq> btzrVar, btzy btzyVar) {
        this.a.j = false;
        this.a.j();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djcq> btzrVar, djcu djcuVar) {
        this.a.j = false;
        dcdc<aoxt> l = this.a.l(djcuVar.b, 3);
        synchronized (this.a.c) {
            dcpe<aoxt> listIterator = l.listIterator();
            while (listIterator.hasNext()) {
                aoxt next = listIterator.next();
                this.a.c.put(next.a().ai(), next);
            }
        }
        this.a.b.execute(new Runnable(this) { // from class: aoxy
            private final aoxz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                for (aowp aowpVar : this.a.a.d) {
                    aowy aowyVar = aowpVar.a;
                    aowyVar.k(aowyVar.i, aowyVar.r, aowyVar.j, aowyVar.k);
                }
            }
        });
        this.a.j();
    }
}
