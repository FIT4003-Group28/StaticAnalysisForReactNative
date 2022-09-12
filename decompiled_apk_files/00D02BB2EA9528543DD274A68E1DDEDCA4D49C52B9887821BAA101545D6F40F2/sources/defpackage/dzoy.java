package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzoy  reason: default package */
/* loaded from: classes6.dex */
public final class dzoy extends dzpc implements dzrn {
    final /* synthetic */ dzpe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzoy(dzpe dzpeVar) {
        super(dzpeVar);
        this.a = dzpeVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a[a()];
    }
}
