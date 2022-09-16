package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzmo  reason: default package */
/* loaded from: classes.dex */
public final class dzmo extends dzmn implements dzrn {
    final /* synthetic */ dzmp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzmo(dzmp dzmpVar) {
        super(dzmpVar);
        this.a = dzmpVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b[a()];
    }
}
