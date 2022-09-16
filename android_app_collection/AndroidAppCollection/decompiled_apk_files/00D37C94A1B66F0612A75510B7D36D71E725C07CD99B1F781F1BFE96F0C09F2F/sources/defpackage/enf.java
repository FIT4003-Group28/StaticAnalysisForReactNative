package defpackage;

import com.google.protos.youtube.api.innertube.AdsFireOnceCommandOuterClass$AdsFireOnceCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: enf  reason: default package */
/* loaded from: classes3.dex */
public final class enf implements aafl {
    private final enm a;
    private final aafo b;

    public enf(enm enmVar, aafo aafoVar) {
        enmVar.getClass();
        this.a = enmVar;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar == null || !apzgVar.qn(AdsFireOnceCommandOuterClass$AdsFireOnceCommand.adsFireOnceCommand)) {
            return;
        }
        AdsFireOnceCommandOuterClass$AdsFireOnceCommand adsFireOnceCommandOuterClass$AdsFireOnceCommand = (AdsFireOnceCommandOuterClass$AdsFireOnceCommand) apzgVar.qm(AdsFireOnceCommandOuterClass$AdsFireOnceCommand.adsFireOnceCommand);
        int i = adsFireOnceCommandOuterClass$AdsFireOnceCommand.b;
        if ((i & 1) == 0) {
            return;
        }
        if ((i & 2) != 0) {
            ene eneVar = (ene) this.a.b(adsFireOnceCommandOuterClass$AdsFireOnceCommand.d, ene.class, "AFOCState", mwv.b);
            boolean z = eneVar.a;
            eneVar.a = true;
            if (!(!z)) {
                return;
            }
        }
        aafo aafoVar = this.b;
        apzg apzgVar2 = adsFireOnceCommandOuterClass$AdsFireOnceCommand.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.c(apzgVar2, map);
    }
}
