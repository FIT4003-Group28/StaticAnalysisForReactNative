package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzjl  reason: default package */
/* loaded from: classes.dex */
public final class dzjl extends dzjq implements dzrn<dzjh> {
    final /* synthetic */ dzjs a;
    private dzjo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzjl(dzjs dzjsVar) {
        super(dzjsVar);
        this.a = dzjsVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzjo dzjoVar = new dzjo(this.a, b());
        this.h = dzjoVar;
        return dzjoVar;
    }

    @Override // defpackage.dzjq, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
