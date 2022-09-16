package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wxk  reason: default package */
/* loaded from: classes4.dex */
public final class wxk implements tkb {
    private final tcu a;
    private final aoxy b;
    private final Map c;

    public wxk(tcu tcuVar, aoxy aoxyVar) {
        HashMap k;
        this.a = tcuVar;
        this.b = aoxyVar;
        apah apahVar = aoxyVar.e;
        apahVar = apahVar == null ? apah.a : apahVar;
        Map map = null;
        if (apahVar == null) {
            k = null;
        } else {
            k = amxp.k(apahVar.b.size());
            for (Map.Entry entry : Collections.unmodifiableMap(apahVar.b).entrySet()) {
                k.put((String) entry.getKey(), ((apag) entry.getValue()).b);
            }
        }
        this.c = k != null ? afzo.c(k) : map;
    }

    private final void c(awmt awmtVar, tjt tjtVar, View view) {
        wza c = wza.c(tjtVar, this.c);
        ajje a = ajjf.a();
        a.a = null;
        a.e = Arrays.asList(c);
        tcq a2 = tcs.a();
        if (view != null) {
            a2.a = view;
        }
        a2.d = a.a();
        this.a.b(awmtVar, a2.a()).Q();
    }

    @Override // defpackage.tkb
    public final void a(tjt tjtVar, View view) {
        awmt awmtVar = this.b.c;
        if (awmtVar == null) {
            awmtVar = awmt.a;
        }
        c(awmtVar, tjtVar, view);
    }

    @Override // defpackage.tkb
    public final void b(tjt tjtVar, View view) {
        awmt awmtVar = this.b.d;
        if (awmtVar == null) {
            awmtVar = awmt.a;
        }
        c(awmtVar, tjtVar, view);
    }
}
