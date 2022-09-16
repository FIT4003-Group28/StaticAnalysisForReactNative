package defpackage;

import android.text.TextUtils;
import java.util.Set;
/* compiled from: PG */
/* renamed from: uen  reason: default package */
/* loaded from: classes4.dex */
public final class uen {
    private final ucs a;
    private final ucv b;
    private final uhh c;
    private final Set d;
    private final udc e;
    private final ues f;

    public uen(ucs ucsVar, ucv ucvVar, udc udcVar, uhh uhhVar, ues uesVar, Set set) {
        this.a = ucsVar;
        this.b = ucvVar;
        this.e = udcVar;
        this.c = uhhVar;
        this.f = uesVar;
        this.d = set;
    }

    private final synchronized void b(ucp ucpVar, boolean z) {
        if (!z) {
            uep a = this.f.a(aojw.NOTIFICATION_DATA_CLEANED);
            a.d(ucpVar);
            a.i();
        } else if (ucpVar == null) {
            this.f.a(aojw.ACCOUNT_DATA_CLEANED).i();
        } else {
            uev.e("AccountCleanupUtil", "Account deleted: %s", ucpVar.b);
            if (TextUtils.isEmpty(ucpVar.c)) {
                return;
            }
            uep a2 = this.f.a(aojw.ACCOUNT_DATA_CLEANED);
            ((ueu) a2).m = ucpVar.c;
            a2.i();
        }
    }

    public final synchronized void a(ucp ucpVar, boolean z) {
        String str = ucpVar == null ? null : ucpVar.b;
        uev.e("AccountCleanupUtil", "Notification data deleted: %s", str);
        b(ucpVar, z);
        this.c.d(ucpVar, aojl.ACCOUNT_DATA_CLEANED);
        amzs it = ((amyg) this.d).iterator();
        while (it.hasNext()) {
            ((uih) it.next()).d();
        }
        this.b.c(str);
        this.e.a.d(str);
        if (ucpVar == null || !z) {
            return;
        }
        this.a.d(str);
    }
}
