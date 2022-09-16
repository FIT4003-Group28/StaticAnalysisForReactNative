package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gny  reason: default package */
/* loaded from: classes3.dex */
public final class gny implements aafl {
    private final dt a;
    private final airr b;

    public gny(dt dtVar, airr airrVar) {
        this.a = dtVar;
        airrVar.getClass();
        this.b = airrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand)) {
            return;
        }
        ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand) apzgVar.qm(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand);
        apzg apzgVar2 = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        if (!apzgVar2.qn(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            return;
        }
        if (this.b.d()) {
            this.b.a();
        }
        apzg apzgVar3 = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        yhg yhgVar = new yhg();
        Bundle bundle = new Bundle();
        bundle.putByteArray("get_offers_command", apzgVar3.toByteArray());
        yhgVar.ae(bundle);
        yhgVar.qv(this.a.getSupportFragmentManager(), "sponsorships_offer_dialog");
    }
}
