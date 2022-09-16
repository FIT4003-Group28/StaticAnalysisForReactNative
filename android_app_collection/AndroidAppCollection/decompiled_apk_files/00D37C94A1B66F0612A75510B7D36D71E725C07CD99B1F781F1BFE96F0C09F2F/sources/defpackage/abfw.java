package defpackage;

import j$.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abfw  reason: default package */
/* loaded from: classes.dex */
public final class abfw implements abfq {
    private final abfp a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    public abfw(abfp abfpVar) {
        this.a = abfpVar;
    }

    private static String e(appk appkVar) {
        appj a = appkVar.a();
        StringBuilder sb = new StringBuilder(a.name());
        if (a == appj.SCREEN_EXIT) {
            sb.append(";");
            sb.append(appkVar.d().c().name());
        }
        return sb.toString();
    }

    private final synchronized Map f(Iterable iterable) {
        EnumMap enumMap;
        enumMap = new EnumMap(avfw.class);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abfr abfrVar = (abfr) this.b.get((String) it.next());
            if (abfrVar != null) {
                ((List) Map.EL.computeIfAbsent(enumMap, avfw.a(abfrVar.a.b), omr.l)).add(abfrVar);
            }
        }
        return enumMap;
    }

    @Override // defpackage.afuz
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.abfq
    public final synchronized void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avfx avfxVar = (avfx) it.next();
            abfr abfrVar = new abfr(avfxVar);
            this.b.put(avfxVar.d, abfrVar);
            ((HashSet) Map.EL.computeIfAbsent(this.c, abfrVar.b(), omr.m)).add(abfrVar.c());
            ((HashSet) Map.EL.computeIfAbsent(this.d, e(abfrVar.a()), omr.n)).add(abfrVar.c());
        }
        d(avkz.TASK_REGISTERED);
    }

    public final synchronized void c(String str) {
        this.e.remove(str);
        abfr abfrVar = (abfr) this.b.remove(str);
        if (abfrVar == null) {
            return;
        }
        HashSet hashSet = (HashSet) this.c.get(abfrVar.b());
        if (hashSet != null) {
            hashSet.remove(str);
        }
        HashSet hashSet2 = (HashSet) this.d.get(e(abfrVar.a()));
        if (hashSet2 == null) {
            return;
        }
        hashSet2.remove(str);
    }

    public final synchronized void d(avkz avkzVar) {
        HashSet hashSet = (HashSet) this.c.remove(avkzVar);
        if (hashSet == null) {
            return;
        }
        for (Map.Entry entry : f(hashSet).entrySet()) {
            java.util.Map b = this.a.b((avfw) entry.getKey()).b((List) entry.getValue());
            for (Map.Entry entry2 : b.entrySet()) {
                final String str = (String) entry2.getKey();
                ylx.l((ankt) entry2.getValue(), anjk.a, new ylv() { // from class: abft
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        abfw.this.c(str);
                    }
                }, new ylw() { // from class: abfu
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        Void r3 = (Void) obj;
                        abfw.this.c(str);
                    }
                }, new Runnable() { // from class: abfv
                    @Override // java.lang.Runnable
                    public final void run() {
                        abfw.this.c(str);
                    }
                });
            }
            this.e.putAll(b);
        }
    }
}
