package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: alyb  reason: default package */
/* loaded from: classes.dex */
public final class alyb {
    private final List<alya> a;

    public alyb(dmnn dmnnVar) {
        this.a = dchl.g(dmnnVar.a.size());
        for (dmsn dmsnVar : dmnnVar.a) {
            if (dmsnVar.b.size() == dmsnVar.c.size()) {
                HashMap f = dcjz.f(dmsnVar.b.size());
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < dmsnVar.b.size(); i++) {
                    j += dmsnVar.b.f(i);
                    j2 += dmsnVar.c.f(i);
                    Long valueOf = Long.valueOf(j);
                    if (!f.containsKey(valueOf)) {
                        f.put(valueOf, Long.valueOf(j2));
                    }
                }
                this.a.add(new alvp(Integer.valueOf(dmsnVar.a), dcdn.r(f)));
            }
        }
    }

    public final Long a(Long l, dcep<Integer> dcepVar) {
        for (alya alyaVar : this.a) {
            if (dcepVar.contains(alyaVar.a()) && alyaVar.b().containsKey(l)) {
                l = alyaVar.b().get(l);
            }
        }
        return l;
    }
}
