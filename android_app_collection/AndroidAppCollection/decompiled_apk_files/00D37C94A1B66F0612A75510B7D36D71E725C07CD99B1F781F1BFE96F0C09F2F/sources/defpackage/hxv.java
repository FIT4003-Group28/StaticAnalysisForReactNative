package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxv  reason: default package */
/* loaded from: classes3.dex */
public final class hxv implements aafl {
    private final Context a;
    private final aafo b;
    private final acti c;
    private final ajxz d;

    public hxv(Context context, aafo aafoVar, acti actiVar, ajxz ajxzVar) {
        context.getClass();
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = actiVar;
        this.d = ajxzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqft aqftVar;
        Context context = this.a;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint) apzgVar.qm(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
            Context context2 = this.a;
            aqfs aqfsVar = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c;
            if (aqfsVar == null) {
                aqfsVar = aqfs.a;
            }
            if ((aqfsVar.b & 1) != 0) {
                aqfs aqfsVar2 = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c;
                if (aqfsVar2 == null) {
                    aqfsVar2 = aqfs.a;
                }
                aqftVar = aqfsVar2.c;
                if (aqftVar == null) {
                    aqftVar = aqft.a;
                }
            } else {
                aqftVar = null;
            }
            ajgx.o(context2, aqftVar, this.b, this.c, true, null, zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.d);
        }
    }
}
