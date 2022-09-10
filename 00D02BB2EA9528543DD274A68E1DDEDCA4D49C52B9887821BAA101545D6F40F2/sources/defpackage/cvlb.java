package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cvlb  reason: default package */
/* loaded from: classes5.dex */
public final class cvlb implements cvkt {
    private final cvtq a;
    private final cvlr b;

    public cvlb(cvtq cvtqVar, cvlr cvlrVar) {
        this.a = cvtqVar;
        this.b = cvlrVar;
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        return intent != null && "android.intent.action.LOCALE_CHANGED".equals(intent.getAction());
    }

    @Override // defpackage.cvkt
    public final void b(Intent intent, cvix cvixVar, long j) {
        cvlw.a("LocaleChangedIntentHandler", "Syncing registration statuses due to Locale change.", new Object[0]);
        if (dxxk.a.a().k()) {
            this.b.c(4).a();
        }
        this.a.a(6);
    }
}
