package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cnum  reason: default package */
/* loaded from: classes.dex */
public final class cnum {
    @dzsi
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    public final Map<Api<?>, cnul> d;
    public final String e;
    public final String f;
    public final cozb g;
    public final boolean h;
    public Integer i;

    public cnum(@dzsi Account account, Set<Scope> set, Map<Api<?>, cnul> map, String str, String str2, cozb cozbVar, boolean z) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = cozbVar;
        this.h = z;
        HashSet hashSet = new HashSet(emptySet);
        for (cnul cnulVar : map.values()) {
            hashSet.addAll(cnulVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static cnum a(Context context) {
        return new GoogleApiClient.Builder(context).buildClientSettings();
    }
}
