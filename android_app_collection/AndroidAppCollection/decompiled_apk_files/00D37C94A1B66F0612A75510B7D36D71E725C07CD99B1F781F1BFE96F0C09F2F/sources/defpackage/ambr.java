package defpackage;

import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: ambr  reason: default package */
/* loaded from: classes.dex */
public final class ambr {
    public final AccountId a;
    private final ambp b;

    public ambr() {
    }

    public static ambr a(AccountId accountId, ambp ambpVar) {
        return new ambr(accountId, ambpVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ambr) {
            ambr ambrVar = (ambr) obj;
            if (this.a.equals(ambrVar.a) && this.b.equals(ambrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
        sb.append("AccountContext{id=");
        sb.append(valueOf);
        sb.append(", info=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public ambr(AccountId accountId, ambp ambpVar) {
        if (accountId != null) {
            this.a = accountId;
            this.b = ambpVar;
            return;
        }
        throw new NullPointerException("Null id");
    }
}
