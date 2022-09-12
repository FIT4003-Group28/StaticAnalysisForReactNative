package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.List;
/* compiled from: PG */
/* renamed from: aijn  reason: default package */
/* loaded from: classes2.dex */
final class aijn extends aijo {
    private final dqzv c;

    public aijn(long j, dqzv dqzvVar) {
        super(PersonId.b(dqzvVar), j);
        if (this.a == null) {
            dcqe dcqeVar = aijp.a;
            bvoo.h("Attempted to mutate share for unknown sharer.", new Object[0]);
        }
        this.c = dqzvVar;
    }

    @Override // defpackage.aijo
    public final void a(List<dqzv> list) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            int a = dqzq.a(list.get(i).d);
            if (a == 0) {
                a = 1;
            }
            int a2 = dqzq.a(this.c.d);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a == 2) {
                a = 3;
            }
            if (a2 == 2) {
                a2 = 3;
            }
            if (a == a2) {
                list.set(i, this.c);
                z = true;
            }
        }
        if (!z) {
            list.add(this.c);
        }
    }
}
