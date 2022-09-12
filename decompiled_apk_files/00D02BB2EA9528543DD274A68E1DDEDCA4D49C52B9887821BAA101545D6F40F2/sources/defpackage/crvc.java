package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: crvc  reason: default package */
/* loaded from: classes5.dex */
public final class crvc {
    static final String[] a = {"service_uca"};
    public final Context b;
    public final crvd c;
    public final AccountManager d;
    public final Map<String, crvb> e = Collections.synchronizedMap(new HashMap());

    public crvc(Context context, crvd crvdVar) {
        this.b = context;
        this.c = crvdVar;
        this.d = AccountManager.get(context);
    }

    public static boolean a(AccountManager accountManager, String str) {
        try {
            for (Account account : accountManager.getAccountsByTypeAndFeatures("com.google", a, null, null).getResult()) {
                if (str.equals(account.name)) {
                    return true;
                }
            }
        } catch (AuthenticatorException | IOException unused) {
        }
        return false;
    }
}
