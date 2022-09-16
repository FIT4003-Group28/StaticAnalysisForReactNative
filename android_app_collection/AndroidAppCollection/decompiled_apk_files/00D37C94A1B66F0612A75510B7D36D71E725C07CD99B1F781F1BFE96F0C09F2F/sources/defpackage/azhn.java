package defpackage;
/* compiled from: PG */
/* renamed from: azhn  reason: default package */
/* loaded from: classes2.dex */
public final class azhn extends azdm {
    final ayqe b;

    public azhn(ayok ayokVar, ayqe ayqeVar) {
        super(ayokVar);
        this.b = ayqeVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ayok, java.lang.Object] */
    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azpq e = azpq.e();
        try {
            ?? a = this.b.a(e);
            azhm azhmVar = new azhm(ayomVar);
            a.az(azhmVar);
            this.a.az(new azhl(e, azhmVar));
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.h(th, ayomVar);
        }
    }
}
