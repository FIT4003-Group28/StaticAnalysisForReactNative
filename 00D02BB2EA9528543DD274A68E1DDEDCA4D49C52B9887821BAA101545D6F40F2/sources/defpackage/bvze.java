package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvze  reason: default package */
/* loaded from: classes4.dex */
public final class bvze implements bwcb {
    public static final dcqe a = dcqe.c("bvze");
    public final Map<String, bvwz> b = new HashMap();
    public final bvws c;
    private final Executor d;

    public bvze(Executor executor, bvws bvwsVar) {
        this.d = executor;
        this.c = bvwsVar;
    }

    @Override // defpackage.bwcb
    public final void a(Object obj) {
        if (obj == null) {
            return;
        }
        for (bvwz bvwzVar : this.b.values()) {
            dehn<Map<String, Object>> b = bvwzVar.b(obj);
            if (b != null) {
                deha.q(b, new bvzd(this, bvwzVar.c()), this.d);
                return;
            }
        }
    }
}
