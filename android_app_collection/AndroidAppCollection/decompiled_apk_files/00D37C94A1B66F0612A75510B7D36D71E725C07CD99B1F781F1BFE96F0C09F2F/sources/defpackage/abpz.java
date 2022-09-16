package defpackage;
/* compiled from: PG */
/* renamed from: abpz  reason: default package */
/* loaded from: classes.dex */
final class abpz implements Runnable {
    final /* synthetic */ abqb a;

    public abpz(abqb abqbVar) {
        this.a = abqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abqb abqbVar = this.a;
        abqa abqaVar = abqbVar.a;
        if (abqaVar != null) {
            abqaVar.b(abqbVar);
        }
    }
}
