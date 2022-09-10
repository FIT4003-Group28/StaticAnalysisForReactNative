package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzon  reason: default package */
/* loaded from: classes6.dex */
public final class dzon extends dzor implements dzrn {
    final /* synthetic */ dzot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzon(dzot dzotVar) {
        super(dzotVar);
        this.a = dzotVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a[a()];
    }
}
