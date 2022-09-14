package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bow  reason: default package */
/* loaded from: classes3.dex */
public final class bow {
    private static final bph a = bph.a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bnb a(bpj bpjVar, bis bisVar) {
        String str = null;
        bme bmeVar = null;
        bme bmeVar2 = null;
        bmo bmoVar = null;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                bmeVar = boa.b(bpjVar, bisVar, false);
            } else if (j == 2) {
                bmeVar2 = boa.b(bpjVar, bisVar, false);
            } else if (j == 3) {
                bmoVar = bnz.a(bpjVar, bisVar);
            } else if (j == 4) {
                z = bpjVar.m();
            } else {
                bpjVar.p();
            }
        }
        return new bnb(str, bmeVar, bmeVar2, bmoVar, z);
    }
}
