package defpackage;
/* compiled from: PG */
/* renamed from: azda  reason: default package */
/* loaded from: classes2.dex */
public final class azda extends ayoi {
    final aynu a;
    final ayok b;

    public azda(aynu aynuVar, ayok ayokVar) {
        this.a = aynuVar;
        this.b = ayokVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azcz azczVar = new azcz(ayomVar, this.b);
        ayomVar.sj(azczVar);
        this.a.U(azczVar);
    }
}
