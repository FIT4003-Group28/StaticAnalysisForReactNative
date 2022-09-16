package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agmo  reason: default package */
/* loaded from: classes.dex */
public final class agmo implements agls {
    final /* synthetic */ agmr a;

    public agmo(agmr agmrVar) {
        this.a = agmrVar;
    }

    @Override // defpackage.agls
    public final void a(agqf agqfVar) {
        int size = this.a.d().size();
        this.a.k(agqfVar.a);
        if (size <= 0 || this.a.d().size() != 0) {
            return;
        }
        for (agin aginVar : this.a.f) {
            agio agioVar = aginVar.a;
            agioVar.f.a(agioVar.I);
        }
    }

    @Override // defpackage.agls
    public final void b(Collection collection) {
    }

    @Override // defpackage.agls
    public final void c(agqf agqfVar, Collection collection, HashSet hashSet, attl attlVar, int i, byte[] bArr, Set set, agqn agqnVar) {
        String str = agqfVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqo) it.next()).f());
        }
        int C = this.a.i.C(str);
        long q = this.a.i.q(str);
        long r = this.a.i.r(agqfVar.a);
        this.a.k(str);
        this.a.r(agqfVar, arrayList, attlVar, i, q, r, C);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            agqo agqoVar = (agqo) it2.next();
            String f = agqoVar.f();
            agmr agmrVar = this.a;
            boolean contains = hashSet.contains(f);
            boolean contains2 = set.contains(f);
            if (contains) {
                agmrVar.t(agqoVar, attlVar, i, bArr, contains2 ? agqe.ACTIVE : agqe.STREAM_DOWNLOAD_PENDING, agqnVar, agmrVar.d.a(agqoVar.f()));
            }
            agmrVar.c().e(str, agqoVar.f());
        }
    }
}
