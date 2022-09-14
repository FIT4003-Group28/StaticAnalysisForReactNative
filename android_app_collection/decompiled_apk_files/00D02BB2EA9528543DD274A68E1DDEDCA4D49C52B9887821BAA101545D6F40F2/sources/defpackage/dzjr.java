package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzjr  reason: default package */
/* loaded from: classes6.dex */
public final class dzjr extends dzjq implements dzrn {
    final /* synthetic */ dzjs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzjr(dzjs dzjsVar) {
        super(dzjsVar);
        this.a = dzjsVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b[b()];
    }
}
