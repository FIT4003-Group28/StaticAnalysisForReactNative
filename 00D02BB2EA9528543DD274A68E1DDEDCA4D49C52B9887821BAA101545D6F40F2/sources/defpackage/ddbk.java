package defpackage;

import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddbk  reason: default package */
/* loaded from: classes5.dex */
public final class ddbk implements Runnable {
    final /* synthetic */ deig a;
    final /* synthetic */ ddbn b;

    public ddbk(ddbn ddbnVar, deig deigVar) {
        this.b = ddbnVar;
        this.a = deigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                if (deha.r(this.a) == ddbn.b) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.p(this.a);
    }
}
