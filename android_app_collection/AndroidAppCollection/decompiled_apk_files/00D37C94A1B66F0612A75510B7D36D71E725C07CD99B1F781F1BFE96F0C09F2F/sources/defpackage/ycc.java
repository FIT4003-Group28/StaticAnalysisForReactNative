package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ycc  reason: default package */
/* loaded from: classes4.dex */
public final class ycc implements aafl {
    private final abff a;
    private final Activity b;
    private final yat c = new yat();
    private final ycd d;

    public ycc(abff abffVar, Activity activity, ycd ycdVar) {
        this.a = abffVar;
        this.b = activity;
        this.d = ycdVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.c.show(this.b.getFragmentManager(), yat.a);
        abez a = this.a.a();
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint) apzgVar.qm(YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.ypcCompleteTransactionEndpoint);
        a.w = abez.g(ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.b);
        a.j(apzgVar.c);
        abff abffVar = this.a;
        ycd ycdVar = this.d;
        acrr acrrVar = (acrr) ycdVar.a.get();
        acrrVar.getClass();
        yzj yzjVar = (yzj) ycdVar.b.get();
        yzjVar.getClass();
        ydq ydqVar = (ydq) ycdVar.c.get();
        ydqVar.getClass();
        azqb azqbVar = ycdVar.d;
        acti actiVar = (acti) ycdVar.e.get();
        actiVar.getClass();
        ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.getClass();
        abffVar.d(a, new ycb(acrrVar, yzjVar, ydqVar, azqbVar, actiVar, this.b, this.c, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, (ydp) zew.K(map, "PostTransactionCallback", ydp.class)));
    }
}
