package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.NotificationReminderDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gkt  reason: default package */
/* loaded from: classes3.dex */
public final class gkt implements aafl {
    private final Context a;
    private final aafo b;
    private final eo c;
    private final ahat d;
    private final acth e;
    private final azqb f;
    private final esc g;

    public gkt(Context context, aafo aafoVar, esc escVar, eo eoVar, ahat ahatVar, acth acthVar, azqb azqbVar, byte[] bArr) {
        this.a = context;
        this.b = aafoVar;
        this.g = escVar;
        this.c = eoVar;
        this.d = ahatVar;
        this.e = acthVar;
        this.f = azqbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if ((((OpenDialogCommandOuterClass$OpenDialogCommand) apzgVar.qm(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).b & 1) != 0) {
            aunb aunbVar = ((OpenDialogCommandOuterClass$OpenDialogCommand) apzgVar.qm(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)).c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer)) {
                this.g.kD(apzgVar, map);
            } else if (aunbVar.qn(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer)) {
                ajhb.g(this.a, (aqxq) aunbVar.qm(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer), this.b, (ajgz) this.f.get(), null);
            } else if (aunbVar.qn(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer)) {
                abyw abywVar = (abyw) this.c.f("MultiMessageConfirmDialogFragment");
                if (abywVar == null) {
                    abywVar = new abyw();
                }
                eo eoVar = this.c;
                atit atitVar = (atit) aunbVar.qm(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                if (abywVar.ap()) {
                    abywVar.dismiss();
                }
                abywVar.ah = atitVar;
                abywVar.ai = map;
                abywVar.qv(eoVar, "MultiMessageConfirmDialogFragment");
            } else if (!aunbVar.qn(UpsellDialogRendererOuterClass.upsellDialogRenderer)) {
            } else {
                this.d.a(aunbVar.qm(UpsellDialogRendererOuterClass.upsellDialogRenderer), this.e.oi(), null, null);
            }
        }
    }
}
