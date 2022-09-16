package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgi  reason: default package */
/* loaded from: classes2.dex */
public final class cgi implements Callable {
    final /* synthetic */ cgn a;

    public cgi(cgn cgnVar) {
        this.a = cgnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        synchronized (this.a) {
            cgn cgnVar = this.a;
            if (cgnVar.f == null) {
                return null;
            }
            cgnVar.g();
            if (this.a.h()) {
                this.a.e();
                this.a.h = 0;
            }
            return null;
        }
    }
}
