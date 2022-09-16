package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: cobs  reason: default package */
/* loaded from: classes5.dex */
public final class cobs extends cobt {
    private final Account a;

    public cobs(Account account) {
        if (account != null) {
            this.a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.cobt, defpackage.cnns
    public final Account a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cobt)) {
            return false;
        }
        return this.a.equals(((cobt) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("FacsCacheOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
