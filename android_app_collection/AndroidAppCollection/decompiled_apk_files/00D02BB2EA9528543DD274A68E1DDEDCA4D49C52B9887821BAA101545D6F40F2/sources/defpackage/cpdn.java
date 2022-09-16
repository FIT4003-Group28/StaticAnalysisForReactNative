package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: cpdn  reason: default package */
/* loaded from: classes5.dex */
public final class cpdn implements cnns {
    private final Account a;

    public cpdn(Account account) {
        cnwc.n(account, "Must provide a valid account!");
        this.a = account;
    }

    @Override // defpackage.cnns
    public final Account a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof cpdn) && this.a.equals(((cpdn) obj).a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
