package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzom  reason: default package */
/* loaded from: classes6.dex */
public final class dzom extends dzor implements dzrn<dzop> {
    final /* synthetic */ dzot a;
    private dzop h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzom(dzot dzotVar) {
        super(dzotVar);
        this.a = dzotVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzop dzopVar = new dzop(this.a, a());
        this.h = dzopVar;
        return dzopVar;
    }

    @Override // defpackage.dzor, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
