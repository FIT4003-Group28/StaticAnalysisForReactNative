package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: emz  reason: default package */
/* loaded from: classes3.dex */
final class emz implements fqc {
    final /* synthetic */ enc a;

    public emz(enc encVar) {
        this.a = encVar;
    }

    @Override // defpackage.fqc
    public final void a() {
    }

    @Override // defpackage.fqc
    public final void b() {
        enc encVar = this.a;
        List list = (List) encVar.b.get(ena.a);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            enb enbVar = (enb) it.next();
            aafx.d(encVar.c, enbVar.a, enbVar.b);
            boolean z = enbVar.c;
            it.remove();
        }
    }
}
