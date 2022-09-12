package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: auud  reason: default package */
/* loaded from: classes.dex */
public final class auud implements auui {
    static final long a = TimeUnit.DAYS.toMillis(7);
    private final Map<auuh, auug> b;
    private boolean c = true;
    private final bzwh<auuc> d;
    private final ault e;
    private final cqat f;

    public auud(cqat cqatVar, bzwg bzwgVar, ault aultVar, ckcw ckcwVar) {
        auub auubVar = new auub(ckcwVar);
        this.b = new ConcurrentHashMap();
        this.d = bzwgVar.b("gmm_notification_status_active", auuc.class, auubVar);
        this.e = aultVar;
        this.f = cqatVar;
    }

    private final synchronized void g() {
        if (this.c) {
            auuc a2 = this.d.a();
            if (a2 != null) {
                this.b.clear();
                ArrayList<auug> arrayList = a2.a;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    auug auugVar = arrayList.get(i);
                    this.b.put(auugVar.a(), auugVar);
                }
            }
            this.c = false;
        }
        long b = this.f.b();
        Iterator<Map.Entry<auuh, auug>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<auuh, auug> next = it.next();
            if (next.getValue().e() <= b) {
                it.remove();
                this.e.c(next.getKey());
            }
        }
    }

    @Override // defpackage.auui
    public final synchronized void a(auuh auuhVar, @dzsi cjsh cjshVar, cjtd cjtdVar, int i) {
        g();
        this.b.put(auuhVar, new auue(auuhVar, cjtdVar, cjshVar, i, this.f.b() + a));
    }

    @Override // defpackage.auui
    public final synchronized void b(auuh auuhVar) {
        g();
        this.b.remove(auuhVar);
        this.e.c(auuhVar);
    }

    @Override // defpackage.auui
    public final synchronized void c() {
        ArrayList a2 = dchl.a();
        a2.addAll(this.b.values());
        this.d.b(new auuc(a2));
        this.e.f();
    }

    @Override // defpackage.auui
    @dzsi
    public final synchronized auug d(auuh auuhVar) {
        g();
        return this.b.get(auuhVar);
    }

    @Override // defpackage.auui
    public final synchronized List<auuh> e(int i) {
        dccx F;
        g();
        F = dcdc.F();
        for (auuh auuhVar : this.b.keySet()) {
            if (auuhVar.b() == i) {
                F.g(auuhVar);
            }
        }
        return F.f();
    }

    @Override // defpackage.auui
    public final synchronized Set<auuh> f() {
        g();
        return this.b.keySet();
    }
}
