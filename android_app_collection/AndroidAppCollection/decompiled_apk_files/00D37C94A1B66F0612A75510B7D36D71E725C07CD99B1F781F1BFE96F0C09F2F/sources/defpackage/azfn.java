package defpackage;
/* compiled from: PG */
/* renamed from: azfn  reason: default package */
/* loaded from: classes2.dex */
public final class azfn extends azdm {
    final ayqe b;
    final int c;
    final int d;

    public azfn(ayok ayokVar, ayqe ayqeVar, int i, int i2) {
        super(ayokVar);
        this.b = ayqeVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        if (ayme.c(this.a, ayomVar, this.b)) {
            return;
        }
        this.a.az(new azfm(ayomVar, this.b, this.c, this.d));
    }
}
