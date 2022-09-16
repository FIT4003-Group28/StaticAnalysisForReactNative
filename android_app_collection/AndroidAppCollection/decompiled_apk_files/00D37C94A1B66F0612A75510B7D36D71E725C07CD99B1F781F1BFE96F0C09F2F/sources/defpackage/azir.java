package defpackage;
/* compiled from: PG */
/* renamed from: azir  reason: default package */
/* loaded from: classes2.dex */
public final class azir extends azdm {
    final ayqe b;
    final int c;

    public azir(ayok ayokVar, ayqe ayqeVar, int i) {
        super(ayokVar);
        this.b = ayqeVar;
        this.c = i;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        if (ayme.c(this.a, ayomVar, this.b)) {
            return;
        }
        this.a.az(new aziq(ayomVar, this.b, this.c));
    }
}
