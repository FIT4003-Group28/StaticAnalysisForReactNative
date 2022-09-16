package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpua  reason: default package */
/* loaded from: classes5.dex */
final class cpua extends cppq {
    final /* synthetic */ cpub a;

    public cpua(cpub cpubVar) {
        this.a = cpubVar;
    }

    @Override // defpackage.cppq
    public final void a(Map<String, List<cpot>> map, cptb cptbVar) {
        cpub cpubVar = this.a;
        ArrayList a = cpwi.a();
        for (List<cpot> list : map.values()) {
            a.addAll(list);
        }
        cpubVar.f(a, cptbVar);
    }
}
