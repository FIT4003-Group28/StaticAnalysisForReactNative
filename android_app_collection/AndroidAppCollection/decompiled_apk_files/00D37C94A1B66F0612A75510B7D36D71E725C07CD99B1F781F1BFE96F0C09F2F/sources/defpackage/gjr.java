package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gjr  reason: default package */
/* loaded from: classes3.dex */
public final class gjr implements aafl {
    public final Context a;
    public final aafo b;
    public final ajmy c;
    public final acth d;
    private final abar e;
    private final Executor f;

    public gjr(Context context, abar abarVar, aafo aafoVar, Executor executor, ajmy ajmyVar, acth acthVar) {
        this.a = context;
        this.e = abarVar;
        this.f = executor;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = ajmyVar;
        this.d = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        abar abarVar = this.e;
        abaq abaqVar = new abaq(abarVar.e, abarVar.a.c());
        abaqVar.a = ((GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand) apzgVar.qm(GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.getPdgBuyFlowCommand)).b;
        ylx.l(this.e.b.b(abaqVar, anjk.a), this.f, new ylv() { // from class: gjp
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                Toast.makeText(gjr.this.a, (int) R.string.error_generic, 0).show();
            }
        }, new ylw() { // from class: gjq
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                gjr gjrVar = gjr.this;
                artp artpVar = (artp) obj;
                gjrVar.d.oi().D(new acte(artpVar.d));
                gjrVar.d.oi().u(new acte(artpVar.d), null);
                apzg apzgVar2 = artpVar.c;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                if (apzgVar2.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                    apzg apzgVar3 = artpVar.c;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    gjrVar.b.a(apzgVar3);
                }
                for (int i = 0; i < artpVar.e.size(); i++) {
                    gjrVar.c.n((avhn) artpVar.e.get(i), 1920, 1080);
                }
            }
        }, anlf.a);
    }
}
