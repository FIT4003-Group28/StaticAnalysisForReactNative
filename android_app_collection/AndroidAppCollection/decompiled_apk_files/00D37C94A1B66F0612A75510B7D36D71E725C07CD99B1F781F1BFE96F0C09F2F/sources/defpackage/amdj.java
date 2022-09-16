package defpackage;

import android.content.SharedPreferences;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: amdj  reason: default package */
/* loaded from: classes.dex */
public final class amdj {
    public final SharedPreferences a;
    public final ArrayList b = new ArrayList();

    public amdj(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    public static String d(AccountId accountId, String str) {
        return c(accountId.a(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.getInt("count", 0);
    }

    public final String b(AccountId accountId, String str) {
        return this.a.getString(d(accountId, str), null);
    }

    public final boolean e(AccountId accountId, String str) {
        return this.a.getBoolean(d(accountId, str), false);
    }
}
