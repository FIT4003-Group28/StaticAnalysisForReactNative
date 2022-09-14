package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amsv  reason: default package */
/* loaded from: classes2.dex */
public class amsv {
    public static final dcqe b = dcqe.c("amsv");

    @dzsi
    public static amsv b(List<amsv> list) {
        amsv amsvVar = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            amsv amsvVar2 = list.get(i);
            amss amssVar = null;
            if (amsvVar != null && amsvVar2 != null) {
                ArrayList arrayList = new ArrayList();
                amst.a(amsvVar, arrayList);
                amst.a(amsvVar2, arrayList);
                amssVar = new amss((amsv[]) arrayList.toArray(new amsv[0]));
            }
            if (amssVar != null) {
                amsvVar = amssVar;
            }
        }
        return amsvVar;
    }

    public boolean a() {
        return false;
    }
}
