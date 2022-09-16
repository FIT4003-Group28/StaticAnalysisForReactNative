package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iul  reason: default package */
/* loaded from: classes3.dex */
public final class iul implements aafl {
    public final Context a;
    public final iuh b;
    public abnx c;
    private final abap d;
    private final Executor e;

    public iul(Context context, abap abapVar, iuh iuhVar, Executor executor) {
        this.a = context;
        this.d = abapVar;
        this.b = iuhVar;
        this.e = executor;
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        abap abapVar = this.d;
        abao abaoVar = new abao(abapVar.e, abapVar.a.c(), apzgVar.c);
        abaoVar.a = ((OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand) apzgVar.qm(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.openSuperStickerBuyFlowCommand)).b;
        abnx abnxVar = (abnx) zew.K(map, "live_chat_product_picker_endpoint_key", abnx.class);
        this.c = abnxVar;
        if (abnxVar != null) {
            abnxVar.g(true);
        }
        ylx.l(this.d.b.a(abaoVar), this.e, new ylv() { // from class: iuj
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                iul iulVar = iul.this;
                abnx abnxVar2 = iulVar.c;
                if (abnxVar2 != null) {
                    abnxVar2.g(false);
                }
                Toast.makeText(iulVar.a, (int) R.string.error_generic, 0).show();
            }
        }, new ylw() { // from class: iuk
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                apzg apzgVar2;
                aqvq aqvqVar;
                apzg apzgVar3;
                iul iulVar = iul.this;
                apzg apzgVar4 = apzgVar;
                artj artjVar = (artj) obj;
                abnx abnxVar2 = iulVar.c;
                if (abnxVar2 != null) {
                    abnxVar2.e();
                }
                iuh iuhVar = iulVar.b;
                byte[] I = apzgVar4.c.I();
                oeu oeuVar = iuhVar.a.a;
                acti oi = iuhVar.c.oi();
                if (artjVar.b != 6 || !((apzg) artjVar.c).qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint) || oeuVar == null) {
                    return;
                }
                if (artjVar.b == 6) {
                    apzgVar2 = (apzg) artjVar.c;
                } else {
                    apzgVar2 = apzg.a;
                }
                ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar2.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
                nml nmlVar = ((DefaultWatchPanelViewController) oeuVar).e;
                if (TextUtils.equals(nmlVar.i(), ntr.e(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint))) {
                    nmlVar.m();
                }
                if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 8) != 0 || nmlVar.c() != null) {
                    oi = iuhVar.b;
                }
                oi.E(new acte(artjVar.e.I()), new acte(I));
                aqvm aqvmVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                if (aqvmVar == null) {
                    aqvmVar = aqvm.a;
                }
                if (aqvmVar.b == 138681066) {
                    aqvqVar = (aqvq) aqvmVar.c;
                } else {
                    aqvqVar = aqvq.b;
                }
                nmlVar.E(aqvqVar);
                if (artjVar.b == 6) {
                    apzgVar3 = (apzg) artjVar.c;
                } else {
                    apzgVar3 = apzg.a;
                }
                nmlVar.B(apzgVar3);
                oi.u(new acte(artjVar.e.I()), null);
            }
        }, anlf.a);
    }
}
