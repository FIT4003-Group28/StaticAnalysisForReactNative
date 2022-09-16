package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzmj  reason: default package */
/* loaded from: classes6.dex */
public final class dzmj extends dzmn implements dzna {
    final /* synthetic */ dzmp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzmj(dzmp dzmpVar) {
        super(dzmpVar);
        this.a = dzmpVar;
    }

    @Override // defpackage.dzna
    public final long b() {
        return this.a.a[a()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(this.a.a[a()]);
    }
}
