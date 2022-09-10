package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: boy  reason: default package */
/* loaded from: classes3.dex */
public final class boy implements bpe<bnc> {
    public static final boy a = new boy();
    private static final bph b = bph.a("c", "v", "i", "o");

    private boy() {
    }

    @Override // defpackage.bpe
    public final /* bridge */ /* synthetic */ bnc a(bpj bpjVar, float f) {
        if (bpjVar.r() == 1) {
            bpjVar.d();
        }
        bpjVar.f();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (bpjVar.h()) {
            int j = bpjVar.j(b);
            if (j == 0) {
                z = bpjVar.m();
            } else if (j == 1) {
                list = bom.b(bpjVar, f);
            } else if (j == 2) {
                list2 = bom.b(bpjVar, f);
            } else if (j != 3) {
                bpjVar.k();
                bpjVar.p();
            } else {
                list3 = bom.b(bpjVar, f);
            }
        }
        bpjVar.g();
        if (bpjVar.r() == 2) {
            bpjVar.e();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new bnc(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new blu(bpr.a(list.get(i2), list3.get(i2)), bpr.a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new blu(bpr.a(list.get(i3), list3.get(i3)), bpr.a(pointF3, list2.get(0)), pointF3));
        }
        return new bnc(pointF, z, arrayList);
    }
}
