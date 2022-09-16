package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: agfs  reason: default package */
/* loaded from: classes.dex */
public final class agfs implements agca, agft, agfn {
    public final aget a;
    public final Map b;
    public final Executor c;
    public String d;
    private final ScheduledExecutorService e;
    private final agfp f;
    private final azqb g;
    private final aadd h;
    private final AtomicInteger i;

    public agfs(aget agetVar, agfp agfpVar, ScheduledExecutorService scheduledExecutorService, Executor executor, azqb azqbVar, aadd aaddVar) {
        agetVar.getClass();
        this.a = agetVar;
        this.f = agfpVar;
        this.b = new HashMap();
        scheduledExecutorService.getClass();
        this.e = scheduledExecutorService;
        this.c = executor;
        this.g = azqbVar;
        this.h = aaddVar;
        this.i = new AtomicInteger();
        i();
    }

    private static String h(String str) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/topics/")) {
            String valueOf = String.valueOf(str);
            return valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/");
        }
        return str;
    }

    private final void i() {
        if (g()) {
            return;
        }
        this.d = (String) ((ampv) this.a.a()).a;
        if (!g()) {
            this.e.schedule(new agfq(this), 3L, TimeUnit.SECONDS);
            return;
        }
        agfq agfqVar = new agfq(this, 2);
        if (aggw.k()) {
            agfqVar.run();
        } else {
            this.c.execute(agfqVar);
        }
    }

    @Override // defpackage.agca
    public final void a(asky askyVar, agcc agccVar) {
        ylr.c();
        if (askyVar == null || agccVar == null) {
            zep.l("cannot subscribe, invalidationId or listener is null");
            return;
        }
        String h = h(askyVar.e);
        if (TextUtils.isEmpty(h)) {
            return;
        }
        if (!g()) {
            i();
        }
        if (!this.b.containsKey(h)) {
            Map map = this.b;
            agfp agfpVar = this.f;
            String str = this.d;
            int andIncrement = this.i.getAndIncrement();
            agfk agfkVar = (agfk) agfpVar.a.get();
            agfkVar.getClass();
            Executor executor = (Executor) agfpVar.b.get();
            executor.getClass();
            map.put(h, new agfo(agfkVar, executor, str, askyVar, this, andIncrement));
            aggw.i(this);
        }
        agfo agfoVar = (agfo) this.b.get(h);
        agfoVar.c.add(agccVar);
        int i = agfoVar.h;
        if (i == 2) {
            agccVar.b(agfoVar.a);
        } else if (i != 4) {
        } else {
            agfoVar.a();
        }
    }

    @Override // defpackage.agca
    public final void b(asky askyVar, agcc agccVar) {
        ylr.c();
        if (agccVar == null) {
            zep.l("Cannot unsubscribeAll a null listener.");
        } else if (askyVar == null || TextUtils.isEmpty(askyVar.e)) {
            zep.l("Cannot unsubscribeAll from a null invalidation ID or from without a topic.");
        } else {
            String h = h(askyVar.e);
            if (!this.b.containsKey(h)) {
                return;
            }
            agfo agfoVar = (agfo) this.b.get(h);
            agfoVar.c.remove(agccVar);
            if (agfoVar.h != 2 || !agfoVar.c.isEmpty()) {
                return;
            }
            agfoVar.b();
        }
    }

    public final Collection c() {
        ylr.c();
        ArrayList arrayList = new ArrayList(this.b.values());
        Collections.sort(arrayList, utr.n);
        return arrayList;
    }

    @Override // defpackage.agft
    public final void d(final String str, final asla aslaVar) {
        if (aggw.k()) {
            e(str, aslaVar);
        } else {
            this.c.execute(new Runnable() { // from class: agfr
                @Override // java.lang.Runnable
                public final void run() {
                    agfs.this.e(str, aslaVar);
                }
            });
        }
    }

    public final void e(String str, final asla aslaVar) {
        ylr.c();
        if (TextUtils.isEmpty(str)) {
            zep.l("Do not know how to handle a received topic invalidation for a null or empty topic.");
            return;
        }
        agcj.a(this.g, "RECEIVED", this.h);
        agfo agfoVar = (agfo) this.b.get(str);
        if (agfoVar == null) {
            String valueOf = String.valueOf(str);
            zep.l(valueOf.length() != 0 ? "No listeners for GCM topic: ".concat(valueOf) : new String("No listeners for GCM topic: "));
            return;
        }
        aqxo.y(TextUtils.equals(agfoVar.b, str));
        aopa createBuilder = asky.a.createBuilder();
        if (!TextUtils.isEmpty(str) && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        createBuilder.copyOnWrite();
        asky askyVar = (asky) createBuilder.instance;
        str.getClass();
        askyVar.b |= 4;
        askyVar.e = str;
        final asky askyVar2 = (asky) createBuilder.mo39build();
        final HashSet hashSet = new HashSet(agfoVar.c);
        agfoVar.d.execute(new Runnable() { // from class: agfm
            @Override // java.lang.Runnable
            public final void run() {
                Set<agcc> set = hashSet;
                asky askyVar3 = askyVar2;
                asla aslaVar2 = aslaVar;
                for (agcc agccVar : set) {
                    agccVar.a(askyVar3, aslaVar2);
                }
            }
        });
        agcj.a(this.g, "MAPPED", this.h);
    }

    public final void f() {
        ylr.c();
        for (agfo agfoVar : c()) {
            String str = this.d;
            str.getClass();
            agfoVar.g = str;
            if (agfoVar.h == 4) {
                agfoVar.a();
            }
        }
    }

    public final boolean g() {
        return !TextUtils.isEmpty(this.d) && TextUtils.equals(this.d, (CharSequence) ((ampv) this.a.a()).a);
    }
}
