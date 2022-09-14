package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzlv  reason: default package */
/* loaded from: classes6.dex */
public final class dzlv extends dzmb implements dzrs<dzme> {
    final /* synthetic */ dzmd a;
    private dzlz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzlv(dzmd dzmdVar) {
        super(dzmdVar);
        this.a = dzmdVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        dzme dzmeVar = (dzme) obj;
        dzmb.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dzlz dzlzVar = new dzlz(this.a, c());
        this.b = dzlzVar;
        return dzlzVar;
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final /* bridge */ /* synthetic */ Object previous() {
        dzlz dzlzVar = new dzlz(this.a, d());
        this.b = dzlzVar;
        return dzlzVar;
    }

    @Override // defpackage.dzmb, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        super.remove();
        this.b.a = -1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        dzme dzmeVar = (dzme) obj;
        dzmb.f();
    }
}
