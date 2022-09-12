package defpackage;

import android.graphics.Path;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boz  reason: default package */
/* loaded from: classes3.dex */
public final class boz {
    private static final bph a = bph.a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bnd a(bpj bpjVar, bis bisVar) {
        String str = null;
        bmd bmdVar = null;
        bmg bmgVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                bmdVar = boa.f(bpjVar, bisVar);
            } else if (j == 2) {
                bmgVar = boa.c(bpjVar, bisVar);
            } else if (j == 3) {
                z = bpjVar.m();
            } else if (j == 4) {
                i = bpjVar.o();
            } else if (j == 5) {
                z2 = bpjVar.m();
            } else {
                bpjVar.k();
                bpjVar.p();
            }
        }
        return new bnd(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, bmdVar, bmgVar, z2);
    }
}
