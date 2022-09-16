package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xyi  reason: default package */
/* loaded from: classes4.dex */
public final class xyi implements aafl {
    public final acth a;
    public final yzj b;
    public final aafo c;
    public final yat d = new yat();
    private final Activity e;
    private final abei f;
    private final Executor g;

    public xyi(Activity activity, abei abeiVar, acth acthVar, yzj yzjVar, aafo aafoVar, Executor executor) {
        this.e = activity;
        this.f = abeiVar;
        this.a = acthVar;
        this.b = yzjVar;
        this.c = aafoVar;
        this.g = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand = (YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand) apzgVar.qm(YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.ypcGetCancellationFlowCommand);
        abei abeiVar = this.f;
        abeh abehVar = new abeh(abeiVar.e, abeiVar.a.c());
        ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.getClass();
        abehVar.a = abeh.g(ypcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.b);
        abehVar.j(apzgVar.c);
        this.d.show(this.e.getFragmentManager(), yat.a);
        abei abeiVar2 = this.f;
        ylx.k(abeiVar2.b.b(abehVar, anjk.a), this.g, new ylv() { // from class: xyg
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                xyi xyiVar = xyi.this;
                xyiVar.d.dismiss();
                xyiVar.b.e(th);
            }
        }, new ylw() { // from class: xyh
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                xyi xyiVar = xyi.this;
                artc artcVar = (artc) obj;
                xyiVar.d.dismiss();
                xyiVar.a.oi().D(new acte(artcVar.d));
                aafo aafoVar = xyiVar.c;
                apzg apzgVar2 = artcVar.c;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar.c(apzgVar2, null);
            }
        });
    }
}
