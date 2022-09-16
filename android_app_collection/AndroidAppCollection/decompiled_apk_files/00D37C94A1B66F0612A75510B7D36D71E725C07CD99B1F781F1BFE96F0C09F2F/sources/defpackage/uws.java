package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uws  reason: default package */
/* loaded from: classes4.dex */
public final class uws extends uwp implements uvo, uue {
    private static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl");
    private final uvm b;
    private final Context c;
    private final uui d;
    private final Executor e;
    private final uwn f;
    private final azqb g;
    private final axnm h;
    private final azqb i;
    private final azqb j;

    public uws(uvn uvnVar, Context context, uui uuiVar, Executor executor, uwn uwnVar, azqb azqbVar, axnm axnmVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = uvnVar.a(executor, axnmVar, null);
        this.c = context;
        this.d = uuiVar;
        this.e = executor;
        this.f = uwnVar;
        this.g = azqbVar;
        this.h = axnmVar;
        this.i = azqbVar2;
        this.j = azqbVar3;
    }

    public static /* synthetic */ ankt m(final uws uwsVar) {
        if (((uwm) uwsVar.h.get()).a == 1) {
            if (!Application.getProcessName().equals(uwsVar.c.getPackageName())) {
                return ankq.a;
            }
            if (!((Boolean) uwsVar.i.get()).booleanValue()) {
                return ankq.a;
            }
            final List a2 = uwsVar.f.a(0, 0, ((SharedPreferences) uwsVar.g.get()).getString("lastExitProcessName", null), ((SharedPreferences) uwsVar.g.get()).getLong("lastExitTimestamp", -1L));
            if (a2.isEmpty()) {
                return ankq.a;
            }
            azyy azyyVar = (azyy) uwsVar.j.get();
            aopa createBuilder = azyx.a.createBuilder();
            int i = ((amxx) a2).c;
            createBuilder.copyOnWrite();
            azyx azyxVar = (azyx) createBuilder.instance;
            azyxVar.b |= 2;
            azyxVar.e = i;
            createBuilder.copyOnWrite();
            azyx azyxVar2 = (azyx) createBuilder.instance;
            azyyVar.getClass();
            azyxVar2.d = azyyVar;
            azyxVar2.b |= 1;
            HashSet e = amyv.e();
            for (int i2 = 0; i2 < azyyVar.b.size(); i2++) {
                int c = babq.c(azyyVar.b.d(i2));
                if (c == 0) {
                    c = 1;
                }
                e.add(Integer.valueOf(c - 1));
            }
            amzt listIterator = ((amuk) a2).listIterator();
            while (listIterator.hasNext()) {
                azyw azywVar = (azyw) listIterator.next();
                int c2 = babq.c(azywVar.d);
                if (c2 == 0) {
                    c2 = 1;
                }
                if (e.contains(Integer.valueOf(c2 - 1))) {
                    createBuilder.copyOnWrite();
                    azyx azyxVar3 = (azyx) createBuilder.instance;
                    azywVar.getClass();
                    aopu aopuVar = azyxVar3.c;
                    if (!aopuVar.c()) {
                        azyxVar3.c = aopi.mutableCopy(aopuVar);
                    }
                    azyxVar3.c.add(azywVar);
                }
            }
            azyx azyxVar4 = (azyx) createBuilder.mo39build();
            uvm uvmVar = uwsVar.b;
            uvi a3 = uvj.a();
            aopa createBuilder2 = baax.a.createBuilder();
            createBuilder2.copyOnWrite();
            baax baaxVar = (baax) createBuilder2.instance;
            azyxVar4.getClass();
            baaxVar.t = azyxVar4;
            baaxVar.b |= 134217728;
            a3.d((baax) createBuilder2.mo39build());
            return anii.h(uvmVar.b(a3.a()), new ampg() { // from class: uwq
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    uws.this.n(a2, (Void) obj);
                    return null;
                }
            }, uwsVar.e);
        }
        return ankq.a;
    }

    @Override // defpackage.uvo, defpackage.ver
    public void a() {
        this.d.a(this);
    }

    @Override // defpackage.uue
    public void d(Activity activity) {
        this.d.b(this);
        o();
    }

    public /* synthetic */ Void n(List list, Void r7) {
        int i = 0;
        azyw azywVar = (azyw) list.get(0);
        do {
            String str = azywVar.c;
            i++;
            if (((SharedPreferences) this.g.get()).edit().putString("lastExitProcessName", str).putLong("lastExitTimestamp", azywVar.g).commit()) {
                return null;
            }
        } while (i < 3);
        ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 172, "ApplicationExitMetricServiceImpl.java")).q("Failed to persist most recent App Exit");
        return null;
    }

    public void o() {
        anlz.v(new aniq() { // from class: uwr
            @Override // defpackage.aniq
            public final ankt a() {
                return uws.m(uws.this);
            }
        }, this.e);
    }
}
