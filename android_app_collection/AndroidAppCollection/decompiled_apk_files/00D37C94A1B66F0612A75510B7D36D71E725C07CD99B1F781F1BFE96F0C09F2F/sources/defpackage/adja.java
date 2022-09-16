package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRevokeManager;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
/* compiled from: PG */
/* renamed from: adja  reason: default package */
/* loaded from: classes.dex */
public final class adja implements agcv {
    private final Context a;
    private final adjg b;
    private final snc c;
    private final adoa d;
    private final adgl e;
    private final LivingRoomNotificationRevokeManager f;

    public adja(Context context, adjg adjgVar, snc sncVar, adoa adoaVar, adgl adglVar, LivingRoomNotificationRevokeManager livingRoomNotificationRevokeManager) {
        this.a = context;
        this.b = adjgVar;
        this.c = sncVar;
        this.d = adoaVar;
        this.e = adglVar;
        this.f = livingRoomNotificationRevokeManager;
    }

    @Override // defpackage.agcv
    public final boolean a(apgq apgqVar) {
        apzg apzgVar = apgqVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (!apzgVar.qn(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)) {
            return false;
        }
        if (this.d.e() == null) {
            apzg apzgVar2 = apgqVar.f;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            if ((((MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint) apzgVar2.qm(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)).b & 2) != 0 && !this.e.j().isEmpty()) {
                adjg adjgVar = this.b;
                apgm apgmVar = apgqVar.e;
                if (apgmVar == null) {
                    apgmVar = apgm.a;
                }
                adjgVar.a.edit().putInt("mdx.last_lr_notification_shown_id", apgmVar.d).apply();
                adjg adjgVar2 = this.b;
                adjgVar2.a.edit().putLong("mdx.lr_notification_last_notif_shown_time_ms", this.c.c()).apply();
                adjg adjgVar3 = this.b;
                apgm apgmVar2 = apgqVar.e;
                if (apgmVar2 == null) {
                    apgmVar2 = apgm.a;
                }
                adjgVar3.a.edit().putString("mdx.last_lr_notification_shown_tag", apgmVar2.c).apply();
                LivingRoomNotificationRevokeManager livingRoomNotificationRevokeManager = this.f;
                livingRoomNotificationRevokeManager.b.g(livingRoomNotificationRevokeManager);
                return false;
            }
        }
        return true;
    }
}
