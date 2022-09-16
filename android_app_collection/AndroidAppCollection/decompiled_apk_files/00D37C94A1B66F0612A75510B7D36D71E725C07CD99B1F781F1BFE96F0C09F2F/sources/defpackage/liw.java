package defpackage;
/* compiled from: PG */
/* renamed from: liw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class liw implements ampg {
    public final /* synthetic */ Boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ liw(Boolean bool, int i) {
        this.b = i;
        this.a = bool;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                Boolean bool = this.a;
                aopa mo52toBuilder = ((ljp) obj).mo52toBuilder();
                boolean booleanValue = bool.booleanValue();
                mo52toBuilder.copyOnWrite();
                ljp ljpVar = (ljp) mo52toBuilder.instance;
                ljpVar.b |= 16;
                ljpVar.g = booleanValue;
                return (ljp) mo52toBuilder.mo39build();
            case 1:
                Boolean bool2 = this.a;
                aopa mo52toBuilder2 = ((fda) obj).mo52toBuilder();
                boolean booleanValue2 = bool2.booleanValue();
                mo52toBuilder2.copyOnWrite();
                fda fdaVar = (fda) mo52toBuilder2.instance;
                fdaVar.b |= 128;
                fdaVar.k = booleanValue2;
                return (fda) mo52toBuilder2.mo39build();
            case 2:
                Boolean bool3 = this.a;
                aopa mo52toBuilder3 = ((ljp) obj).mo52toBuilder();
                boolean booleanValue3 = bool3.booleanValue();
                mo52toBuilder3.copyOnWrite();
                ljp ljpVar2 = (ljp) mo52toBuilder3.instance;
                ljpVar2.b |= 32;
                ljpVar2.h = booleanValue3;
                return (ljp) mo52toBuilder3.mo39build();
            case 3:
                Boolean bool4 = this.a;
                aopa mo52toBuilder4 = ((ljp) obj).mo52toBuilder();
                boolean booleanValue4 = bool4.booleanValue();
                mo52toBuilder4.copyOnWrite();
                ljp ljpVar3 = (ljp) mo52toBuilder4.instance;
                ljpVar3.b |= 64;
                ljpVar3.i = booleanValue4;
                return (ljp) mo52toBuilder4.mo39build();
            case 4:
                Boolean bool5 = this.a;
                aopa mo52toBuilder5 = ((ljp) obj).mo52toBuilder();
                boolean booleanValue5 = bool5.booleanValue();
                mo52toBuilder5.copyOnWrite();
                ljp ljpVar4 = (ljp) mo52toBuilder5.instance;
                ljpVar4.b |= 128;
                ljpVar4.j = booleanValue5;
                return (ljp) mo52toBuilder5.mo39build();
            case 5:
                Boolean bool6 = this.a;
                aopa mo52toBuilder6 = ((ljp) obj).mo52toBuilder();
                boolean booleanValue6 = bool6.booleanValue();
                mo52toBuilder6.copyOnWrite();
                ljp ljpVar5 = (ljp) mo52toBuilder6.instance;
                ljpVar5.b |= 256;
                ljpVar5.k = booleanValue6;
                return (ljp) mo52toBuilder6.mo39build();
            case 6:
                Boolean bool7 = this.a;
                if (!((Boolean) obj).booleanValue() || !bool7.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                Boolean bool8 = this.a;
                if (!((Boolean) obj).booleanValue() || !bool8.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Exception exc = (Exception) obj;
                return this.a;
        }
    }
}
