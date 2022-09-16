package defpackage;
/* compiled from: PG */
/* renamed from: jcz  reason: default package */
/* loaded from: classes3.dex */
public final class jcz extends jau {
    private static awjg h(agqv agqvVar, boolean z) {
        agqa agqaVar = agqvVar.a.a;
        if ((!agqvVar.s() || !z) && agqaVar != null) {
            return jjd.h(agqaVar);
        }
        return null;
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        amvl i = amvn.i();
        for (agqv agqvVar : agwhVar.j()) {
            awjg h = h(agqvVar, true);
            if (h != null) {
                i.c(h);
            }
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void c(aajs aajsVar, agqv agqvVar) {
        awjg h = h(agqvVar, false);
        if (h != null) {
            aajsVar.j(h);
        }
    }
}
