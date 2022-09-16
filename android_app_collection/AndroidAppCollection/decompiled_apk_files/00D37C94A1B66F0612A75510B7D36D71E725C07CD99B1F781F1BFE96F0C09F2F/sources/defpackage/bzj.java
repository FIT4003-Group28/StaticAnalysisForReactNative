package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzj  reason: default package */
/* loaded from: classes2.dex */
public final class bzj extends byy {
    private final caw e;
    private final Path f;

    public bzj(List list) {
        super(list);
        this.e = new caw();
        this.f = new Path();
    }

    @Override // defpackage.byy
    public final /* bridge */ /* synthetic */ Object f(cdi cdiVar, float f) {
        List list;
        caw cawVar = (caw) cdiVar.b;
        caw cawVar2 = (caw) cdiVar.c;
        caw cawVar3 = this.e;
        if (cawVar3.b == null) {
            cawVar3.b = new PointF();
        }
        boolean z = true;
        if (!cawVar.c && !cawVar2.c) {
            z = false;
        }
        cawVar3.c = z;
        if (cawVar.a.size() != cawVar2.a.size()) {
            int size = cawVar.a.size();
            int size2 = cawVar2.a.size();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Curves must have the same number of control points. Shape 1: ");
            sb.append(size);
            sb.append("\tShape 2: ");
            sb.append(size2);
            cda.a(sb.toString());
        }
        int min = Math.min(cawVar.a.size(), cawVar2.a.size());
        if (cawVar3.a.size() < min) {
            for (int size3 = cawVar3.a.size(); size3 < min; size3++) {
                cawVar3.a.add(new bzq());
            }
        } else if (cawVar3.a.size() > min) {
            int size4 = cawVar3.a.size();
            while (true) {
                size4--;
                if (size4 < min) {
                    break;
                }
                cawVar3.a.remove(list.size() - 1);
            }
        }
        PointF pointF = cawVar.b;
        PointF pointF2 = cawVar2.b;
        float c = cdc.c(pointF.x, pointF2.x, f);
        float c2 = cdc.c(pointF.y, pointF2.y, f);
        if (cawVar3.b == null) {
            cawVar3.b = new PointF();
        }
        cawVar3.b.set(c, c2);
        int size5 = cawVar3.a.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                bzq bzqVar = (bzq) cawVar.a.get(size5);
                bzq bzqVar2 = (bzq) cawVar2.a.get(size5);
                PointF pointF3 = bzqVar.a;
                PointF pointF4 = bzqVar.b;
                PointF pointF5 = bzqVar.c;
                PointF pointF6 = bzqVar2.a;
                PointF pointF7 = bzqVar2.b;
                PointF pointF8 = bzqVar2.c;
                ((bzq) cawVar3.a.get(size5)).a.set(cdc.c(pointF3.x, pointF6.x, f), cdc.c(pointF3.y, pointF6.y, f));
                ((bzq) cawVar3.a.get(size5)).b.set(cdc.c(pointF4.x, pointF7.x, f), cdc.c(pointF4.y, pointF7.y, f));
                ((bzq) cawVar3.a.get(size5)).c.set(cdc.c(pointF5.x, pointF8.x, f), cdc.c(pointF5.y, pointF8.y, f));
            } else {
                cdc.g(this.e, this.f);
                return this.f;
            }
        }
    }
}
