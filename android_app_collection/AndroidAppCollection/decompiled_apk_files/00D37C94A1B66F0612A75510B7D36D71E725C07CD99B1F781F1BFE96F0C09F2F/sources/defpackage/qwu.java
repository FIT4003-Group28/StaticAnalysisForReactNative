package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qwu  reason: default package */
/* loaded from: classes4.dex */
public final class qwu {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final rtz g;
    public Integer h;

    public qwu(Account account, Set set, Map map, String str, String str2, rtz rtzVar) {
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = rtzVar == null ? rtz.a : rtzVar;
        HashSet hashSet = new HashSet(emptySet);
        for (qwt qwtVar : map.values()) {
            Set set2 = qwtVar.a;
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static qwu a(Context context) {
        qsu qsuVar = new qsu(context);
        rtz rtzVar = rtz.a;
        if (qsuVar.e.containsKey(rtx.a)) {
            rtzVar = (rtz) qsuVar.e.get(rtx.a);
        }
        return new qwu(null, qsuVar.a, qsuVar.d, qsuVar.b, qsuVar.c, rtzVar);
    }
}
