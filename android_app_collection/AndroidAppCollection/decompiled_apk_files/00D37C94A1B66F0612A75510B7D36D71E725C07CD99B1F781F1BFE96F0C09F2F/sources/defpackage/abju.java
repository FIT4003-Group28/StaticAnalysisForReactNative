package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abju  reason: default package */
/* loaded from: classes.dex */
public final class abju implements aafl {
    private final dt a;
    private final acth b;

    public abju(Activity activity, acth acthVar) {
        this.a = (dt) activity;
        this.b = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apzg apzgVar2 = (apzg) zew.K(map, "ticker_applied_action", apzg.class);
        acti oi = this.b.oi();
        ablw ablwVar = new ablw();
        Bundle bundle = new Bundle();
        bundle.putByteArray("endpoint", ((ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint) apzgVar.qm(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.showLiveChatItemEndpoint)).toByteArray());
        if (apzgVar2 != null) {
            bundle.putByteArray("applied_action", apzgVar2.toByteArray());
        }
        ablwVar.ae(bundle);
        ablwVar.n(true);
        ablwVar.ae = oi;
        View view = (View) zew.K(map, "live_chat_ticker_view", View.class);
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            ablwVar.ak = Integer.valueOf(iArr[1] + view.getHeight());
            ablwVar.al = Integer.valueOf(i);
        }
        ablwVar.qv(this.a.getSupportFragmentManager(), "show_live_chat_item");
    }
}
