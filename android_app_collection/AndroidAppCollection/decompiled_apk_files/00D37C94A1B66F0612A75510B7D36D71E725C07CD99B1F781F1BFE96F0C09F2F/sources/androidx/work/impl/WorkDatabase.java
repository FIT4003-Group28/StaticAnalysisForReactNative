package androidx.work.impl;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class WorkDatabase extends bks {
    private static final long j = TimeUnit.DAYS.toMillis(1);

    public static WorkDatabase m(Context context, Executor executor, boolean z) {
        Executor executor2;
        bkq bkqVar;
        Executor executor3;
        boolean z2 = true;
        if (z) {
            bkqVar = new bkq(context, WorkDatabase.class, null);
            bkqVar.h = true;
            executor2 = executor;
        } else {
            String str = bro.a;
            bkq bkqVar2 = new bkq(context, WorkDatabase.class, "androidx.work.workdb");
            bkqVar2.g = new brc(context);
            executor2 = executor;
            bkqVar = bkqVar2;
        }
        bkqVar.e = executor2;
        brd brdVar = new brd();
        if (bkqVar.d == null) {
            bkqVar.d = new ArrayList();
        }
        bkqVar.d.add(brdVar);
        bkqVar.a(brn.a);
        bkqVar.a(new brl(context, 2, 3));
        bkqVar.a(brn.b);
        bkqVar.a(brn.c);
        bkqVar.a(new brl(context, 5, 6));
        bkqVar.a(brn.d);
        bkqVar.a(brn.e);
        bkqVar.a(brn.f);
        bkqVar.a(new brm(context));
        bkqVar.a(new brl(context, 10, 11));
        bkqVar.a(brn.g);
        bkqVar.i = false;
        bkqVar.j = true;
        if (bkqVar.c != null) {
            Executor executor4 = bkqVar.e;
            if (executor4 == null && bkqVar.f == null) {
                Executor executor5 = acl.a;
                bkqVar.f = executor5;
                bkqVar.e = executor5;
            } else if (executor4 != null && bkqVar.f == null) {
                bkqVar.f = executor4;
            } else if (executor4 == null && (executor3 = bkqVar.f) != null) {
                bkqVar.e = executor3;
            }
            blq blqVar = bkqVar.g;
            if (blqVar == null) {
                blqVar = new blz();
            }
            blq blqVar2 = blqVar;
            Context context2 = bkqVar.c;
            String str2 = bkqVar.b;
            bkr bkrVar = bkqVar.k;
            ArrayList arrayList = bkqVar.d;
            boolean z3 = bkqVar.h;
            ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
            bkl bklVar = new bkl(context2, str2, blqVar2, bkrVar, arrayList, z3, (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3, bkqVar.e, bkqVar.f, bkqVar.i, bkqVar.j);
            bks bksVar = (bks) lc.g(bkqVar.a);
            bksVar.b = bksVar.b(bklVar);
            Set emptySet = Collections.emptySet();
            BitSet bitSet = new BitSet();
            Iterator it = emptySet.iterator();
            while (true) {
                int i = -1;
                if (!it.hasNext()) {
                    for (int size = bklVar.g.size() - 1; size >= 0; size--) {
                        if (!bitSet.get(size)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                    }
                    Map map = bksVar.f;
                    for (bla blaVar : Collections.emptyList()) {
                        if (!Collections.unmodifiableMap(bklVar.d.a).containsKey(Integer.valueOf(blaVar.a))) {
                            bklVar.d.a(blaVar);
                        }
                    }
                    if (((bkv) bks.l(bkv.class, bksVar.b)) != null) {
                        throw null;
                    }
                    if (((bkk) bks.l(bkk.class, bksVar.b)) == null) {
                        if (bklVar.m != 3) {
                            z2 = false;
                        }
                        blr blrVar = bksVar.b;
                        synchronized (((bly) blrVar).a) {
                            blx blxVar = ((bly) blrVar).b;
                            if (blxVar != null) {
                                blxVar.setWriteAheadLoggingEnabled(z2);
                            }
                            ((bly) blrVar).c = z2;
                        }
                        bksVar.e = bklVar.e;
                        bksVar.a = bklVar.i;
                        new bky(bklVar.j);
                        bksVar.d = bklVar.h;
                        Map emptyMap = Collections.emptyMap();
                        BitSet bitSet2 = new BitSet();
                        for (Map.Entry entry : emptyMap.entrySet()) {
                            Class cls = (Class) entry.getKey();
                            for (Class cls2 : (List) entry.getValue()) {
                                int size2 = bklVar.f.size() - 1;
                                while (true) {
                                    if (size2 < 0) {
                                        size2 = -1;
                                        break;
                                    } else if (cls2.isAssignableFrom(bklVar.f.get(size2).getClass())) {
                                        bitSet2.set(size2);
                                        break;
                                    } else {
                                        size2--;
                                    }
                                }
                                if (size2 < 0) {
                                    throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                                }
                                bksVar.g.put(cls2, bklVar.f.get(size2));
                            }
                        }
                        for (int size3 = bklVar.f.size() - 1; size3 >= 0; size3--) {
                            if (!bitSet2.get(size3)) {
                                throw new IllegalArgumentException("Unexpected type converter " + bklVar.f.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                        }
                        return (WorkDatabase) bksVar;
                    }
                    throw null;
                }
                Class cls3 = (Class) it.next();
                int size4 = bklVar.g.size() - 1;
                while (true) {
                    if (size4 < 0) {
                        break;
                    } else if (cls3.isAssignableFrom(bklVar.g.get(size4).getClass())) {
                        bitSet.set(size4);
                        i = size4;
                        break;
                    } else {
                        size4--;
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.");
                }
                bksVar.f.put(cls3, (bkz) bklVar.g.get(i));
            }
        } else {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
    }

    public static String o() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract bun n();

    public abstract btt p();

    public abstract btw q();

    public abstract bua r();

    public abstract bud s();

    public abstract bui t();

    public abstract bva u();
}
