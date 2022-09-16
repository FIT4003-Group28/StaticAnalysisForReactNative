package defpackage;
/* compiled from: PG */
/* renamed from: arao  reason: default package */
/* loaded from: classes.dex */
final class arao implements arbw {
    final /* synthetic */ aras a;

    public arao(aras arasVar) {
        this.a = arasVar;
    }

    @Override // defpackage.arbw
    public final void a() {
        synchronized (this.a.b) {
            aras arasVar = this.a;
            if (!arasVar.j) {
                arasVar.j = true;
                if (arasVar.i) {
                    arasVar.c.b(new Runnable(this) { // from class: aram
                        private final arao a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final arao araoVar = this.a;
                            aras arasVar2 = araoVar.a;
                            akox akoxVar = arasVar2.f;
                            if (akoxVar == null) {
                                return;
                            }
                            arasVar2.l = bvqj.d(akoxVar.k, new bvqg(araoVar) { // from class: aran
                                private final arao a;

                                {
                                    this.a = araoVar;
                                }

                                @Override // defpackage.bvqg
                                public final void NU(Object obj) {
                                    arao araoVar2 = this.a;
                                    akoq akoqVar = (akoq) obj;
                                    float d = araoVar2.a.e.d();
                                    bvrj.UI_THREAD.c();
                                    akox akoxVar2 = araoVar2.a.f;
                                    if (akoxVar2 != null) {
                                        alad p = akoxVar2.k().p();
                                        aras arasVar3 = araoVar2.a;
                                        alaf a = alai.a();
                                        a.f = alah.LOCATION_ONLY;
                                        a.b = d;
                                        a.c = p.l;
                                        a.d = p.m;
                                        alae alaeVar = araoVar2.a.k;
                                        if (alaeVar == null) {
                                            alaeVar = alae.a;
                                        }
                                        a.e = alaeVar;
                                        arasVar3.j(a.a(), false);
                                    }
                                }
                            }, dege.a);
                        }
                    }, bvrj.UI_THREAD);
                }
            }
        }
    }
}
