package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dqc  reason: default package */
/* loaded from: classes3.dex */
public final class dqc extends dqs {
    final boolean a;
    final boolean b;
    final /* synthetic */ dqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqc(dqd dqdVar, boolean z, boolean z2) {
        super("log");
        this.c = dqdVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        dqt.n("log", 1, list);
        if (list.size() == 1) {
            this.c.a.a(3, dpuVar.b((dqz) list.get(0)).i(), Collections.emptyList(), this.a, this.b);
            return f;
        }
        int f = dqt.f(dpuVar.b((dqz) list.get(0)).h().doubleValue());
        int i = f != 2 ? f != 3 ? f != 5 ? f != 6 ? 3 : 2 : 5 : 1 : 4;
        String i2 = dpuVar.b((dqz) list.get(1)).i();
        if (list.size() == 2) {
            this.c.a.a(i, i2, Collections.emptyList(), this.a, this.b);
            return f;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
            arrayList.add(dpuVar.b((dqz) list.get(i3)).i());
        }
        this.c.a.a(i, i2, arrayList, this.a, this.b);
        return f;
    }
}
