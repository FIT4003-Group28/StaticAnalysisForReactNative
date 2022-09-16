package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahwd  reason: default package */
/* loaded from: classes.dex */
public final class ahwd extends ajbg {
    final /* synthetic */ long a;
    final /* synthetic */ ahwi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwd(ahwi ahwiVar, long j, long j2) {
        super(-9223372036854775806L, j, 1, 1, null);
        this.b = ahwiVar;
        this.a = j2;
    }

    @Override // defpackage.ajbg
    protected final void b(boolean z, boolean z2, boolean z3) {
        if (z2) {
            this.b.f(0);
            return;
        }
        Executor executor = this.b.a;
        final long j = this.a;
        executor.execute(new Runnable() { // from class: ahwc
            @Override // java.lang.Runnable
            public final void run() {
                ahwd ahwdVar = ahwd.this;
                ahwdVar.b.d(j);
            }
        });
    }
}
