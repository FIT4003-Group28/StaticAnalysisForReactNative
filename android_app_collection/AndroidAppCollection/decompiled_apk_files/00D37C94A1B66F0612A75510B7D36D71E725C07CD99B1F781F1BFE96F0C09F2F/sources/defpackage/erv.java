package defpackage;

import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import com.google.protos.youtube.api.innertube.ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erv  reason: default package */
/* loaded from: classes3.dex */
public final class erv implements aafl {
    private final SubscriptionNotificationOptionsDialogFragmentControllerImpl a;
    private final /* synthetic */ int b;

    public erv(SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl, int i) {
        this.b = i;
        subscriptionNotificationOptionsDialogFragmentControllerImpl.getClass();
        this.a = subscriptionNotificationOptionsDialogFragmentControllerImpl;
    }

    public erv(SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl) {
        subscriptionNotificationOptionsDialogFragmentControllerImpl.getClass();
        this.a = subscriptionNotificationOptionsDialogFragmentControllerImpl;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        avbl avblVar = null;
        if (this.b == 0) {
            auvr auvrVar = (auvr) apzgVar.qm(auvr.b);
            auvs auvsVar = auvrVar.c;
            if (auvsVar == null) {
                auvsVar = auvs.a;
            }
            if (auvsVar.b == 119226798) {
                auvs auvsVar2 = auvrVar.c;
                if (auvsVar2 == null) {
                    auvsVar2 = auvs.a;
                }
                if (auvsVar2.b == 119226798) {
                    avblVar = (avbl) auvsVar2.c;
                } else {
                    avblVar = avbl.a;
                }
            }
            if (avblVar == null) {
                return;
            }
            this.a.g(avblVar);
            return;
        }
        ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint = (ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint) apzgVar.qm(ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.showModifyChannelNotificationOptionsEndpoint);
        auvm auvmVar = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b;
        if (auvmVar == null) {
            auvmVar = auvm.a;
        }
        if (auvmVar.b == 119226798) {
            auvm auvmVar2 = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b;
            if (auvmVar2 == null) {
                auvmVar2 = auvm.a;
            }
            if (auvmVar2.b == 119226798) {
                avblVar = (avbl) auvmVar2.c;
            } else {
                avblVar = avbl.a;
            }
        }
        if (avblVar == null) {
            return;
        }
        this.a.g(avblVar);
    }
}
