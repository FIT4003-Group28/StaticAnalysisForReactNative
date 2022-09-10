package defpackage;
/* compiled from: PG */
/* renamed from: cvsb  reason: default package */
/* loaded from: classes5.dex */
public final class cvsb implements cvmu {
    private final cvsc a;
    private final cvsd b;
    private final cvsf c;
    private final cvrs d;

    public cvsb(cvrs cvrsVar, cvsc cvscVar, cvsd cvsdVar, cvsf cvsfVar) {
        this.d = cvrsVar;
        this.a = cvscVar;
        this.b = cvsdVar;
        this.c = cvsfVar;
    }

    private static void b(dbsg<Boolean> dbsgVar, final mw<drvs> mwVar) {
        c(dbsgVar, new mw(mwVar) { // from class: cvsa
            private final mw a;

            {
                this.a = mwVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.a(((Boolean) obj).booleanValue() ? drvs.TRUE : drvs.FALSE);
            }
        });
    }

    private static <T> void c(dbsg<T> dbsgVar, mw<? super T> mwVar) {
        if (dbsgVar.a()) {
            mwVar.a(dbsgVar.b());
        }
    }

    @Override // defpackage.cvmu
    public final drwa a() {
        if (!this.d.a()) {
            return drwa.f;
        }
        drvt bZ = drwa.f.bZ();
        final drvp bZ2 = drvq.f.bZ();
        if (dxxk.a.a().a()) {
            dbsg<Boolean> a = this.a.a();
            bZ2.getClass();
            b(a, new mw(bZ2) { // from class: cvrt
                private final drvp a;

                {
                    this.a = bZ2;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    drvp drvpVar = this.a;
                    drvs drvsVar = (drvs) obj;
                    if (drvpVar.c) {
                        drvpVar.bF();
                        drvpVar.c = false;
                    }
                    drvq drvqVar = (drvq) drvpVar.b;
                    drvq drvqVar2 = drvq.f;
                    drvqVar.b = drvsVar.d;
                    drvqVar.a |= 1;
                }
            });
        }
        if (dxxk.a.a().i()) {
            dbsg<Boolean> c = this.a.c();
            bZ2.getClass();
            b(c, new mw(bZ2) { // from class: cvru
                private final drvp a;

                {
                    this.a = bZ2;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    drvp drvpVar = this.a;
                    drvs drvsVar = (drvs) obj;
                    if (drvpVar.c) {
                        drvpVar.bF();
                        drvpVar.c = false;
                    }
                    drvq drvqVar = (drvq) drvpVar.b;
                    drvq drvqVar2 = drvq.f;
                    drvqVar.c = drvsVar.d;
                    drvqVar.a |= 2;
                }
            });
        }
        if (dxxk.a.a().b()) {
            c(this.a.b(), new mw(bZ2) { // from class: cvrv
                private final drvp a;

                {
                    this.a = bZ2;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    drvp drvpVar = this.a;
                    float floatValue = ((Float) obj).floatValue();
                    if (dxxk.b() == dcyn.a) {
                        if (drvpVar.c) {
                            drvpVar.bF();
                            drvpVar.c = false;
                        }
                        drvq drvqVar = (drvq) drvpVar.b;
                        drvq drvqVar2 = drvq.f;
                        drvqVar.a |= 4;
                        drvqVar.d = floatValue;
                    } else {
                        double d = floatValue;
                        double b = dxxk.b();
                        Double.isNaN(d);
                        float floor = (float) (Math.floor(d / b) * dxxk.b());
                        if (drvpVar.c) {
                            drvpVar.bF();
                            drvpVar.c = false;
                        }
                        drvq drvqVar3 = (drvq) drvpVar.b;
                        drvq drvqVar4 = drvq.f;
                        drvqVar3.a |= 4;
                        drvqVar3.d = floor;
                    }
                    float b2 = (float) dxxk.b();
                    if (drvpVar.c) {
                        drvpVar.bF();
                        drvpVar.c = false;
                    }
                    drvq drvqVar5 = (drvq) drvpVar.b;
                    drvqVar5.a |= 8;
                    drvqVar5.e = b2;
                }
            });
        }
        drvq bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drwa drwaVar = (drwa) bZ.b;
        bK.getClass();
        drwaVar.b = bK;
        drwaVar.a |= 1;
        final drvv bZ3 = drvx.e.bZ();
        if (dxxk.a.a().g()) {
            c(this.b.a(), new mw(bZ3) { // from class: cvrw
                private final drvv a;

                {
                    this.a = bZ3;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    int i;
                    drvv drvvVar = this.a;
                    cvse cvseVar = cvse.CELLULAR;
                    int ordinal = ((cvse) obj).ordinal();
                    if (ordinal == 0) {
                        i = 2;
                    } else if (ordinal != 1) {
                        throw new AssertionError("Invalid enum value.");
                    } else {
                        i = 3;
                    }
                    if (drvvVar.c) {
                        drvvVar.bF();
                        drvvVar.c = false;
                    }
                    drvx drvxVar = (drvx) drvvVar.b;
                    drvx drvxVar2 = drvx.e;
                    drvxVar.b = i - 1;
                    drvxVar.a |= 1;
                }
            });
        }
        if (dxxk.a.a().e()) {
            dbsg<Boolean> b = this.b.b();
            bZ3.getClass();
            b(b, new mw(bZ3) { // from class: cvrx
                private final drvv a;

                {
                    this.a = bZ3;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    drvv drvvVar = this.a;
                    drvs drvsVar = (drvs) obj;
                    if (drvvVar.c) {
                        drvvVar.bF();
                        drvvVar.c = false;
                    }
                    drvx drvxVar = (drvx) drvvVar.b;
                    drvx drvxVar2 = drvx.e;
                    drvxVar.c = drvsVar.d;
                    drvxVar.a |= 2;
                }
            });
        }
        if (dxxk.a.a().f()) {
            dbsg<Boolean> c2 = this.b.c();
            bZ3.getClass();
            b(c2, new mw(bZ3) { // from class: cvry
                private final drvv a;

                {
                    this.a = bZ3;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    drvv drvvVar = this.a;
                    drvs drvsVar = (drvs) obj;
                    if (drvvVar.c) {
                        drvvVar.bF();
                        drvvVar.c = false;
                    }
                    drvx drvxVar = (drvx) drvvVar.b;
                    drvx drvxVar2 = drvx.e;
                    drvxVar.d = drvsVar.d;
                    drvxVar.a |= 4;
                }
            });
        }
        drvx bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drwa drwaVar2 = (drwa) bZ.b;
        bK2.getClass();
        drwaVar2.c = bK2;
        drwaVar2.a |= 2;
        final drvy bZ4 = drvz.c.bZ();
        if (dxxk.a.a().h()) {
            dbsg<Integer> a2 = this.c.a();
            bZ4.getClass();
            c(a2, new mw(bZ4) { // from class: cvrz
                private final drvy a;

                {
                    this.a = bZ4;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    drvy drvyVar = this.a;
                    int intValue = ((Integer) obj).intValue();
                    if (drvyVar.c) {
                        drvyVar.bF();
                        drvyVar.c = false;
                    }
                    drvz drvzVar = (drvz) drvyVar.b;
                    drvz drvzVar2 = drvz.c;
                    drvzVar.a |= 1;
                    drvzVar.b = intValue;
                }
            });
        }
        drvz bK3 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drwa drwaVar3 = (drwa) bZ.b;
        bK3.getClass();
        drwaVar3.d = bK3;
        drwaVar3.a |= 4;
        return bZ.bK();
    }
}
