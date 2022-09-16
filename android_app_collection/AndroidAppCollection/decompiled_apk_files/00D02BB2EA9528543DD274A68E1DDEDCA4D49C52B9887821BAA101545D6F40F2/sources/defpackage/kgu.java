package defpackage;

import com.google.android.apps.maps.R;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: kgu  reason: default package */
/* loaded from: classes7.dex */
public final class kgu implements kcz<dcdc<ldm>> {
    final /* synthetic */ kgw a;

    public kgu(kgw kgwVar) {
        this.a = kgwVar;
    }

    @Override // defpackage.kcz
    public final void a(@dzsi bttq bttqVar) {
        ((ckco) this.a.l.a(ckee.ac)).a(0);
        btlu j = this.a.m.j();
        btlu.i(j).name();
        if (!Objects.equals(bttqVar, bttq.NO_CONNECTIVITY) || (j != null && !j.o())) {
            kgw kgwVar = this.a;
            kgwVar.o.B(kgwVar.a.getString(R.string.CAR_UNABLE_TO_RETRIEVE_RECENT_PLACES));
            return;
        }
        kgw kgwVar2 = this.a;
        kgwVar2.o.B(kgwVar2.a.getString(R.string.CAR_NO_PLACES_FOUND));
    }

    @Override // defpackage.kcz
    public final void b() {
        int i = kgw.x;
    }

    @Override // defpackage.kcz
    public final /* bridge */ /* synthetic */ void c(dcdc<ldm> dcdcVar, int i) {
        d(dcdcVar);
    }

    public final void d(dcdc<ldm> dcdcVar) {
        ddho ddhoVar;
        if (!this.a.o.b(khw.RECENT).booleanValue()) {
            return;
        }
        ((ckco) this.a.l.a(ckee.ac)).a(dcdcVar.size());
        this.a.g.B();
        dccx F = dcdc.F();
        this.a.m.j();
        int i = 0;
        int i2 = 0;
        while (i < dcdcVar.size()) {
            final ldm ldmVar = dcdcVar.get(i);
            int i3 = ldmVar.j;
            ddho ddhoVar2 = dtxm.as;
            if (i3 == 6) {
                ddhoVar2 = dtxm.ar;
            } else if (i3 == 7) {
                ddhoVar = dtxm.av;
                i3 = 7;
                final kls klsVar = new kls(this.a.a, ldmVar.b, ldmVar.c, ldmVar, nqu.as(i3, nqu.al()), nqu.ap(i3, nqu.G()), (CharSequence) null, this.a.w, i2, ddhoVar);
                F.g(klsVar);
                this.a.h.c(ldmVar, kgw.n(new bvqg(klsVar, ldmVar) { // from class: kgt
                    private final kls a;
                    private final ldm b;

                    {
                        this.a = klsVar;
                        this.b = ldmVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        ldm ldmVar2 = (ldm) obj;
                        this.a.m(this.b);
                    }
                }), dcdc.e());
                i++;
                i2++;
            }
            ddhoVar = ddhoVar2;
            final kls klsVar2 = new kls(this.a.a, ldmVar.b, ldmVar.c, ldmVar, nqu.as(i3, nqu.al()), nqu.ap(i3, nqu.G()), (CharSequence) null, this.a.w, i2, ddhoVar);
            F.g(klsVar2);
            this.a.h.c(ldmVar, kgw.n(new bvqg(klsVar2, ldmVar) { // from class: kgt
                private final kls a;
                private final ldm b;

                {
                    this.a = klsVar2;
                    this.b = ldmVar;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    ldm ldmVar2 = (ldm) obj;
                    this.a.m(this.b);
                }
            }), dcdc.e());
            i++;
            i2++;
        }
        this.a.g.z(new kkp(), F.f());
        this.a.g.s();
        if (i2 > 0) {
            this.a.o.A();
        } else {
            kgw kgwVar = this.a;
            kgwVar.o.B(kgwVar.a.getString(R.string.CAR_NO_PLACES_FOUND));
        }
        this.a.o();
    }
}
