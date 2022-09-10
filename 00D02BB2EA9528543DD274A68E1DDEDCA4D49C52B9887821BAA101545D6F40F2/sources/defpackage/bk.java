package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import defpackage.bn;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bk  reason: default package */
/* loaded from: classes3.dex */
public final class bk<T extends bn> {
    public Executor a;
    public Executor b;
    public avy c;
    public boolean d;
    public boolean f;
    public Set<Integer> g;
    private final Class<T> h;
    private final String i;
    private final Context j;
    private ArrayList<bl> k;
    private Set<Integer> m;
    public boolean e = true;
    private final bm l = new bm();

    public bk(Context context, Class<T> cls, String str) {
        this.j = context;
        this.h = cls;
        this.i = str;
    }

    public final T a() {
        Executor executor;
        if (this.j != null) {
            Executor executor2 = this.a;
            if (executor2 == null && this.b == null) {
                Executor executor3 = ahd.b;
                this.b = executor3;
                this.a = executor3;
            } else if (executor2 != null && this.b == null) {
                this.b = executor2;
            } else if (executor2 == null && (executor = this.b) != null) {
                this.a = executor;
            }
            Set<Integer> set = this.m;
            if (set != null && this.g != null) {
                for (Integer num : set) {
                    if (this.g.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.c == null) {
                this.c = new awh();
            }
            Context context = this.j;
            String str = this.i;
            avy avyVar = this.c;
            bm bmVar = this.l;
            ArrayList<bl> arrayList = this.k;
            boolean z = this.d;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int i = 2;
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                i = 3;
            }
            ba baVar = new ba(context, str, avyVar, bmVar, arrayList, z, i, this.a, this.b, this.e, this.f, this.g);
            T t = (T) bj.c(this.h);
            t.c = t.b(baVar);
            avz avzVar = t.c;
            if (!(avzVar instanceof bs)) {
                boolean z2 = baVar.m == 3;
                avzVar.a(z2);
                t.f = baVar.e;
                t.b = baVar.h;
                new bv(baVar.i);
                t.d = baVar.g;
                t.e = z2;
                Map<Class<?>, List<Class<?>>> d = t.d();
                BitSet bitSet = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : d.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size = baVar.f.size() - 1;
                        while (true) {
                            if (size < 0) {
                                size = -1;
                                break;
                            } else if (cls.isAssignableFrom(baVar.f.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (size < 0) {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                        t.g.put(cls, baVar.f.get(size));
                    }
                }
                for (int size2 = baVar.f.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected type converter " + baVar.f.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return t;
            }
            bs bsVar = (bs) avzVar;
            throw null;
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    public final void b(bl blVar) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(blVar);
    }

    public final void c(bw... bwVarArr) {
        if (this.m == null) {
            this.m = new HashSet();
        }
        for (bw bwVar : bwVarArr) {
            this.m.add(Integer.valueOf(bwVar.a));
            this.m.add(Integer.valueOf(bwVar.b));
        }
        bm bmVar = this.l;
        for (bw bwVar2 : bwVarArr) {
            int i = bwVar2.a;
            int i2 = bwVar2.b;
            HashMap<Integer, TreeMap<Integer, bw>> hashMap = bmVar.a;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, bw> treeMap = hashMap.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                bmVar.a.put(valueOf, treeMap);
            }
            Integer valueOf2 = Integer.valueOf(i2);
            bw bwVar3 = treeMap.get(valueOf2);
            if (bwVar3 != null) {
                String str = "Overriding migration " + bwVar3 + " with " + bwVar2;
            }
            treeMap.put(valueOf2, bwVar2);
        }
    }
}
