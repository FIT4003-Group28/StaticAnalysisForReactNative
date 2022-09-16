package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzqy  reason: default package */
/* loaded from: classes6.dex */
public final class dzqy extends dzqx implements dzrn {
    final /* synthetic */ dzqz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqy(dzqz dzqzVar) {
        super(dzqzVar);
        this.a = dzqzVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.c[a()];
    }
}
