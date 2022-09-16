package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: szg  reason: default package */
/* loaded from: classes4.dex */
public final class szg {
    public final ayor a;
    public final ayor b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public final szj e;

    public szg(szj szjVar, ayor ayorVar) {
        ayor a = aypa.a();
        this.e = szjVar;
        this.a = ayorVar;
        this.b = a;
        this.c = new AtomicReference();
        this.d = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        aypg aypgVar = (aypg) this.c.getAndSet(null);
        if (aypgVar != null) {
            aypgVar.qr();
        }
    }
}
