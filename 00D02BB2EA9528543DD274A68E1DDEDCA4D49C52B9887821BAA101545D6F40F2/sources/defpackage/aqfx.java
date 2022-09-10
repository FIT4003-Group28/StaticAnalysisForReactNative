package defpackage;

import android.os.Bundle;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* renamed from: aqfx  reason: default package */
/* loaded from: classes2.dex */
public final class aqfx implements apyy {
    @Override // defpackage.apyy
    public final dehn<dbsg<augj>> a(ctyy ctyyVar, Notification notification, String str) {
        return deha.c();
    }

    @Override // defpackage.apyy
    public final cjsu b(ctyy ctyyVar, Notification notification, dbsg<ddci> dbsgVar) {
        ddda dddaVar;
        cjst d = cjsu.d();
        if (dbsgVar.a()) {
            dddaVar = ddda.aV;
        } else {
            dddaVar = ddda.aT;
        }
        d.d(dddaVar);
        cjry e = cjrz.e();
        e.b(ddcu.m);
        d.f(e.a());
        return d.e();
    }

    @Override // defpackage.apyy
    public final dehn<dbsg<augc>> c(ctyy ctyyVar, Notification notification) {
        return deha.a(dbpy.a);
    }

    @Override // defpackage.apyy
    public final boolean d(Notification notification, ctyy ctyyVar) {
        return false;
    }

    @Override // defpackage.apyy
    public final boolean e(Bundle bundle) {
        return false;
    }

    @Override // defpackage.apyy
    public final String f(ConversationId conversationId) {
        return "";
    }

    @Override // defpackage.apyy
    public final dehn<dbsg<augc>> o(augc augcVar, ctyy ctyyVar, Notification notification) {
        return deha.c();
    }
}
