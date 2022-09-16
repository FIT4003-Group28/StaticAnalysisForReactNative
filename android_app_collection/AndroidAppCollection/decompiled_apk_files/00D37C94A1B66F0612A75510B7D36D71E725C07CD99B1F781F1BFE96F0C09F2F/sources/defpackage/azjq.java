package defpackage;
/* compiled from: PG */
/* renamed from: azjq  reason: default package */
/* loaded from: classes2.dex */
public final class azjq extends azdm {
    final ayok b;
    final int c;

    public azjq(ayok ayokVar, ayok ayokVar2, int i) {
        super(ayokVar);
        this.b = ayokVar2;
        this.c = i;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        azjp azjpVar = new azjp(ayomVar, this.c);
        ayomVar.sj(azjpVar);
        this.b.az(azjpVar.d);
        this.a.az(azjpVar);
    }
}
