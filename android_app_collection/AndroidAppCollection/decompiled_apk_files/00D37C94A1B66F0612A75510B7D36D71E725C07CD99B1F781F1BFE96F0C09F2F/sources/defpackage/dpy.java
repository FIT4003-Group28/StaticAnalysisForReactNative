package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dpy  reason: default package */
/* loaded from: classes3.dex */
final class dpy extends dqs {
    final /* synthetic */ rlo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpy(rlo rloVar) {
        super("getValue");
        this.a = rloVar;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        dqt.l("getValue", 2, list);
        dqz b = dpuVar.b((dqz) list.get(0));
        dqz b2 = dpuVar.b((dqz) list.get(1));
        String i = b.i();
        rlo rloVar = this.a;
        Map map = (Map) rloVar.b.a.get(rloVar.a);
        String str = null;
        if (map != null && map.containsKey(i)) {
            str = (String) map.get(i);
        }
        return str != null ? new drc(str) : b2;
    }
}
