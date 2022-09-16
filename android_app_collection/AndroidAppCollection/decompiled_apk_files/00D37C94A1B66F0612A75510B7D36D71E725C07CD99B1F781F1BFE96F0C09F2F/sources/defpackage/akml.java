package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akml  reason: default package */
/* loaded from: classes.dex */
public final class akml implements aafl {
    public final yzj a;
    private final aaun b;
    private final aafo c;
    private final acth d;

    public akml(aaun aaunVar, yzj yzjVar, aafo aafoVar, acth acthVar) {
        aaunVar.getClass();
        this.b = aaunVar;
        yzjVar.getClass();
        this.a = yzjVar;
        aafoVar.getClass();
        this.c = aafoVar;
        acthVar.getClass();
        this.d = acthVar;
    }

    public final void b(Map map, arnc arncVar) {
        if (arncVar.e.size() != 0) {
            this.c.e(arncVar.e, null);
        }
        if ((arncVar.b & 2) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(actk.c, (asjj) zew.K(map, "client_data_override", asjj.class));
            aafo aafoVar = this.c;
            aafo aafoVar2 = (aafo) zew.K(map, "endpoint_resolver_override", aafo.class);
            if (aafoVar2 != null) {
                aafoVar = aafoVar2;
            }
            apzg apzgVar = arncVar.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        }
        akmk akmkVar = (akmk) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akmk.class);
        if (akmkVar != null) {
            akmkVar.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    @Override // defpackage.aafl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kD(defpackage.apzg r6, java.util.Map r7) {
        /*
            r5 = this;
            aopg r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint
            java.lang.Object r0 = r6.qm(r0)
            com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint r0 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint) r0
            arnd r1 = r0.d
            if (r1 != 0) goto Le
            arnd r1 = defpackage.arnd.a
        Le:
            boolean r1 = r1.d
            r2 = 0
            if (r1 == 0) goto L15
        L13:
            r0 = r2
            goto L27
        L15:
            arnc r1 = r0.e
            if (r1 != 0) goto L1b
            arnc r1 = defpackage.arnc.a
        L1b:
            int r1 = r1.b
            r1 = r1 & 2
            if (r1 == 0) goto L13
            arnc r0 = r0.e
            if (r0 != 0) goto L27
            arnc r0 = defpackage.arnc.a
        L27:
            acth r1 = r5.d
            java.lang.Class<acti> r3 = defpackage.acti.class
            java.lang.String r4 = "interaction_logger_override"
            java.lang.Object r3 = defpackage.zew.K(r7, r4, r3)
            acti r3 = (defpackage.acti) r3
            if (r3 == 0) goto L36
            goto L3a
        L36:
            acti r3 = r1.oi()
        L3a:
            if (r0 != 0) goto L8d
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "click_tracking_params"
            java.lang.Object r0 = defpackage.zew.K(r7, r1, r0)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L51
            acte r1 = new acte
            r1.<init>(r0)
            r0 = 3
            r3.H(r0, r1, r2)
        L51:
            aopg r0 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint
            java.lang.Object r6 = r6.qm(r0)
            com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint r6 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint) r6
            aaun r0 = r5.b
            arnf r1 = r6.c
            if (r1 != 0) goto L61
            arnf r1 = defpackage.arnf.a
        L61:
            arnd r6 = r6.d
            if (r6 != 0) goto L67
            arnd r6 = defpackage.arnd.a
        L67:
            akmj r2 = new akmj
            r2.<init>(r5, r7)
            aauw r7 = new aauw
            aaqf r3 = r0.e
            afvn r4 = r0.a
            afvm r4 = r4.c()
            r7.<init>(r3, r4)
            r7.a = r1
            r7.b = r6
            arnc r6 = defpackage.arnc.a
            aaqj r1 = r0.b
            aass r3 = defpackage.aass.u
            aauh r4 = defpackage.aauh.e
            aarl r6 = r0.c(r6, r1, r3, r4)
            r6.e(r7, r2)
            return
        L8d:
            r5.b(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akml.kD(apzg, java.util.Map):void");
    }
}
