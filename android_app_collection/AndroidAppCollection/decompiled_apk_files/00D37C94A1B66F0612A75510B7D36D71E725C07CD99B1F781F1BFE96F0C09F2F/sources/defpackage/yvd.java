package defpackage;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yvd  reason: default package */
/* loaded from: classes4.dex */
public final class yvd extends yjg {
    private final Set a;

    public yvd(Set set) {
        this.a = set;
    }

    @Override // defpackage.yjg
    protected final void a() {
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (amfb amfbVar : this.a) {
            arrayList.add(amfbVar.c());
        }
        anlz.z(anlz.l(arrayList).c(anlf.a, anjk.a));
    }
}
