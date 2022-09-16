package defpackage;

import android.accounts.Account;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: esj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class esj implements ayqe {
    public final /* synthetic */ esl a;
    private final /* synthetic */ int b;

    public /* synthetic */ esj(esl eslVar) {
        this.a = eslVar;
    }

    public /* synthetic */ esj(esl eslVar, int i) {
        this.b = i;
        this.a = eslVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.b == 0) {
            final esl eslVar = this.a;
            WebviewEndpointOuterClass$WebviewEndpoint webviewEndpointOuterClass$WebviewEndpoint = (WebviewEndpointOuterClass$WebviewEndpoint) obj;
            if (!webviewEndpointOuterClass$WebviewEndpoint.c) {
                return ayos.D(webviewEndpointOuterClass$WebviewEndpoint.b);
            }
            String str = webviewEndpointOuterClass$WebviewEndpoint.b;
            return ayos.A(new Callable() { // from class: esk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    esl eslVar2 = esl.this;
                    return ampq.i(eslVar2.f.a(eslVar2.b.c()));
                }
            }).J(amon.a).h(efx.i).w(dzy.h).w(new fcr(str, 1)).s(new esj(eslVar, 1)).R(str);
        }
        esl eslVar2 = this.a;
        ampr amprVar = (ampr) obj;
        return afvj.a(eslVar2.a, (Account) amprVar.b, (String) amprVar.a).F(azpj.b(eslVar2.c)).y(azpj.b(eslVar2.d)).E((String) amprVar.a);
    }
}
