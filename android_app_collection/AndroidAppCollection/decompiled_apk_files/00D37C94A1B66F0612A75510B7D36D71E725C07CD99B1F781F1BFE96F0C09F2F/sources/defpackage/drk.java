package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: drk  reason: default package */
/* loaded from: classes3.dex */
public final class drk extends drf {
    /* JADX INFO: Access modifiers changed from: protected */
    public drk() {
        this.a.add(drr.AND);
        this.a.add(drr.NOT);
        this.a.add(drr.OR);
    }

    @Override // defpackage.drf
    public final dqz a(String str, dpu dpuVar, List list) {
        drr drrVar = drr.ADD;
        int ordinal = dqt.h(str).ordinal();
        if (ordinal == 1) {
            dqt.k(drr.AND, 2, list);
            dqz b = dpuVar.b((dqz) list.get(0));
            return !b.g().booleanValue() ? b : dpuVar.b((dqz) list.get(1));
        } else if (ordinal == 47) {
            dqt.k(drr.NOT, 1, list);
            return new dqp(Boolean.valueOf(!dpuVar.b((dqz) list.get(0)).g().booleanValue()));
        } else if (ordinal == 50) {
            dqt.k(drr.OR, 2, list);
            dqz b2 = dpuVar.b((dqz) list.get(0));
            return b2.g().booleanValue() ? b2 : dpuVar.b((dqz) list.get(1));
        } else {
            return super.b(str);
        }
    }
}
