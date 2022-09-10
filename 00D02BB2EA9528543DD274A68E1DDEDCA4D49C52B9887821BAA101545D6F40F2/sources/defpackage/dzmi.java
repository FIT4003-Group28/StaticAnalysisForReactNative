package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzmi  reason: default package */
/* loaded from: classes6.dex */
public final class dzmi extends dzmn implements dzrn<dzme> {
    final /* synthetic */ dzmp a;
    private dzml h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzmi(dzmp dzmpVar) {
        super(dzmpVar);
        this.a = dzmpVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzml dzmlVar = new dzml(this.a, a());
        this.h = dzmlVar;
        return dzmlVar;
    }

    @Override // defpackage.dzmn, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
