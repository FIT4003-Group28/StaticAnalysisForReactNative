package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xjf  reason: default package */
/* loaded from: classes4.dex */
public final class xjf implements tkb {
    private final Object a;
    private final aozy b;
    private final aafo c;
    private final Map d;

    public xjf(Object obj, aozy aozyVar, aafo aafoVar) {
        HashMap k;
        this.a = obj;
        this.b = aozyVar;
        this.c = aafoVar;
        apah apahVar = aozyVar.d;
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
        this.d = k != null ? afzo.c(k) : map;
    }

    private final void c(List list, tjt tjtVar) {
        wza c = wza.c(tjtVar, this.d);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{c});
        aafx.d(this.c, list, hashMap);
    }

    @Override // defpackage.tkb
    public final void a(tjt tjtVar, View view) {
        c(this.b.b, tjtVar);
    }

    @Override // defpackage.tkb
    public final void b(tjt tjtVar, View view) {
        c(this.b.c, tjtVar);
    }
}
