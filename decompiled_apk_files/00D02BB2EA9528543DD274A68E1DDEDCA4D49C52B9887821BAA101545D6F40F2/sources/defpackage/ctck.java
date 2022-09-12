package defpackage;

import android.util.Pair;
import java.util.List;
/* compiled from: PG */
/* renamed from: ctck  reason: default package */
/* loaded from: classes5.dex */
final class ctck implements cswc<Integer> {
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ ctct c;

    public ctck(ctct ctctVar, int i, List list) {
        this.c = ctctVar;
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.cswc
    public final /* bridge */ /* synthetic */ void a(Integer num) {
        Integer num2 = num;
        synchronized (this.c) {
            Integer valueOf = Integer.valueOf(Math.max(num2.intValue(), this.a));
            for (ctyy ctyyVar : this.b) {
                if (ctyyVar.d().equals(ctyx.INVALID)) {
                    cstl.a("LiMsgController");
                } else {
                    this.c.u.put(ctyyVar, new Pair<>(valueOf, 0L));
                }
            }
            ctct ctctVar = this.c;
            ctctVar.o.removeCallbacks(ctctVar.A);
            ctct ctctVar2 = this.c;
            ctctVar2.o.postDelayed(ctctVar2.A, 0L);
        }
    }
}
