package defpackage;
/* compiled from: PG */
/* renamed from: azee  reason: default package */
/* loaded from: classes2.dex */
public final class azee extends azdm {
    final ayqe b;
    final int c;

    public azee(ayok ayokVar, ayqe ayqeVar, int i) {
        super(ayokVar);
        this.b = ayqeVar;
        this.c = Math.max(8, i);
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        if (ayme.c(this.a, ayomVar, this.b)) {
            return;
        }
        this.a.az(new azed(ayomVar, this.c));
    }
}
