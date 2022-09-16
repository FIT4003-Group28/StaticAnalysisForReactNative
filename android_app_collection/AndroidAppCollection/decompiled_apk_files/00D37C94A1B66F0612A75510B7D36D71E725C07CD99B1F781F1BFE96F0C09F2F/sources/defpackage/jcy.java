package defpackage;
/* compiled from: PG */
/* renamed from: jcy  reason: default package */
/* loaded from: classes3.dex */
public final class jcy extends jat {
    private static awjg g(agqh agqhVar) {
        agqa agqaVar = agqhVar.a.c;
        if (agqaVar != null) {
            return jjd.h(agqaVar);
        }
        return null;
    }

    @Override // defpackage.jat
    protected final amvn a(agvv agvvVar) {
        amvl i = amvn.i();
        for (agqh agqhVar : agvvVar.j()) {
            awjg g = g(agqhVar);
            if (g != null) {
                i.c(g);
            }
        }
        return i.g();
    }

    @Override // defpackage.jat
    protected final void c(aajs aajsVar, agqh agqhVar) {
        awjg g = g(agqhVar);
        if (g != null) {
            aajsVar.j(g);
        }
    }
}
