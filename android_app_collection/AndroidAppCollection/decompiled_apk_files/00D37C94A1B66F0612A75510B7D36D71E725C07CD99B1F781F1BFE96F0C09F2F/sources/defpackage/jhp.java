package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jhp  reason: default package */
/* loaded from: classes3.dex */
public final class jhp implements ynl {
    public final azqb a;
    public final azqb b;
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;

    public jhp(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.a = azqbVar6;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.g = azqbVar4;
        this.b = azqbVar5;
    }

    public final void a() {
        ((ayor) this.a.get()).f(new jho(this, 1));
    }

    public final void b() {
        HashSet<Class> hashSet = new HashSet();
        for (jhx jhxVar : (Set) this.g.get()) {
            hashSet.add(jhxVar.b);
        }
        for (jic jicVar : (Set) this.f.get()) {
            hashSet.add(jicVar.g());
        }
        aagh c = ((aagi) this.d.get()).c();
        final jhm jhmVar = (jhm) this.e.get();
        for (Class cls : hashSet) {
            Set set = this.c;
            ayoi X = c.a(cls).X((ayor) this.a.get());
            jhmVar.getClass();
            set.add(X.at(new ayqb() { // from class: jhn
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    jic jicVar2;
                    aajj aajjVar;
                    jhm jhmVar2 = jhm.this;
                    String str = (String) obj;
                    ylr.b();
                    int a = aakj.a(str);
                    amup amupVar = jhmVar2.d;
                    Integer valueOf = Integer.valueOf(a);
                    if (!amupVar.containsKey(valueOf)) {
                        int a2 = aakj.a(str);
                        awbp k = hhw.k(str, jhmVar2.c);
                        if (k != null) {
                            int i = k.d;
                            Map map = (Map) jhmVar2.e.get(Integer.valueOf(a2));
                            if (map != null) {
                                jicVar2 = (jic) map.get(Integer.valueOf(i));
                            } else {
                                StringBuilder sb = new StringBuilder(105);
                                sb.append("Unable to find transformer from data model field number ");
                                sb.append(i);
                                sb.append(" to view model field number");
                                sb.append(a2);
                                zep.b(sb.toString());
                            }
                        }
                        jicVar2 = null;
                    } else {
                        jicVar2 = (jic) jhmVar2.d.get(valueOf);
                    }
                    if (jicVar2 == null) {
                        String valueOf2 = String.valueOf(str);
                        zep.b(valueOf2.length() != 0 ? "Unable to find transformer for outputEntityKey = ".concat(valueOf2) : new String("Unable to find transformer for outputEntityKey = "));
                        return;
                    }
                    if (!jhmVar2.g.containsKey(str)) {
                        jhmVar2.g.put(str, new ConcurrentHashMap());
                    }
                    if (!jhmVar2.h.containsKey(str)) {
                        jhmVar2.h.put(str, Collections.newSetFromMap(new ConcurrentHashMap()));
                    }
                    Map map2 = (Map) jhmVar2.g.get(str);
                    ayqb b = jhmVar2.b(str);
                    jhmVar2.f.put(str, jicVar2);
                    amvn e = jicVar2.e(str);
                    ((Set) jhmVar2.h.get(str)).addAll(e);
                    amzs it = e.iterator();
                    while (it.hasNext()) {
                        jip jipVar = (jip) it.next();
                        map2.put(jipVar, jhmVar2.a(jipVar, str, b, jicVar2));
                    }
                    ampq d = jicVar2.d(str);
                    if (!d.h()) {
                        return;
                    }
                    mhk h = jicVar2.h((String) d.c());
                    if (h.b - 1 != 1) {
                        aajjVar = (aajj) jhmVar2.b.c().f(h.a).W();
                    } else {
                        aajjVar = (aajj) jhmVar2.a.c().f(h.a).W();
                    }
                    jhmVar2.c(jicVar2, aajjVar, str, null);
                }
            }, ick.n));
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                ((ayor) this.a.get()).f(new jho(this, 2));
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                ((ayor) this.a.get()).f(new jho(this));
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
