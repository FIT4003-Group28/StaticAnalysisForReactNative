package defpackage;

import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hyi  reason: default package */
/* loaded from: classes3.dex */
public final class hyi implements aafl {
    public final igu a;
    public final aafo b;
    private final gte c;
    private final Executor d;

    public hyi(igu iguVar, aafo aafoVar, gte gteVar, Executor executor) {
        this.a = iguVar;
        this.b = aafoVar;
        this.c = gteVar;
        this.d = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        aqxo.p(apzgVar.qn(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand));
        final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand = (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand) apzgVar.qm(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand);
        final apzg apzgVar2 = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.d;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        ylx.k(this.c.a(), this.d, new ylv() { // from class: hyg
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                hyi hyiVar = hyi.this;
                ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2 = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
                apzg apzgVar3 = apzgVar2;
                Map map2 = map;
                zep.d("Error loading upload jobs", th);
                if ((showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2.b & 2) != 0) {
                    hyiVar.b.c(apzgVar3, map2);
                }
            }
        }, new ylw() { // from class: hyh
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                hyi hyiVar = hyi.this;
                Map map2 = map;
                ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2 = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
                apzg apzgVar3 = apzgVar2;
                if (((amuk) obj).isEmpty()) {
                    if ((showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2.b & 2) == 0) {
                        return;
                    }
                    hyiVar.b.c(apzgVar3, map2);
                    return;
                }
                ajrs ajrsVar = map2 != null ? (ajrs) map2.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext") : null;
                igu iguVar = hyiVar.a;
                aunb aunbVar = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                dt dtVar = (dt) iguVar.a.get();
                dtVar.getClass();
                ihl ihlVar = (ihl) iguVar.b.get();
                ihlVar.getClass();
                aunbVar.getClass();
                igt igtVar = new igt(dtVar, ihlVar, aunbVar, ajrsVar);
                igtVar.G();
                igtVar.b.oK(igtVar.c, igtVar.a);
                igtVar.b.i = new igs(igtVar);
            }
        });
    }
}
