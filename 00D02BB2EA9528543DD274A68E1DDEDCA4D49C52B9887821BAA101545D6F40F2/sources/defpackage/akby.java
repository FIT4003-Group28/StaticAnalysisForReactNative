package defpackage;

import android.accounts.Account;
import android.app.Application;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: akby  reason: default package */
/* loaded from: classes.dex */
public final class akby {
    private final Application a;
    private final bvjj b;

    public akby(Application application, bvjj bvjjVar) {
        this.a = application;
        this.b = bvjjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static Account e(Account[] accountArr, String str) {
        for (Account account : accountArr) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final btlu a(Account account) {
        bvrj.UI_THREAD.d();
        return btlu.a(d(account), account);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final btlu b(Account account) {
        bvrj.UI_THREAD.d();
        return btlu.a(c(account), account);
    }

    public final String c(Account account) {
        String string = this.b.d.getString(bvjj.a(bvjk.d.kz, account.name), null);
        if (string == null || btlu.e(string)) {
            try {
                return d(account);
            } catch (cmrj e) {
                cnnk.b(e.a, this.a);
                return btlu.d(account);
            } catch (Exception e2) {
                dbue.b(e2);
                return btlu.d(account);
            }
        }
        return string;
    }

    final String d(Account account) {
        try {
            return cmrh.l(this.a, account.name);
        } catch (RuntimeException e) {
            bvoo.j(e);
            throw new IOException(e);
        }
    }
}
