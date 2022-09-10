package defpackage;
/* compiled from: PG */
/* renamed from: bor  reason: default package */
/* loaded from: classes3.dex */
final class bor {
    private static final bph a = bph.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmx a(bpj bpjVar) {
        int i = 0;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                bpjVar.l();
            } else if (j == 1) {
                int o = bpjVar.o();
                if (o != 1) {
                    if (o == 2) {
                        i = 2;
                    } else if (o == 3) {
                        i = 3;
                    } else if (o == 4) {
                        i = 4;
                    } else if (o == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (j == 2) {
                z = bpjVar.m();
            } else {
                bpjVar.k();
                bpjVar.p();
            }
        }
        return new bmx(i, z);
    }
}
