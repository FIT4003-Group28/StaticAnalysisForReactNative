package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpb  reason: default package */
/* loaded from: classes3.dex */
public final class bpb {
    static final bph a = bph.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bnf a(bpj bpjVar, bis bisVar) {
        int i = 0;
        String str = null;
        bmk bmkVar = null;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                i = bpjVar.o();
            } else if (j == 2) {
                bmkVar = boa.e(bpjVar, bisVar);
            } else if (j == 3) {
                z = bpjVar.m();
            } else {
                bpjVar.p();
            }
        }
        return new bnf(str, i, bmkVar, z);
    }
}
