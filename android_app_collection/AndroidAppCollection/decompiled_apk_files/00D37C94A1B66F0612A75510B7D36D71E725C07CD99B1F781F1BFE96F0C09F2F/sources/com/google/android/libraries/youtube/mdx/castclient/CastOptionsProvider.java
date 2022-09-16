package com.google.android.libraries.youtube.mdx.castclient;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class CastOptionsProvider implements qlo {
    public String castAppId;
    public acwu mdxConfig;
    public aczr mdxModuleConfig;

    @Override // defpackage.qlo
    public List getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // defpackage.qlo
    public CastOptions getCastOptions(Context context) {
        CastMediaOptions a;
        ((acyy) antz.u(context, acyy.class)).ik(this);
        qkq qkqVar = new qkq();
        qkqVar.a = this.castAppId;
        boolean z = true;
        qkqVar.f = true;
        qkqVar.d = true;
        LaunchOptions launchOptions = new LaunchOptions();
        acwu acwuVar = this.mdxConfig;
        if (acwuVar.aq || this.mdxModuleConfig.g == 1) {
            z = false;
        }
        launchOptions.a = z;
        launchOptions.c = acwuVar.n;
        qkqVar.c = launchOptions;
        qmv qmvVar = new qmv();
        qmvVar.a = null;
        qkqVar.e = ampq.i(qmvVar.a());
        ampq ampqVar = qkqVar.e;
        if (ampqVar != null) {
            a = (CastMediaOptions) ampqVar.f();
        } else {
            a = new qmv().a();
        }
        return new CastOptions(qkqVar.a, qkqVar.b, false, qkqVar.c, qkqVar.d, a, qkqVar.f, 0.05000000074505806d, false, false, false);
    }
}
