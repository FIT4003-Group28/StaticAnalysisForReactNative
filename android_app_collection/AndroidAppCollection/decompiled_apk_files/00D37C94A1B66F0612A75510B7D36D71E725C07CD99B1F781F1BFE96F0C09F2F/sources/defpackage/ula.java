package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ula  reason: default package */
/* loaded from: classes4.dex */
public final class ula implements ankb {
    final /* synthetic */ AccountsModelUpdater a;

    public ula(AccountsModelUpdater accountsModelUpdater) {
        this.a = accountsModelUpdater;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        Log.e(AccountsModelUpdater.a, "Failed to load owners", th);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object obj2;
        boolean v;
        ujt ujtVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        amuk amukVar = (amuk) obj;
        uof uofVar = (uof) this.a.b;
        uld uldVar = uofVar.a;
        String.format(Locale.US, "setAvailableAccounts() %d -> %d.", Integer.valueOf(((amxx) uldVar.d()).c), Integer.valueOf(amukVar.size()));
        amuf amufVar = new amuf();
        Iterator it = amukVar.iterator();
        while (true) {
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str3 = ((ulx) next).c;
                str4 = ((ulx) next).b;
                str5 = ((ulx) next).d;
                String str7 = ((ulx) next).e;
                str6 = ((ulx) next).g;
                obj2 = new ujt(next, str3, str4, str5, str7, str6, zgd.Z(next));
            }
            amufVar.h(obj2);
        }
        amuk g = amufVar.g();
        synchronized (uldVar.b) {
            v = amxp.v(uldVar.e, g);
        }
        if (v) {
            uldVar.f();
        } else {
            HashMap hashMap = new HashMap();
            int i = ((amxx) g).c;
            for (int i2 = 0; i2 < i; i2++) {
                ujt ujtVar2 = (ujt) g.get(i2);
                str2 = ((ulx) ujtVar2.a).c;
                hashMap.put(str2, ujtVar2);
            }
            synchronized (uldVar.b) {
                uldVar.d();
                Map map = uldVar.c;
                ulc ulcVar = ulc.a;
                if (!ulcVar.b) {
                    if (ulcVar.c != -1) {
                        if (SystemClock.elapsedRealtime() - ulcVar.c >= 5000) {
                        }
                    }
                    ujtVar = (ujt) obj2;
                    uldVar.e = g;
                    uldVar.c.clear();
                    uldVar.c.putAll(hashMap);
                }
                if (hashMap.size() == map.size() + 1) {
                    HashMap hashMap2 = new HashMap(hashMap);
                    hashMap2.keySet().removeAll(map.keySet());
                    if (hashMap2.size() == 1) {
                        obj2 = arey.t(hashMap2.values());
                    }
                }
                ujtVar = (ujt) obj2;
                uldVar.e = g;
                uldVar.c.clear();
                uldVar.c.putAll(hashMap);
            }
            uldVar.f();
            Iterator it2 = uldVar.a.iterator();
            while (it2.hasNext()) {
                uuo uuoVar = (uuo) it2.next();
                amuk d = uldVar.d();
                uuoVar.d(d);
                uuoVar.a(d);
            }
            if (ujtVar != null) {
                uldVar.g(ujtVar.a);
                unk unkVar = uldVar.g;
                if (unkVar != null) {
                    final Object obj3 = ujtVar.a;
                    final ExpressSignInLayout expressSignInLayout = unkVar.a;
                    final uoe uoeVar = unkVar.b;
                    if (amukVar.size() == 1) {
                        umr.b(new Runnable() { // from class: und
                            @Override // java.lang.Runnable
                            public final void run() {
                                ExpressSignInLayout.this.f(uoeVar, obj3);
                            }
                        });
                    }
                }
                ulc ulcVar2 = ulc.a;
                ulcVar2.c = -1L;
                ulcVar2.b = false;
            } else {
                ujt ujtVar3 = uldVar.f;
                if (ujtVar3 != null) {
                    str = ((ulx) ujtVar3.a).c;
                    uldVar.g(uld.e((ujt) hashMap.get(str)));
                }
            }
        }
        if (!amukVar.isEmpty() && uofVar.a.a() == null) {
            Object obj4 = amukVar.get(0);
            obj4.getClass();
            uofVar.a.g(obj4);
        }
        amukVar.isEmpty();
    }
}
