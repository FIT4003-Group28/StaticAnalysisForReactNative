package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jhm  reason: default package */
/* loaded from: classes3.dex */
public final class jhm {
    public final aagi a;
    public final aahf b;
    public final fbw c;
    public final amup d;
    public final amup e;
    private final azpd j;
    public final Map i = new HashMap();
    public final Map f = new ConcurrentHashMap();
    public final Map g = new ConcurrentHashMap();
    public final Map h = new ConcurrentHashMap();

    public jhm(final aagi aagiVar, final aahf aahfVar, fbw fbwVar, Set set, Set set2, azqb azqbVar) {
        this.a = aagiVar;
        this.b = aahfVar;
        this.c = fbwVar;
        HashMap hashMap = new HashMap();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            jhx jhxVar = (jhx) it.next();
            int i = jhxVar.a;
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf)) {
                StringBuilder sb = new StringBuilder(79);
                sb.append("Trying to add duplicate identity entity transformer for fieldNumber=");
                sb.append(i);
                zep.b(sb.toString());
            } else {
                hashMap.put(valueOf, jhxVar);
            }
        }
        this.d = amup.j(hashMap);
        HashMap hashMap2 = new HashMap();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            jic jicVar = (jic) it2.next();
            int b = jicVar.b();
            Integer valueOf2 = Integer.valueOf(b);
            if (!hashMap2.containsKey(valueOf2)) {
                hashMap2.put(valueOf2, new HashMap());
            }
            int a = jicVar.a();
            Map map = (Map) hashMap2.get(valueOf2);
            if (map != null) {
                map.put(Integer.valueOf(a), jicVar);
            } else {
                StringBuilder sb2 = new StringBuilder(60);
                sb2.append("Cannot add transformer for unknown field number: ");
                sb2.append(b);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap2.keySet()) {
            Integer valueOf3 = Integer.valueOf(num.intValue());
            hashMap3.put(valueOf3, amup.j((Map) hashMap2.get(valueOf3)));
        }
        this.e = amup.j(hashMap3);
        azpd ar = azpd.ar();
        this.j = ar;
        aynx q = ar.ax().H().G((ayor) azqbVar.get()).u(jgs.c).z(iyw.l).ag(new ayqe() { // from class: jhi
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                final jhm jhmVar = jhm.this;
                return ((aypu) obj).Q(new ayqf() { // from class: jhf
                    @Override // defpackage.ayqf
                    public final boolean a(Object obj2) {
                        return ((Boolean) ampq.i((jib) jhm.this.i.get(((jhr) obj2).a)).b(jgl.d).e(false)).booleanValue();
                    }
                }).am(TimeUnit.MILLISECONDS).H();
            }
        }).q(ick.k);
        ayqe ayqeVar = new ayqe() { // from class: jhj
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                ayoi i2;
                aagi aagiVar2 = aagi.this;
                aahf aahfVar2 = aahfVar;
                final jhr jhrVar = (jhr) obj;
                jic jicVar2 = jhrVar.b;
                mhk h = jicVar2.h((String) jicVar2.d(jhrVar.a).c());
                aagh c = aagiVar2.c();
                if (h.b - 1 != 1) {
                    i2 = aahfVar2.c().i(h.a);
                } else {
                    i2 = c.i(h.a);
                }
                return i2.V(new ayqe() { // from class: jhk
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        return ampr.a(jhr.this, (ampq) obj2);
                    }
                }).ao();
            }
        };
        ayrd.c(Integer.MAX_VALUE, "maxConcurrency");
        aywk aywkVar = new aywk(q, ayqeVar);
        azqc.j();
        aywkVar.p(ick.m).Z(ick.l);
    }

    public final aypg a(jip jipVar, final String str, final ayqb ayqbVar, final jic jicVar) {
        ayoi V = jipVar.b().V(new ayqe() { // from class: jhl
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                return new jhr(str, jicVar, ayqbVar);
            }
        });
        final azpd azpdVar = this.j;
        return V.as(new ayqb() { // from class: jhh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                azpd.this.c((jhr) obj);
            }
        });
    }

    public final ayqb b(final String str) {
        return new ayqb() { // from class: jhg
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jhm jhmVar = jhm.this;
                String str2 = str;
                ampq ampqVar = (ampq) obj;
                ylr.b();
                jic jicVar = (jic) jhmVar.f.get(str2);
                if (jicVar == null) {
                    String valueOf = String.valueOf(str2);
                    afus.b(2, 28, valueOf.length() != 0 ? "No entityTransformer for outputEntityKey: ".concat(valueOf) : new String("No entityTransformer for outputEntityKey: "));
                    return;
                }
                jhmVar.d(str2, jicVar);
                jhmVar.c(jicVar, (aajj) ampqVar.f(), str2, (jib) jhmVar.i.get(str2));
            }
        };
    }

    public final void c(jic jicVar, aajj aajjVar, String str, jib jibVar) {
        jia c = jicVar.c(aajjVar, str, jibVar);
        jib jibVar2 = c.b;
        if (jibVar2 != null) {
            this.i.put(str, jibVar2);
        }
        aahb c2 = ((aagu) this.a.c()).c();
        c2.d(c.a);
        String valueOf = String.valueOf(jicVar.g());
        String valueOf2 = String.valueOf(jicVar.f());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("Failed to update view model ");
        sb.append(valueOf);
        sb.append(" from data model ");
        sb.append(valueOf2);
        jjd.l(c2, sb.toString());
    }

    public final synchronized void d(String str, jic jicVar) {
        Map map = (Map) this.g.get(str);
        if (map == null) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No subscriptions for outputEntityKey: ".concat(valueOf) : new String("No subscriptions for outputEntityKey: "));
        }
        Set set = (Set) this.h.get(str);
        if (set == null) {
            String valueOf2 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf2.length() != 0 ? "No currentTriggers for outputEntityKey: ".concat(valueOf2) : new String("No currentTriggers for outputEntityKey: "));
        }
        amvn e = jicVar.e(str);
        amvn<jip> p = amvn.p(amyv.c(e, set));
        amvn<jip> p2 = amvn.p(amyv.c(set, e));
        ayqb b = b(str);
        for (jip jipVar : p2) {
            set.remove(jipVar);
            aypg aypgVar = (aypg) map.remove(jipVar);
            if (aypgVar != null) {
                aypgVar.qr();
            }
        }
        set.addAll(p);
        for (jip jipVar2 : p) {
            map.put(jipVar2, a(jipVar2, str, b, jicVar));
        }
    }
}
