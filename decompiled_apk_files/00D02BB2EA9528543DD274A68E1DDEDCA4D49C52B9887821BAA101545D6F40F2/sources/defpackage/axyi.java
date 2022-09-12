package defpackage;
/* compiled from: PG */
/* renamed from: axyi  reason: default package */
/* loaded from: classes3.dex */
final class axyi extends btnc<azxb, azwv> {
    final /* synthetic */ axyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyi(axyj axyjVar) {
        super(10000);
        this.a = axyjVar;
    }

    @Override // defpackage.btnc
    protected final /* bridge */ /* synthetic */ void Px(azxb azxbVar, azwv azwvVar) {
        azxb azxbVar2 = azxbVar;
        axyj axyjVar = this.a;
        axyjVar.c.writeLock().lock();
        try {
            if (axyjVar.e != axya.LOADING && axyjVar.e != axya.INVALIDATING) {
                axyjVar.j(axya.ENTRY_EVICTED);
                ((ckcn) axyjVar.b.a(ckir.c)).a();
                dcwa m = axyj.m(azxbVar2);
                if (m != null) {
                    axyjVar.d.e(m, azxbVar2);
                }
            }
        } finally {
            axyjVar.c.writeLock().unlock();
        }
    }
}
