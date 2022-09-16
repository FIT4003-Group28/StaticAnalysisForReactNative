package defpackage;

import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: nqt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nqt implements ayqb {
    public final /* synthetic */ WatchEngagementPanelViewContainerController a;
    private final /* synthetic */ int b;

    public /* synthetic */ nqt(WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController, int i) {
        this.b = i;
        this.a = watchEngagementPanelViewContainerController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            aikd aikdVar = (aikd) obj;
            ((nml) this.a.c.get()).t();
            return;
        }
        WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController = this.a;
        WatchNextResponseModel a = ((ahhm) obj).a();
        if (a == null) {
            ((nml) watchEngagementPanelViewContainerController.c.get()).t();
            return;
        }
        ((nml) watchEngagementPanelViewContainerController.c.get()).l(a);
        if (!eog.S(watchEngagementPanelViewContainerController.d)) {
            return;
        }
        asgt asgtVar = a.a;
        if ((asgtVar.b & 262144) == 0) {
            return;
        }
        ghu ghuVar = watchEngagementPanelViewContainerController.f;
        apzg apzgVar = asgtVar.v;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ghuVar.a(apzgVar, new HashMap());
    }
}
