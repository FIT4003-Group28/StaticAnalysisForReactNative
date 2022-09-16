package defpackage;

import android.graphics.PointF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bov  reason: default package */
/* loaded from: classes3.dex */
public final class bov {
    private static final bph a = bph.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bna a(bpj bpjVar, bis bisVar) {
        String str = null;
        bmp<PointF, PointF> bmpVar = null;
        bmi bmiVar = null;
        bme bmeVar = null;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(a);
            if (j == 0) {
                str = bpjVar.l();
            } else if (j == 1) {
                bmpVar = bnx.b(bpjVar, bisVar);
            } else if (j == 2) {
                bmiVar = boa.d(bpjVar, bisVar);
            } else if (j == 3) {
                bmeVar = boa.a(bpjVar, bisVar);
            } else if (j == 4) {
                z = bpjVar.m();
            } else {
                bpjVar.p();
            }
        }
        return new bna(str, bmpVar, bmiVar, bmeVar, z);
    }
}
