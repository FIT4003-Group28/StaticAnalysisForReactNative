package defpackage;

import android.accounts.Account;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: rwo  reason: default package */
/* loaded from: classes4.dex */
public final class rwo {
    public int a = 3;
    public Account b;

    public final rwp a() {
        return new rwp(this);
    }

    public final void b(int i) {
        if (i == 0 || i == 2 || i == 1 || i == 3) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", 2));
    }
}
