package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: byxq  reason: default package */
/* loaded from: classes4.dex */
public final class byxq implements byxw {
    private static final dcep<String> c = dcep.C("android.intent.action.BOOT_COMPLETED", "android.intent.action.MY_PACKAGE_REPLACED");
    private final byyg a;
    private final btvo b;

    public byxq(byyg byygVar, btvo btvoVar) {
        this.a = byygVar;
        this.b = btvoVar;
    }

    @Override // defpackage.byxw
    public final void a(Intent intent) {
        dbsk.a(b(intent));
        dkqr dkqrVar = this.b.getNotificationsParameters().o;
        if (dkqrVar == null) {
            dkqrVar = dkqr.d;
        }
        dkhd dkhdVar = dkqrVar.a;
        if (dkhdVar == null) {
            dkhdVar = dkhd.h;
        }
        if (dkhdVar.b) {
            this.a.a();
        }
    }

    @Override // defpackage.byxw
    public final boolean b(Intent intent) {
        return c.contains(intent.getAction());
    }
}
