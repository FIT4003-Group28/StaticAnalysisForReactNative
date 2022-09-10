package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bln  reason: default package */
/* loaded from: classes3.dex */
public final class bln extends blc<bnc, Path> {
    private final bnc e;
    private final Path f;

    public bln(List<bpt<bnc>> list) {
        super(list);
        this.e = new bnc();
        this.f = new Path();
    }

    @Override // defpackage.blc
    public final /* bridge */ /* synthetic */ Path i(bpt<bnc> bptVar, float f) {
        List<blu> list;
        bnc bncVar = bptVar.b;
        bnc bncVar2 = bptVar.c;
        bnc bncVar3 = this.e;
        if (bncVar3.b == null) {
            bncVar3.b = new PointF();
        }
        boolean z = true;
        if (!bncVar.c && !bncVar2.c) {
            z = false;
        }
        bncVar3.c = z;
        if (bncVar.a.size() != bncVar2.a.size()) {
            int size = bncVar.a.size();
            int size2 = bncVar2.a.size();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Curves must have the same number of control points. Shape 1: ");
            sb.append(size);
            sb.append("\tShape 2: ");
            sb.append(size2);
            bpo.a(sb.toString());
        }
        int min = Math.min(bncVar.a.size(), bncVar2.a.size());
        if (bncVar3.a.size() < min) {
            for (int size3 = bncVar3.a.size(); size3 < min; size3++) {
                bncVar3.a.add(new blu());
            }
        } else if (bncVar3.a.size() > min) {
            int size4 = bncVar3.a.size();
            while (true) {
                size4--;
                if (size4 < min) {
                    break;
                }
                bncVar3.a.remove(list.size() - 1);
            }
        }
        PointF pointF = bncVar.b;
        PointF pointF2 = bncVar2.b;
        float c = bpr.c(pointF.x, pointF2.x, f);
        float c2 = bpr.c(pointF.y, pointF2.y, f);
        if (bncVar3.b == null) {
            bncVar3.b = new PointF();
        }
        bncVar3.b.set(c, c2);
        int size5 = bncVar3.a.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                bpr.b(this.e, this.f);
                return this.f;
            }
            blu bluVar = bncVar.a.get(size5);
            blu bluVar2 = bncVar2.a.get(size5);
            PointF pointF3 = bluVar.a;
            PointF pointF4 = bluVar.b;
            PointF pointF5 = bluVar.c;
            PointF pointF6 = bluVar2.a;
            PointF pointF7 = bluVar2.b;
            PointF pointF8 = bluVar2.c;
            bncVar3.a.get(size5).a.set(bpr.c(pointF3.x, pointF6.x, f), bpr.c(pointF3.y, pointF6.y, f));
            bncVar3.a.get(size5).b.set(bpr.c(pointF4.x, pointF7.x, f), bpr.c(pointF4.y, pointF7.y, f));
            bncVar3.a.get(size5).c.set(bpr.c(pointF5.x, pointF8.x, f), bpr.c(pointF5.y, pointF8.y, f));
        }
    }
}
