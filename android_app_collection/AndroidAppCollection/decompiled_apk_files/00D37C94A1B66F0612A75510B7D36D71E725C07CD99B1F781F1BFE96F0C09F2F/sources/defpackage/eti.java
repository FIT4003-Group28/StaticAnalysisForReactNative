package defpackage;
/* compiled from: PG */
/* renamed from: eti  reason: default package */
/* loaded from: classes3.dex */
public final class eti implements Runnable {
    private final azqb a;

    public eti(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((afuy) this.a.get()).a();
    }
}
