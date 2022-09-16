package defpackage;
/* compiled from: PG */
/* renamed from: log  reason: default package */
/* loaded from: classes3.dex */
final class log extends ajwd implements ynl {
    public final ajsm a;
    public final aqxh b;
    private final yni c;
    private final ajxr d;

    public log(ajyi ajyiVar, yni yniVar, aqxh aqxhVar) {
        this.c = yniVar;
        aqxhVar.getClass();
        this.b = aqxhVar;
        ajyiVar.a(avwm.class);
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        this.d = new ajxr();
        ajsmVar.clear();
        ajsmVar.add(aqxhVar);
        for (aqxi aqxiVar : aqxhVar.d) {
            int i = aqxiVar.b;
            if ((i & 16) != 0) {
                ajsm ajsmVar2 = this.a;
                aqei aqeiVar = aqxiVar.g;
                ajsmVar2.add(aqeiVar == null ? aqei.a : aqeiVar);
            } else if ((i & 1) != 0) {
                ajsm ajsmVar3 = this.a;
                aqfa aqfaVar = aqxiVar.c;
                ajsmVar3.add(aqfaVar == null ? aqfa.a : aqfaVar);
            } else if ((i & 8) != 0) {
                ajsm ajsmVar4 = this.a;
                aqdi aqdiVar = aqxiVar.f;
                ajsmVar4.add(aqdiVar == null ? aqdi.a : aqdiVar);
            } else if ((i & 4) != 0) {
                ajsm ajsmVar5 = this.a;
                aqea aqeaVar = aqxiVar.e;
                ajsmVar5.add(aqeaVar == null ? aqea.a : aqeaVar);
            } else if ((i & 2) != 0) {
                ajsm ajsmVar6 = this.a;
                aqio aqioVar = aqxiVar.d;
                ajsmVar6.add(aqioVar == null ? aqio.a : aqioVar);
            }
        }
        this.a.add(this.d);
        yniVar.g(this);
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        this.c.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aabk aabkVar = (aabk) obj;
                if (aabkVar.b() == this.b) {
                    this.a.clear();
                    return null;
                }
                this.a.remove(aabkVar.b());
                return null;
            } else if (i == 1) {
                aawi aawiVar = (aawi) obj;
                if (aawiVar.b() == this.b) {
                    this.a.clear();
                    return null;
                }
                this.a.remove(aawiVar.b());
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aabk.class, aawi.class};
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }
}
