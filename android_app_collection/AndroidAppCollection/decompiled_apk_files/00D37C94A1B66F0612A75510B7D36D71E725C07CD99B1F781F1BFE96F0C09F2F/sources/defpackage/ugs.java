package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ugs  reason: default package */
/* loaded from: classes4.dex */
public final class ugs extends ugt {
    private final ufs b;

    public ugs(ufs ufsVar) {
        this.b = ufsVar;
    }

    @Override // defpackage.ugt
    public final ufr a(Bundle bundle, aomk aomkVar) {
        return this.b.f(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"), aomkVar);
    }

    @Override // defpackage.ugt
    protected final String b() {
        return "RemoveTargetCallback";
    }

    @Override // defpackage.ujj
    public final String f() {
        return "RPC_REMOVE_TARGET";
    }
}
