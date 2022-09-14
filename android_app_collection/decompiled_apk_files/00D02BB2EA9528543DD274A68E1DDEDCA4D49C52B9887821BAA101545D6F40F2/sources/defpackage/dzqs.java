package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzqs  reason: default package */
/* loaded from: classes6.dex */
public final class dzqs extends dzqx implements dzrn<dzqo> {
    final /* synthetic */ dzqz a;
    private dzqv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqs(dzqz dzqzVar) {
        super(dzqzVar);
        this.a = dzqzVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzqv dzqvVar = new dzqv(this.a, a());
        this.h = dzqvVar;
        return dzqvVar;
    }

    @Override // defpackage.dzqx, java.util.Iterator
    public final void remove() {
        super.remove();
        this.h.a = -1;
    }
}
