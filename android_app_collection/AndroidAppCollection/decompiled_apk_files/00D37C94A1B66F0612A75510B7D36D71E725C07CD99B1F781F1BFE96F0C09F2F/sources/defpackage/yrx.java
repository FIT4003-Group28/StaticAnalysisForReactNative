package defpackage;
/* compiled from: PG */
/* renamed from: yrx  reason: default package */
/* loaded from: classes4.dex */
public final class yrx implements axou {
    private final azqb a;

    public yrx(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static yrx a(azqb azqbVar) {
        return new yrx(azqbVar);
    }

    public static apfr c(yme ymeVar) {
        aopa aopaVar;
        apfz a = ymf.a(ymeVar.a());
        if ((a.b & 256) != 0) {
            apfs apfsVar = a.h;
            if (apfsVar == null) {
                apfsVar = apfs.a;
            }
            apfr apfrVar = apfsVar.b;
            if (apfrVar == null) {
                apfrVar = apfr.a;
            }
            aopaVar = apfrVar.mo52toBuilder();
        } else {
            aopaVar = null;
        }
        if (aopaVar != null) {
            try {
                ysy.c((apfr) aopaVar.mo39build());
            } catch (Exception e) {
                zep.d("Invalid AndroidCrolleyConfig from server", e);
            }
            apfr apfrVar2 = (apfr) aopaVar.mo39build();
            axzl.o(apfrVar2);
            return apfrVar2;
        }
        aopaVar = apfr.a.createBuilder();
        aopaVar.copyOnWrite();
        apfr apfrVar3 = (apfr) aopaVar.instance;
        apfrVar3.b |= 1;
        apfrVar3.c = true;
        aopaVar.copyOnWrite();
        apfr apfrVar4 = (apfr) aopaVar.instance;
        apfrVar4.b |= 2;
        apfrVar4.d = true;
        aopaVar.copyOnWrite();
        apfr apfrVar5 = (apfr) aopaVar.instance;
        apfrVar5.b |= 4;
        apfrVar5.e = 0;
        aopaVar.copyOnWrite();
        apfr apfrVar6 = (apfr) aopaVar.instance;
        apfrVar6.b |= 8;
        apfrVar6.f = 1;
        aopaVar.copyOnWrite();
        apfr apfrVar7 = (apfr) aopaVar.instance;
        apfrVar7.b |= 16;
        apfrVar7.g = 4;
        aopaVar.copyOnWrite();
        apfr apfrVar8 = (apfr) aopaVar.instance;
        apfrVar8.b |= 32;
        apfrVar8.h = 4;
        aopaVar.copyOnWrite();
        apfr apfrVar9 = (apfr) aopaVar.instance;
        apfrVar9.b |= 64;
        apfrVar9.i = 4;
        aopaVar.copyOnWrite();
        apfr apfrVar10 = (apfr) aopaVar.instance;
        apfrVar10.b |= 256;
        apfrVar10.k = false;
        apfr apfrVar22 = (apfr) aopaVar.mo39build();
        axzl.o(apfrVar22);
        return apfrVar22;
    }

    @Override // defpackage.azqb
    /* renamed from: b */
    public final apfr get() {
        return c((yme) this.a.get());
    }
}
