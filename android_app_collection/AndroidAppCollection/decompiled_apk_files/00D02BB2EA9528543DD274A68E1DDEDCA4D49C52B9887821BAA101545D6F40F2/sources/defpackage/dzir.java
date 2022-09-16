package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzir  reason: default package */
/* loaded from: classes6.dex */
public final class dzir extends dziq implements dzkd {
    final /* synthetic */ dzis a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzir(dzis dzisVar) {
        super(dzisVar);
        this.a = dzisVar;
    }

    @Override // defpackage.dzkd
    public final int a() {
        return this.a.c[b()];
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(this.a.c[b()]);
    }
}
