package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cngc  reason: default package */
/* loaded from: classes5.dex */
public final class cngc implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ cngn b;

    public cngc(cngn cngnVar, Callable callable) {
        this.b = cngnVar;
        this.a = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.b = ((Boolean) this.a.call()).booleanValue();
        } catch (Exception e) {
            this.b.b = false;
            throw new RuntimeException("Input connection action failed", e);
        }
    }
}
