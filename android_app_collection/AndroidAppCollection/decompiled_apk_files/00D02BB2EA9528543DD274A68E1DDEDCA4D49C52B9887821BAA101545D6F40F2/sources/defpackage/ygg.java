package defpackage;

import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ygg  reason: default package */
/* loaded from: classes7.dex */
public final class ygg implements cqkn<yfr> {
    final /* synthetic */ ygh a;

    public ygg(ygh yghVar) {
        this.a = yghVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(yfr yfrVar, View view) {
        yfr yfrVar2 = yfrVar;
        akqi c = yfrVar2.c();
        if (c == null) {
            return;
        }
        this.a.e.b();
        qdf o = qdg.o();
        ygh yghVar = this.a;
        dopk a = yghVar.p.a(c);
        qdi qdiVar = null;
        if (a != null) {
            Iterator<doph> it = a.e.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (dooo doooVar : it.next().d) {
                    if (akqi.b(doooVar.b).equals(yghVar.h)) {
                        qdiVar = qdi.b(doooVar);
                        break loop0;
                    }
                }
            }
        }
        qaw qawVar = (qaw) o;
        qawVar.c = qdiVar;
        o.f(true);
        qawVar.b = c.o();
        qawVar.a = yfrVar2.b();
        this.a.c.t(o.h());
    }
}
