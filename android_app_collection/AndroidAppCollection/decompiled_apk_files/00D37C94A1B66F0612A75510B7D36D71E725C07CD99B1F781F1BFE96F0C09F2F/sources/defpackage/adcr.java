package defpackage;

import com.google.protos.youtube.api.innertube.AutoconnectEndpointOuterClass$AutoconnectEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adcr  reason: default package */
/* loaded from: classes.dex */
public final class adcr {
    public static final /* synthetic */ int g = 0;
    public final adce a;
    public final adbe b;
    public final Executor c;
    public final adci d;
    public final adcs e;
    public adbb f;

    static {
        zep.a("Handoff.ResponseController");
    }

    public adcr(adce adceVar, adbe adbeVar, Executor executor, adci adciVar, adcs adcsVar) {
        this.a = adceVar;
        this.b = adbeVar;
        this.c = executor;
        this.d = adciVar;
        this.e = adcsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final aruo aruoVar, final adct adctVar) {
        apzg apzgVar = aruoVar.c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(AutoconnectEndpointOuterClass$AutoconnectEndpoint.autoconnectEndpoint)) {
            apzg apzgVar2 = aruoVar.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            AutoconnectEndpointOuterClass$AutoconnectEndpoint autoconnectEndpointOuterClass$AutoconnectEndpoint = (AutoconnectEndpointOuterClass$AutoconnectEndpoint) apzgVar2.qm(AutoconnectEndpointOuterClass$AutoconnectEndpoint.autoconnectEndpoint);
            if ((autoconnectEndpointOuterClass$AutoconnectEndpoint.b & 1) == 0) {
                return;
            }
            final String str = autoconnectEndpointOuterClass$AutoconnectEndpoint.c;
            ylx.i(this.d.a(), new ylw() { // from class: adcn
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    adcr adcrVar = adcr.this;
                    aruo aruoVar2 = aruoVar;
                    String str2 = str;
                    adct adctVar2 = adctVar;
                    String str3 = (String) obj;
                    arfo arfoVar = aruoVar2.d;
                    if (arfoVar == null) {
                        arfoVar = arfo.a;
                    }
                    arfn arfnVar = arfoVar.b;
                    if (arfnVar == null) {
                        arfnVar = arfn.a;
                    }
                    if (!arfnVar.b.equals(str3)) {
                        adcrVar.d.c();
                    }
                    arfo arfoVar2 = aruoVar2.d;
                    if (arfoVar2 == null) {
                        arfoVar2 = arfo.a;
                    }
                    arfn arfnVar2 = arfoVar2.b;
                    if (arfnVar2 == null) {
                        arfnVar2 = arfn.a;
                    }
                    arfn arfnVar3 = arfnVar2;
                    apzg apzgVar3 = aruoVar2.c;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    adcrVar.f = new adcq(adcrVar, str2, arfnVar3, apzgVar3, adctVar2);
                    adcrVar.b.b(adcrVar.f);
                }
            });
        }
    }
}
