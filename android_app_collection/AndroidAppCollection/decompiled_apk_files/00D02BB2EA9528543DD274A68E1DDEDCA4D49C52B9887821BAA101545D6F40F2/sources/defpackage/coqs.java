package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: coqs  reason: default package */
/* loaded from: classes5.dex */
public final class coqs {
    public static String a(Account account) {
        if (account == null) {
            return "null";
        }
        int hashCode = account.name.hashCode();
        StringBuilder sb = new StringBuilder(20);
        sb.append("account#");
        sb.append(hashCode % 20);
        sb.append("#");
        return sb.toString();
    }
}
