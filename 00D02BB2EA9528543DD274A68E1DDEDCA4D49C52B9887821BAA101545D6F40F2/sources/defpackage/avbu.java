package defpackage;
/* compiled from: PG */
/* renamed from: avbu  reason: default package */
/* loaded from: classes2.dex */
public final class avbu implements crzp<avkr> {
    final /* synthetic */ avbv a;

    public avbu(avbv avbvVar) {
        this.a = avbvVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<avkr> crzmVar) {
        synchronized (this.a) {
            avkr l = crzmVar.l();
            dbsk.s(l);
            avks a = avkt.a(this.a.a, l);
            this.a.a = l;
            if (((avkn) a).a.isEmpty() && ((avkn) a).c.isEmpty()) {
                dcpd<dltm> it = ((avkn) a).b.values().iterator();
                while (it.hasNext()) {
                    if (!it.next().n) {
                    }
                }
            }
            avbv avbvVar = this.a;
            avbvVar.b.clear();
            dccr<dltm> values = l.c().values();
            if (values.isEmpty()) {
                avbvVar.d(false);
                avbvVar.c(false);
            } else {
                avbvVar.d(true);
                for (dltm dltmVar : values) {
                    if (avbvVar.f.a(dltmVar)) {
                        avzm avzmVar = avbvVar.e;
                        dlug dlugVar = dltmVar.c;
                        if (dlugVar == null) {
                            dlugVar = dlug.c;
                        }
                        dcdc<akqs> b = avzmVar.a(dlugVar).b();
                        if (b != null) {
                            avbvVar.b.addAll(b);
                        }
                    }
                }
                avbvVar.c(avbvVar.b());
            }
        }
    }
}
