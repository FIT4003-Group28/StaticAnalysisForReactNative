package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements anxq {
    public static /* synthetic */ anwm lambda$getComponents$0(anxo anxoVar) {
        anwg anwgVar = (anwg) anxoVar.a(anwg.class);
        Context context = (Context) anxoVar.a(Context.class);
        anzh anzhVar = (anzh) anxoVar.a(anzh.class);
        qnm.b(anwgVar);
        qnm.b(context);
        qnm.b(anzhVar);
        qnm.b(context.getApplicationContext());
        if (anwo.a == null) {
            synchronized (anwo.class) {
                if (anwo.a == null) {
                    Bundle bundle = new Bundle(1);
                    if (anwgVar.k()) {
                        anzhVar.c(anvz.class, qrj.f, anwn.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", anwgVar.j());
                    }
                    anwo.a = new anwo(rir.d(context, bundle).c);
                }
            }
        }
        return anwo.a;
    }

    @Override // defpackage.anxq
    public List getComponents() {
        anxm a = anxn.a(anwm.class);
        a.b(anxy.c(anwg.class));
        a.b(anxy.c(Context.class));
        a.b(anxy.c(anzh.class));
        a.c(anyl.b);
        a.d(2);
        return Arrays.asList(a.a(), aodm.a("fire-analytics", "19.0.1"));
    }
}
