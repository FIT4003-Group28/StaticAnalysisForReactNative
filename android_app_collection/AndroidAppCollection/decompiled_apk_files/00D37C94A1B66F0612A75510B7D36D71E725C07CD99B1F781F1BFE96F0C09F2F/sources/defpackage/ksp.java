package defpackage;
/* compiled from: PG */
/* renamed from: ksp  reason: default package */
/* loaded from: classes3.dex */
public final class ksp extends jlq {
    private final azqb a;

    public ksp(azqb azqbVar) {
        super(agqh.class, kso.class);
        this.a = azqbVar;
    }

    private static atqa a(agqf agqfVar) {
        atrp atrpVar = agqfVar.l;
        if (atrpVar != null && atrpVar.j.size() != 0) {
            for (atro atroVar : atrpVar.j) {
                if ((atroVar.b & 2) != 0) {
                    atqa atqaVar = atroVar.c;
                    return atqaVar == null ? atqa.a : atqaVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        avhn k;
        int o;
        agqh agqhVar = (agqh) obj;
        agqf agqfVar = agqhVar.a;
        agwh m = ((agrf) this.a.get()).a().m();
        ksn ksnVar = new ksn();
        int i = 1;
        ksnVar.e = true;
        ksnVar.c(agqfVar.a);
        ksnVar.d(agqfVar.b);
        atqa a = a(agqfVar);
        if (a != null && (a.b & 1) != 0 && (o = akzj.o(a.c)) != 0) {
            i = o;
        }
        ksnVar.h = i;
        atqa a2 = a(agqfVar);
        avhn avhnVar = null;
        if (a2 != null && (a2.b & 2) != 0 && (avhnVar = a2.d) == null) {
            avhnVar = avhn.a;
        }
        ksnVar.a = avhnVar;
        ksnVar.b = agqfVar.f;
        ksnVar.d = far.a(agqfVar.a);
        ksnVar.e(agqfVar.j.getTime());
        long j = agqhVar.e;
        agqa agqaVar = agqfVar.c;
        if (agqaVar != null) {
            ksnVar.c = agqaVar.b;
        }
        int i2 = 0;
        for (String str : agqhVar.b) {
            agqv e = m.e(str);
            if (e != null && e.i() == agqp.PLAYABLE && (k = e.k()) != null) {
                ksnVar.b(k);
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
        }
        return ksnVar.a();
    }
}
