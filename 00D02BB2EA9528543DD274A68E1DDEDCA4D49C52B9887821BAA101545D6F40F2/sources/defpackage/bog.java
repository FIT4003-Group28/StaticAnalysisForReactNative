package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bog  reason: default package */
/* loaded from: classes3.dex */
public final class bog {
    private static final bph a = bph.a("ch", "size", "w", "style", "fFamily", "data");
    private static final bph b = bph.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static blx a(bpj bpjVar, bis bisVar) {
        ArrayList arrayList = new ArrayList();
        bpjVar.f();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                c = bpjVar.l().charAt(0);
            } else if (j == 1) {
                bpjVar.n();
            } else if (j == 2) {
                d = bpjVar.n();
            } else if (j == 3) {
                str = bpjVar.l();
            } else if (j == 4) {
                str2 = bpjVar.l();
            } else if (j == 5) {
                bpjVar.f();
                while (bpjVar.h()) {
                    if (bpjVar.j(b) == 0) {
                        bpjVar.d();
                        while (bpjVar.h()) {
                            arrayList.add((bne) bod.a(bpjVar, bisVar));
                        }
                        bpjVar.e();
                    } else {
                        bpjVar.k();
                        bpjVar.p();
                    }
                }
                bpjVar.g();
            } else {
                bpjVar.k();
                bpjVar.p();
            }
        }
        bpjVar.g();
        return new blx(arrayList, c, d, str, str2);
    }
}
