package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ugv  reason: default package */
/* loaded from: classes4.dex */
public final class ugv extends ugt {
    private final ufs b;

    public ugv(ufs ufsVar) {
        this.b = ufsVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        return this.b.h(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"), aomi.a(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", aomi.REGISTRATION_REASON_UNSPECIFIED.l)), aomkVar);
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "StoreTargetCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_STORE_TARGET";
    }
}
