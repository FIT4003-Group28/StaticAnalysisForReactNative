package defpackage;

import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
/* compiled from: PG */
/* renamed from: uqv  reason: default package */
/* loaded from: classes4.dex */
public final class uqv implements uqp {
    private final /* synthetic */ int a;

    public uqv() {
    }

    public uqv(int i) {
        this.a = i;
    }

    @Override // defpackage.uqp
    public final uqq a(Context context, upx upxVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        if (this.a == 0) {
            return new uqu(context, upxVar, onAccountsUpdateListener);
        }
        return new uqt(context, upxVar, onAccountsUpdateListener);
    }
}
