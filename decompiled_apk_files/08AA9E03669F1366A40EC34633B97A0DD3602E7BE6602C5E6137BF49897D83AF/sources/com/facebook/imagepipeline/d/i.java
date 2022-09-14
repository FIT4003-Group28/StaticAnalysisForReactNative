package com.facebook.imagepipeline.d;

import android.app.ActivityManager;
import android.os.Build;
import com.google.android.gms.common.api.Api;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: DefaultBitmapMemoryCacheParamsSupplier.java */
/* loaded from: classes.dex */
public class i implements com.facebook.common.d.k<u> {

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f2594a;

    public i(ActivityManager activityManager) {
        this.f2594a = activityManager;
    }

    @Override // com.facebook.common.d.k
    /* renamed from: a */
    public u b() {
        return new u(c(), 256, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private int c() {
        int min = Math.min(this.f2594a.getMemoryClass() * PKIFailureInfo.badCertTemplate, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            return min / 4;
        }
        return 8388608;
    }
}
