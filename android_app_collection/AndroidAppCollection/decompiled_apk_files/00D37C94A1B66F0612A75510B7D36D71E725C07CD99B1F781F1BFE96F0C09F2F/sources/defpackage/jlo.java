package defpackage;
/* compiled from: PG */
/* renamed from: jlo  reason: default package */
/* loaded from: classes3.dex */
public final class jlo implements Runnable {
    private final azqb a;
    private final azqb b;

    public jlo(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((aguv) this.a.get()).c(((agrf) this.b.get()).d());
    }
}
