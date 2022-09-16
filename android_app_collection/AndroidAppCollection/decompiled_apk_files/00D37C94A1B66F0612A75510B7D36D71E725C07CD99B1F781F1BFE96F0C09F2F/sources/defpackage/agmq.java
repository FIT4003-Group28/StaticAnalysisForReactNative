package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agmq  reason: default package */
/* loaded from: classes.dex */
public final class agmq implements agmi {
    final /* synthetic */ agmr a;

    public agmq(agmr agmrVar) {
        this.a = agmrVar;
    }

    @Override // defpackage.agmi
    public final void a(agqq agqqVar, List list) {
        agmy q = this.a.q(agqqVar.a);
        q.getClass();
        synchronized (q.c.k) {
            q.a = list;
            q.b = null;
        }
    }

    @Override // defpackage.agmi
    public final void b(Collection collection) {
    }

    @Override // defpackage.agmi
    public final void c(agqq agqqVar, Collection collection, HashSet hashSet, attl attlVar, int i, byte[] bArr, agqe agqeVar, agqn agqnVar) {
        List list;
        String str = agqqVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqo) it.next()).f());
        }
        agmy q = this.a.q(str);
        if (q == null) {
            list = null;
        } else {
            synchronized (q.c.k) {
                list = q.a;
            }
        }
        agmz c = this.a.c();
        synchronized (c.k) {
            zgh.m(str);
            c.d.remove(str);
            Set<String> set = (Set) c.i.remove(str);
            if (set != null) {
                for (String str2 : set) {
                    zew.N(c.h, str2, str);
                }
            }
        }
        this.a.s(agqqVar, arrayList, list, this.a.c.m(str));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            agqo agqoVar = (agqo) it2.next();
            String f = agqoVar.f();
            if (hashSet.contains(f)) {
                agmr agmrVar = this.a;
                agmrVar.t(agqoVar, attlVar, i, bArr, agqeVar, agqnVar, agmrVar.d.a(f));
            }
            this.a.c().f(str, f);
        }
    }
}
