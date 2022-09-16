package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ugq  reason: default package */
/* loaded from: classes4.dex */
public final class ugq extends ugt {
    private final ufs b;

    public ugq(ufs ufsVar) {
        this.b = ufsVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        return this.b.d(string, Long.valueOf(j), aomb.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aomb.FETCH_REASON_UNSPECIFIED.j)), aomkVar);
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "FetchLatestThreadsCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_FETCH_LATEST_THREADS";
    }
}
