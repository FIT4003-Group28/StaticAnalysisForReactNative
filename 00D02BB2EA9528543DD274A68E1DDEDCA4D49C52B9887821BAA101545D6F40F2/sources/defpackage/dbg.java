package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dbg  reason: default package */
/* loaded from: classes5.dex */
public final class dbg implements daj {
    public final dfeh a;
    private final Activity b;
    private final dan c;
    private final dol d;
    private final day e;
    private final czz f;

    public dbg(day dayVar, Activity activity, dfeh dfehVar, dol dolVar, dan danVar, czz czzVar) {
        this.e = dayVar;
        this.b = activity;
        this.a = dfehVar;
        this.d = dolVar;
        this.c = danVar;
        this.f = czzVar;
    }

    @Override // defpackage.daj
    public final dan a() {
        return this.c;
    }

    @Override // defpackage.daj
    public final daf b(dbrn<akqq, akse> dbrnVar, cze czeVar) {
        return new daw(this.a.f(dfge.a));
    }

    @Override // defpackage.daj
    public final dfen c(cze czeVar) {
        return this.a.a();
    }

    @Override // defpackage.daj
    public final dai d(cze czeVar) {
        day dayVar = this.e;
        Activity activity = this.b;
        dfeh dfehVar = this.a;
        czz czzVar = this.f;
        czw a = dayVar.a.a();
        day.a(a, 1);
        dbd a2 = dayVar.b.a();
        day.a(a2, 2);
        dgc a3 = dayVar.c.a();
        day.a(a3, 3);
        day.a(activity, 4);
        day.a(dfehVar, 5);
        day.a(czzVar, 6);
        return new dax(a, a2, a3, activity, dfehVar, czzVar);
    }

    @Override // defpackage.daj
    public final dfer e(dfhj dfhjVar) {
        dol dolVar = this.d;
        TimeUnit.SECONDS.toMillis(10L);
        dolVar.c();
        return this.a.c(dfhjVar);
    }

    @Override // defpackage.daj
    public final dfjb f(dfga dfgaVar) {
        return this.a.e(dfgaVar);
    }
}
