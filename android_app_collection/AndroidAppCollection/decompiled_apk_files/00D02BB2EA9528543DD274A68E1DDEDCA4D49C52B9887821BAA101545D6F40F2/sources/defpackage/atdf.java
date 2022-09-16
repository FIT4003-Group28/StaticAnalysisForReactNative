package defpackage;
/* compiled from: PG */
/* renamed from: atdf  reason: default package */
/* loaded from: classes2.dex */
public final class atdf<T> extends btrh<T> {
    private final int d;

    public atdf(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        asac asacVar;
        int i = this.d;
        boolean z = true;
        if (i == 0) {
            atdb atdbVar = (atdb) this.a;
            crhp crhpVar = (crhp) obj;
            atdbVar.a.k = eapd.a();
            atdd atddVar = atdbVar.a;
            atddVar.l = crhpVar;
            atddVar.j = true;
            if (!crhpVar.d()) {
                ((atlo) atddVar.a).d(null);
                atddVar.J();
            } else {
                crqf e = crhpVar.e();
                ((atlo) atddVar.a).d(e);
                if (!e.j || (asacVar = atddVar.i) == null || !asacVar.a) {
                    if (atddVar.h.b() || ((atlo) atddVar.a).q == null) {
                        ((atlo) atddVar.a).q = atddVar.h.a();
                    }
                } else {
                    atddVar.J();
                }
            }
            atddVar.u();
            if (crhpVar.f()) {
                atddVar.e.j();
            } else if (crhpVar.d()) {
            } else {
                atddVar.e.q();
            }
        } else if (i == 1) {
            atdb atdbVar2 = (atdb) this.a;
            crhl crhlVar = ((crhk) obj).a;
            if (!(crhlVar instanceof crho)) {
                return;
            }
            crho crhoVar = (crho) crhlVar;
            aryr aryrVar = crhoVar.a;
            if (!aryrVar.j) {
                return;
            }
            cjqy cjqyVar = atdbVar2.a.f;
            cjta c = cjtd.c(aryrVar.i);
            c.d = dtxw.bX;
            cjqyVar.i(c.a());
            atdd atddVar2 = atdbVar2.a;
            ((atlo) atddVar2.a).h = crhoVar.a;
            S s = atddVar2.c;
            if (s == 0 || !((atlq) s).b()) {
                return;
            }
            atdbVar2.a.u();
        } else if (i == 2) {
            ((atdb) this.a).a((crhn) obj);
        } else if (i == 3) {
            atdb atdbVar3 = (atdb) this.a;
            aryn arynVar = (aryn) obj;
            if (!(arynVar instanceof aryr)) {
                return;
            }
            aryr aryrVar2 = (aryr) arynVar;
            if (!aryrVar2.j) {
                return;
            }
            cjqy cjqyVar2 = atdbVar3.a.f;
            cjta c2 = cjtd.c(aryrVar2.i);
            c2.d = dtxw.cd;
            cjqyVar2.i(c2.a());
            atdd atddVar3 = atdbVar3.a;
            ((atlo) atddVar3.a).h = aryrVar2;
            S s2 = atddVar3.c;
            if (s2 == 0 || !((atlq) s2).b()) {
                return;
            }
            atdbVar3.a.u();
        } else if (i != 4) {
            if (i != 5) {
                atdb atdbVar4 = (atdb) this.a;
                crih crihVar = (crih) obj;
                if (!atdbVar4.a.g.a() || !atdbVar4.a.g.b().i()) {
                    z = false;
                }
                if (z) {
                    atdbVar4.a.L();
                }
                atdd atddVar4 = atdbVar4.a;
                ((atlo) atddVar4.a).k = z;
                atddVar4.u();
                return;
            }
            atdb atdbVar5 = (atdb) this.a;
            bznv bznvVar = (bznv) obj;
            atdd atddVar5 = atdbVar5.a;
            ((atlo) atddVar5.a).u = true;
            S s3 = atddVar5.c;
            if (s3 == 0 || !((atlq) s3).b()) {
                return;
            }
            atdbVar5.a.u();
        } else {
            atdb atdbVar6 = (atdb) this.a;
            crhy crhyVar = (crhy) obj;
            crqw crqwVar = crhyVar.a;
            if (!(crqwVar instanceof crqq)) {
                return;
            }
            T t = ((crqq) crqwVar).a;
            if (!(t instanceof aryr)) {
                return;
            }
            aryr aryrVar3 = (aryr) t;
            if (crhyVar.b) {
                cjqy cjqyVar3 = atdbVar6.a.f;
                cjta c3 = cjtd.c(aryrVar3.i);
                c3.d = dtxw.bs;
                cjqyVar3.i(c3.a());
            }
            atdd atddVar6 = atdbVar6.a;
            ((atlo) atddVar6.a).h = null;
            S s4 = atddVar6.c;
            if (s4 == 0 || !((atlq) s4).b()) {
                return;
            }
            atdbVar6.a.u();
        }
    }
}
