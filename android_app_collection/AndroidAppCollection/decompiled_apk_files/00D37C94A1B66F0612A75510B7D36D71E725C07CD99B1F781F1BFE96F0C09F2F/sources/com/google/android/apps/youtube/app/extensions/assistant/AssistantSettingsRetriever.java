package com.google.android.apps.youtube.app.extensions.assistant;

import java.security.SecureRandom;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AssistantSettingsRetriever implements f {
    private final gps a;
    private final acvh b;
    private final Executor c;
    private final SecureRandom d;

    static {
        zep.a("Assistant");
    }

    public AssistantSettingsRetriever(gps gpsVar, acvh acvhVar, Executor executor, SecureRandom secureRandom) {
        this.a = gpsVar;
        this.b = acvhVar;
        this.c = executor;
        this.d = secureRandom;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        acvg acvgVar;
        if (this.d.nextFloat() < 0.01f) {
            acvgVar = this.b.c(asny.LATENCY_ACTION_ASSISTANT_SETTINGS);
            if (acvgVar != null) {
                acvgVar.e();
            }
        } else {
            acvgVar = null;
        }
        gps gpsVar = this.a;
        anlz.A(slh.a(gpsVar.a.a), new gpq(gpsVar, acvgVar), this.c);
    }
}
