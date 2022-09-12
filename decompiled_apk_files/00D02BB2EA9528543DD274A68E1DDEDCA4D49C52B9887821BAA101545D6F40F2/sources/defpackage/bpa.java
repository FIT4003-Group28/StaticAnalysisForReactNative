package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpa  reason: default package */
/* loaded from: classes3.dex */
public final class bpa {
    private static final bph a = bph.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bne a(bpj bpjVar, bis bisVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                z = bpjVar.m();
            } else if (j == 2) {
                bpjVar.d();
                while (bpjVar.h()) {
                    bms a2 = bod.a(bpjVar, bisVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                bpjVar.e();
            } else {
                bpjVar.p();
            }
        }
        return new bne(str, arrayList, z);
    }
}
