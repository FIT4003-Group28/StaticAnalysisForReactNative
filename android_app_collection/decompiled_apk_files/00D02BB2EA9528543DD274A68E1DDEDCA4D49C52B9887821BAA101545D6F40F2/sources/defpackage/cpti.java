package defpackage;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpti  reason: default package */
/* loaded from: classes5.dex */
final class cpti extends cppq {
    final /* synthetic */ cptj a;

    public cpti(cptj cptjVar) {
        this.a = cptjVar;
    }

    @Override // defpackage.cppq
    public final void a(Map<String, List<cpot>> map, cptb cptbVar) {
        ArrayList arrayList = new ArrayList();
        for (List<cpot> list : map.values()) {
            arrayList.addAll(list);
        }
        this.a.g(arrayList, cptbVar);
        this.a.e = true;
    }

    @Override // defpackage.cppq
    public final void d() {
        this.a.h().a();
    }

    @Override // defpackage.cppq
    public final void e() {
        cptj cptjVar = this.a;
        cptjVar.e = false;
        cptjVar.h().a();
        cpts h = this.a.h();
        cpty cptyVar = this.a.a;
        cptz cptzVar = h.a;
        cptzVar.d = cptyVar.a;
        cptzVar.e = cptyVar.b;
        cptzVar.f = cptyVar.c;
        cptzVar.b.setColor(cptyVar.d);
        cptzVar.a.setColor(cptyVar.e);
        cptzVar.b.clearShadowLayer();
        cptzVar.setLayerType(0, null);
        int ceil = (int) Math.ceil(cptzVar.f);
        cptzVar.setPadding(Math.abs(Math.min(0, 0)) + ceil, Math.abs(Math.min(0, 0)) + ceil, Math.max(0, 0) + ceil, ceil + Math.max(0, 0));
        cptzVar.c = new Paint();
        cptzVar.c.set(cptzVar.b);
        cptzVar.c.setStyle(Paint.Style.STROKE);
        cptzVar.c.clearShadowLayer();
    }
}
