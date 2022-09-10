package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: ctiq  reason: default package */
/* loaded from: classes5.dex */
public final class ctiq {
    private final ConcurrentMap<Long, SharedPreferences> a = dcjz.j();
    private final Context b;

    public ctiq(Context context) {
        this.b = context;
    }

    public final synchronized SharedPreferences a(ctyy ctyyVar) {
        Long valueOf = Long.valueOf(ctyyVar.a());
        if (this.a.containsKey(valueOf)) {
            return this.a.get(valueOf);
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences(String.format("lighter_messaging_prefs_%d.xml", valueOf), 0);
        return (SharedPreferences) dbsg.j(this.a.putIfAbsent(valueOf, sharedPreferences)).c(sharedPreferences);
    }
}
