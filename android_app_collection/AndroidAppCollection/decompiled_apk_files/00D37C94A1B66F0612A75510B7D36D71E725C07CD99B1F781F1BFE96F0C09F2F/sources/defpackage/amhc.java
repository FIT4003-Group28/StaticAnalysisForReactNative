package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amhc  reason: default package */
/* loaded from: classes.dex */
public final class amhc {
    private final Map a = new HashMap();
    private final azqb b;

    public amhc(azqb azqbVar) {
        this.b = azqbVar;
    }

    public final Object a(AccountId accountId) {
        Object obj;
        synchronized (this.a) {
            if (!this.a.containsKey(accountId)) {
                this.a.put(accountId, new eaq(((dxt) this.b.get()).a));
            }
            obj = this.a.get(accountId);
        }
        return obj;
    }
}
