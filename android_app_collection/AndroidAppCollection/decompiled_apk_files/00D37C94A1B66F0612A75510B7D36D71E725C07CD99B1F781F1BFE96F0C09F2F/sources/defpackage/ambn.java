package defpackage;

import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: ambn  reason: default package */
/* loaded from: classes.dex */
public final class ambn {
    public final AccountId a;
    public final ambp b;
    public final int c;

    public ambn() {
    }

    public static ambn a(AccountId accountId, ambp ambpVar, int i) {
        return new ambn(accountId, ambpVar, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ambn) {
            ambn ambnVar = (ambn) obj;
            if (this.a.equals(ambnVar.a) && this.b.equals(ambnVar.b) && this.c == ambnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String num = Integer.toString(this.c - 1);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 27 + String.valueOf(valueOf2).length() + String.valueOf(num).length());
        sb.append("Account{id=");
        sb.append(valueOf);
        sb.append(", info=");
        sb.append(valueOf2);
        sb.append(", state=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public ambn(AccountId accountId, ambp ambpVar, int i) {
        this.a = accountId;
        if (ambpVar != null) {
            this.b = ambpVar;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null info");
    }
}
