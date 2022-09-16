package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akcn  reason: default package */
/* loaded from: classes.dex */
public final class akcn {
    static final long a = TimeUnit.DAYS.toMillis(1);
    private final snc b;
    private final axnm c;
    private final afvn d;

    public akcn(snc sncVar, axnm axnmVar, afvn afvnVar) {
        this.b = sncVar;
        this.c = axnmVar;
        this.d = afvnVar;
    }

    public final void a(final List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        final String b = this.d.c().b();
        final long c = this.b.c();
        ylx.m(((yve) this.c.get()).b(new ampg() { // from class: akcm
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aopa mo52toBuilder;
                List<apwb> list2 = list;
                String str = b;
                long j = c;
                awvj awvjVar = (awvj) obj;
                if (awvjVar == null) {
                    mo52toBuilder = awvj.a.createBuilder();
                } else {
                    mo52toBuilder = awvjVar.mo52toBuilder();
                }
                for (apwb apwbVar : list2) {
                    String valueOf = String.valueOf(apwbVar.b);
                    String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                    awvk awvkVar = awvk.a;
                    concat.getClass();
                    Map unmodifiableMap = Collections.unmodifiableMap(((awvj) mo52toBuilder.instance).c);
                    if (unmodifiableMap.containsKey(concat)) {
                        awvkVar = (awvk) unmodifiableMap.get(concat);
                    }
                    aopa mo52toBuilder2 = awvkVar.mo52toBuilder();
                    mo52toBuilder2.bz(j);
                    mo52toBuilder.by(concat, (awvk) mo52toBuilder2.mo39build());
                }
                awvj awvjVar2 = (awvj) mo52toBuilder.mo39build();
                aopa createBuilder = awvj.a.createBuilder();
                boolean z = awvjVar2.d;
                createBuilder.copyOnWrite();
                awvj awvjVar3 = (awvj) createBuilder.instance;
                awvjVar3.b |= 1;
                awvjVar3.d = z;
                long j2 = awvjVar2.e;
                createBuilder.copyOnWrite();
                awvj awvjVar4 = (awvj) createBuilder.instance;
                awvjVar4.b |= 2;
                awvjVar4.e = j2;
                if (awvjVar2 == null || awvjVar2.c.size() == 0) {
                    return (awvj) createBuilder.mo39build();
                }
                long j3 = j - akcn.a;
                for (Map.Entry entry : Collections.unmodifiableMap(awvjVar2.c).entrySet()) {
                    aopa createBuilder2 = awvk.a.createBuilder();
                    for (Long l : ((awvk) entry.getValue()).b) {
                        long longValue = l.longValue();
                        if (longValue >= j3) {
                            createBuilder2.bz(longValue);
                        }
                    }
                    if (((awvk) createBuilder2.instance).b.size() > 0) {
                        createBuilder.by((String) entry.getKey(), (awvk) createBuilder2.mo39build());
                    }
                }
                return (awvj) createBuilder.mo39build();
            }
        }), aiuv.e);
    }

    public final boolean c(List list) {
        if (list != null && !list.isEmpty()) {
            String b = this.d.c().b();
            long c = this.b.c();
            awvj awvjVar = (awvj) ylx.g(((yve) this.c.get()).a(), 2000L, TimeUnit.MILLISECONDS, awvj.a);
            if (awvjVar.d) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apwb apwbVar = (apwb) it.next();
                String valueOf = String.valueOf(apwbVar.b);
                String concat = valueOf.length() != 0 ? b.concat(valueOf) : new String(b);
                awvk awvkVar = awvk.a;
                concat.getClass();
                aoqp aoqpVar = awvjVar.c;
                if (aoqpVar.containsKey(concat)) {
                    awvkVar = (awvk) aoqpVar.get(concat);
                }
                long j = awvjVar.e;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (j < 0) {
                    j = apwbVar.d;
                }
                long max = Math.max(c - timeUnit.toMillis(j), c - a);
                Iterator it2 = awvkVar.b.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (((Long) it2.next()).longValue() > max) {
                        i++;
                    }
                }
                if (i >= apwbVar.c) {
                    return false;
                }
            }
        }
        return true;
    }
}
