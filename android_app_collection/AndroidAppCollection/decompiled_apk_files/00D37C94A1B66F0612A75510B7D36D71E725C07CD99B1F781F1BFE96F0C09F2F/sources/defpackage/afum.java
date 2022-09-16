package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afum  reason: default package */
/* loaded from: classes.dex */
public final class afum implements afuj {
    protected final int a;
    private final aqld b;
    private final snc c;
    private final afuk d;
    private final Queue e = new ConcurrentLinkedQueue();
    private final boolean f;
    private final double g;
    private Future h;
    private final ykw i;

    public afum(afso afsoVar, snc sncVar, ymq ymqVar, ykw ykwVar) {
        this.b = afsoVar.g();
        this.a = afsoVar.c();
        this.c = sncVar;
        this.d = new afuk(ymqVar);
        this.i = ykwVar;
        this.f = afsoVar.l();
        this.g = afsoVar.a();
    }

    private final void i(String str, Exception exc) {
        zep.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
        if (this.f) {
            String valueOf = String.valueOf(str);
            afus.d(1, 12, valueOf.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(valueOf) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), exc, this.g);
        }
    }

    private final void j(aopa aopaVar) {
        String uuid = UUID.randomUUID().toString();
        aopaVar.copyOnWrite();
        oro oroVar = (oro) aopaVar.instance;
        oro oroVar2 = oro.a;
        uuid.getClass();
        int i = oroVar.b | 1;
        oroVar.b = i;
        oroVar.c = uuid;
        if ((i & 8) != 0) {
            return;
        }
        long c = this.c.c();
        aopaVar.copyOnWrite();
        oro oroVar3 = (oro) aopaVar.instance;
        oroVar3.b |= 8;
        oroVar3.f = c;
    }

    private final boolean k(aopa aopaVar) {
        int i = this.a;
        return i > 0 && ((oro) aopaVar.mo39build()).toByteArray().length > i;
    }

    @Override // defpackage.afuj
    public final synchronized yms a() {
        ylr.b();
        b();
        return this.d.b();
    }

    @Override // defpackage.afuj
    public final synchronized void b() {
        ylr.b();
        if (!this.e.isEmpty()) {
            ArrayList<ymm> arrayList = new ArrayList();
            while (true) {
                aopa aopaVar = (aopa) this.e.poll();
                if (aopaVar != null) {
                    if (!k(aopaVar)) {
                        arrayList.add(ymm.a(((oro) aopaVar.instance).c, aopaVar));
                    }
                } else {
                    try {
                        break;
                    } catch (RuntimeException e) {
                        i("Failed storing multiple delayed events when flushing buffer to disk.", e);
                    }
                }
            }
            afuk afukVar = this.d;
            ylr.b();
            afukVar.e(true);
            try {
                for (ymm ymmVar : arrayList) {
                    afukVar.h(ymmVar, true);
                }
                afukVar.j(true);
                afukVar.g(true);
            } catch (Throwable th) {
                afukVar.g(true);
                throw th;
            }
        }
        Future future = this.h;
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // defpackage.afuj
    public final synchronized void c(Set set) {
        ylr.b();
        this.d.d();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            oro oroVar = (oro) ((aopa) it.next()).instance;
            if ((oroVar.b & 1) != 0) {
                this.d.n(oroVar.c);
            }
        }
        this.d.i();
        this.d.f();
    }

    @Override // defpackage.afuj
    public final synchronized void d() {
        afuk afukVar = this.d;
        ylr.b();
        SQLiteDatabase writableDatabase = afukVar.a.getWritableDatabase();
        String str = afukVar.b;
        writableDatabase.execSQL(str.length() != 0 ? "delete from ".concat(str) : new String("delete from "));
    }

    @Override // defpackage.afuj
    public final synchronized void e(List list) {
        ylr.b();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j((aopa) it.next());
        }
        this.e.addAll(list);
        h();
    }

    @Override // defpackage.afuj
    public final synchronized void f(aopa aopaVar) {
        ylr.b();
        j(aopaVar);
        try {
            this.e.add(aopaVar);
        } catch (RuntimeException e) {
            String str = ((oro) aopaVar.instance).d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("Could not add DelayedEvent of type");
            sb.append(str);
            sb.append(" to bufferQueue.");
            i(sb.toString(), e);
        }
        h();
    }

    @Override // defpackage.afuj
    public final synchronized void g(aopa aopaVar) {
        j(aopaVar);
        if (k(aopaVar)) {
            return;
        }
        try {
            this.d.k(ymm.a(((oro) aopaVar.instance).c, aopaVar), false);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(((oro) aopaVar.instance).d);
            i(valueOf.length() != 0 ? "Failed to save DelayedEvent to disk with type: ".concat(valueOf) : new String("Failed to save DelayedEvent to disk with type: "), e);
        }
    }

    final void h() {
        if (!this.b.c) {
            b();
            return;
        }
        Future future = this.h;
        if (future != null && !future.isDone()) {
            return;
        }
        ykw ykwVar = this.i;
        aful afulVar = new aful(this);
        int i = this.b.e;
        this.h = ykwVar.a.schedule(afulVar, i, TimeUnit.SECONDS);
    }
}
