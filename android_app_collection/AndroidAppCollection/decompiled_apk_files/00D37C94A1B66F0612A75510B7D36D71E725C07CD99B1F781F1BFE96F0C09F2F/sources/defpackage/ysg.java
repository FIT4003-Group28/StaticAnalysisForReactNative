package defpackage;
/* compiled from: PG */
/* renamed from: ysg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ysg implements Runnable {
    public final /* synthetic */ azqb a;
    private final /* synthetic */ int b;

    public /* synthetic */ ysg(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.get();
        } else {
            this.a.get();
        }
    }
}
