package defpackage;

import android.app.Activity;
import com.google.apps.tiktok.account.AccountId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amhb  reason: default package */
/* loaded from: classes.dex */
public final class amhb {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public final amha c;
    private final boolean d;
    private final amhu e;

    public amhb(amhu amhuVar, amha amhaVar) {
        this.e = amhuVar;
        this.c = amhaVar;
        boolean z = false;
        if (amhaVar.a.h() && (amhaVar.a.c() instanceof amgo)) {
            z = true;
        }
        this.d = z;
    }

    public final Object a(AccountId accountId) {
        Set b = b();
        boolean z = false;
        if (this.d || b.isEmpty() || (b.size() == 1 && b.contains(accountId))) {
            z = true;
        }
        aqxo.E(z, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", b, accountId);
        aqxo.B(this.e.a().getApplicationContext() instanceof axon, "Sting Activity must be attached to an @Sting Application. Found: %s", this.e.a().getApplicationContext());
        amha amhaVar = this.c;
        if (amhaVar.a.h()) {
            dwl a = ((amgz) awwc.u(amhaVar.b.b(accountId), amgz.class)).a();
            a.a = (Activity) amhaVar.a.c();
            return a.a();
        }
        dwl a2 = ((amgz) awwc.u(amhaVar.b.b(accountId), amgz.class)).a();
        a2.b = amhaVar.c;
        return a2.a();
    }

    public final Set b() {
        Set unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.b.keySet());
        }
        return unmodifiableSet;
    }
}
