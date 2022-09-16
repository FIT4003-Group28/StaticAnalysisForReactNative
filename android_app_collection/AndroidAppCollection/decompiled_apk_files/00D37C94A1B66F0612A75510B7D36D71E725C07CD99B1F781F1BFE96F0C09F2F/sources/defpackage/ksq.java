package defpackage;
/* compiled from: PG */
/* renamed from: ksq  reason: default package */
/* loaded from: classes3.dex */
public final class ksq extends jlq {
    private final jhz a;

    public ksq(jhz jhzVar) {
        super(agqv.class, kso.class);
        this.a = jhzVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        agqv agqvVar = (agqv) obj;
        agqo agqoVar = agqvVar.a;
        ksn ksnVar = new ksn();
        ksnVar.e = false;
        ksnVar.c(agqoVar.f());
        ksnVar.d(agqoVar.j());
        ksnVar.b = 1;
        ksnVar.d = aijk.g(agqvVar.m(), "PPSV", 0, nni.f(agqvVar.f(), agqvVar.h));
        ksnVar.g = agqoVar.i();
        this.a.h(agqoVar.d.getTime());
        long j = agqvVar.i;
        if (!agqvVar.n().contains(":")) {
            ksnVar.f = ahdq.a(agqvVar.a.a());
        } else {
            ksnVar.f = agqvVar.n();
        }
        agqa agqaVar = agqoVar.a;
        if (agqaVar != null) {
            ksnVar.c = agqaVar.b;
        }
        avhn k = agqvVar.k();
        if (k == null) {
            k = avhn.a;
        }
        ksnVar.b(k);
        return ksnVar.a();
    }
}
