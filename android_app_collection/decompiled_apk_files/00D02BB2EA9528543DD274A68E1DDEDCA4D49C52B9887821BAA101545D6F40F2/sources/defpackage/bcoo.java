package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bcoo  reason: default package */
/* loaded from: classes3.dex */
final class bcoo implements Runnable {
    final /* synthetic */ Account a;
    final /* synthetic */ String b;
    final /* synthetic */ bcop c;

    public bcoo(bcop bcopVar, Account account, String str) {
        this.c = bcopVar;
        this.a = account;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccountManager accountManager = AccountManager.get(this.c.c);
        try {
            String encode = Uri.encode(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 32);
            sb.append("weblogin:service=");
            sb.append("local");
            sb.append("&continue=");
            sb.append(encode);
            this.c.M(accountManager.getAuthToken(this.a, sb.toString(), (Bundle) null, this.c.c, (AccountManagerCallback<Bundle>) null, (Handler) null).getResult().getString("authtoken"));
        } catch (AuthenticatorException | OperationCanceledException | IOException unused) {
            this.c.M(this.b);
        }
    }
}
