package defpackage;

import android.accounts.Account;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dexm  reason: default package */
/* loaded from: classes6.dex */
public final class dexm extends dexk {
    public final Account a;
    public final String b;

    public dexm(Account account, String str) {
        this.a = account;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null scope");
    }

    @Override // defpackage.dexk
    public final Account a() {
        return this.a;
    }

    @Override // defpackage.dexk
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dexk) {
            dexk dexkVar = (dexk) obj;
            if (this.a.equals(dexkVar.a()) && this.b.equals(dexkVar.b())) {
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
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + str.length());
        sb.append("AccountAndScope{account=");
        sb.append(valueOf);
        sb.append(", scope=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
