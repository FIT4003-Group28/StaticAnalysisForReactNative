package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
/* compiled from: PG */
/* renamed from: amdu  reason: default package */
/* loaded from: classes.dex */
public final class amdu implements amam, aman {
    private final ambz a;

    public amdu(ambz ambzVar) {
        this.a = ambzVar;
    }

    private static boolean c(Intent intent) {
        return intent.hasExtra("viewerid");
    }

    @Override // defpackage.amal
    public final ankt a(amaq amaqVar) {
        amlp l = amna.l("Get Intent Account");
        try {
            Intent intent = amaqVar.a;
            AccountId accountId = null;
            if (intent.hasExtra("account_id")) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((amzw) ((amzw) amad.a.f()).i("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 106, "AccountIntents.java")).q("AccountId was manually propagated. Use AccountIntents instead.");
                }
                if (intExtra != -1) {
                    accountId = AccountId.b(intExtra);
                }
                ankt q = anlz.q(accountId);
                l.close();
                return q;
            } else if (c(intent)) {
                aqxo.y(c(intent));
                String stringExtra = intent.getStringExtra("viewerid");
                stringExtra.getClass();
                if (intent.hasExtra("effectiveid")) {
                    stringExtra = intent.getStringExtra("effectiveid");
                    stringExtra.getClass();
                }
                ankt h = anhq.h(this.a.a("google", stringExtra), IllegalArgumentException.class, amcf.e, anjk.a);
                l.a(h);
                l.close();
                return h;
            } else {
                ankt q2 = anlz.q(null);
                l.close();
                return q2;
            }
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.amam
    public final ankt b(AccountId accountId) {
        return anlz.q(null);
    }
}
