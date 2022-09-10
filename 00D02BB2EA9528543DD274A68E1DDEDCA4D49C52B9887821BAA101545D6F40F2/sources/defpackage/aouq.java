package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aouq  reason: default package */
/* loaded from: classes2.dex */
public final class aouq implements angt<aogb, aoge> {
    final /* synthetic */ List a;
    final /* synthetic */ long b;
    final /* synthetic */ aogb c;
    final /* synthetic */ anfo d;

    public aouq(List list, long j, anfo anfoVar, aogb aogbVar) {
        this.a = list;
        this.b = j;
        this.d = anfoVar;
        this.c = aogbVar;
    }

    @Override // defpackage.angt
    public final void a(angu<aogb, aoge> anguVar) {
        if (this.a.isEmpty()) {
            anguVar.d(this);
            return;
        }
        aouv aouvVar = (aouv) anguVar;
        angs<D> angsVar = aouvVar.c;
        angr angrVar = ((angf) angsVar).a;
        if (angrVar != angr.SUCCESS && angrVar != angr.ERROR) {
            return;
        }
        if (angsVar.e()) {
            aoge aogeVar = (aoge) angsVar.f();
            dpop dpopVar = aogeVar.a().e;
            if (dpopVar == null) {
                dpopVar = dpop.d;
            }
            long j = dpopVar.b;
            long j2 = this.b;
            if (j <= j2) {
                dpop dpopVar2 = aogeVar.a().e;
                if (dpopVar2 == null) {
                    dpopVar2 = dpop.d;
                }
                if (j2 < dpopVar2.c) {
                    anfo anfoVar = this.d;
                    aogb aogbVar = (aogb) aouvVar.b;
                    fd d = anfoVar.d.b.d();
                    if (d instanceof anzy) {
                        anhq j3 = anfoVar.a.j();
                        j3.b(aogbVar.m());
                        j3.d(anhu.NO);
                        ((anzy) d).g(j3.k());
                    }
                    this.a.clear();
                }
            }
        }
        anguVar.d(this);
        if (!this.a.remove(this.c) || !this.a.isEmpty()) {
            return;
        }
        anfo anfoVar2 = this.d;
        fd d2 = anfoVar2.d.b.d();
        if (!(d2 instanceof anzy)) {
            return;
        }
        anhq j4 = anfoVar2.a.j();
        j4.d(anhu.NO);
        eaou eaouVar = anfoVar2.b;
        if (eaouVar == null) {
            j4.b(aogc.j(anfoVar2.d.d));
        } else {
            j4.b(new eapg(anfoVar2.c, eaouVar));
        }
        ((anzy) d2).i(j4.k());
    }
}
