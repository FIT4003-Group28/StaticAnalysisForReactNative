package defpackage;
/* compiled from: PG */
/* renamed from: azjt  reason: default package */
/* loaded from: classes2.dex */
public final class azjt extends azdm {
    final aypx b;
    final ayok c;

    public azjt(ayok ayokVar, aypx aypxVar, ayok ayokVar2) {
        super(ayokVar);
        this.b = aypxVar;
        this.c = ayokVar2;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        azox azoxVar = new azox(ayomVar);
        azjr azjrVar = new azjr(azoxVar, this.b);
        azoxVar.sj(azjrVar);
        this.c.az(new azjs(azjrVar));
        this.a.az(azjrVar);
    }
}
