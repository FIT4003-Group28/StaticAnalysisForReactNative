package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cvlc  reason: default package */
/* loaded from: classes5.dex */
public final class cvlc implements cvkt {
    final cvpp a;
    private final String b;

    public cvlc(Context context, cvpp cvppVar) {
        this.a = cvppVar;
        String valueOf = String.valueOf(context.getPackageName());
        this.b = valueOf.length() != 0 ? "com.google.android.libraries.notifications#".concat(valueOf) : new String("com.google.android.libraries.notifications#");
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        return intent != null && intent.getAction().equals("com.google.android.gms.phenotype.UPDATE") && this.b.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"));
    }

    @Override // defpackage.cvkt
    public final void b(Intent intent, cvix cvixVar, long j) {
        cvlw.a("PhenotypeUpdateIntentHandler", "Updating phenotype flags.", new Object[0]);
        cvpp cvppVar = this.a;
        String str = this.b;
        dcpd it = ((dcnn) ((cvps) cvppVar).a).iterator();
        while (it.hasNext()) {
            cvpu cvpuVar = (cvpu) it.next();
            if (cvpuVar.c().equals(str)) {
                cvpuVar.b().g("");
                return;
            }
        }
    }
}
