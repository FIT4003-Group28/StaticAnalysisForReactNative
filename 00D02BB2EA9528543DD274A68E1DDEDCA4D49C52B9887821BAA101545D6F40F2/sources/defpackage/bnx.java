package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnx  reason: default package */
/* loaded from: classes3.dex */
public final class bnx {
    private static final bph a = bph.a("k", "x", "y");

    public static bmh a(bpj bpjVar, bis bisVar) {
        ArrayList arrayList = new ArrayList();
        if (bpjVar.r() == 1) {
            bpjVar.d();
            while (bpjVar.h()) {
                arrayList.add(new blj(bisVar, bon.a(bpjVar, bisVar, bps.g(), bos.a, bpjVar.r() == 3)));
            }
            bpjVar.e();
            boo.b(arrayList);
        } else {
            arrayList.add(new bpt(bom.c(bpjVar, bps.g())));
        }
        return new bmh(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmp<PointF, PointF> b(bpj bpjVar, bis bisVar) {
        bpjVar.f();
        bmh bmhVar = null;
        bme bmeVar = null;
        bme bmeVar2 = null;
        boolean z = false;
        while (bpjVar.r() != 4) {
            int j = bpjVar.j(a);
            if (j == 0) {
                bmhVar = a(bpjVar, bisVar);
            } else if (j != 1) {
                if (j == 2) {
                    if (bpjVar.r() == 6) {
                        bpjVar.p();
                        z = true;
                    } else {
                        bmeVar2 = boa.a(bpjVar, bisVar);
                    }
                } else {
                    bpjVar.k();
                    bpjVar.p();
                }
            } else if (bpjVar.r() == 6) {
                bpjVar.p();
                z = true;
            } else {
                bmeVar = boa.a(bpjVar, bisVar);
            }
        }
        bpjVar.g();
        if (z) {
            bisVar.a("Lottie doesn't support expressions.");
        }
        return bmhVar != null ? bmhVar : new bml(bmeVar, bmeVar2);
    }
}
