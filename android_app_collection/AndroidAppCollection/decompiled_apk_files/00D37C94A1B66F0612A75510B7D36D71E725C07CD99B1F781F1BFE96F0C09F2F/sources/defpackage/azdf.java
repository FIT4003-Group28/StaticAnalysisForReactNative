package defpackage;
/* compiled from: PG */
/* renamed from: azdf  reason: default package */
/* loaded from: classes2.dex */
public final class azdf extends ayoi {
    final ayof a;
    final ayqe b;

    public azdf(ayof ayofVar, ayqe ayqeVar) {
        this.a = ayofVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azde azdeVar = new azde(ayomVar, this.b);
        ayomVar.sj(azdeVar);
        this.a.X(azdeVar);
    }
}
