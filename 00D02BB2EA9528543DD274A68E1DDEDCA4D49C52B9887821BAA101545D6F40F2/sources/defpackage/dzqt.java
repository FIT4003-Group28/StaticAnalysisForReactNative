package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzqt  reason: default package */
/* loaded from: classes6.dex */
public final class dzqt extends dzqx implements dzrn {
    final /* synthetic */ dzqz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzqt(dzqz dzqzVar) {
        super(dzqzVar);
        this.a = dzqzVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b[a()];
    }
}
