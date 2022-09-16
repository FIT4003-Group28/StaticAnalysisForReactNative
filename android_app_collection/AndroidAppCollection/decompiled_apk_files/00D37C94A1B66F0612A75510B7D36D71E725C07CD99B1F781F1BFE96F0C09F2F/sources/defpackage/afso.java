package defpackage;
/* compiled from: PG */
/* renamed from: afso  reason: default package */
/* loaded from: classes.dex */
public final class afso {
    private final aqle a;
    private final int b;
    private final int c;
    private aqld d;
    private afta e;
    private aqlh f;
    private aqlh g;
    private aqlh h;
    private aqlh i;

    public afso(yme ymeVar) {
        atfw atfwVar = ymeVar.a().k;
        aqle aqleVar = (atfwVar == null ? atfw.a : atfwVar).j;
        aqleVar = aqleVar == null ? aqle.a : aqleVar;
        this.a = aqleVar;
        this.c = aqleVar.j;
        int i = aqleVar.c;
        boolean z = false;
        if (i >= 0 && aqleVar.d > i) {
            z = true;
        }
        this.b = !z ? 60 : i;
        if (z) {
            int i2 = aqleVar.d;
        }
    }

    private static final void q(aopa aopaVar, int i, int i2, int i3) {
        int b = aqmv.b(((aqlh) aopaVar.instance).e);
        if (b != 0 && b != 1 && (i = aqmv.b(((aqlh) aopaVar.instance).e)) == 0) {
            i = 1;
        }
        aopaVar.copyOnWrite();
        aqlh aqlhVar = (aqlh) aopaVar.instance;
        aqlhVar.e = i - 1;
        aqlhVar.b |= 4;
        int i4 = aqlhVar.c;
        boolean z = false;
        if (i4 >= 0 && aqlhVar.d > i4) {
            z = true;
        }
        if (z) {
            i2 = i4;
        }
        aopaVar.copyOnWrite();
        aqlh aqlhVar2 = (aqlh) aopaVar.instance;
        aqlhVar2.b |= 1;
        aqlhVar2.c = i2;
        if (z) {
            i3 = aqlhVar2.d;
        }
        aopaVar.copyOnWrite();
        aqlh aqlhVar3 = (aqlh) aopaVar.instance;
        aqlhVar3.b |= 2;
        aqlhVar3.d = i3;
    }

    private static final aqlh r(aopa aopaVar, aqll aqllVar) {
        aqll aqllVar2 = aqll.DELAYED_EVENT_TIER_UNSPECIFIED;
        int ordinal = aqllVar.ordinal();
        if (ordinal == 1) {
            q(aopaVar, 2, 60, 120);
        } else if (ordinal == 2) {
            q(aopaVar, 3, 60, 120);
        } else if (ordinal == 3) {
            q(aopaVar, 3, 4, 5);
        } else if (ordinal == 4) {
            q(aopaVar, 2, 60, 120);
        } else {
            q(aopaVar, 2, 60, 120);
        }
        return (aqlh) aopaVar.mo39build();
    }

    public final double a() {
        return this.a.m;
    }

    public final double b() {
        return this.a.p;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.a.h;
    }

    public final int e() {
        return this.b;
    }

    public final afta f() {
        aqlf aqlfVar;
        if (this.e == null) {
            aqle aqleVar = this.a;
            if ((aqleVar.b & 128) != 0) {
                aqlfVar = aqleVar.f;
                if (aqlfVar == null) {
                    aqlfVar = aqlf.a;
                }
            } else {
                aqlfVar = null;
            }
            this.e = new afsp(aqlfVar);
        }
        return this.e;
    }

    public final aqlh h() {
        if (this.f == null) {
            aqli aqliVar = this.a.g;
            if (aqliVar == null) {
                aqliVar = aqli.a;
            }
            aqlh aqlhVar = aqliVar.c;
            if (aqlhVar == null) {
                aqlhVar = aqlh.a;
            }
            this.f = r(aqlhVar.mo52toBuilder(), aqll.DELAYED_EVENT_TIER_DEFAULT);
        }
        return this.f;
    }

    public final aqlh i() {
        if (this.h == null) {
            aqli aqliVar = this.a.g;
            if (aqliVar == null) {
                aqliVar = aqli.a;
            }
            aqlh aqlhVar = aqliVar.d;
            if (aqlhVar == null) {
                aqlhVar = aqlh.a;
            }
            this.h = r(aqlhVar.mo52toBuilder(), aqll.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY);
        }
        return this.h;
    }

    public final aqlh j() {
        if (this.g == null) {
            aqli aqliVar = this.a.g;
            if (aqliVar == null) {
                aqliVar = aqli.a;
            }
            aqlh aqlhVar = aqliVar.e;
            if (aqlhVar == null) {
                aqlhVar = aqlh.a;
            }
            this.g = r(aqlhVar.mo52toBuilder(), aqll.DELAYED_EVENT_TIER_FAST);
        }
        return this.g;
    }

    public final aqlh k() {
        if (this.i == null) {
            aqli aqliVar = this.a.g;
            if (aqliVar == null) {
                aqliVar = aqli.a;
            }
            aqlh aqlhVar = aqliVar.f;
            if (aqlhVar == null) {
                aqlhVar = aqlh.a;
            }
            this.i = r(aqlhVar.mo52toBuilder(), aqll.DELAYED_EVENT_TIER_IMMEDIATE);
        }
        return this.i;
    }

    public final boolean l() {
        return this.a.l;
    }

    public final boolean m() {
        aqle aqleVar = this.a;
        if (aqleVar != null) {
            aqli aqliVar = aqleVar.g;
            if (aqliVar == null) {
                aqliVar = aqli.a;
            }
            return aqliVar.b;
        }
        return false;
    }

    public final boolean n() {
        return this.a.n;
    }

    public final boolean o() {
        aqle aqleVar = this.a;
        if ((aqleVar.b & 8388608) != 0) {
            return aqleVar.o;
        }
        return false;
    }

    public final boolean p() {
        return this.a.k;
    }

    public final aqld g() {
        aopa createBuilder;
        if (this.d == null) {
            aqle aqleVar = this.a;
            boolean z = true;
            if ((aqleVar.b & 16) == 0) {
                createBuilder = aqld.a.createBuilder();
                createBuilder.copyOnWrite();
                aqld aqldVar = (aqld) createBuilder.instance;
                aqldVar.b |= 1;
                aqldVar.c = true;
            } else {
                aqld aqldVar2 = aqleVar.e;
                if (aqldVar2 == null) {
                    aqldVar2 = aqld.a;
                }
                createBuilder = aqldVar2.mo52toBuilder();
            }
            aqld aqldVar3 = (aqld) createBuilder.instance;
            int i = aqldVar3.d;
            if (i < 0 || aqldVar3.e <= i) {
                z = false;
            }
            if (!z) {
                i = 0;
            }
            createBuilder.copyOnWrite();
            aqld aqldVar4 = (aqld) createBuilder.instance;
            aqldVar4.b |= 2;
            aqldVar4.d = i;
            int i2 = z ? aqldVar4.e : 10;
            createBuilder.copyOnWrite();
            aqld aqldVar5 = (aqld) createBuilder.instance;
            aqldVar5.b |= 4;
            aqldVar5.e = i2;
            this.d = (aqld) createBuilder.mo39build();
        }
        return this.d;
    }
}
