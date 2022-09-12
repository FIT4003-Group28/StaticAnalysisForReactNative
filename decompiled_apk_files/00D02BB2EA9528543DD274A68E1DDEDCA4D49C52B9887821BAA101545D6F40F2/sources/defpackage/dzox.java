package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzox  reason: default package */
/* loaded from: classes6.dex */
public final class dzox extends dzpc implements dzrn<dzpa> {
    final /* synthetic */ dzpe a;
    private dzpa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzox(dzpe dzpeVar) {
        super(dzpeVar);
        this.a = dzpeVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzpa dzpaVar = new dzpa(this.a, a());
        this.h = dzpaVar;
        return dzpaVar;
    }

    @Override // defpackage.dzpc, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
