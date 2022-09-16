package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: whv  reason: default package */
/* loaded from: classes4.dex */
public final class whv implements aasj {
    private final whu a;
    private final aafo b;
    private asbk c = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
    private String d;
    private String e;
    private apzg f;
    private boolean g;

    public whv(whu whuVar, aafo aafoVar) {
        aafoVar.getClass();
        this.b = aafoVar;
        this.a = whuVar;
        this.g = false;
    }

    @Override // defpackage.aasj
    public final void a(cff cffVar) {
        zep.d("Request verification code failed.", cffVar);
        this.g = false;
        whu whuVar = this.a;
        if (whuVar != null) {
            whuVar.a();
        }
    }

    public final void c(asbk asbkVar, String str, String str2, apzg apzgVar) {
        if (this.g) {
            return;
        }
        apzgVar.getClass();
        this.f = apzgVar;
        this.c = asbkVar;
        this.d = str;
        this.e = str2;
        this.g = true;
        HashMap hashMap = new HashMap();
        hashMap.put("KEY_CODE_DELIVERY_METHOD", asbkVar);
        hashMap.put("KEY_COUNTRY_CODE", str);
        hashMap.put("KEY_PHONE_NUMBER", str2);
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.b.c(this.f, hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        if ((((com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1.qm(com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint)).b & 1) != 0) goto L24;
     */
    @Override // defpackage.aasj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.asbn r6) {
        /*
            r5 = this;
            r0 = 0
            r5.g = r0
            whu r1 = r5.a
            if (r1 == 0) goto L8e
            int r1 = r6.b
            r2 = r1 & 2
            java.lang.String r3 = "RequestVerificationCodeResponse contains an unexpected null value."
            if (r2 == 0) goto L10
            goto L1d
        L10:
            r2 = r1 & 4
            if (r2 != 0) goto L1d
            defpackage.zep.b(r3)
            whu r6 = r5.a
            r6.a()
            return
        L1d:
            r1 = r1 & 4
            r2 = 1
            if (r1 == 0) goto L4d
            apzg r1 = r6.e
            if (r1 != 0) goto L28
            apzg r1 = defpackage.apzg.a
        L28:
            aopg r4 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint
            boolean r1 = r1.qn(r4)
            if (r1 == 0) goto L44
            apzg r1 = r6.e
            if (r1 != 0) goto L36
            apzg r1 = defpackage.apzg.a
        L36:
            aopg r4 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint
            java.lang.Object r1 = r1.qm(r4)
            com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint r1 = (com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1
            int r1 = r1.b
            r1 = r1 & r2
            if (r1 == 0) goto L44
            goto L4d
        L44:
            defpackage.zep.b(r3)
            whu r6 = r5.a
            r6.a()
            return
        L4d:
            int r1 = r6.b
            r3 = r1 & 4
            if (r3 == 0) goto L75
            whu r0 = r5.a
            apzg r1 = r6.e
            if (r1 != 0) goto L5b
            apzg r1 = defpackage.apzg.a
        L5b:
            aopg r2 = com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint
            java.lang.Object r1 = r1.qm(r2)
            com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint r1 = (com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint) r1
            atwb r1 = r1.c
            if (r1 != 0) goto L69
            atwb r1 = defpackage.atwb.a
        L69:
            atwc r1 = r1.b
            if (r1 != 0) goto L6f
            atwc r1 = defpackage.atwc.a
        L6f:
            long r2 = r6.f
            r0.c(r1, r2)
            return
        L75:
            r1 = r1 & 2
            if (r1 == 0) goto L7a
            r0 = 1
        L7a:
            defpackage.aqxo.y(r0)
            whu r0 = r5.a
            asbl r6 = r6.d
            if (r6 != 0) goto L85
            asbl r6 = defpackage.asbl.a
        L85:
            atwh r6 = r6.b
            if (r6 != 0) goto L8b
            atwh r6 = defpackage.atwh.a
        L8b:
            r0.b(r6)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whv.b(asbn):void");
    }
}
