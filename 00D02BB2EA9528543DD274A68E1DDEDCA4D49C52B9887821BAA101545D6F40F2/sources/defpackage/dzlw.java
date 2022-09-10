package defpackage;
/* compiled from: PG */
/* renamed from: dzlw  reason: default package */
/* loaded from: classes6.dex */
public final class dzlw extends dzmb implements dzrs<dzme> {
    final dzlz a;
    final /* synthetic */ dzmd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzlw(dzmd dzmdVar) {
        super(dzmdVar);
        this.b = dzmdVar;
        this.a = new dzlz(dzmdVar);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        dzme dzmeVar = (dzme) obj;
        dzmb.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a.a = c();
        return this.a;
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    public final /* bridge */ /* synthetic */ Object previous() {
        this.a.a = d();
        return this.a;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        dzme dzmeVar = (dzme) obj;
        dzmb.f();
    }
}
