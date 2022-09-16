package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: amad  reason: default package */
/* loaded from: classes.dex */
public final class amad {
    public static final amzy a = amzy.l("com/google/apps/tiktok/account/api/controller/AccountIntents");

    public static void a(Intent intent, AccountId accountId) {
        aqxo.p(accountId.a() != -1);
        intent.putExtra("account_id", accountId.a());
        intent.putExtra("$tiktok$account_id_owned", true);
    }
}
