package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amjv  reason: default package */
/* loaded from: classes.dex */
public final class amjv {
    public final amkj a;
    public final amim b;
    public final AccountId c;

    public amjv(amkj amkjVar) {
        this.a = amkjVar;
        amki amkiVar = amkjVar.c;
        this.b = new amim(amkiVar == null ? amki.a : amkiVar);
        this.c = (amkjVar.b & 2) != 0 ? AccountId.b(amkjVar.d) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amjv a(amkj amkjVar) {
        return new amjv(amkjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amjv) {
            amjv amjvVar = (amjv) obj;
            if (this.b.equals(amjvVar.b)) {
                AccountId accountId = this.c;
                AccountId accountId2 = amjvVar.c;
                if (accountId == null) {
                    if (accountId2 == null) {
                        return true;
                    }
                } else if (accountId.equals(accountId2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
