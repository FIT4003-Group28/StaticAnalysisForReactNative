package defpackage;

import com.google.ar.core.Session;
/* renamed from: dflv  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class dflv implements dflw {
    static final dflw a = new dflv();

    private dflv() {
    }

    @Override // defpackage.dflw
    public final void a(Session session) {
        session.setAnalyticsPolicy("rule=must_not_log");
    }
}
