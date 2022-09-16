package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfd  reason: default package */
/* loaded from: classes4.dex */
public final class sfd extends sbs {
    final /* synthetic */ sff a;

    public sfd(sff sffVar) {
        this.a = sffVar;
    }

    @Override // defpackage.sbs
    public final void a() {
        sff sffVar = this.a;
        if (sffVar.b) {
            sffVar.a.setVisibility(0);
        }
    }

    @Override // defpackage.sbs
    public final void b(Map map, sfa sfaVar) {
        scd h = this.a.c.h();
        if (map.isEmpty() || map.keySet().contains(h.e())) {
            this.a.a(h);
            return;
        }
        sff sffVar = this.a;
        sffVar.a(sffVar.c.i((String) map.keySet().iterator().next()));
    }

    @Override // defpackage.sbs
    public final void d(List list) {
        boolean z;
        sff sffVar = this.a;
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                z = true;
                break;
            }
            sgt sgtVar = (sgt) it.next();
            sgp c = sgtVar.c(sgq.a);
            List list2 = sgtVar.a;
            for (int i = 0; i < list2.size(); i++) {
                if (((Double) c.a(list2.get(i), i, sgtVar)) != null) {
                    break loop0;
                }
            }
        }
        sffVar.b = z;
        if (!z) {
            sffVar.a.setVisibility(8);
        }
    }
}
