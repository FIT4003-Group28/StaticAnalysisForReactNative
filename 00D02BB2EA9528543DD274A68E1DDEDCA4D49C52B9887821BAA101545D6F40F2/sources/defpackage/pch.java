package defpackage;
/* compiled from: PG */
/* renamed from: pch  reason: default package */
/* loaded from: classes7.dex */
public final class pch<T> extends btrh<T> {
    private final int d;

    public pch(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            pcg pcgVar = (pcg) this.a;
            pah pahVar = (pah) obj;
            if (pahVar.a.equals(pcgVar.g)) {
                return;
            }
            String str = pahVar.a;
            dcpd it = dcep.K(pcgVar.h.j()).iterator();
            while (it.hasNext()) {
                ((dehn) it.next()).cancel(false);
            }
            pcgVar.h.clear();
            pcgVar.g = pahVar.a;
            pcgVar.a(false);
        } else if (i != 1) {
            pcg pcgVar2 = (pcg) this.a;
            btas btasVar = (btas) obj;
            dcpd it2 = dcep.K(pcgVar2.h.j()).iterator();
            while (it2.hasNext()) {
                ((dehn) it2.next()).cancel(false);
            }
            pcgVar2.h.clear();
            pcgVar2.a(true);
        } else {
            final pcg pcgVar3 = (pcg) this.a;
            gds gdsVar = (gds) obj;
            pcgVar3.c.b(new Runnable(pcgVar3) { // from class: pca
                private final pcg a;

                {
                    this.a = pcgVar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final pcg pcgVar4 = this.a;
                    final dcdc r = dcdc.r(pcgVar4.d.a().t());
                    pcgVar4.c.b(new Runnable(pcgVar4, r) { // from class: pcb
                        private final pcg a;
                        private final dcdc b;

                        {
                            this.a = pcgVar4;
                            this.b = r;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            pcg pcgVar5 = this.a;
                            pcgVar5.i = this.b;
                            pcgVar5.a(false);
                        }
                    }, bvrj.UI_THREAD);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
    }
}
