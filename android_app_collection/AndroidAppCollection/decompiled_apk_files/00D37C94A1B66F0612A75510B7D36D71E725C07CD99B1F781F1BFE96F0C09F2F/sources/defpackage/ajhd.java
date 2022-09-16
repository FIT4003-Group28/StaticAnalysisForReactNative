package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajhd  reason: default package */
/* loaded from: classes.dex */
public final class ajhd implements aafl {
    private final Context a;
    private final aafo b;
    private final acth c;
    private final ajxz d;
    private final ajgz e;
    private final zah f;

    public ajhd(Context context, aafo aafoVar, acth acthVar, ajxz ajxzVar, ajgz ajgzVar, zah zahVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        acthVar.getClass();
        this.c = acthVar;
        this.d = ajxzVar;
        this.e = ajgzVar;
        this.f = zahVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqft aqftVar;
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint) apzgVar.qm(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
        if (!((Activity) this.a).isFinishing()) {
            if ((confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.b & 1) != 0) {
                aqfs aqfsVar = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c;
                if (aqfsVar == null) {
                    aqfsVar = aqfs.a;
                }
                aqftVar = aqfsVar.c;
                if (aqftVar == null) {
                    aqftVar = aqft.a;
                }
            } else {
                aqftVar = null;
            }
            aqft aqftVar2 = aqftVar;
            acti oi = this.c.oi();
            oi.D(new acte(aqftVar2.n));
            ajgx.h(this.a, aqftVar2, this.b, oi, this.e, true, true, null, zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.d, this.f);
        }
    }
}
