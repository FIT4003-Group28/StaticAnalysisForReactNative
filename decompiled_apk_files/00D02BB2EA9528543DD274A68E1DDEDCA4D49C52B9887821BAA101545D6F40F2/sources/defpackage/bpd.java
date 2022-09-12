package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpd  reason: default package */
/* loaded from: classes3.dex */
public final class bpd {
    private static final bph a = bph.a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bnj a(bpj bpjVar, bis bisVar) {
        bme bmeVar = null;
        bme bmeVar2 = null;
        bme bmeVar3 = null;
        int i = 0;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                bmeVar = boa.b(bpjVar, bisVar, false);
            } else if (j == 1) {
                bmeVar2 = boa.b(bpjVar, bisVar, false);
            } else if (j == 2) {
                bmeVar3 = boa.b(bpjVar, bisVar, false);
            } else if (j == 3) {
                bpjVar.l();
            } else if (j == 4) {
                int o = bpjVar.o();
                if (o == 1) {
                    i = 1;
                } else if (o != 2) {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unknown trim path type ");
                    sb.append(o);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    i = 2;
                }
            } else if (j == 5) {
                z = bpjVar.m();
            } else {
                bpjVar.p();
            }
        }
        return new bnj(i, bmeVar, bmeVar2, bmeVar3, z);
    }
}
