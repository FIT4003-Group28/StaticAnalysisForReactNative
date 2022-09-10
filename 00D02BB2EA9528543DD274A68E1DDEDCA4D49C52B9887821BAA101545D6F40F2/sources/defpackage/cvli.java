package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cvli  reason: default package */
/* loaded from: classes5.dex */
public final class cvli implements cvkt {
    private final cvtq a;
    private final cvlr b;

    public cvli(cvtq cvtqVar, cvlr cvlrVar) {
        this.a = cvtqVar;
        this.b = cvlrVar;
    }

    @Override // defpackage.cvkt
    public final boolean a(Intent intent) {
        return intent != null && "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction());
    }

    @Override // defpackage.cvkt
    public final void b(Intent intent, cvix cvixVar, long j) {
        cvlw.a("TimezoneChangedIntentHandler", "Syncing registration statuses due to timezone change.", new Object[0]);
        if (dxxk.a.a().m()) {
            this.b.c(3).a();
        }
        this.a.a(7);
    }
}
