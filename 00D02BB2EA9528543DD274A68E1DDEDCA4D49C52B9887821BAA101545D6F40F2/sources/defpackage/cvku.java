package defpackage;

import android.content.Intent;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cvku  reason: default package */
/* loaded from: classes5.dex */
public final class cvku implements cvkt {
    private final cvkf a;
    private final cvln b;
    private final cvpm c;
    private final cvtq d;
    private final cvlr e;

    public cvku(cvkf cvkfVar, cvln cvlnVar, cvpm cvpmVar, cvtq cvtqVar, cvlr cvlrVar) {
        this.a = cvkfVar;
        this.b = cvlnVar;
        this.c = cvpmVar;
        this.d = cvtqVar;
        this.e = cvlrVar;
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        return intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction());
    }

    @Override // defpackage.cvkt
    public final void b(Intent intent, cvix cvixVar, long j) {
        cvlw.a("AccountChangedIntentHandler", "Account changed event received.", new Object[0]);
        if (dxxk.a.a().l()) {
            this.e.c(2).a();
        }
        try {
            Set<String> a = this.c.a();
            for (cvkc cvkcVar : this.a.a()) {
                if (!a.contains(cvkcVar.b())) {
                    this.b.a(cvkcVar, true);
                }
            }
        } catch (cvpl unused) {
            this.e.b(37).a();
            cvlw.e("AccountChangedIntentHandler", "Account cleanup skipped due to error getting device accounts", new Object[0]);
        }
        if (!dxxt.a.a().a()) {
            this.d.a(4);
        }
    }
}
