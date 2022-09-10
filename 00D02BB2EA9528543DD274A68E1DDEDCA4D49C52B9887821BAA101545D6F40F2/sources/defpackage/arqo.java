package defpackage;

import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: arqo  reason: default package */
/* loaded from: classes2.dex */
final class arqo implements arxo<arxa> {
    final /* synthetic */ arqp a;

    public arqo(arqp arqpVar) {
        this.a = arqpVar;
    }

    @Override // defpackage.arxo
    public final void a(dcdc<arxa> dcdcVar) {
        ArrayList<arxa> arrayList = new ArrayList();
        arqp arqpVar = this.a;
        String l = arqpVar.a.l();
        if (l != null) {
            if (!arqpVar.a.m() || !l.equals(arqpVar.a.p())) {
                dcpd<Map.Entry<arun, ResolveInfo>> it = arqpVar.a.k().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<arun, ResolveInfo> next = it.next();
                    if (l.equals(next.getValue().serviceInfo.packageName)) {
                        arrayList.add(arqpVar.c.a(next.getKey(), arqpVar.b.k(), next.getValue()).b());
                        break;
                    }
                }
            } else {
                arvy arvyVar = arqpVar.d;
                dbsk.s(arvyVar);
                arrayList.add(arvyVar.a(arqpVar.b.k()).b());
            }
        }
        arrayList.addAll(dcdcVar);
        arqp arqpVar2 = this.a;
        arxr arxrVar = arqpVar2.b;
        String l2 = arqpVar2.a.l();
        if (l2 != null) {
            for (arxa arxaVar : arrayList) {
                if (arxaVar.ag().equals(l2)) {
                    break;
                }
            }
        }
        arxaVar = !arrayList.isEmpty() ? (arxa) arrayList.get(0) : null;
        arxrVar.c(arxaVar, arrayList);
    }
}
