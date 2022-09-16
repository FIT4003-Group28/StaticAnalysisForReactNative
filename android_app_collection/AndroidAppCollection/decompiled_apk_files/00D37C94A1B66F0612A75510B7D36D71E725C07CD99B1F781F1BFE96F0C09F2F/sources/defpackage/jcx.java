package defpackage;
/* compiled from: PG */
/* renamed from: jcx  reason: default package */
/* loaded from: classes3.dex */
public final class jcx extends jau {
    private static avzz h(agqv agqvVar, boolean z) {
        if (!agqvVar.s() || !z) {
            return jjd.g(agqvVar.m(), agqvVar.h);
        }
        return null;
    }

    @Override // defpackage.jau
    protected final amvn a(agwh agwhVar) {
        avzz h;
        amvl i = amvn.i();
        for (agqv agqvVar : agwhVar.j()) {
            if (agqvVar != null && (h = h(agqvVar, true)) != null) {
                i.c(h);
            }
        }
        return i.g();
    }

    @Override // defpackage.jau
    protected final void c(aajs aajsVar, agqv agqvVar) {
        avzz h = h(agqvVar, false);
        if (h != null) {
            aajsVar.j(h);
        }
    }

    @Override // defpackage.jau
    protected final void e(aajs aajsVar, String str) {
        aajsVar.g(emn.A(str));
    }

    @Override // defpackage.jau
    protected final void f(aajs aajsVar, agqv agqvVar) {
        aajsVar.j(jjd.g(agqvVar.m(), agqvVar.h));
    }
}
