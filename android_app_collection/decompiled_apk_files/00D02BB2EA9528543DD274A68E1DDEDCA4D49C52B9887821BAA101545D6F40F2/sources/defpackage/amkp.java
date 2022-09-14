package defpackage;

import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amkp  reason: default package */
/* loaded from: classes.dex */
public final class amkp {
    private static final dcqe e = dcqe.c("amkp");
    private static final amko f = amko.a;
    public final Set<akvw> a = new HashSet();
    public final Set<akvw> b = new HashSet();
    public final Set<akvw> c = new HashSet();
    public amko d = f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(amko amkoVar) {
        if (!this.d.equals(f)) {
            bvoo.h("Can only set the ServerRenderOpListener once!", new Object[0]);
        }
        this.d = amkoVar;
        if (!this.c.isEmpty()) {
            akvv.c(dcep.K(this.c), dcmr.a);
            amkoVar.a();
        }
    }
}
