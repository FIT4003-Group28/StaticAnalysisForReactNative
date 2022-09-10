package defpackage;
/* compiled from: PG */
/* renamed from: yga  reason: default package */
/* loaded from: classes7.dex */
final class yga implements Runnable {
    final /* synthetic */ ygh a;

    public yga(ygh yghVar) {
        this.a = yghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ygh yghVar = this.a;
        if (!yghVar.j || yghVar.A() == null) {
            return;
        }
        this.a.H();
        this.a.I();
    }
}
