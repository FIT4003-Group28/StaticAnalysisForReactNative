package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vmz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vmz implements anir {
    public final /* synthetic */ vne a;
    public final /* synthetic */ anir b;
    public final /* synthetic */ Executor c;
    private final /* synthetic */ int d;

    public /* synthetic */ vmz(vne vneVar, anir anirVar, Executor executor) {
        this.a = vneVar;
        this.b = anirVar;
        this.c = executor;
    }

    public /* synthetic */ vmz(vne vneVar, anir anirVar, Executor executor, int i) {
        this.d = i;
        this.a = vneVar;
        this.b = anirVar;
        this.c = executor;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.d == 0) {
            vne vneVar = this.a;
            return vneVar.b.j(this.b, this.c);
        }
        vne vneVar2 = this.a;
        return vneVar2.b.j(this.b, this.c);
    }
}
