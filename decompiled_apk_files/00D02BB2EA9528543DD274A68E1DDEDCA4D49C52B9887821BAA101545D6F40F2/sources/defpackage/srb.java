package defpackage;

import android.accounts.AccountManager;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: srb  reason: default package */
/* loaded from: classes7.dex */
public final class srb {
    public static final String[] a = {cpka.a("uca")};
    public final AccountManager b;
    public final Handler c = new Handler(Looper.getMainLooper());

    public srb(Application application) {
        this.b = AccountManager.get(application);
    }
}
