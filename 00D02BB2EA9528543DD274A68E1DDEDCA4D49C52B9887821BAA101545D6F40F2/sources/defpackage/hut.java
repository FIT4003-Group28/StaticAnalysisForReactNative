package defpackage;

import android.app.Activity;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hut  reason: default package */
/* loaded from: classes.dex */
public final class hut {
    public final btrm a;
    public final ckcw b;
    public int c;
    public boolean d;
    public final Map<hus, Long> e = new EnumMap(hus.class);
    private final cqat f;
    private long g;

    public hut(Activity activity, cqat cqatVar, btrm btrmVar, ckcw ckcwVar) {
        this.f = cqatVar;
        this.a = btrmVar;
        this.b = ckcwVar;
        this.g = cqatVar.e();
        this.c = activity.getResources().getConfiguration().orientation;
    }

    public final synchronized void a() {
        hus husVar;
        int i = this.c;
        if (this.d) {
            husVar = i == 2 ? hus.LANDSCAPE_WITH_NAV : hus.PORTRAIT_WITH_NAV;
        } else {
            husVar = i == 2 ? hus.LANDSCAPE_NO_NAV : hus.PORTRAIT_NO_NAV;
        }
        Long l = this.e.get(husVar);
        if (l == null) {
            l = 0L;
        }
        long e = this.f.e();
        this.e.put(husVar, Long.valueOf(l.longValue() + (e - this.g)));
        this.g = e;
    }
}
