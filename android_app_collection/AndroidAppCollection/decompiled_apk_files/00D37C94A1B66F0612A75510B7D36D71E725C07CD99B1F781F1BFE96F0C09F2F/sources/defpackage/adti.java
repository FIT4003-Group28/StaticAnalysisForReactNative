package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: adti  reason: default package */
/* loaded from: classes.dex */
public final class adti implements adss {
    public adss a = null;
    public final BlockingQueue b = new LinkedBlockingQueue();

    @Override // defpackage.adss
    public final void b(adtd adtdVar) {
        adss adssVar = this.a;
        if (adssVar != null) {
            adssVar.b(adtdVar);
            return;
        }
        try {
            this.b.put(adtdVar);
        } catch (InterruptedException unused) {
            zep.c("MDX.transport", "Could not queue local transport message.");
        }
    }
}
