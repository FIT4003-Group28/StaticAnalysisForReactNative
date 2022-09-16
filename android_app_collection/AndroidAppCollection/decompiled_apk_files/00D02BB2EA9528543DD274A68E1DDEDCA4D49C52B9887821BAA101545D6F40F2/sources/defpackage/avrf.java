package defpackage;
/* compiled from: PG */
/* renamed from: avrf  reason: default package */
/* loaded from: classes3.dex */
final class avrf {
    public final dlta a;
    public final avrh b;
    public final avfj c;
    public final avqu d;
    private final avpr e;
    private final bvjj f;
    private final awar g;
    private final avop h;
    private final avol i;

    public avrf(avpr avprVar, bvjj bvjjVar, awar awarVar, avop avopVar, dlta dltaVar, avol avolVar, avrh avrhVar, avfj avfjVar, avqu avquVar) {
        this.e = avprVar;
        this.f = bvjjVar;
        this.g = awarVar;
        this.h = avopVar;
        this.a = dltaVar;
        this.i = avolVar;
        this.b = avrhVar;
        this.c = avfjVar;
        this.d = avquVar;
    }

    @dzsi
    public final avre a(dlot dlotVar, int i, @dzsi int i2) {
        dlss dlssVar;
        dvfo dvfoVar;
        avol avolVar = this.i;
        try {
            dlssVar = (dlss) dsqw.cq(dlss.g, avolVar.c.d(avolVar.b, dlotVar.bS()));
        } catch (Exception e) {
            avolVar.a("assessOfflineUpdateResponse", e);
            dlssVar = dlss.g;
        }
        dlsk dlskVar = dlssVar.e;
        if (dlskVar == null) {
            dlskVar = dlsk.b;
        }
        if (dlskVar.a > 0) {
            avop avopVar = this.h;
            dlsk dlskVar2 = dlssVar.e;
            if (dlskVar2 == null) {
                dlskVar2 = dlsk.b;
            }
            double d = dlskVar2.a;
            Double.isNaN(d);
            ((ckcp) avopVar.a.a(ckia.z)).a(Math.round(d / 1048576.0d));
        }
        dloh bZ = dloj.f.bZ();
        dltc dltcVar = dlotVar.d;
        if (dltcVar == null) {
            dltcVar = dltc.a;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dloj dlojVar = (dloj) bZ.b;
        dltcVar.getClass();
        dlojVar.b = dltcVar;
        int i3 = 1;
        dlojVar.a |= 1;
        int i4 = 2;
        if (dlotVar.b == 1) {
            dvfo dvfoVar2 = (dvfo) dlotVar.c;
            dloj dlojVar2 = (dloj) bZ.b;
            dvfoVar2.getClass();
            dlojVar2.c = dvfoVar2;
            dlojVar2.a |= 2;
        }
        int i5 = dlssVar.a;
        if ((i5 & 1) != 0) {
            dlsp dlspVar = dlssVar.b;
            if (dlspVar == null) {
                dlspVar = dlsp.b;
            }
            int a = dvfn.a(dlspVar.a);
            if (a == 0) {
                a = 1;
            }
            if (a == 4) {
                ((ckco) this.h.a.a(ckia.b)).a(23);
                if (!this.f.m(bvjk.ev, false)) {
                    this.g.h();
                    this.f.S(bvjk.ev, true);
                }
            }
            if (a == 1 && i2 != 0) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dloj dlojVar3 = (dloj) bZ.b;
                dlojVar3.e = i2 - 1;
                dlojVar3.a |= 8;
            }
            if ((((dloj) bZ.b).a & 2) == 0 && a != 1) {
                dvfl bZ2 = dvfo.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dvfo dvfoVar3 = (dvfo) bZ2.b;
                dvfoVar3.b = a - 1;
                dvfoVar3.a |= 4;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dloj dlojVar4 = (dloj) bZ.b;
                dvfo bK = bZ2.bK();
                bK.getClass();
                dlojVar4.c = bK;
                dlojVar4.a |= 2;
            }
            avrh avrhVar = this.b;
            if ((((dloj) bZ.b).a & 2) != 0) {
                i4 = 3;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dloj dlojVar5 = (dloj) bZ.b;
            dlojVar5.d = i4 - 1;
            dlojVar5.a |= 4;
            ((avfm) avrhVar).a(bZ.bK(), this.d.a());
            return null;
        } else if ((i5 & 2) != 0) {
            dlsr dlsrVar = dlssVar.c;
            if (dlsrVar == null) {
                dlsrVar = dlsr.b;
            }
            long j = dlsrVar.a;
            avfj avfjVar = this.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dloj dlojVar6 = (dloj) bZ.b;
            dlojVar6.d = 3;
            dlojVar6.a |= 4;
            avfjVar.a(bZ.bK());
            dlsr dlsrVar2 = dlssVar.c;
            if (dlsrVar2 == null) {
                dlsrVar2 = dlsr.b;
            }
            return new avqs(dlsrVar2.a);
        } else if ((i5 & 4) == 0) {
            if (!this.i.k()) {
                this.f.S(bvjk.ev, false);
                avrh avrhVar2 = this.b;
                dlta dltaVar = this.a;
                if (dlotVar.b == 1) {
                    dvfoVar = (dvfo) dlotVar.c;
                } else {
                    dvfoVar = dvfo.c;
                }
                dvfo dvfoVar4 = dvfoVar;
                dlto dltoVar = dlssVar.f;
                if (dltoVar == null) {
                    dltoVar = dlto.a;
                }
                avrhVar2.c(dltaVar, dvfoVar4, dltoVar, i, this.d.a());
                return null;
            }
            this.b.d(this.d.a());
            return null;
        } else {
            dlsn dlsnVar = dlssVar.d;
            if (dlsnVar == null) {
                dlsnVar = dlsn.b;
            }
            long j2 = dlsnVar.a;
            avop avopVar2 = this.h;
            dltz b = dltz.b(this.a.c);
            if (b == null) {
                b = dltz.AUTOMATIC;
            }
            ckco ckcoVar = (ckco) avopVar2.a.a(ckia.H);
            int ordinal = b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i3 = 2;
                } else if (ordinal != 2) {
                    int i6 = b.d;
                    StringBuilder sb = new StringBuilder(98);
                    sb.append("UpdateState.Type not recognised during attempt to map to OfflineMetrics.UpdateTypeKey: ");
                    sb.append(i6);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    i3 = 3;
                }
            }
            ckcoVar.a(ckhz.a(i3));
            dltz b2 = dltz.b(this.a.c);
            if (b2 == null) {
                b2 = dltz.AUTOMATIC;
            }
            if (b2 == dltz.MANUAL) {
                final avpr avprVar = this.e;
                final avpp avppVar = new avpp();
                avprVar.b.execute(new Runnable(avprVar, avppVar) { // from class: avpq
                    private final avpr a;
                    private final Object b;

                    {
                        this.a = avprVar;
                        this.b = avppVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        avpr avprVar2 = this.a;
                        avprVar2.a.b(this.b);
                    }
                });
            }
            avrh avrhVar3 = this.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dloj dlojVar7 = (dloj) bZ.b;
            dlojVar7.d = 4;
            dlojVar7.a |= 4;
            ((avfm) avrhVar3).a(bZ.bK(), this.d.a());
            return null;
        }
    }
}
