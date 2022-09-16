package defpackage;

import android.graphics.PointF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bob  reason: default package */
/* loaded from: classes3.dex */
public final class bob {
    private static final bph a = bph.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmr a(bpj bpjVar, bis bisVar, int i) {
        boolean z = i == 3;
        String str = null;
        bmp<PointF, PointF> bmpVar = null;
        bmi bmiVar = null;
        boolean z2 = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                bmpVar = bnx.b(bpjVar, bisVar);
            } else if (j == 2) {
                bmiVar = boa.d(bpjVar, bisVar);
            } else if (j == 3) {
                z2 = bpjVar.m();
            } else if (j == 4) {
                z = bpjVar.o() == 3;
            } else {
                bpjVar.k();
                bpjVar.p();
            }
        }
        return new bmr(str, bmpVar, bmiVar, z, z2);
    }
}
