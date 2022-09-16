package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: rgu  reason: default package */
/* loaded from: classes4.dex */
public final class rgu implements qsj {
    private final Account a;

    public rgu(Account account) {
        if (account != null) {
            this.a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.qsj
    public final Account a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rgu)) {
            return false;
        }
        return this.a.equals(((rgu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("MdiSyncClientOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public rgu() {
    }
}
