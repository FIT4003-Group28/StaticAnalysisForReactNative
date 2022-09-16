package defpackage;
/* compiled from: PG */
/* renamed from: agci  reason: default package */
/* loaded from: classes.dex */
public final class agci {
    public boolean a;
    private final acrr b;
    private final acsf c;
    private final boolean d;

    public agci(acrr acrrVar, acsf acsfVar, aadd aaddVar, aacz aaczVar) {
        this.b = acrrVar;
        this.c = acsfVar;
        boolean z = false;
        if (aaczVar.b() != null) {
            asvs asvsVar = aaczVar.b().r;
            aqyy aqyyVar = (asvsVar == null ? asvs.a : asvsVar).c;
            if ((aqyyVar == null ? aqyy.a : aqyyVar).c) {
                z = true;
            }
        }
        this.d = z;
        aaddVar.a.as(new ayqb() { // from class: agch
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                agci agciVar = agci.this;
                arhd arhdVar = (arhd) obj;
                atps atpsVar = arhdVar.p;
                if (atpsVar == null) {
                    atpsVar = atps.a;
                }
                boolean z2 = false;
                if ((atpsVar.b & 16384) != 0) {
                    atps atpsVar2 = arhdVar.p;
                    if (atpsVar2 == null) {
                        atpsVar2 = atps.a;
                    }
                    atpq atpqVar = atpsVar2.m;
                    if (atpqVar == null) {
                        atpqVar = atpq.a;
                    }
                    if (atpqVar.b) {
                        z2 = true;
                    }
                }
                agciVar.a = z2;
            }
        });
    }

    public final void a(atom atomVar, apgq apgqVar) {
        if (apgqVar == null || (apgqVar.b & 16384) == 0) {
            return;
        }
        aton atonVar = apgqVar.t;
        if (atonVar == null) {
            atonVar = aton.a;
        }
        b(atomVar, atonVar);
    }

    public final void b(atom atomVar, aton atonVar) {
        if (atonVar == null) {
            return;
        }
        if (!this.a && !atonVar.c) {
            return;
        }
        acrr acrrVar = this.b;
        arrf a = arrh.a();
        atoj a2 = atok.a();
        a2.copyOnWrite();
        atok.c((atok) a2.instance, atonVar);
        a2.copyOnWrite();
        atok.d((atok) a2.instance, atomVar);
        a.copyOnWrite();
        ((arrh) a.instance).dj((atok) a2.mo39build());
        acrrVar.c((arrh) a.mo39build());
        if (!this.d) {
            return;
        }
        acsf acsfVar = this.c;
        acsd acsdVar = new acsd(atomVar.r, 2);
        aopa createBuilder = aqyu.a.createBuilder();
        aopa createBuilder2 = atol.a.createBuilder();
        createBuilder2.copyOnWrite();
        atol atolVar = (atol) createBuilder2.instance;
        atolVar.c = atonVar;
        atolVar.b |= 1;
        createBuilder.copyOnWrite();
        aqyu aqyuVar = (aqyu) createBuilder.instance;
        atol atolVar2 = (atol) createBuilder2.mo39build();
        atolVar2.getClass();
        aqyuVar.c = atolVar2;
        aqyuVar.b |= 1;
        acsdVar.a = (aqyu) createBuilder.mo39build();
        acsfVar.c(acsdVar, aqzj.FLOW_TYPE_NOTAIRE, atonVar.b);
    }

    public final void c(atom atomVar, aopa aopaVar) {
        if (aopaVar != null) {
            apgq apgqVar = (apgq) aopaVar.instance;
            if ((apgqVar.b & 16384) == 0) {
                return;
            }
            aton atonVar = apgqVar.t;
            if (atonVar == null) {
                atonVar = aton.a;
            }
            b(atomVar, atonVar);
        }
    }
}
