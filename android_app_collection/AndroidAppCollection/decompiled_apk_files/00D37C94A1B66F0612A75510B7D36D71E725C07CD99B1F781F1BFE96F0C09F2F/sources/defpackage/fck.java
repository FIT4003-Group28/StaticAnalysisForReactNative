package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: fck  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fck implements ayqb {
    public final /* synthetic */ fcl a;
    private final /* synthetic */ int b;

    public /* synthetic */ fck(fcl fclVar) {
        this.a = fclVar;
    }

    public /* synthetic */ fck(fcl fclVar, int i) {
        this.b = i;
        this.a = fclVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            fcl fclVar = this.a;
            Throwable th = (Throwable) obj;
            aypg aypgVar = fclVar.e;
            if (aypgVar == null || aypgVar.e()) {
                return;
            }
            ayqi.c((AtomicReference) fclVar.e);
            return;
        }
        this.a.c((asyv) obj);
    }
}
