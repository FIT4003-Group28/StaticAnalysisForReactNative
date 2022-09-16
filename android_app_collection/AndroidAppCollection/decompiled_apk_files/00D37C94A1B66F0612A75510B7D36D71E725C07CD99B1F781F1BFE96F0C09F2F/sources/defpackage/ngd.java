package defpackage;
/* compiled from: PG */
/* renamed from: ngd */
/* loaded from: classes3.dex */
public final class ngd implements akev {
    final /* synthetic */ nge a;

    public ngd(nge ngeVar) {
        this.a = ngeVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        zep.d("Failed to update offline first add tooltip.", th);
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        ylx.m(this.a.a.b.b(new egf(19)), ngc.a);
        nge ngeVar = this.a;
        ngeVar.b = null;
        nfy nfyVar = ngeVar.d;
        if (nfyVar != null) {
            nfz nfzVar = nfyVar.a;
            nfzVar.a.f(nfzVar.b);
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
    }
}
