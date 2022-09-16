package defpackage;

import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
/* compiled from: PG */
/* renamed from: fpi  reason: default package */
/* loaded from: classes3.dex */
public final class fpi implements akbi {
    private final yni a;
    private final acti b;

    public fpi(yni yniVar, acti actiVar) {
        this.a = yniVar;
        this.b = actiVar;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (aopcVar != null) {
            if ((((apoj) aopcVar.instance).b & 8192) != 0) {
                this.a.d(new eur());
                acti actiVar = this.b;
                apzg apzgVar = ((apoj) aopcVar.instance).n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                actiVar.H(3, new acte(apzgVar.c), null);
            }
            if (this.b == null) {
                return;
            }
            apzg apzgVar2 = ((apoj) aopcVar.instance).o;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            if (!apzgVar2.qn(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
                return;
            }
            acti actiVar2 = this.b;
            apzg apzgVar3 = ((apoj) aopcVar.instance).o;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            actiVar2.H(3, new acte(apzgVar3.c), null);
        }
    }
}
