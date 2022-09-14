package com.facebook.imagepipeline.d;

import com.google.android.gms.common.api.Api;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: DefaultEncodedMemoryCacheParamsSupplier.java */
/* loaded from: classes.dex */
public class k implements com.facebook.common.d.k<u> {
    @Override // com.facebook.common.d.k
    /* renamed from: a */
    public u b() {
        int c2 = c();
        return new u(c2, Api.BaseClientBuilder.API_PRIORITY_OTHER, c2, Api.BaseClientBuilder.API_PRIORITY_OTHER, c2 / 8);
    }

    private int c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return PKIFailureInfo.badCertTemplate;
        }
        if (min >= 33554432) {
            return 4194304;
        }
        return PKIFailureInfo.badSenderNonce;
    }
}
