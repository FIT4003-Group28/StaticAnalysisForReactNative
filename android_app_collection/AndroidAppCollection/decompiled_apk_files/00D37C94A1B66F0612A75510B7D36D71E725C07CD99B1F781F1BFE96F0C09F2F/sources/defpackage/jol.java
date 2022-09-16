package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jol  reason: default package */
/* loaded from: classes3.dex */
public final class jol {
    public final ahdn a;
    public final azqb b;
    public final ExecutorService c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final snc g;

    public jol(ahdn ahdnVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, snc sncVar, ExecutorService executorService) {
        this.a = ahdnVar;
        this.b = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.f = azqbVar4;
        this.g = sncVar;
        this.c = executorService;
    }

    public final void a(Map map, Map map2, yiw yiwVar) {
        ylr.b();
        aqxo.p(map.size() == map2.size());
        agvv i = ((agrf) this.b.get()).a().i();
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            agqf agqfVar = (agqf) map.get(str);
            List list = (List) map2.get(str);
            if (list == null) {
                list = amuk.q();
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(agqfVar.j.getTime());
            agqh e = i.e(str);
            if (e != null) {
                int size = list.size();
                String[] strArr = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    strArr[i2] = ((agqo) list.get(i2)).f();
                }
                arrayList.add(new aguw(str, seconds, strArr, TimeUnit.MILLISECONDS.toSeconds(e.e)));
            }
        }
        agvw agvwVar = (agvw) this.e.get();
        try {
            agux aguxVar = (agux) this.d.get();
            long a = agvwVar.a();
            long a2 = agvwVar.a() + agvwVar.b();
            int i3 = Integer.MAX_VALUE;
            for (agqv agqvVar : ((agrf) this.b.get()).a().m().j()) {
                int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(this.g.c() - agqvVar.g);
                if (seconds2 >= 0 && seconds2 < i3) {
                    i3 = seconds2;
                }
            }
            aryp c = aguxVar.c(a, a2, i3, ((zdp) this.f.get()).a(), arrayList);
            Set<String> keySet = map.keySet();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            long b = ((agvw) this.e.get()).b() - c.d;
            for (String str2 : keySet) {
                aryn c2 = ahdq.c(c, str2);
                if (yiwVar != null) {
                    yiwVar.b(str2, Boolean.valueOf(c2 != null && c2.c));
                }
                if (c2 != null && !c2.c && (c2.f || c2.e)) {
                    arrayList2.add(str2);
                    hashMap.put(str2, Integer.MAX_VALUE);
                    hashMap2.put(str2, Integer.valueOf(!c2.e ? 1 : 0));
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            ((agrf) this.b.get()).a().i().z(arrayList2, hashMap, hashMap2, 1, b);
        } catch (ExecutionException e2) {
            for (Object obj : map.keySet()) {
                if (yiwVar != null) {
                    yiwVar.a(obj, e2);
                } else {
                    String valueOf = String.valueOf(obj);
                    zep.d(valueOf.length() != 0 ? "Failed to sync playlist = ".concat(valueOf) : new String("Failed to sync playlist = "), e2);
                }
            }
        }
    }

    public final void b(final List list, final yiw yiwVar) {
        if (!this.a.c()) {
            return;
        }
        this.c.execute(new Runnable() { // from class: joi
            @Override // java.lang.Runnable
            public final void run() {
                Pair pair;
                jol jolVar = jol.this;
                List list2 = list;
                yiw yiwVar2 = yiwVar;
                HashSet<String> hashSet = new HashSet(list2);
                ylr.b();
                HashMap hashMap = new HashMap();
                for (String str : hashSet) {
                    hashMap.put(str, jolVar.c.submit(new jok(jolVar, str)));
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : hashMap.keySet()) {
                    try {
                        pair = (Pair) ((Future) hashMap.get(str2)).get();
                    } catch (IllegalStateException | InterruptedException | ExecutionException e) {
                        if (yiwVar2 != null) {
                            yiwVar2.a(str2, e);
                        }
                        zep.d("Failed to fetch playlist and videos", e);
                    }
                    if (pair == null) {
                        throw new IllegalStateException("playlistAndVideosPair is null.");
                        break;
                    }
                    arrayList.add(pair);
                }
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Pair pair2 = (Pair) arrayList.get(i);
                    String str3 = ((agqf) pair2.first).a;
                    hashMap2.put(str3, (agqf) pair2.first);
                    hashMap3.put(str3, (List) pair2.second);
                }
                jolVar.a(hashMap2, hashMap3, yiwVar2);
            }
        });
    }

    public final void c(String str, yiw yiwVar) {
        if (!this.a.c()) {
            return;
        }
        b(Collections.singletonList(str), yiwVar);
    }
}
