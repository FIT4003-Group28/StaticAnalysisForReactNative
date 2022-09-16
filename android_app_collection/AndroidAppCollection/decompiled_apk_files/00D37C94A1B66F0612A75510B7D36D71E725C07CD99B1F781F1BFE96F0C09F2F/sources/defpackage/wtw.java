package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wtw  reason: default package */
/* loaded from: classes4.dex */
public final class wtw implements wtx {
    private static final amup a = amyc.b;
    private static final amvn b = amvn.w("CLICK_MS", "CONN", "LACT", "WT", "AD_TOS", "AD_WAT", "FINAL");
    private final wli c;
    private final Map d;

    public wtw(wli wliVar, Map map) {
        this.c = wliVar;
        this.d = map;
    }

    @Override // defpackage.wtx
    public final xcd a(xdu xduVar, xci xciVar, xac xacVar, apae apaeVar) {
        long j;
        String a2;
        Uri i = zgt.i(apaeVar.c);
        Set d = afzo.d(Arrays.asList(i), a);
        HashMap hashMap = new HashMap();
        Iterator it = d.iterator();
        while (true) {
            xac xacVar2 = null;
            if (it.hasNext()) {
                String str = (String) it.next();
                wsg wsgVar = (wsg) this.d.get(str);
                if (wsgVar == null) {
                    if (!b.contains(str)) {
                        String valueOf = String.valueOf(str);
                        wwf.a(null, valueOf.length() != 0 ? "Ping migration null MacroAdapter for macro ".concat(valueOf) : new String("Ping migration null MacroAdapter for macro "));
                    }
                } else {
                    wsf wsfVar = (wsf) wsgVar.getClass().getAnnotation(wsf.class);
                    if (wsfVar == null) {
                        xacVar2 = xac.a;
                    } else {
                        Class a3 = wsfVar.a();
                        if (xacVar.d(a3)) {
                            xacVar2 = xacVar;
                        } else if (xciVar.k.d(a3)) {
                            xacVar2 = xciVar.k;
                        } else if (xduVar.g.d(a3)) {
                            xacVar2 = xduVar.g;
                        }
                    }
                    if (xacVar2 != null) {
                        a2 = wsgVar.b(xacVar2);
                        if (a2 == null) {
                            String valueOf2 = String.valueOf(str);
                            throw new wup(valueOf2.length() != 0 ? "Ping migration MacroAdapter returns null value for ".concat(valueOf2) : new String("Ping migration MacroAdapter returns null value for "));
                        }
                    } else {
                        a2 = wsgVar.a();
                    }
                    hashMap.put(str, a2);
                }
            } else {
                Uri b2 = this.c.b(i, hashMap);
                xex xexVar = new xex(apaeVar.e);
                boolean z = apaeVar.f;
                if (xciVar.k.d(xaz.class)) {
                    j = ((Long) xciVar.k.c(xaz.class)).longValue();
                } else {
                    wwf.a(null, "Ping migration null expiration time for layout");
                    j = Long.MAX_VALUE;
                }
                return new xcd(b2, xexVar, z, j, amuk.o(hashMap.keySet()));
            }
        }
    }
}
