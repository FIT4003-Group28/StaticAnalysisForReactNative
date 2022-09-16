package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: egf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class egf implements ampg {
    private final /* synthetic */ int r;
    public static final /* synthetic */ egf q = new egf(18);
    public static final /* synthetic */ egf p = new egf(17);
    public static final /* synthetic */ egf o = new egf(16);
    public static final /* synthetic */ egf n = new egf(15);
    public static final /* synthetic */ egf m = new egf(14);
    public static final /* synthetic */ egf l = new egf(13);
    public static final /* synthetic */ egf k = new egf(12);
    public static final /* synthetic */ egf j = new egf(11);
    public static final /* synthetic */ egf i = new egf(10);
    public static final /* synthetic */ egf h = new egf(9);
    public static final /* synthetic */ egf g = new egf(8);
    public static final /* synthetic */ egf f = new egf(7);
    public static final /* synthetic */ egf e = new egf(6);
    public static final /* synthetic */ egf d = new egf(5);
    public static final /* synthetic */ egf c = new egf(4);
    public static final /* synthetic */ egf b = new egf(1);
    public static final /* synthetic */ egf a = new egf();

    private /* synthetic */ egf() {
    }

    public /* synthetic */ egf(int i2) {
        this.r = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.r) {
            case 0:
                return new Exception((Throwable) obj);
            case 1:
                return (bcc) obj;
            case 2:
                aopa mo52toBuilder = ((egw) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                egw egwVar = (egw) mo52toBuilder.instance;
                egwVar.b |= 1024;
                egwVar.m = 1;
                return (egw) mo52toBuilder.mo39build();
            case 3:
                aopa mo52toBuilder2 = ((egw) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                egw egwVar2 = (egw) mo52toBuilder2.instance;
                egwVar2.b |= 256;
                egwVar2.k = 1;
                return (egw) mo52toBuilder2.mo39build();
            case 4:
                arag aragVar = ((aptk) obj).j;
                return aragVar == null ? arag.a : aragVar;
            case 5:
                arag aragVar2 = ((aptk) obj).h;
                return aragVar2 == null ? arag.a : aragVar2;
            case 6:
                apto aptoVar = ((aptk) obj).g;
                if (aptoVar == null) {
                    aptoVar = apto.a;
                }
                if (aptoVar.b == 105917786) {
                    return (aptn) aptoVar.c;
                }
                return aptn.a;
            case 7:
                apto aptoVar2 = ((aptk) obj).f;
                if (aptoVar2 == null) {
                    aptoVar2 = apto.a;
                }
                if (aptoVar2.b == 105917786) {
                    return (aptn) aptoVar2.c;
                }
                return aptn.a;
            case 8:
                apto aptoVar3 = ((aptk) obj).e;
                if (aptoVar3 == null) {
                    aptoVar3 = apto.a;
                }
                if (aptoVar3.b == 105917786) {
                    return (aptn) aptoVar3.c;
                }
                return aptn.a;
            case 9:
                aptm aptmVar = ((aptk) obj).c;
                if (aptmVar == null) {
                    aptmVar = aptm.a;
                }
                if (aptmVar.b == 109219466) {
                    return (aptl) aptmVar.c;
                }
                return aptl.a;
            case 10:
                aptm aptmVar2 = ((aptk) obj).d;
                if (aptmVar2 == null) {
                    aptmVar2 = aptm.a;
                }
                if (aptmVar2.b == 109219466) {
                    return (aptl) aptmVar2.c;
                }
                return aptl.a;
            case 11:
                apzg apzgVar = ((aptl) obj).d;
                return apzgVar == null ? apzg.a : apzgVar;
            case 12:
                avhn avhnVar = ((aptl) obj).c;
                return avhnVar == null ? avhn.a : avhnVar;
            case 13:
                if ((((aptl) obj).b & 2) != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                return ((PlayerResponseModel) obj).a;
            case 15:
                aopa mo52toBuilder3 = ((eof) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                eof eofVar = (eof) mo52toBuilder3.instance;
                eofVar.b |= 2;
                eofVar.d = true;
                return (eof) mo52toBuilder3.mo39build();
            case 16:
                return ((airw) obj).V();
            case 17:
                return ((ajff) obj).J();
            case 18:
                return new Exception((Throwable) obj);
            case 19:
                aopa mo52toBuilder4 = ((fcy) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                fcy fcyVar = (fcy) mo52toBuilder4.instance;
                fcyVar.b |= 2;
                fcyVar.d = false;
                return (fcy) mo52toBuilder4.mo39build();
            default:
                aopa mo52toBuilder5 = ((fda) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                fda fdaVar = (fda) mo52toBuilder5.instance;
                fdaVar.b |= 4;
                fdaVar.e = true;
                return (fda) mo52toBuilder5.mo39build();
        }
    }
}
