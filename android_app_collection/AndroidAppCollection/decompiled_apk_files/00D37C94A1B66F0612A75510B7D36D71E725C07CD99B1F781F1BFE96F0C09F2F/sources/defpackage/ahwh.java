package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahwh  reason: default package */
/* loaded from: classes.dex */
public final class ahwh extends ajbg {
    final /* synthetic */ long a;
    final /* synthetic */ ahwi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwh(ahwi ahwiVar, long j) {
        super(9223372036854775806L, Long.MAX_VALUE, 1, 1, null);
        this.b = ahwiVar;
        this.a = j;
    }

    @Override // defpackage.ajbg
    protected final void b(boolean z, boolean z2, boolean z3) {
        ahwi ahwiVar = this.b;
        if (ahwiVar.i) {
            Executor executor = ahwiVar.a;
            final long j = this.a;
            executor.execute(new Runnable() { // from class: ahwg
                @Override // java.lang.Runnable
                public final void run() {
                    ahwh ahwhVar = ahwh.this;
                    long j2 = j;
                    ahwi ahwiVar2 = ahwhVar.b;
                    ahwiVar2.d.i(ahwiVar2.e);
                    ahwi ahwiVar3 = ahwhVar.b;
                    ahwiVar3.d.i(ahwiVar3.f);
                    ahwi ahwiVar4 = ahwhVar.b;
                    ahwiVar4.d.i(ahwiVar4.g);
                    ahwi ahwiVar5 = ahwhVar.b;
                    ahwiVar5.d.c(ahwiVar5.e);
                    ahwi ahwiVar6 = ahwhVar.b;
                    ahwiVar6.d.c(ahwiVar6.f);
                    ahwi ahwiVar7 = ahwhVar.b;
                    ahwiVar7.d.c(ahwiVar7.g);
                    ahwhVar.b.d(j2);
                }
            });
        }
    }
}
