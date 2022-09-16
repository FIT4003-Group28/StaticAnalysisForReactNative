package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ugr  reason: default package */
/* loaded from: classes4.dex */
public final class ugr extends ugt {
    private final ufs b;
    private final udc c;

    public ugr(ufs ufsVar, udc udcVar) {
        this.b = ufsVar;
        this.c = udcVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        aomb a = aomb.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aomb.FETCH_REASON_UNSPECIFIED.j));
        udc udcVar = this.c;
        vfm b = vfm.b();
        b.c("last_updated__version");
        b.d(">?", Long.valueOf(j));
        return this.b.e(string, j, ucw.a(udcVar.a.a(string, amuk.r(b.a()))), a, aomkVar);
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "FetchUpdatedThreadsCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_FETCH_UPDATED_THREADS";
    }
}
