package defpackage;
/* compiled from: PG */
/* renamed from: bny  reason: default package */
/* loaded from: classes3.dex */
public final class bny {
    private static final bph a = bph.a("a");
    private static final bph b = bph.a("fc", "sc", "sw", "t");

    public static bmn a(bpj bpjVar, bis bisVar) {
        bpjVar.f();
        bmn bmnVar = null;
        while (bpjVar.h()) {
            if (bpjVar.j(a) == 0) {
                bpjVar.f();
                bmd bmdVar = null;
                bmd bmdVar2 = null;
                bme bmeVar = null;
                bme bmeVar2 = null;
                while (bpjVar.h()) {
                    int j = bpjVar.j(b);
                    if (j == 0) {
                        bmdVar = boa.f(bpjVar, bisVar);
                    } else if (j == 1) {
                        bmdVar2 = boa.f(bpjVar, bisVar);
                    } else if (j == 2) {
                        bmeVar = boa.a(bpjVar, bisVar);
                    } else if (j == 3) {
                        bmeVar2 = boa.a(bpjVar, bisVar);
                    } else {
                        bpjVar.k();
                        bpjVar.p();
                    }
                }
                bpjVar.g();
                bmnVar = new bmn(bmdVar, bmdVar2, bmeVar, bmeVar2);
            } else {
                bpjVar.k();
                bpjVar.p();
            }
        }
        bpjVar.g();
        return bmnVar == null ? new bmn(null, null, null, null) : bmnVar;
    }
}
