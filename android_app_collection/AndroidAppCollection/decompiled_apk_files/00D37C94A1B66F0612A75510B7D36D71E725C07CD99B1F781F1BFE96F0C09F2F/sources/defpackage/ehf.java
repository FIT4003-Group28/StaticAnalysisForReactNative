package defpackage;
/* compiled from: PG */
/* renamed from: ehf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ehf implements ampg {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehf(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                boolean z2 = this.a;
                aopa mo52toBuilder = ((egw) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                egw egwVar = (egw) mo52toBuilder.instance;
                egwVar.b |= 1;
                egwVar.c = true;
                mo52toBuilder.copyOnWrite();
                egw egwVar2 = (egw) mo52toBuilder.instance;
                egwVar2.b |= 128;
                egwVar2.j = true;
                mo52toBuilder.copyOnWrite();
                egw egwVar3 = (egw) mo52toBuilder.instance;
                egwVar3.b |= 8;
                egwVar3.f = z2;
                return (egw) mo52toBuilder.mo39build();
            case 1:
                boolean z3 = this.a;
                egw egwVar4 = (egw) obj;
                aopa mo52toBuilder2 = egwVar4.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                egw egwVar5 = (egw) mo52toBuilder2.instance;
                egwVar5.b |= 1;
                egwVar5.c = z3;
                if (egwVar4.l || z3) {
                    z = true;
                }
                mo52toBuilder2.copyOnWrite();
                egw egwVar6 = (egw) mo52toBuilder2.instance;
                egwVar6.b |= 512;
                egwVar6.l = z;
                return (egw) mo52toBuilder2.mo39build();
            case 2:
                boolean z4 = this.a;
                aopa mo52toBuilder3 = ((fcy) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                fcy fcyVar = (fcy) mo52toBuilder3.instance;
                fcyVar.b = 1 | fcyVar.b;
                fcyVar.c = z4;
                return (fcy) mo52toBuilder3.mo39build();
            case 3:
                boolean z5 = this.a;
                aopa mo52toBuilder4 = ((fcy) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                fcy fcyVar2 = (fcy) mo52toBuilder4.instance;
                fcyVar2.b |= 4;
                fcyVar2.e = z5;
                return (fcy) mo52toBuilder4.mo39build();
            case 4:
                boolean z6 = this.a;
                aopa mo52toBuilder5 = ((fda) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                fda fdaVar = (fda) mo52toBuilder5.instance;
                fdaVar.b |= 2;
                fdaVar.d = z6;
                return (fda) mo52toBuilder5.mo39build();
            case 5:
                boolean z7 = this.a;
                aopa mo52toBuilder6 = ((fng) obj).mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                fng fngVar = (fng) mo52toBuilder6.instance;
                fngVar.b &= -2;
                fngVar.c = fng.a.c;
                mo52toBuilder6.copyOnWrite();
                fng fngVar2 = (fng) mo52toBuilder6.instance;
                fngVar2.b &= -3;
                fngVar2.d = fng.a.d;
                mo52toBuilder6.copyOnWrite();
                fng fngVar3 = (fng) mo52toBuilder6.instance;
                fngVar3.b &= -5;
                fngVar3.e = 0;
                mo52toBuilder6.copyOnWrite();
                fng fngVar4 = (fng) mo52toBuilder6.instance;
                fngVar4.b &= -9;
                fngVar4.f = 0L;
                mo52toBuilder6.copyOnWrite();
                fng fngVar5 = (fng) mo52toBuilder6.instance;
                fngVar5.b &= -17;
                fngVar5.g = -1L;
                if (!z7) {
                    mo52toBuilder6.copyOnWrite();
                    fng fngVar6 = (fng) mo52toBuilder6.instance;
                    fngVar6.b &= -33;
                    fngVar6.h = false;
                } else {
                    mo52toBuilder6.copyOnWrite();
                    fng fngVar7 = (fng) mo52toBuilder6.instance;
                    fngVar7.b |= 32;
                    fngVar7.h = true;
                }
                return (fng) mo52toBuilder6.mo39build();
            case 6:
                boolean z8 = this.a;
                llo lloVar = (llo) obj;
                aopa mo52toBuilder7 = lloVar.mo52toBuilder();
                lln llnVar = lloVar.c;
                if (llnVar == null) {
                    llnVar = lln.a;
                }
                aopa mo52toBuilder8 = llnVar.mo52toBuilder();
                mo52toBuilder8.copyOnWrite();
                lln llnVar2 = (lln) mo52toBuilder8.instance;
                llnVar2.b |= 1;
                llnVar2.c = z8;
                mo52toBuilder7.copyOnWrite();
                llo lloVar2 = (llo) mo52toBuilder7.instance;
                lln llnVar3 = (lln) mo52toBuilder8.mo39build();
                llnVar3.getClass();
                lloVar2.c = llnVar3;
                lloVar2.b |= 1;
                return (llo) mo52toBuilder7.mo39build();
            case 7:
                boolean z9 = this.a;
                jiq jiqVar = (jiq) obj;
                if (jiqVar != jiq.PLAYABLE && jiqVar != jiq.TRANSFER_PAUSED && jiqVar != jiq.TRANSFER_IN_PROGRESS && jiqVar != jiq.TRANSFER_WAITING_IN_QUEUE && !z9) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                return new jqk(this.a, ((Boolean) obj).booleanValue());
            case 9:
                boolean z10 = this.a;
                awvc awvcVar = (awvc) obj;
                if (awvcVar == null) {
                    return null;
                }
                aopa mo52toBuilder9 = awvcVar.mo52toBuilder();
                mo52toBuilder9.copyOnWrite();
                awvc awvcVar2 = (awvc) mo52toBuilder9.instance;
                awvcVar2.b |= 4;
                awvcVar2.e = z10;
                return (awvc) mo52toBuilder9.mo39build();
            case 10:
                boolean z11 = this.a;
                aopa mo52toBuilder10 = ((ljp) obj).mo52toBuilder();
                mo52toBuilder10.copyOnWrite();
                ljp ljpVar = (ljp) mo52toBuilder10.instance;
                ljpVar.b |= 16;
                ljpVar.g = z11;
                return (ljp) mo52toBuilder10.mo39build();
            case 11:
                Void r7 = (Void) obj;
                return Boolean.valueOf(this.a);
            case 12:
                boolean z12 = this.a;
                aopa mo52toBuilder11 = ((ljp) obj).mo52toBuilder();
                mo52toBuilder11.copyOnWrite();
                ljp ljpVar2 = (ljp) mo52toBuilder11.instance;
                ljpVar2.b |= 32;
                ljpVar2.h = z12;
                return (ljp) mo52toBuilder11.mo39build();
            case 13:
                Void r72 = (Void) obj;
                return Boolean.valueOf(this.a);
            case 14:
                boolean z13 = this.a;
                aopa mo52toBuilder12 = ((ljp) obj).mo52toBuilder();
                mo52toBuilder12.copyOnWrite();
                ljp ljpVar3 = (ljp) mo52toBuilder12.instance;
                ljpVar3.b |= 64;
                ljpVar3.i = z13;
                return (ljp) mo52toBuilder12.mo39build();
            case 15:
                Void r73 = (Void) obj;
                return Boolean.valueOf(this.a);
            case 16:
                boolean z14 = this.a;
                aopa mo52toBuilder13 = ((ljp) obj).mo52toBuilder();
                mo52toBuilder13.copyOnWrite();
                ljp ljpVar4 = (ljp) mo52toBuilder13.instance;
                ljpVar4.b |= 128;
                ljpVar4.j = z14;
                return (ljp) mo52toBuilder13.mo39build();
            case 17:
                Void r74 = (Void) obj;
                return Boolean.valueOf(this.a);
            case 18:
                boolean z15 = this.a;
                aopa mo52toBuilder14 = ((ljp) obj).mo52toBuilder();
                mo52toBuilder14.copyOnWrite();
                ljp ljpVar5 = (ljp) mo52toBuilder14.instance;
                ljpVar5.b |= 256;
                ljpVar5.k = z15;
                return (ljp) mo52toBuilder14.mo39build();
            case 19:
                Void r75 = (Void) obj;
                return Boolean.valueOf(this.a);
            default:
                boolean z16 = this.a;
                aopa mo52toBuilder15 = ((awuj) obj).mo52toBuilder();
                mo52toBuilder15.copyOnWrite();
                awuj awujVar = (awuj) mo52toBuilder15.instance;
                awujVar.b |= 1024;
                awujVar.s = z16;
                return (awuj) mo52toBuilder15.mo39build();
        }
    }
}
