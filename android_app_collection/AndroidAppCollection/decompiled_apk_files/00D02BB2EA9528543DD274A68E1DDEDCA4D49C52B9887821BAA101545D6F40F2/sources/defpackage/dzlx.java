package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzlx  reason: default package */
/* loaded from: classes6.dex */
public final class dzlx extends dzmb implements dzne {
    final /* synthetic */ dzmd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzlx(dzmd dzmdVar) {
        super(dzmdVar);
        this.a = dzmdVar;
    }

    @Override // defpackage.dzmx
    public final long a() {
        return this.a.a[d()];
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(Long l) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzna
    public final long b() {
        return this.a.a[c()];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(this.a.a[c()]);
    }

    @Override // java.util.ListIterator, defpackage.dzgt
    @Deprecated
    public final /* bridge */ /* synthetic */ Object previous() {
        return Long.valueOf(this.a.a[d()]);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final /* bridge */ /* synthetic */ void set(Long l) {
        throw new UnsupportedOperationException();
    }
}
